package g4;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5851m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5852n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ReentrantLock f5853o = new ReentrantLock();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RandomAccessFile f5854p;

    public h(boolean z4, RandomAccessFile randomAccessFile) {
        this.f5850l = z4;
        this.f5854p = randomAccessFile;
    }

    public static c b(h hVar) {
        if (!hVar.f5850l) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = hVar.f5853o;
        reentrantLock.lock();
        try {
            if (hVar.f5851m) {
                throw new IllegalStateException("closed");
            }
            hVar.f5852n++;
            reentrantLock.unlock();
            return new c(hVar, 0L);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void a() {
        if (!this.f5850l) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f5853o;
        reentrantLock.lock();
        try {
            if (this.f5851m) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                this.f5854p.getFD().sync();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long c() {
        long length;
        ReentrantLock reentrantLock = this.f5853o;
        reentrantLock.lock();
        try {
            if (this.f5851m) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.f5854p.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f5853o;
        reentrantLock.lock();
        try {
            if (this.f5851m) {
                return;
            }
            this.f5851m = true;
            if (this.f5852n != 0) {
                return;
            }
            synchronized (this) {
                this.f5854p.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final d f(long j5) {
        ReentrantLock reentrantLock = this.f5853o;
        reentrantLock.lock();
        try {
            if (this.f5851m) {
                throw new IllegalStateException("closed");
            }
            this.f5852n++;
            reentrantLock.unlock();
            return new d(this, j5);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
