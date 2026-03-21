package V1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2351a;

    public b(int i) {
        this.f2351a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f2351a == ((b) obj).f2351a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2351a);
    }

    public final String toString() {
        return "ConstraintsNotMet(reason=" + this.f2351a + ')';
    }
}
