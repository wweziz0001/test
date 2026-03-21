package q;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: q.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0734d implements Collection {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0735e f9211l;

    public C0734d(C0735e c0735e) {
        this.f9211l = c0735e;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f9211l.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f9211l.f(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f9211l.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0731a(this.f9211l, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0735e c0735e = this.f9211l;
        int iF = c0735e.f(obj);
        if (iF < 0) {
            return false;
        }
        c0735e.h(iF);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0735e c0735e = this.f9211l;
        int i = c0735e.f9237n;
        int i5 = 0;
        boolean z4 = false;
        while (i5 < i) {
            if (collection.contains(c0735e.i(i5))) {
                c0735e.h(i5);
                i5--;
                i--;
                z4 = true;
            }
            i5++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0735e c0735e = this.f9211l;
        int i = c0735e.f9237n;
        int i5 = 0;
        boolean z4 = false;
        while (i5 < i) {
            if (!collection.contains(c0735e.i(i5))) {
                c0735e.h(i5);
                i5--;
                i--;
                z4 = true;
            }
            i5++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f9211l.f9237n;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0735e c0735e = this.f9211l;
        int i = c0735e.f9237n;
        Object[] objArr = new Object[i];
        for (int i5 = 0; i5 < i; i5++) {
            objArr[i5] = c0735e.i(i5);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f9211l.j(1, objArr);
    }
}
