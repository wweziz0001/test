package Z0;

import F0.AbstractC0055b;
import a0.C0157H;
import d0.C0363p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0363p f2825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0363p f2826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2827h;
    public int i;

    public a(C0363p c0363p, C0363p c0363p2, boolean z4) throws C0157H {
        this.f2826g = c0363p;
        this.f2825f = c0363p2;
        this.f2824e = z4;
        c0363p2.H(12);
        this.f2820a = c0363p2.z();
        c0363p.H(12);
        this.i = c0363p.z();
        AbstractC0055b.e("first_chunk must be 1", c0363p.i() == 1);
        this.f2821b = -1;
    }

    public final boolean a() {
        int i = this.f2821b + 1;
        this.f2821b = i;
        if (i == this.f2820a) {
            return false;
        }
        boolean z4 = this.f2824e;
        C0363p c0363p = this.f2825f;
        this.f2823d = z4 ? c0363p.A() : c0363p.x();
        if (this.f2821b == this.f2827h) {
            C0363p c0363p2 = this.f2826g;
            this.f2822c = c0363p2.z();
            c0363p2.I(4);
            int i5 = this.i - 1;
            this.i = i5;
            this.f2827h = i5 > 0 ? c0363p2.z() - 1 : -1;
        }
        return true;
    }
}
