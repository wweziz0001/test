package V3;

/* JADX INFO: loaded from: classes.dex */
public final class W extends U {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Z f2394p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final X f2395q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0133j f2396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f2397s;

    public W(Z z4, X x4, C0133j c0133j, Object obj) {
        this.f2394p = z4;
        this.f2395q = x4;
        this.f2396r = c0133j;
        this.f2397s = obj;
    }

    @Override // M3.l
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        o((Throwable) obj);
        return B3.g.f275a;
    }

    @Override // V3.U
    public final void o(Throwable th) {
        C0133j c0133j = this.f2396r;
        Z z4 = this.f2394p;
        z4.getClass();
        C0133j c0133jN = Z.N(c0133j);
        X x4 = this.f2395q;
        Object obj = this.f2397s;
        if (c0133jN != null) {
            while (AbstractC0144v.h(c0133jN.f2423p, false, new W(z4, x4, c0133jN, obj), 1) == b0.f2410l) {
                c0133jN = Z.N(c0133jN);
                if (c0133jN == null) {
                }
            }
            return;
        }
        z4.r(z4.A(x4, obj));
    }
}
