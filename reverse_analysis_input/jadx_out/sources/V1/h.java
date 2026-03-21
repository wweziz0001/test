package V1;

import Q1.q;
import Z1.p;
import d0.AbstractC0360m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h implements c1.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f2360l;

    public h(List list) {
        this.f2360l = list;
    }

    @Override // c1.d
    public int a(long j5) {
        return j5 < 0 ? 0 : -1;
    }

    public boolean b(p pVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f2360l) {
            W1.d dVar = (W1.d) obj;
            dVar.getClass();
            if (dVar.b(pVar) && dVar.c(dVar.f2466a.a())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            q.d().a(k.f2368a, "Work " + pVar.f3046a + " constrained by " + C3.f.V(arrayList, null, null, null, f.f2356m, 31));
        }
        return arrayList.isEmpty();
    }

    @Override // c1.d
    public List d(long j5) {
        return j5 >= 0 ? this.f2360l : Collections.emptyList();
    }

    @Override // c1.d
    public long g(int i) {
        AbstractC0360m.c(i == 0);
        return 0L;
    }

    @Override // c1.d
    public int h() {
        return 1;
    }

    public h(Z1.i iVar) {
        N3.h.e(iVar, "trackers");
        W1.a aVar = new W1.a((X1.f) iVar.f3012l, 0);
        W1.a aVar2 = new W1.a((X1.a) iVar.f3013m);
        W1.a aVar3 = new W1.a((X1.f) iVar.f3015o, 4);
        X1.f fVar = (X1.f) iVar.f3014n;
        this.f2360l = C3.g.Q(aVar, aVar2, aVar3, new W1.a(fVar, 2), new W1.a(fVar, 3), new W1.f(fVar), new W1.e(fVar));
    }
}
