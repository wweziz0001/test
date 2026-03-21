package g4;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class d implements t {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f5838l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5839m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5840n;

    public d(h hVar, long j5) {
        N3.h.e(hVar, "fileHandle");
        this.f5838l = hVar;
        this.f5839m = j5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5840n) {
            return;
        }
        this.f5840n = true;
        h hVar = this.f5838l;
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

    @Override // g4.t
    public final long d(a aVar, long j5) {
        long j6;
        long j7;
        int i;
        int i5;
        if (this.f5840n) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.f5838l;
        long j8 = this.f5839m;
        hVar.getClass();
        if (j5 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
        }
        long j9 = j5 + j8;
        long j10 = j8;
        while (true) {
            if (j10 >= j9) {
                break;
            }
            q qVarQ = aVar.q(1);
            byte[] bArr = qVarQ.f5866a;
            int i6 = qVarQ.f5868c;
            int iMin = (int) Math.min(j9 - j10, 8192 - i6);
            synchronized (hVar) {
                N3.h.e(bArr, "array");
                hVar.f5854p.seek(j10);
                i = 0;
                while (true) {
                    if (i >= iMin) {
                        break;
                    }
                    int i7 = hVar.f5854p.read(bArr, i6, iMin - i);
                    if (i7 != -1) {
                        i += i7;
                    } else if (i == 0) {
                        i5 = -1;
                        i = -1;
                    }
                }
                i5 = -1;
            }
            if (i == i5) {
                if (qVarQ.f5867b == qVarQ.f5868c) {
                    aVar.f5829l = qVarQ.a();
                    r.a(qVarQ);
                }
                if (j8 == j10) {
                    j7 = -1;
                    j6 = -1;
                }
            } else {
                qVarQ.f5868c += i;
                long j11 = i;
                j10 += j11;
                aVar.f5830m += j11;
            }
        }
        j6 = j10 - j8;
        j7 = -1;
        if (j6 != j7) {
            this.f5839m += j6;
        }
        return j6;
    }
}
