package q;

/* JADX INFO: renamed from: q.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0740j implements Cloneable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f9238o = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f9239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object[] f9240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9241n;

    public C0740j() {
        int i;
        int i5 = 4;
        while (true) {
            i = 40;
            if (i5 >= 32) {
                break;
            }
            int i6 = (1 << i5) - 12;
            if (40 <= i6) {
                i = i6;
                break;
            }
            i5++;
        }
        int i7 = i / 4;
        this.f9239l = new int[i7];
        this.f9240m = new Object[i7];
    }

    public final void a(int i, Object obj) {
        int i5 = this.f9241n;
        if (i5 == 0 || i > this.f9239l[i5 - 1]) {
            if (i5 >= this.f9239l.length) {
                int i6 = (i5 + 1) * 4;
                int i7 = 4;
                while (true) {
                    if (i7 >= 32) {
                        break;
                    }
                    int i8 = (1 << i7) - 12;
                    if (i6 <= i8) {
                        i6 = i8;
                        break;
                    }
                    i7++;
                }
                int i9 = i6 / 4;
                int[] iArr = new int[i9];
                Object[] objArr = new Object[i9];
                int[] iArr2 = this.f9239l;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f9240m;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f9239l = iArr;
                this.f9240m = objArr;
            }
            this.f9239l[i5] = i;
            this.f9240m[i5] = obj;
            this.f9241n = i5 + 1;
            return;
        }
        int iA = AbstractC0737g.a(this.f9241n, i, this.f9239l);
        if (iA >= 0) {
            this.f9240m[iA] = obj;
            return;
        }
        int i10 = ~iA;
        int i11 = this.f9241n;
        if (i10 < i11) {
            Object[] objArr3 = this.f9240m;
            if (objArr3[i10] == f9238o) {
                this.f9239l[i10] = i;
                objArr3[i10] = obj;
                return;
            }
        }
        if (i11 >= this.f9239l.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] iArr3 = new int[i15];
            Object[] objArr4 = new Object[i15];
            int[] iArr4 = this.f9239l;
            System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
            Object[] objArr5 = this.f9240m;
            System.arraycopy(objArr5, 0, objArr4, 0, objArr5.length);
            this.f9239l = iArr3;
            this.f9240m = objArr4;
        }
        int i16 = this.f9241n - i10;
        if (i16 != 0) {
            int[] iArr5 = this.f9239l;
            int i17 = i10 + 1;
            System.arraycopy(iArr5, i10, iArr5, i17, i16);
            Object[] objArr6 = this.f9240m;
            System.arraycopy(objArr6, i10, objArr6, i17, this.f9241n - i10);
        }
        this.f9239l[i10] = i;
        this.f9240m[i10] = obj;
        this.f9241n++;
    }

    public final Object clone() {
        try {
            C0740j c0740j = (C0740j) super.clone();
            c0740j.f9239l = (int[]) this.f9239l.clone();
            c0740j.f9240m = (Object[]) this.f9240m.clone();
            return c0740j;
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }

    public final String toString() {
        int i = this.f9241n;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i5 = 0; i5 < this.f9241n; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(this.f9239l[i5]);
            sb.append('=');
            Object obj = this.f9240m[i5];
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
