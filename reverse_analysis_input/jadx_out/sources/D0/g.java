package D0;

import a.AbstractC0149a;
import a0.AbstractC0156G;
import a0.AbstractC0169U;
import a0.C0167S;
import a0.C0181g;
import a0.C0189o;
import a0.C0190p;
import a0.e0;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.lifecycle.E;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0364q;
import d0.C0365r;
import d0.C0367t;
import h0.C0446E;
import h0.C0449H;
import h0.C0458i;
import h0.C0459j;
import h0.C0464o;
import h0.q0;
import h0.r0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import m2.b0;
import q2.EnumC0743a;
import x0.H;

/* JADX INFO: loaded from: classes.dex */
public final class g extends q0.r {

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int[] f402x1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static boolean f403y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static boolean f404z1;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final Context f405N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final boolean f406O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final Z1.c f407P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final int f408Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final boolean f409R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final s f410S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public final r f411T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public e f412U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public boolean f413V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public boolean f414W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public m f415X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public boolean f416Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public List f417Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public Surface f418a1;
    public i b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public C0364q f419c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f420d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public int f421e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f422f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public long f423g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f424h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f425i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f426j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public long f427k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public int f428l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public long f429m1;
    public e0 n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public e0 f430o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f431p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public boolean f432q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public int f433r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public f f434s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public C0446E f435t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public long f436u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public long f437v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public boolean f438w1;

