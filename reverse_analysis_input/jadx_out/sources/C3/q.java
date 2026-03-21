package C3;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f295b;

    public q(int i, Object obj) {
        this.f294a = i;
        this.f295b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f294a == qVar.f294a && N3.h.a(this.f295b, qVar.f295b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f294a) * 31;
        Object obj = this.f295b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f294a + ", value=" + this.f295b + ')';
    }
}
