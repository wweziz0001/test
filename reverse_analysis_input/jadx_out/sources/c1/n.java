package c1;

import F0.J;
import F0.K;
import a0.AbstractC0156G;
import a0.C0189o;
import a0.C0190p;
import a0.InterfaceC0182h;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import java.io.EOFException;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class n implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f5058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f5059b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f5064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0190p f5065h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5061d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5062e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f5063f = AbstractC0370w.f5331f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0363p f5060c = new C0363p();

    public n(K k4, j jVar) {
        this.f5058a = k4;
        this.f5059b = jVar;
    }

    @Override // F0.K
    public final void a(C0363p c0363p, int i, int i5) {
        if (this.f5064g == null) {
            this.f5058a.a(c0363p, i, i5);
            return;
        }
        e(i);
        c0363p.g(this.f5063f, this.f5062e, i);
        this.f5062e += i;
    }

    @Override // F0.K
    public final void b(long j5, int i, int i5, int i6, J j6) {
        if (this.f5064g == null) {
            this.f5058a.b(j5, i, i5, i6, j6);
            return;
        }
        AbstractC0360m.b("DRM on subtitles is not supported", j6 == null);
        int i7 = (this.f5062e - i6) - i5;
        this.f5064g.x(this.f5063f, i7, i5, k.f5052c, new m(this, j5, i));
        int i8 = i7 + i5;
        this.f5061d = i8;
        if (i8 == this.f5062e) {
            this.f5061d = 0;
            this.f5062e = 0;
        }
    }

    @Override // F0.K
    public final void c(C0190p c0190p) {
        c0190p.f3424n.getClass();
        String str = c0190p.f3424n;
        AbstractC0360m.c(AbstractC0156G.h(str) == 3);
        boolean zEquals = c0190p.equals(this.f5065h);
        j jVar = this.f5059b;
        if (!zEquals) {
            this.f5065h = c0190p;
            this.f5064g = jVar.supportsFormat(c0190p) ? jVar.a(c0190p) : null;
        }
        l lVar = this.f5064g;
        K k4 = this.f5058a;
        if (lVar == null) {
            k4.c(c0190p);
            return;
        }
        C0189o c0189oA = c0190p.a();
        c0189oA.f3387m = AbstractC0156G.m("application/x-media3-cues");
        c0189oA.f3384j = str;
        c0189oA.f3392r = Long.MAX_VALUE;
        c0189oA.f3372H = jVar.d(c0190p);
        B0.k(c0189oA, k4);
    }

    @Override // F0.K
    public final int d(InterfaceC0182h interfaceC0182h, int i, boolean z4) throws EOFException {
        if (this.f5064g == null) {
            return this.f5058a.d(interfaceC0182h, i, z4);
        }
        e(i);
        int i5 = interfaceC0182h.read(this.f5063f, this.f5062e, i);
        if (i5 != -1) {
            this.f5062e += i5;
            return i5;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    public final void e(int i) {
        int length = this.f5063f.length;
        int i5 = this.f5062e;
        if (length - i5 >= i) {
            return;
        }
        int i6 = i5 - this.f5061d;
        int iMax = Math.max(i6 * 2, i + i6);
        byte[] bArr = this.f5063f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f5061d, bArr2, 0, i6);
        this.f5061d = 0;
        this.f5062e = i6;
        this.f5063f = bArr2;
    }
}
