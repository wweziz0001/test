package Z3;

import a.AbstractC0149a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final E3.i f3106l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f3107m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f3108n;

    public f(E3.i iVar, int i, int i5) {
        this.f3106l = iVar;
        this.f3107m = i;
        this.f3108n = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    @Override // Z3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Y3.g a(E3.i r5, int r6, int r7) {
        /*
            r4 = this;
            E3.i r0 = r4.f3106l
            E3.i r5 = r5.o(r0)
            r1 = 1
            int r2 = r4.f3108n
            int r3 = r4.f3107m
            if (r7 == r1) goto Le
            goto L25
        Le:
            r7 = -3
            if (r3 != r7) goto L12
            goto L24
        L12:
            if (r6 != r7) goto L16
        L14:
            r6 = r3
            goto L24
        L16:
            r7 = -2
            if (r3 != r7) goto L1a
            goto L24
        L1a:
            if (r6 != r7) goto L1d
            goto L14
        L1d:
            int r6 = r6 + r3
            if (r6 < 0) goto L21
            goto L24
        L21:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L24:
            r7 = r2
        L25:
            boolean r0 = N3.h.a(r5, r0)
            if (r0 == 0) goto L30
            if (r6 != r3) goto L30
            if (r7 != r2) goto L30
            return r4
        L30:
            Z3.f r5 = r4.d(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.f.a(E3.i, int, int):Y3.g");
    }

    @Override // Y3.g
    public Object b(Y3.h hVar, E3.d dVar) throws Throwable {
        d dVar2 = new d(hVar, this, null);
        a4.t tVar = new a4.t(dVar, dVar.getContext());
        Object objH = AbstractC0149a.H(tVar, tVar, dVar2);
        return objH == F3.a.f861l ? objH : B3.g.f275a;
    }

    public abstract Object c(X3.r rVar, E3.d dVar);

    public abstract f d(E3.i iVar, int i, int i5);

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        E3.j jVar = E3.j.f675l;
        E3.i iVar = this.f3106l;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i = this.f3107m;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i5 = this.f3108n;
        if (i5 != 1) {
            arrayList.add("onBufferOverflow=".concat(i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + C3.f.V(arrayList, ", ", null, null, null, 62) + ']';
    }
}
