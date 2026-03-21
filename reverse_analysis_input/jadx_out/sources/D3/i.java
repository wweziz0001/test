package D3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i extends C3.b implements Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i f619m;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f620l;

    static {
        f fVar = f.y;
        f619m = new i(f.y);
    }

    public i(f fVar) {
        N3.h.e(fVar, "backing");
        this.f620l = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f620l.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        N3.h.e(collection, "elements");
        this.f620l.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f620l.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f620l.containsKey(obj);
    }

    @Override // C3.b
    public final int f() {
        return this.f620l.f611t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f620l.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        f fVar = this.f620l;
        fVar.getClass();
        return new d(fVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f fVar = this.f620l;
        fVar.c();
        int iH = fVar.h(obj);
        if (iH < 0) {
            return false;
        }
        fVar.l(iH);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        N3.h.e(collection, "elements");
        this.f620l.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        N3.h.e(collection, "elements");
        this.f620l.c();
        return super.retainAll(collection);
    }

    public i() {
        this(new f());
    }
}
