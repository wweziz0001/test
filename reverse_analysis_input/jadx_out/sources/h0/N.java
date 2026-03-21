package h0;

import a0.AbstractC0169U;
import a0.C0150A;
import a0.C0155F;
import a0.C0157H;
import a0.C0159J;
import a0.C0166Q;
import a0.C0167S;
import a0.C0168T;
import a0.C0190p;
import a0.C0196v;
import a0.InterfaceC0154E;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0362o;
import d0.C0365r;
import d0.C0366s;
import d0.C0367t;
import e3.C0396e;
import f0.C0414i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import m2.C0639F;
import m2.C0640G;
import x0.C0961b;
import x0.InterfaceC0959E;
import z0.C1063e;

/* JADX INFO: loaded from: classes.dex */
public final class N implements Handler.Callback, InterfaceC0959E, j0 {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final long f5991h0 = AbstractC0370w.Z(10000);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f5992A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0365r f5993B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C0442A f5994C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final X f5995D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final g0 f5996E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final O f5997F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final long f5998G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final i0.j f5999H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final i0.c f6000I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C0367t f6001J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public t0 f6002K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public i0 f6003L;
    public K M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f6004N;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f6006P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f6007Q;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f6009S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f6010T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f6011U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f6012V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f6013W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f6014X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f6015Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public M f6016Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public long f6017a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public long f6018b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f6019c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f6020d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public C0464o f6021e0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public r f6023g0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o0[] f6024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f6025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q0[] f6026n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean[] f6027o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final A0.z f6028p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A0.A f6029q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Q f6030r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final B0.e f6031s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0367t f6032t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0362o f6033u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Looper f6034v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0168T f6035w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0167S f6036x;
    public final long y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0396e f6037z;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f6005O = false;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public long f6022f0 = -9223372036854775807L;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public long f6008R = -9223372036854775807L;

