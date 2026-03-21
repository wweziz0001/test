package D3;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Map, Serializable, O3.b {
    public static final f y;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object[] f603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object[] f604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f605n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f606o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f607p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f608q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f609r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f610s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f611t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g f612u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h f613v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g f614w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f615x;

    static {
        f fVar = new f(0);
        fVar.f615x = true;
        y = fVar;
    }

    public f() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iJ = j(obj);
            int i = this.f607p * 2;
            int length = this.f606o.length / 2;
            if (i > length) {
                i = length;
            }
            int i5 = 0;
            while (true) {
                int[] iArr = this.f606o;
                int i6 = iArr[iJ];
                if (i6 <= 0) {
                    int i7 = this.f608q;
                    Object[] objArr = this.f603l;
                    if (i7 < objArr.length) {
                        int i8 = i7 + 1;
                        this.f608q = i8;
                        objArr[i7] = obj;
                        this.f605n[i7] = iJ;
                        iArr[iJ] = i8;
                        this.f611t++;
                        this.f610s++;
                        if (i5 > this.f607p) {
                            this.f607p = i5;
                        }
                        return i7;
                    }
                    g(1);
                } else {
                    if (N3.h.a(this.f603l[i6 - 1], obj)) {
                        return -i6;
                    }
                    i5++;
                    if (i5 > i) {
                        k(this.f606o.length * 2);
                        break;
                    }
                    iJ = iJ == 0 ? this.f606o.length - 1 : iJ - 1;
                }
            }
        }
    }

    public final f b() {
        c();
        this.f615x = true;
        if (this.f611t > 0) {
            return this;
        }
        f fVar = y;
        N3.h.c(fVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return fVar;
    }

    public final void c() {
        if (this.f615x) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.f608q - 1;
        if (i >= 0) {
            int i5 = 0;
            while (true) {
                int[] iArr = this.f605n;
                int i6 = iArr[i5];
                if (i6 >= 0) {
                    this.f606o[i6] = 0;
                    iArr[i5] = -1;
                }
                if (i5 == i) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        i4.a.R(this.f603l, 0, this.f608q);
        Object[] objArr = this.f604m;
        if (objArr != null) {
            i4.a.R(objArr, 0, this.f608q);
        }
        this.f611t = 0;
        this.f608q = 0;
        this.f610s++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z4) {
        int i;
        Object[] objArr = this.f604m;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = this.f608q;
            if (i5 >= i) {
                break;
            }
            int[] iArr = this.f605n;
            int i7 = iArr[i5];
            if (i7 >= 0) {
                Object[] objArr2 = this.f603l;
                objArr2[i6] = objArr2[i5];
                if (objArr != null) {
                    objArr[i6] = objArr[i5];
                }
                if (z4) {
                    iArr[i6] = i7;
                    this.f606o[i7] = i6 + 1;
                }
                i6++;
            }
            i5++;
        }
        i4.a.R(this.f603l, i6, i);
        if (objArr != null) {
            i4.a.R(objArr, i6, this.f608q);
        }
        this.f608q = i6;
    }

    public final boolean e(Collection collection) {
        N3.h.e(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g gVar = this.f614w;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 0);
        this.f614w = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f611t != map.size() || !e(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(Map.Entry entry) {
        N3.h.e(entry, "entry");
        int iH = h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = this.f604m;
        N3.h.b(objArr);
        return N3.h.a(objArr[iH], entry.getValue());
    }

    public final void g(int i) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f603l;
        int length = objArr.length;
        int i5 = this.f608q;
        int i6 = length - i5;
        int i7 = i5 - this.f611t;
        if (i6 < i && i6 + i7 >= i && i7 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i8 = i5 + i;
        if (i8 < 0) {
            throw new OutOfMemoryError();
        }
        if (i8 > objArr.length) {
            int length2 = objArr.length;
            int i9 = length2 + (length2 >> 1);
            if (i9 - i8 < 0) {
                i9 = i8;
            }
            if (i9 - 2147483639 > 0) {
                i9 = i8 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i9);
            N3.h.d(objArrCopyOf2, "copyOf(...)");
            this.f603l = objArrCopyOf2;
            Object[] objArr2 = this.f604m;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i9);
                N3.h.d(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f604m = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f605n, i9);
            N3.h.d(iArrCopyOf, "copyOf(...)");
            this.f605n = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i9 >= 1 ? i9 : 1) * 3);
            if (iHighestOneBit > this.f606o.length) {
                k(iHighestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f604m;
        N3.h.b(objArr);
        return objArr[iH];
    }

    public final int h(Object obj) {
        int iJ = j(obj);
        int i = this.f607p;
        while (true) {
            int i5 = this.f606o[iJ];
            if (i5 == 0) {
                return -1;
            }
            if (i5 > 0) {
                int i6 = i5 - 1;
                if (N3.h.a(this.f603l[i6], obj)) {
                    return i6;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iJ = iJ == 0 ? this.f606o.length - 1 : iJ - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i = 0;
        while (dVar.hasNext()) {
            int i5 = dVar.f373l;
            f fVar = (f) dVar.f376o;
            if (i5 >= fVar.f608q) {
                throw new NoSuchElementException();
            }
            dVar.f373l = i5 + 1;
            dVar.f374m = i5;
            Object obj = fVar.f603l[i5];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fVar.f604m;
            N3.h.b(objArr);
            Object obj2 = objArr[dVar.f374m];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.e();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        int i = this.f608q;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f605n[i] >= 0) {
                Object[] objArr = this.f604m;
                N3.h.b(objArr);
                if (N3.h.a(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f611t == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f609r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f605n[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.f610s
            int r0 = r0 + 1
            r5.f610s = r0
            int r0 = r5.f608q
            int r1 = r5.f611t
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f606o = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f609r = r6
        L1c:
            int r6 = r5.f608q
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f603l
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.f607p
        L2c:
            int[] r3 = r5.f606o
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f605n
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.f.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.f612u;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 1);
        this.f612u = gVar2;
        return gVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0024->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f603l
            java.lang.String r1 = "<this>"
            N3.h.e(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f604m
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f605n
            r0 = r0[r12]
            int r1 = r11.f607p
            int r1 = r1 * 2
            int[] r2 = r11.f606o
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.f606o
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f607p
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f606o
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f606o
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.f603l
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f606o
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f605n
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f606o
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f605n
            r0[r12] = r6
            int r12 = r11.f611t
            int r12 = r12 + r6
            r11.f611t = r12
            int r12 = r11.f610s
            int r12 = r12 + 1
            r11.f610s = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.f.l(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.f604m;
        if (objArr == null) {
            int length = this.f603l.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f604m = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        N3.h.e(map, "from");
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.f604m;
            if (objArr == null) {
                int length = this.f603l.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f604m = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!N3.h.a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iH = h(obj);
        if (iH < 0) {
            return null;
        }
        Object[] objArr = this.f604m;
        N3.h.b(objArr);
        Object obj2 = objArr[iH];
        l(iH);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f611t;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f611t * 3) + 2);
        sb.append("{");
        d dVar = new d(this, 0);
        int i = 0;
        while (dVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i5 = dVar.f373l;
            f fVar = (f) dVar.f376o;
            if (i5 >= fVar.f608q) {
                throw new NoSuchElementException();
            }
            dVar.f373l = i5 + 1;
            dVar.f374m = i5;
            Object obj = fVar.f603l[i5];
            if (obj == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = fVar.f604m;
            N3.h.b(objArr);
            Object obj2 = objArr[dVar.f374m];
            if (obj2 == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            dVar.e();
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        N3.h.d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        h hVar = this.f613v;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        this.f613v = hVar2;
        return hVar2;
    }

    public f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f603l = objArr;
        this.f604m = null;
        this.f605n = iArr;
        this.f606o = new int[iHighestOneBit];
        this.f607p = 2;
        this.f608q = 0;
        this.f609r = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
