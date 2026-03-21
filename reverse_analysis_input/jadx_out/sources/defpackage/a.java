package defpackage;

import D1.b;
import a.AbstractC0149a;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f3152a;

    public a(Boolean bool) {
        this.f3152a = bool;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return b.u(AbstractC0149a.y(this.f3152a), AbstractC0149a.y(((a) obj).f3152a));
    }

    public final int hashCode() {
        return AbstractC0149a.y(this.f3152a).hashCode();
    }

    public final String toString() {
        return "IsEnabledMessage(enabled=" + this.f3152a + ")";
    }
}
