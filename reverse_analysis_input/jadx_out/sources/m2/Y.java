package m2;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractC0656o implements Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient Map f8573o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public transient int f8574p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public transient X f8575q;

    public Y(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f8573o = map;
    }

    @Override // m2.AbstractC0656o
    public final Map a() {
        Map c0647f = this.f8641n;
        if (c0647f == null) {
            Map map = this.f8573o;
            c0647f = map instanceof NavigableMap ? new C0647f(this, (NavigableMap) map) : map instanceof SortedMap ? new C0650i(this, (SortedMap) map) : new C0645d(this, map);
            this.f8641n = c0647f;
        }
        return c0647f;
    }

    public final void c() {
        Map map = this.f8573o;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f8574p = 0;
    }

    public final Collection d() {
        return (List) this.f8575q.get();
    }
}
