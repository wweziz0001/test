package d0;

/* JADX INFO: renamed from: d0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0364q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0364q f5316c = new C0364q(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5318b;

    static {
        new C0364q(0, 0);
    }

    public C0364q(int i, int i5) {
        AbstractC0360m.c((i == -1 || i >= 0) && (i5 == -1 || i5 >= 0));
        this.f5317a = i;
        this.f5318b = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0364q)) {
            return false;
        }
        C0364q c0364q = (C0364q) obj;
        return this.f5317a == c0364q.f5317a && this.f5318b == c0364q.f5318b;
    }

    public final int hashCode() {
        int i = this.f5317a;
        return ((i >>> 16) | (i << 16)) ^ this.f5318b;
    }

    public final String toString() {
        return this.f5317a + "x" + this.f5318b;
    }
}
