package B3;

import N3.h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f269m;

    public b(Object obj, Object obj2) {
        this.f268l = obj;
        this.f269m = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.f268l, bVar.f268l) && h.a(this.f269m, bVar.f269m);
    }

    public final int hashCode() {
        Object obj = this.f268l;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f269m;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f268l + ", " + this.f269m + ')';
    }
}
