package y0;

import F0.C0066m;
import F0.K;
import a0.AbstractC0156G;
import a0.C0190p;
import d0.AbstractC0360m;
import d0.C0363p;
import f0.C0417l;
import f0.C0431z;
import f0.InterfaceC0413h;
import x0.e0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC0993a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f10892A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final InterfaceC0998f f10893B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f10894C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public volatile boolean f10895D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f10896E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f10897z;

    public j(InterfaceC0413h interfaceC0413h, C0417l c0417l, C0190p c0190p, int i, Object obj, long j5, long j6, long j7, long j8, long j9, int i5, long j10, InterfaceC0998f interfaceC0998f) {
        super(interfaceC0413h, c0417l, c0190p, i, obj, j5, j6, j7, j8, j9);
        this.f10897z = i5;
        this.f10892A = j10;
        this.f10893B = interfaceC0998f;
    }

    @Override // y0.l
    public final long a() {
        return this.f10902u + ((long) this.f10897z);
    }

    @Override // y0.l
    public final boolean b() {
        return this.f10896E;
    }

    @Override // B0.o
    public final void e() {
        Z1.e eVar = this.f10833x;
        AbstractC0360m.i(eVar);
        if (this.f10894C == 0) {
            long j5 = this.f10892A;
            for (e0 e0Var : (e0[]) eVar.f3002n) {
                if (e0Var.f10680F != j5) {
                    e0Var.f10680F = j5;
                    e0Var.f10705z = true;
                }
            }
            InterfaceC0998f interfaceC0998f = this.f10893B;
            long j6 = this.f10831v;
            long j7 = j6 == -9223372036854775807L ? -9223372036854775807L : j6 - this.f10892A;
            long j8 = this.f10832w;
            ((C0996d) interfaceC0998f).a(eVar, j7, j8 == -9223372036854775807L ? -9223372036854775807L : j8 - this.f10892A);
        }
        try {
            C0417l c0417lA = this.f10855m.a(this.f10894C);
            C0431z c0431z = this.f10862t;
            C0066m c0066m = new C0066m(c0431z, c0417lA.f5690e, c0431z.p(c0417lA));
            while (!this.f10895D) {
                try {
                    int iD = ((C0996d) this.f10893B).f10845l.d(c0066m, C0996d.f10844v);
                    AbstractC0360m.h(iD != 1);
                    if (!(iD == 0)) {
                        break;
                    }
                } finally {
                    this.f10894C = c0066m.f799o - this.f10855m.f5690e;
                }
            }
            C0190p c0190p = this.f10857o;
            if (AbstractC0156G.j(c0190p.f3423m)) {
                int i = c0190p.f3409J;
                int i5 = c0190p.f3410K;
                if ((i > 1 || i5 > 1) && i != -1 && i5 != -1) {
                    K kW = eVar.w(4);
                    int i6 = i * i5;
                    long j9 = (this.f10861s - this.f10860r) / ((long) i6);
                    for (int i7 = 1; i7 < i6; i7++) {
                        kW.a(new C0363p(), 0, 0);
                        kW.b(((long) i7) * j9, 0, 0, 0, null);
                    }
                }
            }
            Z1.f.g(this.f10862t);
            this.f10896E = !this.f10895D;
        } catch (Throwable th) {
            Z1.f.g(this.f10862t);
            throw th;
        }
    }

    @Override // B0.o
    public final void g() {
        this.f10895D = true;
    }
}
