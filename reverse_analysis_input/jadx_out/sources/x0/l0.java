package x0;

import a0.C0190p;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f10734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f10736n;

    public l0(long j5) {
        C0190p c0190p = m0.f10739u;
        int i = AbstractC0370w.f5326a;
        this.f10734l = ((long) 4) * ((j5 * 44100) / 1000000);
        b(0L);
    }

    public final void b(long j5) {
        C0190p c0190p = m0.f10739u;
        int i = AbstractC0370w.f5326a;
        this.f10736n = AbstractC0370w.j(((long) 4) * ((j5 * 44100) / 1000000), 0L, this.f10734l);
    }

    @Override // x0.f0
    public final int d(long j5) {
        long j6 = this.f10736n;
        b(j5);
        return (int) ((this.f10736n - j6) / ((long) m0.f10741w.length));
    }

    @Override // x0.f0
    public final boolean isReady() {
        return true;
    }

    @Override // x0.f0
    public final int k(Z1.e eVar, g0.e eVar2, int i) {
        if (!this.f10735m || (i & 2) != 0) {
            eVar.f3002n = m0.f10739u;
            this.f10735m = true;
            return -5;
        }
        long j5 = this.f10736n;
        long j6 = this.f10734l - j5;
        if (j6 == 0) {
            eVar2.b(4);
            return -4;
        }
        C0190p c0190p = m0.f10739u;
        int i5 = AbstractC0370w.f5326a;
        eVar2.f5789r = ((j5 / ((long) 4)) * 1000000) / 44100;
        eVar2.b(1);
        byte[] bArr = m0.f10741w;
        int iMin = (int) Math.min(bArr.length, j6);
        if ((4 & i) == 0) {
            eVar2.j(iMin);
            eVar2.f5787p.put(bArr, 0, iMin);
        }
        if ((i & 1) == 0) {
            this.f10736n += (long) iMin;
        }
        return -4;
    }

    @Override // x0.f0
    public final void a() {
    }
}
