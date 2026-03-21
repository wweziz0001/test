package m2;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: m2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0655n extends AbstractCollection {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f8638m;

    public /* synthetic */ C0655n(int i, Serializable serializable) {
        this.f8637l = i;
        this.f8638m = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f8637l) {
            case 0:
                ((Y) this.f8638m).c();
                break;
            case 1:
                ((C0662v) this.f8638m).clear();
                break;
            default:
                ((C0645d) this.f8638m).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f8637l) {
            case 0:
                return ((Y) this.f8638m).b(obj);
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((C0645d) this.f8638m).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f8637l) {
            case 2:
                return ((C0645d) this.f8638m).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f8637l) {
            case 0:
                return new C0642a((Y) this.f8638m);
            case 1:
                C0662v c0662v = (C0662v) this.f8638m;
                Map mapC = c0662v.c();
                return mapC != null ? mapC.values().iterator() : new C0659s(c0662v, 2);
            default:
                return new U(((C0645d) this.f8638m).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f8637l) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C0645d c0645d = (C0645d) this.f8638m;
                    for (Map.Entry entry : c0645d.entrySet()) {
                        if (i4.a.v(obj, entry.getValue())) {
                            c0645d.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f8637l) {
            case 2:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0645d c0645d = (C0645d) this.f8638m;
                    for (Map.Entry entry : c0645d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0645d.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f8637l) {
            case 2:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0645d c0645d = (C0645d) this.f8638m;
                    for (Map.Entry entry : c0645d.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0645d.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f8637l) {
            case 0:
                return ((Y) this.f8638m).f8574p;
            case 1:
                return ((C0662v) this.f8638m).size();
            default:
                return ((C0645d) this.f8638m).f8593n.size();
        }
    }

    public C0655n(C0645d c0645d) {
        this.f8637l = 2;
        this.f8638m = c0645d;
    }
}
