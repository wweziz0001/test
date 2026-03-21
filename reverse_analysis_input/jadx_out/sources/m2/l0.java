package m2;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class l0 extends AbstractCollection implements Set {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f8635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l2.e f8636m;

    public l0(Set set, l2.e eVar) {
        this.f8635l = set;
        this.f8636m = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f8636m.apply(obj)) {
            return this.f8635l.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f8636m.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f8635l.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f8635l;
        boolean z4 = set instanceof RandomAccess;
        l2.e eVar = this.f8636m;
        if (!z4 || !(set instanceof List)) {
            Iterator it = set.iterator();
            eVar.getClass();
            while (it.hasNext()) {
                if (eVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        eVar.getClass();
        int i = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            Object obj = list.get(i5);
            if (!eVar.apply(obj)) {
                if (i5 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        r.r(list, eVar, i, i5);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        r.r(list, eVar, i, i5);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f8635l;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f8636m.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return r.i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return r.m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f8635l.iterator();
        l2.e eVar = this.f8636m;
        if (eVar == null) {
            throw new NullPointerException("predicate");
        }
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (eVar.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f8635l.iterator();
        it.getClass();
        l2.e eVar = this.f8636m;
        eVar.getClass();
        return new N(it, eVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f8635l.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f8635l.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f8636m.apply(next) && collection.contains(next)) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f8635l.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f8636m.apply(next) && !collection.contains(next)) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f8635l.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.f8636m.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            N n4 = (N) it;
            if (!n4.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(n4.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            N n4 = (N) it;
            if (n4.hasNext()) {
                arrayList.add(n4.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
