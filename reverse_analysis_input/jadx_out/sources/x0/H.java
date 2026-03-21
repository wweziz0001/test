package x0;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10535e;

    public H(Object obj) {
        this(-1L, obj);
    }

    public final H a(Object obj) {
        if (this.f10531a.equals(obj)) {
            return this;
        }
        return new H(obj, this.f10532b, this.f10533c, this.f10534d, this.f10535e);
    }

    public final boolean b() {
        return this.f10532b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h2 = (H) obj;
        return this.f10531a.equals(h2.f10531a) && this.f10532b == h2.f10532b && this.f10533c == h2.f10533c && this.f10534d == h2.f10534d && this.f10535e == h2.f10535e;
    }

    public final int hashCode() {
        return ((((((((this.f10531a.hashCode() + 527) * 31) + this.f10532b) * 31) + this.f10533c) * 31) + ((int) this.f10534d)) * 31) + this.f10535e;
    }

    public H(long j5, Object obj) {
        this(obj, -1, -1, j5, -1);
    }

    public H(Object obj, long j5, int i) {
        this(obj, -1, -1, j5, i);
    }

    public H(Object obj, int i, int i5, long j5, int i6) {
        this.f10531a = obj;
        this.f10532b = i;
        this.f10533c = i5;
        this.f10534d = j5;
        this.f10535e = i6;
    }
}
