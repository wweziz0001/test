package W1;

import B3.g;
import K1.j;
import M3.p;
import Q1.q;
import X3.r;

/* JADX INFO: loaded from: classes.dex */
public final class c extends G3.f implements p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2463p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f2464q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f2465r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, E3.d dVar2) {
        super(2, dVar2);
        this.f2465r = dVar;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        c cVar = new c(this.f2465r, dVar);
        cVar.f2464q = obj;
        return cVar;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((c) a((E3.d) obj2, (r) obj)).l(g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f2463p;
        if (i == 0) {
            i4.a.Y(obj);
            r rVar = (r) this.f2464q;
            d dVar = this.f2465r;
            b bVar = new b(dVar, rVar);
            X1.f fVar = dVar.f2466a;
            fVar.getClass();
            synchronized (fVar.f2616c) {
                try {
                    if (fVar.f2617d.add(bVar)) {
                        if (fVar.f2617d.size() == 1) {
                            fVar.f2618e = fVar.a();
                            q.d().a(X1.g.f2619a, fVar.getClass().getSimpleName() + ": initial state = " + fVar.f2618e);
                            fVar.c();
                        }
                        bVar.a(fVar.f2618e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            j jVar = new j(this.f2465r, 2, bVar);
            this.f2463p = 1;
            if (Z1.f.e(rVar, jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4.a.Y(obj);
        }
        return g.f275a;
    }
}
