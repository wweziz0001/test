package x0;

import a0.AbstractC0156G;
import a0.C0155F;
import a0.C0157H;
import a0.C0170V;
import a0.C0189o;
import a0.C0190p;
import android.net.Uri;
import android.os.Handler;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import f0.C0414i;
import f0.C0424s;
import f0.InterfaceC0413h;
import h0.t0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements F, F0.s, B0.m, B0.p, d0 {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final Map f10588a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final C0190p f10589b0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final T f10590A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Handler f10591B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public InterfaceC0959E f10592C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public S0.b f10593D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public e0[] f10594E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public X[] f10595F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f10596G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f10597H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f10598I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f10599J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Z1.i f10600K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public F0.E f10601L;
    public long M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f10602N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f10603O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f10604P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f10605Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f10606R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f10607S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f10608T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public long f10609U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public long f10610V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f10611W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f10612X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f10613Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f10614Z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Uri f10615l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC0413h f10616m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m0.i f10617n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final A0.b f10618o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m0.e f10619p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m0.e f10620q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a0 f10621r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final B0.f f10622s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f10623t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f10624u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f10625v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final B0.r f10626w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Z1.m f10627x;
    public final F0.N y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final T f10628z;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f10588a0 = Collections.unmodifiableMap(map);
        C0189o c0189o = new C0189o();
        c0189o.f3376a = "icy";
        c0189o.f3387m = AbstractC0156G.m("application/x-icy");
        f10589b0 = new C0190p(c0189o);
    }

    public Y(Uri uri, InterfaceC0413h interfaceC0413h, Z1.m mVar, m0.i iVar, m0.e eVar, A0.b bVar, m0.e eVar2, a0 a0Var, B0.f fVar, int i, boolean z4, long j5, C0.a aVar) {
        this.f10615l = uri;
        this.f10616m = interfaceC0413h;
        this.f10617n = iVar;
        this.f10620q = eVar;
        this.f10618o = bVar;
        this.f10619p = eVar2;
        this.f10621r = a0Var;
        this.f10622s = fVar;
        this.f10623t = i;
        this.f10624u = z4;
        this.f10626w = aVar != null ? new B0.r(aVar) : new B0.r("ProgressiveMediaPeriod");
        this.f10627x = mVar;
        this.f10625v = j5;
        this.y = new F0.N();
        this.f10628z = new T(this, 0);
        this.f10590A = new T(this, 1);
        this.f10591B = AbstractC0370w.m(null);
        this.f10595F = new X[0];
        this.f10594E = new e0[0];
        this.f10610V = -9223372036854775807L;
        this.f10603O = 1;
    }

    public final void A(int i) {
        a();
        Z1.i iVar = this.f10600K;
        boolean[] zArr = (boolean[]) iVar.f3015o;
        if (zArr[i]) {
            return;
        }
        C0190p c0190p = ((q0) iVar.f3012l).a(i).f3264d[0];
        this.f10619p.b(AbstractC0156G.h(c0190p.f3424n), c0190p, 0, null, this.f10609U);
        zArr[i] = true;
    }

    public final void B(int i) {
        a();
        boolean[] zArr = (boolean[]) this.f10600K.f3013m;
        if (this.f10611W && zArr[i] && !this.f10594E[i].s(false)) {
            this.f10610V = 0L;
            this.f10611W = false;
            this.f10605Q = true;
            this.f10609U = 0L;
            this.f10612X = 0;
            for (e0 e0Var : this.f10594E) {
                e0Var.z(false);
            }
            InterfaceC0959E interfaceC0959E = this.f10592C;
            interfaceC0959E.getClass();
            interfaceC0959E.d(this);
        }
    }

    public final F0.K C(X x4) {
        int length = this.f10594E.length;
        for (int i = 0; i < length; i++) {
            if (x4.equals(this.f10595F[i])) {
                return this.f10594E[i];
            }
        }
        if (this.f10596G) {
            AbstractC0360m.y("ProgressiveMediaPeriod", "Extractor added new track (id=" + x4.f10586a + ") after finishing tracks.");
            return new F0.o();
        }
        m0.e eVar = this.f10620q;
        m0.i iVar = this.f10617n;
        iVar.getClass();
        e0 e0Var = new e0(this.f10622s, iVar, eVar);
        e0Var.f10687f = this;
        int i5 = length + 1;
        X[] xArr = (X[]) Arrays.copyOf(this.f10595F, i5);
        xArr[length] = x4;
        int i6 = AbstractC0370w.f5326a;
        this.f10595F = xArr;
        e0[] e0VarArr = (e0[]) Arrays.copyOf(this.f10594E, i5);
        e0VarArr[length] = e0Var;
        this.f10594E = e0VarArr;
        return e0Var;
    }

    public final void D(F0.E e5) {
        this.f10601L = this.f10593D == null ? e5 : new F0.v(-9223372036854775807L);
        this.M = e5.i();
        boolean z4 = !this.f10608T && e5.i() == -9223372036854775807L;
        this.f10602N = z4;
        this.f10603O = z4 ? 7 : 1;
        if (this.f10597H) {
            this.f10621r.x(this.M, e5.c(), this.f10602N);
        } else {
            z();
        }
    }

    public final void E() {
        V v4 = new V(this, this.f10615l, this.f10616m, this.f10627x, this, this.y);
        if (this.f10597H) {
            AbstractC0360m.h(y());
            long j5 = this.M;
            if (j5 != -9223372036854775807L && this.f10610V > j5) {
                this.f10613Y = true;
                this.f10610V = -9223372036854775807L;
                return;
            }
            F0.E e5 = this.f10601L;
            e5.getClass();
            long j6 = e5.g(this.f10610V).f687a.f691b;
            long j7 = this.f10610V;
            v4.f10577r.f817a = j6;
            v4.f10580u = j7;
            v4.f10579t = true;
            v4.f10583x = false;
            for (e0 e0Var : this.f10594E) {
                e0Var.f10700t = this.f10610V;
            }
            this.f10610V = -9223372036854775807L;
        }
        this.f10612X = w();
        this.f10619p.h(new C0984z(v4.f10571l, v4.f10581v, this.f10626w.f(v4, this, this.f10618o.o(this.f10603O))), 1, -1, null, 0, null, v4.f10580u, this.M);
    }

    public final boolean F() {
        return this.f10605Q || y();
    }

    public final void a() {
        AbstractC0360m.h(this.f10597H);
        this.f10600K.getClass();
        this.f10601L.getClass();
    }

    @Override // x0.F
    public final long b(long j5, t0 t0Var) {
        a();
        if (!this.f10601L.c()) {
            return 0L;
        }
        F0.D dG = this.f10601L.g(j5);
        return t0Var.a(j5, dG.f687a.f690a, dG.f688b.f690a);
    }

    @Override // x0.h0
    public final boolean c() {
        boolean z4;
        if (this.f10626w.d()) {
            F0.N n4 = this.y;
            synchronized (n4) {
                z4 = n4.f715a;
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    @Override // F0.s
    public final void d(F0.E e5) {
        this.f10591B.post(new D0.y(this, 25, e5));
    }

    @Override // x0.F
    public final q0 e() {
        a();
        return (q0) this.f10600K.f3012l;
    }

    @Override // x0.F
    public final long f(A0.w[] wVarArr, boolean[] zArr, f0[] f0VarArr, boolean[] zArr2, long j5) {
        A0.w wVar;
        a();
        Z1.i iVar = this.f10600K;
        q0 q0Var = (q0) iVar.f3012l;
        boolean[] zArr3 = (boolean[]) iVar.f3014n;
        int i = this.f10607S;
        int i5 = 0;
        for (int i6 = 0; i6 < wVarArr.length; i6++) {
            f0 f0Var = f0VarArr[i6];
            if (f0Var != null && (wVarArr[i6] == null || !zArr[i6])) {
                int i7 = ((W) f0Var).f10584l;
                AbstractC0360m.h(zArr3[i7]);
                this.f10607S--;
                zArr3[i7] = false;
                f0VarArr[i6] = null;
            }
        }
        boolean z4 = !this.f10604P ? j5 == 0 || this.f10599J : i != 0;
        for (int i8 = 0; i8 < wVarArr.length; i8++) {
            if (f0VarArr[i8] == null && (wVar = wVarArr[i8]) != null) {
                AbstractC0360m.h(wVar.length() == 1);
                AbstractC0360m.h(wVar.k(0) == 0);
                int iB = q0Var.b(wVar.b());
                AbstractC0360m.h(!zArr3[iB]);
                this.f10607S++;
                zArr3[iB] = true;
                this.f10606R = wVar.d().f3430t | this.f10606R;
                f0VarArr[i8] = new W(this, iB);
                zArr2[i8] = true;
                if (!z4) {
                    e0 e0Var = this.f10594E[iB];
                    z4 = (e0Var.n() == 0 || e0Var.B(j5, true)) ? false : true;
                }
            }
        }
        if (this.f10607S == 0) {
            this.f10611W = false;
            this.f10605Q = false;
            this.f10606R = false;
            B0.r rVar = this.f10626w;
            if (rVar.d()) {
                e0[] e0VarArr = this.f10594E;
                int length = e0VarArr.length;
                while (i5 < length) {
                    e0VarArr[i5].g();
                    i5++;
                }
                rVar.b();
            } else {
                this.f10613Y = false;
                for (e0 e0Var2 : this.f10594E) {
                    e0Var2.z(false);
                }
            }
        } else if (z4) {
            j5 = o(j5);
            while (i5 < f0VarArr.length) {
                if (f0VarArr[i5] != null) {
                    zArr2[i5] = true;
                }
                i5++;
            }
        }
        this.f10604P = true;
        return j5;
    }

    @Override // B0.p
    public final void g() {
        for (e0 e0Var : this.f10594E) {
            e0Var.y();
        }
        Z1.m mVar = this.f10627x;
        F0.q qVar = (F0.q) mVar.f3025n;
        if (qVar != null) {
            qVar.release();
            mVar.f3025n = null;
        }
        mVar.f3026o = null;
    }

    @Override // x0.h0
    public final long h() {
        long jX;
        boolean z4;
        a();
        if (this.f10613Y || this.f10607S == 0) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.f10610V;
        }
        if (this.f10598I) {
            int length = this.f10594E.length;
            jX = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                Z1.i iVar = this.f10600K;
                if (((boolean[]) iVar.f3013m)[i] && ((boolean[]) iVar.f3014n)[i]) {
                    e0 e0Var = this.f10594E[i];
                    synchronized (e0Var) {
                        z4 = e0Var.f10703w;
                    }
                    if (!z4) {
                        jX = Math.min(jX, this.f10594E[i].l());
                    }
                }
            }
        } else {
            jX = Long.MAX_VALUE;
        }
        if (jX == Long.MAX_VALUE) {
            jX = x(false);
        }
        return jX == Long.MIN_VALUE ? this.f10609U : jX;
    }

    @Override // B0.m
    public final void i(B0.o oVar, long j5, long j6) {
        F0.E e5;
        V v4 = (V) oVar;
        if (this.M == -9223372036854775807L && (e5 = this.f10601L) != null) {
            boolean zC = e5.c();
            long jX = x(true);
            long j7 = jX == Long.MIN_VALUE ? 0L : jX + 10000;
            this.M = j7;
            this.f10621r.x(j7, zC, this.f10602N);
        }
        Uri uri = v4.f10573n.f5735n;
        C0984z c0984z = new C0984z(j6);
        this.f10618o.getClass();
        this.f10619p.e(c0984z, 1, -1, null, 0, null, v4.f10580u, this.M);
        this.f10613Y = true;
        InterfaceC0959E interfaceC0959E = this.f10592C;
        interfaceC0959E.getClass();
        interfaceC0959E.d(this);
    }

    @Override // F0.s
    public final void j() {
        this.f10596G = true;
        this.f10591B.post(this.f10628z);
    }

    @Override // F0.s
    public final F0.K k(int i, int i5) {
        return C(new X(i, false));
    }

    @Override // x0.F
    public final void l() throws IOException {
        int iO;
        B0.r rVar;
        IOException iOException;
        try {
            iO = this.f10618o.o(this.f10603O);
            rVar = this.f10626w;
            iOException = rVar.f244n;
        } catch (IOException e5) {
            if (!this.f10624u) {
                throw e5;
            }
            AbstractC0360m.m("ProgressiveMediaPeriod", "Suppressing preparation error because suppressPrepareError=true", e5);
            this.f10596G = true;
            D(new F0.v(-9223372036854775807L));
        }
        if (iOException != null) {
            throw iOException;
        }
        B0.n nVar = rVar.f243m;
        if (nVar != null) {
            if (iO == Integer.MIN_VALUE) {
                iO = nVar.f229l;
            }
            IOException iOException2 = nVar.f233p;
            if (iOException2 != null && nVar.f234q > iO) {
                throw iOException2;
            }
        }
        if (this.f10613Y && !this.f10597H) {
            throw C0157H.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // x0.d0
    public final void m() {
        this.f10591B.post(this.f10628z);
    }

    @Override // B0.m
    public final B0.k n(B0.o oVar, long j5, long j6, IOException iOException, int i) {
        long jMin;
        B0.k kVar;
        F0.E e5;
        V v4 = (V) oVar;
        Uri uri = v4.f10573n.f5735n;
        C0984z c0984z = new C0984z(j6);
        int i5 = AbstractC0370w.f5326a;
        this.f10618o.getClass();
        if ((iOException instanceof C0157H) || (iOException instanceof FileNotFoundException) || (iOException instanceof C0424s) || (iOException instanceof B0.q)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i6 = C0414i.f5672m;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C0414i) && ((C0414i) cause).f5673l == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            kVar = B0.r.f241q;
        } else {
            int iW = w();
            int i7 = iW > this.f10612X ? 1 : 0;
            if (this.f10608T || !((e5 = this.f10601L) == null || e5.i() == -9223372036854775807L)) {
                this.f10612X = iW;
            } else if (!this.f10597H || F()) {
                this.f10605Q = this.f10597H;
                this.f10609U = 0L;
                this.f10612X = 0;
                for (e0 e0Var : this.f10594E) {
                    e0Var.z(false);
                }
                v4.f10577r.f817a = 0L;
                v4.f10580u = 0L;
                v4.f10579t = true;
                v4.f10583x = false;
            } else {
                this.f10611W = true;
                kVar = B0.r.f240p;
            }
            kVar = new B0.k(i7, jMin, false);
        }
        B0.k kVar2 = kVar;
        this.f10619p.f(c0984z, 1, -1, null, 0, null, v4.f10580u, this.M, iOException, !kVar2.a());
        return kVar2;
    }

    @Override // x0.F
    public final long o(long j5) {
        a();
        boolean[] zArr = (boolean[]) this.f10600K.f3013m;
        if (!this.f10601L.c()) {
            j5 = 0;
        }
        this.f10605Q = false;
        boolean z4 = true;
        boolean z5 = this.f10609U == j5;
        this.f10609U = j5;
        if (y()) {
            this.f10610V = j5;
            return j5;
        }
        int i = this.f10603O;
        B0.r rVar = this.f10626w;
        if (i != 7 && (this.f10613Y || rVar.d())) {
            int length = this.f10594E.length;
            for (int i5 = 0; i5 < length; i5++) {
                e0 e0Var = this.f10594E[i5];
                if (e0Var.n() != 0 || !z5) {
                    if (!(this.f10599J ? e0Var.A(e0Var.f10697q) : e0Var.B(j5, false)) && (zArr[i5] || !this.f10598I)) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4) {
                return j5;
            }
        }
        this.f10611W = false;
        this.f10610V = j5;
        this.f10613Y = false;
        this.f10606R = false;
        if (rVar.d()) {
            for (e0 e0Var2 : this.f10594E) {
                e0Var2.g();
            }
            rVar.b();
        } else {
            rVar.f244n = null;
            for (e0 e0Var3 : this.f10594E) {
                e0Var3.z(false);
            }
        }
        return j5;
    }

    @Override // x0.F
    public final void p(long j5) {
        if (this.f10599J) {
            return;
        }
        a();
        if (y()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f10600K.f3014n;
        int length = this.f10594E.length;
        for (int i = 0; i < length; i++) {
            this.f10594E[i].f(j5, zArr[i]);
        }
    }

    @Override // B0.m
    public final void q(B0.o oVar, long j5, long j6, boolean z4) {
        V v4 = (V) oVar;
        Uri uri = v4.f10573n.f5735n;
        C0984z c0984z = new C0984z(j6);
        this.f10618o.getClass();
        this.f10619p.c(c0984z, 1, -1, null, 0, null, v4.f10580u, this.M);
        if (z4) {
            return;
        }
        for (e0 e0Var : this.f10594E) {
            e0Var.z(false);
        }
        if (this.f10607S > 0) {
            InterfaceC0959E interfaceC0959E = this.f10592C;
            interfaceC0959E.getClass();
            interfaceC0959E.d(this);
        }
    }

    @Override // x0.h0
    public final long r() {
        return h();
    }

    @Override // x0.F
    public final long s() {
        if (this.f10606R) {
            this.f10606R = false;
            return this.f10609U;
        }
        if (!this.f10605Q) {
            return -9223372036854775807L;
        }
        if (!this.f10613Y && w() <= this.f10612X) {
            return -9223372036854775807L;
        }
        this.f10605Q = false;
        return this.f10609U;
    }

    @Override // x0.F
    public final void t(InterfaceC0959E interfaceC0959E, long j5) {
        this.f10592C = interfaceC0959E;
        this.y.a();
        E();
    }

    @Override // x0.h0
    public final boolean v(h0.T t4) {
        if (this.f10613Y) {
            return false;
        }
        B0.r rVar = this.f10626w;
        if (rVar.c() || this.f10611W) {
            return false;
        }
        if (this.f10597H && this.f10607S == 0) {
            return false;
        }
        boolean zA = this.y.a();
        if (rVar.d()) {
            return zA;
        }
        E();
        return true;
    }

    public final int w() {
        int i = 0;
        for (e0 e0Var : this.f10594E) {
            i += e0Var.f10697q + e0Var.f10696p;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long x(boolean r6) {
        /*
            r5 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            x0.e0[] r3 = r5.f10594E
            int r3 = r3.length
            if (r2 >= r3) goto L26
            if (r6 != 0) goto L17
            Z1.i r3 = r5.f10600K
            r3.getClass()
            java.lang.Object r3 = r3.f3014n
            boolean[] r3 = (boolean[]) r3
            boolean r3 = r3[r2]
            if (r3 == 0) goto L23
        L17:
            x0.e0[] r3 = r5.f10594E
            r3 = r3[r2]
            long r3 = r3.l()
            long r0 = java.lang.Math.max(r0, r3)
        L23:
            int r2 = r2 + 1
            goto L3
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.Y.x(boolean):long");
    }

    public final boolean y() {
        return this.f10610V != -9223372036854775807L;
    }

    public final void z() {
        long j5;
        int i;
        if (this.f10614Z || this.f10597H || !this.f10596G || this.f10601L == null) {
            return;
        }
        for (e0 e0Var : this.f10594E) {
            if (e0Var.q() == null) {
                return;
            }
        }
        F0.N n4 = this.y;
        synchronized (n4) {
            n4.f715a = false;
        }
        int length = this.f10594E.length;
        C0170V[] c0170vArr = new C0170V[length];
        boolean[] zArr = new boolean[length];
        int i5 = 0;
        while (true) {
            j5 = this.f10625v;
            if (i5 >= length) {
                break;
            }
            C0190p c0190pQ = this.f10594E[i5].q();
            c0190pQ.getClass();
            String str = c0190pQ.f3424n;
            boolean zI = AbstractC0156G.i(str);
            boolean z4 = zI || AbstractC0156G.l(str);
            zArr[i5] = z4;
            this.f10598I = z4 | this.f10598I;
            this.f10599J = j5 != -9223372036854775807L && length == 1 && AbstractC0156G.j(str);
            S0.b bVar = this.f10593D;
            if (bVar != null) {
                if (zI || this.f10595F[i5].f10587b) {
                    C0155F c0155f = c0190pQ.f3422l;
                    C0155F c0155f2 = c0155f == null ? new C0155F(bVar) : c0155f.d(bVar);
                    C0189o c0189oA = c0190pQ.a();
                    c0189oA.f3385k = c0155f2;
                    c0190pQ = new C0190p(c0189oA);
                }
                if (zI && c0190pQ.f3419h == -1 && c0190pQ.i == -1 && (i = bVar.f1987l) != -1) {
                    C0189o c0189oA2 = c0190pQ.a();
                    c0189oA2.f3383h = i;
                    c0190pQ = new C0190p(c0189oA2);
                }
            }
            int iB = this.f10617n.b(c0190pQ);
            C0189o c0189oA3 = c0190pQ.a();
            c0189oA3.f3375K = iB;
            C0190p c0190p = new C0190p(c0189oA3);
            c0170vArr[i5] = new C0170V(Integer.toString(i5), c0190p);
            this.f10606R = c0190p.f3430t | this.f10606R;
            i5++;
        }
        q0 q0Var = new q0(c0170vArr);
        Z1.i iVar = new Z1.i();
        iVar.f3012l = q0Var;
        iVar.f3013m = zArr;
        int i6 = q0Var.f10776a;
        iVar.f3014n = new boolean[i6];
        iVar.f3015o = new boolean[i6];
        this.f10600K = iVar;
        if (this.f10599J && this.M == -9223372036854775807L) {
            this.M = j5;
            this.f10601L = new U(this, this.f10601L);
        }
        this.f10621r.x(this.M, this.f10601L.c(), this.f10602N);
        this.f10597H = true;
        InterfaceC0959E interfaceC0959E = this.f10592C;
        interfaceC0959E.getClass();
        interfaceC0959E.a(this);
    }

    @Override // x0.h0
    public final void u(long j5) {
    }
}
