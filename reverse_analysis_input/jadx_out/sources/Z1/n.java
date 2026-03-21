package Z1;

import b3.AbstractC0307a;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3028b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return N3.h.a(this.f3027a, nVar.f3027a) && this.f3028b == nVar.f3028b;
    }

    public final int hashCode() {
        return O.i.b(this.f3028b) + (this.f3027a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f3027a + ", state=" + AbstractC0307a.x(this.f3028b) + ')';
    }
}
