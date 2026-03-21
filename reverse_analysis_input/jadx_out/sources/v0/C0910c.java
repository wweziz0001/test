package v0;

import B0.f;
import B0.k;
import B0.m;
import B0.o;
import B0.q;
import B0.r;
import B0.s;
import B0.t;
import B0.u;
import a0.AbstractC0151B;
import a0.C0150A;
import a0.C0157H;
import a0.C0197w;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import f0.C0414i;
import f0.C0424s;
import f0.InterfaceC0403A;
import f0.InterfaceC0412g;
import f0.InterfaceC0413h;
import h0.C0452c;
import i0.j;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import m0.e;
import m0.i;
import x0.AbstractC0960a;
import x0.C0984z;
import x0.F;
import x0.H;
import x0.InterfaceC0959E;
import x0.n0;
import y0.C1000h;

/* JADX INFO: renamed from: v0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0910c extends AbstractC0960a implements m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final e f10326A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f10327B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ArrayList f10328C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public InterfaceC0413h f10329D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public r f10330E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public s f10331F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public InterfaceC0403A f10332G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f10333H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public w0.c f10334I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Handler f10335J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C0150A f10336K;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f10337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Uri f10338t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC0412g f10339u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0452c f10340v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p1.b f10341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i f10342x;
    public final A0.b y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f10343z;

    static {
        AbstractC0151B.a("media3.exoplayer.smoothstreaming");
    }

    public C0910c(C0150A c0150a, InterfaceC0412g interfaceC0412g, t tVar, C0452c c0452c, p1.b bVar, i iVar, A0.b bVar2, long j5) {
        this.f10336K = c0150a;
        C0197w c0197w = c0150a.f3154b;
        c0197w.getClass();
        this.f10334I = null;
        Uri uri = Uri.EMPTY;
        Uri uriWithAppendedPath = c0197w.f3460a;
        if (uriWithAppendedPath.equals(uri)) {
            uriWithAppendedPath = null;
        } else {
            String path = uriWithAppendedPath.getPath();
            if (path != null) {
                Matcher matcher = AbstractC0370w.f5334j.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uriWithAppendedPath = Uri.withAppendedPath(uriWithAppendedPath, "Manifest");
                }
            }
        }
        this.f10338t = uriWithAppendedPath;
        this.f10339u = interfaceC0412g;
        this.f10327B = tVar;
        this.f10340v = c0452c;
        this.f10341w = bVar;
        this.f10342x = iVar;
        this.y = bVar2;
        this.f10343z = j5;
        this.f10326A = h(null);
        this.f10337s = false;
        this.f10328C = new ArrayList();
    }

    @Override // x0.J
    public final synchronized C0150A a() {
        return this.f10336K;
    }

    @Override // x0.J
    public final synchronized void b(C0150A c0150a) {
        this.f10336K = c0150a;
    }

    @Override // x0.J
    public final F c(H h2, f fVar, long j5) {
        e eVarH = h(h2);
        e eVar = new e(this.f10637o.f8498c, 0, h2);
        w0.c cVar = this.f10334I;
        InterfaceC0403A interfaceC0403A = this.f10332G;
        s sVar = this.f10331F;
        C0909b c0909b = new C0909b(cVar, this.f10340v, interfaceC0403A, this.f10341w, this.f10342x, eVar, this.y, eVarH, sVar, fVar);
        this.f10328C.add(c0909b);
        return c0909b;
    }

    @Override // x0.J
    public final void d(F f2) {
        C0909b c0909b = (C0909b) f2;
        for (C1000h c1000h : c0909b.f10325x) {
            c1000h.A(null);
        }
        c0909b.f10323v = null;
        this.f10328C.remove(f2);
    }

    @Override // x0.J
    public final void e() {
        this.f10331F.a();
    }

    @Override // B0.m
    public final void i(o oVar, long j5, long j6) {
        u uVar = (u) oVar;
        long j7 = uVar.f245l;
        Uri uri = uVar.f248o.f5735n;
        C0984z c0984z = new C0984z(j6);
        this.y.getClass();
        this.f10326A.d(c0984z, uVar.f247n);
        this.f10334I = (w0.c) uVar.f250q;
        this.f10333H = j5 - j6;
        w();
        if (this.f10334I.f10445d) {
            this.f10335J.postDelayed(new A3.c(this, 21), Math.max(0L, (this.f10333H + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // B0.m
    public final k n(o oVar, long j5, long j6, IOException iOException, int i) {
        long jMin;
        u uVar = (u) oVar;
        long j7 = uVar.f245l;
        Uri uri = uVar.f248o.f5735n;
        C0984z c0984z = new C0984z(j6);
        this.y.getClass();
        if ((iOException instanceof C0157H) || (iOException instanceof FileNotFoundException) || (iOException instanceof C0424s) || (iOException instanceof q)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i5 = C0414i.f5672m;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C0414i) && ((C0414i) cause).f5673l == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        k kVar = jMin == -9223372036854775807L ? r.f241q : new k(0, jMin, false);
        this.f10326A.g(c0984z, uVar.f247n, iOException, !kVar.a());
        return kVar;
    }

    @Override // x0.AbstractC0960a
    public final void p(InterfaceC0403A interfaceC0403A) {
        this.f10332G = interfaceC0403A;
        Looper looperMyLooper = Looper.myLooper();
        j jVar = this.f10640r;
        AbstractC0360m.i(jVar);
        i iVar = this.f10342x;
        iVar.a(looperMyLooper, jVar);
        iVar.c();
        if (this.f10337s) {
            this.f10331F = new A0.b(2);
            w();
            return;
        }
        this.f10329D = this.f10339u.a();
        r rVar = new r("SsMediaSource");
        this.f10330E = rVar;
        this.f10331F = rVar;
        this.f10335J = AbstractC0370w.m(null);
        x();
    }

    @Override // B0.m
    public final void q(o oVar, long j5, long j6, boolean z4) {
        u uVar = (u) oVar;
        long j7 = uVar.f245l;
        Uri uri = uVar.f248o.f5735n;
        C0984z c0984z = new C0984z(j6);
        this.y.getClass();
        this.f10326A.c(c0984z, uVar.f247n, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // x0.AbstractC0960a
    public final void t() {
        this.f10334I = this.f10337s ? this.f10334I : null;
        this.f10329D = null;
        this.f10333H = 0L;
        r rVar = this.f10330E;
        if (rVar != null) {
            rVar.e(null);
            this.f10330E = null;
        }
        Handler handler = this.f10335J;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f10335J = null;
        }
        this.f10342x.release();
    }

    public final void w() {
        n0 n0Var;
        C1000h[] c1000hArr;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10328C;
            if (i >= arrayList.size()) {
                break;
            }
            C0909b c0909b = (C0909b) arrayList.get(i);
            w0.c cVar = this.f10334I;
            c0909b.f10324w = cVar;
            C1000h[] c1000hArr2 = c0909b.f10325x;
            int length = c1000hArr2.length;
            int i5 = 0;
            while (i5 < length) {
                C0908a c0908a = (C0908a) c1000hArr2[i5].f10882p;
                w0.b[] bVarArr = c0908a.f10310f.f10447f;
                int i6 = c0908a.f10306b;
                w0.b bVar = bVarArr[i6];
                int i7 = bVar.f10436k;
                w0.b bVar2 = cVar.f10447f[i6];
                if (i7 == 0 || bVar2.f10436k == 0) {
                    c1000hArr = c1000hArr2;
                    c0908a.f10311g += i7;
                } else {
                    int i8 = i7 - 1;
                    long[] jArr = bVar.f10440o;
                    long jB = bVar.b(i8) + jArr[i8];
                    c1000hArr = c1000hArr2;
                    long j5 = bVar2.f10440o[0];
                    if (jB <= j5) {
                        c0908a.f10311g += i7;
                    } else {
                        c0908a.f10311g = AbstractC0370w.e(jArr, j5, true) + c0908a.f10311g;
                    }
                }
                c0908a.f10310f = cVar;
                i5++;
                c1000hArr2 = c1000hArr;
            }
            InterfaceC0959E interfaceC0959E = c0909b.f10323v;
            interfaceC0959E.getClass();
            interfaceC0959E.d(c0909b);
            i++;
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (w0.b bVar3 : this.f10334I.f10447f) {
            if (bVar3.f10436k > 0) {
                long[] jArr2 = bVar3.f10440o;
                jMax2 = Math.min(jMax2, jArr2[0]);
                int i9 = bVar3.f10436k - 1;
                jMax = Math.max(jMax, bVar3.b(i9) + jArr2[i9]);
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j6 = this.f10334I.f10445d ? -9223372036854775807L : 0L;
            w0.c cVar2 = this.f10334I;
            boolean z4 = cVar2.f10445d;
            n0Var = new n0(j6, 0L, 0L, 0L, true, z4, z4, cVar2, a());
        } else {
            w0.c cVar3 = this.f10334I;
            if (cVar3.f10445d) {
                long j7 = cVar3.f10449h;
                if (j7 != -9223372036854775807L && j7 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j7);
                }
                long j8 = jMax2;
                long j9 = jMax - j8;
                long jM = j9 - AbstractC0370w.M(this.f10343z);
                if (jM < 5000000) {
                    jM = Math.min(5000000L, j9 / 2);
                }
                n0Var = new n0(-9223372036854775807L, j9, j8, jM, true, true, true, this.f10334I, a());
            } else {
                long j10 = cVar3.f10448g;
                long j11 = j10 != -9223372036854775807L ? j10 : jMax - jMax2;
                n0Var = new n0(-9223372036854775807L, -9223372036854775807L, jMax2 + j11, j11, jMax2, 0L, true, false, false, this.f10334I, a(), null);
            }
        }
        r(n0Var);
    }

    public final void x() {
        if (this.f10330E.c()) {
            return;
        }
        u uVar = new u(this.f10329D, this.f10338t, 4, this.f10327B);
        r rVar = this.f10330E;
        A0.b bVar = this.y;
        int i = uVar.f247n;
        this.f10326A.h(new C0984z(uVar.f245l, uVar.f246m, rVar.f(uVar, this, bVar.o(i))), i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
