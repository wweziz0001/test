package Z1;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3017b;

    public j(String str, int i) {
        N3.h.e(str, "workSpecId");
        this.f3016a = str;
        this.f3017b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return N3.h.a(this.f3016a, jVar.f3016a) && this.f3017b == jVar.f3017b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3017b) + (this.f3016a.hashCode() * 31);
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f3016a + ", generation=" + this.f3017b + ')';
    }
}
