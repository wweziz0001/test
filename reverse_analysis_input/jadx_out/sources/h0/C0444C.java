package h0;

import a0.C0189o;
import a0.C0190p;
import a0.InterfaceC0162M;
import d0.InterfaceC0356i;
import i0.C0477a;

/* JADX INFO: renamed from: h0.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0444C implements InterfaceC0356i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5907l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0.e0 f5908m;

    public /* synthetic */ C0444C(a0.e0 e0Var) {
        this.f5908m = e0Var;
    }

    @Override // d0.InterfaceC0356i
    public final void c(Object obj) {
        switch (this.f5907l) {
            case 0:
                ((InterfaceC0162M) obj).onVideoSizeChanged(this.f5908m);
                break;
            default:
                i0.h hVar = (i0.h) obj;
                D0.d dVar = hVar.f6400o;
                a0.e0 e0Var = this.f5908m;
                if (dVar != null) {
                    C0190p c0190p = (C0190p) dVar.f395m;
                    if (c0190p.f3432v == -1) {
                        C0189o c0189oA = c0190p.a();
                        c0189oA.f3394t = e0Var.f3334a;
                        c0189oA.f3395u = e0Var.f3335b;
                        hVar.f6400o = new D0.d(new C0190p(c0189oA), dVar.f394l, (String) dVar.f396n);
                    }
                }
                int i = e0Var.f3334a;
                break;
        }
    }

    public /* synthetic */ C0444C(C0477a c0477a, a0.e0 e0Var) {
        this.f5908m = e0Var;
    }
}
