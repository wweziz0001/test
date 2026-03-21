package k0;

import A0.w;
import B0.s;
import F0.C0064k;
import F0.E;
import F0.q;
import a0.AbstractC0156G;
import a0.C0187m;
import a0.C0190p;
import a0.C0200z;
import android.os.SystemClock;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import f0.C0417l;
import f0.C0427v;
import f0.InterfaceC0413h;
import h0.T;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l0.C0562a;
import l0.C0563b;
import l0.C0564c;
import m2.I;
import x0.C0961b;
import y0.AbstractC0997e;
import y0.C0996d;

/* JADX INFO: loaded from: classes.dex */
public final class k implements y0.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f7603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z1.i f7604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f7605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC0413h f7607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f7610h;
    public final i[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f7611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0564c f7612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0961b f7614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7615n;

    public k(C0187m c0187m, s sVar, C0564c c0564c, Z1.i iVar, int i, int[] iArr, w wVar, int i5, InterfaceC0413h interfaceC0413h, long j5, int i6, boolean z4, ArrayList arrayList, n nVar) {
        q mVar;
        C0190p c0190p;
        i[] iVarArr;
        l0.m mVar2;
        C0996d c0996d;
        this.f7603a = sVar;
        this.f7612k = c0564c;
        this.f7604b = iVar;
        this.f7605c = iArr;
        this.f7611j = wVar;
        this.f7606d = i5;
        this.f7607e = interfaceC0413h;
        this.f7613l = i;
        this.f7608f = j5;
        this.f7609g = i6;
        this.f7610h = nVar;
        long jD = c0564c.d(i);
        ArrayList arrayListH = h();
        this.i = new i[wVar.length()];
        int i7 = 0;
        int i8 = 0;
        while (i8 < this.i.length) {
            l0.m mVar3 = (l0.m) arrayListH.get(wVar.k(i8));
            C0563b c0563bC = iVar.C(mVar3.f7870m);
            i[] iVarArr2 = this.i;
            C0563b c0563b = c0563bC == null ? (C0563b) mVar3.f7870m.get(i7) : c0563bC;
            C0190p c0190p2 = mVar3.f7869l;
            c0187m.getClass();
            String str = c0190p2.f3423m;
            if (!AbstractC0156G.k(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    c0190p = c0190p2;
                    iVarArr = iVarArr2;
                    mVar2 = mVar3;
                    mVar = new X0.d((C0200z) c0187m.f3363b, c0187m.f3362a ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    mVar = new J0.a(1);
                } else if (Objects.equals(str, "image/png")) {
                    mVar = new J0.a(1, (byte) 0);
                } else {
                    int i9 = z4 ? 4 : 0;
                    c0190p = c0190p2;
                    iVarArr = iVarArr2;
                    mVar2 = mVar3;
                    mVar = new Z0.m((C0200z) c0187m.f3363b, c0187m.f3362a ? i9 : i9 | 32, null, null, arrayList, nVar);
                }
                c0996d = new C0996d(mVar, i5, c0190p);
                int i10 = i8;
                iVarArr[i10] = new i(jD, mVar2, c0563b, c0996d, 0L, mVar2.d());
                i8 = i10 + 1;
                i7 = 0;
            } else if (c0187m.f3362a) {
                mVar = new c1.h(((C0200z) c0187m.f3363b).a(c0190p2), c0190p2);
            } else {
                c0996d = null;
                iVarArr = iVarArr2;
                mVar2 = mVar3;
                int i102 = i8;
                iVarArr[i102] = new i(jD, mVar2, c0563b, c0996d, 0L, mVar2.d());
                i8 = i102 + 1;
                i7 = 0;
            }
            c0190p = c0190p2;
            iVarArr = iVarArr2;
            mVar2 = mVar3;
            c0996d = new C0996d(mVar, i5, c0190p);
            int i1022 = i8;
            iVarArr[i1022] = new i(jD, mVar2, c0563b, c0996d, 0L, mVar2.d());
            i8 = i1022 + 1;
            i7 = 0;
        }
    }

    @Override // y0.i
    public final void a() throws C0961b {
        C0961b c0961b = this.f7614m;
        if (c0961b != null) {
            throw c0961b;
        }
        this.f7603a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    @Override // y0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(long r19, h0.t0 r21) {
        /*
            r18 = this;
            r1 = r19
            r7 = r18
            k0.i[] r0 = r7.i
            int r3 = r0.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L5f
            r5 = r0[r4]
            k0.h r6 = r5.f7598d
            if (r6 == 0) goto L5c
            long r8 = r5.d()
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L1b
            goto L5c
        L1b:
            k0.h r0 = r5.f7598d
            d0.AbstractC0360m.i(r0)
            long r3 = r5.f7599e
            long r3 = r0.c(r1, r3)
            long r10 = r5.f7600f
            long r3 = r3 + r10
            long r12 = r5.f(r3)
            int r6 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r6 >= 0) goto L51
            r14 = -1
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            r14 = 1
            if (r6 == 0) goto L4a
            d0.AbstractC0360m.i(r0)
            long r16 = r0.n()
            long r16 = r16 + r10
            long r16 = r16 + r8
            long r16 = r16 - r14
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 >= 0) goto L51
        L4a:
            long r3 = r3 + r14
            long r3 = r5.f(r3)
            r5 = r3
            goto L52
        L51:
            r5 = r12
        L52:
            r0 = r21
            r1 = r19
            r3 = r12
            long r0 = r0.a(r1, r3, r5)
            return r0
        L5c:
            int r4 = r4 + 1
            goto L8
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.k.b(long, h0.t0):long");
    }

    @Override // y0.i
    public final boolean c(long j5, AbstractC0997e abstractC0997e, List list) {
        if (this.f7614m != null) {
            return false;
        }
        return this.f7611j.i(j5, abstractC0997e, list);
    }

    @Override // y0.i
    public final boolean d(AbstractC0997e abstractC0997e, boolean z4, A.j jVar, A0.b bVar) {
        long jMax;
        if (!z4) {
            return false;
        }
        n nVar = this.f7610h;
        if (nVar != null) {
            long j5 = nVar.f7629d;
            boolean z5 = j5 != -9223372036854775807L && j5 < abstractC0997e.f10860r;
            o oVar = nVar.f7630e;
            if (oVar.f7636q.f7825d) {
                if (!oVar.f7638s) {
                    if (z5) {
                        if (oVar.f7637r) {
                            oVar.f7638s = true;
                            oVar.f7637r = false;
                            g gVar = oVar.f7632m.f7551m;
                            gVar.f7575O.removeCallbacks(gVar.f7569H);
                            gVar.B();
                        }
                    }
                }
                return true;
            }
        }
        boolean z6 = this.f7612k.f7825d;
        i[] iVarArr = this.i;
        if (!z6 && (abstractC0997e instanceof y0.l)) {
            IOException iOException = (IOException) jVar.f27m;
            if ((iOException instanceof C0427v) && ((C0427v) iOException).f5724o == 404) {
                i iVar = iVarArr[this.f7611j.p(abstractC0997e.f10857o)];
                long jD = iVar.d();
                if (jD != -1 && jD != 0) {
                    h hVar = iVar.f7598d;
                    AbstractC0360m.i(hVar);
                    if (((y0.l) abstractC0997e).a() > ((hVar.n() + iVar.f7600f) + jD) - 1) {
                        this.f7615n = true;
                        return true;
                    }
                }
            }
        }
        i iVar2 = iVarArr[this.f7611j.p(abstractC0997e.f10857o)];
        I i = iVar2.f7596b.f7870m;
        Z1.i iVar3 = this.f7604b;
        C0563b c0563bC = iVar3.C(i);
        C0563b c0563b = iVar2.f7597c;
        if (c0563bC != null && !c0563b.equals(c0563bC)) {
            return true;
        }
        w wVar = this.f7611j;
        I i5 = iVar2.f7596b.f7870m;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = wVar.length();
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            if (wVar.o(jElapsedRealtime, i7)) {
                i6++;
            }
        }
        HashSet hashSet = new HashSet();
        for (int i8 = 0; i8 < i5.size(); i8++) {
            hashSet.add(Integer.valueOf(((C0563b) i5.get(i8)).f7820c));
        }
        int size = hashSet.size();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayListC = iVar3.c(i5);
        for (int i9 = 0; i9 < arrayListC.size(); i9++) {
            hashSet2.add(Integer.valueOf(((C0563b) arrayListC.get(i9)).f7820c));
        }
        B0.j jVar2 = new B0.j(size, size - hashSet2.size(), length, i6);
        if (!jVar2.a(2) && !jVar2.a(1)) {
            return false;
        }
        bVar.getClass();
        B0.k kVarM = A0.b.m(jVar2, jVar);
        if (kVarM != null) {
            int i10 = kVarM.f226a;
            if (jVar2.a(i10)) {
                long j6 = kVarM.f227b;
                if (i10 == 2) {
                    w wVar2 = this.f7611j;
                    return wVar2.q(j6, wVar2.p(abstractC0997e.f10857o));
                }
                if (i10 != 1) {
                    return false;
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() + j6;
                String str = c0563b.f7819b;
                HashMap map = (HashMap) iVar3.f3012l;
                if (map.containsKey(str)) {
                    Long l3 = (Long) map.get(str);
                    int i11 = AbstractC0370w.f5326a;
                    jMax = Math.max(jElapsedRealtime2, l3.longValue());
                } else {
                    jMax = jElapsedRealtime2;
                }
                map.put(str, Long.valueOf(jMax));
                int i12 = c0563b.f7820c;
                if (i12 == Integer.MIN_VALUE) {
                    return true;
                }
                Integer numValueOf = Integer.valueOf(i12);
                HashMap map2 = (HashMap) iVar3.f3013m;
                if (map2.containsKey(numValueOf)) {
                    Long l4 = (Long) map2.get(numValueOf);
                    int i13 = AbstractC0370w.f5326a;
                    jElapsedRealtime2 = Math.max(jElapsedRealtime2, l4.longValue());
                }
                map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                return true;
            }
        }
        return false;
    }

    @Override // y0.i
    public final void e(T t4, long j5, List list, C0187m c0187m) {
        long j6;
        i[] iVarArr;
        y0.m[] mVarArr;
        long jMax;
        l0.m mVar;
        long j7;
        long j8;
        C0190p c0190p;
        long j9;
        long j10;
        Object jVar;
        long jM;
        long j11;
        long j12;
        boolean z4;
        if (this.f7614m != null) {
            return;
        }
        long j13 = t4.f6044a;
        long j14 = j5 - j13;
        long jM2 = AbstractC0370w.M(this.f7612k.b(this.f7613l).f7854b) + AbstractC0370w.M(this.f7612k.f7822a) + j5;
        n nVar = this.f7610h;
        if (nVar != null) {
            o oVar = nVar.f7630e;
            C0564c c0564c = oVar.f7636q;
            if (!c0564c.f7825d) {
                j6 = j14;
                z4 = false;
            } else if (oVar.f7638s) {
                j6 = j14;
                z4 = true;
            } else {
                Map.Entry entryCeilingEntry = oVar.f7635p.ceilingEntry(Long.valueOf(c0564c.f7829h));
                d dVar = oVar.f7632m;
                if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= jM2) {
                    j6 = j14;
                    z4 = false;
                } else {
                    long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
                    g gVar = dVar.f7551m;
                    j6 = j14;
                    long j15 = gVar.f7585Y;
                    if (j15 == -9223372036854775807L || j15 < jLongValue) {
                        gVar.f7585Y = jLongValue;
                    }
                    z4 = true;
                }
                if (z4 && oVar.f7637r) {
                    oVar.f7638s = true;
                    oVar.f7637r = false;
                    g gVar2 = dVar.f7551m;
                    gVar2.f7575O.removeCallbacks(gVar2.f7569H);
                    gVar2.B();
                }
            }
            if (z4) {
                return;
            }
        } else {
            j6 = j14;
        }
        long jM3 = AbstractC0370w.M(AbstractC0370w.y(this.f7608f));
        C0564c c0564c2 = this.f7612k;
        long j16 = c0564c2.f7822a;
        long jM4 = j16 == -9223372036854775807L ? -9223372036854775807L : jM3 - AbstractC0370w.M(j16 + c0564c2.b(this.f7613l).f7854b);
        y0.l lVar = list.isEmpty() ? null : (y0.l) list.get(list.size() - 1);
        int length = this.f7611j.length();
        y0.m[] mVarArr2 = new y0.m[length];
        int i = 0;
        while (true) {
            iVarArr = this.i;
            if (i >= length) {
                break;
            }
            i iVar = iVarArr[i];
            h hVar = iVar.f7598d;
            p1.b bVar = y0.m.f10903k;
            if (hVar == null) {
                mVarArr2[i] = bVar;
                j11 = jM4;
            } else {
                long jB = iVar.b(jM3);
                long jC = iVar.c(jM3);
                if (lVar != null) {
                    j11 = jM4;
                    j12 = lVar.a();
                } else {
                    h hVar2 = iVar.f7598d;
                    AbstractC0360m.i(hVar2);
                    j11 = jM4;
                    j12 = AbstractC0370w.j(hVar2.c(j5, iVar.f7599e) + iVar.f7600f, jB, jC);
                }
                if (j12 < jB) {
                    mVarArr2[i] = bVar;
                } else {
                    mVarArr2[i] = new j(i(i), j12, jC);
                }
            }
            i++;
            jM4 = j11;
        }
        long j17 = jM4;
        long j18 = 0;
        if (!this.f7612k.f7825d || iVarArr[0].d() == 0) {
            mVarArr = mVarArr2;
            jMax = -9223372036854775807L;
        } else {
            long jE = iVarArr[0].e(iVarArr[0].c(jM3));
            C0564c c0564c3 = this.f7612k;
            long j19 = c0564c3.f7822a;
            if (j19 == -9223372036854775807L) {
                mVarArr = mVarArr2;
                jM = -9223372036854775807L;
            } else {
                mVarArr = mVarArr2;
                jM = jM3 - AbstractC0370w.M(j19 + c0564c3.b(this.f7613l).f7854b);
            }
            long jMin = Math.min(jM, jE) - j13;
            j18 = 0;
            jMax = Math.max(0L, jMin);
        }
        long j20 = j6;
        long j21 = j18;
        this.f7611j.s(j13, j20, jMax, list, mVarArr);
        int iF = this.f7611j.f();
        SystemClock.elapsedRealtime();
        i iVarI = i(iF);
        h hVar3 = iVarI.f7598d;
        C0563b c0563b = iVarI.f7597c;
        C0996d c0996d = iVarI.f7595a;
        l0.m mVar2 = iVarI.f7596b;
        if (c0996d != null) {
            l0.j jVar2 = c0996d.f10853t == null ? mVar2.f7873p : null;
            l0.j jVarE = hVar3 == null ? mVar2.e() : null;
            if (jVar2 != null || jVarE != null) {
                C0190p c0190pD = this.f7611j.d();
                int iE = this.f7611j.e();
                Object objL = this.f7611j.l();
                if (jVar2 != null) {
                    l0.j jVarA = jVar2.a(jVarE, c0563b.f7818a);
                    if (jVarA != null) {
                        jVar2 = jVarA;
                    }
                } else {
                    jVarE.getClass();
                    jVar2 = jVarE;
                }
                c0187m.f3363b = new y0.k(this.f7607e, D1.b.f(mVar2, c0563b.f7818a, jVar2, 0), c0190pD, iE, objL, iVarI.f7595a);
                return;
            }
        }
        C0564c c0564c4 = this.f7612k;
        boolean z5 = c0564c4.f7825d && this.f7613l == c0564c4.f7833m.size() - 1;
        long j22 = iVarI.f7599e;
        boolean z6 = (z5 && j22 == -9223372036854775807L) ? false : true;
        if (iVarI.d() == j21) {
            c0187m.f3362a = z6;
            return;
        }
        long jB2 = iVarI.b(jM3);
        long jC2 = iVarI.c(jM3);
        if (z5) {
            long jE2 = iVarI.e(jC2);
            z6 &= (jE2 - iVarI.f(jC2)) + jE2 >= j22;
        }
        long j23 = iVarI.f7600f;
        if (lVar != null) {
            mVar = mVar2;
            j8 = lVar.a();
            j7 = j22;
        } else {
            AbstractC0360m.i(hVar3);
            mVar = mVar2;
            j7 = j22;
            j8 = AbstractC0370w.j(hVar3.c(j5, j7) + j23, jB2, jC2);
        }
        if (j8 < jB2) {
            this.f7614m = new C0961b();
            return;
        }
        if (j8 <= jC2) {
            l0.m mVar3 = mVar;
            if (!this.f7615n || j8 < jC2) {
                if (z6 && iVarI.f(j8) >= j7) {
                    c0187m.f3362a = true;
                    return;
                }
                int iMin = (int) Math.min(this.f7609g, (jC2 - j8) + 1);
                if (j7 != -9223372036854775807L) {
                    while (iMin > 1 && iVarI.f((((long) iMin) + j8) - 1) >= j7) {
                        iMin--;
                    }
                }
                long j24 = list.isEmpty() ? j5 : -9223372036854775807L;
                C0190p c0190pD2 = this.f7611j.d();
                int iE2 = this.f7611j.e();
                Object objL2 = this.f7611j.l();
                long jF = iVarI.f(j8);
                AbstractC0360m.i(hVar3);
                long j25 = j7;
                l0.j jVarC = hVar3.C(j8 - j23);
                InterfaceC0413h interfaceC0413h = this.f7607e;
                if (c0996d == null) {
                    jVar = new y0.n(interfaceC0413h, D1.b.f(mVar3, c0563b.f7818a, jVarC, iVarI.g(j8, j17) ? 0 : 8), c0190pD2, iE2, objL2, jF, iVarI.e(j8), j8, this.f7606d, c0190pD2);
                } else {
                    int i5 = 1;
                    int i6 = 1;
                    while (true) {
                        if (i6 >= iMin) {
                            c0190p = c0190pD2;
                            break;
                        }
                        int i7 = iMin;
                        c0190p = c0190pD2;
                        AbstractC0360m.i(hVar3);
                        l0.j jVarA2 = jVarC.a(hVar3.C((((long) i6) + j8) - j23), c0563b.f7818a);
                        if (jVarA2 == null) {
                            break;
                        }
                        i5++;
                        i6++;
                        c0190pD2 = c0190p;
                        jVarC = jVarA2;
                        iMin = i7;
                    }
                    long j26 = (((long) i5) + j8) - 1;
                    long jE3 = iVarI.e(j26);
                    if (j7 == -9223372036854775807L || j25 > jE3) {
                        j9 = j17;
                        j10 = -9223372036854775807L;
                    } else {
                        j10 = j25;
                        j9 = j17;
                    }
                    C0417l c0417lF = D1.b.f(mVar3, c0563b.f7818a, jVarC, iVarI.g(j26, j9) ? 0 : 8);
                    long j27 = -mVar3.f7871n;
                    C0190p c0190p2 = c0190p;
                    if (AbstractC0156G.j(c0190p2.f3424n)) {
                        j27 += jF;
                    }
                    jVar = new y0.j(interfaceC0413h, c0417lF, c0190p2, iE2, objL2, jF, jE3, j24, j10, j8, i5, j27, iVarI.f7595a);
                }
                c0187m.f3363b = jVar;
                return;
            }
        }
        c0187m.f3362a = z6;
    }

    @Override // y0.i
    public final int f(long j5, List list) {
        return (this.f7614m != null || this.f7611j.length() < 2) ? list.size() : this.f7611j.n(j5, list);
    }

    @Override // y0.i
    public final void g(AbstractC0997e abstractC0997e) {
        if (abstractC0997e instanceof y0.k) {
            int iP = this.f7611j.p(((y0.k) abstractC0997e).f10857o);
            i[] iVarArr = this.i;
            i iVar = iVarArr[iP];
            if (iVar.f7598d == null) {
                C0996d c0996d = iVar.f7595a;
                AbstractC0360m.i(c0996d);
                E e5 = c0996d.f10852s;
                C0064k c0064k = e5 instanceof C0064k ? (C0064k) e5 : null;
                if (c0064k != null) {
                    l0.m mVar = iVar.f7596b;
                    iVarArr[iP] = new i(iVar.f7599e, mVar, iVar.f7597c, iVar.f7595a, iVar.f7600f, new N0.c(c0064k, mVar.f7871n, 3));
                }
            }
        }
        n nVar = this.f7610h;
        if (nVar != null) {
            long j5 = nVar.f7629d;
            if (j5 == -9223372036854775807L || abstractC0997e.f10861s > j5) {
                nVar.f7629d = abstractC0997e.f10861s;
            }
            nVar.f7630e.f7637r = true;
        }
    }

    public final ArrayList h() {
        List list = this.f7612k.b(this.f7613l).f7855c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.f7605c) {
            arrayList.addAll(((C0562a) list.get(i)).f7814c);
        }
        return arrayList;
    }

    public final i i(int i) {
        i[] iVarArr = this.i;
        i iVar = iVarArr[i];
        C0563b c0563bC = this.f7604b.C(iVar.f7596b.f7870m);
        if (c0563bC == null || c0563bC.equals(iVar.f7597c)) {
            return iVar;
        }
        i iVar2 = new i(iVar.f7599e, iVar.f7596b, c0563bC, iVar.f7595a, iVar.f7600f, iVar.f7598d);
        iVarArr[i] = iVar2;
        return iVar2;
    }

    @Override // y0.i
    public final void release() {
        for (i iVar : this.i) {
            C0996d c0996d = iVar.f7595a;
            if (c0996d != null) {
                c0996d.f10845l.release();
            }
        }
    }
}
