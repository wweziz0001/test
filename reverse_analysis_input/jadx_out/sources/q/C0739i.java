package q;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: q.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0739i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Object[] f9231o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f9232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Object[] f9233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f9234r;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f9235l = AbstractC0737g.f9224a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object[] f9236m = AbstractC0737g.f9225b;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9237n = 0;

    public static void b(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0739i.class) {
                try {
                    if (f9234r < 10) {
                        objArr[0] = f9233q;
                        objArr[1] = iArr;
                        for (int i5 = (i << 1) - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f9233q = objArr;
                        f9234r++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0739i.class) {
                try {
                    if (f9232p < 10) {
                        objArr[0] = f9231o;
                        objArr[1] = iArr;
                        for (int i6 = (i << 1) - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f9231o = objArr;
                        f9232p++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i) {
        if (i == 8) {
            synchronized (C0739i.class) {
                try {
                    Object[] objArr = f9233q;
                    if (objArr != null) {
                        this.f9236m = objArr;
                        f9233q = (Object[]) objArr[0];
                        this.f9235l = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f9234r--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (C0739i.class) {
                try {
                    Object[] objArr2 = f9231o;
                    if (objArr2 != null) {
                        this.f9236m = objArr2;
                        f9231o = (Object[]) objArr2[0];
                        this.f9235l = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f9232p--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f9235l = new int[i];
        this.f9236m = new Object[i << 1];
    }

    public final int c(int i, Object obj) {
        int i5 = this.f9237n;
        if (i5 == 0) {
            return -1;
        }
        try {
            int iA = AbstractC0737g.a(i5, i, this.f9235l);
            if (iA < 0 || obj.equals(this.f9236m[iA << 1])) {
                return iA;
            }
            int i6 = iA + 1;
            while (i6 < i5 && this.f9235l[i6] == i) {
                if (obj.equals(this.f9236m[i6 << 1])) {
                    return i6;
                }
                i6++;
            }
            for (int i7 = iA - 1; i7 >= 0 && this.f9235l[i7] == i; i7--) {
                if (obj.equals(this.f9236m[i7 << 1])) {
                    return i7;
                }
            }
            return ~i6;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i = this.f9237n;
        if (i > 0) {
            int[] iArr = this.f9235l;
            Object[] objArr = this.f9236m;
            this.f9235l = AbstractC0737g.f9224a;
            this.f9236m = AbstractC0737g.f9225b;
            this.f9237n = 0;
            b(iArr, objArr, i);
        }
        if (this.f9237n > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return f(obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    public final int e() {
        int i = this.f9237n;
        if (i == 0) {
            return -1;
        }
        try {
            int iA = AbstractC0737g.a(i, 0, this.f9235l);
            if (iA < 0 || this.f9236m[iA << 1] == null) {
                return iA;
            }
            int i5 = iA + 1;
            while (i5 < i && this.f9235l[i5] == 0) {
                if (this.f9236m[i5 << 1] == null) {
                    return i5;
                }
                i5++;
            }
            for (int i6 = iA - 1; i6 >= 0 && this.f9235l[i6] == 0; i6--) {
                if (this.f9236m[i6 << 1] == null) {
                    return i6;
                }
            }
            return ~i5;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0739i) {
            C0739i c0739i = (C0739i) obj;
            if (this.f9237n != c0739i.f9237n) {
                return false;
            }
            for (int i = 0; i < this.f9237n; i++) {
                Object objG = g(i);
                Object objI = i(i);
                Object orDefault = c0739i.getOrDefault(objG, null);
                if (objI == null) {
                    if (orDefault != null || !c0739i.containsKey(objG)) {
                        return false;
                    }
                } else if (!objI.equals(orDefault)) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f9237n != map.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.f9237n; i5++) {
                Object objG2 = g(i5);
                Object objI2 = i(i5);
                Object obj2 = map.get(objG2);
                if (objI2 == null) {
                    if (obj2 != null || !map.containsKey(objG2)) {
                        return false;
                    }
                } else if (!objI2.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int f(Object obj) {
        int i = this.f9237n * 2;
        Object[] objArr = this.f9236m;
        if (obj == null) {
            for (int i5 = 1; i5 < i; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public final Object g(int i) {
        return this.f9236m[i << 1];
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f9236m[(iD << 1) + 1] : obj2;
    }

    public final Object h(int i) {
        Object[] objArr = this.f9236m;
        int i5 = i << 1;
        Object obj = objArr[i5 + 1];
        int i6 = this.f9237n;
        if (i6 <= 1) {
            clear();
        } else {
            int i7 = i6 - 1;
            int[] iArr = this.f9235l;
            if (iArr.length <= 8 || i6 >= iArr.length / 3) {
                if (i < i7) {
                    int i8 = i + 1;
                    int i9 = i7 - i;
                    System.arraycopy(iArr, i8, iArr, i, i9);
                    Object[] objArr2 = this.f9236m;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i5, i9 << 1);
                }
                Object[] objArr3 = this.f9236m;
                int i10 = i7 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                a(i6 > 8 ? i6 + (i6 >> 1) : 8);
                if (i6 != this.f9237n) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f9235l, 0, i);
                    System.arraycopy(objArr, 0, this.f9236m, 0, i5);
                }
                if (i < i7) {
                    int i11 = i + 1;
                    int i12 = i7 - i;
                    System.arraycopy(iArr, i11, this.f9235l, i, i12);
                    System.arraycopy(objArr, i11 << 1, this.f9236m, i5, i12 << 1);
                }
            }
            if (i6 != this.f9237n) {
                throw new ConcurrentModificationException();
            }
            this.f9237n = i7;
        }
        return obj;
    }

    public final int hashCode() {
        int[] iArr = this.f9235l;
        Object[] objArr = this.f9236m;
        int i = this.f9237n;
        int i5 = 1;
        int i6 = 0;
        int iHashCode = 0;
        while (i6 < i) {
            Object obj = objArr[i5];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i6];
            i6++;
            i5 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i) {
        return this.f9236m[(i << 1) + 1];
    }

    public final boolean isEmpty() {
        return this.f9237n <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int iC;
        int i5 = this.f9237n;
        if (obj == null) {
            iC = e();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iC = c(iHashCode, obj);
        }
        if (iC >= 0) {
            int i6 = (iC << 1) + 1;
            Object[] objArr = this.f9236m;
            Object obj3 = objArr[i6];
            objArr[i6] = obj2;
            return obj3;
        }
        int i7 = ~iC;
        int[] iArr = this.f9235l;
        if (i5 >= iArr.length) {
            int i8 = 8;
            if (i5 >= 8) {
                i8 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i8 = 4;
            }
            Object[] objArr2 = this.f9236m;
            a(i8);
            if (i5 != this.f9237n) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f9235l;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f9236m, 0, objArr2.length);
            }
            b(iArr, objArr2, i5);
        }
        if (i7 < i5) {
            int[] iArr3 = this.f9235l;
            int i9 = i7 + 1;
            System.arraycopy(iArr3, i7, iArr3, i9, i5 - i7);
            Object[] objArr3 = this.f9236m;
            System.arraycopy(objArr3, i7 << 1, objArr3, i9 << 1, (this.f9237n - i7) << 1);
        }
        int i10 = this.f9237n;
        if (i5 == i10) {
            int[] iArr4 = this.f9235l;
            if (i7 < iArr4.length) {
                iArr4[i7] = i;
                Object[] objArr4 = this.f9236m;
                int i11 = i7 << 1;
                objArr4[i11] = obj;
                objArr4[i11 + 1] = obj2;
                this.f9237n = i10 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0) {
            return null;
        }
        int i = (iD << 1) + 1;
        Object[] objArr = this.f9236m;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f9237n;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9237n * 28);
        sb.append('{');
        for (int i = 0; i < this.f9237n; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objG = g(i);
            if (objG != this) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objI = i(i);
            if (objI != this) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0) {
            return false;
        }
        Object objI = i(iD);
        if (obj2 != objI && (obj2 == null || !obj2.equals(objI))) {
            return false;
        }
        h(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0) {
            return false;
        }
        Object objI = i(iD);
        if (objI != obj2 && (obj2 == null || !obj2.equals(objI))) {
            return false;
        }
        int i = (iD << 1) + 1;
        Object[] objArr = this.f9236m;
        Object obj4 = objArr[i];
        objArr[i] = obj3;
        return true;
    }
}
