package t3;

/* JADX INFO: renamed from: t3.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0867D extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f10022p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P.d f10023q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ double f10024r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0867D(P.d dVar, double d5, E3.d dVar2) {
        super(2, dVar2);
        this.f10023q = dVar;
        this.f10024r = d5;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        C0867D c0867d = new C0867D(this.f10023q, this.f10024r, dVar);
        c0867d.f10022p = obj;
        return c0867d;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        C0867D c0867d = (C0867D) a((E3.d) obj2, (P.b) obj);
        B3.g gVar = B3.g.f275a;
        c0867d.l(gVar);
        return gVar;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        i4.a.Y(obj);
        ((P.b) this.f10022p).d(this.f10023q, new Double(this.f10024r));
        return B3.g.f275a;
    }
}
