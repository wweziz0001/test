package Y3;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F0.p f2812a = new F0.p(1, "NONE", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F0.p f2813b = new F0.p(1, "PENDING", false);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(Y3.y r4, L.C0109q r5, java.lang.Throwable r6, G3.b r7) {
        /*
            boolean r0 = r7 instanceof Y3.k
            if (r0 == 0) goto L13
            r0 = r7
            Y3.k r0 = (Y3.k) r0
            int r1 = r0.f2767q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2767q = r1
            goto L18
        L13:
            Y3.k r0 = new Y3.k
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f2766p
            F3.a r1 = F3.a.f861l
            int r2 = r0.f2767q
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.f2765o
            i4.a.Y(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            i4.a.Y(r7)
            r0.f2765o = r6     // Catch: java.lang.Throwable -> L29
            r0.f2767q = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.n(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            goto L43
        L41:
            B3.g r1 = B3.g.f275a
        L43:
            return r1
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            a.AbstractC0149a.c(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.w.a(Y3.y, L.q, java.lang.Throwable, G3.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0094 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(Y3.h r8, X3.q r9, boolean r10, G3.b r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.w.b(Y3.h, X3.q, boolean, G3.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(Y3.g r5, G3.b r6) {
        /*
            boolean r0 = r6 instanceof Y3.s
            if (r0 == 0) goto L13
            r0 = r6
            Y3.s r0 = (Y3.s) r0
            int r1 = r0.f2801r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2801r = r1
            goto L18
        L13:
            Y3.s r0 = new Y3.s
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f2800q
            F3.a r1 = F3.a.f861l
            int r2 = r0.f2801r
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            I1.a r5 = r0.f2799p
            N3.p r0 = r0.f2798o
            i4.a.Y(r6)     // Catch: Z3.a -> L2b
            goto L5a
        L2b:
            r6 = move-exception
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            i4.a.Y(r6)
            N3.p r6 = new N3.p
            r6.<init>()
            I1.a r2 = new I1.a
            r4 = 2
            r2.<init>(r6, r4)
            r0.f2798o = r6     // Catch: Z3.a -> L52
            r0.f2799p = r2     // Catch: Z3.a -> L52
            r0.f2801r = r3     // Catch: Z3.a -> L52
            java.lang.Object r5 = r5.b(r2, r0)     // Catch: Z3.a -> L52
            if (r5 != r1) goto L50
            goto L5c
        L50:
            r0 = r6
            goto L5a
        L52:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L56:
            Y3.h r1 = r6.f3095l
            if (r1 != r5) goto L5d
        L5a:
            java.lang.Object r1 = r0.f1626l
        L5c:
            return r1
        L5d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.w.c(Y3.g, G3.b):java.lang.Object");
    }
}
