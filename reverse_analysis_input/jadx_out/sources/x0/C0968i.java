package x0;

import a0.C0190p;
import java.io.IOException;

/* JADX INFO: renamed from: x0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0968i implements N, m0.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f10716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m0.e f10717m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m0.e f10718n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0970k f10719o;

    public C0968i(AbstractC0970k abstractC0970k, Object obj) {
        this.f10719o = abstractC0970k;
        this.f10717m = abstractC0970k.h(null);
        this.f10718n = new m0.e(abstractC0970k.f10637o.f8498c, 0, null);
        this.f10716l = obj;
    }

    @Override // x0.N
    public final void a(int i, H h2, C0984z c0984z, u0.g gVar) {
        if (g(i, h2)) {
            m0.e eVar = this.f10717m;
            u0.g gVarH = h(gVar, h2);
            eVar.getClass();
            eVar.a(new K(eVar, c0984z, gVarH, 0));
        }
    }

    @Override // x0.N
    public final void b(int i, H h2, C0984z c0984z, u0.g gVar) {
        if (g(i, h2)) {
            m0.e eVar = this.f10717m;
            u0.g gVarH = h(gVar, h2);
            eVar.getClass();
            eVar.a(new K(eVar, c0984z, gVarH, 2));
        }
    }

    @Override // x0.N
    public final void c(int i, H h2, u0.g gVar) {
        if (g(i, h2)) {
            m0.e eVar = this.f10717m;
            u0.g gVarH = h(gVar, h2);
            eVar.getClass();
            eVar.a(new A0.g(eVar, 5, gVarH));
        }
    }

    @Override // x0.N
    public final void d(int i, H h2, C0984z c0984z, u0.g gVar) {
        if (g(i, h2)) {
            m0.e eVar = this.f10717m;
            u0.g gVarH = h(gVar, h2);
            eVar.getClass();
            eVar.a(new K(eVar, c0984z, gVarH, 1));
        }
    }

    @Override // x0.N
    public final void e(int i, H h2, C0984z c0984z, u0.g gVar, IOException iOException, boolean z4) {
        if (g(i, h2)) {
            m0.e eVar = this.f10717m;
            u0.g gVarH = h(gVar, h2);
            eVar.getClass();
            eVar.a(new L(eVar, c0984z, gVarH, iOException, z4));
        }
    }

    @Override // x0.N
    public final void f(int i, H h2, u0.g gVar) {
        if (g(i, h2)) {
            m0.e eVar = this.f10717m;
            u0.g gVarH = h(gVar, h2);
            H h5 = eVar.f8497b;
            h5.getClass();
            eVar.a(new K(eVar, h5, gVarH, 3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(int r4, x0.H r5) {
        /*
            r3 = this;
            x0.k r0 = r3.f10719o
            java.lang.Object r1 = r3.f10716l
            if (r5 == 0) goto Le
            x0.H r5 = r0.w(r1, r5)
            if (r5 != 0) goto Lf
            r4 = 0
            return r4
        Le:
            r5 = 0
        Lf:
            int r4 = r0.y(r4, r1)
            m0.e r1 = r3.f10717m
            int r2 = r1.f8496a
            if (r2 != r4) goto L23
            int r2 = d0.AbstractC0370w.f5326a
            x0.H r1 = r1.f8497b
            boolean r1 = java.util.Objects.equals(r1, r5)
            if (r1 != 0) goto L2e
        L23:
            m0.e r1 = new m0.e
            m0.e r2 = r0.f10636n
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.f8498c
            r1.<init>(r2, r4, r5)
            r3.f10717m = r1
        L2e:
            m0.e r1 = r3.f10718n
            int r2 = r1.f8496a
            if (r2 != r4) goto L3e
            int r2 = d0.AbstractC0370w.f5326a
            x0.H r1 = r1.f8497b
            boolean r1 = java.util.Objects.equals(r1, r5)
            if (r1 != 0) goto L49
        L3e:
            m0.e r1 = new m0.e
            m0.e r0 = r0.f10637o
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f8498c
            r1.<init>(r0, r4, r5)
            r3.f10718n = r1
        L49:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C0968i.g(int, x0.H):boolean");
    }

    public final u0.g h(u0.g gVar, H h2) {
        AbstractC0970k abstractC0970k = this.f10719o;
        Object obj = this.f10716l;
        long j5 = gVar.f10202d;
        long jX = abstractC0970k.x(j5, obj);
        long j6 = gVar.f10203e;
        long jX2 = abstractC0970k.x(j6, obj);
        if (jX == j5 && jX2 == j6) {
            return gVar;
        }
        return new u0.g(gVar.f10199a, gVar.f10200b, (C0190p) gVar.f10204f, gVar.f10201c, gVar.f10205g, jX, jX2);
    }
}
