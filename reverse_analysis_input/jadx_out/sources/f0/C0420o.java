package f0;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m2.U;

/* JADX INFO: renamed from: f0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0420o implements Map {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f5706l;

    public C0420o(Map map) {
        this.f5706l = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f5706l.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f5706l.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        U u4 = new U(entrySet().iterator());
        if (obj == null) {
            while (u4.hasNext()) {
                if (u4.next() == null) {
                    return true;
                }
            }
        } else {
            while (u4.hasNext()) {
                if (obj.equals(u4.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return m2.r.j(this.f5706l.entrySet(), new C0419n(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && m2.r.h(this, obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f5706l.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return m2.r.m(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f5706l;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return m2.r.j(this.f5706l.keySet(), new C0419n(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f5706l.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f5706l.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f5706l.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f5706l;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    public final String toString() {
        return this.f5706l.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f5706l.values();
    }
}
