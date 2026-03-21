package m2;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends M {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient g0 f8595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final transient Object[] f8596p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient int f8597q;

    public d0(g0 g0Var, Object[] objArr, int i) {
        this.f8595o = g0Var;
        this.f8596p = objArr;
        this.f8597q = i;
    }

    @Override // m2.AbstractC0637D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.f8595o.get(key));
    }

    @Override // m2.AbstractC0637D
    public final int g(int i, Object[] objArr) {
        return f().g(i, objArr);
    }

    @Override // m2.AbstractC0637D
    public final boolean k() {
        return true;
    }

    @Override // m2.AbstractC0637D
    /* JADX INFO: renamed from: l */
    public final q0 iterator() {
        return f().listIterator(0);
    }

    @Override // m2.M
    public final I p() {
        return new c0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8597q;
    }
}
