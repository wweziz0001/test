package m2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends a0 implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a0 f8625l;

    public j0(a0 a0Var) {
        this.f8625l = a0Var;
    }

    @Override // m2.a0
    public final a0 a() {
        return this.f8625l;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f8625l.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j0) {
            return this.f8625l.equals(((j0) obj).f8625l);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f8625l.hashCode();
    }

    public final String toString() {
        return this.f8625l + ".reverse()";
    }
}
