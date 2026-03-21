package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements Iterator {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4121l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4122m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Iterator f4123n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ X f4124o;

    public Z(X x4) {
        this.f4124o = x4;
    }

    public final Iterator a() {
        if (this.f4123n == null) {
            this.f4123n = this.f4124o.f4114m.entrySet().iterator();
        }
        return this.f4123n;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f4121l + 1;
        X x4 = this.f4124o;
        if (i >= x4.f4113l.size()) {
            return !x4.f4114m.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f4122m = true;
        int i = this.f4121l + 1;
        this.f4121l = i;
        X x4 = this.f4124o;
        return i < x4.f4113l.size() ? (Map.Entry) x4.f4113l.get(this.f4121l) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4122m) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f4122m = false;
        int i = X.f4112q;
        X x4 = this.f4124o;
        x4.b();
        if (this.f4121l >= x4.f4113l.size()) {
            a().remove();
            return;
        }
        int i5 = this.f4121l;
        this.f4121l = i5 - 1;
        x4.h(i5);
    }
}
