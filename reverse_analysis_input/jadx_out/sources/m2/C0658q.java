package m2;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: m2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0658q extends a0 implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l2.d f8644l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a0 f8645m;

    public C0658q(l2.d dVar, a0 a0Var) {
        this.f8644l = dVar;
        a0Var.getClass();
        this.f8645m = a0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        l2.d dVar = this.f8644l;
        return this.f8645m.compare(dVar.apply(obj), dVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0658q)) {
            return false;
        }
        C0658q c0658q = (C0658q) obj;
        return this.f8644l.equals(c0658q.f8644l) && this.f8645m.equals(c0658q.f8645m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8644l, this.f8645m});
    }

    public final String toString() {
        return this.f8645m + ".onResultOf(" + this.f8644l + ")";
    }
}
