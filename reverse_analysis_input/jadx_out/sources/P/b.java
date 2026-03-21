package P;

import C3.r;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f1665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N.a f1666b;

    public b(Map map, boolean z4) {
        N3.h.e(map, "preferencesMap");
        this.f1665a = map;
        this.f1666b = new N.a(z4);
    }

    public final Map a() {
        B3.b bVar;
        Set<Map.Entry> setEntrySet = this.f1665a.entrySet();
        int iB0 = r.b0(C3.h.R(setEntrySet));
        if (iB0 < 16) {
            iB0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB0);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                N3.h.d(bArrCopyOf, "copyOf(this, size)");
                bVar = new B3.b(key, bArrCopyOf);
            } else {
                bVar = new B3.b(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(bVar.f268l, bVar.f269m);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        N3.h.d(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (this.f1666b.f1516a.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(d dVar) {
        N3.h.e(dVar, "key");
        Object obj = this.f1665a.get(dVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        N3.h.d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void d(d dVar, Object obj) {
        b();
        Map map = this.f1665a;
        if (obj == null) {
            b();
            map.remove(dVar);
            return;
        }
        if (obj instanceof Set) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(C3.f.Z((Set) obj));
            N3.h.d(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            map.put(dVar, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                map.put(dVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            N3.h.d(bArrCopyOf, "copyOf(this, size)");
            map.put(dVar, bArrCopyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof P.b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            P.b r7 = (P.b) r7
            java.util.Map r0 = r7.f1665a
            java.util.Map r2 = r6.f1665a
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            int r4 = r2.size()
            if (r0 == r4) goto L1b
            return r1
        L1b:
            java.util.Map r7 = r7.f1665a
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L25
        L23:
            r1 = r3
            goto L63
        L25:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r4 = r2.get(r4)
            if (r4 == 0) goto L60
            java.lang.Object r0 = r0.getValue()
            boolean r5 = r0 instanceof byte[]
            if (r5 == 0) goto L5b
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L60
            byte[] r0 = (byte[]) r0
            byte[] r4 = (byte[]) r4
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 == 0) goto L60
            r0 = r3
            goto L61
        L5b:
            boolean r0 = N3.h.a(r0, r4)
            goto L61
        L60:
            r0 = r1
        L61:
            if (r0 != 0) goto L2d
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: P.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = this.f1665a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return C3.f.V(this.f1665a.entrySet(), ",\n", "{\n", "\n}", a.f1664m, 24);
    }

    public /* synthetic */ b(boolean z4) {
        this(new LinkedHashMap(), z4);
    }
}
