package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class X extends AbstractMap {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f4112q = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f4113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Map f4114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile a0 f4116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map f4117p;

    public static X f() {
        X x4 = new X();
        x4.f4113l = Collections.emptyList();
        x4.f4114m = Collections.emptyMap();
        x4.f4117p = Collections.emptyMap();
        return x4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f4113l
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f4113l
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.Y r2 = (androidx.datastore.preferences.protobuf.Y) r2
            java.lang.Comparable r2 = r2.f4118l
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f4113l
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.Y r3 = (androidx.datastore.preferences.protobuf.Y) r3
            java.lang.Comparable r3 = r3.f4118l
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.X.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.f4115n) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.f4113l.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f4113l.isEmpty()) {
            this.f4113l.clear();
        }
        if (this.f4114m.isEmpty()) {
            return;
        }
        this.f4114m.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f4114m.containsKey(comparable);
    }

    public final Set d() {
        return this.f4114m.isEmpty() ? Collections.emptySet() : this.f4114m.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f4114m.isEmpty() && !(this.f4114m instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4114m = treeMap;
            this.f4117p = treeMap.descendingMap();
        }
        return (SortedMap) this.f4114m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f4116o == null) {
            this.f4116o = new a0(0, this);
        }
        return this.f4116o;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return super.equals(obj);
        }
        X x4 = (X) obj;
        int size = size();
        if (size != x4.size()) {
            return false;
        }
        int size2 = this.f4113l.size();
        if (size2 != x4.f4113l.size()) {
            return ((AbstractSet) entrySet()).equals(x4.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!c(i).equals(x4.c(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f4114m.equals(x4.f4114m);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((Y) this.f4113l.get(iA)).setValue(obj);
        }
        b();
        if (this.f4113l.isEmpty() && !(this.f4113l instanceof ArrayList)) {
            this.f4113l = new ArrayList(16);
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f4113l.size() == 16) {
            Y y = (Y) this.f4113l.remove(15);
            e().put(y.f4118l, y.f4119m);
        }
        this.f4113l.add(i, new Y(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((Y) this.f4113l.get(iA)).f4119m : this.f4114m.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object obj = ((Y) this.f4113l.remove(i)).f4119m;
        if (!this.f4114m.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f4113l;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Y(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f4113l.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((Y) this.f4113l.get(i)).hashCode();
        }
        return this.f4114m.size() > 0 ? iHashCode + this.f4114m.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f4114m.isEmpty()) {
            return null;
        }
        return this.f4114m.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4114m.size() + this.f4113l.size();
    }
}
