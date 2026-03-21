package m2;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class S extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AbstractCollection f8567l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l2.d f8568m;

    /* JADX WARN: Multi-variable type inference failed */
    public S(List list, l2.d dVar) {
        list.getClass();
        this.f8567l = (AbstractCollection) list;
        this.f8568m = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f8568m.apply(this.f8567l.get(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f8567l.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new Q(this, this.f8567l.listIterator(i), 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.f8568m.apply(this.f8567l.remove(i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i, int i5) {
        this.f8567l.subList(i, i5).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8567l.size();
    }
}
