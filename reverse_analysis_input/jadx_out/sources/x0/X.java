package x0;

/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10587b;

    public X(int i, boolean z4) {
        this.f10586a = i;
        this.f10587b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || X.class != obj.getClass()) {
            return false;
        }
        X x4 = (X) obj;
        return this.f10586a == x4.f10586a && this.f10587b == x4.f10587b;
    }

    public final int hashCode() {
        return (this.f10586a * 31) + (this.f10587b ? 1 : 0);
    }
}
