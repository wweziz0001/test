package A0;

import a0.C0170V;
import a0.InterfaceC0162M;
import d0.InterfaceC0356i;
import m2.C0639F;
import m2.I;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements r, InterfaceC0356i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f70l;

    public /* synthetic */ e(m mVar) {
        this.f70l = mVar;
    }

    @Override // A0.r
    public b0 a(int i, C0170V c0170v, int[] iArr) {
        C0639F c0639fN = I.n();
        for (int i5 = 0; i5 < c0170v.f3261a; i5++) {
            int i6 = i5;
            c0639fN.a(new j(i, c0170v, i6, this.f70l, iArr[i5]));
        }
        return c0639fN.g();
    }

    @Override // d0.InterfaceC0356i
    public void c(Object obj) {
        ((InterfaceC0162M) obj).onTrackSelectionParametersChanged(this.f70l);
    }
}
