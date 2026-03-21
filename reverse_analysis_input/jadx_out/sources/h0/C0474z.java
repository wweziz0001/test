package h0;

import a0.C0163N;
import a0.InterfaceC0162M;
import d0.InterfaceC0356i;
import i0.C0477a;

/* JADX INFO: renamed from: h0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0474z implements InterfaceC0356i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6296l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f6297m;

    public /* synthetic */ C0474z(int i) {
        this.f6297m = i;
    }

    @Override // d0.InterfaceC0356i
    public final void c(Object obj) {
        switch (this.f6296l) {
            case 0:
                ((InterfaceC0162M) obj).onRepeatModeChanged(this.f6297m);
                break;
            default:
                i0.h hVar = (i0.h) obj;
                hVar.getClass();
                int i = this.f6297m;
                if (i == 1) {
                    hVar.f6406u = true;
                }
                hVar.f6396k = i;
                break;
        }
    }

    public /* synthetic */ C0474z(C0477a c0477a, int i, C0163N c0163n, C0163N c0163n2) {
        this.f6297m = i;
    }
}
