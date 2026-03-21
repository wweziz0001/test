package Q1;

import V3.InterfaceC0143u;
import androidx.work.CoroutineWorker;

/* JADX INFO: renamed from: Q1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0123f extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f1821q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0123f(CoroutineWorker coroutineWorker, E3.d dVar) {
        super(2, dVar);
        this.f1821q = coroutineWorker;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        return new C0123f(this.f1821q, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((C0123f) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f1820p;
        CoroutineWorker coroutineWorker = this.f1821q;
        try {
            if (i == 0) {
                i4.a.Y(obj);
                this.f1820p = 1;
                obj = coroutineWorker.f();
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4.a.Y(obj);
            }
            coroutineWorker.f4774q.j((o) obj);
        } catch (Throwable th) {
            coroutineWorker.f4774q.k(th);
        }
        return B3.g.f275a;
    }
}
