package a0;

import b3.AbstractC0307a;
import d0.AbstractC0370w;
import m2.g0;

/* JADX INFO: renamed from: a0.Z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0174Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3293e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3294f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m2.b0 f3296h;
    public final m2.b0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f3297j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f3298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m2.b0 f3299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0172X f3300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m2.b0 f3301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3302o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g0 f3303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m2.M f3304q;

    static {
        new C0174Z(new C0173Y());
        AbstractC0370w.G(1);
        AbstractC0370w.G(2);
        AbstractC0370w.G(3);
        AbstractC0370w.G(4);
        AbstractC0307a.n(5, 6, 7, 8, 9);
        AbstractC0307a.n(10, 11, 12, 13, 14);
        AbstractC0307a.n(15, 16, 17, 18, 19);
        AbstractC0307a.n(20, 21, 22, 23, 24);
        AbstractC0307a.n(25, 26, 27, 28, 29);
        AbstractC0370w.G(30);
        AbstractC0370w.G(31);
    }

    public C0174Z(C0173Y c0173y) {
        this.f3289a = c0173y.f3273a;
        this.f3290b = c0173y.f3274b;
        this.f3291c = c0173y.f3275c;
        this.f3292d = c0173y.f3276d;
        this.f3293e = c0173y.f3277e;
        this.f3294f = c0173y.f3278f;
        this.f3295g = c0173y.f3279g;
        this.f3296h = c0173y.f3280h;
        this.i = c0173y.i;
        this.f3297j = c0173y.f3281j;
        this.f3298k = c0173y.f3282k;
        this.f3299l = c0173y.f3283l;
        this.f3300m = c0173y.f3284m;
        this.f3301n = c0173y.f3285n;
        this.f3302o = c0173y.f3286o;
        this.f3303p = g0.a(c0173y.f3287p);
        this.f3304q = m2.M.o(c0173y.f3288q);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0174Z c0174z = (C0174Z) obj;
        if (this.f3289a == c0174z.f3289a && this.f3290b == c0174z.f3290b && this.f3291c == c0174z.f3291c && this.f3292d == c0174z.f3292d && this.f3295g == c0174z.f3295g && this.f3293e == c0174z.f3293e && this.f3294f == c0174z.f3294f && this.f3296h.equals(c0174z.f3296h) && this.i.equals(c0174z.i) && this.f3297j == c0174z.f3297j && this.f3298k == c0174z.f3298k && this.f3299l.equals(c0174z.f3299l) && this.f3300m.equals(c0174z.f3300m) && this.f3301n.equals(c0174z.f3301n) && this.f3302o == c0174z.f3302o) {
            g0 g0Var = this.f3303p;
            g0Var.getClass();
            if (m2.r.h(g0Var, c0174z.f3303p) && this.f3304q.equals(c0174z.f3304q)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f3304q.hashCode() + ((this.f3303p.hashCode() + ((((this.f3301n.hashCode() + ((this.f3300m.hashCode() + ((this.f3299l.hashCode() + ((((((this.i.hashCode() + ((this.f3296h.hashCode() + ((((((((((((((this.f3289a + 31) * 31) + this.f3290b) * 31) + this.f3291c) * 31) + this.f3292d) * 28629151) + (this.f3295g ? 1 : 0)) * 31) + this.f3293e) * 31) + this.f3294f) * 31)) * 961)) * 961) + this.f3297j) * 31) + this.f3298k) * 31)) * 31)) * 31)) * 31) + this.f3302o) * 887503681)) * 31);
    }
}
