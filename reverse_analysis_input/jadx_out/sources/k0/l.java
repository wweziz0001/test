package k0;

import a0.C0190p;
import d0.AbstractC0370w;
import x0.f0;

/* JADX INFO: loaded from: classes.dex */
public final class l implements f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0190p f7616l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f7618n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7619o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l0.g f7620p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7621q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7622r;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Z1.e f7617m = new Z1.e(4, (byte) 0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f7623s = -9223372036854775807L;

    public l(l0.g gVar, C0190p c0190p, boolean z4) {
        this.f7616l = c0190p;
        this.f7620p = gVar;
        this.f7618n = gVar.f7850b;
        b(gVar, z4);
    }

    public final void b(l0.g gVar, boolean z4) {
        int i = this.f7622r;
        long j5 = -9223372036854775807L;
        long j6 = i == 0 ? -9223372036854775807L : this.f7618n[i - 1];
        this.f7619o = z4;
        this.f7620p = gVar;
        long[] jArr = gVar.f7850b;
        this.f7618n = jArr;
        long j7 = this.f7623s;
        if (j7 == -9223372036854775807L) {
            if (j6 != -9223372036854775807L) {
                this.f7622r = AbstractC0370w.a(jArr, j6, false);
            }
        } else {
            int iA = AbstractC0370w.a(jArr, j7, true);
            this.f7622r = iA;
            if (this.f7619o && iA == this.f7618n.length) {
                j5 = j7;
            }
            this.f7623s = j5;
        }
    }

    @Override // x0.f0
    public final int d(long j5) {
        int iMax = Math.max(this.f7622r, AbstractC0370w.a(this.f7618n, j5, true));
        int i = iMax - this.f7622r;
        this.f7622r = iMax;
        return i;
    }

    @Override // x0.f0
    public final boolean isReady() {
        return true;
    }

    @Override // x0.f0
    public final int k(Z1.e eVar, g0.e eVar2, int i) {
        int i5 = this.f7622r;
        boolean z4 = i5 == this.f7618n.length;
        if (z4 && !this.f7619o) {
            eVar2.f5494m = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.f7621q) {
            eVar.f3002n = this.f7616l;
            this.f7621q = true;
            return -5;
        }
        if (z4) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.f7622r = i5 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrO = this.f7617m.o(this.f7620p.f7849a[i5]);
            eVar2.j(bArrO.length);
            eVar2.f5787p.put(bArrO);
        }
        eVar2.f5789r = this.f7618n[i5];
        eVar2.f5494m = 1;
        return -4;
    }

    @Override // x0.f0
    public final void a() {
    }
}
