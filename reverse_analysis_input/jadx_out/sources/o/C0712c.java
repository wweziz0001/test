package o;

import java.util.Map;

/* JADX INFO: renamed from: o.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0712c implements Map.Entry {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f8954l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f8955m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0712c f8956n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0712c f8957o;

    public C0712c(Object obj, Object obj2) {
        this.f8954l = obj;
        this.f8955m = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0712c)) {
            return false;
        }
        C0712c c0712c = (C0712c) obj;
        return this.f8954l.equals(c0712c.f8954l) && this.f8955m.equals(c0712c.f8955m);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f8954l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8955m;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f8954l.hashCode() ^ this.f8955m.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f8954l + "=" + this.f8955m;
    }
}
