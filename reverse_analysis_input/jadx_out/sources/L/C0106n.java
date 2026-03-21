package L;

/* JADX INFO: renamed from: L.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0106n extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P f1419q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0106n(P p4, E3.d dVar) {
        super(2, dVar);
        this.f1419q = p4;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        return new C0106n(this.f1419q, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((C0106n) a((E3.d) obj2, (Y3.h) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f1418p;
        if (i == 0) {
            i4.a.Y(obj);
            this.f1418p = 1;
            if (P.d(this.f1419q, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4.a.Y(obj);
        }
        return B3.g.f275a;
    }
}
