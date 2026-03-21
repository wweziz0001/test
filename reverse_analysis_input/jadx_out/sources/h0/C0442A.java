package h0;

import a0.C0161L;
import a0.C0188n;
import a0.InterfaceC0162M;
import d0.InterfaceC0356i;
import d0.InterfaceC0357j;

/* JADX INFO: renamed from: h0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0442A implements InterfaceC0357j, InterfaceC0356i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0448G f5903l;

    public /* synthetic */ C0442A(C0448G c0448g) {
        this.f5903l = c0448g;
    }

    @Override // d0.InterfaceC0357j
    public void b(Object obj, C0188n c0188n) {
        C0448G c0448g = this.f5903l;
        c0448g.getClass();
        ((InterfaceC0162M) obj).onEvents(c0448g.f5948f, new C0161L(c0188n));
    }

    @Override // d0.InterfaceC0356i
    public void c(Object obj) {
        ((InterfaceC0162M) obj).onAvailableCommandsChanged(this.f5903l.f5924K);
    }
}
