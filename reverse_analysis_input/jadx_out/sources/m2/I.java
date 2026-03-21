package m2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class I extends AbstractC0637D implements List, RandomAccess {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C0640G f8549m = new C0640G(b0.f8583p, 0);

    public static b0 m(int i, Object[] objArr) {
        return i == 0 ? b0.f8583p : new b0(i, objArr);
    }

    public static C0639F n() {
        return new C0639F(4);
    }

    public static C0639F o(int i) {
        r.e("expectedSize", i);
        return new C0639F(i);
    }

    public static I p(Collection collection) {
        if (!(collection instanceof AbstractC0637D)) {
            Object[] array = collection.toArray();
            r.c(array.length, array);
            return m(array.length, array);
        }
        I iF = ((AbstractC0637D) collection).f();
        if (!iF.k()) {
            return iF;
        }
        Object[] array2 = iF.toArray(AbstractC0637D.f8540l);
        return m(array2.length, array2);
    }

    public static b0 q(Object[] objArr) {
        if (objArr.length == 0) {
            return b0.f8583p;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        r.c(objArr2.length, objArr2);
        return m(objArr2.length, objArr2);
    }

    public static b0 s() {
        return b0.f8583p;
    }

    public static b0 t(Long l3, Long l4, Long l5, Long l6, Long l7) {
        Object[] objArr = {l3, l4, l5, l6, l7};
        r.c(5, objArr);
        return m(5, objArr);
    }

    public static b0 u(Object obj) {
        Object[] objArr = {obj};
        r.c(1, objArr);
        return m(1, objArr);
    }

    public static b0 v(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        r.c(2, objArr);
        return m(2, objArr);
    }

    public static b0 w(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        r.c(3, objArr);
        return m(3, objArr);
    }

    public static b0 x(a0 a0Var, List list) {
        a0Var.getClass();
        if (list == null) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        r.c(array.length, array);
        Arrays.sort(array, a0Var);
        return m(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // m2.AbstractC0637D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (i4.a.v(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && i4.a.v(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // m2.AbstractC0637D
    public int g(int i, Object[] objArr) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i + i5] = get(i5);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i = ~(~(get(i5).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // m2.AbstractC0637D, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // m2.AbstractC0637D
    /* JADX INFO: renamed from: l */
    public final q0 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final C0640G listIterator(int i) {
        D1.b.o(i, size());
        return isEmpty() ? f8549m : new C0640G(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public I subList(int i, int i5) {
        D1.b.p(i, i5, size());
        int i6 = i5 - i;
        return i6 == size() ? this : i6 == 0 ? b0.f8583p : new C0641H(this, i, i6);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // m2.AbstractC0637D
    public final I f() {
        return this;
    }
}
