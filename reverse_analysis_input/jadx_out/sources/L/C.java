package L;

/* JADX INFO: loaded from: classes.dex */
public final class C extends G3.f implements M3.l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Throwable f1277p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1278q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P f1279r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(P p4, E3.d dVar) {
        super(1, dVar);
        this.f1279r = p4;
    }

    @Override // M3.l
    public final Object c(Object obj) {
        return new C(this.f1279r, (E3.d) obj).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        Throwable th;
        a0 t4;
        F3.a aVar = F3.a.f861l;
        int i = this.f1278q;
        P p4 = this.f1279r;
        try {
        } catch (Throwable th2) {
            Z zG = p4.g();
            this.f1277p = th2;
            this.f1278q = 2;
            Integer numA = zG.a();
            if (numA == aVar) {
                return aVar;
            }
            th = th2;
            obj = numA;
        }
        if (i == 0) {
            i4.a.Y(obj);
            this.f1278q = 1;
            obj = P.f(p4, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f1277p;
                i4.a.Y(obj);
                t4 = new T(((Number) obj).intValue(), th);
                return new B3.b(t4, Boolean.TRUE);
            }
            i4.a.Y(obj);
        }
        t4 = (a0) obj;
        return new B3.b(t4, Boolean.TRUE);
    }
}
