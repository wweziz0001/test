package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Comparable f4118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f4119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ X f4120n;

    public Y(X x4, Comparable comparable, Object obj) {
        this.f4120n = x4;
        this.f4118l = comparable;
        this.f4119m = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4118l.compareTo(((Y) obj).f4118l);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f4118l;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f4119m;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4118l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4119m;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f4118l;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f4119m;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f4120n.b();
        Object obj2 = this.f4119m;
        this.f4119m = obj;
        return obj2;
    }

    public final String toString() {
        return this.f4118l + "=" + this.f4119m;
    }
}
