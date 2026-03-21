package q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: q.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0736f implements Collection, Set {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Object[] f9215o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f9216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Object[] f9217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f9218r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f9219s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f9220t = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f9221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object[] f9222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9223n;

    public C0736f(int i) {
        if (i == 0) {
            this.f9221l = AbstractC0737g.f9224a;
            this.f9222m = AbstractC0737g.f9225b;
        } else {
            f(i);
        }
        this.f9223n = 0;
    }

    public static void g(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (f9220t) {
                try {
                    if (f9218r < 10) {
                        objArr[0] = f9217q;
                        objArr[1] = iArr;
                        for (int i5 = i - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f9217q = objArr;
                        f9218r++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (f9219s) {
                try {
                    if (f9216p < 10) {
                        objArr[0] = f9215o;
                        objArr[1] = iArr;
                        for (int i6 = i - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f9215o = objArr;
                        f9216p++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iH;
        int i5 = this.f9223n;
        if (obj == null) {
            iH = i();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iH = h(iHashCode, obj);
        }
        if (iH >= 0) {
            return false;
        }
        int i6 = ~iH;
        int[] iArr = this.f9221l;
        if (i5 >= iArr.length) {
            int i7 = 8;
            if (i5 >= 8) {
                i7 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i7 = 4;
            }
            Object[] objArr = this.f9222m;
            f(i7);
            if (i5 != this.f9223n) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f9221l;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f9222m, 0, objArr.length);
            }
            g(iArr, objArr, i5);
        }
        if (i6 < i5) {
            int[] iArr3 = this.f9221l;
            int i8 = i6 + 1;
            int i9 = i5 - i6;
            System.arraycopy(iArr3, i6, iArr3, i8, i9);
            Object[] objArr2 = this.f9222m;
            System.arraycopy(objArr2, i6, objArr2, i8, i9);
        }
        int i10 = this.f9223n;
        if (i5 == i10) {
            int[] iArr4 = this.f9221l;
            if (i6 < iArr4.length) {
                iArr4[i6] = i;
                this.f9222m[i6] = obj;
                this.f9223n = i10 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f9223n;
        int i = this.f9223n;
        int[] iArr = this.f9221l;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f9222m;
            f(size);
            int i5 = this.f9223n;
            if (i5 > 0) {
                System.arraycopy(iArr, 0, this.f9221l, 0, i5);
                System.arraycopy(objArr, 0, this.f9222m, 0, this.f9223n);
            }
            g(iArr, objArr, this.f9223n);
        }
        if (this.f9223n != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f9223n;
        if (i != 0) {
            int[] iArr = this.f9221l;
            Object[] objArr = this.f9222m;
            this.f9221l = AbstractC0737g.f9224a;
            this.f9222m = AbstractC0737g.f9225b;
            this.f9223n = 0;
            g(iArr, objArr, i);
        }
        if (this.f9223n != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? i() : h(obj.hashCode(), obj)) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f9223n != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f9223n; i++) {
                try {
                    if (!set.contains(this.f9222m[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(int i) {
        if (i == 8) {
            synchronized (f9220t) {
                try {
                    Object[] objArr = f9217q;
                    if (objArr != null) {
                        try {
                            this.f9222m = objArr;
                            f9217q = (Object[]) objArr[0];
                            int[] iArr = (int[]) objArr[1];
                            this.f9221l = iArr;
                            if (iArr != null) {
                                objArr[1] = null;
                                objArr[0] = null;
                                f9218r--;
                                return;
                            }
                        } catch (ClassCastException unused) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                        f9217q = null;
                        f9218r = 0;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (f9219s) {
                try {
                    Object[] objArr2 = f9215o;
                    if (objArr2 != null) {
                        try {
                            this.f9222m = objArr2;
                            f9215o = (Object[]) objArr2[0];
                            int[] iArr2 = (int[]) objArr2[1];
                            this.f9221l = iArr2;
                            if (iArr2 != null) {
                                objArr2[1] = null;
                                objArr2[0] = null;
                                f9216p--;
                                return;
                            }
                        } catch (ClassCastException unused2) {
                        }
                        System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                        f9215o = null;
                        f9216p = 0;
                    }
                } finally {
                }
            }
        }
        this.f9221l = new int[i];
        this.f9222m = new Object[i];
    }

    public final int h(int i, Object obj) {
        int i5 = this.f9223n;
        if (i5 == 0) {
            return -1;
        }
        try {
            int iA = AbstractC0737g.a(i5, i, this.f9221l);
            if (iA < 0 || obj.equals(this.f9222m[iA])) {
                return iA;
            }
            int i6 = iA + 1;
            while (i6 < i5 && this.f9221l[i6] == i) {
                if (obj.equals(this.f9222m[i6])) {
                    return i6;
                }
                i6++;
            }
            for (int i7 = iA - 1; i7 >= 0 && this.f9221l[i7] == i; i7--) {
                if (obj.equals(this.f9222m[i7])) {
                    return i7;
                }
            }
            return ~i6;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f9221l;
        int i = this.f9223n;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    public final int i() {
        int i = this.f9223n;
        if (i == 0) {
            return -1;
        }
        try {
            int iA = AbstractC0737g.a(i, 0, this.f9221l);
            if (iA < 0 || this.f9222m[iA] == null) {
                return iA;
            }
            int i5 = iA + 1;
            while (i5 < i && this.f9221l[i5] == 0) {
                if (this.f9222m[i5] == null) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = iA - 1; i6 >= 0 && this.f9221l[i6] == 0; i6--) {
                if (this.f9222m[i6] == null) {
                    return i6;
                }
            }
            return ~i5;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f9223n <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0731a(this);
    }

    public final void j(int i) {
        int i5 = this.f9223n;
        Object[] objArr = this.f9222m;
        Object obj = objArr[i];
        if (i5 <= 1) {
            clear();
            return;
        }
        int i6 = i5 - 1;
        int[] iArr = this.f9221l;
        if (iArr.length <= 8 || i5 >= iArr.length / 3) {
            if (i < i6) {
                int i7 = i + 1;
                int i8 = i6 - i;
                System.arraycopy(iArr, i7, iArr, i, i8);
                Object[] objArr2 = this.f9222m;
                System.arraycopy(objArr2, i7, objArr2, i, i8);
            }
            this.f9222m[i6] = null;
        } else {
            f(i5 > 8 ? i5 + (i5 >> 1) : 8);
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f9221l, 0, i);
                System.arraycopy(objArr, 0, this.f9222m, 0, i);
            }
            if (i < i6) {
                int i9 = i + 1;
                int i10 = i6 - i;
                System.arraycopy(iArr, i9, this.f9221l, i, i10);
                System.arraycopy(objArr, i9, this.f9222m, i, i10);
            }
        }
        if (i5 != this.f9223n) {
            throw new ConcurrentModificationException();
        }
        this.f9223n = i6;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = obj == null ? i() : h(obj.hashCode(), obj);
        if (i < 0) {
            return false;
        }
        j(i);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z4 = false;
        for (int i = this.f9223n - 1; i >= 0; i--) {
            if (!collection.contains(this.f9222m[i])) {
                j(i);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f9223n;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f9223n;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f9222m, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9223n * 14);
        sb.append('{');
        for (int i = 0; i < this.f9223n; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f9222m[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f9223n) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f9223n);
        }
        System.arraycopy(this.f9222m, 0, objArr, 0, this.f9223n);
        int length = objArr.length;
        int i = this.f9223n;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
