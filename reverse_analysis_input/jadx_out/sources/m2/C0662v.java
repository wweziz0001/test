package m2;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: m2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0662v extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f8657u = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient Object f8658l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient int[] f8659m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient Object[] f8660n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient Object[] f8661o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public transient int f8662p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public transient int f8663q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public transient C0660t f8664r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public transient C0660t f8665s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient C0655n f8666t;

    public static C0662v a() {
        C0662v c0662v = new C0662v();
        c0662v.f8662p = Math.min(Math.max(3, 1), 1073741823);
        return c0662v;
    }

    public static C0662v b(int i) {
        C0662v c0662v = new C0662v();
        if (i < 0) {
            throw new IllegalArgumentException("Expected size must be >= 0");
        }
        c0662v.f8662p = Math.min(Math.max(i, 1), 1073741823);
        return c0662v;
    }

    public final Map c() {
        Object obj = this.f8658l;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.f8662p += 32;
        Map mapC = c();
        if (mapC != null) {
            this.f8662p = Math.min(Math.max(size(), 3), 1073741823);
            mapC.clear();
            this.f8658l = null;
            this.f8663q = 0;
            return;
        }
        Arrays.fill(j(), 0, this.f8663q, (Object) null);
        Arrays.fill(k(), 0, this.f8663q, (Object) null);
        Object obj = this.f8658l;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.f8663q, 0);
        this.f8663q = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapC = c();
        return mapC != null ? mapC.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.containsValue(obj);
        }
        for (int i = 0; i < this.f8663q; i++) {
            if (i4.a.v(obj, k()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f8662p & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int iT = r.t(obj);
        int iD = d();
        Object obj2 = this.f8658l;
        Objects.requireNonNull(obj2);
        int iU = r.u(iT & iD, obj2);
        if (iU == 0) {
            return -1;
        }
        int i = ~iD;
        int i5 = iT & i;
        do {
            int i6 = iU - 1;
            int i7 = i()[i6];
            if ((i7 & i) == i5 && i4.a.v(obj, j()[i6])) {
                return i6;
            }
            iU = i7 & iD;
        } while (iU != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0660t c0660t = this.f8665s;
        if (c0660t != null) {
            return c0660t;
        }
        C0660t c0660t2 = new C0660t(this, 0);
        this.f8665s = c0660t2;
        return c0660t2;
    }

    public final void f(int i, int i5) {
        Object obj = this.f8658l;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        Object[] objArrJ = j();
        Object[] objArrK = k();
        int size = size();
        int i6 = size - 1;
        if (i >= i6) {
            objArrJ[i] = null;
            objArrK[i] = null;
            iArrI[i] = 0;
            return;
        }
        Object obj2 = objArrJ[i6];
        objArrJ[i] = obj2;
        objArrK[i] = objArrK[i6];
        objArrJ[i6] = null;
        objArrK[i6] = null;
        iArrI[i] = iArrI[i6];
        iArrI[i6] = 0;
        int iT = r.t(obj2) & i5;
        int iU = r.u(iT, obj);
        if (iU == size) {
            r.v(iT, i + 1, obj);
            return;
        }
        while (true) {
            int i7 = iU - 1;
            int i8 = iArrI[i7];
            int i9 = i8 & i5;
            if (i9 == size) {
                iArrI[i7] = r.o(i8, i + 1, i5);
                return;
            }
            iU = i9;
        }
    }

    public final boolean g() {
        return this.f8658l == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        return k()[iE];
    }

    public final Object h(Object obj) {
        boolean zG = g();
        Object obj2 = f8657u;
        if (zG) {
            return obj2;
        }
        int iD = d();
        Object obj3 = this.f8658l;
        Objects.requireNonNull(obj3);
        int iQ = r.q(obj, null, iD, obj3, i(), j(), null);
        if (iQ == -1) {
            return obj2;
        }
        Object obj4 = k()[iQ];
        f(iQ, iD);
        this.f8663q--;
        this.f8662p += 32;
        return obj4;
    }

    public final int[] i() {
        int[] iArr = this.f8659m;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.f8660n;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.f8661o;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0660t c0660t = this.f8664r;
        if (c0660t != null) {
            return c0660t;
        }
        C0660t c0660t2 = new C0660t(this, 1);
        this.f8664r = c0660t2;
        return c0660t2;
    }

    public final int l(int i, int i5, int i6, int i7) {
        Object objG = r.g(i5);
        int i8 = i5 - 1;
        if (i7 != 0) {
            r.v(i6 & i8, i7 + 1, objG);
        }
        Object obj = this.f8658l;
        Objects.requireNonNull(obj);
        int[] iArrI = i();
        for (int i9 = 0; i9 <= i; i9++) {
            int iU = r.u(i9, obj);
            while (iU != 0) {
                int i10 = iU - 1;
                int i11 = iArrI[i10];
                int i12 = ((~i) & i11) | i9;
                int i13 = i12 & i8;
                int iU2 = r.u(i13, objG);
                r.v(i13, iU, objG);
                iArrI[i10] = r.o(i12, iU2, i8);
                iU = i11 & i;
            }
        }
        this.f8658l = objG;
        this.f8662p = r.o(this.f8662p, 32 - Integer.numberOfLeadingZeros(i8), 31);
        return i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0102 -> B:40:0x00e8). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C0662v.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapC = c();
        if (mapC != null) {
            return mapC.remove(obj);
        }
        Object objH = h(obj);
        if (objH == f8657u) {
            return null;
        }
        return objH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapC = c();
        return mapC != null ? mapC.size() : this.f8663q;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0655n c0655n = this.f8666t;
        if (c0655n != null) {
            return c0655n;
        }
        C0655n c0655n2 = new C0655n(1, this);
        this.f8666t = c0655n2;
        return c0655n2;
    }
}
