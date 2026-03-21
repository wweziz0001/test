package Z1;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3010c;

    public g(int i, String str, int i5) {
        N3.h.e(str, "workSpecId");
        this.f3008a = str;
        this.f3009b = i;
        this.f3010c = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return N3.h.a(this.f3008a, gVar.f3008a) && this.f3009b == gVar.f3009b && this.f3010c == gVar.f3010c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3010c) + ((Integer.hashCode(this.f3009b) + (this.f3008a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.f3008a + ", generation=" + this.f3009b + ", systemId=" + this.f3010c + ')';
    }
}
