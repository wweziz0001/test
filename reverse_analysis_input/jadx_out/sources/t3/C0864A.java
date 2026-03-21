package t3;

/* JADX INFO: renamed from: t3.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0864A extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f10011p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P.d f10012q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f10013r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0864A(P.d dVar, boolean z4, E3.d dVar2) {
        super(2, dVar2);
        this.f10012q = dVar;
        this.f10013r = z4;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        C0864A c0864a = new C0864A(this.f10012q, this.f10013r, dVar);
        c0864a.f10011p = obj;
        return c0864a;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        C0864A c0864a = (C0864A) a((E3.d) obj2, (P.b) obj);
        B3.g gVar = B3.g.f275a;
        c0864a.l(gVar);
        return gVar;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        i4.a.Y(obj);
        ((P.b) this.f10011p).d(this.f10012q, Boolean.valueOf(this.f10013r));
        return B3.g.f275a;
    }
}
