package Z3;

/* JADX INFO: loaded from: classes.dex */
public final class y extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3149p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f3150q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y3.h f3151r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Y3.h hVar, E3.d dVar) {
        super(2, dVar);
        this.f3151r = hVar;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        y yVar = new y(this.f3151r, dVar);
        yVar.f3150q = obj;
        return yVar;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((y) a((E3.d) obj2, obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f3149p;
        if (i == 0) {
            i4.a.Y(obj);
            Object obj2 = this.f3150q;
            this.f3149p = 1;
            if (this.f3151r.k(obj2, this) == aVar) {
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
