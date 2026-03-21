package Z0;

import F0.C0066m;
import F0.E;
import d0.AbstractC0360m;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a1.g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f2828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f2829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f2830n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f2831o;

    public b(long j5, int i) {
        AbstractC0360m.h(((B0.a) this.f2830n) == null);
        this.f2828l = j5;
        this.f2829m = j5 + ((long) i);
    }

    @Override // a1.g
    public E e() {
        AbstractC0360m.h(this.f2828l != -1);
        return new F0.v((F0.w) this.f2830n, this.f2828l, 0);
    }

    @Override // a1.g
    public void j(long j5) {
        long[] jArr = (long[]) ((Z1.l) this.f2831o).f3020l;
        this.f2829m = jArr[AbstractC0370w.e(jArr, j5, true)];
    }

    @Override // a1.g
    public long k(C0066m c0066m) {
        long j5 = this.f2829m;
        if (j5 < 0) {
            return -1L;
        }
        long j6 = -(j5 + 2);
        this.f2829m = -1L;
        return j6;
    }

    public b(String str, byte[] bArr, long j5, long j6) {
        this.f2830n = str;
        this.f2831o = bArr;
        this.f2828l = j5;
        this.f2829m = j6;
    }
}
