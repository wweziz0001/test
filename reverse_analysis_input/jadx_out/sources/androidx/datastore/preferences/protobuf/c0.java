package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c0 f4130f = new c0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f4132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f4133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4134d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4135e;

    public c0(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.f4131a = i;
        this.f4132b = iArr;
        this.f4133c = objArr;
        this.f4135e = z4;
    }

    public final void a(int i) {
        int[] iArr = this.f4132b;
        if (i > iArr.length) {
            int i5 = this.f4131a;
            int i6 = (i5 / 2) + i5;
            if (i6 >= i) {
                i = i6;
            }
            if (i < 8) {
                i = 8;
            }
            this.f4132b = Arrays.copyOf(iArr, i);
            this.f4133c = Arrays.copyOf(this.f4133c, i);
        }
    }

    public final int b() {
        int iQ0;
        int i = this.f4134d;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i5 = 0; i5 < this.f4131a; i5++) {
            int i6 = this.f4132b[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 == 0) {
                iQ0 = C0220l.q0(((Long) this.f4133c[i5]).longValue(), i7);
            } else if (i8 == 1) {
                ((Long) this.f4133c[i5]).getClass();
                iQ0 = C0220l.c0(i7);
            } else if (i8 == 2) {
                iQ0 = C0220l.Y(i7, (C0215g) this.f4133c[i5]);
            } else if (i8 == 3) {
                iB = ((c0) this.f4133c[i5]).b() + (C0220l.n0(i7) * 2) + iB;
            } else {
                if (i8 != 5) {
                    throw new IllegalStateException(C0233z.b());
                }
                ((Integer) this.f4133c[i5]).getClass();
                iQ0 = C0220l.b0(i7);
            }
            iB = iQ0 + iB;
        }
        this.f4134d = iB;
        return iB;
    }

    public final void c(int i, Object obj) {
        if (!this.f4135e) {
            throw new UnsupportedOperationException();
        }
        a(this.f4131a + 1);
        int[] iArr = this.f4132b;
        int i5 = this.f4131a;
        iArr[i5] = i;
        this.f4133c[i5] = obj;
        this.f4131a = i5 + 1;
    }

    public final void d(E e5) {
        if (this.f4131a == 0) {
            return;
        }
        e5.getClass();
        for (int i = 0; i < this.f4131a; i++) {
            int i5 = this.f4132b[i];
            Object obj = this.f4133c[i];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                e5.j(((Long) obj).longValue(), i6);
            } else if (i7 == 1) {
                e5.f(((Long) obj).longValue(), i6);
            } else if (i7 == 2) {
                e5.b(i6, (C0215g) obj);
            } else if (i7 == 3) {
                C0220l c0220l = (C0220l) e5.f4070a;
                c0220l.H0(i6, 3);
                ((c0) obj).d(e5);
                c0220l.H0(i6, 4);
            } else {
                if (i7 != 5) {
                    throw new RuntimeException(C0233z.b());
                }
                e5.e(i6, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        int i = this.f4131a;
        if (i == c0Var.f4131a) {
            int[] iArr = this.f4132b;
            int[] iArr2 = c0Var.f4132b;
            int i5 = 0;
            while (true) {
                if (i5 >= i) {
                    Object[] objArr = this.f4133c;
                    Object[] objArr2 = c0Var.f4133c;
                    int i6 = this.f4131a;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (objArr[i7].equals(objArr2[i7])) {
                        }
                    }
                    return true;
                }
                if (iArr[i5] != iArr2[i5]) {
                    break;
                }
                i5++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f4131a;
        int i5 = (527 + i) * 31;
        int[] iArr = this.f4132b;
        int iHashCode = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = (i5 + i6) * 31;
        Object[] objArr = this.f4133c;
        int i9 = this.f4131a;
        for (int i10 = 0; i10 < i9; i10++) {
            iHashCode = (iHashCode * 31) + objArr[i10].hashCode();
        }
        return i8 + iHashCode;
    }
}
