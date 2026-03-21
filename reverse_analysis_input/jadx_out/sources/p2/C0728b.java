package p2;

import Q1.C;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: p2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0728b extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f9197l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9198m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f9199n;

    public C0728b(int i, int i5, int[] iArr) {
        this.f9197l = iArr;
        this.f9198m = i;
        this.f9199n = i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            if (C.a0(((Integer) obj).intValue(), this.f9198m, this.f9199n, this.f9197l) != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0728b)) {
            return super.equals(obj);
        }
        C0728b c0728b = (C0728b) obj;
        int size = size();
        if (c0728b.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f9197l[this.f9198m + i] != c0728b.f9197l[c0728b.f9198m + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        D1.b.l(i, size());
        return Integer.valueOf(this.f9197l[this.f9198m + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i5 = this.f9198m; i5 < this.f9199n; i5++) {
            i = (i * 31) + this.f9197l[i5];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f9197l;
        int i = this.f9198m;
        int iA0 = C.a0(iIntValue, i, this.f9199n, iArr);
        if (iA0 >= 0) {
            return iA0 - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i5 = this.f9199n;
            while (true) {
                i5--;
                i = this.f9198m;
                if (i5 < i) {
                    i5 = -1;
                    break;
                }
                if (this.f9197l[i5] == iIntValue) {
                    break;
                }
            }
            if (i5 >= 0) {
                return i5 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        D1.b.l(i, size());
        int i5 = this.f9198m + i;
        int[] iArr = this.f9197l;
        int i6 = iArr[i5];
        num.getClass();
        iArr[i5] = num.intValue();
        return Integer.valueOf(i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9199n - this.f9198m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i5) {
        D1.b.p(i, i5, size());
        if (i == i5) {
            return Collections.emptyList();
        }
        int i6 = this.f9198m;
        return new C0728b(i + i6, i6 + i5, this.f9197l);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f9197l;
        int i = this.f9198m;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.f9199n) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }
}
