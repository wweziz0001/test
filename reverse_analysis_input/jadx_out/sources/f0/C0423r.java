package f0;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import d0.AbstractC0370w;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: f0.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0423r extends AbstractC0408c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RandomAccessFile f5719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Uri f5720q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f5721r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5722s;

    @Override // f0.InterfaceC0413h
    public final void close() {
        this.f5720q = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f5719p;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e5) {
                throw new C0422q(e5, 2000);
            }
        } finally {
            this.f5719p = null;
            if (this.f5722s) {
                this.f5722s = false;
                c();
            }
        }
    }

    @Override // f0.InterfaceC0413h
    public final long p(C0417l c0417l) throws C0422q {
        Uri uri = c0417l.f5686a;
        long j5 = c0417l.f5690e;
        this.f5720q = uri;
        d();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f5719p = randomAccessFile;
            try {
                randomAccessFile.seek(j5);
                long length = c0417l.f5691f;
                if (length == -1) {
                    length = this.f5719p.length() - j5;
                }
                this.f5721r = length;
                if (length < 0) {
                    throw new C0422q(null, null, 2008);
                }
                this.f5722s = true;
                i(c0417l);
                return this.f5721r;
            } catch (IOException e5) {
                throw new C0422q(e5, 2000);
            }
        } catch (FileNotFoundException e6) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C0422q(e6, ((e6.getCause() instanceof ErrnoException) && ((ErrnoException) e6.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new C0422q("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e6, 1004);
        } catch (SecurityException e7) {
            throw new C0422q(e7, 2006);
        } catch (RuntimeException e8) {
            throw new C0422q(e8, 2000);
        }
    }

    @Override // f0.InterfaceC0413h
    public final Uri r() {
        return this.f5720q;
    }

    @Override // a0.InterfaceC0182h
    public final int read(byte[] bArr, int i, int i5) throws C0422q {
        if (i5 == 0) {
            return 0;
        }
        long j5 = this.f5721r;
        if (j5 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f5719p;
            int i6 = AbstractC0370w.f5326a;
            int i7 = randomAccessFile.read(bArr, i, (int) Math.min(j5, i5));
            if (i7 > 0) {
                this.f5721r -= (long) i7;
                a(i7);
            }
            return i7;
        } catch (IOException e5) {
            throw new C0422q(e5, 2000);
        }
    }
}
