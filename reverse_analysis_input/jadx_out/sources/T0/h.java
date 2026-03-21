package T0;

import F0.M;
import Q1.C;
import a.AbstractC0149a;
import a0.AbstractC0156G;
import a0.C0155F;
import d0.AbstractC0370w;
import d0.C0363p;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import m2.C0639F;
import m2.I;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B0.l f2122d = new B0.l(20);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B0.l f2123c;

    public h(B0.l lVar) {
        this.f2123c = lVar;
    }

    public static a F0(C0363p c0363p, int i, int i5) {
        int iX0;
        String strConcat;
        int iV = c0363p.v();
        Charset charsetU0 = U0(iV);
        int i6 = i - 1;
        byte[] bArr = new byte[i6];
        c0363p.g(bArr, 0, i6);
        if (i5 == 2) {
            strConcat = "image/" + AbstractC0149a.I(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(strConcat)) {
                strConcat = "image/jpeg";
            }
            iX0 = 2;
        } else {
            iX0 = X0(0, bArr);
            String strI = AbstractC0149a.I(new String(bArr, 0, iX0, StandardCharsets.ISO_8859_1));
            strConcat = strI.indexOf(47) == -1 ? "image/".concat(strI) : strI;
        }
        int i7 = bArr[iX0 + 1] & 255;
        int i8 = iX0 + 2;
        int iW0 = W0(bArr, i8, iV);
        String str = new String(bArr, i8, iW0 - i8, charsetU0);
        int iT0 = T0(iV) + iW0;
        return new a(strConcat, str, i7, i6 <= iT0 ? AbstractC0370w.f5331f : Arrays.copyOfRange(bArr, iT0, i6));
    }

    public static c G0(C0363p c0363p, int i, int i5, boolean z4, int i6, B0.l lVar) {
        int i7 = c0363p.f5314b;
        int iX0 = X0(i7, c0363p.f5313a);
        String str = new String(c0363p.f5313a, i7, iX0 - i7, StandardCharsets.ISO_8859_1);
        c0363p.H(iX0 + 1);
        int i8 = c0363p.i();
        int i9 = c0363p.i();
        long jX = c0363p.x();
        long j5 = jX == 4294967295L ? -1L : jX;
        long jX2 = c0363p.x();
        long j6 = jX2 == 4294967295L ? -1L : jX2;
        ArrayList arrayList = new ArrayList();
        int i10 = i7 + i;
        while (c0363p.f5314b < i10) {
            i iVarJ0 = J0(i5, c0363p, z4, i6, lVar);
            if (iVarJ0 != null) {
                arrayList.add(iVarJ0);
            }
        }
        return new c(str, i8, i9, j5, j6, (i[]) arrayList.toArray(new i[0]));
    }

    public static d H0(C0363p c0363p, int i, int i5, boolean z4, int i6, B0.l lVar) {
        int i7 = c0363p.f5314b;
        int iX0 = X0(i7, c0363p.f5313a);
        String str = new String(c0363p.f5313a, i7, iX0 - i7, StandardCharsets.ISO_8859_1);
        c0363p.H(iX0 + 1);
        int iV = c0363p.v();
        boolean z5 = (iV & 2) != 0;
        boolean z6 = (iV & 1) != 0;
        int iV2 = c0363p.v();
        String[] strArr = new String[iV2];
        for (int i8 = 0; i8 < iV2; i8++) {
            int i9 = c0363p.f5314b;
            int iX02 = X0(i9, c0363p.f5313a);
            strArr[i8] = new String(c0363p.f5313a, i9, iX02 - i9, StandardCharsets.ISO_8859_1);
            c0363p.H(iX02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i10 = i7 + i;
        while (c0363p.f5314b < i10) {
            i iVarJ0 = J0(i5, c0363p, z4, i6, lVar);
            if (iVarJ0 != null) {
                arrayList.add(iVarJ0);
            }
        }
        return new d(str, z5, z6, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    public static e I0(int i, C0363p c0363p) {
        if (i < 4) {
            return null;
        }
        int iV = c0363p.v();
        Charset charsetU0 = U0(iV);
        byte[] bArr = new byte[3];
        c0363p.g(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i5 = i - 4;
        byte[] bArr2 = new byte[i5];
        c0363p.g(bArr2, 0, i5);
        int iW0 = W0(bArr2, 0, iV);
        String str2 = new String(bArr2, 0, iW0, charsetU0);
        int iT0 = T0(iV) + iW0;
        return new e(str, str2, N0(bArr2, iT0, W0(bArr2, iT0, iV), charsetU0));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01fe A[Catch: all -> 0x012a, Exception -> 0x01cd, OutOfMemoryError -> 0x01cf, TRY_LEAVE, TryCatch #2 {all -> 0x012a, blocks: (B:106:0x0123, B:115:0x0135, B:122:0x014a, B:124:0x0151, B:132:0x016a, B:141:0x0181, B:152:0x019b, B:159:0x01ac, B:167:0x01c8, B:177:0x01db, B:185:0x01f9, B:186:0x01fe), top: B:197:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static T0.i J0(int r18, d0.C0363p r19, boolean r20, int r21, B0.l r22) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.h.J0(int, d0.p, boolean, int, B0.l):T0.i");
    }

    public static f K0(int i, C0363p c0363p) {
        int iV = c0363p.v();
        Charset charsetU0 = U0(iV);
        int i5 = i - 1;
        byte[] bArr = new byte[i5];
        c0363p.g(bArr, 0, i5);
        int iX0 = X0(0, bArr);
        String strM = AbstractC0156G.m(new String(bArr, 0, iX0, StandardCharsets.ISO_8859_1));
        int i6 = iX0 + 1;
        int iW0 = W0(bArr, i6, iV);
        String strN0 = N0(bArr, i6, iW0, charsetU0);
        int iT0 = T0(iV) + iW0;
        int iW02 = W0(bArr, iT0, iV);
        String strN02 = N0(bArr, iT0, iW02, charsetU0);
        int iT02 = T0(iV) + iW02;
        return new f(strM, strN0, strN02, i5 <= iT02 ? AbstractC0370w.f5331f : Arrays.copyOfRange(bArr, iT02, i5));
    }

    public static l L0(int i, C0363p c0363p) {
        int iB = c0363p.B();
        int iY = c0363p.y();
        int iY2 = c0363p.y();
        int iV = c0363p.v();
        int iV2 = c0363p.v();
        M m4 = new M();
        m4.q(c0363p);
        int i5 = ((i - 10) * 8) / (iV + iV2);
        int[] iArr = new int[i5];
        int[] iArr2 = new int[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = m4.i(iV);
            int i8 = m4.i(iV2);
            iArr[i6] = i7;
            iArr2[i6] = i8;
        }
        return new l(iB, iY, iY2, iArr, iArr2);
    }

    public static m M0(int i, C0363p c0363p) {
        byte[] bArr = new byte[i];
        c0363p.g(bArr, 0, i);
        int iX0 = X0(0, bArr);
        String str = new String(bArr, 0, iX0, StandardCharsets.ISO_8859_1);
        int i5 = iX0 + 1;
        return new m(str, i <= i5 ? AbstractC0370w.f5331f : Arrays.copyOfRange(bArr, i5, i));
    }

    public static String N0(byte[] bArr, int i, int i5, Charset charset) {
        return (i5 <= i || i5 > bArr.length) ? "" : new String(bArr, i, i5 - i, charset);
    }

    public static n O0(int i, C0363p c0363p, String str) {
        if (i < 1) {
            return null;
        }
        int iV = c0363p.v();
        int i5 = i - 1;
        byte[] bArr = new byte[i5];
        c0363p.g(bArr, 0, i5);
        return new n(str, null, P0(bArr, iV, 0));
    }

    public static b0 P0(byte[] bArr, int i, int i5) {
        if (i5 >= bArr.length) {
            return I.u("");
        }
        C0639F c0639fN = I.n();
        int iW0 = W0(bArr, i5, i);
        while (i5 < iW0) {
            c0639fN.a(new String(bArr, i5, iW0 - i5, U0(i)));
            i5 = T0(i) + iW0;
            iW0 = W0(bArr, i5, i);
        }
        b0 b0VarG = c0639fN.g();
        return b0VarG.isEmpty() ? I.u("") : b0VarG;
    }

    public static n Q0(int i, C0363p c0363p) {
        if (i < 1) {
            return null;
        }
        int iV = c0363p.v();
        int i5 = i - 1;
        byte[] bArr = new byte[i5];
        c0363p.g(bArr, 0, i5);
        int iW0 = W0(bArr, 0, iV);
        return new n("TXXX", new String(bArr, 0, iW0, U0(iV)), P0(bArr, iV, T0(iV) + iW0));
    }

    public static o R0(int i, C0363p c0363p, String str) {
        byte[] bArr = new byte[i];
        c0363p.g(bArr, 0, i);
        return new o(str, null, new String(bArr, 0, X0(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static o S0(int i, C0363p c0363p) {
        if (i < 1) {
            return null;
        }
        int iV = c0363p.v();
        int i5 = i - 1;
        byte[] bArr = new byte[i5];
        c0363p.g(bArr, 0, i5);
        int iW0 = W0(bArr, 0, iV);
        String str = new String(bArr, 0, iW0, U0(iV));
        int iT0 = T0(iV) + iW0;
        return new o("WXXX", str, N0(bArr, iT0, X0(iT0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int T0(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset U0(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    public static String V0(int i, int i5, int i6, int i7, int i8) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
    }

    public static int W0(byte[] bArr, int i, int i5) {
        int iX0 = X0(i, bArr);
        if (i5 == 0 || i5 == 3) {
            return iX0;
        }
        while (iX0 < bArr.length - 1) {
            if ((iX0 - i) % 2 == 0 && bArr[iX0 + 1] == 0) {
                return iX0;
            }
            iX0 = X0(iX0 + 1, bArr);
        }
        return bArr.length;
    }

    public static int X0(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int Y0(int i, C0363p c0363p) {
        byte[] bArr = c0363p.f5313a;
        int i5 = c0363p.f5314b;
        int i6 = i5;
        while (true) {
            int i7 = i6 + 1;
            if (i7 >= i5 + i) {
                return i;
            }
            if ((bArr[i6] & 255) == 255 && bArr[i7] == 0) {
                System.arraycopy(bArr, i6 + 2, bArr, i7, (i - (i6 - i5)) - 2);
                i--;
            }
            i6 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007a A[PHI: r3
      0x007a: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:42:0x0087, B:33:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean Z0(d0.C0363p r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f5314b
        L6:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L23
            int r7 = r18.i()     // Catch: java.lang.Throwable -> L20
            long r8 = r18.x()     // Catch: java.lang.Throwable -> L20
            int r10 = r18.B()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto Lb0
        L23:
            int r7 = r18.y()     // Catch: java.lang.Throwable -> L20
            int r8 = r18.y()     // Catch: java.lang.Throwable -> L20
            long r8 = (long) r8
            r10 = r6
        L2d:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 != 0) goto L3b
            r1.H(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6c
            if (r21 != 0) goto L6c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4c
            r1.H(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6c:
            if (r0 != r7) goto L7c
            r3 = r10 & 64
            if (r3 == 0) goto L74
            r3 = r4
            goto L75
        L74:
            r3 = r6
        L75:
            r7 = r10 & 1
            if (r7 == 0) goto L7a
            goto L8c
        L7a:
            r4 = r6
            goto L8c
        L7c:
            if (r0 != r3) goto L8a
            r3 = r10 & 32
            if (r3 == 0) goto L84
            r3 = r4
            goto L85
        L84:
            r3 = r6
        L85:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L7a
            goto L8c
        L8a:
            r3 = r6
            r4 = r3
        L8c:
            if (r4 == 0) goto L90
            int r3 = r3 + 4
        L90:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L99
            r1.H(r2)
            return r6
        L99:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> L20
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La6
            r1.H(r2)
            return r6
        La6:
            int r3 = (int) r8
            r1.I(r3)     // Catch: java.lang.Throwable -> L20
            goto L6
        Lac:
            r1.H(r2)
            return r4
        Lb0:
            r1.H(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.h.Z0(d0.p, int, int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a0.C0155F E0(int r13, byte[] r14) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.h.E0(int, byte[]):a0.F");
    }

    @Override // Q1.C
    public final C0155F n(O0.a aVar, ByteBuffer byteBuffer) {
        return E0(byteBuffer.limit(), byteBuffer.array());
    }
}
