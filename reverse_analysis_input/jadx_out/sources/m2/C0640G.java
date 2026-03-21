package m2;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: m2.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0640G extends q0 implements ListIterator {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f8543l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final I f8545n;

    public C0640G(I i, int i5) {
        int size = i.size();
        D1.b.o(i5, size);
        this.f8543l = size;
        this.f8544m = i5;
        this.f8545n = i;
    }

    public final Object a(int i) {
        return this.f8545n.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f8544m < this.f8543l;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8544m > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f8544m;
        this.f8544m = i + 1;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8544m;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f8544m - 1;
        this.f8544m = i;
        return a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8544m - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
