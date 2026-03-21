package L;

/* JADX INFO: renamed from: L.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0108p extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ a0 f1422q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0108p(a0 a0Var, E3.d dVar) {
        super(2, dVar);
        this.f1422q = a0Var;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        C0108p c0108p = new C0108p(this.f1422q, dVar);
        c0108p.f1421p = obj;
        return c0108p;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((C0108p) a((E3.d) obj2, (a0) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        i4.a.Y(obj);
        a0 a0Var = (a0) this.f1421p;
        return Boolean.valueOf((a0Var instanceof C0095c) && a0Var.f1370a <= this.f1422q.f1370a);
    }
}
