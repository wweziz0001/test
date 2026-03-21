package m2;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: m2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0648g extends C0651j implements NavigableSet {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y f8606o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0648g(Y y, NavigableMap navigableMap) {
        super(y, navigableMap);
        this.f8606o = y;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return f().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C0646e) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C0648g(this.f8606o, f().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return f().floorKey(obj);
    }

    @Override // m2.C0651j
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final NavigableMap f() {
        return (NavigableMap) ((SortedMap) this.f8598l);
    }

    @Override // m2.C0651j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return f().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return f().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C0644c c0644c = (C0644c) iterator();
        if (!c0644c.hasNext()) {
            return null;
        }
        Object next = c0644c.next();
        c0644c.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // m2.C0651j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // m2.C0651j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z4) {
        return new C0648g(this.f8606o, f().headMap(obj, z4));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z4, Object obj2, boolean z5) {
        return new C0648g(this.f8606o, f().subMap(obj, z4, obj2, z5));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z4) {
        return new C0648g(this.f8606o, f().tailMap(obj, z4));
    }
}
