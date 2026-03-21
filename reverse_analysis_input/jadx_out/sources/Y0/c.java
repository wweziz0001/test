package Y0;

import F0.D;
import F0.F;
import android.util.Pair;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f2688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f2689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2690c;

    public c(long j5, long[] jArr, long[] jArr2) {
        this.f2688a = jArr;
        this.f2689b = jArr2;
        this.f2690c = j5 == -9223372036854775807L ? AbstractC0370w.M(jArr2[jArr2.length - 1]) : j5;
    }

    public static Pair b(long j5, long[] jArr, long[] jArr2) {
        int iE = AbstractC0370w.e(jArr, j5, true);
        long j6 = jArr[iE];
        long j7 = jArr2[iE];
        int i = iE + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j6), Long.valueOf(j7));
        }
        return Pair.create(Long.valueOf(j5), Long.valueOf(((long) ((jArr[i] == j6 ? 0.0d : (j5 - j6) / (r6 - j6)) * (jArr2[i] - j7))) + j7));
    }

    @Override // Y0.f
    public final long a(long j5) {
        return AbstractC0370w.M(((Long) b(j5, this.f2688a, this.f2689b).second).longValue());
    }

    @Override // F0.E
    public final boolean c() {
        return true;
    }

    @Override // Y0.f
    public final long f() {
        return -1L;
    }

    @Override // F0.E
    public final D g(long j5) {
        Pair pairB = b(AbstractC0370w.Z(AbstractC0370w.j(j5, 0L, this.f2690c)), this.f2689b, this.f2688a);
        F f2 = new F(AbstractC0370w.M(((Long) pairB.first).longValue()), ((Long) pairB.second).longValue());
        return new D(f2, f2);
    }

    @Override // Y0.f
    public final int h() {
        return -2147483647;
    }

    @Override // F0.E
    public final long i() {
        return this.f2690c;
    }
}
