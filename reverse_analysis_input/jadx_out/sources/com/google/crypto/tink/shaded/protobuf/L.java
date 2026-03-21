package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0339t f5147b = new C0339t(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5148a;

    public L(C0332l c0332l) {
        A.a(c0332l, "output");
        this.f5148a = c0332l;
        c0332l.f5225q = this;
    }

    public void a(int i, boolean z4) throws K3.b {
        C0332l c0332l = (C0332l) this.f5148a;
        c0332l.x0(i, 0);
        c0332l.p0(z4 ? (byte) 1 : (byte) 0);
    }

    public void b(int i, AbstractC0329i abstractC0329i) throws K3.b {
        C0332l c0332l = (C0332l) this.f5148a;
        c0332l.x0(i, 2);
        c0332l.r0(abstractC0329i);
    }

    public void c(int i, double d5) throws K3.b {
        C0332l c0332l = (C0332l) this.f5148a;
        c0332l.getClass();
        c0332l.u0(Double.doubleToRawLongBits(d5), i);
    }

    public void d(int i, int i5) throws K3.b {
        C0332l c0332l = (C0332l) this.f5148a;
        c0332l.x0(i, 0);
        c0332l.w0(i5);
    }

    public void e(int i, int i5) throws K3.b {
        ((C0332l) this.f5148a).s0(i, i5);
    }

    public void f(long j5, int i) throws K3.b {
        ((C0332l) this.f5148a).u0(j5, i);
    }

    public void g(float f2, int i) throws K3.b {
        C0332l c0332l = (C0332l) this.f5148a;
        c0332l.getClass();
        c0332l.s0(i, Float.floatToRawIntBits(f2));
    }

    public void h(int i, Object obj, c0 c0Var) throws K3.b {
        C0332l c0332l = (C0332l) this.f5148a;
        c0332l.x0(i, 3);
        c0Var.h((AbstractC0321a) obj, c0332l.f5225q);
        c0332l.x0(i, 4);
    }

    public void i(int i, int i5) throws K3.b {
        C0332l c0332l = (C0332l) this.f5148a;
        c0332l.x0(i, 0);
        c0332l.w0(i5);
    }

    public void j(long j5, int i) throws K3.b {
        ((C0332l) this.f5148a).z0(j5, i);
    }

    public void k(int i, Object obj, c0 c0Var) throws K3.b {
        AbstractC0321a abstractC0321a = (AbstractC0321a) obj;
        C0332l c0332l = (C0332l) this.f5148a;
        c0332l.x0(i, 2);
        c0332l.y0(abstractC0321a.b(c0Var));
        c0Var.h(abstractC0321a, c0332l.f5225q);
    }

    public void l(int i, int i5) throws K3.b {
        ((C0332l) this.f5148a).s0(i, i5);
    }

    public void m(long j5, int i) throws K3.b {
        ((C0332l) this.f5148a).u0(j5, i);
    }

    public void n(int i, int i5) throws K3.b {
        C0332l c0332l = (C0332l) this.f5148a;
        c0332l.x0(i, 0);
        c0332l.y0((i5 >> 31) ^ (i5 << 1));
    }

    public void o(long j5, int i) throws K3.b {
        ((C0332l) this.f5148a).z0((j5 >> 63) ^ (j5 << 1), i);
    }

    public void p(int i, int i5) throws K3.b {
        C0332l c0332l = (C0332l) this.f5148a;
        c0332l.x0(i, 0);
        c0332l.y0(i5);
    }

    public void q(long j5, int i) throws K3.b {
        ((C0332l) this.f5148a).z0(j5, i);
    }

    public L() {
        P p4;
        try {
            p4 = (P) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            p4 = f5147b;
        }
        P[] pArr = {C0339t.f5249b, p4};
        K k4 = new K();
        k4.f5146a = pArr;
        Charset charset = A.f5128a;
        this.f5148a = k4;
    }
}
