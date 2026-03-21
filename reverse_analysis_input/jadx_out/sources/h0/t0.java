package h0;

import d0.AbstractC0360m;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t0 f6280c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6282b;

    static {
        t0 t0Var = new t0(0L, 0L);
        new t0(Long.MAX_VALUE, Long.MAX_VALUE);
        new t0(Long.MAX_VALUE, 0L);
        new t0(0L, Long.MAX_VALUE);
        f6280c = t0Var;
    }

    public t0(long j5, long j6) {
        AbstractC0360m.c(j5 >= 0);
        AbstractC0360m.c(j6 >= 0);
        this.f6281a = j5;
        this.f6282b = j6;
    }

    public final long a(long j5, long j6, long j7) {
        long j8 = this.f6281a;
        long j9 = this.f6282b;
        if (j8 == 0 && j9 == 0) {
            return j5;
        }
        int i = AbstractC0370w.f5326a;
        long j10 = j5 - j8;
        if (((j8 ^ j5) & (j5 ^ j10)) < 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j5 + j9;
        if (((j9 ^ j11) & (j5 ^ j11)) < 0) {
            j11 = Long.MAX_VALUE;
        }
        boolean z4 = false;
        boolean z5 = j10 <= j6 && j6 <= j11;
        if (j10 <= j7 && j7 <= j11) {
            z4 = true;
        }
        return (z5 && z4) ? Math.abs(j6 - j5) <= Math.abs(j7 - j5) ? j6 : j7 : z5 ? j6 : z4 ? j7 : j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f6281a == t0Var.f6281a && this.f6282b == t0Var.f6282b;
    }

    public final int hashCode() {
        return (((int) this.f6281a) * 31) + ((int) this.f6282b);
    }
}
