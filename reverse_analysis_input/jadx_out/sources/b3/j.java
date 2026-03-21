package b3;

/* JADX INFO: loaded from: classes.dex */
public final class j extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4925c;

    public j(String str) {
        this.f4925c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && N3.h.a(this.f4925c, ((j) obj).f4925c);
    }

    public final int hashCode() {
        return this.f4925c.hashCode();
    }

    public final String toString() {
        return "ByTag(tag=" + this.f4925c + ')';
    }
}
