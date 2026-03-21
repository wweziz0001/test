package m2;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends M {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object[] f8614t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final h0 f8615u;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient Object[] f8616o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final transient int f8617p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient Object[] f8618q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient int f8619r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient int f8620s;

    static {
        Object[] objArr = new Object[0];
        f8614t = objArr;
        f8615u = new h0(0, 0, 0, objArr, objArr);
    }

    public h0(int i, int i5, int i6, Object[] objArr, Object[] objArr2) {
        this.f8616o = objArr;
        this.f8617p = i;
        this.f8618q = objArr2;
        this.f8619r = i5;
        this.f8620s = i6;
    }

    @Override // m2.AbstractC0637D, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f8618q;
            if (objArr.length != 0) {
                int iT = r.t(obj);
                while (true) {
                    int i = iT & this.f8619r;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iT = i + 1;
                }
            }
        }
        return false;
    }

    @Override // m2.AbstractC0637D
    public final int g(int i, Object[] objArr) {
        Object[] objArr2 = this.f8616o;
        int i5 = this.f8620s;
        System.arraycopy(objArr2, 0, objArr, i, i5);
        return i + i5;
    }

    @Override // m2.AbstractC0637D
    public final Object[] h() {
        return this.f8616o;
    }

    @Override // m2.M, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f8617p;
    }

    @Override // m2.AbstractC0637D
    public final int i() {
        return this.f8620s;
    }

    @Override // m2.AbstractC0637D
    public final int j() {
        return 0;
    }

    @Override // m2.AbstractC0637D
    public final boolean k() {
        return false;
    }

    @Override // m2.AbstractC0637D
    /* JADX INFO: renamed from: l */
    public final q0 iterator() {
        return f().listIterator(0);
    }

    @Override // m2.M
    public final I p() {
        return I.m(this.f8620s, this.f8616o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8620s;
    }
}
