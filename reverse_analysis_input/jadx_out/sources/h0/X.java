package h0;

import a0.AbstractC0169U;
import a0.C0167S;
import a0.C0168T;
import a0.C0176b;
import android.util.Pair;
import d0.AbstractC0360m;
import d0.C0367t;
import java.util.ArrayList;
import m2.C0639F;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0.c f6072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0367t f6073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I2.g f6074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6077h;
    public V i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public V f6078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public V f6079k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public V f6080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f6082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f6083o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0167S f6070a = new C0167S();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0168T f6071b = new C0168T();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f6084p = new ArrayList();

    public X(i0.c cVar, C0367t c0367t, I2.g gVar, r rVar) {
        this.f6072c = cVar;
        this.f6073d = c0367t;
        this.f6074e = gVar;
    }

    public static x0.H m(AbstractC0169U abstractC0169U, Object obj, long j5, long j6, C0168T c0168t, C0167S c0167s) {
        abstractC0169U.g(obj, c0167s);
        abstractC0169U.n(c0167s.f3238c, c0168t);
        abstractC0169U.b(obj);
        int i = c0167s.f3242g.f3318a;
        if (i != 0) {
            if (i == 1) {
                c0167s.f(0);
            }
            c0167s.f3242g.getClass();
            c0167s.g(0);
        }
        abstractC0169U.g(obj, c0167s);
        int iC = c0167s.c(j5);
        return iC == -1 ? new x0.H(obj, j6, c0167s.b(j5)) : new x0.H(obj, iC, c0167s.e(iC), j6, -1);
    }

    public final V a() {
        V v4 = this.i;
        if (v4 == null) {
            return null;
        }
        if (v4 == this.f6078j) {
            this.f6078j = v4.f6058m;
        }
        v4.i();
        int i = this.f6081m - 1;
        this.f6081m = i;
        if (i == 0) {
            this.f6079k = null;
            V v5 = this.i;
            this.f6082n = v5.f6048b;
            this.f6083o = v5.f6053g.f6062a.f10534d;
        }
        this.i = this.i.f6058m;
        k();
        return this.i;
    }

    public final void b() {
        if (this.f6081m == 0) {
            return;
        }
        V v4 = this.i;
        AbstractC0360m.i(v4);
        this.f6082n = v4.f6048b;
        this.f6083o = v4.f6053g.f6062a.f10534d;
        while (v4 != null) {
            v4.i();
            v4 = v4.f6058m;
        }
        this.i = null;
        this.f6079k = null;
        this.f6078j = null;
        this.f6081m = 0;
        k();
    }

    public final W c(AbstractC0169U abstractC0169U, V v4, long j5) {
        W wF;
        long j6;
        W w4 = v4.f6053g;
        long j7 = (v4.f6061p + w4.f6066e) - j5;
        if (w4.f6068g) {
            W w5 = v4.f6053g;
            x0.H h2 = w5.f6062a;
            int iD = abstractC0169U.d(abstractC0169U.b(h2.f10531a), this.f6070a, this.f6071b, this.f6076g, this.f6077h);
            if (iD != -1) {
                C0167S c0167s = this.f6070a;
                int i = abstractC0169U.f(iD, c0167s, true).f3238c;
                Object obj = c0167s.f3237b;
                obj.getClass();
                long jO = h2.f10534d;
                long j8 = 0;
                if (abstractC0169U.m(i, this.f6071b, 0L).f3257n == iD) {
                    Pair pairJ = abstractC0169U.j(this.f6071b, this.f6070a, i, -9223372036854775807L, Math.max(0L, j7));
                    if (pairJ != null) {
                        obj = pairJ.first;
                        long jLongValue = ((Long) pairJ.second).longValue();
                        V v5 = v4.f6058m;
                        if (v5 == null || !v5.f6048b.equals(obj)) {
                            jO = o(obj);
                            if (jO == -1) {
                                jO = this.f6075f;
                                this.f6075f = 1 + jO;
                            }
                        } else {
                            jO = v5.f6053g.f6062a.f10534d;
                        }
                        j6 = jLongValue;
                        j8 = -9223372036854775807L;
                    }
                } else {
                    j6 = 0;
                }
                x0.H hM = m(abstractC0169U, obj, j6, jO, this.f6071b, this.f6070a);
                if (j8 != -9223372036854775807L && w5.f6064c != -9223372036854775807L) {
                    int i5 = abstractC0169U.g(h2.f10531a, c0167s).f3242g.f3318a;
                    c0167s.f3242g.getClass();
                    if (i5 > 0) {
                        c0167s.g(0);
                    }
                }
                return d(abstractC0169U, hM, j8, j6);
            }
            return null;
        }
        x0.H h5 = w4.f6062a;
        Object obj2 = h5.f10531a;
        C0167S c0167s2 = this.f6070a;
        abstractC0169U.g(obj2, c0167s2);
        boolean zB = h5.b();
        Object obj3 = h5.f10531a;
        if (zB) {
            C0176b c0176b = c0167s2.f3242g;
            int i6 = h5.f10532b;
            int i7 = c0176b.a(i6).f3305a;
            if (i7 != -1) {
                int iA = c0167s2.f3242g.a(i6).a(h5.f10533c);
                if (iA < i7) {
                    wF = e(abstractC0169U, h5.f10531a, i6, iA, w4.f6064c, h5.f10534d);
                } else {
                    long jLongValue2 = w4.f6064c;
                    if (jLongValue2 == -9223372036854775807L) {
                        Pair pairJ2 = abstractC0169U.j(this.f6071b, c0167s2, c0167s2.f3238c, -9223372036854775807L, Math.max(0L, j7));
                        if (pairJ2 != null) {
                            jLongValue2 = ((Long) pairJ2.second).longValue();
                        }
                    }
                    abstractC0169U.g(obj3, c0167s2);
                    int i8 = h5.f10532b;
                    c0167s2.d(i8);
                    c0167s2.f3242g.a(i8).getClass();
                    wF = f(abstractC0169U, h5.f10531a, Math.max(0L, jLongValue2), w4.f6064c, h5.f10534d);
                }
            }
            return null;
        }
        int i9 = h5.f10535e;
        if (i9 != -1) {
            c0167s2.f(i9);
        }
        int iE = c0167s2.e(i9);
        c0167s2.g(i9);
        if (iE != c0167s2.f3242g.a(i9).f3305a) {
            wF = e(abstractC0169U, h5.f10531a, h5.f10535e, iE, w4.f6066e, h5.f10534d);
        } else {
            abstractC0169U.g(obj3, c0167s2);
            c0167s2.d(i9);
            c0167s2.f3242g.a(i9).getClass();
            wF = f(abstractC0169U, h5.f10531a, 0L, w4.f6066e, h5.f10534d);
        }
        return wF;
    }

    public final W d(AbstractC0169U abstractC0169U, x0.H h2, long j5, long j6) {
        abstractC0169U.g(h2.f10531a, this.f6070a);
        if (!h2.b()) {
            return f(abstractC0169U, h2.f10531a, j6, j5, h2.f10534d);
        }
        return e(abstractC0169U, h2.f10531a, h2.f10532b, h2.f10533c, j5, h2.f10534d);
    }

    public final W e(AbstractC0169U abstractC0169U, Object obj, int i, int i5, long j5, long j6) {
        x0.H h2 = new x0.H(obj, i, i5, j6, -1);
        C0167S c0167s = this.f6070a;
        long jA = abstractC0169U.g(obj, c0167s).a(i, i5);
        if (i5 == c0167s.e(i)) {
            c0167s.f3242g.getClass();
        }
        c0167s.g(i);
        return new W(h2, (jA == -9223372036854775807L || 0 < jA) ? 0L : Math.max(0L, jA - 1), j5, -9223372036854775807L, jA, false, false, false, false);
    }

    public final W f(AbstractC0169U abstractC0169U, Object obj, long j5, long j6, long j7) {
        long j8;
        C0167S c0167s = this.f6070a;
        abstractC0169U.g(obj, c0167s);
        int iB = c0167s.b(j5);
        if (iB != -1) {
            c0167s.f(iB);
        }
        boolean z4 = false;
        if (iB != -1) {
            c0167s.g(iB);
        } else if (c0167s.f3242g.f3318a > 0) {
            c0167s.g(0);
        }
        x0.H h2 = new x0.H(obj, j7, iB);
        if (!h2.b() && iB == -1) {
            z4 = true;
        }
        boolean zI = i(abstractC0169U, h2);
        boolean zH = h(abstractC0169U, h2, z4);
        if (iB != -1) {
            c0167s.g(iB);
        }
        if (iB != -1) {
            c0167s.d(iB);
            j8 = 0;
        } else {
            j8 = -9223372036854775807L;
        }
        long j9 = (j8 == -9223372036854775807L || j8 == Long.MIN_VALUE) ? c0167s.f3239d : j8;
        return new W(h2, (j9 == -9223372036854775807L || j5 < j9) ? j5 : Math.max(0L, j9 - ((long) 1)), j6, j8, j9, false, z4, zI, zH);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h0.W g(a0.AbstractC0169U r20, h0.W r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            x0.H r3 = r2.f6062a
            boolean r4 = r3.b()
            r5 = -1
            int r6 = r3.f10535e
            if (r4 != 0) goto L16
            if (r6 != r5) goto L16
            r4 = 1
        L14:
            r12 = r4
            goto L18
        L16:
            r4 = 0
            goto L14
        L18:
            boolean r13 = r0.i(r1, r3)
            boolean r14 = r0.h(r1, r3, r12)
            java.lang.Object r4 = r3.f10531a
            a0.S r7 = r0.f6070a
            r1.g(r4, r7)
            boolean r1 = r3.b()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L3b
            if (r6 != r5) goto L35
            goto L3b
        L35:
            r7.d(r6)
            r10 = 0
            goto L3c
        L3b:
            r10 = r8
        L3c:
            boolean r1 = r3.b()
            int r4 = r3.f10532b
            if (r1 == 0) goto L4c
            int r1 = r3.f10533c
            long r8 = r7.a(r4, r1)
        L4a:
            r15 = r8
            goto L5c
        L4c:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L59
            r8 = -9223372036854775808
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 != 0) goto L57
            goto L59
        L57:
            r15 = r10
            goto L5c
        L59:
            long r8 = r7.f3239d
            goto L4a
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L66
            r7.g(r4)
            goto L6b
        L66:
            if (r6 == r5) goto L6b
            r7.g(r6)
        L6b:
            h0.W r17 = new h0.W
            long r4 = r2.f6063b
            long r6 = r2.f6064c
            r18 = 0
            r1 = r17
            r2 = r3
            r3 = r4
            r5 = r6
            r7 = r10
            r9 = r15
            r11 = r18
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.X.g(a0.U, h0.W):h0.W");
    }

    public final boolean h(AbstractC0169U abstractC0169U, x0.H h2, boolean z4) {
        int iB = abstractC0169U.b(h2.f10531a);
        if (abstractC0169U.m(abstractC0169U.f(iB, this.f6070a, false).f3238c, this.f6071b, 0L).i) {
            return false;
        }
        return abstractC0169U.d(iB, this.f6070a, this.f6071b, this.f6076g, this.f6077h) == -1 && z4;
    }

    public final boolean i(AbstractC0169U abstractC0169U, x0.H h2) {
        if (!(!h2.b() && h2.f10535e == -1)) {
            return false;
        }
        Object obj = h2.f10531a;
        return abstractC0169U.m(abstractC0169U.g(obj, this.f6070a).f3238c, this.f6071b, 0L).f3258o == abstractC0169U.b(obj);
    }

    public final void j() {
        V v4 = this.f6080l;
        if (v4 == null || v4.h()) {
            this.f6080l = null;
            for (int i = 0; i < this.f6084p.size(); i++) {
                V v5 = (V) this.f6084p.get(i);
                if (!v5.h()) {
                    this.f6080l = v5;
                    return;
                }
            }
        }
    }

    public final void k() {
        C0639F c0639fN = m2.I.n();
        for (V v4 = this.i; v4 != null; v4 = v4.f6058m) {
            c0639fN.a(v4.f6053g.f6062a);
        }
        V v5 = this.f6078j;
        this.f6073d.c(new Q.l(this, c0639fN, v5 == null ? null : v5.f6053g.f6062a, 3));
    }

    public final boolean l(V v4) {
        AbstractC0360m.i(v4);
        boolean z4 = false;
        if (v4.equals(this.f6079k)) {
            return false;
        }
        this.f6079k = v4;
        while (true) {
            v4 = v4.f6058m;
            if (v4 == null) {
                break;
            }
            if (v4 == this.f6078j) {
                this.f6078j = this.i;
                z4 = true;
            }
            v4.i();
            this.f6081m--;
        }
        V v5 = this.f6079k;
        v5.getClass();
        if (v5.f6058m != null) {
            v5.b();
            v5.f6058m = null;
            v5.c();
        }
        k();
        return z4;
    }

    public final x0.H n(AbstractC0169U abstractC0169U, Object obj, long j5) {
        long jO;
        int iB;
        Object obj2 = obj;
        C0167S c0167s = this.f6070a;
        int i = abstractC0169U.g(obj2, c0167s).f3238c;
        Object obj3 = this.f6082n;
        if (obj3 == null || (iB = abstractC0169U.b(obj3)) == -1 || abstractC0169U.f(iB, c0167s, false).f3238c != i) {
            V v4 = this.i;
            while (true) {
                if (v4 == null) {
                    V v5 = this.i;
                    while (true) {
                        if (v5 != null) {
                            int iB2 = abstractC0169U.b(v5.f6048b);
                            if (iB2 != -1 && abstractC0169U.f(iB2, c0167s, false).f3238c == i) {
                                jO = v5.f6053g.f6062a.f10534d;
                                break;
                            }
                            v5 = v5.f6058m;
                        } else {
                            jO = o(obj2);
                            if (jO == -1) {
                                jO = this.f6075f;
                                this.f6075f = 1 + jO;
                                if (this.i == null) {
                                    this.f6082n = obj2;
                                    this.f6083o = jO;
                                }
                            }
                        }
                    }
                } else {
                    if (v4.f6048b.equals(obj2)) {
                        jO = v4.f6053g.f6062a.f10534d;
                        break;
                    }
                    v4 = v4.f6058m;
                }
            }
        } else {
            jO = this.f6083o;
        }
        long j6 = jO;
        abstractC0169U.g(obj2, c0167s);
        int i5 = c0167s.f3238c;
        C0168T c0168t = this.f6071b;
        abstractC0169U.n(i5, c0168t);
        boolean z4 = false;
        for (int iB3 = abstractC0169U.b(obj); iB3 >= c0168t.f3257n; iB3--) {
            abstractC0169U.f(iB3, c0167s, true);
            boolean z5 = c0167s.f3242g.f3318a > 0;
            z4 |= z5;
            if (c0167s.c(c0167s.f3239d) != -1) {
                obj2 = c0167s.f3237b;
                obj2.getClass();
            }
            if (z4 && (!z5 || c0167s.f3239d != 0)) {
                break;
            }
        }
        return m(abstractC0169U, obj2, j5, j6, this.f6071b, this.f6070a);
    }

    public final long o(Object obj) {
        for (int i = 0; i < this.f6084p.size(); i++) {
            V v4 = (V) this.f6084p.get(i);
            if (v4.f6048b.equals(obj)) {
                return v4.f6053g.f6062a.f10534d;
            }
        }
        return -1L;
    }

    public final boolean p(AbstractC0169U abstractC0169U) {
        V v4;
        V v5 = this.i;
        if (v5 == null) {
            return true;
        }
        int iB = abstractC0169U.b(v5.f6048b);
        while (true) {
            iB = abstractC0169U.d(iB, this.f6070a, this.f6071b, this.f6076g, this.f6077h);
            while (true) {
                v5.getClass();
                v4 = v5.f6058m;
                if (v4 == null || v5.f6053g.f6068g) {
                    break;
                }
                v5 = v4;
            }
            if (iB == -1 || v4 == null || abstractC0169U.b(v4.f6048b) != iB) {
                break;
            }
            v5 = v4;
        }
        boolean zL = l(v5);
        v5.f6053g = g(abstractC0169U, v5.f6053g);
        return !zL;
    }

    public final boolean q(AbstractC0169U abstractC0169U, long j5, long j6) {
        W wG;
        V v4 = this.i;
        V v5 = null;
        while (v4 != null) {
            W w4 = v4.f6053g;
            if (v5 == null) {
                wG = g(abstractC0169U, w4);
            } else {
                W wC = c(abstractC0169U, v5, j5);
                if (wC == null) {
                    return !l(v5);
                }
                if (w4.f6063b != wC.f6063b || !w4.f6062a.equals(wC.f6062a)) {
                    return !l(v5);
                }
                wG = wC;
            }
            v4.f6053g = wG.a(w4.f6064c);
            long j7 = w4.f6066e;
            if (j7 != -9223372036854775807L) {
                long j8 = wG.f6066e;
                if (j7 != j8) {
                    v4.k();
                    return (l(v4) || (v4 == this.f6078j && !v4.f6053g.f6067f && ((j6 > Long.MIN_VALUE ? 1 : (j6 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j6 > ((j8 > (-9223372036854775807L) ? 1 : (j8 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : v4.f6061p + j8) ? 1 : (j6 == ((j8 > (-9223372036854775807L) ? 1 : (j8 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : v4.f6061p + j8) ? 0 : -1)) >= 0))) ? false : true;
                }
            }
            v5 = v4;
            v4 = v4.f6058m;
        }
        return true;
    }
}
