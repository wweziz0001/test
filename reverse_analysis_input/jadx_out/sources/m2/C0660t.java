package m2;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: m2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0660t extends AbstractSet {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0662v f8653m;

    public /* synthetic */ C0660t(C0662v c0662v, int i) {
        this.f8652l = i;
        this.f8653m = c0662v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f8652l) {
            case 0:
                this.f8653m.clear();
                break;
            default:
                this.f8653m.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f8652l) {
            case 0:
                C0662v c0662v = this.f8653m;
                Map mapC = c0662v.c();
                if (mapC != null) {
                    return mapC.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iE = c0662v.e(entry.getKey());
                    if (iE != -1 && i4.a.v(c0662v.k()[iE], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f8653m.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f8652l) {
            case 0:
                C0662v c0662v = this.f8653m;
                Map mapC = c0662v.c();
                return mapC != null ? mapC.entrySet().iterator() : new C0659s(c0662v, 1);
            default:
                C0662v c0662v2 = this.f8653m;
                Map mapC2 = c0662v2.c();
                return mapC2 != null ? mapC2.keySet().iterator() : new C0659s(c0662v2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f8652l) {
            case 0:
                C0662v c0662v = this.f8653m;
                Map mapC = c0662v.c();
                if (mapC != null) {
                    return mapC.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c0662v.g()) {
                        int iD = c0662v.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c0662v.f8658l;
                        Objects.requireNonNull(obj2);
                        int iQ = r.q(key, value, iD, obj2, c0662v.i(), c0662v.j(), c0662v.k());
                        if (iQ != -1) {
                            c0662v.f(iQ, iD);
                            c0662v.f8663q--;
                            c0662v.f8662p += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C0662v c0662v2 = this.f8653m;
                Map mapC2 = c0662v2.c();
                return mapC2 != null ? mapC2.keySet().remove(obj) : c0662v2.h(obj) != C0662v.f8657u;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f8652l) {
        }
        return this.f8653m.size();
    }
}
