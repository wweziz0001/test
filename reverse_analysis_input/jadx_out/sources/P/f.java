package P;

import M3.p;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f extends G3.f implements p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ G3.f f1673r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(p pVar, E3.d dVar) {
        super(2, dVar);
        this.f1673r = (G3.f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [G3.f, M3.p] */
    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        f fVar = new f(this.f1673r, dVar);
        fVar.f1672q = obj;
        return fVar;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((f) a((E3.d) obj2, (b) obj)).l(B3.g.f275a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [G3.f, M3.p] */
    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f1671p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f1672q;
            i4.a.Y(obj);
            return bVar;
        }
        i4.a.Y(obj);
        b bVar2 = new b(new LinkedHashMap(((b) this.f1672q).a()), false);
        this.f1672q = bVar2;
        this.f1671p = 1;
        return this.f1673r.i(bVar2, this) == aVar ? aVar : bVar2;
    }
}
