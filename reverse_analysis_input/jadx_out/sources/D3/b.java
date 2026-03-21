package D3;

import Q1.C;
import b3.AbstractC0307a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class b extends C3.a implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object[] f590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f592n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b f593o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f594p;

    public b(Object[] objArr, int i, int i5, b bVar, c cVar) {
        N3.h.e(objArr, "backing");
        N3.h.e(cVar, "root");
        this.f590l = objArr;
        this.f591m = i;
        this.f592n = i5;
        this.f593o = bVar;
        this.f594p = cVar;
        ((AbstractList) this).modCount = ((AbstractList) cVar).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        l();
        k();
        j(this.f591m + this.f592n, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        N3.h.e(collection, "elements");
        l();
        k();
        int size = collection.size();
        i(this.f591m + this.f592n, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        l();
        k();
        n(this.f591m, this.f592n);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        k();
        if (obj != this) {
            if (obj instanceof List) {
                if (i4.a.a(this.f590l, this.f591m, this.f592n, (List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // C3.a
    public final int f() {
        k();
        return this.f592n;
    }

    @Override // C3.a
    public final Object g(int i) {
        l();
        k();
        int i5 = this.f592n;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(AbstractC0307a.g(i, i5, "index: ", ", size: "));
        }
        return m(this.f591m + i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        k();
        int i5 = this.f592n;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(AbstractC0307a.g(i, i5, "index: ", ", size: "));
        }
        return this.f590l[this.f591m + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        k();
        Object[] objArr = this.f590l;
        int i = this.f592n;
        int iHashCode = 1;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[this.f591m + i5];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, Collection collection, int i5) {
        ((AbstractList) this).modCount++;
        c cVar = this.f594p;
        b bVar = this.f593o;
        if (bVar != null) {
            bVar.i(i, collection, i5);
        } else {
            c cVar2 = c.f595o;
            cVar.i(i, collection, i5);
        }
        this.f590l = cVar.f596l;
        this.f592n += i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        k();
        for (int i = 0; i < this.f592n; i++) {
            if (N3.h.a(this.f590l[this.f591m + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        k();
        return this.f592n == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f594p;
        b bVar = this.f593o;
        if (bVar != null) {
            bVar.j(i, obj);
        } else {
            c cVar2 = c.f595o;
            cVar.j(i, obj);
        }
        this.f590l = cVar.f596l;
        this.f592n++;
    }

    public final void k() {
        if (((AbstractList) this.f594p).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void l() {
        if (this.f594p.f598n) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        k();
        for (int i = this.f592n - 1; i >= 0; i--) {
            if (N3.h.a(this.f590l[this.f591m + i], obj)) {
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
        Object objM;
        ((AbstractList) this).modCount++;
        b bVar = this.f593o;
        if (bVar != null) {
            objM = bVar.m(i);
        } else {
            c cVar = c.f595o;
            objM = this.f594p.m(i);
        }
        this.f592n--;
        return objM;
    }

    public final void n(int i, int i5) {
        if (i5 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f593o;
        if (bVar != null) {
            bVar.n(i, i5);
        } else {
            c cVar = c.f595o;
            this.f594p.n(i, i5);
        }
        this.f592n -= i5;
    }

    public final int o(int i, int i5, Collection collection, boolean z4) {
        int iO;
        b bVar = this.f593o;
        if (bVar != null) {
            iO = bVar.o(i, i5, collection, z4);
        } else {
            c cVar = c.f595o;
            iO = this.f594p.o(i, i5, collection, z4);
        }
        if (iO > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f592n -= iO;
        return iO;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        l();
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
        l();
        k();
        return o(this.f591m, this.f592n, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        N3.h.e(collection, "elements");
        l();
        k();
        return o(this.f591m, this.f592n, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        l();
        k();
        int i5 = this.f592n;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(AbstractC0307a.g(i, i5, "index: ", ", size: "));
        }
        Object[] objArr = this.f590l;
        int i6 = this.f591m;
        Object obj2 = objArr[i6 + i];
        objArr[i6 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i5) {
        C.f(i, i5, this.f592n);
        return new b(this.f590l, this.f591m + i, i5 - i, this, this.f594p);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        N3.h.e(objArr, "array");
        k();
        int length = objArr.length;
        int i = this.f592n;
        int i5 = this.f591m;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f590l, i5, i + i5, objArr.getClass());
            N3.h.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        C3.e.U(0, i5, i + i5, this.f590l, objArr);
        int i6 = this.f592n;
        if (i6 < objArr.length) {
            objArr[i6] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        k();
        return i4.a.b(this.f590l, this.f591m, this.f592n, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        k();
        int i5 = this.f592n;
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(AbstractC0307a.g(i, i5, "index: ", ", size: "));
        }
        return new a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        l();
        k();
        int i5 = this.f592n;
        if (i >= 0 && i <= i5) {
            j(this.f591m + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0307a.g(i, i5, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        N3.h.e(collection, "elements");
        l();
        k();
        int i5 = this.f592n;
        if (i >= 0 && i <= i5) {
            int size = collection.size();
            i(this.f591m + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(AbstractC0307a.g(i, i5, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        k();
        Object[] objArr = this.f590l;
        int i = this.f592n;
        int i5 = this.f591m;
        return C3.e.V(objArr, i5, i + i5);
    }
}
