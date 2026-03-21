package m2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: m2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0656o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient Set f8639l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient Collection f8640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient Map f8641n;

    public abstract Map a();

    public boolean b(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0656o) {
            return a().equals(((AbstractC0656o) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
