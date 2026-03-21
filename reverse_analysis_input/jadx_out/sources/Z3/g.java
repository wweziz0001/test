package Z3;

/* JADX INFO: loaded from: classes.dex */
public final class g extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f3110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f3111r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, E3.d dVar) {
        super(2, dVar);
        this.f3111r = hVar;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        g gVar = new g(this.f3111r, dVar);
        gVar.f3110q = obj;
        return gVar;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((g) a((E3.d) obj2, (Y3.h) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f3109p;
        B3.g gVar = B3.g.f275a;
        if (i == 0) {
            i4.a.Y(obj);
            Y3.h hVar = (Y3.h) this.f3110q;
            this.f3109p = 1;
            Object objB = this.f3111r.f3112o.b(hVar, this);
            if (objB != aVar) {
                objB = gVar;
            }
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4.a.Y(obj);
        }
        return gVar;
    }
}
