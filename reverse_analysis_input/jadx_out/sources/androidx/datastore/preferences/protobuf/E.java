package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0226s f4069b = new C0226s(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4070a;

    public E(C0220l c0220l) {
        AbstractC0231x.a(c0220l, "output");
        this.f4070a = c0220l;
        c0220l.f4178q = this;
    }

    public void a(int i, boolean z4) {
        ((C0220l) this.f4070a).w0(i, z4);
    }

    public void b(int i, C0215g c0215g) {
        ((C0220l) this.f4070a).x0(i, c0215g);
    }

    public void c(int i, double d5) {
        C0220l c0220l = (C0220l) this.f4070a;
        c0220l.getClass();
        c0220l.B0(Double.doubleToRawLongBits(d5), i);
    }

    public void d(int i, int i5) {
        ((C0220l) this.f4070a).D0(i, i5);
    }

    public void e(int i, int i5) {
        ((C0220l) this.f4070a).z0(i, i5);
    }

    public void f(long j5, int i) {
        ((C0220l) this.f4070a).B0(j5, i);
    }

    public void g(float f2, int i) {
        C0220l c0220l = (C0220l) this.f4070a;
        c0220l.getClass();
        c0220l.z0(i, Float.floatToRawIntBits(f2));
    }

    public void h(int i, Object obj, V v4) {
        C0220l c0220l = (C0220l) this.f4070a;
        c0220l.H0(i, 3);
        v4.f((AbstractC0209a) obj, c0220l.f4178q);
        c0220l.H0(i, 4);
    }

    public void i(int i, int i5) {
        ((C0220l) this.f4070a).D0(i, i5);
    }

    public void j(long j5, int i) {
        ((C0220l) this.f4070a).K0(j5, i);
    }

    public void k(int i, Object obj, V v4) {
        C0220l c0220l = (C0220l) this.f4070a;
        AbstractC0209a abstractC0209a = (AbstractC0209a) obj;
        c0220l.H0(i, 2);
        c0220l.J0(abstractC0209a.a(v4));
        v4.f(abstractC0209a, c0220l.f4178q);
    }

    public void l(int i, int i5) {
        ((C0220l) this.f4070a).z0(i, i5);
    }

    public void m(long j5, int i) {
        ((C0220l) this.f4070a).B0(j5, i);
    }

    public void n(int i, int i5) {
        ((C0220l) this.f4070a).I0(i, (i5 >> 31) ^ (i5 << 1));
    }

    public void o(long j5, int i) {
        ((C0220l) this.f4070a).K0((j5 >> 63) ^ (j5 << 1), i);
    }

    public void p(int i, int i5) {
        ((C0220l) this.f4070a).I0(i, i5);
    }

    public void q(long j5, int i) {
        ((C0220l) this.f4070a).K0(j5, i);
    }

    public E() {
        S s4 = S.f4099c;
        K k4 = f4069b;
        try {
            k4 = (K) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        K[] kArr = {C0226s.f4213b, k4};
        D d5 = new D();
        d5.f4068a = kArr;
        Charset charset = AbstractC0231x.f4217a;
        this.f4070a = d5;
    }
}
