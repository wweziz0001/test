package L;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4.d f1367a = d4.e.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B0.d f1368b = new B0.d(11);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0111t f1369c = new C0111t(new Y(2, null));

    public Z(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f1368b.f190l).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(M3.l r8, G3.b r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof L.W
            if (r0 == 0) goto L13
            r0 = r9
            L.W r0 = (L.W) r0
            int r1 = r0.f1361s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1361s = r1
            goto L18
        L13:
            L.W r0 = new L.W
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f1359q
            F3.a r1 = F3.a.f861l
            int r2 = r0.f1361s
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f1357o
            d4.a r8 = (d4.a) r8
            i4.a.Y(r9)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r9 = move-exception
            goto L71
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            d4.d r8 = r0.f1358p
            java.lang.Object r2 = r0.f1357o
            M3.l r2 = (M3.l) r2
            i4.a.Y(r9)
            r9 = r8
            r8 = r2
            goto L57
        L45:
            i4.a.Y(r9)
            r0.f1357o = r8
            d4.d r9 = r7.f1367a
            r0.f1358p = r9
            r0.f1361s = r4
            java.lang.Object r2 = r9.c(r0)
            if (r2 != r1) goto L57
            return r1
        L57:
            r0.f1357o = r9     // Catch: java.lang.Throwable -> L6d
            r0.f1358p = r5     // Catch: java.lang.Throwable -> L6d
            r0.f1361s = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r8 = r8.c(r0)     // Catch: java.lang.Throwable -> L6d
            if (r8 != r1) goto L64
            return r1
        L64:
            r6 = r9
            r9 = r8
            r8 = r6
        L67:
            d4.d r8 = (d4.d) r8
            r8.e(r5)
            return r9
        L6d:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L71:
            d4.d r8 = (d4.d) r8
            r8.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L.Z.b(M3.l, G3.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(M3.p r7, G3.b r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof L.X
            if (r0 == 0) goto L13
            r0 = r8
            L.X r0 = (L.X) r0
            int r1 = r0.f1366s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1366s = r1
            goto L18
        L13:
            L.X r0 = new L.X
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f1364q
            F3.a r1 = F3.a.f861l
            int r2 = r0.f1366s
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r7 = r0.f1363p
            d4.d r0 = r0.f1362o
            i4.a.Y(r8)     // Catch: java.lang.Throwable -> L2c
            goto L53
        L2c:
            r8 = move-exception
            goto L5d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            i4.a.Y(r8)
            d4.d r8 = r6.f1367a
            boolean r2 = r8.d(r4)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            r0.f1362o = r8     // Catch: java.lang.Throwable -> L59
            r0.f1363p = r2     // Catch: java.lang.Throwable -> L59
            r0.f1366s = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.i(r5, r0)     // Catch: java.lang.Throwable -> L59
            if (r7 != r1) goto L50
            return r1
        L50:
            r0 = r8
            r8 = r7
            r7 = r2
        L53:
            if (r7 == 0) goto L58
            r0.e(r4)
        L58:
            return r8
        L59:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L62
            r0.e(r4)
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: L.Z.c(M3.p, G3.b):java.lang.Object");
    }
}
