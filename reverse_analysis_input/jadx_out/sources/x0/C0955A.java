package x0;

import d0.AbstractC0370w;
import h0.t0;

/* JADX INFO: renamed from: x0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0955A implements F, InterfaceC0959E {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final H f10513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f10514m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final B0.f f10515n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public J f10516o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public F f10517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InterfaceC0959E f10518q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f10519r = -9223372036854775807L;

    public C0955A(H h2, B0.f fVar, long j5) {
        this.f10513l = h2;
        this.f10515n = fVar;
        this.f10514m = j5;
    }

    @Override // x0.InterfaceC0959E
    public final void a(F f2) {
        InterfaceC0959E interfaceC0959E = this.f10518q;
        int i = AbstractC0370w.f5326a;
        interfaceC0959E.a(this);
    }

    @Override // x0.F
    public final long b(long j5, t0 t0Var) {
        F f2 = this.f10517p;
        int i = AbstractC0370w.f5326a;
        return f2.b(j5, t0Var);
    }

    @Override // x0.h0
    public final boolean c() {
        F f2 = this.f10517p;
        return f2 != null && f2.c();
    }

    @Override // x0.g0
    public final void d(h0 h0Var) {
        InterfaceC0959E interfaceC0959E = this.f10518q;
        int i = AbstractC0370w.f5326a;
        interfaceC0959E.d(this);
    }

    @Override // x0.F
    public final q0 e() {
        F f2 = this.f10517p;
        int i = AbstractC0370w.f5326a;
        return f2.e();
    }

    @Override // x0.F
    public final long f(A0.w[] wVarArr, boolean[] zArr, f0[] f0VarArr, boolean[] zArr2, long j5) {
        long j6 = this.f10519r;
        long j7 = (j6 == -9223372036854775807L || j5 != this.f10514m) ? j5 : j6;
        this.f10519r = -9223372036854775807L;
        F f2 = this.f10517p;
        int i = AbstractC0370w.f5326a;
        return f2.f(wVarArr, zArr, f0VarArr, zArr2, j7);
    }

    public final void g(H h2) {
        long j5 = this.f10519r;
        if (j5 == -9223372036854775807L) {
            j5 = this.f10514m;
        }
        J j6 = this.f10516o;
        j6.getClass();
        F fC = j6.c(h2, this.f10515n, j5);
        this.f10517p = fC;
        if (this.f10518q != null) {
            fC.t(this, j5);
        }
    }

    @Override // x0.h0
    public final long h() {
        F f2 = this.f10517p;
        int i = AbstractC0370w.f5326a;
        return f2.h();
    }

    @Override // x0.F
    public final void l() {
        F f2 = this.f10517p;
        if (f2 != null) {
            f2.l();
            return;
        }
        J j5 = this.f10516o;
        if (j5 != null) {
            j5.e();
        }
    }

    @Override // x0.F
    public final long o(long j5) {
        F f2 = this.f10517p;
        int i = AbstractC0370w.f5326a;
        return f2.o(j5);
    }

    @Override // x0.F
    public final void p(long j5) {
        F f2 = this.f10517p;
        int i = AbstractC0370w.f5326a;
        f2.p(j5);
    }

    @Override // x0.h0
    public final long r() {
        F f2 = this.f10517p;
        int i = AbstractC0370w.f5326a;
        return f2.r();
    }

    @Override // x0.F
    public final long s() {
        F f2 = this.f10517p;
        int i = AbstractC0370w.f5326a;
        return f2.s();
    }

    @Override // x0.F
    public final void t(InterfaceC0959E interfaceC0959E, long j5) {
        this.f10518q = interfaceC0959E;
        F f2 = this.f10517p;
        if (f2 != null) {
            long j6 = this.f10519r;
            if (j6 == -9223372036854775807L) {
                j6 = this.f10514m;
            }
            f2.t(this, j6);
        }
    }

    @Override // x0.h0
    public final void u(long j5) {
        F f2 = this.f10517p;
        int i = AbstractC0370w.f5326a;
        f2.u(j5);
    }

    @Override // x0.h0
    public final boolean v(h0.T t4) {
        F f2 = this.f10517p;
        return f2 != null && f2.v(t4);
    }
}
