package t3;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f10056b;

    public N(String str, L l3) {
        this.f10055a = str;
        this.f10056b = l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n4 = (N) obj;
        return N3.h.a(this.f10055a, n4.f10055a) && this.f10056b == n4.f10056b;
    }

    public final int hashCode() {
        String str = this.f10055a;
        return this.f10056b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f10055a + ", type=" + this.f10056b + ")";
    }
}
