package m2;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends I {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b0 f8583p = new b0(0, new Object[0]);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final transient Object[] f8584n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient int f8585o;

    public b0(int i, Object[] objArr) {
        this.f8584n = objArr;
        this.f8585o = i;
    }

    @Override // m2.I, m2.AbstractC0637D
    public final int g(int i, Object[] objArr) {
        Object[] objArr2 = this.f8584n;
        int i5 = this.f8585o;
        System.arraycopy(objArr2, 0, objArr, i, i5);
        return i + i5;
    }

    @Override // java.util.List
    public final Object get(int i) {
        D1.b.l(i, this.f8585o);
        Object obj = this.f8584n[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // m2.AbstractC0637D
    public final Object[] h() {
        return this.f8584n;
    }

    @Override // m2.AbstractC0637D
    public final int i() {
        return this.f8585o;
    }

    @Override // m2.AbstractC0637D
    public final int j() {
        return 0;
    }

    @Override // m2.AbstractC0637D
    public final boolean k() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8585o;
    }
}
