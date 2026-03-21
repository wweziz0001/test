package v0;

import A.j;
import A0.w;
import B0.k;
import B0.s;
import Z0.m;
import Z0.t;
import Z0.u;
import a0.C0187m;
import a0.C0190p;
import a0.C0200z;
import android.net.Uri;
import android.os.SystemClock;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import f0.C0417l;
import f0.InterfaceC0413h;
import h0.T;
import h0.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import m2.b0;
import w0.C0940a;
import x0.C0961b;
import y0.AbstractC0997e;
import y0.C0996d;
import y0.InterfaceC0998f;
import y0.i;
import y0.l;

/* JADX INFO: renamed from: v0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0908a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f10305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0998f[] f10307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0413h f10308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f10309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w0.c f10310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0961b f10312h;

    public C0908a(s sVar, w0.c cVar, int i, w wVar, InterfaceC0413h interfaceC0413h, C0200z c0200z, boolean z4) {
        u[] uVarArr;
        this.f10305a = sVar;
        this.f10310f = cVar;
        this.f10306b = i;
        this.f10309e = wVar;
        this.f10308d = interfaceC0413h;
        w0.b bVar = cVar.f10447f[i];
        this.f10307c = new InterfaceC0998f[wVar.length()];
        for (int i5 = 0; i5 < this.f10307c.length; i5++) {
            int iK = wVar.k(i5);
            C0190p c0190p = bVar.f10435j[iK];
            if (c0190p.f3428r != null) {
                C0940a c0940a = cVar.f10446e;
                c0940a.getClass();
                uVarArr = c0940a.f10426c;
            } else {
                uVarArr = null;
            }
            u[] uVarArr2 = uVarArr;
            int i6 = bVar.f10427a;
            int i7 = i6 == 2 ? 4 : 0;
            long j5 = cVar.f10448g;
            this.f10307c[i5] = new C0996d(new m(c0200z, !z4 ? 35 : 3, null, new t(iK, i6, bVar.f10429c, -9223372036854775807L, j5, j5, c0190p, 0, uVarArr2, i7, null, null), b0.f8583p, null), bVar.f10427a, c0190p);
        }
    }

    @Override // y0.i
    public final void a() throws C0961b {
        C0961b c0961b = this.f10312h;
        if (c0961b != null) {
            throw c0961b;
        }
        this.f10305a.a();
    }

    @Override // y0.i
    public final long b(long j5, t0 t0Var) {
        w0.b bVar = this.f10310f.f10447f[this.f10306b];
        int iE = AbstractC0370w.e(bVar.f10440o, j5, true);
        long[] jArr = bVar.f10440o;
        long j6 = jArr[iE];
        return t0Var.a(j5, j6, (j6 >= j5 || iE >= bVar.f10436k - 1) ? j6 : jArr[iE + 1]);
    }

    @Override // y0.i
    public final boolean c(long j5, AbstractC0997e abstractC0997e, List list) {
        if (this.f10312h != null) {
            return false;
        }
        return this.f10309e.i(j5, abstractC0997e, list);
    }

    @Override // y0.i
    public final boolean d(AbstractC0997e abstractC0997e, boolean z4, j jVar, A0.b bVar) {
        B0.j jVarR = D1.b.r(this.f10309e);
        bVar.getClass();
        k kVarM = A0.b.m(jVarR, jVar);
        if (z4 && kVarM != null && kVarM.f226a == 2) {
            w wVar = this.f10309e;
            if (wVar.q(kVarM.f227b, wVar.p(abstractC0997e.f10857o))) {
                return true;
            }
        }
        return false;
    }

    @Override // y0.i
    public final void e(T t4, long j5, List list, C0187m c0187m) {
        int iA;
        long jB;
        if (this.f10312h != null) {
            return;
        }
        w0.b[] bVarArr = this.f10310f.f10447f;
        int i = this.f10306b;
        w0.b bVar = bVarArr[i];
        if (bVar.f10436k == 0) {
            c0187m.f3362a = !r4.f10445d;
            return;
        }
        boolean zIsEmpty = list.isEmpty();
        long[] jArr = bVar.f10440o;
        if (zIsEmpty) {
            iA = AbstractC0370w.e(jArr, j5, true);
        } else {
            iA = (int) (((l) list.get(list.size() - 1)).a() - ((long) this.f10311g));
            if (iA < 0) {
                this.f10312h = new C0961b();
                return;
            }
        }
        if (iA >= bVar.f10436k) {
            c0187m.f3362a = !this.f10310f.f10445d;
            return;
        }
        long j6 = t4.f6044a;
        long j7 = j5 - j6;
        w0.c cVar = this.f10310f;
        if (cVar.f10445d) {
            w0.b bVar2 = cVar.f10447f[i];
            int i5 = bVar2.f10436k - 1;
            jB = (bVar2.b(i5) + bVar2.f10440o[i5]) - j6;
        } else {
            jB = -9223372036854775807L;
        }
        int length = this.f10309e.length();
        y0.m[] mVarArr = new y0.m[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.f10309e.k(i6);
            mVarArr[i6] = new k0.j(bVar, iA);
        }
        this.f10309e.s(j6, j7, jB, list, mVarArr);
        long j8 = jArr[iA];
        long jB2 = bVar.b(iA) + j8;
        long j9 = list.isEmpty() ? j5 : -9223372036854775807L;
        int i7 = this.f10311g + iA;
        int iF = this.f10309e.f();
        InterfaceC0998f interfaceC0998f = this.f10307c[iF];
        int iK = this.f10309e.k(iF);
        C0190p[] c0190pArr = bVar.f10435j;
        AbstractC0360m.h(c0190pArr != null);
        ArrayList arrayList = bVar.f10439n;
        AbstractC0360m.h(arrayList != null);
        AbstractC0360m.h(iA < arrayList.size());
        String string = Integer.toString(c0190pArr[iK].f3420j);
        String string2 = ((Long) arrayList.get(iA)).toString();
        Uri uriW = AbstractC0360m.w(bVar.f10437l, bVar.f10438m.replace("{bitrate}", string).replace("{Bitrate}", string).replace("{start time}", string2).replace("{start_time}", string2));
        SystemClock.elapsedRealtime();
        C0190p c0190pD = this.f10309e.d();
        int iE = this.f10309e.e();
        Object objL = this.f10309e.l();
        Map mapEmptyMap = Collections.emptyMap();
        AbstractC0360m.j(uriW, "The uri must be set.");
        c0187m.f3363b = new y0.j(this.f10308d, new C0417l(uriW, 1, null, mapEmptyMap, 0L, -1L, null, 0), c0190pD, iE, objL, j8, jB2, j9, -9223372036854775807L, i7, 1, j8, interfaceC0998f);
    }

    @Override // y0.i
    public final int f(long j5, List list) {
        return (this.f10312h != null || this.f10309e.length() < 2) ? list.size() : this.f10309e.n(j5, list);
    }

    @Override // y0.i
    public final void release() {
        for (InterfaceC0998f interfaceC0998f : this.f10307c) {
            ((C0996d) interfaceC0998f).f10845l.release();
        }
    }

    @Override // y0.i
    public final void g(AbstractC0997e abstractC0997e) {
    }
}
