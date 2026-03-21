package Z3;

import Q1.C;
import V3.AbstractC0144v;
import V3.B;
import V3.InterfaceC0143u;

/* JADX INFO: loaded from: classes.dex */
public final class d extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3099p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f3100q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y3.h f3101r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f3102s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Y3.h hVar, f fVar, E3.d dVar) {
        super(2, dVar);
        this.f3101r = hVar;
        this.f3102s = fVar;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        d dVar2 = new d(this.f3101r, this.f3102s, dVar);
        dVar2.f3100q = obj;
        return dVar2;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((d) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) throws Throwable {
        F3.a aVar = F3.a.f861l;
        int i = this.f3099p;
        B3.g gVar = B3.g.f275a;
        if (i == 0) {
            i4.a.Y(obj);
            InterfaceC0143u interfaceC0143u = (InterfaceC0143u) this.f3100q;
            f fVar = this.f3102s;
            int i5 = fVar.f3107m;
            if (i5 == -3) {
                i5 = -2;
            }
            M3.p eVar = new e(fVar, null);
            X3.d dVarA = C.a(i5, fVar.f3108n, 4);
            E3.i iVarD = AbstractC0144v.d(interfaceC0143u.i(), fVar.f3106l, true);
            c4.d dVar = B.f2372a;
            if (iVarD != dVar && iVarD.l(E3.e.f674l) == null) {
                iVarD = iVarD.o(dVar);
            }
            X3.q qVar = new X3.q(iVarD, dVarA);
            qVar.X(3, qVar, eVar);
            this.f3099p = 1;
            Object objB = Y3.w.b(this.f3101r, qVar, true, this);
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
