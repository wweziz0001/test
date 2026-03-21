package Q1;

import V3.InterfaceC0143u;
import androidx.work.CoroutineWorker;

/* JADX INFO: renamed from: Q1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0122e extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k f1816p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1817q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f1818r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f1819s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0122e(k kVar, CoroutineWorker coroutineWorker, E3.d dVar) {
        super(2, dVar);
        this.f1818r = kVar;
        this.f1819s = coroutineWorker;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        return new C0122e(this.f1818r, this.f1819s, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        C0122e c0122e = (C0122e) a((E3.d) obj2, (InterfaceC0143u) obj);
        B3.g gVar = B3.g.f275a;
        c0122e.l(gVar);
        return gVar;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        int i = this.f1817q;
        if (i == 0) {
            i4.a.Y(obj);
            this.f1816p = this.f1818r;
            this.f1817q = 1;
            this.f1819s.getClass();
            throw new IllegalStateException("Not implemented");
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k kVar = this.f1816p;
        i4.a.Y(obj);
        kVar.f1829a.j(obj);
        return B3.g.f275a;
    }
}
