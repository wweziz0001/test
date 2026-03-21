package L;

/* JADX INFO: loaded from: classes.dex */
public final class M extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1317p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1318q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P f1319r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(P p4, E3.d dVar) {
        super(2, dVar);
        this.f1319r = p4;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        M m4 = new M(this.f1319r, dVar);
        m4.f1318q = obj;
        return m4;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((M) a((E3.d) obj2, (S) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f1317p;
        if (i == 0) {
            i4.a.Y(obj);
            S s4 = (S) this.f1318q;
            this.f1317p = 1;
            if (P.c(this.f1319r, s4, this) == aVar) {
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
