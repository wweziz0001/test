package L;

/* JADX INFO: loaded from: classes.dex */
public final class O extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public N3.n f1324p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1325q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1326r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ N3.n f1327s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ P f1328t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1329u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f1330v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(N3.n nVar, P p4, Object obj, boolean z4, E3.d dVar) {
        super(2, dVar);
        this.f1327s = nVar;
        this.f1328t = p4;
        this.f1329u = obj;
        this.f1330v = z4;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        O o4 = new O(this.f1327s, this.f1328t, this.f1329u, this.f1330v, dVar);
        o4.f1326r = obj;
        return o4;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((O) a((E3.d) obj2, (N.k) obj)).l(B3.g.f275a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    @Override // G3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r9) {
        /*
            r8 = this;
            F3.a r0 = F3.a.f861l
            int r1 = r8.f1325q
            N3.n r2 = r8.f1327s
            java.lang.Object r3 = r8.f1329u
            L.P r4 = r8.f1328t
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            i4.a.Y(r9)
            goto L65
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            N3.n r1 = r8.f1324p
            java.lang.Object r6 = r8.f1326r
            N.k r6 = (N.k) r6
            i4.a.Y(r9)
            goto L4f
        L28:
            i4.a.Y(r9)
            java.lang.Object r9 = r8.f1326r
            N.k r9 = (N.k) r9
            L.Z r1 = r4.g()
            r8.f1326r = r9
            r8.f1324p = r2
            r8.f1325q = r6
            B0.d r1 = r1.f1368b
            java.lang.Object r1 = r1.f190l
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.incrementAndGet()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r1)
            if (r6 != r0) goto L4b
            return r0
        L4b:
            r1 = r2
            r7 = r6
            r6 = r9
            r9 = r7
        L4f:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r1.f1624l = r9
            r9 = 0
            r8.f1326r = r9
            r8.f1324p = r9
            r8.f1325q = r5
            java.lang.Object r9 = r6.b(r3, r8)
            if (r9 != r0) goto L65
            return r0
        L65:
            boolean r9 = r8.f1330v
            if (r9 == 0) goto L7d
            B0.d r9 = r4.f1338s
            L.c r0 = new L.c
            if (r3 == 0) goto L74
            int r1 = r3.hashCode()
            goto L75
        L74:
            r1 = 0
        L75:
            int r2 = r2.f1624l
            r0.<init>(r1, r2, r3)
            r9.u(r0)
        L7d:
            B3.g r9 = B3.g.f275a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L.O.l(java.lang.Object):java.lang.Object");
    }
}
