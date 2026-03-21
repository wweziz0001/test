package h0;

import a0.AbstractC0169U;
import android.os.Looper;
import android.os.SystemClock;
import d0.AbstractC0360m;
import d0.C0365r;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f6218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f6219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0365r f6220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Looper f6223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6225h;
    public boolean i;

    public l0(j0 j0Var, o0 o0Var, AbstractC0169U abstractC0169U, int i, C0365r c0365r, Looper looper) {
        this.f6219b = j0Var;
        this.f6218a = o0Var;
        this.f6223f = looper;
        this.f6220c = c0365r;
    }

    public final synchronized void a(long j5) {
        boolean z4;
        AbstractC0360m.h(this.f6224g);
        AbstractC0360m.h(this.f6223f.getThread() != Thread.currentThread());
        this.f6220c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j5;
        while (true) {
            z4 = this.i;
            if (z4 || j5 <= 0) {
                break;
            }
            this.f6220c.getClass();
            wait(j5);
            this.f6220c.getClass();
            j5 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z4) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    public final synchronized void b(boolean z4) {
        this.f6225h = z4 | this.f6225h;
        this.i = true;
        notifyAll();
    }

    public final void c() {
        AbstractC0360m.h(!this.f6224g);
        this.f6224g = true;
        N n4 = (N) this.f6219b;
        synchronized (n4) {
            if (!n4.f6004N && n4.f6034v.getThread().isAlive()) {
                n4.f6032t.a(14, this).b();
                return;
            }
            AbstractC0360m.y("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            b(false);
        }
    }
}
