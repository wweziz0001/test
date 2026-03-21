package m2;

import b3.AbstractC0307a;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static int b(int i) {
        if (i < 3) {
            e("expectedSize", i);
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(((double) i) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static void c(int i, Object[] objArr) {
        for (int i5 = 0; i5 < i; i5++) {
            if (objArr[i5] == null) {
                throw new NullPointerException(AbstractC0307a.i("at index ", i5));
            }
        }
    }

    public static void d(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void e(String str, int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static Object g(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(AbstractC0307a.i("must be power of 2 between 2^1 and 2^30: ", i));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static boolean h(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean i(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static l0 j(Set set, l2.e eVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof l0)) {
                set.getClass();
                return new l0(set, eVar);
            }
            l0 l0Var = (l0) set;
            l2.e eVar2 = l0Var.f8636m;
            eVar2.getClass();
            return new l0(l0Var.f8635l, new l2.f(Arrays.asList(eVar2, eVar)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof l0)) {
            set2.getClass();
            return new m0(set2, eVar);
        }
        l0 l0Var2 = (l0) set2;
        l2.e eVar3 = l0Var2.f8636m;
        eVar3.getClass();
        return new m0((SortedSet) l0Var2.f8635l, new l2.f(Arrays.asList(eVar3, eVar)));
    }

    public static Object k(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object l(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int m(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static k0 n(M m4, M m5) {
        if (m4 == null) {
            throw new NullPointerException("set1");
        }
        if (m5 != null) {
            return new k0(m4, m5);
        }
        throw new NullPointerException("set2");
    }

    public static int o(int i, int i5, int i6) {
        return (i & (~i6)) | (i5 & i6);
    }

    public static ArrayList p(Object... objArr) {
        int length = objArr.length;
        e("arraySize", length);
        ArrayList arrayList = new ArrayList(Q1.C.o0(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int q(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i5;
        int i6;
        int iT = t(obj);
        int i7 = iT & i;
        int iU = u(i7, obj3);
        if (iU == 0) {
            return -1;
        }
        int i8 = ~i;
        int i9 = iT & i8;
        int i10 = -1;
        while (true) {
            i5 = iU - 1;
            i6 = iArr[i5];
            if ((i6 & i8) == i9 && i4.a.v(obj, objArr[i5]) && (objArr2 == null || i4.a.v(obj2, objArr2[i5]))) {
                break;
            }
            int i11 = i6 & i;
            if (i11 == 0) {
                return -1;
            }
            i10 = i5;
            iU = i11;
        }
        int i12 = i6 & i;
        if (i10 == -1) {
            v(i7, i12, obj3);
        } else {
            iArr[i10] = o(iArr[i10], i12, i);
        }
        return i5;
    }

    public static void r(List list, l2.e eVar, int i, int i5) {
        for (int size = list.size() - 1; size > i5; size--) {
            if (eVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i6 = i5 - 1; i6 >= i; i6--) {
            list.remove(i6);
        }
    }

    public static int s(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int t(Object obj) {
        return s(obj == null ? 0 : obj.hashCode());
    }

    public static int u(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static void v(int i, int i5, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i5;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i5;
        } else {
            ((int[]) obj)[i] = i5;
        }
    }

    public static AbstractList w(List list, l2.d dVar) {
        return list instanceof RandomAccess ? new S(list, dVar) : new T(list, dVar);
    }

    public androidx.lifecycle.E a() {
        e("expectedValuesPerKey", 2);
        return new androidx.lifecycle.E(this, 20);
    }

    public abstract Map f();
}
