package a0;

import android.util.SparseBooleanArray;
import d0.AbstractC0360m;
import d0.AbstractC0370w;

/* JADX INFO: renamed from: a0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0188n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f3364a;

    public C0188n(SparseBooleanArray sparseBooleanArray) {
        this.f3364a = sparseBooleanArray;
    }

    public final int a(int i) {
        SparseBooleanArray sparseBooleanArray = this.f3364a;
        AbstractC0360m.e(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0188n)) {
            return false;
        }
        C0188n c0188n = (C0188n) obj;
        int i = AbstractC0370w.f5326a;
        SparseBooleanArray sparseBooleanArray = this.f3364a;
        if (i >= 24) {
            return sparseBooleanArray.equals(c0188n.f3364a);
        }
        if (sparseBooleanArray.size() != c0188n.f3364a.size()) {
            return false;
        }
        for (int i5 = 0; i5 < sparseBooleanArray.size(); i5++) {
            if (a(i5) != c0188n.a(i5)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = AbstractC0370w.f5326a;
        SparseBooleanArray sparseBooleanArray = this.f3364a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i5 = 0; i5 < sparseBooleanArray.size(); i5++) {
            size = (size * 31) + a(i5);
        }
        return size;
    }
}
