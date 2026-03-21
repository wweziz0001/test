package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f0 f5195f = new f0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f5197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f5198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5199d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5200e;

    public f0(int i, int[] iArr, Object[] objArr, boolean z4) {
        this.f5196a = i;
        this.f5197b = iArr;
        this.f5198c = objArr;
        this.f5200e = z4;
    }

    public static f0 c() {
        return new f0(0, new int[8], new Object[8], true);
    }

    public final void a(int i) {
        int[] iArr = this.f5197b;
        if (i > iArr.length) {
            int i5 = this.f5196a;
            int i6 = (i5 / 2) + i5;
            if (i6 >= i) {
                i = i6;
            }
            if (i < 8) {
                i = 8;
            }
            this.f5197b = Arrays.copyOf(iArr, i);
            this.f5198c = Arrays.copyOf(this.f5198c, i);
        }
    }

    public final int b() {
        int iN0;
        int i = this.f5199d;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i5 = 0; i5 < this.f5196a; i5++) {
            int i6 = this.f5197b[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 == 0) {
                iN0 = C0332l.n0(((Long) this.f5198c[i5]).longValue(), i7);
            } else if (i8 == 1) {
                ((Long) this.f5198c[i5]).getClass();
                iN0 = C0332l.Y(i7);
            } else if (i8 == 2) {
                iN0 = C0332l.T(i7, (AbstractC0329i) this.f5198c[i5]);
            } else if (i8 == 3) {
                iB = ((f0) this.f5198c[i5]).b() + (C0332l.k0(i7) * 2) + iB;
            } else {
                if (i8 != 5) {
                    throw new IllegalStateException(C.c());
                }
                ((Integer) this.f5198c[i5]).getClass();
                iN0 = C0332l.X(i7);
            }
            iB = iN0 + iB;
        }
        this.f5199d = iB;
        return iB;
    }

    public final void d(int i, Object obj) {
        if (!this.f5200e) {
            throw new UnsupportedOperationException();
        }
        a(this.f5196a + 1);
        int[] iArr = this.f5197b;
        int i5 = this.f5196a;
        iArr[i5] = i;
        this.f5198c[i5] = obj;
        this.f5196a = i5 + 1;
    }

    public final void e(L l3) throws K3.b {
        if (this.f5196a == 0) {
            return;
        }
        l3.getClass();
        for (int i = 0; i < this.f5196a; i++) {
            int i5 = this.f5197b[i];
            Object obj = this.f5198c[i];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                l3.j(((Long) obj).longValue(), i6);
            } else if (i7 == 1) {
                l3.f(((Long) obj).longValue(), i6);
            } else if (i7 == 2) {
                l3.b(i6, (AbstractC0329i) obj);
            } else if (i7 == 3) {
                C0332l c0332l = (C0332l) l3.f5148a;
                c0332l.x0(i6, 3);
                ((f0) obj).e(l3);
                c0332l.x0(i6, 4);
            } else {
                if (i7 != 5) {
                    throw new RuntimeException(C.c());
                }
                l3.e(i6, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        int i = this.f5196a;
        if (i == f0Var.f5196a) {
            int[] iArr = this.f5197b;
            int[] iArr2 = f0Var.f5197b;
            int i5 = 0;
            while (true) {
                if (i5 >= i) {
                    Object[] objArr = this.f5198c;
                    Object[] objArr2 = f0Var.f5198c;
                    int i6 = this.f5196a;
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
        int i = this.f5196a;
        int i5 = (527 + i) * 31;
        int[] iArr = this.f5197b;
        int iHashCode = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = (i5 + i6) * 31;
        Object[] objArr = this.f5198c;
        int i9 = this.f5196a;
        for (int i10 = 0; i10 < i9; i10++) {
            iHashCode = (iHashCode * 31) + objArr[i10].hashCode();
        }
        return i8 + iHashCode;
    }
}
