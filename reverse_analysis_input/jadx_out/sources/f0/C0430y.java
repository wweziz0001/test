package f0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import d0.AbstractC0370w;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: renamed from: f0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0430y extends AbstractC0408c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Context f5727p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0417l f5728q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AssetFileDescriptor f5729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FileInputStream f5730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f5731t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5732u;

    public C0430y(Context context) {
        super(false);
        this.f5727p = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // f0.InterfaceC0413h
    public final void close() {
        this.f5728q = null;
        try {
            try {
                FileInputStream fileInputStream = this.f5730s;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f5730s = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f5729r;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e5) {
                        throw new C0429x(null, e5, 2000);
                    }
                } finally {
                    this.f5729r = null;
                    if (this.f5732u) {
                        this.f5732u = false;
                        c();
                    }
                }
            } catch (IOException e6) {
                throw new C0429x(null, e6, 2000);
            }
        } catch (Throwable th) {
            this.f5730s = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f5729r;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f5729r = null;
                    if (this.f5732u) {
                        this.f5732u = false;
                        c();
                    }
                    throw th;
                } catch (IOException e7) {
                    throw new C0429x(null, e7, 2000);
                }
            } finally {
                this.f5729r = null;
                if (this.f5732u) {
                    this.f5732u = false;
                    c();
                }
            }
        }
    }

    @Override // f0.InterfaceC0413h
    public final long p(C0417l c0417l) throws C0429x {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.f5728q = c0417l;
        d();
        Uri uriNormalizeScheme = c0417l.f5686a.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f5727p;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new C0429x("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new C0429x("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new C0429x("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e5) {
                    throw new C0429x("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e5, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new C0429x("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + path, "raw", null);
                if (identifier == 0) {
                    throw new C0429x("Resource not found.", null, 2005);
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new C0429x("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.f5729r = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f5729r.getFileDescriptor());
            this.f5730s = fileInputStream;
            long j5 = c0417l.f5690e;
            try {
                if (length != -1 && j5 > length) {
                    throw new C0429x(null, null, 2008);
                }
                long startOffset = this.f5729r.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j5) - startOffset;
                if (jSkip != j5) {
                    throw new C0429x(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f5731t = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f5731t = size;
                        if (size < 0) {
                            throw new C0429x(null, null, 2008);
                        }
                    }
                } else {
                    long j6 = length - jSkip;
                    this.f5731t = j6;
                    if (j6 < 0) {
                        throw new C0414i(2008);
                    }
                }
                long j7 = c0417l.f5691f;
                if (j7 != -1) {
                    long j8 = this.f5731t;
                    this.f5731t = j8 == -1 ? j7 : Math.min(j8, j7);
                }
                this.f5732u = true;
                i(c0417l);
                return j7 != -1 ? j7 : this.f5731t;
            } catch (C0429x e6) {
                throw e6;
            } catch (IOException e7) {
                throw new C0429x(null, e7, 2000);
            }
        } catch (Resources.NotFoundException e8) {
            throw new C0429x(null, e8, 2005);
        }
    }

    @Override // f0.InterfaceC0413h
    public final Uri r() {
        C0417l c0417l = this.f5728q;
        if (c0417l != null) {
            return c0417l.f5686a;
        }
        return null;
    }

    @Override // a0.InterfaceC0182h
    public final int read(byte[] bArr, int i, int i5) throws C0429x {
        if (i5 == 0) {
            return 0;
        }
        long j5 = this.f5731t;
        if (j5 == 0) {
            return -1;
        }
        if (j5 != -1) {
            try {
                i5 = (int) Math.min(j5, i5);
            } catch (IOException e5) {
                throw new C0429x(null, e5, 2000);
            }
        }
        FileInputStream fileInputStream = this.f5730s;
        int i6 = AbstractC0370w.f5326a;
        int i7 = fileInputStream.read(bArr, i, i5);
        if (i7 == -1) {
            if (this.f5731t == -1) {
                return -1;
            }
            throw new C0429x("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j6 = this.f5731t;
        if (j6 != -1) {
            this.f5731t = j6 - ((long) i7);
        }
        a(i7);
        return i7;
    }
}
