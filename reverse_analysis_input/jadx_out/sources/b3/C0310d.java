package b3;

/* JADX INFO: renamed from: b3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0310d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4914d;

    public C0310d(long j5, int i) {
        long jMax = Math.max(10000L, j5);
        AbstractC0307a.r("backoffPolicy", i);
        this.f4911a = i;
        this.f4912b = j5;
        this.f4913c = 10000L;
        this.f4914d = jMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0310d)) {
            return false;
        }
        C0310d c0310d = (C0310d) obj;
        return this.f4911a == c0310d.f4911a && this.f4912b == c0310d.f4912b && this.f4913c == c0310d.f4913c && this.f4914d == c0310d.f4914d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4914d) + AbstractC0307a.f(this.f4913c, AbstractC0307a.f(this.f4912b, O.i.b(this.f4911a) * 31, 31), 31);
    }

    public final String toString() {
        return "BackoffPolicyTaskConfig(backoffPolicy=" + AbstractC0307a.u(this.f4911a) + ", requestedBackoffDelay=" + this.f4912b + ", minBackoffInMillis=" + this.f4913c + ", backoffDelay=" + this.f4914d + ')';
    }
}
