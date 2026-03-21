package N3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator, O3.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object[] f1604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1605m;

    public a(Object[] objArr) {
        this.f1604l = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1605m < this.f1604l.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f1604l;
            int i = this.f1605m;
            this.f1605m = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e5) {
            this.f1605m--;
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
