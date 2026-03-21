package m2;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class P extends q0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f8563l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8564m;

    public P(Object obj) {
        this.f8563l = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f8564m;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8564m) {
            throw new NoSuchElementException();
        }
        this.f8564m = true;
        return this.f8563l;
    }
}
