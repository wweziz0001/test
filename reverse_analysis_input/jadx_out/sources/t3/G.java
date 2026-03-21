package t3;

/* JADX INFO: loaded from: classes.dex */
public final class G extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f10033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P.d f10034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f10035r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(P.d dVar, long j5, E3.d dVar2) {
        super(2, dVar2);
        this.f10034q = dVar;
        this.f10035r = j5;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        G g5 = new G(this.f10034q, this.f10035r, dVar);
        g5.f10033p = obj;
        return g5;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        G g5 = (G) a((E3.d) obj2, (P.b) obj);
        B3.g gVar = B3.g.f275a;
        g5.l(gVar);
        return gVar;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        i4.a.Y(obj);
        ((P.b) this.f10033p).d(this.f10034q, new Long(this.f10035r));
        return B3.g.f275a;
    }
}
