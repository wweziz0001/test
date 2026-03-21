package q;

/* JADX INFO: renamed from: q.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0738h implements Cloneable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f9226p = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9227l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long[] f9228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object[] f9229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9230o;

    public C0738h() {
        int i;
        int i5 = 4;
        while (true) {
            i = 80;
            if (i5 >= 32) {
                break;
            }
            int i6 = (1 << i5) - 12;
            if (80 <= i6) {
                i = i6;
                break;
            }
            i5++;
        }
        int i7 = i / 8;
        this.f9228m = new long[i7];
        this.f9229n = new Object[i7];
    }

    public final void a() {
        int i = this.f9230o;
        long[] jArr = this.f9228m;
        Object[] objArr = this.f9229n;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[i6];
            if (obj != f9226p) {
                if (i6 != i5) {
                    jArr[i5] = jArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        this.f9227l = false;
        this.f9230o = i5;
    }

    public final void b(long j5, Object obj) {
        int iB = AbstractC0737g.b(this.f9228m, this.f9230o, j5);
        if (iB >= 0) {
            this.f9229n[iB] = obj;
            return;
        }
        int i = ~iB;
        int i5 = this.f9230o;
        if (i < i5) {
            Object[] objArr = this.f9229n;
            if (objArr[i] == f9226p) {
                this.f9228m[i] = j5;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f9227l && i5 >= this.f9228m.length) {
            a();
            i = ~AbstractC0737g.b(this.f9228m, this.f9230o, j5);
        }
        int i6 = this.f9230o;
        if (i6 >= this.f9228m.length) {
            int i7 = (i6 + 1) * 8;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 8;
            long[] jArr = new long[i10];
            Object[] objArr2 = new Object[i10];
            long[] jArr2 = this.f9228m;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f9229n;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f9228m = jArr;
            this.f9229n = objArr2;
        }
        int i11 = this.f9230o - i;
        if (i11 != 0) {
            long[] jArr3 = this.f9228m;
            int i12 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i12, i11);
            Object[] objArr4 = this.f9229n;
            System.arraycopy(objArr4, i, objArr4, i12, this.f9230o - i);
        }
        this.f9228m[i] = j5;
        this.f9229n[i] = obj;
        this.f9230o++;
    }

    public final Object clone() {
        try {
            C0738h c0738h = (C0738h) super.clone();
            c0738h.f9228m = (long[]) this.f9228m.clone();
            c0738h.f9229n = (Object[]) this.f9229n.clone();
            return c0738h;
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    public final String toString() {
        if (this.f9227l) {
            a();
        }
        if (this.f9230o <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f9230o * 28);
        sb.append('{');
        for (int i = 0; i < this.f9230o; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f9227l) {
                a();
            }
            sb.append(this.f9228m[i]);
            sb.append('=');
            if (this.f9227l) {
                a();
            }
            Object obj = this.f9229n[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
