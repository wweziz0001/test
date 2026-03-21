package n0;

import Q1.C;
import a0.C0190p;
import b3.AbstractC0307a;
import d0.AbstractC0370w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import x0.f0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f8848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q f8849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8850n = -1;

    public m(q qVar, int i) {
        this.f8849m = qVar;
        this.f8848l = i;
    }

    @Override // x0.f0
    public final void a() throws IOException {
        int i = this.f8850n;
        q qVar = this.f8849m;
        if (i == -2) {
            qVar.a();
            throw new K3.b(AbstractC0307a.k("Unable to bind a sample queue to TrackGroup with MIME type ", qVar.f8881T.a(this.f8848l).f3264d[0].f3424n, "."));
        }
        if (i == -1) {
            qVar.E();
        } else if (i != -3) {
            qVar.E();
            qVar.f8869G[i].u();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r6 = this;
            int r0 = r6.f8850n
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = 0
        L9:
            d0.AbstractC0360m.c(r0)
            n0.q r0 = r6.f8849m
            r0.a()
            int[] r3 = r0.f8883V
            r3.getClass()
            int[] r3 = r0.f8883V
            int r4 = r6.f8848l
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L30
            java.util.Set r1 = r0.f8882U
            x0.q0 r0 = r0.f8881T
            a0.V r0 = r0.a(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L36
            r0 = -3
            r3 = r0
            goto L3a
        L30:
            boolean[] r0 = r0.f8886Y
            boolean r2 = r0[r3]
            if (r2 == 0) goto L38
        L36:
            r3 = r5
            goto L3a
        L38:
            r0[r3] = r1
        L3a:
            r6.f8850n = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.m.b():void");
    }

    public final boolean c() {
        int i = this.f8850n;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // x0.f0
    public final int d(long j5) {
        if (!c()) {
            return 0;
        }
        int i = this.f8850n;
        q qVar = this.f8849m;
        if (qVar.C()) {
            return 0;
        }
        p pVar = qVar.f8869G[i];
        int iP = pVar.p(j5, qVar.f8892e0);
        ArrayList arrayList = qVar.y;
        Object next = null;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                do {
                    next = it.next();
                } while (it.hasNext());
            }
        } else if (!arrayList.isEmpty()) {
            next = arrayList.get(arrayList.size() - 1);
        }
        j jVar = (j) next;
        if (jVar != null && !jVar.f8810V) {
            iP = Math.min(iP, jVar.f(i) - pVar.n());
        }
        pVar.C(iP);
        return iP;
    }

    @Override // x0.f0
    public final boolean isReady() {
        if (this.f8850n != -3) {
            if (c()) {
                int i = this.f8850n;
                q qVar = this.f8849m;
                if (qVar.C() || !qVar.f8869G[i].s(qVar.f8892e0)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // x0.f0
    public final int k(Z1.e eVar, g0.e eVar2, int i) {
        C0190p c0190p;
        C0190p c0190p2;
        int iX = -3;
        if (this.f8850n == -3) {
            eVar2.b(4);
            return -4;
        }
        if (c()) {
            int i5 = this.f8850n;
            q qVar = this.f8849m;
            if (!qVar.C()) {
                ArrayList arrayList = qVar.y;
                int i6 = 0;
                if (!arrayList.isEmpty()) {
                    int i7 = 0;
                    loop0: while (i7 < arrayList.size() - 1) {
                        int i8 = ((j) arrayList.get(i7)).f8811v;
                        int length = qVar.f8869G.length;
                        for (int i9 = 0; i9 < length; i9++) {
                            if (qVar.f8886Y[i9] && qVar.f8869G[i9].w() == i8) {
                                break loop0;
                            }
                        }
                        i7++;
                    }
                    AbstractC0370w.R(arrayList, 0, i7);
                    j jVar = (j) arrayList.get(0);
                    C0190p c0190p3 = jVar.f10857o;
                    if (c0190p3.equals(qVar.f8879R)) {
                        c0190p2 = c0190p3;
                    } else {
                        m0.e eVar3 = qVar.f8907v;
                        Object obj = jVar.f10859q;
                        long j5 = jVar.f10860r;
                        int i10 = qVar.f8898m;
                        int i11 = jVar.f10858p;
                        c0190p2 = c0190p3;
                        eVar3.b(i10, c0190p3, i11, obj, j5);
                    }
                    qVar.f8879R = c0190p2;
                }
                if ((arrayList.isEmpty() || ((j) arrayList.get(0)).f8810V) && (iX = qVar.f8869G[i5].x(eVar, eVar2, i, qVar.f8892e0)) == -5) {
                    C0190p c0190pE = (C0190p) eVar.f3002n;
                    c0190pE.getClass();
                    if (i5 == qVar.M) {
                        int iG = C.g(qVar.f8869G[i5].w());
                        while (i6 < arrayList.size() && ((j) arrayList.get(i6)).f8811v != iG) {
                            i6++;
                        }
                        if (i6 < arrayList.size()) {
                            c0190p = ((j) arrayList.get(i6)).f10857o;
                        } else {
                            c0190p = qVar.f8878Q;
                            c0190p.getClass();
                        }
                        c0190pE = c0190pE.e(c0190p);
                    }
                    eVar.f3002n = c0190pE;
                }
            }
        }
        return iX;
    }
}
