package L;

import V3.InterfaceC0143u;

/* JADX INFO: loaded from: classes.dex */
public final class I extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1307p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ G3.f f1308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0095c f1309r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(M3.p pVar, C0095c c0095c, E3.d dVar) {
        super(2, dVar);
        this.f1308q = (G3.f) pVar;
        this.f1309r = c0095c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [G3.f, M3.p] */
    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        return new I(this.f1308q, this.f1309r, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((I) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [G3.f, M3.p] */
    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f1307p;
        if (i == 0) {
            i4.a.Y(obj);
            Object obj2 = this.f1309r.f1372b;
            this.f1307p = 1;
            obj = this.f1308q.i(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4.a.Y(obj);
        }
        return obj;
    }
}
