package m2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Map, Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g0 f8607r = new g0(null, new Object[0], 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient d0 f8608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient e0 f8609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient f0 f8610n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient Object f8611o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final transient Object[] f8612p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient int f8613q;

    public g0(Object obj, Object[] objArr, int i) {
        this.f8611o = obj;
        this.f8612p = objArr;
        this.f8613q = i;
    }

    public static g0 a(Map map) {
        if ((map instanceof g0) && !(map instanceof SortedMap)) {
            g0 g0Var = (g0) map;
            g0Var.getClass();
            return g0Var;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        D0.d dVar = new D0.d(setEntrySet != null ? setEntrySet.size() : 4);
        if (setEntrySet != null) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = (Object[]) dVar.f395m;
            if (size > objArr.length) {
                dVar.f395m = Arrays.copyOf(objArr, AbstractC0636C.f(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            dVar.o(entry.getKey(), entry.getValue());
        }
        return dVar.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017e  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static m2.g0 b(int r16, java.lang.Object[] r17, D0.d r18) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.g0.b(int, java.lang.Object[], D0.d):m2.g0");
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final M entrySet() {
        d0 d0Var = this.f8608l;
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = new d0(this, this.f8612p, this.f8613q);
        this.f8608l = d0Var2;
        return d0Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final M keySet() {
        e0 e0Var = this.f8609m;
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0Var2 = new e0(this, new f0(this.f8612p, 0, this.f8613q));
        this.f8609m = e0Var2;
        return e0Var2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC0637D values() {
        f0 f0Var = this.f8610n;
        if (f0Var != null) {
            return f0Var;
        }
        f0 f0Var2 = new f0(this.f8612p, 1, this.f8613q);
        this.f8610n = f0Var2;
        return f0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return r.h(this, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0037->B:22:0x004d], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0062->B:32:0x0079], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0088->B:43:0x00a0]] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L6
        L3:
            r9 = r0
            goto L9c
        L6:
            r1 = 1
            java.lang.Object[] r2 = r8.f8612p
            int r3 = r8.f8613q
            if (r3 != r1) goto L20
            r3 = 0
            r3 = r2[r3]
            java.util.Objects.requireNonNull(r3)
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L3
            r9 = r2[r1]
            java.util.Objects.requireNonNull(r9)
            goto L9c
        L20:
            java.lang.Object r3 = r8.f8611o
            if (r3 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L50
            r4 = r3
            byte[] r4 = (byte[]) r4
            int r3 = r4.length
            int r5 = r3 + (-1)
            int r3 = r9.hashCode()
            int r3 = m2.r.s(r3)
        L37:
            r3 = r3 & r5
            r6 = r4[r3]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L3
        L40:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L9c
        L4d:
            int r3 = r3 + 1
            goto L37
        L50:
            boolean r4 = r3 instanceof short[]
            if (r4 == 0) goto L7c
            r4 = r3
            short[] r4 = (short[]) r4
            int r3 = r4.length
            int r5 = r3 + (-1)
            int r3 = r9.hashCode()
            int r3 = m2.r.s(r3)
        L62:
            r3 = r3 & r5
            short r6 = r4[r3]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6c
            goto L3
        L6c:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L9c
        L79:
            int r3 = r3 + 1
            goto L62
        L7c:
            int[] r3 = (int[]) r3
            int r4 = r3.length
            int r4 = r4 - r1
            int r5 = r9.hashCode()
            int r5 = m2.r.s(r5)
        L88:
            r5 = r5 & r4
            r6 = r3[r5]
            r7 = -1
            if (r6 != r7) goto L90
            goto L3
        L90:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r9 = r6 ^ 1
            r9 = r2[r9]
        L9c:
            if (r9 != 0) goto L9f
            return r0
        L9f:
            return r9
        La0:
            int r5 = r5 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.g0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return r.m(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f8613q;
    }

    public final String toString() {
        int i = this.f8613q;
        r.e("size", i);
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
        sb.append('{');
        q0 it = ((d0) entrySet()).iterator();
        boolean z4 = true;
        while (true) {
            C0640G c0640g = (C0640G) it;
            if (!c0640g.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            Map.Entry entry = (Map.Entry) c0640g.next();
            if (!z4) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z4 = false;
        }
    }
}
