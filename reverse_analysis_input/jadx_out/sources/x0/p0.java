package x0;

import h0.t0;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements F, InterfaceC0959E {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final F f10766l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f10767m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InterfaceC0959E f10768n;

    public p0(F f2, long j5) {
        this.f10766l = f2;
        this.f10767m = j5;
    }

    @Override // x0.InterfaceC0959E
    public final void a(F f2) {
        InterfaceC0959E interfaceC0959E = this.f10768n;
        interfaceC0959E.getClass();
        interfaceC0959E.a(this);
    }

    @Override // x0.F
    public final long b(long j5, t0 t0Var) {
        long j6 = this.f10767m;
        return this.f10766l.b(j5 - j6, t0Var) + j6;
    }

    @Override // x0.h0
    public final boolean c() {
        return this.f10766l.c();
    }

    @Override // x0.g0
    public final void d(h0 h0Var) {
        InterfaceC0959E interfaceC0959E = this.f10768n;
        interfaceC0959E.getClass();
        interfaceC0959E.d(this);
    }

    @Override // x0.F
    public final q0 e() {
        return this.f10766l.e();
    }

    @Override // x0.F
    public final long f(A0.w[] wVarArr, boolean[] zArr, f0[] f0VarArr, boolean[] zArr2, long j5) {
        f0[] f0VarArr2 = new f0[f0VarArr.length];
        int i = 0;
        while (true) {
            f0 f0Var = null;
            if (i >= f0VarArr.length) {
                break;
            }
            o0 o0Var = (o0) f0VarArr[i];
            if (o0Var != null) {
                f0Var = o0Var.f10762l;
            }
            f0VarArr2[i] = f0Var;
            i++;
        }
        long j6 = this.f10767m;
        long jF = this.f10766l.f(wVarArr, zArr, f0VarArr2, zArr2, j5 - j6);
        for (int i5 = 0; i5 < f0VarArr.length; i5++) {
            f0 f0Var2 = f0VarArr2[i5];
            if (f0Var2 == null) {
                f0VarArr[i5] = null;
            } else {
                f0 f0Var3 = f0VarArr[i5];
                if (f0Var3 == null || ((o0) f0Var3).f10762l != f0Var2) {
                    f0VarArr[i5] = new o0(f0Var2, j6);
                }
            }
        }
        return jF + j6;
    }

    @Override // x0.h0
    public final long h() {
        long jH = this.f10766l.h();
        if (jH == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f10767m + jH;
    }

    @Override // x0.F
    public final void l() {
        this.f10766l.l();
    }

    @Override // x0.F
    public final long o(long j5) {
        long j6 = this.f10767m;
        return this.f10766l.o(j5 - j6) + j6;
    }

    @Override // x0.F
    public final void p(long j5) {
        this.f10766l.p(j5 - this.f10767m);
    }

    @Override // x0.h0
    public final long r() {
        long jR = this.f10766l.r();
        if (jR == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f10767m + jR;
    }

    @Override // x0.F
    public final long s() {
        long jS = this.f10766l.s();
        if (jS == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f10767m + jS;
    }

    @Override // x0.F
    public final void t(InterfaceC0959E interfaceC0959E, long j5) {
        this.f10768n = interfaceC0959E;
        this.f10766l.t(this, j5 - this.f10767m);
    }

    @Override // x0.h0
    public final void u(long j5) {
        this.f10766l.u(j5 - this.f10767m);
    }

    @Override // x0.h0
    public final boolean v(h0.T t4) {
        h0.S s4 = new h0.S();
        s4.f6042b = t4.f6045b;
        s4.f6043c = t4.f6046c;
        s4.f6041a = t4.f6044a - this.f10767m;
        return this.f10766l.v(new h0.T(s4));
    }
}
