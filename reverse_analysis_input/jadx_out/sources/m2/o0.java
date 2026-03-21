package m2;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends M {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient Object f8642o;

    public o0(Object obj) {
        obj.getClass();
        this.f8642o = obj;
    }

    @Override // m2.AbstractC0637D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f8642o.equals(obj);
    }

    @Override // m2.M, m2.AbstractC0637D
    public final I f() {
        return I.u(this.f8642o);
    }

    @Override // m2.AbstractC0637D
    public final int g(int i, Object[] objArr) {
        objArr[i] = this.f8642o;
        return i + 1;
    }

    @Override // m2.M, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f8642o.hashCode();
    }

    @Override // m2.AbstractC0637D
    public final boolean k() {
        return false;
    }

    @Override // m2.AbstractC0637D
    /* JADX INFO: renamed from: l */
    public final q0 iterator() {
        return new P(this.f8642o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f8642o.toString() + ']';
    }
}
