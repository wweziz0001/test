package D3;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ListIterator, O3.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f585l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f587n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f588o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C3.a f589p;

    public a(c cVar, int i) {
        N3.h.e(cVar, "list");
        this.f589p = cVar;
        this.f586m = i;
        this.f587n = -1;
        this.f588o = ((AbstractList) cVar).modCount;
    }

    public void a() {
        if (((AbstractList) ((b) this.f589p).f594p).modCount != this.f588o) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f585l) {
            case 0:
                a();
                int i = this.f586m;
                this.f586m = i + 1;
                b bVar = (b) this.f589p;
                bVar.add(i, obj);
                this.f587n = -1;
                this.f588o = ((AbstractList) bVar).modCount;
                break;
            default:
                b();
                int i5 = this.f586m;
                this.f586m = i5 + 1;
                c cVar = (c) this.f589p;
                cVar.add(i5, obj);
                this.f587n = -1;
                this.f588o = ((AbstractList) cVar).modCount;
                break;
        }
    }

    public void b() {
        if (((AbstractList) ((c) this.f589p)).modCount != this.f588o) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f585l) {
            case 0:
                if (this.f586m < ((b) this.f589p).f592n) {
                }
                break;
            default:
                if (this.f586m < ((c) this.f589p).f597m) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f585l) {
            case 0:
                if (this.f586m > 0) {
                }
                break;
            default:
                if (this.f586m > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f585l) {
            case 0:
                a();
                int i = this.f586m;
                b bVar = (b) this.f589p;
                if (i >= bVar.f592n) {
                    throw new NoSuchElementException();
                }
                this.f586m = i + 1;
                this.f587n = i;
                return bVar.f590l[bVar.f591m + i];
            default:
                b();
                int i5 = this.f586m;
                c cVar = (c) this.f589p;
                if (i5 >= cVar.f597m) {
                    throw new NoSuchElementException();
                }
                this.f586m = i5 + 1;
                this.f587n = i5;
                return cVar.f596l[i5];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f585l) {
        }
        return this.f586m;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f585l) {
            case 0:
                a();
                int i = this.f586m;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i5 = i - 1;
                this.f586m = i5;
                this.f587n = i5;
                b bVar = (b) this.f589p;
                return bVar.f590l[bVar.f591m + i5];
            default:
                b();
                int i6 = this.f586m;
                if (i6 <= 0) {
                    throw new NoSuchElementException();
                }
                int i7 = i6 - 1;
                this.f586m = i7;
                this.f587n = i7;
                return ((c) this.f589p).f596l[i7];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f585l) {
        }
        return this.f586m - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f585l) {
            case 0:
                a();
                int i = this.f587n;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                b bVar = (b) this.f589p;
                bVar.g(i);
                this.f586m = this.f587n;
                this.f587n = -1;
                this.f588o = ((AbstractList) bVar).modCount;
                return;
            default:
                b();
                int i5 = this.f587n;
                if (i5 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c cVar = (c) this.f589p;
                cVar.g(i5);
                this.f586m = this.f587n;
                this.f587n = -1;
                this.f588o = ((AbstractList) cVar).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f585l) {
            case 0:
                a();
                int i = this.f587n;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f589p).set(i, obj);
                return;
            default:
                b();
                int i5 = this.f587n;
                if (i5 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f589p).set(i5, obj);
                return;
        }
    }

    public a(b bVar, int i) {
        N3.h.e(bVar, "list");
        this.f589p = bVar;
        this.f586m = i;
        this.f587n = -1;
        this.f588o = ((AbstractList) bVar).modCount;
    }
}
