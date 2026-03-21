package m2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends a0 implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final i0 f8623l = new i0();

    @Override // m2.a0
    public final a0 a() {
        return Z.f8576l;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
