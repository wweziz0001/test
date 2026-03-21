package u0;

import F0.K;
import F0.s;
import a0.C0190p;
import d0.AbstractC0370w;
import t0.C0853j;

/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f10204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f10205g;

    public g(C0853j c0853j) {
        this.f10204f = c0853j;
        this.f10202d = -9223372036854775807L;
        this.f10200b = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    @Override // u0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(d0.C0363p r24, long r25, int r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.g.a(d0.p, long, int, boolean):void");
    }

    @Override // u0.i
    public void b(long j5, long j6) {
        this.f10202d = j5;
        this.f10203e = j6;
        this.f10201c = 0;
    }

    @Override // u0.i
    public void d(s sVar, int i) {
        K k4 = sVar.k(i, 2);
        this.f10205g = k4;
        int i5 = AbstractC0370w.f5326a;
        k4.c(((C0853j) this.f10204f).f9904c);
    }

    public g(int i, int i5, C0190p c0190p, int i6, Object obj, long j5, long j6) {
        this.f10199a = i;
        this.f10200b = i5;
        this.f10204f = c0190p;
        this.f10201c = i6;
        this.f10205g = obj;
        this.f10202d = j5;
        this.f10203e = j6;
    }

    @Override // u0.i
    public void c(long j5) {
    }
}
