package I2;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Map.Entry {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o f1054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o f1055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o f1056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o f1057o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o f1058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f1059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f1060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f1061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1062t;

    public o(boolean z4) {
        this.f1059q = null;
        this.f1060r = z4;
        this.f1058p = this;
        this.f1057o = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f1059q;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f1061s;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f1059q;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f1061s;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f1059q;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f1061s;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f1060r) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f1061s;
        this.f1061s = obj;
        return obj2;
    }

    public final String toString() {
        return this.f1059q + "=" + this.f1061s;
    }

    public o(boolean z4, o oVar, Object obj, o oVar2, o oVar3) {
        this.f1054l = oVar;
        this.f1059q = obj;
        this.f1060r = z4;
        this.f1062t = 1;
        this.f1057o = oVar2;
        this.f1058p = oVar3;
        oVar3.f1057o = this;
        oVar2.f1058p = this;
    }
}
