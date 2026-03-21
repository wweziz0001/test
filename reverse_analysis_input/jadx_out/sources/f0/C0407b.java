package f0;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import d0.AbstractC0370w;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: f0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0407b extends AbstractC0408c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AssetManager f5653p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Uri f5654q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InputStream f5655r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f5656s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5657t;

    public C0407b(Context context) {
        super(false);
        this.f5653p = context.getAssets();
    }

    @Override // f0.InterfaceC0413h
    public final void close() {
        this.f5654q = null;
        try {
            try {
                InputStream inputStream = this.f5655r;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e5) {
                throw new C0406a(e5, 2000);
            }
        } finally {
            this.f5655r = null;
            if (this.f5657t) {
                this.f5657t = false;
                c();
            }
        }
    }

    @Override // f0.InterfaceC0413h
    public final long p(C0417l c0417l) throws C0406a {
        try {
            Uri uri = c0417l.f5686a;
            long j5 = c0417l.f5690e;
            this.f5654q = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            d();
            InputStream inputStreamOpen = this.f5653p.open(path, 1);
            this.f5655r = inputStreamOpen;
            if (inputStreamOpen.skip(j5) < j5) {
                throw new C0406a(null, 2008);
            }
            long j6 = c0417l.f5691f;
            if (j6 != -1) {
                this.f5656s = j6;
            } else {
                long jAvailable = this.f5655r.available();
                this.f5656s = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f5656s = -1L;
                }
            }
            this.f5657t = true;
            i(c0417l);
            return this.f5656s;
        } catch (C0406a e5) {
            throw e5;
        } catch (IOException e6) {
            throw new C0406a(e6, e6 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // f0.InterfaceC0413h
    public final Uri r() {
        return this.f5654q;
    }

    @Override // a0.InterfaceC0182h
    public final int read(byte[] bArr, int i, int i5) throws C0406a {
        if (i5 == 0) {
            return 0;
        }
        long j5 = this.f5656s;
        if (j5 == 0) {
            return -1;
        }
        if (j5 != -1) {
            try {
                i5 = (int) Math.min(j5, i5);
            } catch (IOException e5) {
                throw new C0406a(e5, 2000);
            }
        }
        InputStream inputStream = this.f5655r;
        int i6 = AbstractC0370w.f5326a;
        int i7 = inputStream.read(bArr, i, i5);
        if (i7 == -1) {
            return -1;
        }
        long j6 = this.f5656s;
        if (j6 != -1) {
            this.f5656s = j6 - ((long) i7);
        }
        a(i7);
        return i7;
    }
}
