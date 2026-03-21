package D3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g extends C3.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f617m;

    public g(f fVar, int i) {
        this.f616l = i;
        switch (i) {
            case 1:
                N3.h.e(fVar, "backing");
                this.f617m = fVar;
                break;
            default:
                N3.h.e(fVar, "backing");
                this.f617m = fVar;
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f616l) {
            case 0:
                N3.h.e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f616l) {
            case 0:
                N3.h.e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                N3.h.e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f616l) {
            case 0:
                this.f617m.clear();
                break;
            default:
                this.f617m.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f616l) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                N3.h.e(entry, "element");
                return this.f617m.f(entry);
            default:
                return this.f617m.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f616l) {
            case 0:
                N3.h.e(collection, "elements");
                return this.f617m.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // C3.b
    public final int f() {
        switch (this.f616l) {
        }
        return this.f617m.f611t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f616l) {
        }
        return this.f617m.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f616l) {
            case 0:
                f fVar = this.f617m;
                fVar.getClass();
                return new d(fVar, 0);
            default:
                f fVar2 = this.f617m;
                fVar2.getClass();
                return new d(fVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f616l) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    N3.h.e(entry, "element");
                    f fVar = this.f617m;
                    fVar.getClass();
                    fVar.c();
                    int iH = fVar.h(entry.getKey());
                    if (iH >= 0) {
                        Object[] objArr = fVar.f604m;
                        N3.h.b(objArr);
                        if (N3.h.a(objArr[iH], entry.getValue())) {
                            fVar.l(iH);
                            break;
                        }
                    }
                }
                break;
            default:
                f fVar2 = this.f617m;
                fVar2.c();
                int iH2 = fVar2.h(obj);
                if (iH2 >= 0) {
                    fVar2.l(iH2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f616l) {
            case 0:
                N3.h.e(collection, "elements");
                this.f617m.c();
                break;
            default:
                N3.h.e(collection, "elements");
                this.f617m.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f616l) {
            case 0:
                N3.h.e(collection, "elements");
                this.f617m.c();
                break;
            default:
                N3.h.e(collection, "elements");
                this.f617m.c();
                break;
        }
        return super.retainAll(collection);
    }
}
