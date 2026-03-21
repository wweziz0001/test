package m2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import m.B0;

/* JADX INFO: renamed from: m2.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0634A extends a0 implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Comparator[] f8535l;

    public C0634A(C0658q c0658q, C0658q c0658q2) {
        this.f8535l = new Comparator[]{c0658q, c0658q2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f8535l;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0634A) {
            return Arrays.equals(this.f8535l, ((C0634A) obj).f8535l);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8535l);
    }

    public final String toString() {
        return B0.i(new StringBuilder("Ordering.compound("), Arrays.toString(this.f8535l), ")");
    }
}
