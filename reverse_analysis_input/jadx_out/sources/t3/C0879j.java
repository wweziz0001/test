package t3;

/* JADX INFO: renamed from: t3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0879j extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f10075p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P.d f10076q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f10077r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0879j(P.d dVar, String str, E3.d dVar2) {
        super(2, dVar2);
        this.f10076q = dVar;
        this.f10077r = str;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        C0879j c0879j = new C0879j(this.f10076q, this.f10077r, dVar);
        c0879j.f10075p = obj;
        return c0879j;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        C0879j c0879j = (C0879j) a((E3.d) obj2, (P.b) obj);
        B3.g gVar = B3.g.f275a;
        c0879j.l(gVar);
        return gVar;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        i4.a.Y(obj);
        ((P.b) this.f10075p).d(this.f10076q, this.f10077r);
        return B3.g.f275a;
    }
}
