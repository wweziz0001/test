package B0;

import android.os.Looper;
import android.os.SystemClock;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.io.IOException;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class r implements s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final k f239o = new k(0, -9223372036854775807L, false);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final k f240p = new k(2, -9223372036854775807L, false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final k f241q = new k(3, -9223372036854775807L, false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0.a f242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n f243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IOException f244n;

    /* JADX WARN: Illegal instructions before constructor call */
    public r(String str) {
        String strJ = AbstractC0307a.j("ExoPlayer:Loader:", str);
        int i = AbstractC0370w.f5326a;
        this(new C0.a(Executors.newSingleThreadExecutor(new Q.a(strJ, 1)), new l(0)));
    }

    @Override // B0.s
    public final void a() throws IOException {
        IOException iOException;
        IOException iOException2 = this.f244n;
        if (iOException2 != null) {
            throw iOException2;
        }
        n nVar = this.f243m;
        if (nVar != null && (iOException = nVar.f233p) != null && nVar.f234q > nVar.f229l) {
            throw iOException;
        }
    }

    public final void b() {
        n nVar = this.f243m;
        AbstractC0360m.i(nVar);
        nVar.a(false);
    }

    public final boolean c() {
        return this.f244n != null;
    }

    public final boolean d() {
        return this.f243m != null;
    }

    public final void e(p pVar) {
        n nVar = this.f243m;
        if (nVar != null) {
            nVar.a(true);
        }
        C0.a aVar = this.f242l;
        if (pVar != null) {
            aVar.execute(new A.b(pVar, 1));
        }
        l lVar = aVar.f279m;
        aVar.f278l.shutdown();
    }

    public final long f(o oVar, m mVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        AbstractC0360m.i(looperMyLooper);
        this.f244n = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        n nVar = new n(this, looperMyLooper, oVar, mVar, i, jElapsedRealtime);
        AbstractC0360m.h(this.f243m == null);
        this.f243m = nVar;
        SystemClock.elapsedRealtime();
        nVar.f232o.getClass();
        nVar.f233p = null;
        n nVar2 = this.f243m;
        nVar2.getClass();
        this.f242l.execute(nVar2);
        return jElapsedRealtime;
    }

    public r(C0.a aVar) {
        this.f242l = aVar;
    }
}
