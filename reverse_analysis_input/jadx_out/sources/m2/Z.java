package m2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends a0 implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Z f8576l = new Z();

    @Override // m2.a0
    public final a0 a() {
        return i0.f8623l;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
