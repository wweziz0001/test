package Y3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Z3.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final G3.f f2748o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final G3.f f2749p;

    /* JADX WARN: Multi-variable type inference failed */
    public c(M3.p pVar, E3.i iVar, int i, int i5) {
        super(iVar, i, i5);
        G3.f fVar = (G3.f) pVar;
        this.f2748o = fVar;
        this.f2749p = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v3, types: [G3.f, M3.p] */
    @Override // Z3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(X3.r r6, E3.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Y3.b
            if (r0 == 0) goto L13
            r0 = r7
            Y3.b r0 = (Y3.b) r0
            int r1 = r0.f2747r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2747r = r1
            goto L1a
        L13:
            Y3.b r0 = new Y3.b
            G3.b r7 = (G3.b) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.f2745p
            F3.a r1 = F3.a.f861l
            int r2 = r0.f2747r
            B3.g r3 = B3.g.f275a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            X3.r r6 = r0.f2744o
            i4.a.Y(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            i4.a.Y(r7)
            r0.f2744o = r6
            r0.f2747r = r4
            G3.f r7 = r5.f2748o
            java.lang.Object r7 = r7.i(r6, r0)
            if (r7 != r1) goto L45
            goto L46
        L45:
            r7 = r3
        L46:
            if (r7 != r1) goto L49
            return r1
        L49:
            X3.q r6 = (X3.q) r6
            X3.d r6 = r6.f2676o
            boolean r6 = r6.v()
            if (r6 == 0) goto L54
            return r3
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.c.c(X3.r, E3.d):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [G3.f, M3.p] */
    @Override // Z3.f
    public final Z3.f d(E3.i iVar, int i, int i5) {
        return new c(this.f2749p, iVar, i, i5);
    }

    @Override // Z3.f
    public final String toString() {
        return "block[" + this.f2748o + "] -> " + super.toString();
    }
}
