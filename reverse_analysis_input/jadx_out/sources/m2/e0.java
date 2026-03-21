package m2;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends M {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient g0 f8600o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final transient f0 f8601p;

    public e0(g0 g0Var, f0 f0Var) {
        this.f8600o = g0Var;
        this.f8601p = f0Var;
    }

    @Override // m2.AbstractC0637D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8600o.get(obj) != null;
    }

    @Override // m2.M, m2.AbstractC0637D
    public final I f() {
        return this.f8601p;
    }

    @Override // m2.AbstractC0637D
    public final int g(int i, Object[] objArr) {
        return this.f8601p.g(i, objArr);
    }

    @Override // m2.AbstractC0637D
    public final boolean k() {
        return true;
    }

    @Override // m2.AbstractC0637D
    /* JADX INFO: renamed from: l */
    public final q0 iterator() {
        return this.f8601p.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8600o.f8613q;
    }
}
