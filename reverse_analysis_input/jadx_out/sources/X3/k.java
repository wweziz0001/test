package X3;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f2668b = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2669a;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return N3.h.a(this.f2669a, ((k) obj).f2669a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f2669a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f2669a;
        if (obj instanceof i) {
            return ((i) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
