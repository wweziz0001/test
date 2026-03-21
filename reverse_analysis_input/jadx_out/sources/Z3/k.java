package Z3;

import V3.InterfaceC0143u;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class k extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3118p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y3.g[] f3119q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f3121s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ X3.d f3122t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Y3.g[] gVarArr, int i, AtomicInteger atomicInteger, X3.d dVar, E3.d dVar2) {
        super(2, dVar2);
        this.f3119q = gVarArr;
        this.f3120r = i;
        this.f3121s = atomicInteger;
        this.f3122t = dVar;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        return new k(this.f3119q, this.f3120r, this.f3121s, this.f3122t, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((k) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f3118p;
        AtomicInteger atomicInteger = this.f3121s;
        X3.d dVar = this.f3122t;
        try {
            if (i == 0) {
                i4.a.Y(obj);
                Y3.g[] gVarArr = this.f3119q;
                int i5 = this.f3120r;
                Y3.g gVar = gVarArr[i5];
                j jVar = new j(dVar, i5);
                this.f3118p = 1;
                if (gVar.b(jVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4.a.Y(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                dVar.h(null, false);
            }
            return B3.g.f275a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                dVar.h(null, false);
            }
        }
    }
}
