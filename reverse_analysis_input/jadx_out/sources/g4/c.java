package g4;

import a.AbstractC0149a;
import java.io.Closeable;
import java.io.Flushable;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f5835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5836m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5837n;

    public c(h hVar, long j5) {
        N3.h.e(hVar, "fileHandle");
        this.f5835l = hVar;
        this.f5836m = j5;
    }

    public final void a(a aVar, long j5) {
        if (this.f5837n) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.f5835l;
        long j6 = this.f5836m;
        hVar.getClass();
        AbstractC0149a.f(aVar.f5830m, 0L, j5);
        long j7 = j6 + j5;
        while (j6 < j7) {
            q qVar = aVar.f5829l;
            N3.h.b(qVar);
            int iMin = (int) Math.min(j7 - j6, qVar.f5868c - qVar.f5867b);
            byte[] bArr = qVar.f5866a;
            int i = qVar.f5867b;
            synchronized (hVar) {
                N3.h.e(bArr, "array");
                hVar.f5854p.seek(j6);
                hVar.f5854p.write(bArr, i, iMin);
            }
            int i5 = qVar.f5867b + iMin;
            qVar.f5867b = i5;
            long j8 = iMin;
            j6 += j8;
            aVar.f5830m -= j8;
            if (i5 == qVar.f5868c) {
                aVar.f5829l = qVar.a();
                r.a(qVar);
            }
        }
        this.f5836m += j5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5837n) {
            return;
        }
        this.f5837n = true;
        h hVar = this.f5835l;
        ReentrantLock reentrantLock = hVar.f5853o;
        reentrantLock.lock();
        try {
            int i = hVar.f5852n - 1;
            hVar.f5852n = i;
            if (i == 0) {
                if (hVar.f5851m) {
                    synchronized (hVar) {
                        hVar.f5854p.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f5837n) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.f5835l;
        synchronized (hVar) {
            hVar.f5854p.getFD().sync();
        }
    }
}
