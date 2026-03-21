package m1;

import F0.C0066m;
import F0.K;
import F0.s;
import Z0.g;
import a0.AbstractC0156G;
import a0.C0157H;
import a0.C0189o;
import a0.C0190p;
import d0.AbstractC0370w;
import java.math.RoundingMode;

/* JADX INFO: renamed from: m1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0631c implements InterfaceC0630b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f8515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f8516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f8517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0190p f8518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8522h;

    public C0631c(s sVar, K k4, g gVar, String str, int i) throws C0157H {
        this.f8515a = sVar;
        this.f8516b = k4;
        this.f8517c = gVar;
        int i5 = gVar.f2846e;
        int i6 = gVar.f2843b;
        int i7 = (i5 * i6) / 8;
        int i8 = gVar.f2845d;
        if (i8 != i7) {
            throw C0157H.a(null, "Expected block size: " + i7 + "; got: " + i8);
        }
        int i9 = gVar.f2844c;
        int i10 = i9 * i7;
        int i11 = i10 * 8;
        int iMax = Math.max(i7, i10 / 10);
        this.f8519e = iMax;
        C0189o c0189o = new C0189o();
        c0189o.f3387m = AbstractC0156G.m(str);
        c0189o.f3383h = i11;
        c0189o.i = i11;
        c0189o.f3388n = iMax;
        c0189o.f3366B = i6;
        c0189o.f3367C = i9;
        c0189o.f3368D = i;
        this.f8518d = new C0190p(c0189o);
    }

    @Override // m1.InterfaceC0630b
    public final boolean a(C0066m c0066m, long j5) {
        int i;
        int i5;
        long j6 = j5;
        while (j6 > 0 && (i = this.f8521g) < (i5 = this.f8519e)) {
            int iD = this.f8516b.d(c0066m, (int) Math.min(i5 - i, j6), true);
            if (iD == -1) {
                j6 = 0;
            } else {
                this.f8521g += iD;
                j6 -= (long) iD;
            }
        }
        g gVar = this.f8517c;
        int i6 = this.f8521g;
        int i7 = gVar.f2845d;
        int i8 = i6 / i7;
        if (i8 > 0) {
            long j7 = this.f8520f;
            long j8 = this.f8522h;
            long j9 = gVar.f2844c;
            int i9 = AbstractC0370w.f5326a;
            long jU = j7 + AbstractC0370w.U(j8, 1000000L, j9, RoundingMode.DOWN);
            int i10 = i8 * i7;
            int i11 = this.f8521g - i10;
            this.f8516b.b(jU, 1, i10, i11, null);
            this.f8522h += (long) i8;
            this.f8521g = i11;
        }
        return j6 <= 0;
    }

    @Override // m1.InterfaceC0630b
    public final void b(long j5) {
        this.f8520f = j5;
        this.f8521g = 0;
        this.f8522h = 0L;
    }

    @Override // m1.InterfaceC0630b
    public final void c(long j5, int i) {
        this.f8515a.d(new C0633e(this.f8517c, 1, i, j5));
        this.f8516b.c(this.f8518d);
    }
}