    public g(Context context, q0.k kVar, Handler handler, A a5) {
        super(2, kVar, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f405N0 = applicationContext;
        this.f408Q0 = 50;
        this.f415X0 = null;
        Z1.c cVar = new Z1.c();
        if (a5 != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        cVar.f2996l = handler;
        cVar.f2997m = a5;
        this.f407P0 = cVar;
        this.f406O0 = true;
        this.f410S0 = new s(applicationContext, this);
        this.f411T0 = new r();
        this.f409R0 = "NVIDIA".equals(AbstractC0370w.f5328c);
        this.f419c1 = C0364q.f5316c;
        this.f421e1 = 1;
        this.f422f1 = 0;
        this.n1 = e0.f3333d;
        this.f433r1 = 0;
        this.f430o1 = null;
        this.f431p1 = -1000;
        this.f436u1 = -9223372036854775807L;
        this.f437v1 = -9223372036854775807L;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m0(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.g.m0(java.lang.String):boolean");
    }

    public static int n0(q0.o oVar, C0190p c0190p) {
        int i;
        int iIntValue;
        int i5 = c0190p.f3431u;
        if (i5 == -1 || (i = c0190p.f3432v) == -1) {
            return -1;
        }
        String str = c0190p.f3424n;
        str.getClass();
        if ("video/dolby-vision".equals(str)) {
            Pair pairD = q0.y.d(c0190p);
            str = (pairD == null || !((iIntValue = ((Integer) pairD.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                return ((i5 * i) * 3) / 4;
            case "video/hevc":
                return Math.max(2097152, ((i5 * i) * 3) / 4);
            case "video/avc":
                String str2 = AbstractC0370w.f5329d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(AbstractC0370w.f5328c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && oVar.f9293f)))) {
                    return -1;
                }
                return ((AbstractC0370w.f(i, 16) * AbstractC0370w.f(i5, 16)) * 768) / 4;
            case "video/x-vnd.on2.vp9":
                return ((i5 * i) * 3) / 8;
            default:
                return -1;
        }
    }

    public static List o0(Context context, q0.j jVar, C0190p c0190p, boolean z4, boolean z5) {
        List listE;
        String str = c0190p.f3424n;
        if (str == null) {
            return b0.f8583p;
        }
        if (AbstractC0370w.f5326a >= 26 && "video/dolby-vision".equals(str) && !AbstractC0149a.o(context)) {
            String strB = q0.y.b(c0190p);
            if (strB == null) {
                listE = b0.f8583p;
            } else {
                jVar.getClass();
                listE = q0.y.e(strB, z4, z5);
            }
            if (!listE.isEmpty()) {
                return listE;
            }
        }
        return q0.y.g(jVar, c0190p, z4, z5);
    }

    public static int p0(q0.o oVar, C0190p c0190p) {
        if (c0190p.f3425o == -1) {
            return n0(oVar, c0190p);
        }
        List list = c0190p.f3427q;
        int size = list.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) list.get(i)).length;
        }
        return c0190p.f3425o + length;
    }

    @Override // q0.r
    public final int C(g0.e eVar) {
        return (AbstractC0370w.f5326a < 34 || !this.f432q1 || eVar.f5789r >= this.f6159w) ? 0 : 32;
    }

    @Override // q0.r
    public final boolean D() {
        return this.f432q1 && AbstractC0370w.f5326a < 23;
    }

    @Override // q0.r
    public final float E(float f2, C0190p[] c0190pArr) {
        float fMax = -1.0f;
        for (C0190p c0190p : c0190pArr) {
            float f5 = c0190p.f3433w;
            if (f5 != -1.0f) {
                fMax = Math.max(fMax, f5);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f2;
    }

    @Override // q0.r
    public final ArrayList F(q0.j jVar, C0190p c0190p, boolean z4) {
        List listO0 = o0(this.f405N0, jVar, c0190p, z4, this.f432q1);
        HashMap map = q0.y.f9370a;
        ArrayList arrayList = new ArrayList(listO0);
        Collections.sort(arrayList, new q0.t(new I2.g(c0190p, 22)));
        return arrayList;
    }

    @Override // q0.r
    public final y2.n G(q0.o oVar, C0190p c0190p, MediaCrypto mediaCrypto, float f2) {
        int i;
        C0181g c0181g;
        int i5;
        e eVar;
        int i6;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i7;
        float f5;
        Point point2;
        int i8;
        byte b4;
        boolean z4;
        Pair pairD;
        int iN0;
        String str = oVar.f9290c;
        C0190p[] c0190pArr = this.f6157u;
        c0190pArr.getClass();
        int iMax = c0190p.f3431u;
        int iP0 = p0(oVar, c0190p);
        int length = c0190pArr.length;
        float f6 = c0190p.f3433w;
        int i9 = c0190p.f3431u;
        C0181g c0181g2 = c0190p.f3401B;
        int i10 = c0190p.f3432v;
        if (length == 1) {
            if (iP0 != -1 && (iN0 = n0(oVar, c0190p)) != -1) {
                iP0 = Math.min((int) (iP0 * 1.5f), iN0);
            }
            eVar = new e(iMax, i10, iP0);
            i = i9;
            c0181g = c0181g2;
            i5 = i10;
        } else {
            int length2 = c0190pArr.length;
            int iMax2 = i10;
            int i11 = 0;
            boolean z5 = false;
            while (i11 < length2) {
                C0190p c0190p2 = c0190pArr[i11];
                C0190p[] c0190pArr2 = c0190pArr;
                if (c0181g2 != null && c0190p2.f3401B == null) {
                    C0189o c0189oA = c0190p2.a();
                    c0189oA.f3365A = c0181g2;
                    c0190p2 = new C0190p(c0189oA);
                }
                if (oVar.b(c0190p, c0190p2).f6196d != 0) {
                    int i12 = c0190p2.f3432v;
                    i8 = length2;
                    int i13 = c0190p2.f3431u;
                    b4 = -1;
                    z5 |= i13 == -1 || i12 == -1;
                    iMax = Math.max(iMax, i13);
                    iMax2 = Math.max(iMax2, i12);
                    iP0 = Math.max(iP0, p0(oVar, c0190p2));
                } else {
                    i8 = length2;
                    b4 = -1;
                }
                i11++;
                c0190pArr = c0190pArr2;
                length2 = i8;
            }
            if (z5) {
                AbstractC0360m.y("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z6 = i10 > i9;
                int i14 = z6 ? i10 : i9;
                if (z6) {
                    i6 = i9;
                    c0181g = c0181g2;
                } else {
                    c0181g = c0181g2;
                    i6 = i10;
                }
                float f7 = i6 / i14;
                int[] iArr = f402x1;
                i = i9;
                i5 = i10;
                int i15 = 0;
                while (i15 < 9) {
                    int i16 = iArr[i15];
                    int[] iArr2 = iArr;
                    int i17 = (int) (i16 * f7);
                    if (i16 <= i14 || i17 <= i6) {
                        break;
                    }
                    if (!z6) {
                        i17 = i16;
                    }
                    if (!z6) {
                        i16 = i17;
                    }
                    boolean z7 = z6;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.f9291d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i7 = i14;
                        f5 = f7;
                        point2 = null;
                    } else {
                        i7 = i14;
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        f5 = f7;
                        point2 = new Point(AbstractC0370w.f(i17, widthAlignment) * widthAlignment, AbstractC0370w.f(i16, heightAlignment) * heightAlignment);
                    }
                    if (point2 != null) {
                        point = point2;
                        if (oVar.f(point2.x, point2.y, f6)) {
                            break;
                        }
                    }
                    i15++;
                    iArr = iArr2;
                    z6 = z7;
                    i14 = i7;
                    f7 = f5;
                }
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    C0189o c0189oA2 = c0190p.a();
                    c0189oA2.f3394t = iMax;
                    c0189oA2.f3395u = iMax2;
                    iP0 = Math.max(iP0, n0(oVar, new C0190p(c0189oA2)));
                    AbstractC0360m.y("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                i = i9;
                c0181g = c0181g2;
                i5 = i10;
            }
            eVar = new e(iMax, iMax2, iP0);
        }
        this.f412U0 = eVar;
        int i18 = this.f432q1 ? this.f433r1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i);
        mediaFormat.setInteger("height", i5);
        AbstractC0360m.x(mediaFormat, c0190p.f3427q);
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        AbstractC0360m.t(mediaFormat, "rotation-degrees", c0190p.f3434x);
        if (c0181g != null) {
            C0181g c0181g3 = c0181g;
            AbstractC0360m.t(mediaFormat, "color-transfer", c0181g3.f3345c);
            AbstractC0360m.t(mediaFormat, "color-standard", c0181g3.f3343a);
            AbstractC0360m.t(mediaFormat, "color-range", c0181g3.f3344b);
            byte[] bArr = c0181g3.f3346d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c0190p.f3424n) && (pairD = q0.y.d(c0190p)) != null) {
            AbstractC0360m.t(mediaFormat, "profile", ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", eVar.f397a);
        mediaFormat.setInteger("max-height", eVar.f398b);
        AbstractC0360m.t(mediaFormat, "max-input-size", eVar.f399c);
        int i19 = AbstractC0370w.f5326a;
        if (i19 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (this.f409R0) {
            z4 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z4 = true;
        }
        if (i18 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z4);
            mediaFormat.setInteger("audio-session-id", i18);
        }
        if (i19 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f431p1));
        }
        Surface surfaceQ0 = q0(oVar);
        if (this.f415X0 != null && !AbstractC0370w.I(this.f405N0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new y2.n(oVar, mediaFormat, c0190p, surfaceQ0, mediaCrypto, null);
    }

    @Override // q0.r
    public final void H(g0.e eVar) {
        if (this.f414W0) {
            ByteBuffer byteBuffer = eVar.f5790s;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b4 = byteBuffer.get();
                short s4 = byteBuffer.getShort();
                short s5 = byteBuffer.getShort();
                byte b5 = byteBuffer.get();
                byte b6 = byteBuffer.get();
                byteBuffer.position(0);
                if (b4 == -75 && s4 == 60 && s5 == 1 && b5 == 4) {
                    if (b6 == 0 || b6 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        q0.l lVar = this.f9335V;
                        lVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        lVar.a(bundle);
                    }
                }
            }
        }
    }

    @Override // q0.r
    public final void M(Exception exc) {
        AbstractC0360m.m("MediaCodecVideoRenderer", "Video codec error", exc);
        Z1.c cVar = this.f407P0;
        Handler handler = (Handler) cVar.f2996l;
        if (handler != null) {
            handler.post(new x(cVar, exc, 3));
        }
    }

    @Override // q0.r
    public final void N(long j5, long j6, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Z1.c cVar = this.f407P0;
        Handler handler = (Handler) cVar.f2996l;
        if (handler != null) {
            handler.post(new x(cVar, str, j5, j6));
        }
        this.f413V0 = m0(str);
        q0.o oVar = this.f9342c0;
        oVar.getClass();
        boolean z4 = false;
        if (AbstractC0370w.f5326a >= 29 && "video/x-vnd.on2.vp9".equals(oVar.f9289b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = oVar.f9291d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z4 = true;
                    break;
                }
                i++;
            }
        }
        this.f414W0 = z4;
        s0();
    }

    @Override // q0.r
    public final void O(String str) {
        Z1.c cVar = this.f407P0;
        Handler handler = (Handler) cVar.f2996l;
        if (handler != null) {
            handler.post(new x(cVar, str, 5));
        }
    }

    @Override // q0.r
    public final C0459j P(Z1.e eVar) {
        C0459j c0459jP = super.P(eVar);
        C0190p c0190p = (C0190p) eVar.f3002n;
        c0190p.getClass();
        Z1.c cVar = this.f407P0;
        Handler handler = (Handler) cVar.f2996l;
        if (handler != null) {
            handler.post(new y(cVar, c0190p, c0459jP, 1));
        }
        return c0459jP;
    }

    @Override // q0.r
    public final void Q(C0190p c0190p, MediaFormat mediaFormat) {
        int integer;
        int i;
        q0.l lVar = this.f9335V;
        if (lVar != null) {
            lVar.q(this.f421e1);
        }
        if (this.f432q1) {
            i = c0190p.f3431u;
            integer = c0190p.f3432v;
        } else {
            mediaFormat.getClass();
            boolean z4 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z4 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z4 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f2 = c0190p.y;
        int i5 = c0190p.f3434x;
        if (i5 == 90 || i5 == 270) {
            f2 = 1.0f / f2;
            int i6 = integer;
            integer = i;
            i = i6;
        }
        this.n1 = new e0(f2, i, integer);
        m mVar = this.f415X0;
        if (mVar == null || !this.f438w1) {
            this.f410S0.g(c0190p.f3433w);
        } else {
            C0189o c0189oA = c0190p.a();
            c0189oA.f3394t = i;
            c0189oA.f3395u = integer;
            c0189oA.f3398x = f2;
            C0190p c0190p2 = new C0190p(c0189oA);
            AbstractC0360m.h(false);
            mVar.f471n.f476b.g(c0190p2.f3433w);
            mVar.f461c = c0190p2;
            if (mVar.i) {
                AbstractC0360m.h(mVar.f466h != -9223372036854775807L);
                mVar.f467j = true;
                mVar.f468k = mVar.f466h;
            } else {
                mVar.e();
                mVar.i = true;
                mVar.f467j = false;
                mVar.f468k = -9223372036854775807L;
            }
        }
        this.f438w1 = false;
    }

    @Override // q0.r
    public final void S(long j5) {
        super.S(j5);
        if (this.f432q1) {
            return;
        }
        this.f426j1--;
    }

    @Override // q0.r
    public final void T() {
        m mVar = this.f415X0;
        if (mVar != null) {
            q0.q qVar = this.f9322J0;
            mVar.j(qVar.f9302b, qVar.f9303c, -this.f436u1, this.f6159w);
        } else {
            this.f410S0.d(2);
        }
        this.f438w1 = true;
        s0();
    }

    @Override // q0.r
    public final void U(g0.e eVar) {
        Surface surface;
        boolean z4 = this.f432q1;
        if (!z4) {
            this.f426j1++;
        }
        if (AbstractC0370w.f5326a >= 23 || !z4) {
            return;
        }
        long j5 = eVar.f5789r;
        l0(j5);
        e0 e0Var = this.n1;
        boolean zEquals = e0Var.equals(e0.f3333d);
        Z1.c cVar = this.f407P0;
        if (!zEquals && !e0Var.equals(this.f430o1)) {
            this.f430o1 = e0Var;
            cVar.m(e0Var);
        }
        this.f9320I0.f6166e++;
        s sVar = this.f410S0;
        boolean z5 = sVar.f493d != 3;
        sVar.f493d = 3;
        sVar.f499k.getClass();
        sVar.f495f = AbstractC0370w.M(SystemClock.elapsedRealtime());
        if (z5 && (surface = this.f418a1) != null) {
            Handler handler = (Handler) cVar.f2996l;
            if (handler != null) {
                handler.post(new z(cVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f420d1 = true;
        }
        S(j5);
    }

    @Override // q0.r
    public final void V(C0190p c0190p) throws C0464o {
        m mVar = this.f415X0;
        if (mVar == null) {
            return;
        }
        try {
            mVar.c(c0190p);
            throw null;
        } catch (C e5) {
            throw i(e5, c0190p, false, 7000);
        }
    }

    @Override // q0.r
    public final boolean X(long j5, long j6, q0.l lVar, ByteBuffer byteBuffer, int i, int i5, int i6, long j7, boolean z4, boolean z5, C0190p c0190p) throws C0464o {
        lVar.getClass();
        q0.q qVar = this.f9322J0;
        long j8 = j7 - qVar.f9303c;
        m mVar = this.f415X0;
        if (mVar != null) {
            long j9 = j7 + (-this.f436u1);
            try {
                d dVar = new d();
                dVar.f396n = this;
                dVar.f395m = lVar;
                dVar.f394l = i;
                return mVar.b(j9, z5, j5, j6, dVar);
            } catch (C e5) {
                throw i(e5, e5.f380l, false, 7001);
            }
        }
        int iA = this.f410S0.a(j7, j5, j6, qVar.f9302b, z5, this.f411T0);
        if (iA == 4) {
            return false;
        }
        if (z4 && !z5) {
            v0(lVar, i);
            return true;
        }
        Surface surface = this.f418a1;
        r rVar = this.f411T0;
        if (surface == null) {
            if (rVar.f488a >= 30000) {
                return false;
            }
            v0(lVar, i);
            x0(rVar.f488a);
            return true;
        }
        if (iA == 0) {
            this.f6154r.getClass();
            long jNanoTime = System.nanoTime();
            C0446E c0446e = this.f435t1;
            if (c0446e != null) {
                c0446e.c(j8, jNanoTime);
            }
            t0(lVar, i, jNanoTime);
            x0(rVar.f488a);
            return true;
        }
        if (iA == 1) {
            long j10 = rVar.f489b;
            long j11 = rVar.f488a;
            if (j10 == this.f429m1) {
                v0(lVar, i);
            } else {
                C0446E c0446e2 = this.f435t1;
                if (c0446e2 != null) {
                    c0446e2.c(j8, j10);
                }
                t0(lVar, i, j10);
            }
            x0(j11);
            this.f429m1 = j10;
            return true;
        }
        if (iA == 2) {
            Trace.beginSection("dropVideoBuffer");
            lVar.k(i);
            Trace.endSection();
            w0(0, 1);
            x0(rVar.f488a);
            return true;
        }
        if (iA != 3) {
            if (iA == 5) {
                return false;
            }
            throw new IllegalStateException(String.valueOf(iA));
        }
        v0(lVar, i);
        x0(rVar.f488a);
        return true;
    }

    @Override // q0.r
    public final void b0() {
        super.b0();
        this.f426j1 = 0;
    }

    @Override // h0.o0
    public final void enableMayRenderStartOfStream() {
        m mVar = this.f415X0;
        if (mVar != null) {
            s sVar = (s) mVar.f471n.f480f.f3020l;
            if (sVar.f493d == 0) {
                sVar.f493d = 1;
                return;
            }
            return;
        }
        s sVar2 = this.f410S0;
        if (sVar2.f493d == 0) {
            sVar2.f493d = 1;
        }
    }

    @Override // q0.r
    public final boolean f0(q0.o oVar) {
        Surface surface = this.f418a1;
        return (surface != null && surface.isValid()) || (AbstractC0370w.f5326a >= 35 && oVar.f9295h) || u0(oVar);
    }

    @Override // q0.r
    public final boolean g0(g0.e eVar) {
        if (!eVar.e(67108864) || hasReadStreamToEnd() || eVar.e(536870912)) {
            return false;
        }
        long j5 = this.f437v1;
        return j5 != -9223372036854775807L && j5 - (eVar.f5789r - this.f9322J0.f9303c) > 100000 && !eVar.e(1073741824) && eVar.f5789r < this.f6159w;
    }

    @Override // h0.o0, h0.q0
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // h0.AbstractC0457h, h0.k0
    public final void handleMessage(int i, Object obj) {
        Handler handler;
        s sVar = this.f410S0;
        if (i == 1) {
            Surface surface = obj instanceof Surface ? (Surface) obj : null;
            Surface surface2 = this.f418a1;
            Z1.c cVar = this.f407P0;
            if (surface2 == surface) {
                if (surface != null) {
                    e0 e0Var = this.f430o1;
                    if (e0Var != null) {
                        cVar.m(e0Var);
                    }
                    Surface surface3 = this.f418a1;
                    if (surface3 == null || !this.f420d1 || (handler = (Handler) cVar.f2996l) == null) {
                        return;
                    }
                    handler.post(new z(cVar, surface3, SystemClock.elapsedRealtime()));
                    return;
                }
                return;
            }
            this.f418a1 = surface;
            if (this.f415X0 == null) {
                v vVar = sVar.f491b;
                if (vVar.f512e != surface) {
                    vVar.b();
                    vVar.f512e = surface;
                    vVar.d(true);
                }
                sVar.d(1);
            }
            this.f420d1 = false;
            int i5 = this.f6155s;
            q0.l lVar = this.f9335V;
            if (lVar != null && this.f415X0 == null) {
                q0.o oVar = this.f9342c0;
                oVar.getClass();
                Surface surface4 = this.f418a1;
                boolean z4 = (surface4 != null && surface4.isValid()) || (AbstractC0370w.f5326a >= 35 && oVar.f9295h) || u0(oVar);
                int i6 = AbstractC0370w.f5326a;
                if (i6 < 23 || !z4 || this.f413V0) {
                    Z();
                    K();
                } else {
                    Surface surfaceQ0 = q0(oVar);
                    if (i6 >= 23 && surfaceQ0 != null) {
                        lVar.j(surfaceQ0);
                    } else {
                        if (i6 < 35) {
                            throw new IllegalStateException();
                        }
                        lVar.h();
                    }
                }
            }
            if (surface != null) {
                e0 e0Var2 = this.f430o1;
                if (e0Var2 != null) {
                    cVar.m(e0Var2);
                }
                if (i5 == 2) {
                    m mVar = this.f415X0;
                    if (mVar != null) {
                        mVar.d(true);
                    } else {
                        sVar.c(true);
                    }
                }
            } else {
                this.f430o1 = null;
                m mVar2 = this.f415X0;
                if (mVar2 != null) {
                    q qVar = mVar2.f471n;
                    qVar.getClass();
                    int i7 = C0364q.f5316c.f5317a;
                    qVar.f485l = null;
                }
            }
            s0();
            return;
        }
        if (i == 7) {
            obj.getClass();
            C0446E c0446e = (C0446E) obj;
            this.f435t1 = c0446e;
            m mVar3 = this.f415X0;
            if (mVar3 != null) {
                mVar3.f471n.f483j = c0446e;
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f433r1 != iIntValue) {
                this.f433r1 = iIntValue;
                if (this.f432q1) {
                    Z();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.f431p1 = ((Integer) obj).intValue();
            q0.l lVar2 = this.f9335V;
            if (lVar2 != null && AbstractC0370w.f5326a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f431p1));
                lVar2.a(bundle);
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f421e1 = iIntValue2;
            q0.l lVar3 = this.f9335V;
            if (lVar3 != null) {
                lVar3.q(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f422f1 = iIntValue3;
            m mVar4 = this.f415X0;
            if (mVar4 != null) {
                mVar4.g(iIntValue3);
                return;
            }
            v vVar2 = sVar.f491b;
            if (vVar2.f516j == iIntValue3) {
                return;
            }
            vVar2.f516j = iIntValue3;
            vVar2.d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f417Z0 = list;
            m mVar5 = this.f415X0;
            if (mVar5 != null) {
                mVar5.k(list);
                return;
            }
            return;
        }
        if (i != 14) {
            if (i == 11) {
                this.f9330Q = (C0449H) obj;
                return;
            }
            return;
        }
        obj.getClass();
        C0364q c0364q = (C0364q) obj;
        if (c0364q.f5317a == 0 || c0364q.f5318b == 0) {
            return;
        }
        this.f419c1 = c0364q;
        m mVar6 = this.f415X0;
        if (mVar6 != null) {
            Surface surface5 = this.f418a1;
            AbstractC0360m.i(surface5);
            mVar6.h(surface5, c0364q);
        }
    }

    @Override // q0.r
    public final int i0(q0.j jVar, C0190p c0190p) {
        boolean z4;
        int i = 0;
        if (!AbstractC0156G.l(c0190p.f3424n)) {
            return q0.e(0, 0, 0, 0);
        }
        boolean z5 = c0190p.f3428r != null;
        Context context = this.f405N0;
        List listO0 = o0(context, jVar, c0190p, z5, false);
        if (z5 && listO0.isEmpty()) {
            listO0 = o0(context, jVar, c0190p, false, false);
        }
        if (listO0.isEmpty()) {
            return q0.e(1, 0, 0, 0);
        }
        int i5 = c0190p.f3411L;
        if (i5 != 0 && i5 != 2) {
            return q0.e(2, 0, 0, 0);
        }
        q0.o oVar = (q0.o) listO0.get(0);
        boolean zD = oVar.d(c0190p);
        if (zD) {
            z4 = true;
        } else {
            for (int i6 = 1; i6 < listO0.size(); i6++) {
                q0.o oVar2 = (q0.o) listO0.get(i6);
                if (oVar2.d(c0190p)) {
                    zD = true;
                    z4 = false;
                    oVar = oVar2;
                    break;
                }
            }
            z4 = true;
        }
        int i7 = zD ? 4 : 3;
        int i8 = oVar.e(c0190p) ? 16 : 8;
        int i9 = oVar.f9294g ? 64 : 0;
        int i10 = z4 ? 128 : 0;
        if (AbstractC0370w.f5326a >= 26 && "video/dolby-vision".equals(c0190p.f3424n) && !AbstractC0149a.o(context)) {
            i10 = 256;
        }
        if (zD) {
            List listO02 = o0(context, jVar, c0190p, z5, true);
            if (!listO02.isEmpty()) {
                HashMap map = q0.y.f9370a;
                ArrayList arrayList = new ArrayList(listO02);
                Collections.sort(arrayList, new q0.t(new I2.g(c0190p, 22)));
                q0.o oVar3 = (q0.o) arrayList.get(0);
                if (oVar3.d(c0190p) && oVar3.e(c0190p)) {
                    i = 32;
                }
            }
        }
        return i7 | i8 | i | i9 | i10;
    }

    @Override // h0.AbstractC0457h, h0.o0
    public final boolean isEnded() {
        return this.f9312E0 && this.f415X0 == null;
    }

    @Override // q0.r, h0.o0
    public final boolean isReady() {
        boolean zIsReady = super.isReady();
        m mVar = this.f415X0;
        if (mVar != null) {
            return ((s) mVar.f471n.f480f.f3020l).b(false);
        }
        if (zIsReady && (this.f9335V == null || this.f418a1 == null || this.f432q1)) {
            return true;
        }
        return this.f410S0.b(zIsReady);
    }

    @Override // q0.r, h0.AbstractC0457h
    public final void j() {
        Z1.c cVar = this.f407P0;
        this.f430o1 = null;
        this.f437v1 = -9223372036854775807L;
        m mVar = this.f415X0;
        if (mVar != null) {
            ((s) mVar.f471n.f480f.f3020l).d(0);
        } else {
            this.f410S0.d(0);
        }
        s0();
        this.f420d1 = false;
        this.f434s1 = null;
        try {
            super.j();
            C0458i c0458i = this.f9320I0;
            cVar.getClass();
            synchronized (c0458i) {
            }
            Handler handler = (Handler) cVar.f2996l;
            if (handler != null) {
                handler.post(new y(cVar, 2, c0458i));
            }
            cVar.m(e0.f3333d);
        } catch (Throwable th) {
            C0458i c0458i2 = this.f9320I0;
            cVar.getClass();
            synchronized (c0458i2) {
                Handler handler2 = (Handler) cVar.f2996l;
                if (handler2 != null) {
                    handler2.post(new y(cVar, 2, c0458i2));
                }
                cVar.m(e0.f3333d);
                throw th;
            }
        }
    }

    @Override // h0.AbstractC0457h
    public final void k(boolean z4, boolean z5) {
        this.f9320I0 = new C0458i();
        r0 r0Var = this.f6151o;
        r0Var.getClass();
        boolean z6 = r0Var.f6276b;
        AbstractC0360m.h((z6 && this.f433r1 == 0) ? false : true);
        if (this.f432q1 != z6) {
            this.f432q1 = z6;
            Z();
        }
        C0458i c0458i = this.f9320I0;
        Z1.c cVar = this.f407P0;
        Handler handler = (Handler) cVar.f2996l;
        if (handler != null) {
            handler.post(new x(cVar, c0458i, 4));
        }
        boolean z7 = this.f416Y0;
        s sVar = this.f410S0;
        if (!z7) {
            if (this.f417Z0 != null && this.f415X0 == null) {
                k kVar = new k(this.f405N0, sVar);
                C0365r c0365r = this.f6154r;
                c0365r.getClass();
                kVar.f456g = c0365r;
                AbstractC0360m.h(!kVar.f450a);
                if (((p) kVar.f454e) == null) {
                    if (((o) kVar.f453d) == null) {
                        kVar.f453d = new o();
                    }
                    kVar.f454e = new p((o) kVar.f453d);
                }
                q qVar = new q(kVar);
                kVar.f450a = true;
                this.f415X0 = qVar.f475a;
            }
            this.f416Y0 = true;
        }
        m mVar = this.f415X0;
        if (mVar == null) {
            C0365r c0365r2 = this.f6154r;
            c0365r2.getClass();
            sVar.f499k = c0365r2;
            sVar.f493d = z5 ? 1 : 0;
            return;
        }
        B0.d dVar = new B0.d(this);
        EnumC0743a enumC0743a = EnumC0743a.f9372l;
        mVar.f469l = dVar;
        mVar.f470m = enumC0743a;
        C0446E c0446e = this.f435t1;
        if (c0446e != null) {
            mVar.f471n.f483j = c0446e;
        }
        if (this.f418a1 != null && !this.f419c1.equals(C0364q.f5316c)) {
            this.f415X0.h(this.f418a1, this.f419c1);
        }
        this.f415X0.g(this.f422f1);
        this.f415X0.i(this.f9333T);
        List list = this.f417Z0;
        if (list != null) {
            this.f415X0.k(list);
        }
        ((s) this.f415X0.f471n.f480f.f3020l).f493d = z5 ? 1 : 0;
    }

    @Override // q0.r, h0.AbstractC0457h
    public final void l(long j5, boolean z4) {
        m mVar = this.f415X0;
        if (mVar != null) {
            mVar.a(true);
            m mVar2 = this.f415X0;
            q0.q qVar = this.f9322J0;
            mVar2.j(qVar.f9302b, qVar.f9303c, -this.f436u1, this.f6159w);
            this.f438w1 = true;
        }
        super.l(j5, z4);
        m mVar3 = this.f415X0;
        s sVar = this.f410S0;
        if (mVar3 == null) {
            v vVar = sVar.f491b;
            vVar.f519m = 0L;
            vVar.f522p = -1L;
            vVar.f520n = -1L;
            sVar.f496g = -9223372036854775807L;
            sVar.f494e = -9223372036854775807L;
            sVar.d(1);
            sVar.f497h = -9223372036854775807L;
        }
        if (z4) {
            m mVar4 = this.f415X0;
            if (mVar4 != null) {
                mVar4.d(false);
            } else {
                sVar.c(false);
            }
        }
        s0();
        this.f425i1 = 0;
    }

    @Override // h0.AbstractC0457h
    public final void m() {
        m mVar = this.f415X0;
        if (mVar == null || !this.f406O0) {
            return;
        }
        q qVar = mVar.f471n;
        if (qVar.f487n == 2) {
            return;
        }
        C0367t c0367t = qVar.f484k;
        if (c0367t != null) {
            c0367t.f5321a.removeCallbacksAndMessages(null);
        }
        qVar.f485l = null;
        qVar.f487n = 2;
    }

    @Override // h0.AbstractC0457h
    public final void n() {
        try {
            try {
                v();
                Z();
                E e5 = this.f9329P;
                if (e5 != null) {
                    e5.I(null);
                }
                this.f9329P = null;
            } catch (Throwable th) {
                E e6 = this.f9329P;
                if (e6 != null) {
                    e6.I(null);
                }
                this.f9329P = null;
                throw th;
            }
        } finally {
            this.f416Y0 = false;
            this.f436u1 = -9223372036854775807L;
            i iVar = this.b1;
            if (iVar != null) {
                iVar.release();
                this.b1 = null;
            }
        }
    }

    @Override // h0.AbstractC0457h
    public final void o() {
        this.f424h1 = 0;
        this.f6154r.getClass();
        this.f423g1 = SystemClock.elapsedRealtime();
        this.f427k1 = 0L;
        this.f428l1 = 0;
        m mVar = this.f415X0;
        if (mVar != null) {
            ((s) mVar.f471n.f480f.f3020l).e();
        } else {
            this.f410S0.e();
        }
    }

    @Override // h0.AbstractC0457h
    public final void p() {
        r0();
        int i = this.f428l1;
        if (i != 0) {
            long j5 = this.f427k1;
            Z1.c cVar = this.f407P0;
            Handler handler = (Handler) cVar.f2996l;
            if (handler != null) {
                handler.post(new x(cVar, j5, i));
            }
            this.f427k1 = 0L;
            this.f428l1 = 0;
        }
        m mVar = this.f415X0;
        if (mVar != null) {
            ((s) mVar.f471n.f480f.f3020l).f();
        } else {
            this.f410S0.f();
        }
    }

    @Override // q0.r, h0.AbstractC0457h
    public final void q(C0190p[] c0190pArr, long j5, long j6, H h2) {
        super.q(c0190pArr, j5, j6, h2);
        if (this.f436u1 == -9223372036854775807L) {
            this.f436u1 = j5;
        }
        AbstractC0169U abstractC0169U = this.f6146A;
        if (abstractC0169U.p()) {
            this.f437v1 = -9223372036854775807L;
            return;
        }
        h2.getClass();
        this.f437v1 = abstractC0169U.g(h2.f10531a, new C0167S()).f3239d;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.Surface q0(q0.o r6) {
        /*
            r5 = this;
            D0.m r0 = r5.f415X0
            r1 = 0
            r2 = 0
            if (r0 != 0) goto La9
            android.view.Surface r0 = r5.f418a1
            if (r0 == 0) goto Lb
            return r0
        Lb:
            int r0 = d0.AbstractC0370w.f5326a
            r3 = 35
            if (r0 < r3) goto L16
            boolean r0 = r6.f9295h
            if (r0 == 0) goto L16
            return r2
        L16:
            boolean r0 = r5.u0(r6)
            d0.AbstractC0360m.h(r0)
            D0.i r0 = r5.b1
            if (r0 == 0) goto L2e
            boolean r3 = r0.f446l
            boolean r4 = r6.f9293f
            if (r3 == r4) goto L2e
            if (r0 == 0) goto L2e
            r0.release()
            r5.b1 = r2
        L2e:
            D0.i r0 = r5.b1
            if (r0 != 0) goto La6
            android.content.Context r0 = r5.f405N0
            boolean r6 = r6.f9293f
            r2 = 1
            if (r6 == 0) goto L42
            boolean r0 = D0.i.d(r0)
            if (r0 == 0) goto L40
            goto L44
        L40:
            r0 = r1
            goto L45
        L42:
            int r0 = D0.i.f444o
        L44:
            r0 = r2
        L45:
            d0.AbstractC0360m.h(r0)
            D0.h r0 = new D0.h
            java.lang.String r3 = "ExoPlayer:PlaceholderSurface"
            r0.<init>(r3)
            if (r6 == 0) goto L54
            int r6 = D0.i.f444o
            goto L55
        L54:
            r6 = r1
        L55:
            r0.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r0.getLooper()
            r3.<init>(r4, r0)
            r0.f440m = r3
            d0.e r4 = new d0.e
            r4.<init>(r3)
            r0.f439l = r4
            monitor-enter(r0)
            android.os.Handler r3 = r0.f440m     // Catch: java.lang.Throwable -> L84
            android.os.Message r6 = r3.obtainMessage(r2, r6, r1)     // Catch: java.lang.Throwable -> L84
            r6.sendToTarget()     // Catch: java.lang.Throwable -> L84
        L74:
            D0.i r6 = r0.f443p     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L88
            java.lang.RuntimeException r6 = r0.f442o     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L88
            java.lang.Error r6 = r0.f441n     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L88
            r0.wait()     // Catch: java.lang.Throwable -> L84 java.lang.InterruptedException -> L86
            goto L74
        L84:
            r6 = move-exception
            goto La4
        L86:
            r1 = r2
            goto L74
        L88:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L92
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L92:
            java.lang.RuntimeException r6 = r0.f442o
            if (r6 != 0) goto La3
            java.lang.Error r6 = r0.f441n
            if (r6 != 0) goto La2
            D0.i r6 = r0.f443p
            r6.getClass()
            r5.b1 = r6
            goto La6
        La2:
            throw r6
        La3:
            throw r6
        La4:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            throw r6
        La6:
            D0.i r6 = r5.b1
            return r6
        La9:
            d0.AbstractC0360m.h(r1)
            d0.AbstractC0360m.i(r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.g.q0(q0.o):android.view.Surface");
    }

    public final void r0() {
        if (this.f424h1 > 0) {
            this.f6154r.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j5 = jElapsedRealtime - this.f423g1;
            int i = this.f424h1;
            Z1.c cVar = this.f407P0;
            Handler handler = (Handler) cVar.f2996l;
            if (handler != null) {
                handler.post(new x(cVar, i, j5));
            }
            this.f424h1 = 0;
            this.f423g1 = jElapsedRealtime;
        }
    }

    @Override // q0.r, h0.o0
    public final void render(long j5, long j6) throws C0464o {
        super.render(j5, j6);
        m mVar = this.f415X0;
        if (mVar != null) {
            try {
                mVar.f(j5, j6);
            } catch (C e5) {
                throw i(e5, e5.f380l, false, 7001);
            }
        }
    }

    public final void s0() {
        int i;
        q0.l lVar;
        if (!this.f432q1 || (i = AbstractC0370w.f5326a) < 23 || (lVar = this.f9335V) == null) {
            return;
        }
        this.f434s1 = new f(this, lVar);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            lVar.a(bundle);
        }
    }

    @Override // q0.r, h0.o0
    public final void setPlaybackSpeed(float f2, float f5) {
        super.setPlaybackSpeed(f2, f5);
        m mVar = this.f415X0;
        if (mVar != null) {
            mVar.i(f2);
        } else {
            this.f410S0.h(f2);
        }
    }

    @Override // q0.r
    public final C0459j t(q0.o oVar, C0190p c0190p, C0190p c0190p2) {
        C0459j c0459jB = oVar.b(c0190p, c0190p2);
        e eVar = this.f412U0;
        eVar.getClass();
        int i = c0190p2.f3431u;
        int i5 = eVar.f397a;
        int i6 = c0459jB.f6197e;
        if (i > i5 || c0190p2.f3432v > eVar.f398b) {
            i6 |= 256;
        }
        if (p0(oVar, c0190p2) > eVar.f399c) {
            i6 |= 64;
        }
        int i7 = i6;
        return new C0459j(oVar.f9288a, c0190p, c0190p2, i7 != 0 ? 0 : c0459jB.f6196d, i7);
    }

    public final void t0(q0.l lVar, int i, long j5) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        lVar.g(j5, i);
        Trace.endSection();
        this.f9320I0.f6166e++;
        this.f425i1 = 0;
        if (this.f415X0 == null) {
            e0 e0Var = this.n1;
            boolean zEquals = e0Var.equals(e0.f3333d);
            Z1.c cVar = this.f407P0;
            if (!zEquals && !e0Var.equals(this.f430o1)) {
                this.f430o1 = e0Var;
                cVar.m(e0Var);
            }
            s sVar = this.f410S0;
            boolean z4 = sVar.f493d != 3;
            sVar.f493d = 3;
            sVar.f499k.getClass();
            sVar.f495f = AbstractC0370w.M(SystemClock.elapsedRealtime());
            if (!z4 || (surface = this.f418a1) == null) {
                return;
            }
            Handler handler = (Handler) cVar.f2996l;
            if (handler != null) {
                handler.post(new z(cVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f420d1 = true;
        }
    }

    @Override // q0.r
    public final q0.n u(IllegalStateException illegalStateException, q0.o oVar) {
        Surface surface = this.f418a1;
        C0028c c0028c = new C0028c(illegalStateException, oVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c0028c;
    }

    public final boolean u0(q0.o oVar) {
        return AbstractC0370w.f5326a >= 23 && !this.f432q1 && !m0(oVar.f9288a) && (!oVar.f9293f || i.d(this.f405N0));
    }

    public final void v0(q0.l lVar, int i) {
        Trace.beginSection("skipVideoBuffer");
        lVar.k(i);
        Trace.endSection();
        this.f9320I0.f6167f++;
    }

    public final void w0(int i, int i5) {
        C0458i c0458i = this.f9320I0;
        c0458i.f6169h += i;
        int i6 = i + i5;
        c0458i.f6168g += i6;
        this.f424h1 += i6;
        int i7 = this.f425i1 + i6;
        this.f425i1 = i7;
        c0458i.i = Math.max(i7, c0458i.i);
        int i8 = this.f408Q0;
        if (i8 <= 0 || this.f424h1 < i8) {
            return;
        }
        r0();
    }

    public final void x0(long j5) {
        C0458i c0458i = this.f9320I0;
        c0458i.f6171k += j5;
        c0458i.f6172l++;
        this.f427k1 += j5;
        this.f428l1++;
    }
}
