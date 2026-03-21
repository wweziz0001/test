package C3;

import Q1.C;
import b3.AbstractC0307a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object[] f286o = new Object[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object[] f288m = f286o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f289n;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i5 = this.f289n;
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(AbstractC0307a.g(i, i5, "index: ", ", size: "));
        }
        if (i == i5) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        n();
        i(this.f289n + 1);
        int iM = m(this.f287l + i);
        int i6 = this.f289n;
        if (i < ((i6 + 1) >> 1)) {
            if (iM == 0) {
                Object[] objArr = this.f288m;
                N3.h.e(objArr, "<this>");
                iM = objArr.length;
            }
            int i7 = iM - 1;
            int i8 = this.f287l;
            if (i8 == 0) {
                Object[] objArr2 = this.f288m;
                N3.h.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i8 - 1;
            }
            int i9 = this.f287l;
            if (i7 >= i9) {
                Object[] objArr3 = this.f288m;
                objArr3[length] = objArr3[i9];
                e.U(i9, i9 + 1, i7 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f288m;
                e.U(i9 - 1, i9, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f288m;
                objArr5[objArr5.length - 1] = objArr5[0];
                e.U(0, 1, i7 + 1, objArr5, objArr5);
            }
            this.f288m[i7] = obj;
            this.f287l = length;
        } else {
            int iM2 = m(i6 + this.f287l);
            if (iM < iM2) {
                Object[] objArr6 = this.f288m;
                e.U(iM + 1, iM, iM2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f288m;
                e.U(1, 0, iM2, objArr7, objArr7);
                Object[] objArr8 = this.f288m;
                objArr8[0] = objArr8[objArr8.length - 1];
                e.U(iM + 1, iM, objArr8.length - 1, objArr8, objArr8);
            }
            this.f288m[iM] = obj;
        }
        this.f289n++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        N3.h.e(collection, "elements");
        int i5 = this.f289n;
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(AbstractC0307a.g(i, i5, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f289n) {
            return addAll(collection);
        }
        n();
        i(collection.size() + this.f289n);
        int iM = m(this.f289n + this.f287l);
        int iM2 = m(this.f287l + i);
        int size = collection.size();
        if (i < ((this.f289n + 1) >> 1)) {
            int i6 = this.f287l;
            int length = i6 - size;
            if (iM2 < i6) {
                Object[] objArr = this.f288m;
                e.U(length, i6, objArr.length, objArr, objArr);
                if (size >= iM2) {
                    Object[] objArr2 = this.f288m;
                    e.U(objArr2.length - size, 0, iM2, objArr2, objArr2);
                } else {
                    Object[] objArr3 = this.f288m;
                    e.U(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.f288m;
                    e.U(0, size, iM2, objArr4, objArr4);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f288m;
                e.U(length, i6, iM2, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.f288m;
                length += objArr6.length;
                int i7 = iM2 - i6;
                int length2 = objArr6.length - length;
                if (length2 >= i7) {
                    e.U(length, i6, iM2, objArr6, objArr6);
                } else {
                    e.U(length, i6, i6 + length2, objArr6, objArr6);
                    Object[] objArr7 = this.f288m;
                    e.U(0, this.f287l + length2, iM2, objArr7, objArr7);
                }
            }
            this.f287l = length;
            h(k(iM2 - size), collection);
        } else {
            int i8 = iM2 + size;
            if (iM2 < iM) {
                int i9 = size + iM;
                Object[] objArr8 = this.f288m;
                if (i9 <= objArr8.length) {
                    e.U(i8, iM2, iM, objArr8, objArr8);
                } else if (i8 >= objArr8.length) {
                    e.U(i8 - objArr8.length, iM2, iM, objArr8, objArr8);
                } else {
                    int length3 = iM - (i9 - objArr8.length);
                    e.U(0, length3, iM, objArr8, objArr8);
                    Object[] objArr9 = this.f288m;
                    e.U(i8, iM2, length3, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.f288m;
                e.U(size, 0, iM, objArr10, objArr10);
                Object[] objArr11 = this.f288m;
                if (i8 >= objArr11.length) {
                    e.U(i8 - objArr11.length, iM2, objArr11.length, objArr11, objArr11);
                } else {
                    e.U(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.f288m;
                    e.U(i8, iM2, objArr12.length - size, objArr12, objArr12);
                }
            }
            h(iM2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        n();
        i(this.f289n + 1);
        int length = this.f287l;
        if (length == 0) {
            Object[] objArr = this.f288m;
            N3.h.e(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.f287l = i;
        this.f288m[i] = obj;
        this.f289n++;
    }

    public final void addLast(Object obj) {
        n();
        i(f() + 1);
        this.f288m[m(f() + this.f287l)] = obj;
        this.f289n = f() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            n();
            l(this.f287l, m(f() + this.f287l));
        }
        this.f287l = 0;
        this.f289n = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // C3.a
    public final int f() {
        return this.f289n;
    }

    @Override // C3.a
    public final Object g(int i) {
        int i5 = this.f289n;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(AbstractC0307a.g(i, i5, "index: ", ", size: "));
        }
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        n();
        int iM = m(this.f287l + i);
        Object[] objArr = this.f288m;
        Object obj = objArr[iM];
        if (i < (this.f289n >> 1)) {
            int i6 = this.f287l;
            if (iM >= i6) {
                e.U(i6 + 1, i6, iM, objArr, objArr);
            } else {
                e.U(1, 0, iM, objArr, objArr);
                Object[] objArr2 = this.f288m;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i7 = this.f287l;
                e.U(i7 + 1, i7, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f288m;
            int i8 = this.f287l;
            objArr3[i8] = null;
            this.f287l = j(i8);
        } else {
            int iM2 = m((size() - 1) + this.f287l);
            if (iM <= iM2) {
                Object[] objArr4 = this.f288m;
                e.U(iM, iM + 1, iM2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f288m;
                e.U(iM, iM + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f288m;
                objArr6[objArr6.length - 1] = objArr6[0];
                e.U(0, 1, iM2 + 1, objArr6, objArr6);
            }
            this.f288m[iM2] = null;
        }
        this.f289n--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iF = f();
        if (i < 0 || i >= iF) {
            throw new IndexOutOfBoundsException(AbstractC0307a.g(i, iF, "index: ", ", size: "));
        }
        return this.f288m[m(this.f287l + i)];
    }

    public final void h(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f288m.length;
        while (i < length && it.hasNext()) {
            this.f288m[i] = it.next();
            i++;
        }
        int i5 = this.f287l;
        for (int i6 = 0; i6 < i5 && it.hasNext(); i6++) {
            this.f288m[i6] = it.next();
        }
        this.f289n = collection.size() + f();
    }

    public final void i(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f288m;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f286o) {
            if (i < 10) {
                i = 10;
            }
            this.f288m = new Object[i];
            return;
        }
        int length = objArr.length;
        int i5 = length + (length >> 1);
        if (i5 - i < 0) {
            i5 = i;
        }
        if (i5 - 2147483639 > 0) {
            i5 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i5];
        e.U(0, this.f287l, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f288m;
        int length2 = objArr3.length;
        int i6 = this.f287l;
        e.U(length2 - i6, 0, i6, objArr3, objArr2);
        this.f287l = 0;
        this.f288m = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM = m(f() + this.f287l);
        int length = this.f287l;
        if (length < iM) {
            while (length < iM) {
                if (N3.h.a(obj, this.f288m[length])) {
                    i = this.f287l;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM) {
            return -1;
        }
        int length2 = this.f288m.length;
        while (true) {
            if (length >= length2) {
                for (int i5 = 0; i5 < iM; i5++) {
                    if (N3.h.a(obj, this.f288m[i5])) {
                        length = i5 + this.f288m.length;
                        i = this.f287l;
                    }
                }
                return -1;
            }
            if (N3.h.a(obj, this.f288m[length])) {
                i = this.f287l;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return f() == 0;
    }

    public final int j(int i) {
        N3.h.e(this.f288m, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int k(int i) {
        return i < 0 ? i + this.f288m.length : i;
    }

    public final void l(int i, int i5) {
        if (i < i5) {
            e.W(this.f288m, null, i, i5);
            return;
        }
        Object[] objArr = this.f288m;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        e.W(this.f288m, null, 0, i5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM = m(this.f289n + this.f287l);
        int i5 = this.f287l;
        if (i5 < iM) {
            length = iM - 1;
            if (i5 <= length) {
                while (!N3.h.a(obj, this.f288m[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i = this.f287l;
                return length - i;
            }
            return -1;
        }
        if (i5 > iM) {
            int i6 = iM - 1;
            while (true) {
                if (-1 >= i6) {
                    Object[] objArr = this.f288m;
                    N3.h.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i7 = this.f287l;
                    if (i7 <= length) {
                        while (!N3.h.a(obj, this.f288m[length])) {
                            if (length != i7) {
                                length--;
                            }
                        }
                        i = this.f287l;
                    }
                } else {
                    if (N3.h.a(obj, this.f288m[i6])) {
                        length = i6 + this.f288m.length;
                        i = this.f287l;
                        break;
                    }
                    i6--;
                }
            }
        }
        return -1;
    }

    public final int m(int i) {
        Object[] objArr = this.f288m;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void n() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        g(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM;
        N3.h.e(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f288m.length != 0) {
            int iM2 = m(this.f289n + this.f287l);
            int i = this.f287l;
            if (i < iM2) {
                iM = i;
                while (i < iM2) {
                    Object obj = this.f288m[i];
                    if (collection.contains(obj)) {
                        z4 = true;
                    } else {
                        this.f288m[iM] = obj;
                        iM++;
                    }
                    i++;
                }
                e.W(this.f288m, null, iM, iM2);
            } else {
                int length = this.f288m.length;
                boolean z5 = false;
                int i5 = i;
                while (i < length) {
                    Object[] objArr = this.f288m;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z5 = true;
                    } else {
                        this.f288m[i5] = obj2;
                        i5++;
                    }
                    i++;
                }
                iM = m(i5);
                for (int i6 = 0; i6 < iM2; i6++) {
                    Object[] objArr2 = this.f288m;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (collection.contains(obj3)) {
                        z5 = true;
                    } else {
                        this.f288m[iM] = obj3;
                        iM = j(iM);
                    }
                }
                z4 = z5;
            }
            if (z4) {
                n();
                this.f289n = k(iM - this.f287l);
            }
        }
        return z4;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        Object[] objArr = this.f288m;
        int i = this.f287l;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f287l = j(i);
        this.f289n = f() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        n();
        int iM = m((size() - 1) + this.f287l);
        Object[] objArr = this.f288m;
        Object obj = objArr[iM];
        objArr[iM] = null;
        this.f289n = f() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i5) {
        C.f(i, i5, this.f289n);
        int i6 = i5 - i;
        if (i6 == 0) {
            return;
        }
        if (i6 == this.f289n) {
            clear();
            return;
        }
        if (i6 == 1) {
            g(i);
            return;
        }
        n();
        if (i < this.f289n - i5) {
            int iM = m((i - 1) + this.f287l);
            int iM2 = m((i5 - 1) + this.f287l);
            while (i > 0) {
                int i7 = iM + 1;
                int iMin = Math.min(i, Math.min(i7, iM2 + 1));
                Object[] objArr = this.f288m;
                int i8 = iM2 - iMin;
                int i9 = iM - iMin;
                e.U(i8 + 1, i9 + 1, i7, objArr, objArr);
                iM = k(i9);
                iM2 = k(i8);
                i -= iMin;
            }
            int iM3 = m(this.f287l + i6);
            l(this.f287l, iM3);
            this.f287l = iM3;
        } else {
            int iM4 = m(this.f287l + i5);
            int iM5 = m(this.f287l + i);
            int i10 = this.f289n;
            while (true) {
                i10 -= i5;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f288m;
                i5 = Math.min(i10, Math.min(objArr2.length - iM4, objArr2.length - iM5));
                Object[] objArr3 = this.f288m;
                int i11 = iM4 + i5;
                e.U(iM5, iM4, i11, objArr3, objArr3);
                iM4 = m(i11);
                iM5 = m(iM5 + i5);
            }
            int iM6 = m(this.f289n + this.f287l);
            l(k(iM6 - i6), iM6);
        }
        this.f289n -= i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM;
        N3.h.e(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f288m.length != 0) {
            int iM2 = m(this.f289n + this.f287l);
            int i = this.f287l;
            if (i < iM2) {
                iM = i;
                while (i < iM2) {
                    Object obj = this.f288m[i];
                    if (collection.contains(obj)) {
                        this.f288m[iM] = obj;
                        iM++;
                    } else {
                        z4 = true;
                    }
                    i++;
                }
                e.W(this.f288m, null, iM, iM2);
            } else {
                int length = this.f288m.length;
                boolean z5 = false;
                int i5 = i;
                while (i < length) {
                    Object[] objArr = this.f288m;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f288m[i5] = obj2;
                        i5++;
                    } else {
                        z5 = true;
                    }
                    i++;
                }
                iM = m(i5);
                for (int i6 = 0; i6 < iM2; i6++) {
                    Object[] objArr2 = this.f288m;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (collection.contains(obj3)) {
                        this.f288m[iM] = obj3;
                        iM = j(iM);
                    } else {
                        z5 = true;
                    }
                }
                z4 = z5;
            }
            if (z4) {
                n();
                this.f289n = k(iM - this.f287l);
            }
        }
        return z4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iF = f();
        if (i < 0 || i >= iF) {
            throw new IndexOutOfBoundsException(AbstractC0307a.g(i, iF, "index: ", ", size: "));
        }
        int iM = m(this.f287l + i);
        Object[] objArr = this.f288m;
        Object obj2 = objArr[iM];
        objArr[iM] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[f()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        N3.h.e(objArr, "array");
        int length = objArr.length;
        int i = this.f289n;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            N3.h.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iM = m(this.f289n + this.f287l);
        int i5 = this.f287l;
        if (i5 < iM) {
            e.U(0, i5, iM, this.f288m, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f288m;
            e.U(0, this.f287l, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f288m;
            e.U(objArr3.length - this.f287l, 0, iM, objArr3, objArr);
        }
        int i6 = this.f289n;
        if (i6 < objArr.length) {
            objArr[i6] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        N3.h.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        n();
        i(collection.size() + f());
        h(m(f() + this.f287l), collection);
        return true;
    }
}
