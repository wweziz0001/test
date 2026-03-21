package B0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import d0.AbstractC0360m;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class n extends Handler implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f229l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o f230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f231n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f232o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public IOException f233p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f234q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Thread f235r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f236s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile boolean f237t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f238u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, Looper looper, o oVar, m mVar, int i, long j5) {
        super(looper);
        this.f238u = rVar;
        this.f230m = oVar;
        this.f232o = mVar;
        this.f229l = i;
        this.f231n = j5;
    }

    public final void a(boolean z4) {
        this.f237t = z4;
        this.f233p = null;
        if (hasMessages(1)) {
            this.f236s = true;
            removeMessages(1);
            if (!z4) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f236s = true;
                    this.f230m.g();
                    Thread thread = this.f235r;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z4) {
            this.f238u.f243m = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            m mVar = this.f232o;
            mVar.getClass();
            mVar.q(this.f230m, jElapsedRealtime, jElapsedRealtime - this.f231n, true);
            this.f232o = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f237t) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            SystemClock.elapsedRealtime();
            this.f232o.getClass();
            this.f233p = null;
            r rVar = this.f238u;
            C0.a aVar = rVar.f242l;
            n nVar = rVar.f243m;
            nVar.getClass();
            aVar.execute(nVar);
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.f238u.f243m = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = jElapsedRealtime - this.f231n;
        m mVar = this.f232o;
        mVar.getClass();
        if (this.f236s) {
            mVar.q(this.f230m, jElapsedRealtime, j5, false);
            return;
        }
        int i5 = message.what;
        if (i5 == 2) {
            try {
                mVar.i(this.f230m, jElapsedRealtime, j5);
                return;
            } catch (RuntimeException e5) {
                AbstractC0360m.m("LoadTask", "Unexpected exception handling load completed", e5);
                this.f238u.f244n = new q(e5);
                return;
            }
        }
        if (i5 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f233p = iOException;
        int i6 = this.f234q + 1;
        this.f234q = i6;
        k kVarN = mVar.n(this.f230m, jElapsedRealtime, j5, iOException, i6);
        int i7 = kVarN.f226a;
        if (i7 == 3) {
            this.f238u.f244n = this.f233p;
            return;
        }
        if (i7 != 2) {
            if (i7 == 1) {
                this.f234q = 1;
            }
            long jMin = kVarN.f227b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f234q - 1) * 1000, 5000);
            }
            r rVar2 = this.f238u;
            AbstractC0360m.h(rVar2.f243m == null);
            rVar2.f243m = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
                return;
            }
            SystemClock.elapsedRealtime();
            this.f232o.getClass();
            this.f233p = null;
            C0.a aVar2 = rVar2.f242l;
            n nVar2 = rVar2.f243m;
            nVar2.getClass();
            aVar2.execute(nVar2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        try {
            synchronized (this) {
                z4 = this.f236s;
                this.f235r = Thread.currentThread();
            }
            if (!z4) {
                Trace.beginSection("load:".concat(this.f230m.getClass().getSimpleName()));
                try {
                    this.f230m.e();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f235r = null;
                Thread.interrupted();
            }
            if (this.f237t) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e5) {
            if (this.f237t) {
                return;
            }
            obtainMessage(3, e5).sendToTarget();
        } catch (Exception e6) {
            if (this.f237t) {
                return;
            }
            AbstractC0360m.m("LoadTask", "Unexpected exception loading stream", e6);
            obtainMessage(3, new q(e6)).sendToTarget();
        } catch (OutOfMemoryError e7) {
            if (this.f237t) {
                return;
            }
            AbstractC0360m.m("LoadTask", "OutOfMemory error loading stream", e7);
            obtainMessage(3, new q(e7)).sendToTarget();
        } catch (Error e8) {
            if (!this.f237t) {
                AbstractC0360m.m("LoadTask", "Unexpected error loading stream", e8);
                obtainMessage(4, e8).sendToTarget();
            }
            throw e8;
        }
    }
}
