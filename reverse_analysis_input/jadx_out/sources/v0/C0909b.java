package v0;

import A0.w;
import B0.f;
import B0.s;
import a0.AbstractC0156G;
import a0.C0170V;
import a0.C0189o;
import a0.C0190p;
import a0.C0200z;
import f0.InterfaceC0403A;
import f0.InterfaceC0412g;
import f0.InterfaceC0413h;
import h0.C0452c;
import h0.T;
import h0.t0;
import java.util.AbstractList;
import java.util.ArrayList;
import m0.e;
import m0.i;
import m2.C0640G;
import m2.I;
import m2.b0;
import m2.r;
import s2.l;
import x0.C0972m;
import x0.F;
import x0.InterfaceC0959E;
import x0.f0;
import x0.g0;
import x0.h0;
import x0.q0;
import y0.C1000h;

/* JADX INFO: renamed from: v0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0909b implements F, g0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0452c f10313l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC0403A f10314m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s f10315n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f10316o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f10317p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A0.b f10318q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f10319r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f10320s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q0 f10321t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p1.b f10322u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC0959E f10323v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public w0.c f10324w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C1000h[] f10325x;
    public C0972m y;

    public C0909b(w0.c cVar, C0452c c0452c, InterfaceC0403A interfaceC0403A, p1.b bVar, i iVar, e eVar, A0.b bVar2, e eVar2, s sVar, f fVar) {
        this.f10324w = cVar;
        this.f10313l = c0452c;
        this.f10314m = interfaceC0403A;
        this.f10315n = sVar;
        this.f10316o = iVar;
        this.f10317p = eVar;
        this.f10318q = bVar2;
        this.f10319r = eVar2;
        this.f10320s = fVar;
        this.f10322u = bVar;
        C0170V[] c0170vArr = new C0170V[cVar.f10447f.length];
        int i = 0;
        while (true) {
            w0.b[] bVarArr = cVar.f10447f;
            if (i >= bVarArr.length) {
                this.f10321t = new q0(c0170vArr);
                this.f10325x = new C1000h[0];
                bVar.getClass();
                C0640G c0640g = I.f8549m;
                b0 b0Var = b0.f8583p;
                this.y = new C0972m(b0Var, b0Var);
                return;
            }
            C0190p[] c0190pArr = bVarArr[i].f10435j;
            C0190p[] c0190pArr2 = new C0190p[c0190pArr.length];
            for (int i5 = 0; i5 < c0190pArr.length; i5++) {
                C0190p c0190p = c0190pArr[i5];
                C0189o c0189oA = c0190p.a();
                c0189oA.f3375K = iVar.b(c0190p);
                C0190p c0190p2 = new C0190p(c0189oA);
                if (c0452c.f6101a && ((C0200z) c0452c.f6103c).supportsFormat(c0190p2)) {
                    C0189o c0189oA2 = c0190p2.a();
                    c0189oA2.f3387m = AbstractC0156G.m("application/x-media3-cues");
                    c0189oA2.f3372H = ((C0200z) c0452c.f6103c).d(c0190p2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(c0190p2.f3424n);
                    String str = c0190p2.f3421k;
                    sb.append(str != null ? " ".concat(str) : "");
                    c0189oA2.f3384j = sb.toString();
                    c0189oA2.f3392r = Long.MAX_VALUE;
                    c0190p2 = new C0190p(c0189oA2);
                }
                c0190pArr2[i5] = c0190p2;
            }
            c0170vArr[i] = new C0170V(Integer.toString(i), c0190pArr2);
            i++;
        }
    }

    @Override // x0.F
    public final long b(long j5, t0 t0Var) {
        for (C1000h c1000h : this.f10325x) {
            if (c1000h.f10878l == 2) {
                return c1000h.f10882p.b(j5, t0Var);
            }
        }
        return j5;
    }

    @Override // x0.h0
    public final boolean c() {
        return this.y.c();
    }

    @Override // x0.g0
    public final void d(h0 h0Var) {
        InterfaceC0959E interfaceC0959E = this.f10323v;
        interfaceC0959E.getClass();
        interfaceC0959E.d(this);
    }

    @Override // x0.F
    public final q0 e() {
        return this.f10321t;
    }

    @Override // x0.F
    public final long f(w[] wVarArr, boolean[] zArr, f0[] f0VarArr, boolean[] zArr2, long j5) {
        int i;
        ArrayList arrayList;
        w wVar;
        w[] wVarArr2 = wVarArr;
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        while (i5 < wVarArr2.length) {
            f0 f0Var = f0VarArr[i5];
            if (f0Var != null) {
                C1000h c1000h = (C1000h) f0Var;
                w wVar2 = wVarArr2[i5];
                if (wVar2 == null || !zArr[i5]) {
                    c1000h.A(null);
                    f0VarArr[i5] = null;
                } else {
                    ((C0908a) c1000h.f10882p).f10309e = wVar2;
                    arrayList2.add(c1000h);
                }
            }
            if (f0VarArr[i5] != null || (wVar = wVarArr2[i5]) == null) {
                i = i5;
                arrayList = arrayList2;
            } else {
                int iB = this.f10321t.b(wVar.b());
                w0.c cVar = this.f10324w;
                C0452c c0452c = this.f10313l;
                InterfaceC0413h interfaceC0413hA = ((InterfaceC0412g) c0452c.f6102b).a();
                InterfaceC0403A interfaceC0403A = this.f10314m;
                if (interfaceC0403A != null) {
                    interfaceC0413hA.b(interfaceC0403A);
                }
                i = i5;
                arrayList = arrayList2;
                C1000h c1000h2 = new C1000h(this.f10324w.f10447f[iB].f10427a, null, null, new C0908a(this.f10315n, cVar, iB, wVar, interfaceC0413hA, (C0200z) c0452c.f6103c, c0452c.f6101a), this, this.f10320s, j5, this.f10316o, this.f10317p, this.f10318q, this.f10319r, false);
                arrayList.add(c1000h2);
                f0VarArr[i] = c1000h2;
                zArr2[i] = true;
            }
            i5 = i + 1;
            arrayList2 = arrayList;
            wVarArr2 = wVarArr;
        }
        ArrayList arrayList3 = arrayList2;
        C1000h[] c1000hArr = new C1000h[arrayList3.size()];
        this.f10325x = c1000hArr;
        arrayList3.toArray(c1000hArr);
        AbstractList abstractListW = r.w(arrayList3, new l(6));
        this.f10322u.getClass();
        this.y = new C0972m(arrayList3, abstractListW);
        return j5;
    }

    @Override // x0.h0
    public final long h() {
        return this.y.h();
    }

    @Override // x0.F
    public final void l() {
        this.f10315n.a();
    }

    @Override // x0.F
    public final long o(long j5) {
        for (C1000h c1000h : this.f10325x) {
            c1000h.B(j5);
        }
        return j5;
    }

    @Override // x0.F
    public final void p(long j5) {
        for (C1000h c1000h : this.f10325x) {
            c1000h.p(j5);
        }
    }

    @Override // x0.h0
    public final long r() {
        return this.y.r();
    }

    @Override // x0.F
    public final long s() {
        return -9223372036854775807L;
    }

    @Override // x0.F
    public final void t(InterfaceC0959E interfaceC0959E, long j5) {
        this.f10323v = interfaceC0959E;
        interfaceC0959E.a(this);
    }

    @Override // x0.h0
    public final void u(long j5) {
        this.y.u(j5);
    }

    @Override // x0.h0
    public final boolean v(T t4) {
        return this.y.v(t4);
    }
}
