package Z1;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f2999b;

    public d(String str, Long l3) {
        this.f2998a = str;
        this.f2999b = l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return N3.h.a(this.f2998a, dVar.f2998a) && N3.h.a(this.f2999b, dVar.f2999b);
    }

    public final int hashCode() {
        int iHashCode = this.f2998a.hashCode() * 31;
        Long l3 = this.f2999b;
        return iHashCode + (l3 == null ? 0 : l3.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f2998a + ", value=" + this.f2999b + ')';
    }
}
