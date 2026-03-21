package L;

/* JADX INFO: loaded from: classes.dex */
public final class F extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f1294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1295q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f1296r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P f1297s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f1298t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(P p4, int i, E3.d dVar) {
        super(2, dVar);
        this.f1297s = p4;
        this.f1298t = i;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        F f2 = new F(this.f1297s, this.f1298t, dVar);
        f2.f1296r = ((Boolean) obj).booleanValue();
        return f2;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((F) a((E3.d) obj2, bool)).l(B3.g.f275a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    @Override // G3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r7) {
        /*
            r6 = this;
            F3.a r0 = F3.a.f861l
            int r1 = r6.f1295q
            L.P r2 = r6.f1297s
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            java.lang.Object r0 = r6.f1294p
            i4.a.Y(r7)
            goto L45
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            boolean r1 = r6.f1296r
            i4.a.Y(r7)
            goto L32
        L22:
            i4.a.Y(r7)
            boolean r1 = r6.f1296r
            r6.f1296r = r1
            r6.f1295q = r4
            java.lang.Object r7 = r2.i(r6)
            if (r7 != r0) goto L32
            return r0
        L32:
            if (r1 == 0) goto L4c
            L.Z r1 = r2.g()
            r6.f1294p = r7
            r6.f1295q = r3
            java.lang.Integer r1 = r1.a()
            if (r1 != r0) goto L43
            return r0
        L43:
            r0 = r7
            r7 = r1
        L45:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            goto L51
        L4c:
            int r0 = r6.f1298t
            r5 = r0
            r0 = r7
            r7 = r5
        L51:
            L.c r1 = new L.c
            if (r0 == 0) goto L5a
            int r2 = r0.hashCode()
            goto L5b
        L5a:
            r2 = 0
        L5b:
            r1.<init>(r2, r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: L.F.l(java.lang.Object):java.lang.Object");
    }
}
