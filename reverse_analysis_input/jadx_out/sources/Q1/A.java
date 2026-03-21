package Q1;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1773b;

    public A(long j5, long j6) {
        this.f1772a = j5;
        this.f1773b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !A.class.equals(obj.getClass())) {
            return false;
        }
        A a5 = (A) obj;
        return a5.f1772a == this.f1772a && a5.f1773b == this.f1773b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1773b) + (Long.hashCode(this.f1772a) * 31);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.f1772a + ", flexIntervalMillis=" + this.f1773b + '}';
    }
}
