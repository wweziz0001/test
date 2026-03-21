package L;

/* JADX INFO: loaded from: classes.dex */
public final class D extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Throwable f1280p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1281q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f1282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P f1283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1284t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(P p4, int i, E3.d dVar) {
        super(2, dVar);
        this.f1283s = p4;
        this.f1284t = i;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        D d5 = new D(this.f1283s, this.f1284t, dVar);
        d5.f1282r = ((Boolean) obj).booleanValue();
        return d5;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((D) a((E3.d) obj2, bool)).l(B3.g.f275a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    @Override // G3.b
    public final Object l(Object obj) {
        Throwable th;
        int iIntValue;
        ?? r02;
        ?? r03;
        a0 a0Var;
        ?? r12;
        F3.a aVar = F3.a.f861l;
        ?? r13 = this.f1281q;
        P p4 = this.f1283s;
        try {
        } catch (Throwable th2) {
            if (r13 == 0) {
                ?? r5 = r13;
                th = th2;
                iIntValue = this.f1284t;
                r02 = r5 == true ? 1 : 0;
                T t4 = new T(iIntValue, th);
                r12 = r02;
                a0Var = t4;
                return new B3.b(a0Var, Boolean.valueOf((boolean) r12));
            }
            Z zG = p4.g();
            this.f1280p = th2;
            this.f1282r = r13;
            this.f1281q = 2;
            Integer numA = zG.a();
            if (numA == aVar) {
                return aVar;
            }
            r03 = r13;
            th = th2;
            obj = numA;
        }
        if (r13 == 0) {
            i4.a.Y(obj);
            boolean z4 = this.f1282r;
            this.f1282r = z4;
            this.f1281q = 1;
            obj = P.f(p4, z4, this);
            r13 = z4;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (r13 != 1) {
                if (r13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z5 = this.f1282r;
                th = this.f1280p;
                i4.a.Y(obj);
                r03 = z5;
                iIntValue = ((Number) obj).intValue();
                r02 = r03;
                T t42 = new T(iIntValue, th);
                r12 = r02;
                a0Var = t42;
                return new B3.b(a0Var, Boolean.valueOf((boolean) r12));
            }
            boolean z6 = this.f1282r;
            i4.a.Y(obj);
            r13 = z6;
        }
        a0Var = (a0) obj;
        r12 = r13;
        return new B3.b(a0Var, Boolean.valueOf((boolean) r12));
    }
}
