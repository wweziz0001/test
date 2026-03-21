package f0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import d0.AbstractC0370w;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: f0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0410e extends AbstractC0408c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ContentResolver f5662p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Uri f5663q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AssetFileDescriptor f5664r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FileInputStream f5665s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f5666t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5667u;

    public C0410e(Context context) {
        super(false);
        this.f5662p = context.getContentResolver();
    }

    @Override // f0.InterfaceC0413h
    public final void close() {
        this.f5663q = null;
        try {
            try {
                FileInputStream fileInputStream = this.f5665s;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f5665s = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f5664r;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e5) {
                        throw new C0409d(e5, 2000);
                    }
                } finally {
                    this.f5664r = null;
                    if (this.f5667u) {
                        this.f5667u = false;
                        c();
                    }
                }
            } catch (IOException e6) {
                throw new C0409d(e6, 2000);
            }
        } catch (Throwable th) {
            this.f5665s = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f5664r;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f5664r = null;
                    if (this.f5667u) {
                        this.f5667u = false;
                        c();
                    }
                    throw th;
                } catch (IOException e7) {
                    throw new C0409d(e7, 2000);
                }
            } finally {
                this.f5664r = null;
                if (this.f5667u) {
                    this.f5667u = false;
                    c();
                }
            }
        }
    }

    @Override // f0.InterfaceC0413h
    public final long p(C0417l c0417l) throws C0409d {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = c0417l.f5686a.normalizeScheme();
            this.f5663q = uriNormalizeScheme;
            d();
            boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
            ContentResolver contentResolver = this.f5662p;
            if (zEquals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f5664r = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new C0409d(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f5665s = fileInputStream;
            long j5 = c0417l.f5690e;
            if (length != -1 && j5 > length) {
                throw new C0409d(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(startOffset + j5) - startOffset;
            if (jSkip != j5) {
                throw new C0409d(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f5666t = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f5666t = jPosition;
                    if (jPosition < 0) {
                        throw new C0409d(null, 2008);
                    }
                }
            } else {
                long j6 = length - jSkip;
                this.f5666t = j6;
                if (j6 < 0) {
                    throw new C0409d(null, 2008);
                }
            }
            long j7 = c0417l.f5691f;
            if (j7 != -1) {
                long j8 = this.f5666t;
                this.f5666t = j8 == -1 ? j7 : Math.min(j8, j7);
            }
            this.f5667u = true;
            i(c0417l);
            return j7 != -1 ? j7 : this.f5666t;
        } catch (C0409d e5) {
            throw e5;
        } catch (IOException e6) {
            throw new C0409d(e6, e6 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // f0.InterfaceC0413h
    public final Uri r() {
        return this.f5663q;
    }

    @Override // a0.InterfaceC0182h
    public final int read(byte[] bArr, int i, int i5) throws C0409d {
        if (i5 == 0) {
            return 0;
        }
        long j5 = this.f5666t;
        if (j5 == 0) {
            return -1;
        }
        if (j5 != -1) {
            try {
                i5 = (int) Math.min(j5, i5);
            } catch (IOException e5) {
                throw new C0409d(e5, 2000);
            }
        }
        FileInputStream fileInputStream = this.f5665s;
        int i6 = AbstractC0370w.f5326a;
        int i7 = fileInputStream.read(bArr, i, i5);
        if (i7 == -1) {
            return -1;
        }
        long j6 = this.f5666t;
        if (j6 != -1) {
            this.f5666t = j6 - ((long) i7);
        }
        a(i7);
        return i7;
    }
}
