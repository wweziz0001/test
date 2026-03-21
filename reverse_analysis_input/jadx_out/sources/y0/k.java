package y0;

import F0.C0064k;
import F0.C0066m;
import a0.C0190p;
import d0.AbstractC0360m;
import f0.C0417l;
import f0.C0431z;
import f0.InterfaceC0413h;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC0997e {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0996d f10898u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Z1.e f10899v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f10900w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile boolean f10901x;

    public k(InterfaceC0413h interfaceC0413h, C0417l c0417l, C0190p c0190p, int i, Object obj, C0996d c0996d) {
        super(interfaceC0413h, c0417l, 2, c0190p, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f10898u = c0996d;
    }

    @Override // B0.o
    public final void e() {
        if (this.f10900w == 0) {
            this.f10898u.a(this.f10899v, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C0417l c0417lA = this.f10855m.a(this.f10900w);
            C0431z c0431z = this.f10862t;
            C0066m c0066m = new C0066m(c0431z, c0417lA.f5690e, c0431z.p(c0417lA));
            while (!this.f10901x) {
                try {
                    int iD = this.f10898u.f10845l.d(c0066m, C0996d.f10844v);
                    boolean z4 = false;
                    AbstractC0360m.h(iD != 1);
                    if (iD == 0) {
                        z4 = true;
                    }
                    if (!z4) {
                        break;
                    }
                } finally {
                    this.f10900w = c0066m.f799o - this.f10855m.f5690e;
                    boolean z5 = this.f10898u.f10852s instanceof C0064k;
                }
            }
        } finally {
            Z1.f.g(this.f10862t);
        }
    }

    @Override // B0.o
    public final void g() {
        this.f10901x = true;
    }
}
