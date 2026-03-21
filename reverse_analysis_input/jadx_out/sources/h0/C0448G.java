package h0;

import D.C0015o;
import a0.AbstractC0151B;
import a0.AbstractC0169U;
import a0.C0150A;
import a0.C0152C;
import a0.C0153D;
import a0.C0155F;
import a0.C0159J;
import a0.C0160K;
import a0.C0163N;
import a0.C0167S;
import a0.C0168T;
import a0.C0177c;
import a0.C0183i;
import a0.C0187m;
import a0.C0188n;
import a0.C0190p;
import a0.C0200z;
import a0.InterfaceC0154E;
import a0.InterfaceC0162M;
import a0.InterfaceC0164O;
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0359l;
import d0.C0364q;
import d0.C0365r;
import d0.C0366s;
import d0.C0367t;
import d0.InterfaceC0356i;
import i0.C0477a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import m2.C0640G;

/* JADX INFO: renamed from: h0.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0448G extends L0.e implements InterfaceC0467s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0200z f5914A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f5915B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f5916C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f5917D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f5918E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f5919F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f5920G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t0 f5921H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public x0.j0 f5922I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final r f5923J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C0160K f5924K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public C0153D f5925L;
    public C0190p M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Surface f5926N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Surface f5927O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public SurfaceHolder f5928P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f5929Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final int f5930R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0364q f5931S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final int f5932T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0177c f5933U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public float f5934V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f5935W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final boolean f5936X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f5937Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final int f5938Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f5939a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0.A f5940b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public a0.e0 f5941b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0160K f5942c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public C0153D f5943c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F0.N f5944d = new F0.N();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public i0 f5945d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f5946e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f5947e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC0164O f5948f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public long f5949f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o0[] f5950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A0.z f5951h;
    public final C0367t i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0442A f5952j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final N f5953k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0359l f5954l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f5955m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0167S f5956n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f5957o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f5958p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x0.G f5959q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i0.c f5960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Looper f5961s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final B0.e f5962t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0365r f5963u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SurfaceHolderCallbackC0445D f5964v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0446E f5965w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0452c f5966x;
    public final C0456g y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0200z f5967z;

    static {
        AbstractC0151B.a("media3.exoplayer");
    }

    public C0448G(C0466q c0466q) {
        try {
            AbstractC0360m.p("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.1] [" + AbstractC0370w.f5330e + "]");
            Context context = c0466q.f6254a;
            Looper looper = c0466q.i;
            this.f5946e = context.getApplicationContext();
            B0.l lVar = c0466q.f6261h;
            C0365r c0365r = c0466q.f6255b;
            lVar.getClass();
            this.f5960r = new i0.c(c0365r);
            this.f5938Z = c0466q.f6262j;
            this.f5933U = c0466q.f6263k;
            this.f5930R = c0466q.f6264l;
            this.f5935W = false;
            this.f5915B = c0466q.f6269q;
            SurfaceHolderCallbackC0445D surfaceHolderCallbackC0445D = new SurfaceHolderCallbackC0445D(this);
            this.f5964v = surfaceHolderCallbackC0445D;
            this.f5965w = new C0446E();
            Handler handler = new Handler(looper);
            o0[] o0VarArrA = ((s0) c0466q.f6256c.get()).a(handler, surfaceHolderCallbackC0445D, surfaceHolderCallbackC0445D, surfaceHolderCallbackC0445D, surfaceHolderCallbackC0445D);
            this.f5950g = o0VarArrA;
            AbstractC0360m.h(o0VarArrA.length > 0);
            this.f5951h = (A0.z) c0466q.f6258e.get();
            this.f5959q = (x0.G) c0466q.f6257d.get();
            this.f5962t = (B0.e) c0466q.f6260g.get();
            this.f5958p = c0466q.f6265m;
            this.f5921H = c0466q.f6266n;
            this.f5961s = looper;
            this.f5963u = c0365r;
            this.f5948f = this;
            this.f5954l = new C0359l(looper, c0365r, new C0442A(this));
            this.f5955m = new CopyOnWriteArraySet();
            this.f5957o = new ArrayList();
            this.f5922I = new x0.i0();
            this.f5923J = r.f6273a;
            this.f5940b = new A0.A(new r0[o0VarArrA.length], new A0.w[o0VarArrA.length], a0.b0.f3320b, null);
            this.f5956n = new C0167S();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i = 0; i < 20; i++) {
                int i5 = iArr[i];
                AbstractC0360m.h(!false);
                sparseBooleanArray.append(i5, true);
            }
            this.f5951h.getClass();
            AbstractC0360m.h(!false);
            sparseBooleanArray.append(29, true);
            AbstractC0360m.h(!false);
            C0188n c0188n = new C0188n(sparseBooleanArray);
            this.f5942c = new C0160K(c0188n);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i6 = 0; i6 < c0188n.f3364a.size(); i6++) {
                int iA = c0188n.a(i6);
                AbstractC0360m.h(!false);
                sparseBooleanArray2.append(iA, true);
            }
            AbstractC0360m.h(!false);
            sparseBooleanArray2.append(4, true);
            AbstractC0360m.h(!false);
            sparseBooleanArray2.append(10, true);
            AbstractC0360m.h(!false);
            this.f5924K = new C0160K(new C0188n(sparseBooleanArray2));
            this.i = this.f5963u.a(this.f5961s, null);
            C0442A c0442a = new C0442A(this);
            this.f5952j = c0442a;
            this.f5945d0 = i0.i(this.f5940b);
            this.f5960r.m(this.f5948f, this.f5961s);
            int i7 = AbstractC0370w.f5326a;
            String str = c0466q.f6272t;
            this.f5953k = new N(this.f5950g, this.f5951h, this.f5940b, (Q) c0466q.f6259f.get(), this.f5962t, this.f5916C, this.f5917D, this.f5960r, this.f5921H, c0466q.f6267o, c0466q.f6268p, this.f5961s, this.f5963u, c0442a, i7 < 31 ? new i0.j(str) : Q1.C.n0(this.f5946e, this, c0466q.f6270r, str), this.f5923J);
            this.f5934V = 1.0f;
            this.f5916C = 0;
            C0153D c0153d = C0153D.f3185B;
            this.f5925L = c0153d;
            this.f5943c0 = c0153d;
            this.f5947e0 = -1;
            AudioManager audioManager = (AudioManager) this.f5946e.getSystemService("audio");
            int iGenerateAudioSessionId = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            this.f5932T = iGenerateAudioSessionId;
            int i8 = c0.c.f5009b;
            this.f5936X = true;
            i0.c cVar = this.f5960r;
            cVar.getClass();
            this.f5954l.a(cVar);
            B0.e eVar = this.f5962t;
            Handler handler2 = new Handler(this.f5961s);
            i0.c cVar2 = this.f5960r;
            B0.i iVar = (B0.i) eVar;
            iVar.getClass();
            cVar2.getClass();
            B0.d dVar = iVar.f211b;
            dVar.getClass();
            CopyOnWriteArrayList<B0.c> copyOnWriteArrayList = (CopyOnWriteArrayList) dVar.f190l;
            for (B0.c cVar3 : copyOnWriteArrayList) {
                if (cVar3.f188b == cVar2) {
                    cVar3.f189c = true;
                    copyOnWriteArrayList.remove(cVar3);
                }
            }
            copyOnWriteArrayList.add(new B0.c(handler2, cVar2));
            this.f5955m.add(this.f5964v);
            SurfaceHolderCallbackC0445D surfaceHolderCallbackC0445D2 = this.f5964v;
            C0452c c0452c = new C0452c();
            c0452c.f6102b = context.getApplicationContext();
            c0452c.f6103c = new RunnableC0451b(c0452c, handler, surfaceHolderCallbackC0445D2);
            this.f5966x = c0452c;
            c0452c.b();
            C0456g c0456g = new C0456g(context, handler, this.f5964v);
            this.y = c0456g;
            c0456g.b(null);
            C0200z c0200z = new C0200z(13);
            context.getApplicationContext();
            this.f5967z = c0200z;
            this.f5914A = new C0200z(context);
            C0015o c0015o = new C0015o(1);
            c0015o.f360b = 0;
            c0015o.f361c = 0;
            new C0183i(c0015o);
            this.f5941b0 = a0.e0.f3333d;
            this.f5931S = C0364q.f5316c;
            this.f5951h.a(this.f5933U);
            O(1, 10, Integer.valueOf(iGenerateAudioSessionId));
            O(2, 10, Integer.valueOf(iGenerateAudioSessionId));
            O(1, 3, this.f5933U);
            O(2, 4, Integer.valueOf(this.f5930R));
            O(2, 5, 0);
            O(1, 9, Boolean.valueOf(this.f5935W));
            O(2, 7, this.f5965w);
            O(6, 8, this.f5965w);
            O(-1, 16, Integer.valueOf(this.f5938Z));
            this.f5944d.a();
        } catch (Throwable th) {
            this.f5944d.a();
            throw th;
        }
    }

    public static long F(i0 i0Var) {
        C0168T c0168t = new C0168T();
        C0167S c0167s = new C0167S();
        i0Var.f6174a.g(i0Var.f6175b.f10531a, c0167s);
        long j5 = i0Var.f6176c;
        if (j5 != -9223372036854775807L) {
            return c0167s.f3240e + j5;
        }
        return i0Var.f6174a.m(c0167s.f3238c, c0168t, 0L).f3255l;
    }

    public final int A(i0 i0Var) {
        if (i0Var.f6174a.p()) {
            return this.f5947e0;
        }
        return i0Var.f6174a.g(i0Var.f6175b.f10531a, this.f5956n).f3238c;
    }

    public final long B() {
        d0();
        if (!G()) {
            AbstractC0169U abstractC0169UZ = z();
            if (abstractC0169UZ.p()) {
                return -9223372036854775807L;
            }
            return AbstractC0370w.Z(abstractC0169UZ.m(w(), (C0168T) this.f1479a, 0L).f3256m);
        }
        i0 i0Var = this.f5945d0;
        x0.H h2 = i0Var.f6175b;
        AbstractC0169U abstractC0169U = i0Var.f6174a;
        Object obj = h2.f10531a;
        C0167S c0167s = this.f5956n;
        abstractC0169U.g(obj, c0167s);
        return AbstractC0370w.Z(c0167s.a(h2.f10532b, h2.f10533c));
    }

    public final Pair C(AbstractC0169U abstractC0169U, n0 n0Var, int i, long j5) {
        if (abstractC0169U.p() || n0Var.p()) {
            boolean z4 = !abstractC0169U.p() && n0Var.p();
            return I(n0Var, z4 ? -1 : i, z4 ? -9223372036854775807L : j5);
        }
        Pair pairI = abstractC0169U.i((C0168T) this.f1479a, this.f5956n, i, AbstractC0370w.M(j5));
        Object obj = pairI.first;
        if (n0Var.b(obj) != -1) {
            return pairI;
        }
        int iK = N.K((C0168T) this.f1479a, this.f5956n, this.f5916C, this.f5917D, obj, abstractC0169U, n0Var);
        if (iK == -1) {
            return I(n0Var, -1, -9223372036854775807L);
        }
        C0168T c0168t = (C0168T) this.f1479a;
        n0Var.m(iK, c0168t, 0L);
        return I(n0Var, iK, AbstractC0370w.Z(c0168t.f3255l));
    }

    public final boolean D() {
        d0();
        return this.f5945d0.f6184l;
    }

    public final int E() {
        d0();
        return this.f5945d0.f6178e;
    }

    public final boolean G() {
        d0();
        return this.f5945d0.f6175b.b();
    }

    public final i0 H(i0 i0Var, AbstractC0169U abstractC0169U, Pair pair) {
        List list;
        AbstractC0360m.c(abstractC0169U.p() || pair != null);
        AbstractC0169U abstractC0169U2 = i0Var.f6174a;
        long jT = t(i0Var);
        i0 i0VarH = i0Var.h(abstractC0169U);
        if (abstractC0169U.p()) {
            x0.H h2 = i0.f6173u;
            long jM = AbstractC0370w.M(this.f5949f0);
            i0 i0VarB = i0VarH.c(h2, jM, jM, jM, 0L, x0.q0.f10775d, this.f5940b, m2.b0.f8583p).b(h2);
            i0VarB.f6189q = i0VarB.f6191s;
            return i0VarB;
        }
        Object obj = i0VarH.f6175b.f10531a;
        boolean zEquals = obj.equals(pair.first);
        x0.H h5 = !zEquals ? new x0.H(pair.first) : i0VarH.f6175b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM2 = AbstractC0370w.M(jT);
        if (!abstractC0169U2.p()) {
            jM2 -= abstractC0169U2.g(obj, this.f5956n).f3240e;
        }
        if (!zEquals || jLongValue < jM2) {
            AbstractC0360m.h(!h5.b());
            x0.q0 q0Var = !zEquals ? x0.q0.f10775d : i0VarH.f6181h;
            A0.A a5 = !zEquals ? this.f5940b : i0VarH.i;
            if (zEquals) {
                list = i0VarH.f6182j;
            } else {
                C0640G c0640g = m2.I.f8549m;
                list = m2.b0.f8583p;
            }
            i0 i0VarB2 = i0VarH.c(h5, jLongValue, jLongValue, jLongValue, 0L, q0Var, a5, list).b(h5);
            i0VarB2.f6189q = jLongValue;
            return i0VarB2;
        }
        if (jLongValue != jM2) {
            AbstractC0360m.h(!h5.b());
            long jMax = Math.max(0L, i0VarH.f6190r - (jLongValue - jM2));
            long j5 = i0VarH.f6189q;
            if (i0VarH.f6183k.equals(i0VarH.f6175b)) {
                j5 = jLongValue + jMax;
            }
            i0 i0VarC = i0VarH.c(h5, jLongValue, jLongValue, jLongValue, jMax, i0VarH.f6181h, i0VarH.i, i0VarH.f6182j);
            i0VarC.f6189q = j5;
            return i0VarC;
        }
        int iB = abstractC0169U.b(i0VarH.f6183k.f10531a);
        if (iB != -1 && abstractC0169U.f(iB, this.f5956n, false).f3238c == abstractC0169U.g(h5.f10531a, this.f5956n).f3238c) {
            return i0VarH;
        }
        abstractC0169U.g(h5.f10531a, this.f5956n);
        long jA = h5.b() ? this.f5956n.a(h5.f10532b, h5.f10533c) : this.f5956n.f3239d;
        i0 i0VarB3 = i0VarH.c(h5, i0VarH.f6191s, i0VarH.f6191s, i0VarH.f6177d, jA - i0VarH.f6191s, i0VarH.f6181h, i0VarH.i, i0VarH.f6182j).b(h5);
        i0VarB3.f6189q = jA;
        return i0VarB3;
    }

    public final Pair I(AbstractC0169U abstractC0169U, int i, long j5) {
        if (abstractC0169U.p()) {
            this.f5947e0 = i;
            if (j5 == -9223372036854775807L) {
                j5 = 0;
            }
            this.f5949f0 = j5;
            return null;
        }
        if (i == -1 || i >= abstractC0169U.o()) {
            i = abstractC0169U.a(this.f5917D);
            j5 = AbstractC0370w.Z(abstractC0169U.m(i, (C0168T) this.f1479a, 0L).f3255l);
        }
        return abstractC0169U.i((C0168T) this.f1479a, this.f5956n, i, AbstractC0370w.M(j5));
    }

    public final void J(final int i, final int i5) {
        C0364q c0364q = this.f5931S;
        if (i == c0364q.f5317a && i5 == c0364q.f5318b) {
            return;
        }
        this.f5931S = new C0364q(i, i5);
        this.f5954l.e(24, new InterfaceC0356i() { // from class: h0.x
            @Override // d0.InterfaceC0356i
            public final void c(Object obj) {
                ((InterfaceC0162M) obj).onSurfaceSizeChanged(i, i5);
            }
        });
        O(2, 14, new C0364q(i, i5));
    }

    public final void K() {
        d0();
        boolean zD = D();
        int iD = this.y.d(2, zD);
        a0(iD, iD == -1 ? 2 : 1, zD);
        i0 i0Var = this.f5945d0;
        if (i0Var.f6178e != 1) {
            return;
        }
        i0 i0VarE = i0Var.e(null);
        i0 i0VarG = i0VarE.g(i0VarE.f6174a.p() ? 4 : 2);
        this.f5918E++;
        C0367t c0367t = this.f5953k.f6032t;
        c0367t.getClass();
        C0366s c0366sB = C0367t.b();
        c0366sB.f5319a = c0367t.f5321a.obtainMessage(29);
        c0366sB.b();
        b0(i0VarG, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void L() {
        String str;
        boolean z4;
        A0.p pVar;
        A0.o oVar;
        int i = 0;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.5.1] [");
        sb.append(AbstractC0370w.f5330e);
        sb.append("] [");
        HashSet hashSet = AbstractC0151B.f3159a;
        synchronized (AbstractC0151B.class) {
            str = AbstractC0151B.f3160b;
        }
        sb.append(str);
        sb.append("]");
        AbstractC0360m.p("ExoPlayerImpl", sb.toString());
        d0();
        this.f5966x.b();
        this.f5967z.getClass();
        this.f5914A.getClass();
        C0456g c0456g = this.y;
        c0456g.f6129c = null;
        c0456g.a();
        c0456g.c(0);
        N n4 = this.f5953k;
        synchronized (n4) {
            if (n4.f6004N || !n4.f6034v.getThread().isAlive()) {
                z4 = true;
            } else {
                n4.f6032t.e(7);
                n4.n0(new C0465p(n4, 3), n4.f5998G);
                z4 = n4.f6004N;
            }
        }
        if (!z4) {
            this.f5954l.e(10, new C0473y(i));
        }
        this.f5954l.d();
        this.i.f5321a.removeCallbacksAndMessages(null);
        B0.e eVar = this.f5962t;
        i0.c cVar = this.f5960r;
        CopyOnWriteArrayList<B0.c> copyOnWriteArrayList = (CopyOnWriteArrayList) ((B0.i) eVar).f211b.f190l;
        for (B0.c cVar2 : copyOnWriteArrayList) {
            if (cVar2.f188b == cVar) {
                cVar2.f189c = true;
                copyOnWriteArrayList.remove(cVar2);
            }
        }
        i0 i0Var = this.f5945d0;
        if (i0Var.f6188p) {
            this.f5945d0 = i0Var.a();
        }
        i0 i0VarG = this.f5945d0.g(1);
        this.f5945d0 = i0VarG;
        i0 i0VarB = i0VarG.b(i0VarG.f6175b);
        this.f5945d0 = i0VarB;
        i0VarB.f6189q = i0VarB.f6191s;
        this.f5945d0.f6190r = 0L;
        i0.c cVar3 = this.f5960r;
        C0367t c0367t = cVar3.f6369s;
        AbstractC0360m.i(c0367t);
        c0367t.c(new A3.c(cVar3, 14));
        A0.u uVar = (A0.u) this.f5951h;
        synchronized (uVar.f152c) {
            try {
                if (AbstractC0370w.f5326a >= 32 && (pVar = uVar.f157h) != null && (oVar = (A0.o) pVar.f123d) != null && ((Handler) pVar.f122c) != null) {
                    ((Spatializer) pVar.f121b).removeOnSpatializerStateChangedListener(oVar);
                    ((Handler) pVar.f122c).removeCallbacksAndMessages(null);
                    pVar.f122c = null;
                    pVar.f123d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        uVar.f166a = null;
        uVar.f167b = null;
        N();
        Surface surface = this.f5927O;
        if (surface != null) {
            surface.release();
            this.f5927O = null;
        }
        int i5 = c0.c.f5009b;
        this.f5939a0 = true;
    }

    public final void M(int i, int i5) {
        d0();
        AbstractC0360m.c(i >= 0 && i5 >= i);
        ArrayList arrayList = this.f5957o;
        int size = arrayList.size();
        int iMin = Math.min(i5, size);
        if (i >= size || i == iMin) {
            return;
        }
        i0 i0Var = this.f5945d0;
        int iA = A(i0Var);
        long jT = t(i0Var);
        int size2 = arrayList.size();
        this.f5918E++;
        for (int i6 = iMin - 1; i6 >= i; i6--) {
            arrayList.remove(i6);
        }
        this.f5922I = ((x0.i0) this.f5922I).c(i, iMin);
        n0 n0Var = new n0(arrayList, this.f5922I);
        i0 i0VarH = H(i0Var, n0Var, C(i0Var.f6174a, n0Var, iA, jT));
        int i7 = i0VarH.f6178e;
        if (i7 != 1 && i7 != 4 && i < iMin && iMin == size2 && iA >= i0VarH.f6174a.o()) {
            i0VarH = i0VarH.g(4);
        }
        i0 i0Var2 = i0VarH;
        x0.j0 j0Var = this.f5922I;
        C0367t c0367t = this.f5953k.f6032t;
        c0367t.getClass();
        C0366s c0366sB = C0367t.b();
        c0366sB.f5319a = c0367t.f5321a.obtainMessage(20, i, iMin, j0Var);
        c0366sB.b();
        b0(i0Var2, 0, !i0Var2.f6175b.f10531a.equals(this.f5945d0.f6175b.f10531a), 4, y(i0Var2), -1, false);
    }

    public final void N() {
        SurfaceHolder surfaceHolder = this.f5928P;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f5964v);
            this.f5928P = null;
        }
    }

    public final void O(int i, int i5, Object obj) {
        for (o0 o0Var : this.f5950g) {
            if (i == -1 || o0Var.getTrackType() == i) {
                int iA = A(this.f5945d0);
                AbstractC0169U abstractC0169U = this.f5945d0.f6174a;
                int i6 = iA == -1 ? 0 : iA;
                N n4 = this.f5953k;
                l0 l0Var = new l0(n4, o0Var, abstractC0169U, i6, this.f5963u, n4.f6034v);
                AbstractC0360m.h(!l0Var.f6224g);
                l0Var.f6221d = i5;
                AbstractC0360m.h(!l0Var.f6224g);
                l0Var.f6222e = obj;
                l0Var.c();
            }
        }
    }

    public final void P(C0177c c0177c, boolean z4) {
        d0();
        if (this.f5939a0) {
            return;
        }
        C0177c c0177c2 = this.f5933U;
        int i = AbstractC0370w.f5326a;
        boolean zEquals = Objects.equals(c0177c2, c0177c);
        C0359l c0359l = this.f5954l;
        if (!zEquals) {
            this.f5933U = c0177c;
            O(1, 3, c0177c);
            c0359l.c(20, new I2.g(c0177c, 7));
        }
        C0177c c0177c3 = z4 ? c0177c : null;
        C0456g c0456g = this.y;
        c0456g.b(c0177c3);
        this.f5951h.a(c0177c);
        boolean zD = D();
        int iD = c0456g.d(E(), zD);
        a0(iD, iD == -1 ? 2 : 1, zD);
        c0359l.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(java.util.List r17, int r18, long r19, boolean r21) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C0448G.Q(java.util.List, int, long, boolean):void");
    }

    public final void R(boolean z4) {
        d0();
        int iD = this.y.d(E(), z4);
        a0(iD, iD == -1 ? 2 : 1, z4);
    }

    public final void S(C0159J c0159j) {
        d0();
        if (this.f5945d0.f6187o.equals(c0159j)) {
            return;
        }
        i0 i0VarF = this.f5945d0.f(c0159j);
        this.f5918E++;
        this.f5953k.f6032t.a(4, c0159j).b();
        b0(i0VarF, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void T(int i) {
        d0();
        if (this.f5916C != i) {
            this.f5916C = i;
            C0367t c0367t = this.f5953k.f6032t;
            c0367t.getClass();
            C0366s c0366sB = C0367t.b();
            c0366sB.f5319a = c0367t.f5321a.obtainMessage(11, i, 0);
            c0366sB.b();
            C0474z c0474z = new C0474z(i);
            C0359l c0359l = this.f5954l;
            c0359l.c(8, c0474z);
            Z();
            c0359l.b();
        }
    }

    public final void U(x0.j0 j0Var) {
        d0();
        int length = ((x0.i0) j0Var).f10721b.length;
        ArrayList arrayList = this.f5957o;
        AbstractC0360m.c(length == arrayList.size());
        this.f5922I = j0Var;
        n0 n0Var = new n0(arrayList, this.f5922I);
        i0 i0VarH = H(this.f5945d0, n0Var, I(n0Var, w(), x()));
        this.f5918E++;
        this.f5953k.f6032t.a(21, j0Var).b();
        b0(i0VarH, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void V(Surface surface) {
        boolean z4;
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : this.f5950g) {
            if (o0Var.getTrackType() == 2) {
                int iA = A(this.f5945d0);
                AbstractC0169U abstractC0169U = this.f5945d0.f6174a;
                int i = iA == -1 ? 0 : iA;
                N n4 = this.f5953k;
                l0 l0Var = new l0(n4, o0Var, abstractC0169U, i, this.f5963u, n4.f6034v);
                AbstractC0360m.h(!l0Var.f6224g);
                l0Var.f6221d = 1;
                AbstractC0360m.h(!l0Var.f6224g);
                l0Var.f6222e = surface;
                l0Var.c();
                arrayList.add(l0Var);
            }
        }
        Surface surface2 = this.f5926N;
        if (surface2 == null || surface2 == surface) {
            z4 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((l0) it.next()).a(this.f5915B);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z4 = true;
            }
            z4 = false;
            Surface surface3 = this.f5926N;
            Surface surface4 = this.f5927O;
            if (surface3 == surface4) {
                surface4.release();
                this.f5927O = null;
            }
        }
        this.f5926N = surface;
        if (z4) {
            Y(new C0464o(2, new A1.c("Detaching surface timed out."), 1003));
        }
    }

    public final void W(Surface surface) {
        d0();
        N();
        V(surface);
        int i = surface == null ? 0 : -1;
        J(i, i);
    }

    public final void X(float f2) {
        d0();
        final float fH = AbstractC0370w.h(f2, 0.0f, 1.0f);
        if (this.f5934V == fH) {
            return;
        }
        this.f5934V = fH;
        O(1, 2, Float.valueOf(this.y.f6133g * fH));
        this.f5954l.e(22, new InterfaceC0356i() { // from class: h0.w
            @Override // d0.InterfaceC0356i
            public final void c(Object obj) {
                ((InterfaceC0162M) obj).onVolumeChanged(fH);
            }
        });
    }

    public final void Y(C0464o c0464o) {
        i0 i0Var = this.f5945d0;
        i0 i0VarB = i0Var.b(i0Var.f6175b);
        i0VarB.f6189q = i0VarB.f6191s;
        i0VarB.f6190r = 0L;
        i0 i0VarG = i0VarB.g(1);
        if (c0464o != null) {
            i0VarG = i0VarG.e(c0464o);
        }
        i0 i0Var2 = i0VarG;
        this.f5918E++;
        C0367t c0367t = this.f5953k.f6032t;
        c0367t.getClass();
        C0366s c0366sB = C0367t.b();
        c0366sB.f5319a = c0367t.f5321a.obtainMessage(6);
        c0366sB.b();
        b0(i0Var2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void Z() {
        int iK;
        int iE;
        C0160K c0160k = this.f5924K;
        int i = AbstractC0370w.f5326a;
        C0448G c0448g = (C0448G) this.f5948f;
        boolean zG = c0448g.G();
        AbstractC0169U abstractC0169UZ = c0448g.z();
        boolean zP = abstractC0169UZ.p();
        C0168T c0168t = (C0168T) c0448g.f1479a;
        boolean z4 = !zP && abstractC0169UZ.m(c0448g.w(), c0168t, 0L).f3252h;
        AbstractC0169U abstractC0169UZ2 = c0448g.z();
        if (abstractC0169UZ2.p()) {
            iK = -1;
        } else {
            int iW = c0448g.w();
            c0448g.d0();
            int i5 = c0448g.f5916C;
            if (i5 == 1) {
                i5 = 0;
            }
            c0448g.d0();
            iK = abstractC0169UZ2.k(iW, i5, c0448g.f5917D);
        }
        boolean z5 = iK != -1;
        AbstractC0169U abstractC0169UZ3 = c0448g.z();
        if (abstractC0169UZ3.p()) {
            iE = -1;
        } else {
            int iW2 = c0448g.w();
            c0448g.d0();
            int i6 = c0448g.f5916C;
            if (i6 == 1) {
                i6 = 0;
            }
            c0448g.d0();
            iE = abstractC0169UZ3.e(iW2, i6, c0448g.f5917D);
        }
        boolean z6 = iE != -1;
        AbstractC0169U abstractC0169UZ4 = c0448g.z();
        boolean z7 = !abstractC0169UZ4.p() && abstractC0169UZ4.m(c0448g.w(), c0168t, 0L).a();
        AbstractC0169U abstractC0169UZ5 = c0448g.z();
        boolean z8 = !abstractC0169UZ5.p() && abstractC0169UZ5.m(c0448g.w(), c0168t, 0L).i;
        boolean zP2 = c0448g.z().p();
        B0.d dVar = new B0.d(27);
        C0188n c0188n = this.f5942c.f3223a;
        C0187m c0187m = (C0187m) dVar.f190l;
        c0187m.getClass();
        for (int i7 = 0; i7 < c0188n.f3364a.size(); i7++) {
            c0187m.a(c0188n.a(i7));
        }
        boolean z9 = !zG;
        dVar.c(4, z9);
        dVar.c(5, z4 && !zG);
        dVar.c(6, z5 && !zG);
        dVar.c(7, !zP2 && (z5 || !z7 || z4) && !zG);
        dVar.c(8, z6 && !zG);
        dVar.c(9, !zP2 && (z6 || (z7 && z8)) && !zG);
        dVar.c(10, z9);
        dVar.c(11, z4 && !zG);
        dVar.c(12, z4 && !zG);
        C0160K c0160k2 = new C0160K(c0187m.b());
        this.f5924K = c0160k2;
        if (c0160k2.equals(c0160k)) {
            return;
        }
        this.f5954l.c(13, new C0442A(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final void a0(int i, int i5, boolean z4) {
        ?? r14 = (!z4 || i == -1) ? 0 : 1;
        int i6 = i == 0 ? 1 : 0;
        i0 i0Var = this.f5945d0;
        if (i0Var.f6184l == r14 && i0Var.f6186n == i6 && i0Var.f6185m == i5) {
            return;
        }
        this.f5918E++;
        i0 i0Var2 = this.f5945d0;
        boolean z5 = i0Var2.f6188p;
        i0 i0VarA = i0Var2;
        if (z5) {
            i0VarA = i0Var2.a();
        }
        i0 i0VarD = i0VarA.d(i5, i6, r14);
        int i7 = (i6 << 4) | i5;
        C0367t c0367t = this.f5953k.f6032t;
        c0367t.getClass();
        C0366s c0366sB = C0367t.b();
        c0366sB.f5319a = c0367t.f5321a.obtainMessage(1, r14, i7);
        c0366sB.b();
        b0(i0VarD, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void b0(final i0 i0Var, final int i, boolean z4, final int i5, long j5, int i6, boolean z5) {
        Pair pair;
        int i7;
        final C0150A c0150a;
        boolean z6;
        boolean z7;
        int i8;
        Object obj;
        C0150A c0150a2;
        Object obj2;
        int i9;
        long j6;
        long j7;
        long jF;
        long jF2;
        Object obj3;
        C0150A c0150a3;
        Object obj4;
        int i10;
        i0 i0Var2 = this.f5945d0;
        this.f5945d0 = i0Var;
        boolean zEquals = i0Var2.f6174a.equals(i0Var.f6174a);
        AbstractC0169U abstractC0169U = i0Var2.f6174a;
        AbstractC0169U abstractC0169U2 = i0Var.f6174a;
        if (abstractC0169U2.p() && abstractC0169U.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (abstractC0169U2.p() != abstractC0169U.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            x0.H h2 = i0Var2.f6175b;
            Object obj5 = h2.f10531a;
            C0167S c0167s = this.f5956n;
            int i11 = abstractC0169U.g(obj5, c0167s).f3238c;
            C0168T c0168t = (C0168T) this.f1479a;
            Object obj6 = abstractC0169U.m(i11, c0168t, 0L).f3245a;
            x0.H h5 = i0Var.f6175b;
            if (obj6.equals(abstractC0169U2.m(abstractC0169U2.g(h5.f10531a, c0167s).f3238c, c0168t, 0L).f3245a)) {
                pair = (z4 && i5 == 0 && h2.f10534d < h5.f10534d) ? new Pair(Boolean.TRUE, 0) : (z4 && i5 == 1 && z5) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
            } else {
                if (z4 && i5 == 0) {
                    i7 = 1;
                } else if (z4 && i5 == 1) {
                    i7 = 2;
                } else {
                    if (zEquals) {
                        throw new IllegalStateException();
                    }
                    i7 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i7));
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            c0150a = !i0Var.f6174a.p() ? i0Var.f6174a.m(i0Var.f6174a.g(i0Var.f6175b.f10531a, this.f5956n).f3238c, (C0168T) this.f1479a, 0L).f3247c : null;
            this.f5943c0 = C0153D.f3185B;
        } else {
            c0150a = null;
        }
        if (zBooleanValue || !i0Var2.f6182j.equals(i0Var.f6182j)) {
            C0152C c0152cA = this.f5943c0.a();
            List list = i0Var.f6182j;
            for (int i12 = 0; i12 < list.size(); i12++) {
                C0155F c0155f = (C0155F) list.get(i12);
                int i13 = 0;
                while (true) {
                    InterfaceC0154E[] interfaceC0154EArr = c0155f.f3211l;
                    if (i13 < interfaceC0154EArr.length) {
                        interfaceC0154EArr[i13].b(c0152cA);
                        i13++;
                    }
                }
            }
            this.f5943c0 = new C0153D(c0152cA);
        }
        C0153D c0153dR = r();
        boolean zEquals2 = c0153dR.equals(this.f5925L);
        this.f5925L = c0153dR;
        boolean z8 = i0Var2.f6184l != i0Var.f6184l;
        boolean z9 = i0Var2.f6178e != i0Var.f6178e;
        if (z9 || z8) {
            c0();
        }
        boolean z10 = i0Var2.f6180g != i0Var.f6180g;
        if (!zEquals) {
            final int i14 = 0;
            this.f5954l.c(0, new InterfaceC0356i() { // from class: h0.t
                @Override // d0.InterfaceC0356i
                public final void c(Object obj7) {
                    InterfaceC0162M interfaceC0162M = (InterfaceC0162M) obj7;
                    switch (i14) {
                        case 0:
                            interfaceC0162M.onTimelineChanged(((i0) i0Var).f6174a, i);
                            break;
                        default:
                            interfaceC0162M.onMediaItemTransition((C0150A) i0Var, i);
                            break;
                    }
                }
            });
        }
        if (z4) {
            C0167S c0167s2 = new C0167S();
            if (i0Var2.f6174a.p()) {
                z6 = z9;
                z7 = z10;
                i8 = i6;
                obj = null;
                c0150a2 = null;
                obj2 = null;
                i9 = -1;
            } else {
                Object obj7 = i0Var2.f6175b.f10531a;
                i0Var2.f6174a.g(obj7, c0167s2);
                int i15 = c0167s2.f3238c;
                int iB = i0Var2.f6174a.b(obj7);
                z6 = z9;
                z7 = z10;
                obj = i0Var2.f6174a.m(i15, (C0168T) this.f1479a, 0L).f3245a;
                c0150a2 = ((C0168T) this.f1479a).f3247c;
                i8 = i15;
                i9 = iB;
                obj2 = obj7;
            }
            if (i5 == 0) {
                if (i0Var2.f6175b.b()) {
                    x0.H h6 = i0Var2.f6175b;
                    jF = c0167s2.a(h6.f10532b, h6.f10533c);
                    jF2 = F(i0Var2);
                } else if (i0Var2.f6175b.f10535e != -1) {
                    jF = F(this.f5945d0);
                    jF2 = jF;
                } else {
                    j6 = c0167s2.f3240e;
                    j7 = c0167s2.f3239d;
                    jF = j6 + j7;
                    jF2 = jF;
                }
            } else if (i0Var2.f6175b.b()) {
                jF = i0Var2.f6191s;
                jF2 = F(i0Var2);
            } else {
                j6 = c0167s2.f3240e;
                j7 = i0Var2.f6191s;
                jF = j6 + j7;
                jF2 = jF;
            }
            long jZ = AbstractC0370w.Z(jF);
            long jZ2 = AbstractC0370w.Z(jF2);
            x0.H h7 = i0Var2.f6175b;
            final C0163N c0163n = new C0163N(obj, i8, c0150a2, obj2, i9, jZ, jZ2, h7.f10532b, h7.f10533c);
            int iW = w();
            if (this.f5945d0.f6174a.p()) {
                obj3 = null;
                c0150a3 = null;
                obj4 = null;
                i10 = -1;
            } else {
                i0 i0Var3 = this.f5945d0;
                Object obj8 = i0Var3.f6175b.f10531a;
                i0Var3.f6174a.g(obj8, this.f5956n);
                int iB2 = this.f5945d0.f6174a.b(obj8);
                AbstractC0169U abstractC0169U3 = this.f5945d0.f6174a;
                C0168T c0168t2 = (C0168T) this.f1479a;
                i10 = iB2;
                obj3 = abstractC0169U3.m(iW, c0168t2, 0L).f3245a;
                c0150a3 = c0168t2.f3247c;
                obj4 = obj8;
            }
            long jZ3 = AbstractC0370w.Z(j5);
            long jZ4 = this.f5945d0.f6175b.b() ? AbstractC0370w.Z(F(this.f5945d0)) : jZ3;
            x0.H h8 = this.f5945d0.f6175b;
            final C0163N c0163n2 = new C0163N(obj3, iW, c0150a3, obj4, i10, jZ3, jZ4, h8.f10532b, h8.f10533c);
            this.f5954l.c(11, new InterfaceC0356i() { // from class: h0.B
                @Override // d0.InterfaceC0356i
                public final void c(Object obj9) {
                    InterfaceC0162M interfaceC0162M = (InterfaceC0162M) obj9;
                    int i16 = i5;
                    interfaceC0162M.onPositionDiscontinuity(i16);
                    interfaceC0162M.onPositionDiscontinuity(c0163n, c0163n2, i16);
                }
            });
        } else {
            z6 = z9;
            z7 = z10;
        }
        if (zBooleanValue) {
            final int i16 = 1;
            this.f5954l.c(1, new InterfaceC0356i() { // from class: h0.t
                @Override // d0.InterfaceC0356i
                public final void c(Object obj72) {
                    InterfaceC0162M interfaceC0162M = (InterfaceC0162M) obj72;
                    switch (i16) {
                        case 0:
                            interfaceC0162M.onTimelineChanged(((i0) c0150a).f6174a, iIntValue);
                            break;
                        default:
                            interfaceC0162M.onMediaItemTransition((C0150A) c0150a, iIntValue);
                            break;
                    }
                }
            });
        }
        if (i0Var2.f6179f != i0Var.f6179f) {
            final int i17 = 7;
            this.f5954l.c(10, new InterfaceC0356i() { // from class: h0.u
                @Override // d0.InterfaceC0356i
                public final void c(Object obj9) {
                    InterfaceC0162M interfaceC0162M = (InterfaceC0162M) obj9;
                    switch (i17) {
                        case 0:
                            i0 i0Var4 = i0Var;
                            interfaceC0162M.onLoadingChanged(i0Var4.f6180g);
                            interfaceC0162M.onIsLoadingChanged(i0Var4.f6180g);
                            break;
                        case 1:
                            i0 i0Var5 = i0Var;
                            interfaceC0162M.onPlayerStateChanged(i0Var5.f6184l, i0Var5.f6178e);
                            break;
                        case 2:
                            interfaceC0162M.onPlaybackStateChanged(i0Var.f6178e);
                            break;
                        case 3:
                            i0 i0Var6 = i0Var;
                            interfaceC0162M.onPlayWhenReadyChanged(i0Var6.f6184l, i0Var6.f6185m);
                            break;
                        case 4:
                            interfaceC0162M.onPlaybackSuppressionReasonChanged(i0Var.f6186n);
                            break;
                        case 5:
                            interfaceC0162M.onIsPlayingChanged(i0Var.k());
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC0162M.onPlaybackParametersChanged(i0Var.f6187o);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC0162M.onPlayerErrorChanged(i0Var.f6179f);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            interfaceC0162M.onPlayerError(i0Var.f6179f);
                            break;
                        default:
                            interfaceC0162M.onTracksChanged(i0Var.i.f43d);
                            break;
                    }
                }
            });
            if (i0Var.f6179f != null) {
                final int i18 = 8;
                this.f5954l.c(10, new InterfaceC0356i() { // from class: h0.u
                    @Override // d0.InterfaceC0356i
                    public final void c(Object obj9) {
                        InterfaceC0162M interfaceC0162M = (InterfaceC0162M) obj9;
                        switch (i18) {
                            case 0:
                                i0 i0Var4 = i0Var;
                                interfaceC0162M.onLoadingChanged(i0Var4.f6180g);
                                interfaceC0162M.onIsLoadingChanged(i0Var4.f6180g);
                                break;
                            case 1:
                                i0 i0Var5 = i0Var;
                                interfaceC0162M.onPlayerStateChanged(i0Var5.f6184l, i0Var5.f6178e);
                                break;
                            case 2:
                                interfaceC0162M.onPlaybackStateChanged(i0Var.f6178e);
                                break;
                            case 3:
                                i0 i0Var6 = i0Var;
                                interfaceC0162M.onPlayWhenReadyChanged(i0Var6.f6184l, i0Var6.f6185m);
                                break;
                            case 4:
                                interfaceC0162M.onPlaybackSuppressionReasonChanged(i0Var.f6186n);
                                break;
                            case 5:
                                interfaceC0162M.onIsPlayingChanged(i0Var.k());
                                break;
                            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                                interfaceC0162M.onPlaybackParametersChanged(i0Var.f6187o);
                                break;
                            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                                interfaceC0162M.onPlayerErrorChanged(i0Var.f6179f);
                                break;
                            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                                interfaceC0162M.onPlayerError(i0Var.f6179f);
                                break;
                            default:
                                interfaceC0162M.onTracksChanged(i0Var.i.f43d);
                                break;
                        }
                    }
                });
            }
        }
        A0.A a5 = i0Var2.i;
        A0.A a6 = i0Var.i;
        if (a5 != a6) {
            A0.z zVar = this.f5951h;
            A0.y yVar = a6.f44e;
            zVar.getClass();
            final int i19 = 9;
            this.f5954l.c(2, new InterfaceC0356i() { // from class: h0.u
                @Override // d0.InterfaceC0356i
                public final void c(Object obj9) {
                    InterfaceC0162M interfaceC0162M = (InterfaceC0162M) obj9;
                    switch (i19) {
                        case 0:
                            i0 i0Var4 = i0Var;
                            interfaceC0162M.onLoadingChanged(i0Var4.f6180g);
                            interfaceC0162M.onIsLoadingChanged(i0Var4.f6180g);
                            break;
                        case 1:
                            i0 i0Var5 = i0Var;
                            interfaceC0162M.onPlayerStateChanged(i0Var5.f6184l, i0Var5.f6178e);
                            break;
                        case 2:
                            interfaceC0162M.onPlaybackStateChanged(i0Var.f6178e);
                            break;
                        case 3:
                            i0 i0Var6 = i0Var;
                            interfaceC0162M.onPlayWhenReadyChanged(i0Var6.f6184l, i0Var6.f6185m);
                            break;
                        case 4:
                            interfaceC0162M.onPlaybackSuppressionReasonChanged(i0Var.f6186n);
                            break;
                        case 5:
                            interfaceC0162M.onIsPlayingChanged(i0Var.k());
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC0162M.onPlaybackParametersChanged(i0Var.f6187o);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC0162M.onPlayerErrorChanged(i0Var.f6179f);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            interfaceC0162M.onPlayerError(i0Var.f6179f);
                            break;
                        default:
                            interfaceC0162M.onTracksChanged(i0Var.i.f43d);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.f5954l.c(14, new I2.g(this.f5925L, 6));
        }
        if (z7) {
            final int i20 = 0;
            this.f5954l.c(3, new InterfaceC0356i() { // from class: h0.u
                @Override // d0.InterfaceC0356i
                public final void c(Object obj9) {
                    InterfaceC0162M interfaceC0162M = (InterfaceC0162M) obj9;
                    switch (i20) {
                        case 0:
                            i0 i0Var4 = i0Var;
                            interfaceC0162M.onLoadingChanged(i0Var4.f6180g);
                            interfaceC0162M.onIsLoadingChanged(i0Var4.f6180g);
                            break;
                        case 1:
                            i0 i0Var5 = i0Var;
                            interfaceC0162M.onPlayerStateChanged(i0Var5.f6184l, i0Var5.f6178e);
                            break;
                        case 2:
                            interfaceC0162M.onPlaybackStateChanged(i0Var.f6178e);
                            break;
                        case 3:
                            i0 i0Var6 = i0Var;
                            interfaceC0162M.onPlayWhenReadyChanged(i0Var6.f6184l, i0Var6.f6185m);
                            break;
                        case 4:
                            interfaceC0162M.onPlaybackSuppressionReasonChanged(i0Var.f6186n);
                            break;
                        case 5:
                            interfaceC0162M.onIsPlayingChanged(i0Var.k());
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC0162M.onPlaybackParametersChanged(i0Var.f6187o);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC0162M.onPlayerErrorChanged(i0Var.f6179f);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            interfaceC0162M.onPlayerError(i0Var.f6179f);
                            break;
                        default:
                            interfaceC0162M.onTracksChanged(i0Var.i.f43d);
                            break;
                    }
                }
            });
        }
        if (z6 || z8) {
            final int i21 = 1;
            this.f5954l.c(-1, new InterfaceC0356i() { // from class: h0.u
                @Override // d0.InterfaceC0356i
                public final void c(Object obj9) {
                    InterfaceC0162M interfaceC0162M = (InterfaceC0162M) obj9;
                    switch (i21) {
                        case 0:
                            i0 i0Var4 = i0Var;
                            interfaceC0162M.onLoadingChanged(i0Var4.f6180g);
                            interfaceC0162M.onIsLoadingChanged(i0Var4.f6180g);
                            break;
                        case 1:
                            i0 i0Var5 = i0Var;
                            interfaceC0162M.onPlayerStateChanged(i0Var5.f6184l, i0Var5.f6178e);
                            break;
                        case 2:
                            interfaceC0162M.onPlaybackStateChanged(i0Var.f6178e);
                            break;
                        case 3:
                            i0 i0Var6 = i0Var;
                            interfaceC0162M.onPlayWhenReadyChanged(i0Var6.f6184l, i0Var6.f6185m);
                            break;
                        case 4:
                            interfaceC0162M.onPlaybackSuppressionReasonChanged(i0Var.f6186n);
                            break;
                        case 5:
                            interfaceC0162M.onIsPlayingChanged(i0Var.k());
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC0162M.onPlaybackParametersChanged(i0Var.f6187o);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC0162M.onPlayerErrorChanged(i0Var.f6179f);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            interfaceC0162M.onPlayerError(i0Var.f6179f);
                            break;
                        default:
                            interfaceC0162M.onTracksChanged(i0Var.i.f43d);
                            break;
                    }
                }
            });
        }
        if (z6) {
            final int i22 = 2;
            this.f5954l.c(4, new InterfaceC0356i() { // from class: h0.u
                @Override // d0.InterfaceC0356i
                public final void c(Object obj9) {
                    InterfaceC0162M interfaceC0162M = (InterfaceC0162M) obj9;
                    switch (i22) {
                        case 0:
                            i0 i0Var4 = i0Var;
                            interfaceC0162M.onLoadingChanged(i0Var4.f6180g);
                            interfaceC0162M.onIsLoadingChanged(i0Var4.f6180g);
                            break;
                        case 1:
                            i0 i0Var5 = i0Var;
                            interfaceC0162M.onPlayerStateChanged(i0Var5.f6184l, i0Var5.f6178e);
                            break;
                        case 2:
                            interfaceC0162M.onPlaybackStateChanged(i0Var.f6178e);
                            break;
                        case 3:
                            i0 i0Var6 = i0Var;
                            interfaceC0162M.onPlayWhenReadyChanged(i0Var6.f6184l, i0Var6.f6185m);
                            break;
                        case 4:
                            interfaceC0162M.onPlaybackSuppressionReasonChanged(i0Var.f6186n);
                            break;
                        case 5:
                            interfaceC0162M.onIsPlayingChanged(i0Var.k());
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC0162M.onPlaybackParametersChanged(i0Var.f6187o);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC0162M.onPlayerErrorChanged(i0Var.f6179f);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            interfaceC0162M.onPlayerError(i0Var.f6179f);
                            break;
                        default:
                            interfaceC0162M.onTracksChanged(i0Var.i.f43d);
                            break;
                    }
                }
            });
        }
        if (z8 || i0Var2.f6185m != i0Var.f6185m) {
            final int i23 = 3;
            this.f5954l.c(5, new InterfaceC0356i() { // from class: h0.u
                @Override // d0.InterfaceC0356i
                public final void c(Object obj9) {
                    InterfaceC0162M interfaceC0162M = (InterfaceC0162M) obj9;
                    switch (i23) {
                        case 0:
                            i0 i0Var4 = i0Var;
                            interfaceC0162M.onLoadingChanged(i0Var4.f6180g);
                            interfaceC0162M.onIsLoadingChanged(i0Var4.f6180g);
                            break;
                        case 1:
                            i0 i0Var5 = i0Var;
                            interfaceC0162M.onPlayerStateChanged(i0Var5.f6184l, i0Var5.f6178e);
                            break;
                        case 2:
                            interfaceC0162M.onPlaybackStateChanged(i0Var.f6178e);
                            break;
                        case 3:
                            i0 i0Var6 = i0Var;
                            interfaceC0162M.onPlayWhenReadyChanged(i0Var6.f6184l, i0Var6.f6185m);
                            break;
                        case 4:
                            interfaceC0162M.onPlaybackSuppressionReasonChanged(i0Var.f6186n);
                            break;
                        case 5:
                            interfaceC0162M.onIsPlayingChanged(i0Var.k());
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC0162M.onPlaybackParametersChanged(i0Var.f6187o);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC0162M.onPlayerErrorChanged(i0Var.f6179f);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            interfaceC0162M.onPlayerError(i0Var.f6179f);
                            break;
                        default:
                            interfaceC0162M.onTracksChanged(i0Var.i.f43d);
                            break;
                    }
                }
            });
        }
        if (i0Var2.f6186n != i0Var.f6186n) {
            final int i24 = 4;
            this.f5954l.c(6, new InterfaceC0356i() { // from class: h0.u
                @Override // d0.InterfaceC0356i
                public final void c(Object obj9) {
                    InterfaceC0162M interfaceC0162M = (InterfaceC0162M) obj9;
                    switch (i24) {
                        case 0:
                            i0 i0Var4 = i0Var;
                            interfaceC0162M.onLoadingChanged(i0Var4.f6180g);
                            interfaceC0162M.onIsLoadingChanged(i0Var4.f6180g);
                            break;
                        case 1:
                            i0 i0Var5 = i0Var;
                            interfaceC0162M.onPlayerStateChanged(i0Var5.f6184l, i0Var5.f6178e);
                            break;
                        case 2:
                            interfaceC0162M.onPlaybackStateChanged(i0Var.f6178e);
                            break;
                        case 3:
                            i0 i0Var6 = i0Var;
                            interfaceC0162M.onPlayWhenReadyChanged(i0Var6.f6184l, i0Var6.f6185m);
                            break;
                        case 4:
                            interfaceC0162M.onPlaybackSuppressionReasonChanged(i0Var.f6186n);
                            break;
                        case 5:
                            interfaceC0162M.onIsPlayingChanged(i0Var.k());
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC0162M.onPlaybackParametersChanged(i0Var.f6187o);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC0162M.onPlayerErrorChanged(i0Var.f6179f);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            interfaceC0162M.onPlayerError(i0Var.f6179f);
                            break;
                        default:
                            interfaceC0162M.onTracksChanged(i0Var.i.f43d);
                            break;
                    }
                }
            });
        }
        if (i0Var2.k() != i0Var.k()) {
            final int i25 = 5;
            this.f5954l.c(7, new InterfaceC0356i() { // from class: h0.u
                @Override // d0.InterfaceC0356i
                public final void c(Object obj9) {
                    InterfaceC0162M interfaceC0162M = (InterfaceC0162M) obj9;
                    switch (i25) {
                        case 0:
                            i0 i0Var4 = i0Var;
                            interfaceC0162M.onLoadingChanged(i0Var4.f6180g);
                            interfaceC0162M.onIsLoadingChanged(i0Var4.f6180g);
                            break;
                        case 1:
                            i0 i0Var5 = i0Var;
                            interfaceC0162M.onPlayerStateChanged(i0Var5.f6184l, i0Var5.f6178e);
                            break;
                        case 2:
                            interfaceC0162M.onPlaybackStateChanged(i0Var.f6178e);
                            break;
                        case 3:
                            i0 i0Var6 = i0Var;
                            interfaceC0162M.onPlayWhenReadyChanged(i0Var6.f6184l, i0Var6.f6185m);
                            break;
                        case 4:
                            interfaceC0162M.onPlaybackSuppressionReasonChanged(i0Var.f6186n);
                            break;
                        case 5:
                            interfaceC0162M.onIsPlayingChanged(i0Var.k());
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC0162M.onPlaybackParametersChanged(i0Var.f6187o);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC0162M.onPlayerErrorChanged(i0Var.f6179f);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            interfaceC0162M.onPlayerError(i0Var.f6179f);
                            break;
                        default:
                            interfaceC0162M.onTracksChanged(i0Var.i.f43d);
                            break;
                    }
                }
            });
        }
        if (!i0Var2.f6187o.equals(i0Var.f6187o)) {
            final int i26 = 6;
            this.f5954l.c(12, new InterfaceC0356i() { // from class: h0.u
                @Override // d0.InterfaceC0356i
                public final void c(Object obj9) {
                    InterfaceC0162M interfaceC0162M = (InterfaceC0162M) obj9;
                    switch (i26) {
                        case 0:
                            i0 i0Var4 = i0Var;
                            interfaceC0162M.onLoadingChanged(i0Var4.f6180g);
                            interfaceC0162M.onIsLoadingChanged(i0Var4.f6180g);
                            break;
                        case 1:
                            i0 i0Var5 = i0Var;
                            interfaceC0162M.onPlayerStateChanged(i0Var5.f6184l, i0Var5.f6178e);
                            break;
                        case 2:
                            interfaceC0162M.onPlaybackStateChanged(i0Var.f6178e);
                            break;
                        case 3:
                            i0 i0Var6 = i0Var;
                            interfaceC0162M.onPlayWhenReadyChanged(i0Var6.f6184l, i0Var6.f6185m);
                            break;
                        case 4:
                            interfaceC0162M.onPlaybackSuppressionReasonChanged(i0Var.f6186n);
                            break;
                        case 5:
                            interfaceC0162M.onIsPlayingChanged(i0Var.k());
                            break;
                        case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            interfaceC0162M.onPlaybackParametersChanged(i0Var.f6187o);
                            break;
                        case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            interfaceC0162M.onPlayerErrorChanged(i0Var.f6179f);
                            break;
                        case O.j.BYTES_FIELD_NUMBER /* 8 */:
                            interfaceC0162M.onPlayerError(i0Var.f6179f);
                            break;
                        default:
                            interfaceC0162M.onTracksChanged(i0Var.i.f43d);
                            break;
                    }
                }
            });
        }
        Z();
        this.f5954l.b();
        if (i0Var2.f6188p != i0Var.f6188p) {
            Iterator it = this.f5955m.iterator();
            while (it.hasNext()) {
                ((SurfaceHolderCallbackC0445D) it.next()).f5909l.c0();
            }
        }
    }

    public final void c0() {
        int iE = E();
        C0200z c0200z = this.f5914A;
        C0200z c0200z2 = this.f5967z;
        if (iE != 1) {
            if (iE == 2 || iE == 3) {
                d0();
                boolean z4 = this.f5945d0.f6188p;
                D();
                c0200z2.getClass();
                D();
                c0200z.getClass();
                return;
            }
            if (iE != 4) {
                throw new IllegalStateException();
            }
        }
        c0200z2.getClass();
        c0200z.getClass();
    }

    public final void d0() {
        F0.N n4 = this.f5944d;
        synchronized (n4) {
            boolean z4 = false;
            while (!n4.f715a) {
                try {
                    n4.wait();
                } catch (InterruptedException unused) {
                    z4 = true;
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f5961s.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f5961s.getThread().getName();
            int i = AbstractC0370w.f5326a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.f5936X) {
                throw new IllegalStateException(str);
            }
            AbstractC0360m.z("ExoPlayerImpl", str, this.f5937Y ? null : new IllegalStateException());
            this.f5937Y = true;
        }
    }

    @Override // L0.e
    public final void n(int i, long j5, boolean z4) {
        d0();
        if (i == -1) {
            return;
        }
        AbstractC0360m.c(i >= 0);
        AbstractC0169U abstractC0169U = this.f5945d0.f6174a;
        if (abstractC0169U.p() || i < abstractC0169U.o()) {
            i0.c cVar = this.f5960r;
            if (!cVar.f6370t) {
                C0477a c0477aG = cVar.g();
                cVar.f6370t = true;
                cVar.l(c0477aG, -1, new C0473y(28));
            }
            this.f5918E++;
            if (G()) {
                AbstractC0360m.y("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                K k4 = new K(this.f5945d0);
                k4.c(1);
                C0448G c0448g = this.f5952j.f5903l;
                c0448g.i.c(new D0.y(c0448g, 14, k4));
                return;
            }
            i0 i0VarG = this.f5945d0;
            int i5 = i0VarG.f6178e;
            if (i5 == 3 || (i5 == 4 && !abstractC0169U.p())) {
                i0VarG = this.f5945d0.g(2);
            }
            int iW = w();
            i0 i0VarH = H(i0VarG, abstractC0169U, I(abstractC0169U, i, j5));
            this.f5953k.f6032t.a(3, new M(abstractC0169U, i, AbstractC0370w.M(j5))).b();
            b0(i0VarH, 0, true, 1, y(i0VarH), iW, z4);
        }
    }

    public final ArrayList p(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            f0 f0Var = new f0((x0.J) list.get(i5), this.f5958p);
            arrayList.add(f0Var);
            this.f5957o.add(i5 + i, new C0447F(f0Var.f6123b, f0Var.f6122a));
        }
        this.f5922I = ((x0.i0) this.f5922I).b(i, arrayList.size());
        return arrayList;
    }

    public final void q(int i, List list) {
        d0();
        AbstractC0360m.c(i >= 0);
        ArrayList arrayList = this.f5957o;
        int iMin = Math.min(i, arrayList.size());
        if (arrayList.isEmpty()) {
            boolean z4 = this.f5947e0 == -1;
            d0();
            Q(list, -1, -9223372036854775807L, z4);
            return;
        }
        i0 i0Var = this.f5945d0;
        AbstractC0169U abstractC0169U = i0Var.f6174a;
        this.f5918E++;
        ArrayList arrayListP = p(iMin, list);
        n0 n0Var = new n0(arrayList, this.f5922I);
        i0 i0VarH = H(i0Var, n0Var, C(abstractC0169U, n0Var, A(i0Var), t(i0Var)));
        x0.j0 j0Var = this.f5922I;
        C0367t c0367t = this.f5953k.f6032t;
        I i5 = new I(arrayListP, j0Var, -1, -9223372036854775807L);
        c0367t.getClass();
        C0366s c0366sB = C0367t.b();
        c0366sB.f5319a = c0367t.f5321a.obtainMessage(18, iMin, 0, i5);
        c0366sB.b();
        b0(i0VarH, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final C0153D r() {
        AbstractC0169U abstractC0169UZ = z();
        if (abstractC0169UZ.p()) {
            return this.f5943c0;
        }
        C0150A c0150a = abstractC0169UZ.m(w(), (C0168T) this.f1479a, 0L).f3247c;
        C0152C c0152cA = this.f5943c0.a();
        C0153D c0153d = c0150a.f3156d;
        if (c0153d != null) {
            CharSequence charSequence = c0153d.f3187a;
            if (charSequence != null) {
                c0152cA.f3161a = charSequence;
            }
            CharSequence charSequence2 = c0153d.f3188b;
            if (charSequence2 != null) {
                c0152cA.f3162b = charSequence2;
            }
            CharSequence charSequence3 = c0153d.f3189c;
            if (charSequence3 != null) {
                c0152cA.f3163c = charSequence3;
            }
            CharSequence charSequence4 = c0153d.f3190d;
            if (charSequence4 != null) {
                c0152cA.f3164d = charSequence4;
            }
            CharSequence charSequence5 = c0153d.f3191e;
            if (charSequence5 != null) {
                c0152cA.f3165e = charSequence5;
            }
            byte[] bArr = c0153d.f3192f;
            if (bArr != null) {
                c0152cA.f3166f = bArr == null ? null : (byte[]) bArr.clone();
                c0152cA.f3167g = c0153d.f3193g;
            }
            Integer num = c0153d.f3194h;
            if (num != null) {
                c0152cA.f3168h = num;
            }
            Integer num2 = c0153d.i;
            if (num2 != null) {
                c0152cA.i = num2;
            }
            Integer num3 = c0153d.f3195j;
            if (num3 != null) {
                c0152cA.f3169j = num3;
            }
            Boolean bool = c0153d.f3196k;
            if (bool != null) {
                c0152cA.f3170k = bool;
            }
            Integer num4 = c0153d.f3197l;
            if (num4 != null) {
                c0152cA.f3171l = num4;
            }
            Integer num5 = c0153d.f3198m;
            if (num5 != null) {
                c0152cA.f3171l = num5;
            }
            Integer num6 = c0153d.f3199n;
            if (num6 != null) {
                c0152cA.f3172m = num6;
            }
            Integer num7 = c0153d.f3200o;
            if (num7 != null) {
                c0152cA.f3173n = num7;
            }
            Integer num8 = c0153d.f3201p;
            if (num8 != null) {
                c0152cA.f3174o = num8;
            }
            Integer num9 = c0153d.f3202q;
            if (num9 != null) {
                c0152cA.f3175p = num9;
            }
            Integer num10 = c0153d.f3203r;
            if (num10 != null) {
                c0152cA.f3176q = num10;
            }
            CharSequence charSequence6 = c0153d.f3204s;
            if (charSequence6 != null) {
                c0152cA.f3177r = charSequence6;
            }
            CharSequence charSequence7 = c0153d.f3205t;
            if (charSequence7 != null) {
                c0152cA.f3178s = charSequence7;
            }
            CharSequence charSequence8 = c0153d.f3206u;
            if (charSequence8 != null) {
                c0152cA.f3179t = charSequence8;
            }
            Integer num11 = c0153d.f3207v;
            if (num11 != null) {
                c0152cA.f3180u = num11;
            }
            Integer num12 = c0153d.f3208w;
            if (num12 != null) {
                c0152cA.f3181v = num12;
            }
            CharSequence charSequence9 = c0153d.f3209x;
            if (charSequence9 != null) {
                c0152cA.f3182w = charSequence9;
            }
            CharSequence charSequence10 = c0153d.y;
            if (charSequence10 != null) {
                c0152cA.f3183x = charSequence10;
            }
            Integer num13 = c0153d.f3210z;
            if (num13 != null) {
                c0152cA.y = num13;
            }
            m2.I i = c0153d.f3186A;
            if (!i.isEmpty()) {
                c0152cA.f3184z = m2.I.p(i);
            }
        }
        return new C0153D(c0152cA);
    }

    public final long s() {
        d0();
        if (G()) {
            i0 i0Var = this.f5945d0;
            return i0Var.f6183k.equals(i0Var.f6175b) ? AbstractC0370w.Z(this.f5945d0.f6189q) : B();
        }
        d0();
        if (this.f5945d0.f6174a.p()) {
            return this.f5949f0;
        }
        i0 i0Var2 = this.f5945d0;
        long j5 = 0;
        if (i0Var2.f6183k.f10534d != i0Var2.f6175b.f10534d) {
            return AbstractC0370w.Z(i0Var2.f6174a.m(w(), (C0168T) this.f1479a, 0L).f3256m);
        }
        long j6 = i0Var2.f6189q;
        if (this.f5945d0.f6183k.b()) {
            i0 i0Var3 = this.f5945d0;
            i0Var3.f6174a.g(i0Var3.f6183k.f10531a, this.f5956n).d(this.f5945d0.f6183k.f10532b);
        } else {
            j5 = j6;
        }
        i0 i0Var4 = this.f5945d0;
        AbstractC0169U abstractC0169U = i0Var4.f6174a;
        Object obj = i0Var4.f6183k.f10531a;
        C0167S c0167s = this.f5956n;
        abstractC0169U.g(obj, c0167s);
        return AbstractC0370w.Z(j5 + c0167s.f3240e);
    }

    public final long t(i0 i0Var) {
        if (!i0Var.f6175b.b()) {
            return AbstractC0370w.Z(y(i0Var));
        }
        Object obj = i0Var.f6175b.f10531a;
        AbstractC0169U abstractC0169U = i0Var.f6174a;
        C0167S c0167s = this.f5956n;
        abstractC0169U.g(obj, c0167s);
        long j5 = i0Var.f6176c;
        return j5 == -9223372036854775807L ? AbstractC0370w.Z(abstractC0169U.m(A(i0Var), (C0168T) this.f1479a, 0L).f3255l) : AbstractC0370w.Z(c0167s.f3240e) + AbstractC0370w.Z(j5);
    }

    public final int u() {
        d0();
        if (G()) {
            return this.f5945d0.f6175b.f10532b;
        }
        return -1;
    }

    public final int v() {
        d0();
        if (G()) {
            return this.f5945d0.f6175b.f10533c;
        }
        return -1;
    }

    public final int w() {
        d0();
        int iA = A(this.f5945d0);
        if (iA == -1) {
            return 0;
        }
        return iA;
    }

    public final long x() {
        d0();
        return AbstractC0370w.Z(y(this.f5945d0));
    }

    public final long y(i0 i0Var) {
        if (i0Var.f6174a.p()) {
            return AbstractC0370w.M(this.f5949f0);
        }
        long j5 = i0Var.f6188p ? i0Var.j() : i0Var.f6191s;
        if (i0Var.f6175b.b()) {
            return j5;
        }
        AbstractC0169U abstractC0169U = i0Var.f6174a;
        Object obj = i0Var.f6175b.f10531a;
        C0167S c0167s = this.f5956n;
        abstractC0169U.g(obj, c0167s);
        return j5 + c0167s.f3240e;
    }

    public final AbstractC0169U z() {
        d0();
        return this.f5945d0.f6174a;
    }
}
