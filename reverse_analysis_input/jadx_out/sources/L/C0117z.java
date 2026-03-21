package L;

import V3.C0135l;
import V3.InterfaceC0143u;

/* JADX INFO: renamed from: L.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0117z extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1455p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P f1456q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0117z(P p4, E3.d dVar) {
        super(2, dVar);
        this.f1456q = p4;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        return new C0117z(this.f1456q, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((C0117z) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) throws Throwable {
        F3.a aVar = F3.a.f861l;
        int i = this.f1455p;
        B3.g gVar = B3.g.f275a;
        P p4 = this.f1456q;
        if (i == 0) {
            i4.a.Y(obj);
            this.f1455p = 1;
            Object objV = ((C0135l) p4.f1339t.f3013m).V(this);
            if (objV != aVar) {
                objV = gVar;
            }
            if (objV == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    i4.a.Y(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4.a.Y(obj);
        }
        Y3.g gVar2 = p4.g().f1369c;
        Y3.g gVarA = gVar2 instanceof Z3.o ? Z3.q.a((Z3.o) gVar2, null, 0, 2, 1) : new Z3.h(gVar2, E3.j.f675l, 0, 2);
        I1.a aVar2 = new I1.a(p4, 1);
        this.f1455p = 2;
        return gVarA.b(aVar2, this) == aVar ? aVar : gVar;
    }
}
