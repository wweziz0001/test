package e0;

import D.C0015o;
import F0.M;
import d0.AbstractC0360m;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f5545a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f5546b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f5547c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f5548d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i, int i5, boolean[] zArr) {
        int i6 = i5 - i;
        AbstractC0360m.h(i6 >= 0);
        if (i6 == 0) {
            return i5;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        }
        if (i6 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        }
        if (i6 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a(zArr);
            return i - 1;
        }
        int i7 = i5 - 1;
        int i8 = i + 2;
        while (i8 < i7) {
            byte b4 = bArr[i8];
            if ((b4 & 254) == 0) {
                int i9 = i8 - 2;
                if (bArr[i9] == 0 && bArr[i8 - 1] == 0 && b4 == 1) {
                    a(zArr);
                    return i9;
                }
                i8 -= 2;
            }
            i8 += 3;
        }
        zArr[0] = i6 <= 2 ? !(i6 != 2 ? !(zArr[1] && bArr[i7] == 1) : !(zArr[2] && bArr[i5 + (-2)] == 0 && bArr[i7] == 1)) : bArr[i5 + (-3)] == 0 && bArr[i5 + (-2)] == 0 && bArr[i7] == 1;
        zArr[1] = i6 <= 1 ? zArr[2] && bArr[i7] == 0 : bArr[i5 + (-2)] == 0 && bArr[i7] == 0;
        zArr[2] = bArr[i7] == 0;
        return i5;
    }

    public static boolean c(byte b4) {
        if (((b4 & 96) >> 5) != 0) {
            return true;
        }
        int i = b4 & 31;
        return (i == 1 || i == 9 || i == 14) ? false : true;
    }

    public static C0015o d(M m4) {
        m4.t();
        int i = m4.i(6);
        int i5 = m4.i(6);
        m4.i(3);
        return new C0015o(i, i5, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e0.h e(F0.M r19, boolean r20, int r21, e0.h r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.i(r5)
            boolean r8 = r19.h()
            r9 = 5
            int r9 = r0.i(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r19.h()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.i(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.f5502a
            boolean r8 = r2.f5503b
            int r9 = r2.f5504c
            int r11 = r2.f5505d
            int[] r4 = r2.f5506e
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.i(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r19.h()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r19.h()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.u(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.u(r6)
        L7b:
            e0.h r0 = new e0.h
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.n.e(F0.M, boolean, int, e0.h):e0.h");
    }

    public static c4.i f(byte[] bArr, int i, int i5) {
        byte b4;
        int i6 = i + 2;
        do {
            i5--;
            b4 = bArr[i5];
            if (b4 != 0) {
                break;
            }
        } while (i5 > i6);
        if (b4 != 0 && i5 > i6) {
            M m4 = new M(bArr, i6, i5 + 1);
            while (m4.d(16)) {
                int i7 = m4.i(8);
                int i8 = 0;
                while (i7 == 255) {
                    i8 += 255;
                    i7 = m4.i(8);
                }
                int i9 = i8 + i7;
                int i10 = m4.i(8);
                int i11 = 0;
                while (i10 == 255) {
                    i11 += 255;
                    i10 = m4.i(8);
                }
                int i12 = i11 + i10;
                if (i12 == 0 || !m4.d(i12)) {
                    break;
                }
                if (i9 == 176) {
                    int iM = m4.m();
                    boolean zH = m4.h();
                    int iM2 = zH ? m4.m() : 0;
                    int iM3 = m4.m();
                    int iM4 = -1;
                    for (int i13 = 0; i13 <= iM3; i13++) {
                        iM4 = m4.m();
                        m4.m();
                        int i14 = m4.i(6);
                        if (i14 == 63) {
                            return null;
                        }
                        m4.i(i14 == 0 ? Math.max(0, iM - 30) : Math.max(0, (i14 + iM) - 31));
                        if (zH) {
                            int i15 = m4.i(6);
                            if (i15 == 63) {
                                return null;
                            }
                            m4.i(i15 == 0 ? Math.max(0, iM2 - 30) : Math.max(0, (i15 + iM2) - 31));
                        }
                        if (m4.h()) {
                            m4.u(10);
                        }
                    }
                    return new c4.i(iM4);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e0.j g(byte[] r30, int r31, int r32, Z1.i r33) {
        /*
            Method dump skipped, instruction units count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.n.g(byte[], int, int, Z1.i):e0.j");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x05af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Z1.i h(byte[] r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 2049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.n.h(byte[], int, int):Z1.i");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static e0.m i(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.n.i(byte[], int, int):e0.m");
    }

    public static void j(M m4) {
        int iM = m4.m() + 1;
        m4.u(8);
        for (int i = 0; i < iM; i++) {
            m4.m();
            m4.m();
            m4.t();
        }
        m4.u(20);
    }

    public static int k(int i, byte[] bArr) {
        int i5;
        synchronized (f5547c) {
            int i6 = 0;
            int i7 = 0;
            while (i6 < i) {
                while (true) {
                    if (i6 >= i - 2) {
                        i6 = i;
                        break;
                    }
                    try {
                        if (bArr[i6] == 0 && bArr[i6 + 1] == 0 && bArr[i6 + 2] == 3) {
                            break;
                        }
                        i6++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i6 < i) {
                    int[] iArr = f5548d;
                    if (iArr.length <= i7) {
                        f5548d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f5548d[i7] = i6;
                    i6 += 3;
                    i7++;
                }
            }
            i5 = i - i7;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i7; i10++) {
                int i11 = f5548d[i10] - i9;
                System.arraycopy(bArr, i9, bArr, i8, i11);
                int i12 = i8 + i11;
                int i13 = i12 + 1;
                bArr[i12] = 0;
                i8 = i12 + 2;
                bArr[i13] = 0;
                i9 += i11 + 3;
            }
            System.arraycopy(bArr, i9, bArr, i8, i5 - i8);
        }
        return i5;
    }
}
