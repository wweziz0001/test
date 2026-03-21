package Z0;

import F0.AbstractC0055b;
import a0.AbstractC0156G;
import a0.C0157H;
import android.util.Pair;
import d0.AbstractC0370w;
import d0.C0363p;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f2848a;

    static {
        int i = AbstractC0370w.f5326a;
        f2848a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static b a(int i, C0363p c0363p) {
        c0363p.H(i + 12);
        c0363p.I(1);
        b(c0363p);
        c0363p.I(2);
        int iV = c0363p.v();
        if ((iV & 128) != 0) {
            c0363p.I(2);
        }
        if ((iV & 64) != 0) {
            c0363p.I(c0363p.v());
        }
        if ((iV & 32) != 0) {
            c0363p.I(2);
        }
        c0363p.I(1);
        b(c0363p);
        String strE = AbstractC0156G.e(c0363p.v());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return new b(strE, null, -1L, -1L);
        }
        c0363p.I(4);
        long jX = c0363p.x();
        long jX2 = c0363p.x();
        c0363p.I(1);
        int iB = b(c0363p);
        byte[] bArr = new byte[iB];
        c0363p.g(bArr, 0, iB);
        return new b(strE, bArr, jX2 > 0 ? jX2 : -1L, jX > 0 ? jX : -1L);
    }

    public static int b(C0363p c0363p) {
        int iV = c0363p.v();
        int i = iV & 127;
        while ((iV & 128) == 128) {
            iV = c0363p.v();
            i = (i << 7) | (iV & 127);
        }
        return i;
    }

    public static int c(int i) {
        return (i >> 24) & 255;
    }

    public static e0.f d(C0363p c0363p) {
        long jP;
        long jP2;
        c0363p.H(8);
        if (c(c0363p.i()) == 0) {
            jP = c0363p.x();
            jP2 = c0363p.x();
        } else {
            jP = c0363p.p();
            jP2 = c0363p.p();
        }
        return new e0.f(jP, jP2, c0363p.x());
    }

    public static Pair e(C0363p c0363p, int i, int i5) throws C0157H {
        Integer num;
        u uVar;
        Pair pairCreate;
        int i6;
        int i7;
        byte[] bArr;
        int i8 = c0363p.f5314b;
        while (i8 - i < i5) {
            c0363p.H(i8);
            int i9 = c0363p.i();
            AbstractC0055b.e("childAtomSize must be positive", i9 > 0);
            if (c0363p.i() == 1936289382) {
                int i10 = i8 + 8;
                int i11 = 0;
                int i12 = -1;
                String strT = null;
                Integer numValueOf = null;
                while (i10 - i8 < i9) {
                    c0363p.H(i10);
                    int i13 = c0363p.i();
                    int i14 = c0363p.i();
                    if (i14 == 1718775137) {
                        numValueOf = Integer.valueOf(c0363p.i());
                    } else if (i14 == 1935894637) {
                        c0363p.I(4);
                        strT = c0363p.t(4, StandardCharsets.UTF_8);
                    } else if (i14 == 1935894633) {
                        i12 = i10;
                        i11 = i13;
                    }
                    i10 += i13;
                }
                if ("cenc".equals(strT) || "cbc1".equals(strT) || "cens".equals(strT) || "cbcs".equals(strT)) {
                    AbstractC0055b.e("frma atom is mandatory", numValueOf != null);
                    AbstractC0055b.e("schi atom is mandatory", i12 != -1);
                    int i15 = i12 + 8;
                    while (true) {
                        if (i15 - i12 >= i11) {
                            num = numValueOf;
                            uVar = null;
                            break;
                        }
                        c0363p.H(i15);
                        int i16 = c0363p.i();
                        if (c0363p.i() == 1952804451) {
                            int iC = c(c0363p.i());
                            c0363p.I(1);
                            if (iC == 0) {
                                c0363p.I(1);
                                i6 = 0;
                                i7 = 0;
                            } else {
                                int iV = c0363p.v();
                                int i17 = (iV & 240) >> 4;
                                i6 = iV & 15;
                                i7 = i17;
                            }
                            boolean z4 = c0363p.v() == 1;
                            int iV2 = c0363p.v();
                            byte[] bArr2 = new byte[16];
                            c0363p.g(bArr2, 0, 16);
                            if (z4 && iV2 == 0) {
                                int iV3 = c0363p.v();
                                byte[] bArr3 = new byte[iV3];
                                c0363p.g(bArr3, 0, iV3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            uVar = new u(z4, strT, iV2, bArr2, i7, i6, bArr);
                        } else {
                            i15 += i16;
                        }
                    }
                    AbstractC0055b.e("tenc atom is mandatory", uVar != null);
                    int i18 = AbstractC0370w.f5326a;
                    pairCreate = Pair.create(num, uVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i8 += i9;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0a0e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Z0.e f(d0.C0363p r61, int r62, int r63, java.lang.String r64, a0.C0186l r65, boolean r66) throws a0.C0157H {
        /*
            Method dump skipped, instruction units count: 3564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.h.f(d0.p, int, int, java.lang.String, a0.l, boolean):Z0.e");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b7, code lost:
    
        r25 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00db, code lost:
    
        r15 = -9223372036854775807L;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05c9 A[ADDED_TO_REGION, LOOP:14: B:246:0x05c9->B:250:0x05d4, LOOP_START, PHI: r17
      0x05c9: PHI (r17v7 int) = (r17v3 int), (r17v8 int) binds: [B:245:0x05c7, B:250:0x05d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0980 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x05bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList g(e0.b r75, F0.y r76, long r77, a0.C0186l r79, boolean r80, boolean r81, l2.d r82) {
        /*
            Method dump skipped, instruction units count: 2442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.h.g(e0.b, F0.y, long, a0.l, boolean, boolean, l2.d):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:283:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0657  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(d0.C0363p r45, int r46, int r47, int r48, int r49, int r50, a0.C0186l r51, Z0.e r52, int r53) throws a0.C0157H {
        /*
            Method dump skipped, instruction units count: 2357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.h.h(d0.p, int, int, int, int, int, a0.l, Z0.e, int):void");
    }
}
