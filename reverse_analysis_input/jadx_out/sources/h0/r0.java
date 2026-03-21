package h0;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r0 f6274c = new r0(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6276b;

    public r0(int i, boolean z4) {
        this.f6275a = i;
        this.f6276b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r0.class != obj.getClass()) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f6275a == r0Var.f6275a && this.f6276b == r0Var.f6276b;
    }

    public final int hashCode() {
        return (this.f6275a << 1) + (this.f6276b ? 1 : 0);
    }
}
