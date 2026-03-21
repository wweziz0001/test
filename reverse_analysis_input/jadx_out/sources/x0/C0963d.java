package x0;

import d0.AbstractC0360m;
import d0.AbstractC0370w;
import h0.t0;

/* JADX INFO: renamed from: x0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0963d implements F, InterfaceC0959E {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final F f10664l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InterfaceC0959E f10665m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0962c[] f10666n = new C0962c[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10667o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f10668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f10669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0965f f10670r;

    public C0963d(F f2, boolean z4, long j5, long j6) {
        this.f10664l = f2;
        this.f10667o = z4 ? j5 : -9223372036854775807L;
        this.f10668p = j5;
        this.f10669q = j6;
    }

    @Override // x0.InterfaceC0959E
    public final void a(F f2) {
        if (this.f10670r != null) {
            return;
        }
        InterfaceC0959E interfaceC0959E = this.f10665m;
        interfaceC0959E.getClass();
        interfaceC0959E.a(this);
    }

    @Override // x0.F
    public final long b(long j5, t0 t0Var) {
        long j6 = this.f10668p;
        if (j5 == j6) {
            return j6;
        }
        long j7 = AbstractC0370w.j(t0Var.f6281a, 0L, j5 - j6);
        long j8 = this.f10669q;
        long j9 = AbstractC0370w.j(t0Var.f6282b, 0L, j8 == Long.MIN_VALUE ? Long.MAX_VALUE : j8 - j5);
        if (j7 != t0Var.f6281a || j9 != t0Var.f6282b) {
            t0Var = new t0(j7, j9);
        }
        return this.f10664l.b(j5, t0Var);
    }

    @Override // x0.h0
    public final boolean c() {
        return this.f10664l.c();
    }

    @Override // x0.g0
    public final void d(h0 h0Var) {
        InterfaceC0959E interfaceC0959E = this.f10665m;
        interfaceC0959E.getClass();
        interfaceC0959E.d(this);
    }

    @Override // x0.F
    public final q0 e() {
        return this.f10664l.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    @Override // x0.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(A0.w[] r14, boolean[] r15, x0.f0[] r16, boolean[] r17, long r18) {
        /*
            r13 = this;
            r0 = r13
            r8 = r14
            r9 = r16
            int r1 = r9.length
            x0.c[] r1 = new x0.C0962c[r1]
            r0.f10666n = r1
            int r1 = r9.length
            x0.f0[] r10 = new x0.f0[r1]
            r11 = 0
            r1 = r11
        Le:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L23
            x0.c[] r2 = r0.f10666n
            r3 = r9[r1]
            x0.c r3 = (x0.C0962c) r3
            r2[r1] = r3
            if (r3 == 0) goto L1e
            x0.f0 r12 = r3.f10659l
        L1e:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Le
        L23:
            x0.F r1 = r0.f10664l
            r2 = r14
            r3 = r15
            r4 = r10
            r5 = r17
            r6 = r18
            long r1 = r1.f(r2, r3, r4, r5, r6)
            boolean r3 = r13.g()
            if (r3 == 0) goto L5d
            long r3 = r0.f10668p
            int r5 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L5d
            int r3 = r8.length
            r4 = r11
        L44:
            if (r4 >= r3) goto L5d
            r5 = r8[r4]
            if (r5 == 0) goto L5a
            a0.p r5 = r5.d()
            java.lang.String r6 = r5.f3424n
            java.lang.String r5 = r5.f3421k
            boolean r5 = a0.AbstractC0156G.a(r6, r5)
            if (r5 != 0) goto L5a
            r3 = r1
            goto L62
        L5a:
            int r4 = r4 + 1
            goto L44
        L5d:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L62:
            r0.f10667o = r3
            int r3 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r3 == 0) goto L7d
            long r3 = r0.f10668p
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L7b
            long r3 = r0.f10669q
            r5 = -9223372036854775808
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L7d
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L7b
            goto L7d
        L7b:
            r3 = r11
            goto L7e
        L7d:
            r3 = 1
        L7e:
            d0.AbstractC0360m.h(r3)
        L81:
            int r3 = r9.length
            if (r11 >= r3) goto La7
            r3 = r10[r11]
            if (r3 != 0) goto L8d
            x0.c[] r3 = r0.f10666n
            r3[r11] = r12
            goto L9e
        L8d:
            x0.c[] r4 = r0.f10666n
            r5 = r4[r11]
            if (r5 == 0) goto L97
            x0.f0 r5 = r5.f10659l
            if (r5 == r3) goto L9e
        L97:
            x0.c r5 = new x0.c
            r5.<init>(r13, r3)
            r4[r11] = r5
        L9e:
            x0.c[] r3 = r0.f10666n
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L81
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C0963d.f(A0.w[], boolean[], x0.f0[], boolean[], long):long");
    }

    public final boolean g() {
        return this.f10667o != -9223372036854775807L;
    }

    @Override // x0.h0
    public final long h() {
        long jH = this.f10664l.h();
        if (jH != Long.MIN_VALUE) {
            long j5 = this.f10669q;
            if (j5 == Long.MIN_VALUE || jH < j5) {
                return jH;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // x0.F
    public final void l() throws C0965f {
        C0965f c0965f = this.f10670r;
        if (c0965f != null) {
            throw c0965f;
        }
        this.f10664l.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    @Override // x0.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f10667o = r0
            x0.c[] r0 = r5.f10666n
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f10660m = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            x0.F r0 = r5.f10664l
            long r0 = r0.o(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f10668p
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f10669q
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            d0.AbstractC0360m.h(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C0963d.o(long):long");
    }

    @Override // x0.F
    public final void p(long j5) {
        this.f10664l.p(j5);
    }

    @Override // x0.h0
    public final long r() {
        long jR = this.f10664l.r();
        if (jR != Long.MIN_VALUE) {
            long j5 = this.f10669q;
            if (j5 == Long.MIN_VALUE || jR < j5) {
                return jR;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // x0.F
    public final long s() {
        if (g()) {
            long j5 = this.f10667o;
            this.f10667o = -9223372036854775807L;
            long jS = s();
            return jS != -9223372036854775807L ? jS : j5;
        }
        long jS2 = this.f10664l.s();
        if (jS2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        AbstractC0360m.h(jS2 >= this.f10668p);
        long j6 = this.f10669q;
        AbstractC0360m.h(j6 == Long.MIN_VALUE || jS2 <= j6);
        return jS2;
    }

    @Override // x0.F
    public final void t(InterfaceC0959E interfaceC0959E, long j5) {
        this.f10665m = interfaceC0959E;
        this.f10664l.t(this, j5);
    }

    @Override // x0.h0
    public final void u(long j5) {
        this.f10664l.u(j5);
    }

    @Override // x0.h0
    public final boolean v(h0.T t4) {
        return this.f10664l.v(t4);
    }
}
