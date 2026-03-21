package y0;

import F0.C0066m;
import F0.K;
import a0.C0190p;
import d0.AbstractC0360m;
import f0.C0417l;
import f0.C0431z;
import f0.InterfaceC0413h;
import x0.e0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC0993a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0190p f10904A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f10905B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f10906C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f10907z;

    public n(InterfaceC0413h interfaceC0413h, C0417l c0417l, C0190p c0190p, int i, Object obj, long j5, long j6, long j7, int i5, C0190p c0190p2) {
        super(interfaceC0413h, c0417l, c0190p, i, obj, j5, j6, -9223372036854775807L, -9223372036854775807L, j7);
        this.f10907z = i5;
        this.f10904A = c0190p2;
    }

    @Override // y0.l
    public final boolean b() {
        return this.f10906C;
    }

    @Override // B0.o
    public final void e() {
        C0431z c0431z = this.f10862t;
        Z1.e eVar = this.f10833x;
        AbstractC0360m.i(eVar);
        for (e0 e0Var : (e0[]) eVar.f3002n) {
            if (e0Var.f10680F != 0) {
                e0Var.f10680F = 0L;
                e0Var.f10705z = true;
            }
        }
        K kW = eVar.w(this.f10907z);
        kW.c(this.f10904A);
        try {
            long jP = c0431z.p(this.f10855m.a(this.f10905B));
            if (jP != -1) {
                jP += this.f10905B;
            }
            C0066m c0066m = new C0066m(this.f10862t, this.f10905B, jP);
            for (int iD = 0; iD != -1; iD = kW.d(c0066m, Integer.MAX_VALUE, true)) {
                this.f10905B += (long) iD;
            }
            kW.b(this.f10860r, 1, (int) this.f10905B, 0, null);
            Z1.f.g(c0431z);
            this.f10906C = true;
        } catch (Throwable th) {
            Z1.f.g(c0431z);
            throw th;
        }
    }

    @Override // B0.o
    public final void g() {
    }
}
