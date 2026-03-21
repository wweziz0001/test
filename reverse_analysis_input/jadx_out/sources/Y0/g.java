package Y0;

import F0.D;
import F0.F;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f2712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f2713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2716e;

    public g(long[] jArr, long[] jArr2, long j5, long j6, int i) {
        this.f2712a = jArr;
        this.f2713b = jArr2;
        this.f2714c = j5;
        this.f2715d = j6;
        this.f2716e = i;
    }

    @Override // Y0.f
    public final long a(long j5) {
        return this.f2712a[AbstractC0370w.e(this.f2713b, j5, true)];
    }

    @Override // F0.E
    public final boolean c() {
        return true;
    }

    @Override // Y0.f
    public final long f() {
        return this.f2715d;
    }

    @Override // F0.E
    public final D g(long j5) {
        long[] jArr = this.f2712a;
        int iE = AbstractC0370w.e(jArr, j5, true);
        long j6 = jArr[iE];
        long[] jArr2 = this.f2713b;
        F f2 = new F(j6, jArr2[iE]);
        if (j6 >= j5 || iE == jArr.length - 1) {
            return new D(f2, f2);
        }
        int i = iE + 1;
        return new D(f2, new F(jArr[i], jArr2[i]));
    }

    @Override // Y0.f
    public final int h() {
        return this.f2716e;
    }

    @Override // F0.E
    public final long i() {
        return this.f2714c;
    }
}
