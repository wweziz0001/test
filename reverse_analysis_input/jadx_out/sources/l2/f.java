package l2;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f implements e, Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f8208l;

    public f(List list) {
        this.f8208l = list;
    }

    @Override // l2.e
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f8208l;
            if (i >= list.size()) {
                return true;
            }
            if (!((e) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f8208l.equals(((f) obj).f8208l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8208l.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z4 = true;
        for (Object obj : this.f8208l) {
            if (!z4) {
                sb.append(',');
            }
            sb.append(obj);
            z4 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
