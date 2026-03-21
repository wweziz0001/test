package L;

/* JADX INFO: renamed from: L.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0109q extends G3.f implements M3.q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f1423p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1424q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1425r;

    public /* synthetic */ C0109q(int i, E3.d dVar) {
        super(i, dVar);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        switch (this.f1423p) {
            case 0:
                F3.a aVar = F3.a.f861l;
                int i = this.f1424q;
                if (i == 0) {
                    i4.a.Y(obj);
                    this.f1424q = 1;
                    if (P.a((P) this.f1425r, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4.a.Y(obj);
                }
                return B3.g.f275a;
            default:
                F3.a aVar2 = F3.a.f861l;
                int i5 = this.f1424q;
                if (i5 == 0) {
                    i4.a.Y(obj);
                    N.c cVar = (N.c) this.f1425r;
                    this.f1424q = 1;
                    cVar.getClass();
                    obj = N.c.a(cVar, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4.a.Y(obj);
                }
                return obj;
        }
    }

    public final Object n(Object obj, Object obj2, G3.b bVar) {
        switch (this.f1423p) {
            case 0:
                return new C0109q((P) this.f1425r, bVar).l(B3.g.f275a);
            default:
                ((Boolean) obj2).getClass();
                C0109q c0109q = new C0109q(3, bVar);
                c0109q.f1425r = (N.c) obj;
                return c0109q.l(B3.g.f275a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0109q(P p4, E3.d dVar) {
        super(3, dVar);
        this.f1425r = p4;
    }
}
