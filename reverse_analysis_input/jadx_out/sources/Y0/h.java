package Y0;

import F0.D;
import F0.F;
import d0.AbstractC0360m;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f2722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f2723g;

    public h(long j5, int i, long j6, int i5, long j7, long[] jArr) {
        this.f2717a = j5;
        this.f2718b = i;
        this.f2719c = j6;
        this.f2720d = i5;
        this.f2721e = j7;
        this.f2723g = jArr;
        this.f2722f = j7 != -1 ? j5 + j7 : -1L;
    }

    @Override // Y0.f
    public final long a(long j5) {
        long j6 = j5 - this.f2717a;
        if (!c() || j6 <= this.f2718b) {
            return 0L;
        }
        long[] jArr = this.f2723g;
        AbstractC0360m.i(jArr);
        double d5 = (j6 * 256.0d) / this.f2721e;
        int iE = AbstractC0370w.e(jArr, (long) d5, true);
        long j7 = this.f2719c;
        long j8 = (((long) iE) * j7) / 100;
        long j9 = jArr[iE];
        int i = iE + 1;
        long j10 = (j7 * ((long) i)) / 100;
        return Math.round((j9 == (iE == 99 ? 256L : jArr[i]) ? 0.0d : (d5 - j9) / (r0 - j9)) * (j10 - j8)) + j8;
    }

    @Override // F0.E
    public final boolean c() {
        return this.f2723g != null;
    }

    @Override // Y0.f
    public final long f() {
        return this.f2722f;
    }

    @Override // F0.E
    public final D g(long j5) {
        double d5;
        boolean zC = c();
        int i = this.f2718b;
        long j6 = this.f2717a;
        if (!zC) {
            F f2 = new F(0L, j6 + ((long) i));
            return new D(f2, f2);
        }
        long j7 = AbstractC0370w.j(j5, 0L, this.f2719c);
        double d6 = (j7 * 100.0d) / this.f2719c;
        double d7 = 0.0d;
        if (d6 <= 0.0d) {
            d5 = 256.0d;
        } else if (d6 >= 100.0d) {
            d5 = 256.0d;
            d7 = 256.0d;
        } else {
            int i5 = (int) d6;
            long[] jArr = this.f2723g;
            AbstractC0360m.i(jArr);
            double d8 = jArr[i5];
            d7 = (((i5 == 99 ? 256.0d : jArr[i5 + 1]) - d8) * (d6 - ((double) i5))) + d8;
            d5 = 256.0d;
        }
        double d9 = d7 / d5;
        long j8 = this.f2721e;
        F f5 = new F(j7, j6 + AbstractC0370w.j(Math.round(d9 * j8), i, j8 - 1));
        return new D(f5, f5);
    }

    @Override // Y0.f
    public final int h() {
        return this.f2720d;
    }

    @Override // F0.E
    public final long i() {
        return this.f2719c;
    }
}
