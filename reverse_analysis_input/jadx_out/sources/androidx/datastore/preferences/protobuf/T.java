package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0210b implements RandomAccess {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final T f4102o = new T(new Object[0], 0, false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object[] f4103m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4104n;

    public T(Object[] objArr, int i, boolean z4) {
        this.f4127l = z4;
        this.f4103m = objArr;
        this.f4104n = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i = this.f4104n;
        Object[] objArr = this.f4103m;
        if (i == objArr.length) {
            this.f4103m = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f4103m;
        int i5 = this.f4104n;
        this.f4104n = i5 + 1;
        objArr2[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void g(int i) {
        if (i < 0 || i >= this.f4104n) {
            StringBuilder sbJ = B0.j(i, "Index:", ", Size:");
            sbJ.append(this.f4104n);
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g(i);
        return this.f4103m[i];
    }

    public final T h(int i) {
        if (i >= this.f4104n) {
            return new T(Arrays.copyOf(this.f4103m, i), this.f4104n, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0210b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        f();
        g(i);
        Object[] objArr = this.f4103m;
        Object obj = objArr[i];
        if (i < this.f4104n - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f4104n--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        f();
        g(i);
        Object[] objArr = this.f4103m;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4104n;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i5;
        f();
        if (i >= 0 && i <= (i5 = this.f4104n)) {
            Object[] objArr = this.f4103m;
            if (i5 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i5 - i);
            } else {
                Object[] objArr2 = new Object[((i5 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f4103m, i, objArr2, i + 1, this.f4104n - i);
                this.f4103m = objArr2;
            }
            this.f4103m[i] = obj;
            this.f4104n++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbJ = B0.j(i, "Index:", ", Size:");
        sbJ.append(this.f4104n);
        throw new IndexOutOfBoundsException(sbJ.toString());
    }
}
