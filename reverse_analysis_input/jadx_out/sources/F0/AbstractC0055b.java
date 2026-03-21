package F0;

import a0.C0155F;
import a0.C0157H;
import android.util.Base64;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0363p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: F0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0055b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f719a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f720b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f721c = {1, 2, 3, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f722d = {48000, 44100, 32000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f723e = {24000, 22050, 16000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f724f = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f725g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f726h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final int[] i = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f727j = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f728k = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f729l = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f730m = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f731n = {5, 8, 10, 12};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f732o = {6, 9, 12, 15};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f733p = {2, 4, 6, 8};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f734q = {9, 11, 13, 16};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f735r = {5, 8, 10, 12};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String[] f736s = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f737t = {44100, 48000, 32000};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f738u = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f739v = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f740w = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f741x = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] y = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static byte[] a(int i5, int i6) {
        int i7 = -1;
        for (int i8 = 0; i8 < 13; i8++) {
            if (i5 == f719a[i8]) {
                i7 = i8;
            }
        }
        int i9 = -1;
        for (int i10 = 0; i10 < 16; i10++) {
            if (i6 == f720b[i10]) {
                i9 = i10;
            }
        }
        if (i5 == -1 || i9 == -1) {
            throw new IllegalArgumentException(AbstractC0307a.g(i5, i6, "Invalid sample rate or number of channels: ", ", "));
        }
        return b(2, i7, i9);
    }

    public static byte[] b(int i5, int i6, int i7) {
        return new byte[]{(byte) (((i5 << 3) & 248) | ((i6 >> 1) & 7)), (byte) (((i6 << 7) & 128) | ((i7 << 3) & 120))};
    }

    public static ArrayList c(byte[] bArr) {
        long j5 = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j5).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(d0.C0363p r20, F0.w r21, int r22, F0.u r23) {
        /*
            r0 = r20
            r1 = r21
            r2 = 10
            r3 = 1
            int r4 = r0.f5314b
            long r5 = r20.x()
            r7 = 16
            long r7 = r5 >>> r7
            r9 = r22
            long r9 = (long) r9
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r10 = 0
            if (r9 == 0) goto L1a
            return r10
        L1a:
            r11 = 1
            long r7 = r7 & r11
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 != 0) goto L23
            r7 = r3
            goto L24
        L23:
            r7 = r10
        L24:
            r8 = 12
            long r13 = r5 >> r8
            r15 = 15
            long r13 = r13 & r15
            int r9 = (int) r13
            r13 = 8
            long r13 = r5 >> r13
            long r13 = r13 & r15
            int r13 = (int) r13
            r14 = 4
            long r17 = r5 >> r14
            long r14 = r17 & r15
            int r14 = (int) r14
            long r15 = r5 >> r3
            r17 = 7
            r19 = r9
            long r8 = r15 & r17
            int r8 = (int) r8
            long r5 = r5 & r11
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 != 0) goto L48
            r5 = r3
            goto L49
        L48:
            r5 = r10
        L49:
            r6 = 7
            if (r14 > r6) goto L52
            int r6 = r1.f827g
            int r6 = r6 - r3
            if (r14 != r6) goto Lc3
            goto L59
        L52:
            if (r14 > r2) goto Lc3
            int r6 = r1.f827g
            r9 = 2
            if (r6 != r9) goto Lc3
        L59:
            if (r8 != 0) goto L5c
            goto L60
        L5c:
            int r6 = r1.i
            if (r8 != r6) goto Lc3
        L60:
            if (r5 != 0) goto Lc3
            long r5 = r20.C()     // Catch: java.lang.NumberFormatException -> Lc3
            if (r7 == 0) goto L6b
        L68:
            r7 = r23
            goto L70
        L6b:
            int r7 = r1.f822b
            long r7 = (long) r7
            long r5 = r5 * r7
            goto L68
        L70:
            r7.f817a = r5
            r5 = r19
            int r5 = v(r5, r0)
            r6 = -1
            if (r5 == r6) goto Lc3
            int r6 = r1.f822b
            if (r5 > r6) goto Lc3
            if (r13 != 0) goto L82
            goto La7
        L82:
            r5 = 11
            if (r13 > r5) goto L8b
            int r1 = r1.f826f
            if (r13 != r1) goto Lc3
            goto La7
        L8b:
            int r1 = r1.f825e
            r5 = 12
            if (r13 != r5) goto L9a
            int r2 = r20.v()
            int r2 = r2 * 1000
            if (r2 != r1) goto Lc3
            goto La7
        L9a:
            r5 = 14
            if (r13 > r5) goto Lc3
            int r6 = r20.B()
            if (r13 != r5) goto La5
            int r6 = r6 * r2
        La5:
            if (r6 != r1) goto Lc3
        La7:
            int r1 = r20.v()
            int r2 = r0.f5314b
            byte[] r0 = r0.f5313a
            int r2 = r2 - r3
            int r5 = d0.AbstractC0370w.f5326a
            r5 = r10
        Lb3:
            if (r4 >= r2) goto Lc0
            r6 = r0[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 ^ r6
            int[] r6 = d0.AbstractC0370w.f5340p
            r5 = r6[r5]
            int r4 = r4 + r3
            goto Lb3
        Lc0:
            if (r1 != r5) goto Lc3
            goto Lc4
        Lc3:
            r3 = r10
        Lc4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.AbstractC0055b.d(d0.p, F0.w, int, F0.u):boolean");
    }

    public static void e(String str, boolean z4) throws C0157H {
        if (!z4) {
            throw C0157H.a(null, str);
        }
    }

    public static void f(long j5, C0363p c0363p, K[] kArr) {
        int i5;
        while (true) {
            if (c0363p.a() <= 1) {
                return;
            }
            int i6 = 0;
            while (true) {
                if (c0363p.a() == 0) {
                    i5 = -1;
                    break;
                }
                int iV = c0363p.v();
                i6 += iV;
                if (iV != 255) {
                    i5 = i6;
                    break;
                }
            }
            int i7 = 0;
            while (true) {
                if (c0363p.a() == 0) {
                    i7 = -1;
                    break;
                }
                int iV2 = c0363p.v();
                i7 += iV2;
                if (iV2 != 255) {
                    break;
                }
            }
            int i8 = c0363p.f5314b + i7;
            if (i7 == -1 || i7 > c0363p.a()) {
                AbstractC0360m.y("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i8 = c0363p.f5315c;
            } else if (i5 == 4 && i7 >= 8) {
                int iV3 = c0363p.v();
                int iB = c0363p.B();
                int i9 = iB == 49 ? c0363p.i() : 0;
                int iV4 = c0363p.v();
                if (iB == 47) {
                    c0363p.I(1);
                }
                boolean z4 = iV3 == 181 && (iB == 49 || iB == 47) && iV4 == 3;
                if (iB == 49) {
                    z4 &= i9 == 1195456820;
                }
                if (z4) {
                    g(j5, c0363p, kArr);
                }
            }
            c0363p.H(i8);
        }
    }

    public static void g(long j5, C0363p c0363p, K[] kArr) {
        int iV = c0363p.v();
        if ((iV & 64) != 0) {
            c0363p.I(1);
            int i5 = (iV & 31) * 3;
            int i6 = c0363p.f5314b;
            for (K k4 : kArr) {
                c0363p.H(i6);
                k4.a(c0363p, i5, 0);
                AbstractC0360m.h(j5 != -9223372036854775807L);
                k4.b(j5, 1, i5, 0, null);
            }
        }
    }

    public static int h(int i5, int i6) {
        int i7 = i6 / 2;
        if (i5 < 0 || i5 >= 3 || i6 < 0 || i7 >= 19) {
            return -1;
        }
        int i8 = f722d[i5];
        if (i8 == 44100) {
            return ((i6 % 2) + f726h[i7]) * 2;
        }
        int i9 = f725g[i7];
        return i8 == 32000 ? i9 * 6 : i9 * 4;
    }

    public static void i(int i5, C0363p c0363p) {
        c0363p.E(7);
        byte[] bArr = c0363p.f5313a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i5 >> 16) & 255);
        bArr[5] = (byte) ((i5 >> 8) & 255);
        bArr[6] = (byte) (i5 & 255);
    }

    public static int j(int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        if (!((i5 & (-2097152)) == -2097152) || (i6 = (i5 >>> 19) & 3) == 1 || (i7 = (i5 >>> 17) & 3) == 0 || (i8 = (i5 >>> 12) & 15) == 0 || i8 == 15 || (i9 = (i5 >>> 10) & 3) == 3) {
            return -1;
        }
        int i10 = f737t[i9];
        if (i6 == 2) {
            i10 /= 2;
        } else if (i6 == 0) {
            i10 /= 4;
        }
        int i11 = (i5 >>> 9) & 1;
        if (i7 == 3) {
            return ((((i6 == 3 ? f738u[i8 - 1] : f739v[i8 - 1]) * 12) / i10) + i11) * 4;
        }
        int i12 = i6 == 3 ? i7 == 2 ? f740w[i8 - 1] : f741x[i8 - 1] : y[i8 - 1];
        if (i6 == 3) {
            return ((i12 * 144) / i10) + i11;
        }
        return (((i7 == 1 ? 72 : 144) * i12) / i10) + i11;
    }

    public static M k(byte[] bArr) {
        byte b4 = bArr[0];
        if (b4 == 127 || b4 == 100 || b4 == 64 || b4 == 113) {
            return new M(bArr.length, bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b5 = bArrCopyOf[0];
        if (b5 == -2 || b5 == -1 || b5 == 37 || b5 == -14 || b5 == -24) {
            for (int i5 = 0; i5 < bArrCopyOf.length - 1; i5 += 2) {
                byte b6 = bArrCopyOf[i5];
                int i6 = i5 + 1;
                bArrCopyOf[i5] = bArrCopyOf[i6];
                bArrCopyOf[i6] = b6;
            }
        }
        M m4 = new M(bArrCopyOf.length, bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            M m5 = new M(bArrCopyOf.length, bArrCopyOf);
            while (m5.b() >= 16) {
                m5.u(2);
                int i7 = m5.i(14) & 16383;
                int iMin = Math.min(8 - m4.f713d, 14);
                int i8 = m4.f713d;
                int i9 = (8 - i8) - iMin;
                byte[] bArr2 = m4.f711b;
                int i10 = m4.f712c;
                byte b7 = (byte) (((65280 >> i8) | ((1 << i9) - 1)) & bArr2[i10]);
                bArr2[i10] = b7;
                int i11 = 14 - iMin;
                bArr2[i10] = (byte) (b7 | ((i7 >>> i11) << i9));
                int i12 = i10 + 1;
                while (i11 > 8) {
                    m4.f711b[i12] = (byte) (i7 >>> (i11 - 8));
                    i11 -= 8;
                    i12++;
                }
                int i13 = 8 - i11;
                byte[] bArr3 = m4.f711b;
                byte b8 = (byte) (bArr3[i12] & ((1 << i13) - 1));
                bArr3[i12] = b8;
                bArr3[i12] = (byte) (((i7 & ((1 << i11) - 1)) << i13) | b8);
                m4.u(14);
                m4.a();
            }
        }
        m4.p(bArrCopyOf.length, bArrCopyOf);
        return m4;
    }

    public static long l(byte b4, byte b5) {
        int i5;
        int i6 = b4 & 255;
        int i7 = b4 & 3;
        if (i7 != 0) {
            i5 = 2;
            if (i7 != 1 && i7 != 2) {
                i5 = b5 & 63;
            }
        } else {
            i5 = 1;
        }
        int i8 = i6 >> 3;
        int i9 = i8 & 3;
        return ((long) i5) * ((long) (i8 >= 16 ? 2500 << i9 : i8 >= 12 ? 10000 << (i8 & 1) : i9 == 3 ? 60000 : 10000 << i9));
    }

    public static int m(M m4) throws C0157H {
        int i5 = m4.i(4);
        if (i5 == 15) {
            if (m4.b() >= 24) {
                return m4.i(24);
            }
            throw C0157H.a(null, "AAC header insufficient data");
        }
        if (i5 < 13) {
            return f719a[i5];
        }
        throw C0157H.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static int n(int i5) {
        int i6 = 0;
        while (i5 > 0) {
            i6++;
            i5 >>>= 1;
        }
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static F0.C0056c o(F0.M r21) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.AbstractC0055b.o(F0.M):F0.c");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static D0.e p(F0.M r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L47
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L47
            r9.u(r1)
        L47:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.i(r3)
            int[] r8 = F0.AbstractC0055b.i
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L8b
            r7 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r8) goto L83
            if (r9 != r7) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r8) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            D0.e r1 = new D0.e
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.AbstractC0055b.p(F0.M):D0.e");
    }

    public static C0054a q(M m4, boolean z4) throws C0157H {
        int i5 = m4.i(5);
        if (i5 == 31) {
            i5 = m4.i(6) + 32;
        }
        int iM = m(m4);
        int i6 = m4.i(4);
        String strI = AbstractC0307a.i("mp4a.40.", i5);
        if (i5 == 5 || i5 == 29) {
            iM = m(m4);
            int i7 = m4.i(5);
            if (i7 == 31) {
                i7 = m4.i(6) + 32;
            }
            i5 = i7;
            if (i5 == 22) {
                i6 = m4.i(4);
            }
        }
        if (z4) {
            if (i5 != 1 && i5 != 2 && i5 != 3 && i5 != 4 && i5 != 6 && i5 != 7 && i5 != 17) {
                switch (i5) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C0157H.c("Unsupported audio object type: " + i5);
                }
            }
            if (m4.h()) {
                AbstractC0360m.y("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (m4.h()) {
                m4.u(14);
            }
            boolean zH = m4.h();
            if (i6 == 0) {
                throw new UnsupportedOperationException();
            }
            if (i5 == 6 || i5 == 20) {
                m4.u(3);
            }
            if (zH) {
                if (i5 == 22) {
                    m4.u(16);
                }
                if (i5 == 17 || i5 == 19 || i5 == 20 || i5 == 23) {
                    m4.u(3);
                }
                m4.u(1);
            }
            switch (i5) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int i8 = m4.i(2);
                    if (i8 == 2 || i8 == 3) {
                        throw C0157H.c("Unsupported epConfig: " + i8);
                    }
                    break;
            }
        }
        int i9 = f720b[i6];
        if (i9 != -1) {
            return new C0054a(iM, strI, i9);
        }
        throw C0157H.a(null, null);
    }

    public static void r(M m4, C0057d c0057d) throws C0157H {
        int i5 = m4.i(5);
        m4.u(2);
        if (m4.h()) {
            m4.u(5);
        }
        if (i5 >= 7 && i5 <= 10) {
            m4.t();
        }
        if (m4.h()) {
            int i6 = m4.i(3);
            if (c0057d.f748a == -1 && i5 >= 0 && i5 <= 15 && (i6 == 0 || i6 == 1)) {
                c0057d.f748a = i5;
            }
            if (m4.h()) {
                y(m4);
            }
        }
    }

    public static void s(M m4, C0057d c0057d) throws C0157H {
        m4.u(2);
        boolean zH = m4.h();
        int i5 = m4.i(8);
        for (int i6 = 0; i6 < i5; i6++) {
            m4.u(2);
            if (m4.h()) {
                m4.u(5);
            }
            if (zH) {
                m4.u(24);
            } else {
                if (m4.h()) {
                    if (!m4.h()) {
                        m4.u(4);
                    }
                    c0057d.f749b = m4.i(6) + 1;
                }
                m4.u(4);
            }
        }
        if (m4.h()) {
            m4.u(3);
            if (m4.h()) {
                y(m4);
            }
        }
    }

    public static int t(M m4, int[] iArr) {
        int i5 = 0;
        for (int i6 = 0; i6 < 3 && m4.h(); i6++) {
            i5++;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            i7 += 1 << iArr[i8];
        }
        return m4.i(iArr[i5]) + i7;
    }

    public static C0155F u(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < list.size(); i5++) {
            String str = (String) list.get(i5);
            int i6 = AbstractC0370w.f5326a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                AbstractC0360m.y("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(R0.a.d(new C0363p(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e5) {
                    AbstractC0360m.z("VorbisUtil", "Failed to parse vorbis picture", e5);
                }
            } else {
                arrayList.add(new W0.a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C0155F(arrayList);
    }

    public static int v(int i5, C0363p c0363p) {
        switch (i5) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i5 - 2);
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return c0363p.v() + 1;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return c0363p.B() + 1;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i5 - 8);
            default:
                return -1;
        }
    }

    public static Z1.l w(C0363p c0363p) {
        c0363p.I(1);
        int iY = c0363p.y();
        long j5 = ((long) c0363p.f5314b) + ((long) iY);
        int i5 = iY / 18;
        long[] jArrCopyOf = new long[i5];
        long[] jArrCopyOf2 = new long[i5];
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                break;
            }
            long jP = c0363p.p();
            if (jP == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i6);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i6);
                break;
            }
            jArrCopyOf[i6] = jP;
            jArrCopyOf2[i6] = c0363p.p();
            c0363p.I(2);
            i6++;
        }
        c0363p.I((int) (j5 - ((long) c0363p.f5314b)));
        return new Z1.l(jArrCopyOf, jArrCopyOf2);
    }

    public static B0.d x(C0363p c0363p, boolean z4, boolean z5) throws C0157H {
        if (z4) {
            z(3, c0363p, false);
        }
        c0363p.t((int) c0363p.m(), StandardCharsets.UTF_8);
        long jM = c0363p.m();
        String[] strArr = new String[(int) jM];
        for (int i5 = 0; i5 < jM; i5++) {
            strArr[i5] = c0363p.t((int) c0363p.m(), StandardCharsets.UTF_8);
        }
        if (z5 && (c0363p.v() & 1) == 0) {
            throw C0157H.a(null, "framing bit expected to be set");
        }
        return new B0.d(strArr);
    }

    public static void y(M m4) throws C0157H {
        int i5 = m4.i(6);
        if (i5 < 2 || i5 > 42) {
            throw C0157H.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(i5)));
        }
        m4.u(i5 * 8);
    }

    public static boolean z(int i5, C0363p c0363p, boolean z4) throws C0157H {
        if (c0363p.a() < 7) {
            if (z4) {
                return false;
            }
            throw C0157H.a(null, "too short header: " + c0363p.a());
        }
        if (c0363p.v() != i5) {
            if (z4) {
                return false;
            }
            throw C0157H.a(null, "expected header type " + Integer.toHexString(i5));
        }
        if (c0363p.v() == 118 && c0363p.v() == 111 && c0363p.v() == 114 && c0363p.v() == 98 && c0363p.v() == 105 && c0363p.v() == 115) {
            return true;
        }
        if (z4) {
            return false;
        }
        throw C0157H.a(null, "expected characters 'vorbis'");
    }
}
