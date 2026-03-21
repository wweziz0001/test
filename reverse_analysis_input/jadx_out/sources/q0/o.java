package q0;

import D.C0015o;
import F0.M;
import a0.AbstractC0156G;
import a0.C0181g;
import a0.C0190p;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import b3.AbstractC0307a;
import d0.AbstractC0349b;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import h0.C0459j;
import java.util.List;
import java.util.Objects;
import m2.C0639F;
import m2.I;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f9291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9295h;
    public final boolean i;

    public o(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.f9288a = str;
        this.f9289b = str2;
        this.f9290c = str3;
        this.f9291d = codecCapabilities;
        this.f9294g = z4;
        this.f9292e = z5;
        this.f9293f = z6;
        this.f9295h = z7;
        this.i = AbstractC0156G.l(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i5, double d5) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(AbstractC0370w.f(i, widthAlignment) * widthAlignment, AbstractC0370w.f(i5, heightAlignment) * heightAlignment);
        int i6 = point.x;
        int i7 = point.y;
        return (d5 == -1.0d || d5 < 1.0d) ? videoCapabilities.isSizeSupported(i6, i7) : videoCapabilities.areSizeAndRateSupported(i6, i7, Math.floor(d5));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static q0.o h(java.lang.String r10, java.lang.String r11, java.lang.String r12, android.media.MediaCodecInfo.CodecCapabilities r13, boolean r14, boolean r15, boolean r16, boolean r17) {
        /*
            r1 = r10
            r4 = r13
            q0.o r9 = new q0.o
            r0 = 0
            r2 = 1
            if (r4 == 0) goto L3b
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r13.isFeatureSupported(r3)
            if (r3 == 0) goto L3b
            int r3 = d0.AbstractC0370w.f5326a
            r5 = 22
            if (r3 > r5) goto L39
            java.lang.String r3 = d0.AbstractC0370w.f5329d
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L28
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L39
        L28:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L3b
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L39
            goto L3b
        L39:
            r6 = r2
            goto L3c
        L3b:
            r6 = r0
        L3c:
            if (r4 == 0) goto L44
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r13.isFeatureSupported(r3)
        L44:
            if (r17 != 0) goto L53
            if (r4 == 0) goto L51
            java.lang.String r3 = "secure-playback"
            boolean r3 = r13.isFeatureSupported(r3)
            if (r3 == 0) goto L51
            goto L53
        L51:
            r7 = r0
            goto L54
        L53:
            r7 = r2
        L54:
            int r3 = d0.AbstractC0370w.f5326a
            r5 = 35
            if (r3 < r5) goto L66
            if (r4 == 0) goto L66
            java.lang.String r3 = "detached-surface"
            boolean r3 = r13.isFeatureSupported(r3)
            if (r3 == 0) goto L66
            r8 = r2
            goto L67
        L66:
            r8 = r0
        L67:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.o.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):q0.o");
    }

    public final C0459j b(C0190p c0190p, C0190p c0190p2) {
        String str = c0190p.f3424n;
        String str2 = c0190p2.f3424n;
        int i = AbstractC0370w.f5326a;
        int i5 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.i) {
            if (c0190p.f3434x != c0190p2.f3434x) {
                i5 |= 1024;
            }
            if (!this.f9292e && (c0190p.f3431u != c0190p2.f3431u || c0190p.f3432v != c0190p2.f3432v)) {
                i5 |= 512;
            }
            C0181g c0181g = c0190p.f3401B;
            boolean zE = C0181g.e(c0181g);
            C0181g c0181g2 = c0190p2.f3401B;
            if ((!zE || !C0181g.e(c0181g2)) && !Objects.equals(c0181g, c0181g2)) {
                i5 |= 2048;
            }
            if (AbstractC0370w.f5329d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f9288a) && !c0190p.c(c0190p2)) {
                i5 |= 2;
            }
            if (i5 == 0) {
                return new C0459j(this.f9288a, c0190p, c0190p2, c0190p.c(c0190p2) ? 3 : 2, 0);
            }
        } else {
            if (c0190p.f3402C != c0190p2.f3402C) {
                i5 |= 4096;
            }
            if (c0190p.f3403D != c0190p2.f3403D) {
                i5 |= 8192;
            }
            if (c0190p.f3404E != c0190p2.f3404E) {
                i5 |= 16384;
            }
            String str3 = this.f9289b;
            if (i5 == 0 && "audio/mp4a-latm".equals(str3)) {
                Pair pairD = y.d(c0190p);
                Pair pairD2 = y.d(c0190p2);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C0459j(this.f9288a, c0190p, c0190p2, 3, 0);
                    }
                }
            }
            if (!c0190p.c(c0190p2)) {
                i5 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i5 |= 2;
            }
            if (i5 == 0) {
                return new C0459j(this.f9288a, c0190p, c0190p2, 1, 0);
            }
        }
        return new C0459j(this.f9288a, c0190p, c0190p2, 0, i5);
    }

    public final boolean c(C0190p c0190p, boolean z4) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pair;
        String strB;
        Pair pairC;
        int i = 4;
        int i5 = 3;
        Pair pairD = y.d(c0190p);
        String str = this.f9290c;
        int i6 = 1;
        String str2 = c0190p.f3424n;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strM = AbstractC0156G.m(str);
            if (strM.equals("video/mv-hevc")) {
                return true;
            }
            if (strM.equals("video/hevc")) {
                List list = c0190p.f3427q;
                int i7 = 0;
                loop0: while (true) {
                    if (i7 >= list.size()) {
                        pair = null;
                        strB = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i7);
                    int length = bArr.length;
                    if (length > i5) {
                        boolean[] zArr = new boolean[i5];
                        C0639F c0639fN = I.n();
                        int i8 = 0;
                        while (i8 < bArr.length) {
                            int iB = e0.n.b(bArr, i8, bArr.length, zArr);
                            if (iB != bArr.length) {
                                c0639fN.a(Integer.valueOf(iB));
                            }
                            i8 = iB + 3;
                        }
                        b0 b0VarG = c0639fN.g();
                        int i9 = 0;
                        while (i9 < b0VarG.size()) {
                            if (((Integer) b0VarG.get(i9)).intValue() + i5 < length) {
                                M m4 = new M(bArr, ((Integer) b0VarG.get(i9)).intValue() + i5, length);
                                C0015o c0015oD = e0.n.d(m4);
                                if (c0015oD.f360b == 33 && c0015oD.f361c == 0) {
                                    m4.u(4);
                                    int i10 = m4.i(3);
                                    m4.t();
                                    pair = null;
                                    e0.h hVarE = e0.n.e(m4, true, i10, null);
                                    strB = AbstractC0349b.b(hVarE.f5502a, hVarE.f5503b, hVarE.f5504c, hVarE.f5505d, hVarE.f5506e, hVarE.f5507f);
                                    break loop0;
                                }
                                i5 = 3;
                            }
                            i9++;
                            i6 = 1;
                        }
                    }
                    int i11 = i6;
                    i7 += i11;
                    i6 = i11;
                }
                if (strB == null) {
                    pairC = pair;
                } else {
                    String strTrim = strB.trim();
                    int i12 = AbstractC0370w.f5326a;
                    pairC = AbstractC0349b.c(strB, strTrim.split("\\.", -1), c0190p.f3401B);
                }
                pairD = pairC;
            }
        }
        if (pairD == null) {
            return true;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        int iIntValue2 = ((Integer) pairD.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(str2);
        String str3 = this.f9289b;
        if (zEquals) {
            if ("video/avc".equals(str3)) {
                iIntValue = 8;
            } else if ("video/hevc".equals(str3)) {
                iIntValue = 2;
            }
            iIntValue2 = 0;
        }
        if (!this.i && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f9291d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (AbstractC0370w.f5326a <= 23 && "video/x-vnd.on2.vp9".equals(str3) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i = 1024;
            } else if (iIntValue3 >= 120000000) {
                i = 512;
            } else if (iIntValue3 >= 60000000) {
                i = 256;
            } else if (iIntValue3 >= 30000000) {
                i = 128;
            } else if (iIntValue3 >= 18000000) {
                i = 64;
            } else if (iIntValue3 >= 12000000) {
                i = 32;
            } else if (iIntValue3 >= 7200000) {
                i = 16;
            } else if (iIntValue3 >= 3600000) {
                i = 8;
            } else if (iIntValue3 < 1800000) {
                i = iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z4)) {
                if (!"video/hevc".equals(str3) || 2 != iIntValue) {
                    return true;
                }
                String str4 = AbstractC0370w.f5327b;
                if (!"sailfish".equals(str4) && !"marlin".equals(str4)) {
                    return true;
                }
            }
        }
        g("codec.profileLevel, " + c0190p.f3421k + ", " + str);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(a0.C0190p r8) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.o.d(a0.p):boolean");
    }

    public final boolean e(C0190p c0190p) {
        if (this.i) {
            return this.f9292e;
        }
        Pair pairD = y.d(c0190p);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(int r12, int r13, double r14) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.o.f(int, int, double):boolean");
    }

    public final void g(String str) {
        StringBuilder sbM = AbstractC0307a.m("NoSupport [", str, "] [");
        sbM.append(this.f9288a);
        sbM.append(", ");
        sbM.append(this.f9289b);
        sbM.append("] [");
        sbM.append(AbstractC0370w.f5330e);
        sbM.append("]");
        AbstractC0360m.k("MediaCodecInfo", sbM.toString());
    }

    public final String toString() {
        return this.f9288a;
    }
}
