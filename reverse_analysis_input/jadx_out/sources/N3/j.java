package N3;

/* JADX INFO: loaded from: classes.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f1621a;

    public j(Class cls) {
        this.f1621a = cls;
    }

    @Override // N3.d
    public final Class a() {
        return this.f1621a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (h.a(this.f1621a, ((j) obj).f1621a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1621a.hashCode();
    }

    public final String toString() {
        return this.f1621a + " (Kotlin reflection is not available)";
    }
}
