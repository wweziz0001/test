package Z3;

/* JADX INFO: loaded from: classes.dex */
public final class h extends f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Y3.g f3112o;

    public h(Y3.g gVar, E3.i iVar, int i, int i5) {
        super(iVar, i, i5);
        this.f3112o = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    @Override // Z3.f, Y3.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(Y3.h r7, E3.d r8) throws java.lang.Throwable {
        /*
            r6 = this;
            B3.g r0 = B3.g.f275a
            int r1 = r6.f3107m
            r2 = -3
            F3.a r3 = F3.a.f861l
            if (r1 != r2) goto L71
            E3.i r1 = r8.getContext()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            V3.p r4 = V3.C0139p.f2437o
            E3.i r5 = r6.f3106l
            java.lang.Object r2 = r5.k(r2, r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L24
            E3.i r2 = r1.o(r5)
            goto L29
        L24:
            r2 = 0
            E3.i r2 = V3.AbstractC0144v.d(r1, r5, r2)
        L29:
            boolean r4 = N3.h.a(r2, r1)
            if (r4 == 0) goto L3d
            Y3.g r1 = r6.f3112o
            java.lang.Object r7 = r1.b(r7, r8)
            if (r7 != r3) goto L38
            goto L39
        L38:
            r7 = r0
        L39:
            if (r7 != r3) goto L78
        L3b:
            r0 = r7
            goto L78
        L3d:
            E3.e r4 = E3.e.f674l
            E3.g r5 = r2.l(r4)
            E3.g r1 = r1.l(r4)
            boolean r1 = N3.h.a(r5, r1)
            if (r1 == 0) goto L71
            E3.i r1 = r8.getContext()
            boolean r4 = r7 instanceof Z3.w
            if (r4 == 0) goto L56
            goto L5c
        L56:
            Y3.e r4 = new Y3.e
            r4.<init>(r7, r1)
            r7 = r4
        L5c:
            Z3.g r1 = new Z3.g
            r4 = 0
            r1.<init>(r6, r4)
            java.lang.Object r4 = a4.a.l(r2)
            java.lang.Object r7 = Z3.q.b(r2, r7, r4, r1, r8)
            if (r7 != r3) goto L6d
            goto L6e
        L6d:
            r7 = r0
        L6e:
            if (r7 != r3) goto L78
            goto L3b
        L71:
            java.lang.Object r7 = super.b(r7, r8)
            if (r7 != r3) goto L78
            goto L3b
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.h.b(Y3.h, E3.d):java.lang.Object");
    }

    @Override // Z3.f
    public final Object c(X3.r rVar, E3.d dVar) {
        Object objB = this.f3112o.b(new w(rVar), dVar);
        F3.a aVar = F3.a.f861l;
        B3.g gVar = B3.g.f275a;
        if (objB != aVar) {
            objB = gVar;
        }
        return objB == aVar ? objB : gVar;
    }

    @Override // Z3.f
    public final f d(E3.i iVar, int i, int i5) {
        return new h(this.f3112o, iVar, i, i5);
    }

    @Override // Z3.f
    public final String toString() {
        return this.f3112o + " -> " + super.toString();
    }
}
