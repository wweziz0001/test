package P;

import M3.p;

/* JADX INFO: loaded from: classes.dex */
public final class c extends G3.f implements p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1667p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1668q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ G3.f f1669r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, E3.d dVar) {
        super(2, dVar);
        this.f1669r = (G3.f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [G3.f, M3.p] */
    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        c cVar = new c(this.f1669r, dVar);
        cVar.f1668q = obj;
        return cVar;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((c) a((E3.d) obj2, (b) obj)).l(B3.g.f275a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [G3.f, M3.p] */
    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f1667p;
        if (i == 0) {
            i4.a.Y(obj);
            b bVar = (b) this.f1668q;
            this.f1667p = 1;
            obj = this.f1669r.i(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4.a.Y(obj);
        }
        b bVar2 = (b) obj;
        N3.h.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        bVar2.f1666b.f1516a.set(true);
        return bVar2;
    }
}
