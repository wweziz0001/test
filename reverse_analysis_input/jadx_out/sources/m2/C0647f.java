package m2;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: m2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0647f extends C0650i implements NavigableMap {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y f8602r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0647f(Y y, NavigableMap navigableMap) {
        super(y, navigableMap);
        this.f8602r = y;
    }

    @Override // m2.C0650i
    public final SortedSet b() {
        return new C0648g(this.f8602r, d());
    }

    @Override // m2.C0650i
    /* JADX INFO: renamed from: c */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = d().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return a(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return d().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C0647f(this.f8602r, d().descendingMap());
    }

    public final C0638E e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionD = this.f8602r.d();
        collectionD.addAll((Collection) entry.getValue());
        it.remove();
        return new C0638E(entry.getKey(), Collections.unmodifiableList((List) collectionD));
    }

    @Override // m2.C0650i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final NavigableMap d() {
        return (NavigableMap) ((SortedMap) this.f8593n);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = d().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return a(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = d().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return a(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return d().floorKey(obj);
    }

    @Override // m2.C0650i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = d().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return a(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return d().higherKey(obj);
    }

    @Override // m2.C0650i, m2.C0645d, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = d().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return a(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = d().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return a(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return d().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return e(((C0643b) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return e(((C0643b) ((C0645d) descendingMap()).entrySet()).iterator());
    }

    @Override // m2.C0650i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // m2.C0650i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z4) {
        return new C0647f(this.f8602r, d().headMap(obj, z4));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z4, Object obj2, boolean z5) {
        return new C0647f(this.f8602r, d().subMap(obj, z4, obj2, z5));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z4) {
        return new C0647f(this.f8602r, d().tailMap(obj, z4));
    }
}
