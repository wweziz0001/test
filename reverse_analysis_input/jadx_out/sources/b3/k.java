package b3;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4926c;

    public k(String str) {
        this.f4926c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && N3.h.a(this.f4926c, ((k) obj).f4926c);
    }

    public final int hashCode() {
        return this.f4926c.hashCode();
    }

    public final String toString() {
        return "ByUniqueName(uniqueName=" + this.f4926c + ')';
    }
}
