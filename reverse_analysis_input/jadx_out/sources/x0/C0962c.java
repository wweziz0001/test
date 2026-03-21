package x0;

import a0.C0189o;
import a0.C0190p;

/* JADX INFO: renamed from: x0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0962c implements f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f0 f10659l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10660m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0963d f10661n;

    public C0962c(C0963d c0963d, f0 f0Var) {
        this.f10661n = c0963d;
        this.f10659l = f0Var;
    }

    @Override // x0.f0
    public final void a() {
        this.f10659l.a();
    }

    @Override // x0.f0
    public final int d(long j5) {
        if (this.f10661n.g()) {
            return -3;
        }
        return this.f10659l.d(j5);
    }

    @Override // x0.f0
    public final boolean isReady() {
        return !this.f10661n.g() && this.f10659l.isReady();
    }

    @Override // x0.f0
    public final int k(Z1.e eVar, g0.e eVar2, int i) {
        C0963d c0963d = this.f10661n;
        if (c0963d.g()) {
            return -3;
        }
        if (this.f10660m) {
            eVar2.f5494m = 4;
            return -4;
        }
        long jH = c0963d.h();
        int iK = this.f10659l.k(eVar, eVar2, i);
        if (iK != -5) {
            long j5 = c0963d.f10669q;
            if (j5 == Long.MIN_VALUE || ((iK != -4 || eVar2.f5789r < j5) && !(iK == -3 && jH == Long.MIN_VALUE && !eVar2.f5788q))) {
                return iK;
            }
            eVar2.f();
            eVar2.f5494m = 4;
            this.f10660m = true;
            return -4;
        }
        C0190p c0190p = (C0190p) eVar.f3002n;
        c0190p.getClass();
        int i5 = c0190p.f3406G;
        int i6 = c0190p.f3405F;
        if (i6 != 0 || i5 != 0) {
            if (c0963d.f10668p != 0) {
                i6 = 0;
            }
            if (c0963d.f10669q != Long.MIN_VALUE) {
                i5 = 0;
            }
            C0189o c0189oA = c0190p.a();
            c0189oA.f3369E = i6;
            c0189oA.f3370F = i5;
            eVar.f3002n = new C0190p(c0189oA);
        }
        return -5;
    }
}
