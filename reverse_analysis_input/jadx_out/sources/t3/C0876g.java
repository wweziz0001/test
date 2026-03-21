package t3;

/* JADX INFO: renamed from: t3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0876g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10069b;

    public C0876g(String str, boolean z4) {
        this.f10068a = str;
        this.f10069b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0876g)) {
            return false;
        }
        C0876g c0876g = (C0876g) obj;
        return N3.h.a(this.f10068a, c0876g.f10068a) && this.f10069b == c0876g.f10069b;
    }

    public final int hashCode() {
        String str = this.f10068a;
        return Boolean.hashCode(this.f10069b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f10068a + ", useDataStore=" + this.f10069b + ")";
    }
}
