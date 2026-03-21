package q0;

import a.AbstractC0149a;
import a0.AbstractC0156G;
import a0.C0190p;
import android.media.MediaCodecInfo;
import android.util.Pair;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import m2.C0639F;
import m2.I;
import m2.b0;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f9370a = new HashMap();

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (AbstractC0370w.f5326a < 26 && AbstractC0370w.f5327b.equals("R9") && arrayList.size() == 1 && ((o) arrayList.get(0)).f9288a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(o.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new t(new j()));
        }
        if (AbstractC0370w.f5326a >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((o) arrayList.get(0)).f9288a)) {
            return;
        }
        arrayList.add((o) arrayList.remove(0));
    }

    public static String b(C0190p c0190p) {
        Pair pairD;
        if ("audio/eac3-joc".equals(c0190p.f3424n)) {
            return "audio/eac3";
        }
        String str = c0190p.f3424n;
        if ("video/dolby-vision".equals(str) && (pairD = d(c0190p)) != null) {
            int iIntValue = ((Integer) pairD.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[PHI: r11
      0x007b: PHI (r11v35 java.lang.Object) = 
      (r11v5 java.lang.Object)
      (r11v6 java.lang.Object)
      (r11v8 java.lang.Object)
      (r11v11 java.lang.Object)
      (r11v14 java.lang.Object)
      (r11v17 java.lang.Object)
      (r11v20 java.lang.Object)
      (r11v23 java.lang.Object)
      (r11v26 java.lang.Object)
      (r11v29 java.lang.Object)
      (r11v32 java.lang.Object)
      (r11v36 java.lang.Object)
     binds: [B:62:0x00fb, B:58:0x00ee, B:427:?, B:426:?, B:425:?, B:424:?, B:423:?, B:422:?, B:421:?, B:420:?, B:419:?, B:19:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0405 A[PHI: r2
      0x0405: PHI (r2v34 int) = (r2v33 int), (r2v36 int), (r2v37 int), (r2v38 int), (r2v39 int) binds: [B:265:0x03d8, B:268:0x03de, B:270:0x03e2, B:272:0x03e6, B:274:0x03ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x040b A[Catch: NumberFormatException -> 0x041b, TRY_LEAVE, TryCatch #4 {NumberFormatException -> 0x041b, blocks: (B:262:0x03bb, B:264:0x03cf, B:275:0x03ec, B:287:0x040b), top: B:417:0x03bb }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(a0.C0190p r27) {
        /*
            Method dump skipped, instruction units count: 1818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.y.d(a0.p):android.util.Pair");
    }

    public static synchronized List e(String str, boolean z4, boolean z5) {
        try {
            u uVar = new u(str, z4, z5);
            HashMap map = f9370a;
            List list = (List) map.get(uVar);
            if (list != null) {
                return list;
            }
            A.j jVar = new A.j();
            jVar.f26l = (z4 || z5) ? 1 : 0;
            ArrayList arrayListF = f(uVar, jVar);
            if (z4 && arrayListF.isEmpty() && AbstractC0370w.f5326a <= 23) {
                arrayListF = f(uVar, new p1.b(3));
                if (!arrayListF.isEmpty()) {
                    AbstractC0360m.y("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((o) arrayListF.get(0)).f9288a);
                }
            }
            a(str, arrayListF);
            I iP = I.p(arrayListF);
            map.put(uVar, iP);
            return iP;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList f(q0.u r23, q0.w r24) throws q0.v {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.y.f(q0.u, q0.w):java.util.ArrayList");
    }

    public static b0 g(j jVar, C0190p c0190p, boolean z4, boolean z5) {
        List listE;
        String str = c0190p.f3424n;
        jVar.getClass();
        List listE2 = e(str, z4, z5);
        String strB = b(c0190p);
        if (strB == null) {
            listE = b0.f8583p;
        } else {
            jVar.getClass();
            listE = e(strB, z4, z5);
        }
        C0639F c0639fN = I.n();
        c0639fN.d(listE2);
        c0639fN.d(listE);
        return c0639fN.g();
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, boolean z4, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z4 && str.endsWith(".secure"))) {
            return false;
        }
        int i = AbstractC0370w.f5326a;
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(AbstractC0370w.f5328c))) {
            String str3 = AbstractC0370w.f5327b;
            if (str3.startsWith("zeroflte") || str3.startsWith("zerolte") || str3.startsWith("zenlte") || "SC-05G".equals(str3) || "marinelteatt".equals(str3) || "404SC".equals(str3) || "SC-04G".equals(str3) || "SCV31".equals(str3)) {
                return false;
            }
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (AbstractC0370w.f5326a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (AbstractC0156G.i(str)) {
            return true;
        }
        String strI = AbstractC0149a.I(mediaCodecInfo.getName());
        if (strI.startsWith("arc.")) {
            return false;
        }
        if (strI.startsWith("omx.google.") || strI.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strI.startsWith("omx.sec.") && strI.contains(".sw.")) || strI.equals("omx.qcom.video.decoder.hevcswvdec") || strI.startsWith("c2.android.") || strI.startsWith("c2.google.")) {
            return true;
        }
        return (strI.startsWith("omx.") || strI.startsWith("c2.")) ? false : true;
    }
}
