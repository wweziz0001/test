package K1;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1260a;

    public l(List list) {
        this.f1260a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !l.class.equals(obj.getClass())) {
            return false;
        }
        return this.f1260a.equals(((l) obj).f1260a);
    }

    public final int hashCode() {
        return this.f1260a.hashCode();
    }

    public final String toString() {
        return C3.f.V((Collection) this.f1260a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
