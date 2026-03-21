package y2;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f10963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f10964b;

    public q(Class cls, Class cls2) {
        this.f10963a = cls;
        this.f10964b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f10963a.equals(this.f10963a) && qVar.f10964b.equals(this.f10964b);
    }

    public final int hashCode() {
        return Objects.hash(this.f10963a, this.f10964b);
    }

    public final String toString() {
        return this.f10963a.getSimpleName() + " with serialization type: " + this.f10964b.getSimpleName();
    }
}
