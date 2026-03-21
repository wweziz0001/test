package m2;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: m2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0653l extends AbstractCollection implements List {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f8629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Collection f8630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0653l f8631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Collection f8632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y f8633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y f8634q;

    public C0653l(Y y, Object obj, List list, C0653l c0653l) {
        this.f8634q = y;
        this.f8633p = y;
        this.f8629l = obj;
        this.f8630m = list;
        this.f8631n = c0653l;
        this.f8632o = c0653l == null ? null : c0653l.f8630m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        boolean zIsEmpty = this.f8630m.isEmpty();
        boolean zAdd = this.f8630m.add(obj);
        if (zAdd) {
            this.f8633p.f8574p++;
            if (zIsEmpty) {
                f();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f8630m.addAll(collection);
        if (zAddAll) {
            this.f8633p.f8574p += this.f8630m.size() - size;
            if (size == 0) {
                f();
            }
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f8630m.clear();
        this.f8633p.f8574p -= size;
        h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        g();
        return this.f8630m.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        g();
        return this.f8630m.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        g();
        return this.f8630m.equals(obj);
    }

    public final void f() {
        C0653l c0653l = this.f8631n;
        if (c0653l != null) {
            c0653l.f();
        } else {
            this.f8633p.f8573o.put(this.f8629l, this.f8630m);
        }
    }

    public final void g() {
        Collection collection;
        C0653l c0653l = this.f8631n;
        if (c0653l != null) {
            c0653l.g();
            if (c0653l.f8630m != this.f8632o) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f8630m.isEmpty() || (collection = (Collection) this.f8633p.f8573o.get(this.f8629l)) == null) {
                return;
            }
            this.f8630m = collection;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        g();
        return ((List) this.f8630m).get(i);
    }

    public final void h() {
        C0653l c0653l = this.f8631n;
        if (c0653l != null) {
            c0653l.h();
        } else if (this.f8630m.isEmpty()) {
            this.f8633p.f8573o.remove(this.f8629l);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        return this.f8630m.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        g();
        return ((List) this.f8630m).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        g();
        return new C0644c(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        return ((List) this.f8630m).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        g();
        return new C0652k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        boolean zRemove = this.f8630m.remove(obj);
        if (zRemove) {
            Y y = this.f8633p;
            y.f8574p--;
            h();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f8630m.removeAll(collection);
        if (zRemoveAll) {
            this.f8633p.f8574p += this.f8630m.size() - size;
            h();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f8630m.retainAll(collection);
        if (zRetainAll) {
            this.f8633p.f8574p += this.f8630m.size() - size;
            h();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        g();
        return ((List) this.f8630m).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        g();
        return this.f8630m.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i5) {
        g();
        List listSubList = ((List) this.f8630m).subList(i, i5);
        C0653l c0653l = this.f8631n;
        if (c0653l == null) {
            c0653l = this;
        }
        Y y = this.f8634q;
        y.getClass();
        boolean z4 = listSubList instanceof RandomAccess;
        Object obj = this.f8629l;
        return z4 ? new C0649h(y, obj, listSubList, c0653l) : new C0653l(y, obj, listSubList, c0653l);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return this.f8630m.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        g();
        return new C0652k(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        g();
        Object objRemove = ((List) this.f8630m).remove(i);
        Y y = this.f8634q;
        y.f8574p--;
        h();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        g();
        boolean zIsEmpty = this.f8630m.isEmpty();
        ((List) this.f8630m).add(i, obj);
        this.f8634q.f8574p++;
        if (zIsEmpty) {
            f();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f8630m).addAll(i, collection);
        if (zAddAll) {
            this.f8634q.f8574p += this.f8630m.size() - size;
            if (size == 0) {
                f();
            }
        }
        return zAddAll;
    }
}
