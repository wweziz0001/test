package V3;

/* JADX INFO: renamed from: V3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0133j extends S implements InterfaceC0132i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Z f2423p;

    public C0133j(Z z4) {
        this.f2423p = z4;
    }

    @Override // M3.l
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        o((Throwable) obj);
        return B3.g.f275a;
    }

    @Override // V3.InterfaceC0132i
    public final boolean f(Throwable th) {
        return n().x(th);
    }

    @Override // V3.U
    public final void o(Throwable th) {
        this.f2423p.t(n());
    }
}
