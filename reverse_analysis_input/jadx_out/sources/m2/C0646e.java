package m2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: m2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0646e extends n0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f8598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f8599m;

    public C0646e(Y y, Map map) {
        this.f8599m = y;
        map.getClass();
        this.f8598l = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C0644c c0644c = (C0644c) it;
            if (!c0644c.hasNext()) {
                return;
            }
            c0644c.next();
            c0644c.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f8598l.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f8598l.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f8598l.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f8598l.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f8598l.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0644c(this, this.f8598l.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f8598l.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f8599m.f8574p -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8598l.size();
    }
}
