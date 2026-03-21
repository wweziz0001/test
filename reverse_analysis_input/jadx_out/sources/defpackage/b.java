package defpackage;

import a.AbstractC0149a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f4821a;

    public b(Boolean bool) {
        this.f4821a = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return D1.b.u(AbstractC0149a.y(this.f4821a), AbstractC0149a.y(((b) obj).f4821a));
    }

    public final int hashCode() {
        return AbstractC0149a.y(this.f4821a).hashCode();
    }

    public final String toString() {
        return "ToggleMessage(enable=" + this.f4821a + ")";
    }
}
