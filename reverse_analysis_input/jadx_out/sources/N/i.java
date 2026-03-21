package N;

import L.InterfaceC0093a;
import L.Z;
import g4.l;

/* JADX INFO: loaded from: classes.dex */
public final class i implements InterfaceC0093a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g4.i f1547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f1548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z f1549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f1550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f1551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d4.d f1552f;

    public i(g4.i iVar, l lVar, Z z4, e eVar) {
        N3.h.e(iVar, "fileSystem");
        N3.h.e(lVar, "path");
        N3.h.e(z4, "coordinator");
        this.f1547a = iVar;
        this.f1548b = lVar;
        this.f1549c = z4;
        this.f1550d = eVar;
        this.f1551e = new a();
        this.f1552f = d4.e.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007d, blocks: (B:33:0x007c, B:43:0x008f, B:42:0x008c, B:39:0x0087), top: B:60:0x0020, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [N.i] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [G3.b, N.g] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [N.i] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [N.i] */
    /* JADX WARN: Type inference failed for: r9v0, types: [L.q] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(L.C0109q r9, G3.b r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof N.g
            if (r0 == 0) goto L13
            r0 = r10
            N.g r0 = (N.g) r0
            int r1 = r0.f1539t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1539t = r1
            goto L18
        L13:
            N.g r0 = new N.g
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f1537r
            F3.a r1 = F3.a.f861l
            int r2 = r0.f1539t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            boolean r9 = r0.f1536q
            N.c r1 = r0.f1535p
            N.i r0 = r0.f1534o
            i4.a.Y(r10)     // Catch: java.lang.Throwable -> L2e
            goto L6c
        L2e:
            r10 = move-exception
            goto L87
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            i4.a.Y(r10)
            N.a r10 = r8.f1551e
            java.util.concurrent.atomic.AtomicBoolean r10 = r10.f1516a
            boolean r10 = r10.get()
            if (r10 != 0) goto L9f
            d4.d r10 = r8.f1552f
            boolean r10 = r10.d(r3)
            N.c r2 = new N.c     // Catch: java.lang.Throwable -> L95
            g4.i r5 = r8.f1547a     // Catch: java.lang.Throwable -> L95
            g4.l r6 = r8.f1548b     // Catch: java.lang.Throwable -> L95
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L95
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L85
            r0.f1534o = r8     // Catch: java.lang.Throwable -> L85
            r0.f1535p = r2     // Catch: java.lang.Throwable -> L85
            r0.f1536q = r10     // Catch: java.lang.Throwable -> L85
            r0.f1539t = r4     // Catch: java.lang.Throwable -> L85
            java.lang.Object r9 = r9.n(r2, r5, r0)     // Catch: java.lang.Throwable -> L85
            if (r9 != r1) goto L67
            return r1
        L67:
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L6c:
            r1.close()     // Catch: java.lang.Throwable -> L71
            r1 = r3
            goto L72
        L71:
            r1 = move-exception
        L72:
            if (r1 != 0) goto L7c
            if (r9 == 0) goto L7b
            d4.d r9 = r0.f1552f
            r9.e(r3)
        L7b:
            return r10
        L7c:
            throw r1     // Catch: java.lang.Throwable -> L7d
        L7d:
            r10 = move-exception
            goto L97
        L7f:
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
            goto L87
        L85:
            r9 = move-exception
            goto L7f
        L87:
            r1.close()     // Catch: java.lang.Throwable -> L8b
            goto L8f
        L8b:
            r1 = move-exception
            a.AbstractC0149a.c(r10, r1)     // Catch: java.lang.Throwable -> L7d
        L8f:
            throw r10     // Catch: java.lang.Throwable -> L7d
        L90:
            r0 = r8
            r7 = r10
            r10 = r9
            r9 = r7
            goto L97
        L95:
            r9 = move-exception
            goto L90
        L97:
            if (r9 == 0) goto L9e
            d4.d r9 = r0.f1552f
            r9.e(r3)
        L9e:
            throw r10
        L9f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "StorageConnection has already been disposed."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: N.i.a(L.q, G3.b):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011a A[Catch: all -> 0x012a, IOException -> 0x012d, TRY_ENTER, TryCatch #9 {IOException -> 0x012d, all -> 0x012a, blocks: (B:57:0x011a, B:59:0x0122, B:67:0x013a, B:74:0x0149, B:73:0x0146, B:70:0x0141), top: B:95:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a A[Catch: all -> 0x012a, IOException -> 0x012d, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x012d, all -> 0x012a, blocks: (B:57:0x011a, B:59:0x0122, B:67:0x013a, B:74:0x0149, B:73:0x0146, B:70:0x0141), top: B:95:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [N.i] */
    /* JADX WARN: Type inference failed for: r0v12, types: [N.i] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [G3.b, N.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [g4.f, g4.i] */
    /* JADX WARN: Type inference failed for: r0v6, types: [g4.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v20, types: [g4.f, g4.i] */
    /* JADX WARN: Type inference failed for: r10v23, types: [g4.i] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v9, types: [M3.p] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [d4.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r1v0, types: [F3.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [g4.l] */
    /* JADX WARN: Type inference failed for: r1v6, types: [g4.l] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v15, types: [d4.a] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [g4.l] */
    /* JADX WARN: Type inference failed for: r2v7, types: [g4.l] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [N.i] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [N.i] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r8v6, types: [g4.i] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(L.O r10, G3.b r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.i.b(L.O, G3.b):java.lang.Object");
    }

    @Override // L.InterfaceC0093a
    public final void close() {
        this.f1551e.f1516a.set(true);
        this.f1550d.d();
    }
}
