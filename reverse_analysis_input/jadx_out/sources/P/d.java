package P;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1670a;

    public d(String str) {
        N3.h.e(str, "name");
        this.f1670a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return N3.h.a(this.f1670a, ((d) obj).f1670a);
    }

    public final int hashCode() {
        return this.f1670a.hashCode();
    }

    public final String toString() {
        return this.f1670a;
    }
}
