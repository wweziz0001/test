package V1;

import L.C0111t;
import M3.p;
import V3.InterfaceC0143u;
import Y3.t;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j extends G3.f implements p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2364p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ h f2365q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Z1.p f2366r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f2367s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, Z1.p pVar, e eVar, E3.d dVar) {
        super(2, dVar);
        this.f2365q = hVar;
        this.f2366r = pVar;
        this.f2367s = eVar;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        return new j(this.f2365q, this.f2366r, this.f2367s, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((j) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f2364p;
        if (i == 0) {
            i4.a.Y(obj);
            h hVar = this.f2365q;
            hVar.getClass();
            Z1.p pVar = this.f2366r;
            ArrayList<W1.d> arrayList = new ArrayList();
            for (Object obj2 : hVar.f2360l) {
                if (((W1.d) obj2).b(pVar)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C3.h.R(arrayList));
            for (W1.d dVar : arrayList) {
                dVar.getClass();
                arrayList2.add(new Y3.c(new W1.c(dVar, null), E3.j.f675l, -2, 1));
            }
            C0111t c0111t = new C0111t((Y3.g[]) C3.f.X(arrayList2).toArray(new Y3.g[0]), 1);
            boolean z4 = c0111t instanceof t;
            Y3.g fVar = c0111t;
            if (!z4) {
                fVar = new Y3.f(c0111t);
            }
            i iVar = new i(this.f2367s, 0, pVar);
            this.f2364p = 1;
            if (fVar.b(iVar, this) == aVar) {
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
