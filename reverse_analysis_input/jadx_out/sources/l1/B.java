package l1;

import d0.AbstractC0370w;
import d0.C0363p;
import d0.C0368u;

/* JADX INFO: loaded from: classes.dex */
public final class B implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0568A f7890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0363p f7891b = new C0363p(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7895f;

    public B(InterfaceC0568A interfaceC0568A) {
        this.f7890a = interfaceC0568A;
    }

    @Override // l1.F
    public final void a() {
        this.f7895f = true;
    }

    @Override // l1.F
    public final void b(int i, C0363p c0363p) {
        boolean z4 = (i & 1) != 0;
        int iV = z4 ? c0363p.f5314b + c0363p.v() : -1;
        if (this.f7895f) {
            if (!z4) {
                return;
            }
            this.f7895f = false;
            c0363p.H(iV);
            this.f7893d = 0;
        }
        while (c0363p.a() > 0) {
            int i5 = this.f7893d;
            C0363p c0363p2 = this.f7891b;
            if (i5 < 3) {
                if (i5 == 0) {
                    int iV2 = c0363p.v();
                    c0363p.H(c0363p.f5314b - 1);
                    if (iV2 == 255) {
                        this.f7895f = true;
                        return;
                    }
                }
                int iMin = Math.min(c0363p.a(), 3 - this.f7893d);
                c0363p.g(c0363p2.f5313a, this.f7893d, iMin);
                int i6 = this.f7893d + iMin;
                this.f7893d = i6;
                if (i6 == 3) {
                    c0363p2.H(0);
                    c0363p2.G(3);
                    c0363p2.I(1);
                    int iV3 = c0363p2.v();
                    int iV4 = c0363p2.v();
                    this.f7894e = (iV3 & 128) != 0;
                    int i7 = (((iV3 & 15) << 8) | iV4) + 3;
                    this.f7892c = i7;
                    byte[] bArr = c0363p2.f5313a;
                    if (bArr.length < i7) {
                        c0363p2.b(Math.min(4098, Math.max(i7, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c0363p.a(), this.f7892c - this.f7893d);
                c0363p.g(c0363p2.f5313a, this.f7893d, iMin2);
                int i8 = this.f7893d + iMin2;
                this.f7893d = i8;
                int i9 = this.f7892c;
                if (i8 != i9) {
                    continue;
                } else {
                    if (!this.f7894e) {
                        c0363p2.G(i9);
                    } else {
                        if (AbstractC0370w.l(0, i9, -1, c0363p2.f5313a) != 0) {
                            this.f7895f = true;
                            return;
                        }
                        c0363p2.G(this.f7892c - 4);
                    }
                    c0363p2.H(0);
                    this.f7890a.b(c0363p2);
                    this.f7893d = 0;
                }
            }
        }
    }

    @Override // l1.F
    public final void c(C0368u c0368u, F0.s sVar, E e5) {
        this.f7890a.c(c0368u, sVar, e5);
        this.f7895f = true;
    }
}
