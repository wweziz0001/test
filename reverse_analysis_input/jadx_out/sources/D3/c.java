package D3;

import Q1.C;
import b3.AbstractC0307a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class c extends C3.a implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f595o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object[] f596l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f597m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f598n;

    static {
        c cVar = new c(0);
        cVar.f598n = true;
        f595o = cVar;
    }

    public c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f596l = new Object[i];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        k();
        int i = this.f597m;
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.f596l[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        N3.h.e(collection, "elements");
        k();
        int size = collection.size();
        i(this.f597m, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        k();
        n(0, this.f597m);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!i4.a.a(this.f596l, 0, this.f597m, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // C3.a
    public final int f() {
        return this.f597m;
    }

    @Override // C3.a
    public final Object g(int i) {
        k();
        int i5 = this.f597m;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(AbstractC0307a.g(i, i5, "index: ", ", size: "));
        }
        return m(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i5 = this.f597m;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(AbstractC0307a.g(i, i5, "index: ", ", size: "));
        }
        return this.f596l[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f596l;
        int i = this.f597m;
        int iHashCode = 1;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, Collection collection, int i5) {
        ((AbstractList) this).modCount++;
        l(i, i5);
        Iterator it = collection.iterator();
        for (int i6 = 0; i6 < i5; i6++) {
            this.f596l[i + i6] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f597m; i++) {
            if (N3.h.a(this.f596l[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f597m == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, Object obj) {
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.f596l[i] = obj;
    }

    public final void k() {
        if (this.f598n) {
            throw new UnsupportedOperationException();
        }
    }

    public final void l(int i, int i5) {
        int i6 = this.f597m + i5;
        if (i6 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f596l;
        if (i6 > objArr.length) {
            int length = objArr.length;
            int i7 = length + (length >> 1);
            if (i7 - i6 < 0) {
                i7 = i6;
            }
            if (i7 - 2147483639 > 0) {
                i7 = i6 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i7);
            N3.h.d(objArrCopyOf, "copyOf(...)");
            this.f596l = objArrCopyOf;
        }
        Object[] objArr2 = this.f596l;
        C3.e.U(i + i5, i, this.f597m, objArr2, objArr2);
        this.f597m += i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f597m - 1; i >= 0; i--) {
            if (N3.h.a(this.f596l[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final Object m(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f596l;
        Object obj = objArr[i];
        C3.e.U(i, i + 1, this.f597m, objArr, objArr);
        Object[] objArr2 = this.f596l;
        int i5 = this.f597m - 1;
        N3.h.e(objArr2, "<this>");
        objArr2[i5] = null;
        this.f597m--;
        return obj;
    }

    public final void n(int i, int i5) {
        if (i5 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f596l;
        C3.e.U(i, i + i5, this.f597m, objArr, objArr);
        Object[] objArr2 = this.f596l;
        int i6 = this.f597m;
        i4.a.R(objArr2, i6 - i5, i6);
        this.f597m -= i5;
    }

    public final int o(int i, int i5, Collection collection, boolean z4) {
        int i6 = 0;
        int i7 = 0;
        while (i6 < i5) {
            int i8 = i + i6;
            if (collection.contains(this.f596l[i8]) == z4) {
                Object[] objArr = this.f596l;
                i6++;
                objArr[i7 + i] = objArr[i8];
                i7++;
            } else {
                i6++;
            }
        }
        int i9 = i5 - i7;
        Object[] objArr2 = this.f596l;
        C3.e.U(i + i7, i5 + i, this.f597m, objArr2, objArr2);
        Object[] objArr3 = this.f596l;
        int i10 = this.f597m;
        i4.a.R(objArr3, i10 - i9, i10);
        if (i9 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f597m -= i9;
        return i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        k();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            g(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        N3.h.e(collection, "elements");
        k();
        return o(0, this.f597m, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        N3.h.e(collection, "elements");
        k();
        return o(0, this.f597m, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        k();
        int i5 = this.f597m;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(AbstractC0307a.g(i, i5, "index: ", ", size: "));
        }
        Object[] objArr = this.f596l;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i5) {
        C.f(i, i5, this.f597m);
        return new b(this.f596l, i, i5 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        N3.h.e(objArr, "array");
        int length = objArr.length;
        int i = this.f597m;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f596l, 0, i, objArr.getClass());
            N3.h.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        C3.e.U(0, 0, i, this.f596l, objArr);
        int i5 = this.f597m;
        if (i5 < objArr.length) {
            objArr[i5] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return i4.a.b(this.f596l, 0, this.f597m, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i5 = this.f597m;
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(AbstractC0307a.g(i, i5, "index: ", ", size: "));
        }
        return new a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        N3.h.e(collection, "elements");
        k();
        int i5 = this.f597m;
        if (i >= 0 && i <= i5) {
            int size = collection.size();
            i(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0307a.g(i, i5, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        k();
        int i5 = this.f597m;
        if (i >= 0 && i <= i5) {
            ((AbstractList) this).modCount++;
            l(i, 1);
            this.f596l[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0307a.g(i, i5, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return C3.e.V(this.f596l, 0, this.f597m);
    }
}
