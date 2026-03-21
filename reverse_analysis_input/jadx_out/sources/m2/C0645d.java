package m2;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: renamed from: m2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0645d extends AbstractMap {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient C0643b f8591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient C0655n f8592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final transient Map f8593n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y f8594o;

    public C0645d(Y y, Map map) {
        this.f8594o = y;
        this.f8593n = map;
    }

    public final C0638E a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        Y y = this.f8594o;
        y.getClass();
        List list = (List) collection;
        return new C0638E(key, list instanceof RandomAccess ? new C0649h(y, key, list, null) : new C0653l(y, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Y y = this.f8594o;
        if (this.f8593n == y.f8573o) {
            y.c();
            return;
        }
        C0644c c0644c = new C0644c(this);
        while (c0644c.hasNext()) {
            c0644c.next();
            c0644c.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f8593n;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0643b c0643b = this.f8591l;
        if (c0643b != null) {
            return c0643b;
        }
        C0643b c0643b2 = new C0643b(this);
        this.f8591l = c0643b2;
        return c0643b2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f8593n.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f8593n;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        Y y = this.f8594o;
        y.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new C0649h(y, obj, list, null) : new C0653l(y, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f8593n.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Y y = this.f8594o;
        Set c0648g = y.f8639l;
        if (c0648g == null) {
            Map map = y.f8573o;
            c0648g = map instanceof NavigableMap ? new C0648g(y, (NavigableMap) map) : map instanceof SortedMap ? new C0651j(y, (SortedMap) map) : new C0646e(y, map);
            y.f8639l = c0648g;
        }
        return c0648g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f8593n.remove(obj);
        if (collection == null) {
            return null;
        }
        Y y = this.f8594o;
        Collection collectionD = y.d();
        collectionD.addAll(collection);
        y.f8574p -= collection.size();
        collection.clear();
        return collectionD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f8593n.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f8593n.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0655n c0655n = this.f8592m;
        if (c0655n != null) {
            return c0655n;
        }
        C0655n c0655n2 = new C0655n(this);
        this.f8592m = c0655n2;
        return c0655n2;
    }
}
