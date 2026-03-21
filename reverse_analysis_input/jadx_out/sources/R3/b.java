package R3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, O3.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1960n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1961o;

    public b(int i, int i5, int i6) {
        this.f1958l = i6;
        this.f1959m = i5;
        boolean z4 = false;
        if (i6 <= 0 ? i >= i5 : i <= i5) {
            z4 = true;
        }
        this.f1960n = z4;
        this.f1961o = z4 ? i : i5;
    }

    public final int a() {
        int i = this.f1961o;
        if (i != this.f1959m) {
            this.f1961o = this.f1958l + i;
        } else {
            if (!this.f1960n) {
                throw new NoSuchElementException();
            }
            this.f1960n = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1960n;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
