package b0;

import d0.AbstractC0360m;
import java.util.Arrays;

/* JADX INFO: renamed from: b0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0302f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4849h;
    public final short[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f4850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4851k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f4852l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4853m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f4854n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4855o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4856p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4857q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4858r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4859s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4860t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4861u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4862v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public double f4863w;

    public C0302f(int i, int i5, float f2, float f5, int i6) {
        this.f4842a = i;
        this.f4843b = i5;
        this.f4844c = f2;
        this.f4845d = f5;
        this.f4846e = i / i6;
        this.f4847f = i / 400;
        int i7 = i / 65;
        this.f4848g = i7;
        int i8 = i7 * 2;
        this.f4849h = i8;
        this.i = new short[i8];
        this.f4850j = new short[i8 * i5];
        this.f4852l = new short[i8 * i5];
        this.f4854n = new short[i8 * i5];
    }

    public static void e(int i, int i5, short[] sArr, int i6, short[] sArr2, int i7, short[] sArr3, int i8) {
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i6 * i5) + i9;
            int i11 = (i8 * i5) + i9;
            int i12 = (i7 * i5) + i9;
            for (int i13 = 0; i13 < i; i13++) {
                sArr[i10] = (short) (((sArr3[i11] * i13) + ((i - i13) * sArr2[i12])) / i);
                i10 += i5;
                i12 += i5;
                i11 += i5;
            }
        }
    }

    public final void a(short[] sArr, int i, int i5) {
        short[] sArrC = c(this.f4852l, this.f4853m, i5);
        this.f4852l = sArrC;
        int i6 = this.f4843b;
        System.arraycopy(sArr, i * i6, sArrC, this.f4853m * i6, i6 * i5);
        this.f4853m += i5;
    }

    public final void b(short[] sArr, int i, int i5) {
        int i6 = this.f4849h / i5;
        int i7 = this.f4843b;
        int i8 = i5 * i7;
        int i9 = i * i7;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                i11 += sArr[(i10 * i8) + i9 + i12];
            }
            this.i[i10] = (short) (i11 / i8);
        }
    }

    public final short[] c(short[] sArr, int i, int i5) {
        int length = sArr.length;
        int i6 = this.f4843b;
        int i7 = length / i6;
        return i + i5 <= i7 ? sArr : Arrays.copyOf(sArr, (((i7 * 3) / 2) + i5) * i6);
    }

    public final int d(short[] sArr, int i, int i5, int i6) {
        int i7 = i * this.f4843b;
        int i8 = 255;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i5 <= i6) {
            int iAbs = 0;
            for (int i12 = 0; i12 < i5; i12++) {
                iAbs += Math.abs(sArr[i7 + i12] - sArr[(i7 + i5) + i12]);
            }
            if (iAbs * i10 < i9 * i5) {
                i10 = i5;
                i9 = iAbs;
            }
            if (iAbs * i8 > i11 * i5) {
                i8 = i5;
                i11 = iAbs;
            }
            i5++;
        }
        this.f4861u = i9 / i10;
        this.f4862v = i11 / i8;
        return i10;
    }

    public final void f() {
        int i;
        int i5;
        int iD;
        int i6;
        int iRound;
        int iRound2;
        int i7;
        int i8;
        int i9;
        int i10;
        long j5;
        long j6;
        int i11 = this.f4853m;
        float f2 = this.f4844c;
        float f5 = this.f4845d;
        double d5 = f2 / f5;
        float f6 = this.f4846e * f5;
        int i12 = this.f4842a;
        int i13 = this.f4843b;
        int i14 = 0;
        int i15 = 1;
        if (d5 > 1.00001d || d5 < 0.99999d) {
            int i16 = this.f4851k;
            int i17 = this.f4849h;
            if (i16 >= i17) {
                int i18 = 0;
                while (true) {
                    int i19 = this.f4858r;
                    if (i19 > 0) {
                        int iMin = Math.min(i17, i19);
                        a(this.f4850j, i18, iMin);
                        this.f4858r -= iMin;
                        i18 += iMin;
                        i5 = i11;
                        i = i12;
                    } else {
                        short[] sArr = this.f4850j;
                        int i20 = i12 > 4000 ? i12 / 4000 : i15;
                        int i21 = this.f4848g;
                        int i22 = this.f4847f;
                        if (i13 == i15 && i20 == i15) {
                            iD = d(sArr, i18, i22, i21);
                            i5 = i11;
                            i = i12;
                        } else {
                            b(sArr, i18, i20);
                            i = i12;
                            i5 = i11;
                            short[] sArr2 = this.i;
                            int iD2 = d(sArr2, 0, i22 / i20, i21 / i20);
                            if (i20 != 1) {
                                int i23 = iD2 * i20;
                                int i24 = i20 * 4;
                                int i25 = i23 - i24;
                                int i26 = i23 + i24;
                                if (i25 >= i22) {
                                    i22 = i25;
                                }
                                if (i26 <= i21) {
                                    i21 = i26;
                                }
                                if (i13 == 1) {
                                    iD = d(sArr, i18, i22, i21);
                                } else {
                                    b(sArr, i18, 1);
                                    iD = d(sArr2, 0, i22, i21);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i27 = this.f4861u;
                        int i28 = this.f4862v;
                        if (i27 == 0 || (i6 = this.f4859s) == 0 || i28 > i27 * 3 || i27 * 2 <= this.f4860t * 3) {
                            i6 = iD;
                        }
                        this.f4860t = i27;
                        this.f4859s = iD;
                        if (d5 > 1.0d) {
                            short[] sArr3 = this.f4850j;
                            if (d5 >= 2.0d) {
                                double d6 = (((double) i6) / (d5 - 1.0d)) + this.f4863w;
                                iRound2 = (int) Math.round(d6);
                                this.f4863w = d6 - ((double) iRound2);
                            } else {
                                double d7 = (((2.0d - d5) * ((double) i6)) / (d5 - 1.0d)) + this.f4863w;
                                int iRound3 = (int) Math.round(d7);
                                this.f4858r = iRound3;
                                this.f4863w = d7 - ((double) iRound3);
                                iRound2 = i6;
                            }
                            short[] sArrC = c(this.f4852l, this.f4853m, iRound2);
                            this.f4852l = sArrC;
                            int i29 = i18;
                            e(iRound2, this.f4843b, sArrC, this.f4853m, sArr3, i29, sArr3, i18 + i6);
                            this.f4853m += iRound2;
                            i18 = i6 + iRound2 + i29;
                        } else {
                            int i30 = i18;
                            short[] sArr4 = this.f4850j;
                            if (d5 < 0.5d) {
                                double d8 = ((((double) i6) * d5) / (1.0d - d5)) + this.f4863w;
                                iRound = (int) Math.round(d8);
                                this.f4863w = d8 - ((double) iRound);
                            } else {
                                double d9 = ((((2.0d * d5) - 1.0d) * ((double) i6)) / (1.0d - d5)) + this.f4863w;
                                int iRound4 = (int) Math.round(d9);
                                this.f4858r = iRound4;
                                this.f4863w = d9 - ((double) iRound4);
                                iRound = i6;
                            }
                            int i31 = i6 + iRound;
                            short[] sArrC2 = c(this.f4852l, this.f4853m, i31);
                            this.f4852l = sArrC2;
                            System.arraycopy(sArr4, i30 * i13, sArrC2, this.f4853m * i13, i6 * i13);
                            e(iRound, this.f4843b, this.f4852l, this.f4853m + i6, sArr4, i30 + i6, sArr4, i30);
                            this.f4853m += i31;
                            i18 = i30 + iRound;
                        }
                    }
                    if (i18 + i17 > i16) {
                        break;
                    }
                    i12 = i;
                    i11 = i5;
                    i15 = 1;
                }
                int i32 = this.f4851k - i18;
                short[] sArr5 = this.f4850j;
                System.arraycopy(sArr5, i18 * i13, sArr5, 0, i32 * i13);
                this.f4851k = i32;
            }
            if (f6 != 1.0f || this.f4853m == (i7 = i5)) {
            }
            int i33 = i;
            long j7 = (long) (i33 / f6);
            long j8 = i33;
            while (j7 != 0 && j8 != 0 && j7 % 2 == 0 && j8 % 2 == 0) {
                j7 /= 2;
                j8 /= 2;
            }
            int i34 = this.f4853m - i7;
            short[] sArrC3 = c(this.f4854n, this.f4855o, i34);
            this.f4854n = sArrC3;
            System.arraycopy(this.f4852l, i7 * i13, sArrC3, this.f4855o * i13, i34 * i13);
            this.f4853m = i7;
            this.f4855o += i34;
            int i35 = 0;
            while (true) {
                i8 = this.f4855o;
                i9 = i8 - 1;
                if (i35 >= i9) {
                    break;
                }
                while (true) {
                    i10 = this.f4856p + 1;
                    j5 = i10;
                    long j9 = j5 * j7;
                    j6 = this.f4857q;
                    if (j9 <= j6 * j8) {
                        break;
                    }
                    this.f4852l = c(this.f4852l, this.f4853m, 1);
                    int i36 = i14;
                    while (i36 < i13) {
                        short[] sArr6 = this.f4852l;
                        int i37 = (this.f4853m * i13) + i36;
                        short[] sArr7 = this.f4854n;
                        int i38 = (i35 * i13) + i36;
                        short s4 = sArr7[i38];
                        short s5 = sArr7[i38 + i13];
                        long j10 = ((long) this.f4857q) * j8;
                        int i39 = this.f4856p;
                        long j11 = j8;
                        long j12 = ((long) (i39 + 1)) * j7;
                        long j13 = j12 - j10;
                        long j14 = j12 - (((long) i39) * j7);
                        sArr6[i37] = (short) ((((j14 - j13) * ((long) s5)) + (((long) s4) * j13)) / j14);
                        i36++;
                        j8 = j11;
                    }
                    this.f4857q++;
                    this.f4853m++;
                    j8 = j8;
                    i14 = 0;
                }
                long j15 = j8;
                this.f4856p = i10;
                if (j5 == j15) {
                    this.f4856p = 0;
                    AbstractC0360m.h(j6 == j7);
                    this.f4857q = 0;
                }
                i35++;
                j8 = j15;
                i14 = 0;
            }
            if (i9 == 0) {
                return;
            }
            short[] sArr8 = this.f4854n;
            System.arraycopy(sArr8, i9 * i13, sArr8, 0, (i8 - i9) * i13);
            this.f4855o -= i9;
            return;
        }
        a(this.f4850j, 0, this.f4851k);
        this.f4851k = 0;
        i5 = i11;
        i = i12;
        if (f6 != 1.0f) {
        }
    }
}
