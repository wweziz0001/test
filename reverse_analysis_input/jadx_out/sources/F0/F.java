package F0;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final F f689c = new F(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f691b;

    public F(long j5, long j6) {
        this.f690a = j5;
        this.f691b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f2 = (F) obj;
        return this.f690a == f2.f690a && this.f691b == f2.f691b;
    }

    public final int hashCode() {
        return (((int) this.f690a) * 31) + ((int) this.f691b);
    }

    public final String toString() {
        return "[timeUs=" + this.f690a + ", position=" + this.f691b + "]";
    }
}
