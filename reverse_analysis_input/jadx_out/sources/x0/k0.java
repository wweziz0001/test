package x0;

import a0.C0170V;
import d0.AbstractC0370w;
import h0.t0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements F {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final q0 f10729n = new q0(new C0170V("", m0.f10739u));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f10730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f10731m = new ArrayList();

    public k0(long j5) {
        this.f10730l = j5;
    }

    @Override // x0.F
    public final long b(long j5, t0 t0Var) {
        return AbstractC0370w.j(j5, 0L, this.f10730l);
    }

    @Override // x0.h0
    public final boolean c() {
        return false;
    }

    @Override // x0.F
    public final q0 e() {
        return f10729n;
    }

    @Override // x0.F
    public final long f(A0.w[] wVarArr, boolean[] zArr, f0[] f0VarArr, boolean[] zArr2, long j5) {
        long j6 = AbstractC0370w.j(j5, 0L, this.f10730l);
        for (int i = 0; i < wVarArr.length; i++) {
            f0 f0Var = f0VarArr[i];
            ArrayList arrayList = this.f10731m;
            if (f0Var != null && (wVarArr[i] == null || !zArr[i])) {
                arrayList.remove(f0Var);
                f0VarArr[i] = null;
            }
            if (f0VarArr[i] == null && wVarArr[i] != null) {
                l0 l0Var = new l0(this.f10730l);
                l0Var.b(j6);
                arrayList.add(l0Var);
                f0VarArr[i] = l0Var;
                zArr2[i] = true;
            }
        }
        return j6;
    }

    @Override // x0.h0
    public final long h() {
        return Long.MIN_VALUE;
    }

    @Override // x0.F
    public final long o(long j5) {
        long j6 = AbstractC0370w.j(j5, 0L, this.f10730l);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10731m;
            if (i >= arrayList.size()) {
                return j6;
            }
            ((l0) arrayList.get(i)).b(j6);
            i++;
        }
    }

    @Override // x0.h0
    public final long r() {
        return Long.MIN_VALUE;
    }

    @Override // x0.F
    public final long s() {
        return -9223372036854775807L;
    }

    @Override // x0.F
    public final void t(InterfaceC0959E interfaceC0959E, long j5) {
        interfaceC0959E.a(this);
    }

    @Override // x0.h0
    public final boolean v(h0.T t4) {
        return false;
    }

    @Override // x0.F
    public final void l() {
    }

    @Override // x0.F
    public final void p(long j5) {
    }

    @Override // x0.h0
    public final void u(long j5) {
    }
}
