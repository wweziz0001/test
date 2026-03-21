package L;

import V3.AbstractC0144v;
import V3.C0135l;
import V3.C0142t;
import V3.InterfaceC0143u;
import V3.e0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class P implements InterfaceC0100h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final N.f f1331l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final A0.b f1332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC0143u f1333n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e0 f1337r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Z1.i f1339t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final B3.e f1340u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final B3.e f1341v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Z1.i f1342w;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0111t f1334o = new C0111t(new C0112u(this, null));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d4.d f1335p = d4.e.a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final B0.d f1338s = new B0.d(12);

    public P(N.f fVar, List list, A0.b bVar, InterfaceC0143u interfaceC0143u) {
        this.f1331l = fVar;
        this.f1332m = bVar;
        this.f1333n = interfaceC0143u;
        Z1.i iVar = new Z1.i();
        iVar.f3015o = this;
        iVar.f3012l = d4.e.a();
        C0135l c0135l = new C0135l(true);
        c0135l.I(null);
        iVar.f3013m = c0135l;
        iVar.f3014n = C3.f.X(list);
        this.f1339t = iVar;
        this.f1340u = new B3.e(new C0105m(this, 1));
        this.f1341v = new B3.e(new C0105m(this, 0));
        K k4 = new K(this, 0);
        M m4 = new M(this, null);
        Z1.i iVar2 = new Z1.i();
        iVar2.f3012l = interfaceC0143u;
        iVar2.f3013m = m4;
        iVar2.f3014n = Q1.C.a(Integer.MAX_VALUE, 0, 6);
        iVar2.f3015o = new B0.d(11);
        V3.P p4 = (V3.P) interfaceC0143u.i().l(C0142t.f2444m);
        if (p4 != null) {
            ((V3.Z) p4).J(false, true, new d4.b(k4, 2, iVar2));
        }
        this.f1342w = iVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(L.P r4, G3.b r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof L.C0113v
            if (r0 == 0) goto L16
            r0 = r5
            L.v r0 = (L.C0113v) r0
            int r1 = r0.f1441s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f1441s = r1
            goto L1b
        L16:
            L.v r0 = new L.v
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f1439q
            F3.a r1 = F3.a.f861l
            int r2 = r0.f1441s
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            d4.d r4 = r0.f1438p
            L.P r0 = r0.f1437o
            i4.a.Y(r5)
            r5 = r4
            r4 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            i4.a.Y(r5)
            r0.f1437o = r4
            d4.d r5 = r4.f1335p
            r0.f1438p = r5
            r0.f1441s = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L4a
            goto L64
        L4a:
            r0 = 0
            int r1 = r4.f1336q     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 + (-1)
            r4.f1336q = r1     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L5f
            V3.e0 r1 = r4.f1337r     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5a
            r1.b(r0)     // Catch: java.lang.Throwable -> L5d
        L5a:
            r4.f1337r = r0     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r4 = move-exception
            goto L65
        L5f:
            r5.e(r0)
            B3.g r1 = B3.g.f275a
        L64:
            return r1
        L65:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: L.P.a(L.P, G3.b):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(2:4|(1:6)(1:7))(0)|8|(7:73|(1:(1:(1:13)(2:18|19))(3:20|21|22))(1:23)|14|63|(1:65)(1:66)|67|68)(4:24|74|25|(9:27|71|28|(1:76)|31|63|(0)(0)|67|68)(3:38|(1:40)(1:41)|(2:43|(2:45|(2:47|75))(2:54|55))(2:56|(2:58|59)(2:60|61))))|48|69|49|(1:77)|31|63|(0)(0)|67|68) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r2v3, types: [G3.f, M3.p] */
    /* JADX WARN: Type inference failed for: r2v9, types: [G3.f, M3.p] */
    /* JADX WARN: Type inference failed for: r9v0, types: [L.P, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v9, types: [L.P] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(L.P r9, L.S r10, G3.b r11) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L.P.c(L.P, L.S, G3.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(L.P r4, G3.b r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof L.C0116y
            if (r0 == 0) goto L16
            r0 = r5
            L.y r0 = (L.C0116y) r0
            int r1 = r0.f1454s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f1454s = r1
            goto L1b
        L16:
            L.y r0 = new L.y
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f1452q
            F3.a r1 = F3.a.f861l
            int r2 = r0.f1454s
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            d4.d r4 = r0.f1451p
            L.P r0 = r0.f1450o
            i4.a.Y(r5)
            r5 = r4
            r4 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            i4.a.Y(r5)
            r0.f1450o = r4
            d4.d r5 = r4.f1335p
            r0.f1451p = r5
            r0.f1454s = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L4a
            goto L67
        L4a:
            r0 = 0
            int r1 = r4.f1336q     // Catch: java.lang.Throwable -> L60
            int r1 = r1 + r3
            r4.f1336q = r1     // Catch: java.lang.Throwable -> L60
            if (r1 != r3) goto L62
            V3.u r1 = r4.f1333n     // Catch: java.lang.Throwable -> L60
            L.z r2 = new L.z     // Catch: java.lang.Throwable -> L60
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L60
            V3.e0 r1 = V3.AbstractC0144v.j(r1, r2)     // Catch: java.lang.Throwable -> L60
            r4.f1337r = r1     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            r4 = move-exception
            goto L68
        L62:
            r5.e(r0)
            B3.g r1 = B3.g.f275a
        L67:
            return r1
        L68:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: L.P.d(L.P, G3.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(L.P r8, boolean r9, E3.d r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L.P.e(L.P, boolean, E3.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea A[Catch: b -> 0x00ab, TryCatch #2 {b -> 0x00ab, blocks: (B:35:0x00a6, B:69:0x0144, B:40:0x00b4, B:66:0x0127, B:48:0x00d1, B:56:0x00ea, B:57:0x00ee, B:52:0x00da, B:63:0x0115), top: B:77:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(L.P r8, boolean r9, G3.b r10) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L.P.f(L.P, boolean, G3.b):java.lang.Object");
    }

    @Override // L.InterfaceC0100h
    public final Object b(M3.p pVar, G3.f fVar) {
        E3.i iVar = fVar.f914m;
        N3.h.b(iVar);
        d0 d0Var = (d0) iVar.l(c0.f1374l);
        if (d0Var != null) {
            d0Var.d(this);
        }
        return AbstractC0144v.q(new d0(d0Var, this), new J(this, pVar, null), fVar);
    }

    public final Z g() {
        return (Z) this.f1341v.a();
    }

    @Override // L.InterfaceC0100h
    public final Y3.g getData() {
        return this.f1334o;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(G3.b r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof L.A
            if (r0 == 0) goto L13
            r0 = r6
            L.A r0 = (L.A) r0
            int r1 = r0.f1270s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1270s = r1
            goto L18
        L13:
            L.A r0 = new L.A
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f1268q
            F3.a r1 = F3.a.f861l
            int r2 = r0.f1270s
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.f1267p
            L.P r0 = r0.f1266o
            i4.a.Y(r6)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r6 = move-exception
            goto L6f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            L.P r2 = r0.f1266o
            i4.a.Y(r6)
            goto L51
        L3e:
            i4.a.Y(r6)
            L.Z r6 = r5.g()
            r0.f1266o = r5
            r0.f1270s = r4
            java.lang.Integer r6 = r6.a()
            if (r6 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            Z1.i r4 = r2.f1339t     // Catch: java.lang.Throwable -> L6d
            r0.f1266o = r2     // Catch: java.lang.Throwable -> L6d
            r0.f1267p = r6     // Catch: java.lang.Throwable -> L6d
            r0.f1270s = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r4.B(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r1) goto L66
            return r1
        L66:
            B3.g r6 = B3.g.f275a
            return r6
        L69:
            r1 = r6
            r6 = r0
            r0 = r2
            goto L6f
        L6d:
            r0 = move-exception
            goto L69
        L6f:
            B0.d r0 = r0.f1338s
            L.T r2 = new L.T
            r2.<init>(r1, r6)
            r0.u(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: L.P.h(G3.b):java.lang.Object");
    }

    public final Object i(G3.b bVar) {
        return ((N.i) this.f1340u.a()).a(new C0109q(3, (E3.d) null), bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.Object r12, boolean r13, G3.b r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof L.N
            if (r0 == 0) goto L13
            r0 = r14
            L.N r0 = (L.N) r0
            int r1 = r0.f1323r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1323r = r1
            goto L18
        L13:
            L.N r0 = new L.N
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f1321p
            F3.a r1 = F3.a.f861l
            int r2 = r0.f1323r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            N3.n r12 = r0.f1320o
            i4.a.Y(r14)
            goto L58
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            i4.a.Y(r14)
            N3.n r14 = new N3.n
            r14.<init>()
            B3.e r2 = r11.f1340u
            java.lang.Object r2 = r2.a()
            N.i r2 = (N.i) r2
            L.O r10 = new L.O
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f1320o = r14
            r0.f1323r = r3
            java.lang.Object r12 = r2.b(r10, r0)
            if (r12 != r1) goto L57
            return r1
        L57:
            r12 = r14
        L58:
            int r12 = r12.f1624l
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: L.P.j(java.lang.Object, boolean, G3.b):java.lang.Object");
    }
}
