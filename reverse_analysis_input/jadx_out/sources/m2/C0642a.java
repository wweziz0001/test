package m2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: m2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0642a implements Iterator {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Iterator f8577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f8578m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Collection f8579n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Iterator f8580o = O.f8561l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y f8581p;

    public C0642a(Y y) {
        this.f8581p = y;
        this.f8577l = y.f8573o.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8577l.hasNext() || this.f8580o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f8580o.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8577l.next();
            this.f8578m = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f8579n = collection;
            this.f8580o = collection.iterator();
        }
        return this.f8580o.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f8580o.remove();
        Collection collection = this.f8579n;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f8577l.remove();
        }
        Y y = this.f8581p;
        y.f8574p--;
    }
}
