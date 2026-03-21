package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0715f implements Iterable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0712c f8961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0712c f8962m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final WeakHashMap f8963n = new WeakHashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8964o = 0;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((o.C0711b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof o.C0715f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            o.f r7 = (o.C0715f) r7
            int r1 = r6.f8964o
            int r3 = r7.f8964o
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            o.b r3 = (o.C0711b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            o.b r4 = (o.C0711b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            o.b r7 = (o.C0711b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0715f.equals(java.lang.Object):boolean");
    }

    public C0712c f(Object obj) {
        C0712c c0712c = this.f8961l;
        while (c0712c != null && !c0712c.f8954l.equals(obj)) {
            c0712c = c0712c.f8956n;
        }
        return c0712c;
    }

    public Object g(Object obj) {
        C0712c c0712cF = f(obj);
        if (c0712cF == null) {
            return null;
        }
        this.f8964o--;
        WeakHashMap weakHashMap = this.f8963n;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0714e) it.next()).a(c0712cF);
            }
        }
        C0712c c0712c = c0712cF.f8957o;
        if (c0712c != null) {
            c0712c.f8956n = c0712cF.f8956n;
        } else {
            this.f8961l = c0712cF.f8956n;
        }
        C0712c c0712c2 = c0712cF.f8956n;
        if (c0712c2 != null) {
            c0712c2.f8957o = c0712c;
        } else {
            this.f8962m = c0712c;
        }
        c0712cF.f8956n = null;
        c0712cF.f8957o = null;
        return c0712cF.f8955m;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C0711b c0711b = (C0711b) it;
            if (!c0711b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c0711b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0711b c0711b = new C0711b(this.f8961l, this.f8962m, 0);
        this.f8963n.put(c0711b, Boolean.FALSE);
        return c0711b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0711b c0711b = (C0711b) it;
            if (!c0711b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0711b.next()).toString());
            if (c0711b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
