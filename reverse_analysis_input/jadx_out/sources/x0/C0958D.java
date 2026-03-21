package x0;

import a0.AbstractC0169U;
import a0.C0150A;
import a0.C0167S;
import a0.C0168T;
import d0.AbstractC0360m;

/* JADX INFO: renamed from: x0.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0958D extends r0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C0955A f10524A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f10525B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f10526C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f10527D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f10528w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0168T f10529x;
    public final C0167S y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0956B f10530z;

    public C0958D(J j5, boolean z4) {
        super(j5);
        this.f10528w = z4 && j5.f();
        this.f10529x = new C0168T();
        this.y = new C0167S();
        AbstractC0169U abstractC0169UG = j5.g();
        if (abstractC0169UG == null) {
            this.f10530z = new C0956B(new C0957C(j5.a()), C0168T.f3243q, C0956B.f10520e);
        } else {
            this.f10530z = new C0956B(abstractC0169UG, null, null);
            this.f10527D = true;
        }
    }

    @Override // x0.r0
    public final H B(H h2) {
        Object obj = h2.f10531a;
        Object obj2 = this.f10530z.f10522d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C0956B.f10520e;
        }
        return h2.a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // x0.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(a0.AbstractC0169U r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.C0958D.C(a0.U):void");
    }

    @Override // x0.r0
    public final void D() {
        if (this.f10528w) {
            return;
        }
        this.f10525B = true;
        A(null, this.f10782v);
    }

    @Override // x0.J
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final C0955A c(H h2, B0.f fVar, long j5) {
        C0955A c0955a = new C0955A(h2, fVar, j5);
        AbstractC0360m.h(c0955a.f10516o == null);
        J j6 = this.f10782v;
        c0955a.f10516o = j6;
        if (this.f10526C) {
            Object obj = this.f10530z.f10522d;
            Object obj2 = h2.f10531a;
            if (obj != null && obj2.equals(C0956B.f10520e)) {
                obj2 = this.f10530z.f10522d;
            }
            c0955a.g(h2.a(obj2));
        } else {
            this.f10524A = c0955a;
            if (!this.f10525B) {
                this.f10525B = true;
                A(null, j6);
            }
        }
        return c0955a;
    }

    public final boolean F(long j5) {
        C0955A c0955a = this.f10524A;
        int iB = this.f10530z.b(c0955a.f10513l.f10531a);
        if (iB == -1) {
            return false;
        }
        C0956B c0956b = this.f10530z;
        C0167S c0167s = this.y;
        c0956b.f(iB, c0167s, false);
        long j6 = c0167s.f3239d;
        if (j6 != -9223372036854775807L && j5 >= j6) {
            j5 = Math.max(0L, j6 - 1);
        }
        c0955a.f10519r = j5;
        return true;
    }

    @Override // x0.r0, x0.J
    public final void b(C0150A c0150a) {
        if (this.f10527D) {
            C0956B c0956b = this.f10530z;
            this.f10530z = new C0956B(new h0.m0(this.f10530z.f10811b, c0150a), c0956b.f10521c, c0956b.f10522d);
        } else {
            this.f10530z = new C0956B(new C0957C(c0150a), C0168T.f3243q, C0956B.f10520e);
        }
        this.f10782v.b(c0150a);
    }

    @Override // x0.J
    public final void d(F f2) {
        C0955A c0955a = (C0955A) f2;
        if (c0955a.f10517p != null) {
            J j5 = c0955a.f10516o;
            j5.getClass();
            j5.d(c0955a.f10517p);
        }
        if (f2 == this.f10524A) {
            this.f10524A = null;
        }
    }

    @Override // x0.AbstractC0970k, x0.AbstractC0960a
    public final void t() {
        this.f10526C = false;
        this.f10525B = false;
        super.t();
    }

    @Override // x0.AbstractC0970k, x0.J
    public final void e() {
    }
}
