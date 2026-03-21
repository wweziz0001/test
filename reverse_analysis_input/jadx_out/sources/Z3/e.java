package Z3;

/* JADX INFO: loaded from: classes.dex */
public final class e extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3103p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f3104q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f3105r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, E3.d dVar) {
        super(2, dVar);
        this.f3105r = fVar;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        e eVar = new e(this.f3105r, dVar);
        eVar.f3104q = obj;
        return eVar;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((e) a((E3.d) obj2, (X3.r) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f3103p;
        if (i == 0) {
            i4.a.Y(obj);
            X3.r rVar = (X3.r) this.f3104q;
            this.f3103p = 1;
            if (this.f3105r.c(rVar, this) == aVar) {
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
