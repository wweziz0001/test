package y0;

import d0.AbstractC0360m;
import x0.e0;
import x0.f0;

/* JADX INFO: renamed from: y0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0999g implements f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1000h f10863l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e0 f10864m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10865n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10866o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1000h f10867p;

    public C0999g(C1000h c1000h, C1000h c1000h2, e0 e0Var, int i) {
        this.f10867p = c1000h;
        this.f10863l = c1000h2;
        this.f10864m = e0Var;
        this.f10865n = i;
    }

    public final void b() {
        if (this.f10866o) {
            return;
        }
        C1000h c1000h = this.f10867p;
        m0.e eVar = c1000h.f10884r;
        int[] iArr = c1000h.f10879m;
        int i = this.f10865n;
        eVar.b(iArr[i], c1000h.f10880n[i], 0, null, c1000h.f10872E);
        this.f10866o = true;
    }

    public final void c() {
        C1000h c1000h = this.f10867p;
        boolean[] zArr = c1000h.f10881o;
        int i = this.f10865n;
        AbstractC0360m.h(zArr[i]);
        c1000h.f10881o[i] = false;
    }

    @Override // x0.f0
    public final int d(long j5) {
        C1000h c1000h = this.f10867p;
        if (c1000h.x()) {
            return 0;
        }
        boolean z4 = c1000h.f10877J;
        e0 e0Var = this.f10864m;
        int iP = e0Var.p(j5, z4);
        AbstractC0993a abstractC0993a = c1000h.f10874G;
        if (abstractC0993a != null) {
            iP = Math.min(iP, abstractC0993a.c(this.f10865n + 1) - e0Var.n());
        }
        e0Var.C(iP);
        if (iP > 0) {
            b();
        }
        return iP;
    }

    @Override // x0.f0
    public final boolean isReady() {
        C1000h c1000h = this.f10867p;
        return !c1000h.x() && this.f10864m.s(c1000h.f10877J);
    }

    @Override // x0.f0
    public final int k(Z1.e eVar, g0.e eVar2, int i) {
        C1000h c1000h = this.f10867p;
        if (c1000h.x()) {
            return -3;
        }
        AbstractC0993a abstractC0993a = c1000h.f10874G;
        e0 e0Var = this.f10864m;
        if (abstractC0993a != null && abstractC0993a.c(this.f10865n + 1) <= e0Var.n()) {
            return -3;
        }
        b();
        return e0Var.x(eVar, eVar2, i, c1000h.f10877J);
    }

    @Override // x0.f0
    public final void a() {
    }
}
