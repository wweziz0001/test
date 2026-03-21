package m2;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 implements Iterator {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Iterator f8643l;

    public p0(Iterator it) {
        it.getClass();
        this.f8643l = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8643l.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f8643l.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f8643l.remove();
    }
}
