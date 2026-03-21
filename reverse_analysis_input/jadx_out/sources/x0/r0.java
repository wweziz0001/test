package x0;

import a0.AbstractC0169U;
import a0.C0150A;
import d0.AbstractC0370w;
import f0.InterfaceC0403A;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 extends AbstractC0970k {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final J f10782v;

    public r0(J j5) {
        this.f10782v = j5;
    }

    public abstract void C(AbstractC0169U abstractC0169U);

    public void D() {
        A(null, this.f10782v);
    }

    @Override // x0.J
    public final C0150A a() {
        return this.f10782v.a();
    }

    @Override // x0.J
    public void b(C0150A c0150a) {
        this.f10782v.b(c0150a);
    }

    @Override // x0.J
    public final boolean f() {
        return this.f10782v.f();
    }

    @Override // x0.J
    public final AbstractC0169U g() {
        return this.f10782v.g();
    }

    @Override // x0.AbstractC0960a
    public final void p(InterfaceC0403A interfaceC0403A) {
        this.f10728u = interfaceC0403A;
        this.f10727t = AbstractC0370w.m(null);
        D();
    }

    @Override // x0.AbstractC0970k
    public final H w(Object obj, H h2) {
        return B(h2);
    }

    @Override // x0.AbstractC0970k
    public final long x(long j5, Object obj) {
        return j5;
    }

    @Override // x0.AbstractC0970k
    public final int y(int i, Object obj) {
        return i;
    }

    @Override // x0.AbstractC0970k
    public final void z(Object obj, AbstractC0960a abstractC0960a, AbstractC0169U abstractC0169U) {
        C(abstractC0169U);
    }

    public H B(H h2) {
        return h2;
    }
}
