package D3;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Map.Entry, O3.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f602n;

    public e(f fVar, int i) {
        N3.h.e(fVar, "map");
        this.f600l = fVar;
        this.f601m = i;
        this.f602n = fVar.f610s;
    }

    public final void a() {
        if (this.f600l.f610s != this.f602n) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (N3.h.a(entry.getKey(), getKey()) && N3.h.a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f600l.f603l[this.f601m];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f600l.f604m;
        N3.h.b(objArr);
        return objArr[this.f601m];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        f fVar = this.f600l;
        fVar.c();
        Object[] objArr = fVar.f604m;
        if (objArr == null) {
            int length = fVar.f603l.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f604m = objArr;
        }
        int i = this.f601m;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
