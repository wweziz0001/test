package q;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: q.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0732b implements Set {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0735e f9206l;

    public C0732b(C0735e c0735e) {
        this.f9206l = c0735e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f9206l.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f9206l.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        C0735e c0735e = this.f9206l;
        c0735e.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!c0735e.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0735e c0735e = this.f9206l;
        int iHashCode = 0;
        for (int i = c0735e.f9237n - 1; i >= 0; i--) {
            Object objG = c0735e.g(i);
            iHashCode += objG == null ? 0 : objG.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f9206l.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0731a(this.f9206l, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0735e c0735e = this.f9206l;
        int iD = c0735e.d(obj);
        if (iD < 0) {
            return false;
        }
        c0735e.h(iD);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0735e c0735e = this.f9206l;
        int i = c0735e.f9237n;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c0735e.remove(it.next());
        }
        return i != c0735e.f9237n;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0735e c0735e = this.f9206l;
        int i = c0735e.f9237n;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            if (!collection.contains(c0735e.g(i5))) {
                c0735e.h(i5);
            }
        }
        return i != c0735e.f9237n;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f9206l.f9237n;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0735e c0735e = this.f9206l;
        int i = c0735e.f9237n;
        Object[] objArr = new Object[i];
        for (int i5 = 0; i5 < i; i5++) {
            objArr[i5] = c0735e.g(i5);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f9206l.j(0, objArr);
    }
}
