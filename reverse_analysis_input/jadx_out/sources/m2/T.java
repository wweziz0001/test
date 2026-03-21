package m2;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AbstractCollection f8569l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l2.d f8570m;

    /* JADX WARN: Multi-variable type inference failed */
    public T(List list, l2.d dVar) {
        list.getClass();
        this.f8569l = (AbstractCollection) list;
        this.f8570m = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f8569l.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new Q(this, this.f8569l.listIterator(i), 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractList
    public final void removeRange(int i, int i5) {
        this.f8569l.subList(i, i5).clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8569l.size();
    }
}