    public N(o0[] o0VarArr, A0.z zVar, A0.A a5, Q q4, B0.e eVar, int i, boolean z4, i0.c cVar, t0 t0Var, O o4, long j5, Looper looper, C0365r c0365r, C0442A c0442a, i0.j jVar, r rVar) {
        Looper looper2;
        this.f5994C = c0442a;
        this.f6024l = o0VarArr;
        this.f6028p = zVar;
        this.f6029q = a5;
        this.f6030r = q4;
        this.f6031s = eVar;
        this.f6010T = i;
        this.f6011U = z4;
        this.f6002K = t0Var;
        this.f5997F = o4;
        this.f5998G = j5;
        boolean z5 = false;
        this.f5993B = c0365r;
        this.f5999H = jVar;
        this.f6023g0 = rVar;
        this.f6000I = cVar;
        this.y = ((C0462m) q4).f6233h;
        C0166Q c0166q = AbstractC0169U.f3260a;
        i0 i0VarI = i0.i(a5);
        this.f6003L = i0VarI;
        this.M = new K(i0VarI);
        this.f6026n = new q0[o0VarArr.length];
        this.f6027o = new boolean[o0VarArr.length];
        A0.u uVar = (A0.u) zVar;
        uVar.getClass();
        for (int i5 = 0; i5 < o0VarArr.length; i5++) {
            o0VarArr[i5].init(i5, jVar, c0365r);
            this.f6026n[i5] = o0VarArr[i5].getCapabilities();
            this.f6026n[i5].setListener(uVar);
        }
        this.f6037z = new C0396e(this, c0365r);
        this.f5992A = new ArrayList();
        this.f6025m = Collections.newSetFromMap(new IdentityHashMap());
        this.f6035w = new C0168T();
        this.f6036x = new C0167S();
        zVar.f166a = this;
        zVar.f167b = eVar;
        this.f6020d0 = true;
        C0367t c0367tA = c0365r.a(looper, null);
        this.f6001J = c0367tA;
        this.f5995D = new X(cVar, c0367tA, new I2.g(this, 12), rVar);
        this.f5996E = new g0(this, cVar, c0367tA, jVar);
        C0362o c0362o = new C0362o();
        this.f6033u = c0362o;
        synchronized (c0362o.f5309o) {
            try {
                if (((Looper) c0362o.f5307m) == null) {
                    if (c0362o.f5306l == 0 && ((HandlerThread) c0362o.f5308n) == null) {
                        z5 = true;
                    }
                    AbstractC0360m.h(z5);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    c0362o.f5308n = handlerThread;
                    handlerThread.start();
                    c0362o.f5307m = ((HandlerThread) c0362o.f5308n).getLooper();
                }
                c0362o.f5306l++;
                looper2 = (Looper) c0362o.f5307m;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f6034v = looper2;
        this.f6032t = c0365r.a(looper2, this);
    }

    public static Pair J(AbstractC0169U abstractC0169U, M m4, boolean z4, int i, boolean z5, C0168T c0168t, C0167S c0167s) {
        Pair pairI;
        int iK;
        AbstractC0169U abstractC0169U2 = m4.f5988a;
        if (abstractC0169U.p()) {
            return null;
        }
        AbstractC0169U abstractC0169U3 = abstractC0169U2.p() ? abstractC0169U : abstractC0169U2;
        try {
            pairI = abstractC0169U3.i(c0168t, c0167s, m4.f5989b, m4.f5990c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (abstractC0169U.equals(abstractC0169U3)) {
            return pairI;
        }
        if (abstractC0169U.b(pairI.first) != -1) {
            return (abstractC0169U3.g(pairI.first, c0167s).f3241f && abstractC0169U3.m(c0167s.f3238c, c0168t, 0L).f3257n == abstractC0169U3.b(pairI.first)) ? abstractC0169U.i(c0168t, c0167s, abstractC0169U.g(pairI.first, c0167s).f3238c, m4.f5990c) : pairI;
        }
        if (z4 && (iK = K(c0168t, c0167s, i, z5, pairI.first, abstractC0169U3, abstractC0169U)) != -1) {
            return abstractC0169U.i(c0168t, c0167s, iK, -9223372036854775807L);
        }
        return null;
    }

    public static int K(C0168T c0168t, C0167S c0167s, int i, boolean z4, Object obj, AbstractC0169U abstractC0169U, AbstractC0169U abstractC0169U2) {
        Object obj2 = abstractC0169U.m(abstractC0169U.g(obj, c0167s).f3238c, c0168t, 0L).f3245a;
        for (int i5 = 0; i5 < abstractC0169U2.o(); i5++) {
            if (abstractC0169U2.m(i5, c0168t, 0L).f3245a.equals(obj2)) {
                return i5;
            }
        }
        int iB = abstractC0169U.b(obj);
        int iH = abstractC0169U.h();
        int iD = iB;
        int iB2 = -1;
        for (int i6 = 0; i6 < iH && iB2 == -1; i6++) {
            iD = abstractC0169U.d(iD, c0167s, c0168t, i, z4);
            if (iD == -1) {
                break;
            }
            iB2 = abstractC0169U2.b(abstractC0169U.l(iD));
        }
        if (iB2 == -1) {
            return -1;
        }
        return abstractC0169U2.f(iB2, c0167s, false).f3238c;
    }

    public static void R(o0 o0Var, long j5) {
        o0Var.setCurrentStreamFinal();
        if (o0Var instanceof C1063e) {
            C1063e c1063e = (C1063e) o0Var;
            AbstractC0360m.h(c1063e.y);
            c1063e.f11139U = j5;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, x0.F, x0.h0] */
    public static boolean r(V v4) {
        if (v4 == null) {
            return false;
        }
        try {
            ?? r12 = v4.f6047a;
            if (v4.f6051e) {
                for (x0.f0 f0Var : v4.f6049c) {
                    if (f0Var != null) {
                        f0Var.a();
                    }
                }
            } else {
                r12.l();
            }
            return (!v4.f6051e ? 0L : r12.r()) != Long.MIN_VALUE;
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean s(o0 o0Var) {
        return o0Var.getState() != 0;
    }

    public final void A(J j5) throws Throwable {
        AbstractC0169U abstractC0169UB;
        this.M.c(1);
        int i = j5.f5973a;
        g0 g0Var = this.f5996E;
        g0Var.getClass();
        ArrayList arrayList = g0Var.f6136b;
        int i5 = j5.f5974b;
        int i6 = j5.f5975c;
        AbstractC0360m.c(i >= 0 && i <= i5 && i5 <= arrayList.size() && i6 >= 0);
        g0Var.f6143j = j5.f5976d;
        if (i == i5 || i == i6) {
            abstractC0169UB = g0Var.b();
        } else {
            int iMin = Math.min(i, i6);
            int iMax = Math.max(((i5 - i) + i6) - 1, i5 - 1);
            int iO = ((f0) arrayList.get(iMin)).f6125d;
            AbstractC0370w.L(arrayList, i, i5, i6);
            while (iMin <= iMax) {
                f0 f0Var = (f0) arrayList.get(iMin);
                f0Var.f6125d = iO;
                iO += f0Var.f6122a.f10530z.f10811b.o();
                iMin++;
            }
            abstractC0169UB = g0Var.b();
        }
        n(abstractC0169UB, false);
    }

    public final void B() {
        this.M.c(1);
        int i = 0;
        F(false, false, false, true);
        C0462m c0462m = (C0462m) this.f6030r;
        c0462m.getClass();
        long id = Thread.currentThread().getId();
        long j5 = c0462m.f6234j;
        AbstractC0360m.g("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j5 == -1 || j5 == id);
        c0462m.f6234j = id;
        HashMap map = c0462m.i;
        i0.j jVar = this.f5999H;
        if (!map.containsKey(jVar)) {
            map.put(jVar, new C0461l());
        }
        C0461l c0461l = (C0461l) map.get(jVar);
        c0461l.getClass();
        int i5 = c0462m.f6231f;
        if (i5 == -1) {
            i5 = 13107200;
        }
        c0461l.f6217b = i5;
        c0461l.f6216a = false;
        b0(this.f6003L.f6174a.p() ? 4 : 2);
        B0.i iVar = (B0.i) this.f6031s;
        iVar.getClass();
        g0 g0Var = this.f5996E;
        AbstractC0360m.h(!g0Var.f6144k);
        g0Var.f6145l = iVar;
        while (true) {
            ArrayList arrayList = g0Var.f6136b;
            if (i >= arrayList.size()) {
                g0Var.f6144k = true;
                this.f6032t.e(2);
                return;
            } else {
                f0 f0Var = (f0) arrayList.get(i);
                g0Var.e(f0Var);
                g0Var.f6141g.add(f0Var);
                i++;
            }
        }
    }

    public final void C() {
        int i = 0;
        try {
            F(true, false, true, false);
            while (true) {
                o0[] o0VarArr = this.f6024l;
                if (i >= o0VarArr.length) {
                    break;
                }
                this.f6026n[i].clearListener();
                o0VarArr[i].release();
                i++;
            }
            Q q4 = this.f6030r;
            C0462m c0462m = (C0462m) q4;
            if (c0462m.i.remove(this.f5999H) != null) {
                c0462m.d();
            }
            if (c0462m.i.isEmpty()) {
                c0462m.f6234j = -1L;
            }
            b0(1);
            this.f6033u.g();
            synchronized (this) {
                this.f6004N = true;
                notifyAll();
            }
        } catch (Throwable th) {
            this.f6033u.g();
            synchronized (this) {
                this.f6004N = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void D(int i, int i5, x0.j0 j0Var) throws Throwable {
        this.M.c(1);
        g0 g0Var = this.f5996E;
        g0Var.getClass();
        AbstractC0360m.c(i >= 0 && i <= i5 && i5 <= g0Var.f6136b.size());
        g0Var.f6143j = j0Var;
        g0Var.g(i, i5);
        n(g0Var.b(), false);
    }

    public final void E() throws C0464o {
        float f2 = this.f6037z.d().f3220a;
        X x4 = this.f5995D;
        V v4 = x4.i;
        V v5 = x4.f6078j;
        A0.A a5 = null;
        V v6 = v4;
        boolean z4 = true;
        while (v6 != null && v6.f6051e) {
            i0 i0Var = this.f6003L;
            A0.A aJ = v6.j(f2, i0Var.f6174a, i0Var.f6184l);
            A0.A a6 = v6 == this.f5995D.i ? aJ : a5;
            A0.A a7 = v6.f6060o;
            if (a7 != null) {
                int length = a7.f42c.length;
                A0.w[] wVarArr = aJ.f42c;
                if (length == wVarArr.length) {
                    for (int i = 0; i < wVarArr.length; i++) {
                        if (aJ.a(a7, i)) {
                        }
                    }
                    if (v6 == v5) {
                        z4 = false;
                    }
                    v6 = v6.f6058m;
                    a5 = a6;
                }
            }
            if (z4) {
                X x5 = this.f5995D;
                V v7 = x5.i;
                boolean zL = x5.l(v7);
                boolean[] zArr = new boolean[this.f6024l.length];
                a6.getClass();
                long jA = v7.a(a6, this.f6003L.f6191s, zL, zArr);
                i0 i0Var2 = this.f6003L;
                boolean z5 = (i0Var2.f6178e == 4 || jA == i0Var2.f6191s) ? false : true;
                i0 i0Var3 = this.f6003L;
                this.f6003L = q(i0Var3.f6175b, jA, i0Var3.f6176c, i0Var3.f6177d, z5, 5);
                if (z5) {
                    H(jA);
                }
                boolean[] zArr2 = new boolean[this.f6024l.length];
                int i5 = 0;
                while (true) {
                    o0[] o0VarArr = this.f6024l;
                    if (i5 >= o0VarArr.length) {
                        break;
                    }
                    o0 o0Var = o0VarArr[i5];
                    boolean zS = s(o0Var);
                    zArr2[i5] = zS;
                    x0.f0 f0Var = v7.f6049c[i5];
                    if (zS) {
                        if (f0Var != o0Var.getStream()) {
                            c(i5);
                        } else if (zArr[i5]) {
                            o0Var.resetPosition(this.f6017a0);
                        }
                    }
                    i5++;
                }
                f(zArr2, this.f6017a0);
            } else {
                this.f5995D.l(v6);
                if (v6.f6051e) {
                    v6.a(aJ, Math.max(v6.f6053g.f6063b, this.f6017a0 - v6.f6061p), false, new boolean[v6.f6055j.length]);
                }
            }
            m(true);
            if (this.f6003L.f6178e != 4) {
                u();
                k0();
                this.f6032t.e(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf A[PHI: r5 r6 r8
      0x00bf: PHI (r5v5 x0.H) = (r5v4 x0.H), (r5v13 x0.H) binds: [B:34:0x0093, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r6v2 long) = (r6v1 long), (r6v22 long) binds: [B:34:0x0093, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00bf: PHI (r8v2 long) = (r8v1 long), (r8v15 long) binds: [B:34:0x0093, B:36:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.N.F(boolean, boolean, boolean, boolean):void");
    }

    public final void G() {
        V v4 = this.f5995D.i;
        this.f6006P = v4 != null && v4.f6053g.f6069h && this.f6005O;
    }

    public final void H(long j5) {
        V v4 = this.f5995D.i;
        long j6 = j5 + (v4 == null ? 1000000000000L : v4.f6061p);
        this.f6017a0 = j6;
        ((u0) this.f6037z.f5631n).b(j6);
        for (o0 o0Var : this.f6024l) {
            if (s(o0Var)) {
                o0Var.resetPosition(this.f6017a0);
            }
        }
        for (V v5 = r0.i; v5 != null; v5 = v5.f6058m) {
            for (A0.w wVar : v5.f6060o.f42c) {
                if (wVar != null) {
                    wVar.m();
                }
            }
        }
    }

    public final void I(AbstractC0169U abstractC0169U, AbstractC0169U abstractC0169U2) {
        if (abstractC0169U.p() && abstractC0169U2.p()) {
            return;
        }
        ArrayList arrayList = this.f5992A;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            AbstractC0307a.q(arrayList.get(size));
            throw null;
        }
    }

    public final void L(long j5) {
        this.f6032t.f5321a.sendEmptyMessageAtTime(2, j5 + ((this.f6003L.f6178e != 3 || c0()) ? f5991h0 : 1000L));
    }

    public final void M(boolean z4) throws C0464o {
        x0.H h2 = this.f5995D.i.f6053g.f6062a;
        long jO = O(h2, this.f6003L.f6191s, true, false);
        if (jO != this.f6003L.f6191s) {
            i0 i0Var = this.f6003L;
            this.f6003L = q(h2, jO, i0Var.f6176c, i0Var.f6177d, z4, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, x0.F] */
    public final void N(M m4) throws Throwable {
        long j5;
        long j6;
        boolean z4;
        x0.H h2;
        long j7;
        long j8;
        long j9;
        i0 i0Var;
        int i;
        this.M.c(1);
        Pair pairJ = J(this.f6003L.f6174a, m4, true, this.f6010T, this.f6011U, this.f6035w, this.f6036x);
        if (pairJ == null) {
            Pair pairI = i(this.f6003L.f6174a);
            h2 = (x0.H) pairI.first;
            long jLongValue = ((Long) pairI.second).longValue();
            z4 = !this.f6003L.f6174a.p();
            j5 = jLongValue;
            j6 = -9223372036854775807L;
        } else {
            Object obj = pairJ.first;
            long jLongValue2 = ((Long) pairJ.second).longValue();
            long j10 = m4.f5990c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            x0.H hN = this.f5995D.n(this.f6003L.f6174a, obj, jLongValue2);
            if (hN.b()) {
                this.f6003L.f6174a.g(hN.f10531a, this.f6036x);
                if (this.f6036x.e(hN.f10532b) == hN.f10533c) {
                    this.f6036x.f3242g.getClass();
                }
                j5 = 0;
                j6 = j10;
                h2 = hN;
                z4 = true;
            } else {
                j5 = jLongValue2;
                j6 = j10;
                z4 = m4.f5990c == -9223372036854775807L;
                h2 = hN;
            }
        }
        try {
            if (this.f6003L.f6174a.p()) {
                this.f6016Z = m4;
            } else {
                if (pairJ != null) {
                    if (h2.equals(this.f6003L.f6175b)) {
                        V v4 = this.f5995D.i;
                        long jB = (v4 == null || !v4.f6051e || j5 == 0) ? j5 : v4.f6047a.b(j5, this.f6002K);
                        if (AbstractC0370w.Z(jB) == AbstractC0370w.Z(this.f6003L.f6191s) && ((i = (i0Var = this.f6003L).f6178e) == 2 || i == 3)) {
                            long j11 = i0Var.f6191s;
                            this.f6003L = q(h2, j11, j6, j11, z4, 2);
                            return;
                        }
                        j8 = jB;
                    } else {
                        j8 = j5;
                    }
                    boolean z5 = this.f6003L.f6178e == 4;
                    X x4 = this.f5995D;
                    long jO = O(h2, j8, x4.i != x4.f6078j, z5);
                    z4 |= j5 != jO;
                    try {
                        i0 i0Var2 = this.f6003L;
                        AbstractC0169U abstractC0169U = i0Var2.f6174a;
                        l0(abstractC0169U, h2, abstractC0169U, i0Var2.f6175b, j6, true);
                        j9 = jO;
                        this.f6003L = q(h2, j9, j6, j9, z4, 2);
                    } catch (Throwable th) {
                        th = th;
                        j7 = jO;
                        this.f6003L = q(h2, j7, j6, j7, z4, 2);
                        throw th;
                    }
                }
                if (this.f6003L.f6178e != 1) {
                    b0(4);
                }
                F(false, true, false, true);
            }
            j9 = j5;
            this.f6003L = q(h2, j9, j6, j9, z4, 2);
        } catch (Throwable th2) {
            th = th2;
            j7 = j5;
        }
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, x0.F] */
    public final long O(x0.H h2, long j5, boolean z4, boolean z5) throws C0464o {
        o0[] o0VarArr;
        g0();
        m0(false, true);
        if (z5 || this.f6003L.f6178e == 3) {
            b0(2);
        }
        X x4 = this.f5995D;
        V v4 = x4.i;
        V v5 = v4;
        while (v5 != null && !h2.equals(v5.f6053g.f6062a)) {
            v5 = v5.f6058m;
        }
        if (z4 || v4 != v5 || (v5 != null && v5.f6061p + j5 < 0)) {
            int i = 0;
            while (true) {
                o0VarArr = this.f6024l;
                if (i >= o0VarArr.length) {
                    break;
                }
                c(i);
                i++;
            }
            if (v5 != null) {
                while (x4.i != v5) {
                    x4.a();
                }
                x4.l(v5);
                v5.f6061p = 1000000000000L;
                f(new boolean[o0VarArr.length], x4.f6078j.e());
            }
        }
        if (v5 != null) {
            x4.l(v5);
            if (!v5.f6051e) {
                v5.f6053g = v5.f6053g.b(j5);
            } else if (v5.f6052f) {
                ?? r9 = v5.f6047a;
                j5 = r9.o(j5);
                r9.p(j5 - this.y);
            }
            H(j5);
            u();
        } else {
            x4.b();
            H(j5);
        }
        m(false);
        this.f6032t.e(2);
        return j5;
    }

    public final void P(l0 l0Var) {
        Looper looper = l0Var.f6223f;
        Looper looper2 = this.f6034v;
        C0367t c0367t = this.f6032t;
        if (looper != looper2) {
            c0367t.a(15, l0Var).b();
            return;
        }
        synchronized (l0Var) {
        }
        try {
            l0Var.f6218a.handleMessage(l0Var.f6221d, l0Var.f6222e);
            l0Var.b(true);
            int i = this.f6003L.f6178e;
            if (i == 3 || i == 2) {
                c0367t.e(2);
            }
        } catch (Throwable th) {
            l0Var.b(true);
            throw th;
        }
    }

    public final void Q(l0 l0Var) {
        Looper looper = l0Var.f6223f;
        if (looper.getThread().isAlive()) {
            this.f5993B.a(looper, null).c(new D0.y(this, 15, l0Var));
        } else {
            AbstractC0360m.y("TAG", "Trying to send message on a dead thread.");
            l0Var.b(false);
        }
    }

    public final void S(boolean z4, AtomicBoolean atomicBoolean) {
        if (this.f6012V != z4) {
            this.f6012V = z4;
            if (!z4) {
                for (o0 o0Var : this.f6024l) {
                    if (!s(o0Var) && this.f6025m.remove(o0Var)) {
                        o0Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void T(I i) throws Throwable {
        this.M.c(1);
        int i5 = i.f5971c;
        ArrayList arrayList = i.f5969a;
        x0.j0 j0Var = i.f5970b;
        if (i5 != -1) {
            this.f6016Z = new M(new n0(arrayList, j0Var), i.f5971c, i.f5972d);
        }
        g0 g0Var = this.f5996E;
        ArrayList arrayList2 = g0Var.f6136b;
        g0Var.g(0, arrayList2.size());
        n(g0Var.a(arrayList2.size(), arrayList, j0Var), false);
    }

    public final void U(boolean z4) throws C0464o {
        this.f6005O = z4;
        G();
        if (this.f6006P) {
            X x4 = this.f5995D;
            if (x4.f6078j != x4.i) {
                M(true);
                m(false);
            }
        }
    }

    public final void V(int i, int i5, boolean z4, boolean z5) {
        this.M.c(z5 ? 1 : 0);
        this.f6003L = this.f6003L.d(i5, i, z4);
        m0(false, false);
        for (V v4 = this.f5995D.i; v4 != null; v4 = v4.f6058m) {
            for (A0.w wVar : v4.f6060o.f42c) {
                if (wVar != null) {
                    wVar.c(z4);
                }
            }
        }
        if (!c0()) {
            g0();
            k0();
            return;
        }
        int i6 = this.f6003L.f6178e;
        C0367t c0367t = this.f6032t;
        if (i6 != 3) {
            if (i6 == 2) {
                c0367t.e(2);
            }
        } else {
            C0396e c0396e = this.f6037z;
            c0396e.f5630m = true;
            ((u0) c0396e.f5631n).c();
            e0();
            c0367t.e(2);
        }
    }

    public final void W(C0159J c0159j) {
        this.f6032t.d(16);
        C0396e c0396e = this.f6037z;
        c0396e.a(c0159j);
        C0159J c0159jD = c0396e.d();
        p(c0159jD, c0159jD.f3220a, true, true);
    }

    public final void X(r rVar) {
        this.f6023g0 = rVar;
        AbstractC0169U abstractC0169U = this.f6003L.f6174a;
        X x4 = this.f5995D;
        x4.getClass();
        rVar.getClass();
        if (x4.f6084p.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < x4.f6084p.size(); i++) {
            ((V) x4.f6084p.get(i)).i();
        }
        x4.f6084p = arrayList;
        x4.f6080l = null;
        x4.j();
    }

    public final void Y(int i) throws C0464o {
        this.f6010T = i;
        AbstractC0169U abstractC0169U = this.f6003L.f6174a;
        X x4 = this.f5995D;
        x4.f6076g = i;
        if (!x4.p(abstractC0169U)) {
            M(true);
        }
        m(false);
    }

    public final void Z(boolean z4) throws C0464o {
        this.f6011U = z4;
        AbstractC0169U abstractC0169U = this.f6003L.f6174a;
        X x4 = this.f5995D;
        x4.f6077h = z4;
        if (!x4.p(abstractC0169U)) {
            M(true);
        }
        m(false);
    }

    @Override // x0.InterfaceC0959E
    public final void a(x0.F f2) {
        this.f6032t.a(8, f2).b();
    }

    public final void a0(x0.j0 j0Var) throws Throwable {
        this.M.c(1);
        g0 g0Var = this.f5996E;
        int size = g0Var.f6136b.size();
        x0.i0 i0Var = (x0.i0) j0Var;
        if (i0Var.f10721b.length != size) {
            j0Var = i0Var.a().b(0, size);
        }
        g0Var.f6143j = j0Var;
        n(g0Var.b(), false);
    }

    public final void b(I i, int i5) throws Throwable {
        this.M.c(1);
        g0 g0Var = this.f5996E;
        if (i5 == -1) {
            i5 = g0Var.f6136b.size();
        }
        n(g0Var.a(i5, i.f5969a, i.f5970b), false);
    }

    public final void b0(int i) {
        i0 i0Var = this.f6003L;
        if (i0Var.f6178e != i) {
            if (i != 2) {
                this.f6022f0 = -9223372036854775807L;
            }
            this.f6003L = i0Var.g(i);
        }
    }

    public final void c(int i) {
        o0 o0Var = this.f6024l[i];
        if (s(o0Var)) {
            y(i, false);
            C0396e c0396e = this.f6037z;
            if (o0Var == ((o0) c0396e.f5633p)) {
                c0396e.f5634q = null;
                c0396e.f5633p = null;
                c0396e.f5629l = true;
            }
            if (o0Var.getState() == 2) {
                o0Var.stop();
            }
            o0Var.disable();
            this.f6015Y--;
        }
    }

    public final boolean c0() {
        i0 i0Var = this.f6003L;
        return i0Var.f6184l && i0Var.f6186n == 0;
    }

    @Override // x0.g0
    public final void d(x0.h0 h0Var) {
        this.f6032t.a(9, (x0.F) h0Var).b();
    }

    public final boolean d0(AbstractC0169U abstractC0169U, x0.H h2) {
        if (h2.b() || abstractC0169U.p()) {
            return false;
        }
        int i = abstractC0169U.g(h2.f10531a, this.f6036x).f3238c;
        C0168T c0168t = this.f6035w;
        abstractC0169U.n(i, c0168t);
        return c0168t.a() && c0168t.i && c0168t.f3250f != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x038e A[EDGE_INSN: B:468:0x038e->B:206:0x038e BREAK  A[LOOP:0: B:172:0x0310->B:205:0x038b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0194  */
    /* JADX WARN: Type inference failed for: r0v61, types: [A0.A] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, x0.F] */
    /* JADX WARN: Type inference failed for: r1v85, types: [java.lang.Object, x0.F] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54, types: [int] */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, x0.F] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object, x0.F] */
    /* JADX WARN: Type inference failed for: r3v77, types: [A0.w[]] */
    /* JADX WARN: Type inference failed for: r3v78, types: [A0.w] */
    /* JADX WARN: Type inference failed for: r3v89, types: [java.lang.Object, x0.h0] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47, types: [int] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [int] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32, types: [int] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47, types: [int] */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v56 */
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
    public final void e() throws h0.C0464o {
        /*
            Method dump skipped, instruction units count: 1945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.N.e():void");
    }

    public final void e0() {
        V v4 = this.f5995D.i;
        if (v4 == null) {
            return;
        }
        A0.A a5 = v4.f6060o;
        int i = 0;
        while (true) {
            o0[] o0VarArr = this.f6024l;
            if (i >= o0VarArr.length) {
                return;
            }
            if (a5.b(i) && o0VarArr[i].getState() == 1) {
                o0VarArr[i].start();
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean[] r28, long r29) throws h0.C0464o {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.N.f(boolean[], long):void");
    }

    public final void f0(boolean z4, boolean z5) {
        F(z4 || !this.f6012V, false, true, false);
        this.M.c(z5 ? 1 : 0);
        C0462m c0462m = (C0462m) this.f6030r;
        if (c0462m.i.remove(this.f5999H) != null) {
            c0462m.d();
        }
        b0(1);
    }

    public final long g(AbstractC0169U abstractC0169U, Object obj, long j5) {
        C0167S c0167s = this.f6036x;
        int i = abstractC0169U.g(obj, c0167s).f3238c;
        C0168T c0168t = this.f6035w;
        abstractC0169U.n(i, c0168t);
        if (c0168t.f3250f != -9223372036854775807L && c0168t.a() && c0168t.i) {
            return AbstractC0370w.M(AbstractC0370w.y(c0168t.f3251g) - c0168t.f3250f) - (j5 + c0167s.f3240e);
        }
        return -9223372036854775807L;
    }

    public final void g0() {
        C0396e c0396e = this.f6037z;
        c0396e.f5630m = false;
        u0 u0Var = (u0) c0396e.f5631n;
        if (u0Var.f6286m) {
            u0Var.b(u0Var.h());
            u0Var.f6286m = false;
        }
        for (o0 o0Var : this.f6024l) {
            if (s(o0Var) && o0Var.getState() == 2) {
                o0Var.stop();
            }
        }
    }

    public final long h() {
        V v4 = this.f5995D.f6078j;
        if (v4 == null) {
            return 0L;
        }
        long jMax = v4.f6061p;
        if (!v4.f6051e) {
            return jMax;
        }
        int i = 0;
        while (true) {
            o0[] o0VarArr = this.f6024l;
            if (i >= o0VarArr.length) {
                return jMax;
            }
            if (s(o0VarArr[i]) && o0VarArr[i].getStream() == v4.f6049c[i]) {
                long readingPositionUs = o0VarArr[i].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(readingPositionUs, jMax);
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, x0.h0] */
    public final void h0() {
        V v4 = this.f5995D.f6079k;
        boolean z4 = this.f6009S || (v4 != null && v4.f6047a.c());
        i0 i0Var = this.f6003L;
        if (z4 != i0Var.f6180g) {
            this.f6003L = new i0(i0Var.f6174a, i0Var.f6175b, i0Var.f6176c, i0Var.f6177d, i0Var.f6178e, i0Var.f6179f, z4, i0Var.f6181h, i0Var.i, i0Var.f6182j, i0Var.f6183k, i0Var.f6184l, i0Var.f6185m, i0Var.f6186n, i0Var.f6187o, i0Var.f6189q, i0Var.f6190r, i0Var.f6191s, i0Var.f6192t, i0Var.f6188p);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        X x4;
        boolean z4;
        V v4;
        int i;
        V v5;
        int i5;
        try {
            switch (message.what) {
                case 1:
                    boolean z5 = message.arg1 != 0;
                    int i6 = message.arg2;
                    V(i6 >> 4, i6 & 15, z5, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    N((M) message.obj);
                    break;
                case 4:
                    W((C0159J) message.obj);
                    break;
                case 5:
                    this.f6002K = (t0) message.obj;
                    break;
                case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    f0(false, true);
                    break;
                case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    C();
                    return true;
                case O.j.BYTES_FIELD_NUMBER /* 8 */:
                    o((x0.F) message.obj);
                    break;
                case 9:
                    k((x0.F) message.obj);
                    break;
                case 10:
                    E();
                    break;
                case 11:
                    Y(message.arg1);
                    break;
                case 12:
                    Z(message.arg1 != 0);
                    break;
                case 13:
                    S(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    l0 l0Var = (l0) message.obj;
                    l0Var.getClass();
                    P(l0Var);
                    break;
                case 15:
                    Q((l0) message.obj);
                    break;
                case 16:
                    C0159J c0159j = (C0159J) message.obj;
                    p(c0159j, c0159j.f3220a, true, false);
                    break;
                case 17:
                    T((I) message.obj);
                    break;
                case 18:
                    b((I) message.obj, message.arg1);
                    break;
                case 19:
                    A((J) message.obj);
                    break;
                case 20:
                    D(message.arg1, message.arg2, (x0.j0) message.obj);
                    break;
                case 21:
                    a0((x0.j0) message.obj);
                    break;
                case 22:
                    z();
                    break;
                case 23:
                    U(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    E();
                    M(true);
                    break;
                case 26:
                    E();
                    M(true);
                    break;
                case 27:
                    j0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    X((r) message.obj);
                    break;
                case 29:
                    B();
                    break;
            }
        } catch (C0157H e5) {
            boolean z6 = e5.f3215l;
            int i7 = e5.f3216m;
            if (i7 == 1) {
                i5 = z6 ? 3001 : 3003;
            } else {
                if (i7 == 4) {
                    i5 = z6 ? 3002 : 3004;
                }
                l(e5, i);
            }
            i = i5;
            l(e5, i);
        } catch (C0414i e6) {
            l(e6, e6.f5673l);
        } catch (C0464o e7) {
            C0464o c0464o = e7;
            int i8 = c0464o.f6245n;
            X x5 = this.f5995D;
            if (i8 != 1 || (v5 = x5.f6078j) == null) {
                x4 = x5;
            } else {
                x4 = x5;
                c0464o = new C0464o(c0464o.getMessage(), c0464o.getCause(), c0464o.f3217l, c0464o.f6245n, c0464o.f6246o, c0464o.f6247p, c0464o.f6248q, c0464o.f6249r, v5.f6053g.f6062a, c0464o.f3218m, c0464o.f6251t);
            }
            if (c0464o.f6251t && (this.f6021e0 == null || (i = c0464o.f3217l) == 5004 || i == 5003)) {
                AbstractC0360m.z("ExoPlayerImplInternal", "Recoverable renderer error", c0464o);
                C0464o c0464o2 = this.f6021e0;
                if (c0464o2 != null) {
                    c0464o2.addSuppressed(c0464o);
                    c0464o = this.f6021e0;
                } else {
                    this.f6021e0 = c0464o;
                }
                C0367t c0367t = this.f6032t;
                C0366s c0366sA = c0367t.a(25, c0464o);
                c0367t.getClass();
                Message message2 = c0366sA.f5319a;
                message2.getClass();
                c0367t.f5321a.sendMessageAtFrontOfQueue(message2);
                c0366sA.a();
                z4 = true;
            } else {
                C0464o c0464o3 = this.f6021e0;
                if (c0464o3 != null) {
                    c0464o3.addSuppressed(c0464o);
                    c0464o = this.f6021e0;
                }
                C0464o c0464o4 = c0464o;
                AbstractC0360m.m("ExoPlayerImplInternal", "Playback error", c0464o4);
                if (c0464o4.f6245n == 1) {
                    X x6 = x4;
                    if (x6.i != x6.f6078j) {
                        while (true) {
                            v4 = x6.i;
                            if (v4 == x6.f6078j) {
                                break;
                            }
                            x6.a();
                        }
                        v4.getClass();
                        w();
                        W w4 = v4.f6053g;
                        x0.H h2 = w4.f6062a;
                        long j5 = w4.f6063b;
                        this.f6003L = q(h2, j5, w4.f6064c, j5, true, 0);
                    }
                    z4 = true;
                } else {
                    z4 = true;
                }
                f0(z4, false);
                this.f6003L = this.f6003L.e(c0464o4);
            }
        } catch (RuntimeException e8) {
            C0464o c0464o5 = new C0464o(2, e8, ((e8 instanceof IllegalStateException) || (e8 instanceof IllegalArgumentException)) ? 1004 : 1000);
            AbstractC0360m.m("ExoPlayerImplInternal", "Playback error", c0464o5);
            f0(true, false);
            this.f6003L = this.f6003L.e(c0464o5);
        } catch (m0.c e9) {
            l(e9, e9.f8494l);
        } catch (C0961b e10) {
            l(e10, 1002);
        } catch (IOException e11) {
            l(e11, 2000);
        }
        z4 = true;
        w();
        return z4;
    }

    public final Pair i(AbstractC0169U abstractC0169U) {
        long j5 = 0;
        if (abstractC0169U.p()) {
            return Pair.create(i0.f6173u, 0L);
        }
        Pair pairI = abstractC0169U.i(this.f6035w, this.f6036x, abstractC0169U.a(this.f6011U), -9223372036854775807L);
        x0.H hN = this.f5995D.n(abstractC0169U, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (hN.b()) {
            Object obj = hN.f10531a;
            C0167S c0167s = this.f6036x;
            abstractC0169U.g(obj, c0167s);
            if (hN.f10533c == c0167s.e(hN.f10532b)) {
                c0167s.f3242g.getClass();
            }
        } else {
            j5 = jLongValue;
        }
        return Pair.create(hN, Long.valueOf(j5));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void i0(A0.A a5) {
        V v4 = this.f5995D.f6079k;
        v4.getClass();
        j(v4.d());
        if (d0(this.f6003L.f6174a, v4.f6053g.f6062a)) {
            long j5 = ((C0460k) this.f5997F).f6209m;
        }
        AbstractC0169U abstractC0169U = this.f6003L.f6174a;
        float f2 = this.f6037z.d().f3220a;
        boolean z4 = this.f6003L.f6184l;
        A0.w[] wVarArr = a5.f42c;
        C0462m c0462m = (C0462m) this.f6030r;
        C0461l c0461l = (C0461l) c0462m.i.get(this.f5999H);
        c0461l.getClass();
        int iMax = c0462m.f6231f;
        if (iMax == -1) {
            int length = wVarArr.length;
            int i = 0;
            int i5 = 0;
            while (true) {
                int i6 = 13107200;
                if (i < length) {
                    A0.w wVar = wVarArr[i];
                    if (wVar != null) {
                        switch (wVar.b().f3263c) {
                            case -2:
                                i6 = 0;
                                i5 += i6;
                                break;
                            case androidx.media.A.RESULT_ERROR /* -1 */:
                            case 1:
                                i5 += i6;
                                break;
                            case 0:
                                i6 = 144310272;
                                i5 += i6;
                                break;
                            case 2:
                                i6 = 131072000;
                                i5 += i6;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                i6 = 131072;
                                i5 += i6;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i5);
                }
            }
        }
        c0461l.f6217b = iMax;
        c0462m.d();
    }

    public final long j(long j5) {
        V v4 = this.f5995D.f6079k;
        if (v4 == null) {
            return 0L;
        }
        return Math.max(0L, j5 - (this.f6017a0 - v4.f6061p));
    }

    public final void j0(int i, int i5, List list) throws Throwable {
        this.M.c(1);
        g0 g0Var = this.f5996E;
        g0Var.getClass();
        ArrayList arrayList = g0Var.f6136b;
        AbstractC0360m.c(i >= 0 && i <= i5 && i5 <= arrayList.size());
        AbstractC0360m.c(list.size() == i5 - i);
        for (int i6 = i; i6 < i5; i6++) {
            ((f0) arrayList.get(i6)).f6122a.b((C0150A) list.get(i6 - i));
        }
        n(g0Var.b(), false);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, x0.h0] */
    public final void k(x0.F f2) {
        X x4 = this.f5995D;
        V v4 = x4.f6079k;
        if (v4 == null || v4.f6047a != f2) {
            V v5 = x4.f6080l;
            if (v5 == null || v5.f6047a != f2) {
                return;
            }
            v();
            return;
        }
        long j5 = this.f6017a0;
        if (v4 != null) {
            AbstractC0360m.h(v4.f6058m == null);
            if (v4.f6051e) {
                v4.f6047a.u(j5 - v4.f6061p);
            }
        }
        u();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, x0.F] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0() {
        /*
            Method dump skipped, instruction units count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.N.k0():void");
    }

    public final void l(IOException iOException, int i) {
        C0464o c0464o = new C0464o(0, iOException, i);
        V v4 = this.f5995D.i;
        if (v4 != null) {
            W w4 = v4.f6053g;
            c0464o = new C0464o(c0464o.getMessage(), c0464o.getCause(), c0464o.f3217l, c0464o.f6245n, c0464o.f6246o, c0464o.f6247p, c0464o.f6248q, c0464o.f6249r, w4.f6062a, c0464o.f3218m, c0464o.f6251t);
        }
        AbstractC0360m.m("ExoPlayerImplInternal", "Playback error", c0464o);
        f0(false, false);
        this.f6003L = this.f6003L.e(c0464o);
    }

    public final void l0(AbstractC0169U abstractC0169U, x0.H h2, AbstractC0169U abstractC0169U2, x0.H h5, long j5, boolean z4) {
        if (!d0(abstractC0169U, h2)) {
            C0159J c0159j = h2.b() ? C0159J.f3219d : this.f6003L.f6187o;
            C0396e c0396e = this.f6037z;
            if (c0396e.d().equals(c0159j)) {
                return;
            }
            this.f6032t.d(16);
            c0396e.a(c0159j);
            p(this.f6003L.f6187o, c0159j.f3220a, false, false);
            return;
        }
        Object obj = h2.f10531a;
        C0167S c0167s = this.f6036x;
        int i = abstractC0169U.g(obj, c0167s).f3238c;
        C0168T c0168t = this.f6035w;
        abstractC0169U.n(i, c0168t);
        C0196v c0196v = c0168t.f3253j;
        C0460k c0460k = (C0460k) this.f5997F;
        c0460k.getClass();
        c0460k.f6205h = AbstractC0370w.M(c0196v.f3455a);
        c0460k.f6207k = AbstractC0370w.M(c0196v.f3456b);
        c0460k.f6208l = AbstractC0370w.M(c0196v.f3457c);
        float f2 = c0196v.f3458d;
        if (f2 == -3.4028235E38f) {
            f2 = c0460k.f6198a;
        }
        c0460k.f6211o = f2;
        float f5 = c0196v.f3459e;
        if (f5 == -3.4028235E38f) {
            f5 = c0460k.f6199b;
        }
        c0460k.f6210n = f5;
        if (f2 == 1.0f && f5 == 1.0f) {
            c0460k.f6205h = -9223372036854775807L;
        }
        c0460k.a();
        if (j5 != -9223372036854775807L) {
            c0460k.i = g(abstractC0169U, obj, j5);
            c0460k.a();
            return;
        }
        if (!Objects.equals(!abstractC0169U2.p() ? abstractC0169U2.m(abstractC0169U2.g(h5.f10531a, c0167s).f3238c, c0168t, 0L).f3245a : null, c0168t.f3245a) || z4) {
            c0460k.i = -9223372036854775807L;
            c0460k.a();
        }
    }

    public final void m(boolean z4) {
        V v4 = this.f5995D.f6079k;
        x0.H h2 = v4 == null ? this.f6003L.f6175b : v4.f6053g.f6062a;
        boolean zEquals = this.f6003L.f6183k.equals(h2);
        if (!zEquals) {
            this.f6003L = this.f6003L.b(h2);
        }
        i0 i0Var = this.f6003L;
        i0Var.f6189q = v4 == null ? i0Var.f6191s : v4.d();
        i0 i0Var2 = this.f6003L;
        i0Var2.f6190r = j(i0Var2.f6189q);
        if ((!zEquals || z4) && v4 != null && v4.f6051e) {
            i0(v4.f6060o);
        }
    }

    public final void m0(boolean z4, boolean z5) {
        long jElapsedRealtime;
        this.f6007Q = z4;
        if (!z4 || z5) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.f5993B.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f6008R = jElapsedRealtime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03dd  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v20 */
    /* JADX WARN: Type inference failed for: r25v22 */
    /* JADX WARN: Type inference failed for: r25v23 */
    /* JADX WARN: Type inference failed for: r25v24 */
    /* JADX WARN: Type inference failed for: r25v25 */
    /* JADX WARN: Type inference failed for: r25v26 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r37v0, types: [h0.N] */
    /* JADX WARN: Type inference failed for: r3v26, types: [long] */
    /* JADX WARN: Type inference failed for: r6v20, types: [long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(a0.AbstractC0169U r38, boolean r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.N.n(a0.U, boolean):void");
    }

    public final synchronized void n0(C0465p c0465p, long j5) {
        this.f5993B.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j5;
        boolean z4 = false;
        while (!((Boolean) c0465p.get()).booleanValue() && j5 > 0) {
            try {
                this.f5993B.getClass();
                wait(j5);
            } catch (InterruptedException unused) {
                z4 = true;
            }
            this.f5993B.getClass();
            j5 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    public final void o(x0.F f2) throws C0464o {
        V v4;
        X x4 = this.f5995D;
        V v5 = x4.f6079k;
        int i = 0;
        boolean z4 = v5 != null && v5.f6047a == f2;
        C0396e c0396e = this.f6037z;
        if (z4) {
            v5.getClass();
            if (!v5.f6051e) {
                float f5 = c0396e.d().f3220a;
                i0 i0Var = this.f6003L;
                v5.f(f5, i0Var.f6174a, i0Var.f6184l);
            }
            i0(v5.f6060o);
            if (v5 == x4.i) {
                H(v5.f6053g.f6063b);
                f(new boolean[this.f6024l.length], x4.f6078j.e());
                i0 i0Var2 = this.f6003L;
                x0.H h2 = i0Var2.f6175b;
                W w4 = v5.f6053g;
                long j5 = i0Var2.f6176c;
                long j6 = w4.f6063b;
                this.f6003L = q(h2, j6, j5, j6, false, 5);
            }
            u();
            return;
        }
        while (true) {
            if (i >= x4.f6084p.size()) {
                v4 = null;
                break;
            }
            v4 = (V) x4.f6084p.get(i);
            if (v4.f6047a == f2) {
                break;
            } else {
                i++;
            }
        }
        if (v4 != null) {
            AbstractC0360m.h(!v4.f6051e);
            float f6 = c0396e.d().f3220a;
            i0 i0Var3 = this.f6003L;
            v4.f(f6, i0Var3.f6174a, i0Var3.f6184l);
            V v6 = x4.f6080l;
            if (v6 == null || v6.f6047a != f2) {
                return;
            }
            v();
        }
    }

    public final void p(C0159J c0159j, float f2, boolean z4, boolean z5) {
        int i;
        if (z4) {
            if (z5) {
                this.M.c(1);
            }
            this.f6003L = this.f6003L.f(c0159j);
        }
        float f5 = c0159j.f3220a;
        V v4 = this.f5995D.i;
        while (true) {
            i = 0;
            if (v4 == null) {
                break;
            }
            A0.w[] wVarArr = v4.f6060o.f42c;
            int length = wVarArr.length;
            while (i < length) {
                A0.w wVar = wVarArr[i];
                if (wVar != null) {
                    wVar.j(f5);
                }
                i++;
            }
            v4 = v4.f6058m;
        }
        o0[] o0VarArr = this.f6024l;
        int length2 = o0VarArr.length;
        while (i < length2) {
            o0 o0Var = o0VarArr[i];
            if (o0Var != null) {
                o0Var.setPlaybackSpeed(f2, c0159j.f3220a);
            }
            i++;
        }
    }

    public final i0 q(x0.H h2, long j5, long j6, long j7, boolean z4, int i) {
        x0.q0 q0Var;
        A0.A a5;
        List list;
        m2.b0 b0VarG;
        boolean z5;
        int i5;
        int i6;
        this.f6020d0 = (!this.f6020d0 && j5 == this.f6003L.f6191s && h2.equals(this.f6003L.f6175b)) ? false : true;
        G();
        i0 i0Var = this.f6003L;
        x0.q0 q0Var2 = i0Var.f6181h;
        A0.A a6 = i0Var.i;
        List list2 = i0Var.f6182j;
        if (this.f5996E.f6144k) {
            V v4 = this.f5995D.i;
            x0.q0 q0Var3 = v4 == null ? x0.q0.f10775d : v4.f6059n;
            A0.A a7 = v4 == null ? this.f6029q : v4.f6060o;
            A0.w[] wVarArr = a7.f42c;
            C0639F c0639f = new C0639F(4);
            int length = wVarArr.length;
            int i7 = 0;
            boolean z6 = false;
            while (i7 < length) {
                A0.w wVar = wVarArr[i7];
                if (wVar == null) {
                    i6 = 1;
                } else {
                    C0155F c0155f = wVar.g(0).f3422l;
                    if (c0155f == null) {
                        c0639f.a(new C0155F(new InterfaceC0154E[0]));
                        i6 = 1;
                    } else {
                        c0639f.a(c0155f);
                        i6 = 1;
                        z6 = true;
                    }
                }
                i7 += i6;
            }
            if (z6) {
                b0VarG = c0639f.g();
            } else {
                C0640G c0640g = m2.I.f8549m;
                b0VarG = m2.b0.f8583p;
            }
            if (v4 != null) {
                W w4 = v4.f6053g;
                if (w4.f6064c != j6) {
                    v4.f6053g = w4.a(j6);
                }
            }
            V v5 = this.f5995D.i;
            if (v5 != null) {
                A0.A a8 = v5.f6060o;
                boolean z7 = false;
                int i8 = 0;
                while (true) {
                    o0[] o0VarArr = this.f6024l;
                    if (i8 >= o0VarArr.length) {
                        z5 = true;
                        break;
                    }
                    if (a8.b(i8)) {
                        i5 = 1;
                        if (o0VarArr[i8].getTrackType() != 1) {
                            z5 = false;
                            break;
                        }
                        if (a8.f41b[i8].f6275a != 0) {
                            z7 = true;
                        }
                    } else {
                        i5 = 1;
                    }
                    i8 += i5;
                }
                boolean z8 = z7 && z5;
                if (z8 != this.f6014X) {
                    this.f6014X = z8;
                    if (!z8 && this.f6003L.f6188p) {
                        this.f6032t.e(2);
                    }
                }
            }
            list = b0VarG;
            q0Var = q0Var3;
            a5 = a7;
        } else if (h2.equals(i0Var.f6175b)) {
            q0Var = q0Var2;
            a5 = a6;
            list = list2;
        } else {
            q0Var = x0.q0.f10775d;
            a5 = this.f6029q;
            list = m2.b0.f8583p;
        }
        if (z4) {
            K k4 = this.M;
            if (!k4.f5979c || k4.f5980d == 5) {
                k4.f5978b = true;
                k4.f5979c = true;
                k4.f5980d = i;
            } else {
                AbstractC0360m.c(i == 5);
            }
        }
        i0 i0Var2 = this.f6003L;
        return i0Var2.c(h2, j5, j6, j7, j(i0Var2.f6189q), q0Var, a5, list);
    }

    public final boolean t() {
        V v4 = this.f5995D.i;
        long j5 = v4.f6053g.f6066e;
        return v4.f6051e && (j5 == -9223372036854775807L || this.f6003L.f6191s < j5 || !c0());
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, x0.h0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, x0.h0] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, x0.F] */
    public final void u() {
        boolean zC;
        if (r(this.f5995D.f6079k)) {
            V v4 = this.f5995D.f6079k;
            long j5 = j(!v4.f6051e ? 0L : v4.f6047a.r());
            V v5 = this.f5995D.i;
            long j6 = d0(this.f6003L.f6174a, v4.f6053g.f6062a) ? ((C0460k) this.f5997F).f6209m : -9223372036854775807L;
            i0.j jVar = this.f5999H;
            AbstractC0169U abstractC0169U = this.f6003L.f6174a;
            float f2 = this.f6037z.d().f3220a;
            boolean z4 = this.f6003L.f6184l;
            P p4 = new P(jVar, j5, f2, this.f6007Q, j6);
            zC = ((C0462m) this.f6030r).c(p4);
            V v6 = this.f5995D.i;
            if (!zC && v6.f6051e && j5 < 500000 && this.y > 0) {
                v6.f6047a.p(this.f6003L.f6191s);
                zC = ((C0462m) this.f6030r).c(p4);
            }
        } else {
            zC = false;
        }
        this.f6009S = zC;
        if (zC) {
            V v7 = this.f5995D.f6079k;
            v7.getClass();
            S s4 = new S();
            s4.f6041a = this.f6017a0 - v7.f6061p;
            float f5 = this.f6037z.d().f3220a;
            AbstractC0360m.c(f5 > 0.0f || f5 == -3.4028235E38f);
            s4.f6042b = f5;
            long j7 = this.f6008R;
            AbstractC0360m.c(j7 >= 0 || j7 == -9223372036854775807L);
            s4.f6043c = j7;
            T t4 = new T(s4);
            AbstractC0360m.h(v7.f6058m == null);
            v7.f6047a.v(t4);
        }
        h0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, x0.F, x0.h0] */
    public final void v() {
        X x4 = this.f5995D;
        x4.j();
        V v4 = x4.f6080l;
        if (v4 != null) {
            if (!v4.f6050d || v4.f6051e) {
                ?? r12 = v4.f6047a;
                if (r12.c()) {
                    return;
                }
                AbstractC0169U abstractC0169U = this.f6003L.f6174a;
                if (v4.f6051e) {
                    r12.h();
                }
                Iterator it = ((C0462m) this.f6030r).i.values().iterator();
                while (it.hasNext()) {
                    if (((C0461l) it.next()).f6216a) {
                        return;
                    }
                }
                if (!v4.f6050d) {
                    W w4 = v4.f6053g;
                    v4.f6050d = true;
                    r12.t(this, w4.f6063b);
                    return;
                }
                S s4 = new S();
                s4.f6041a = this.f6017a0 - v4.f6061p;
                float f2 = this.f6037z.d().f3220a;
                AbstractC0360m.c(f2 > 0.0f || f2 == -3.4028235E38f);
                s4.f6042b = f2;
                long j5 = this.f6008R;
                AbstractC0360m.c(j5 >= 0 || j5 == -9223372036854775807L);
                s4.f6043c = j5;
                T t4 = new T(s4);
                AbstractC0360m.h(v4.f6058m == null);
                r12.v(t4);
            }
        }
    }

    public final void w() {
        K k4 = this.M;
        i0 i0Var = this.f6003L;
        boolean z4 = k4.f5978b | (((i0) k4.f5981e) != i0Var);
        k4.f5978b = z4;
        k4.f5981e = i0Var;
        if (z4) {
            C0448G c0448g = this.f5994C.f5903l;
            c0448g.i.c(new D0.y(c0448g, 14, k4));
            this.M = new K(this.f6003L);
        }
    }

    public final void x(int i) {
        o0 o0Var = this.f6024l[i];
        try {
            o0Var.maybeThrowStreamError();
        } catch (IOException | RuntimeException e5) {
            int trackType = o0Var.getTrackType();
            if (trackType != 3 && trackType != 5) {
                throw e5;
            }
            A0.A a5 = this.f5995D.i.f6060o;
            AbstractC0360m.m("ExoPlayerImplInternal", "Disabling track due to error: " + C0190p.d(a5.f42c[i].d()), e5);
            A0.A a6 = new A0.A((r0[]) a5.f41b.clone(), (A0.w[]) a5.f42c.clone(), a5.f43d, a5.f44e);
            a6.f41b[i] = null;
            a6.f42c[i] = null;
            c(i);
            V v4 = this.f5995D.i;
            v4.a(a6, this.f6003L.f6191s, false, new boolean[v4.f6055j.length]);
        }
    }

    public final void y(int i, boolean z4) {
        boolean[] zArr = this.f6027o;
        if (zArr[i] != z4) {
            zArr[i] = z4;
            this.f6001J.c(new RunnableC0454e(this, i, z4));
        }
    }

    public final void z() throws Throwable {
        n(this.f5996E.b(), true);
    }
}
