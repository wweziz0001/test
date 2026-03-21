package q;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: q.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0733c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9208m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9209n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0735e f9210o;

    public C0733c(C0735e c0735e) {
        this.f9210o = c0735e;
        this.f9207l = c0735e.f9237n - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f9209n) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f9208m;
        C0735e c0735e = this.f9210o;
        Object objG = c0735e.g(i);
        if (key != objG && (key == null || !key.equals(objG))) {
            return false;
        }
        Object value = entry.getValue();
        Object objI = c0735e.i(this.f9208m);
        return value == objI || (value != null && value.equals(objI));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f9209n) {
            return this.f9210o.g(this.f9208m);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f9209n) {
            return this.f9210o.i(this.f9208m);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9208m < this.f9207l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f9209n) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f9208m;
        C0735e c0735e = this.f9210o;
        Object objG = c0735e.g(i);
        Object objI = c0735e.i(this.f9208m);
        return (objG == null ? 0 : objG.hashCode()) ^ (objI != null ? objI.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f9208m++;
        this.f9209n = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f9209n) {
            throw new IllegalStateException();
        }
        this.f9210o.h(this.f9208m);
        this.f9208m--;
        this.f9207l--;
        this.f9209n = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f9209n) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = (this.f9208m << 1) + 1;
        Object[] objArr = this.f9210o.f9236m;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
