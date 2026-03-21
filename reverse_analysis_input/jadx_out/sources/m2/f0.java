package m2;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends I {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final transient Object[] f8603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient int f8604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final transient int f8605p;

    public f0(Object[] objArr, int i, int i5) {
        this.f8603n = objArr;
        this.f8604o = i;
        this.f8605p = i5;
    }

    @Override // java.util.List
    public final Object get(int i) {
        D1.b.l(i, this.f8605p);
        Object obj = this.f8603n[(i * 2) + this.f8604o];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // m2.AbstractC0637D
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8605p;
    }
}
