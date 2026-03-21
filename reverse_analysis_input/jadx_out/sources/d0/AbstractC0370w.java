package d0;

import a.AbstractC0149a;
import a0.AbstractC0156G;
import a0.C0157H;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media.A;
import b3.AbstractC0307a;
import com.ryanheise.audioservice.AudioService;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m2.I;

/* JADX INFO: renamed from: d0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0370w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f5326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f5327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f5328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f5329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f5330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f5331f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long[] f5332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f5333h;
    public static final Pattern i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f5334j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static HashMap f5335k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f5336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f5337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f5338n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f5339o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f5340p;

    static {
        int i5 = Build.VERSION.SDK_INT;
        f5326a = i5;
        String str = Build.DEVICE;
        f5327b = str;
        String str2 = Build.MANUFACTURER;
        f5328c = str2;
        String str3 = Build.MODEL;
        f5329d = str3;
        f5330e = str + ", " + str3 + ", " + str2 + ", " + i5;
        f5331f = new byte[0];
        f5332g = new long[0];
        f5333h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f5334j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f5336l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f5337m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f5338n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f5339o = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f5340p = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, AudioService.KEYCODE_BYPASS_PAUSE, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A(int r4, int r5) {
        /*
            r0 = 2
            if (r4 == r0) goto L29
            r1 = 3
            if (r4 == r1) goto L28
            r2 = 4
            if (r4 == r2) goto L26
            r3 = 21
            if (r4 == r3) goto L24
            r3 = 22
            if (r4 == r3) goto L26
            r3 = 268435456(0x10000000, float:2.524355E-29)
            if (r4 == r3) goto L29
            r0 = 1342177280(0x50000000, float:8.589935E9)
            if (r4 == r0) goto L24
            r0 = 1610612736(0x60000000, float:3.689349E19)
            if (r4 != r0) goto L1e
            goto L26
        L1e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L24:
            r0 = r1
            goto L29
        L26:
            r0 = r2
            goto L29
        L28:
            r0 = 1
        L29:
            int r0 = r0 * r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.AbstractC0370w.A(int, int):int");
    }

    public static long B(long j5, float f2) {
        return f2 == 1.0f ? j5 : Math.round(j5 / ((double) f2));
    }

    public static String[] C() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = f5326a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            strArrSplit[i5] = N(strArrSplit[i5]);
        }
        return strArrSplit;
    }

    public static String D(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e5) {
            AbstractC0360m.m("Util", "Failed to read system property ".concat(str), e5);
            return null;
        }
    }

    public static String E(int i5) {
        switch (i5) {
            case -2:
                return "none";
            case A.RESULT_ERROR /* -1 */:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "camera motion";
            default:
                return i5 >= 10000 ? AbstractC0307a.h(i5, "custom (", ")") : "?";
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int F(Uri uri, String str) {
        int i5;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme != null && AbstractC0149a.p("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            int iLastIndexOf = lastPathSegment.lastIndexOf(46);
            if (iLastIndexOf >= 0) {
                String strI = AbstractC0149a.I(lastPathSegment.substring(iLastIndexOf + 1));
                strI.getClass();
                switch (strI.hashCode()) {
                    case 104579:
                        if (strI.equals("ism")) {
                        }
                        break;
                    case 108321:
                        if (strI.equals("mpd")) {
                        }
                        break;
                    case 3242057:
                        if (strI.equals("isml")) {
                        }
                        break;
                    case 3299913:
                        if (strI.equals("m3u8")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:88)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    */
                /*
                    Method dump skipped, instruction units count: 284
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: d0.AbstractC0370w.F(android.net.Uri, java.lang.String):int");
            }

            public static void G(int i5) {
                Integer.toString(i5, 36);
            }

            public static boolean H(int i5) {
                return i5 == 3 || i5 == 2 || i5 == 268435456 || i5 == 21 || i5 == 1342177280 || i5 == 22 || i5 == 1610612736 || i5 == 4;
            }

            public static boolean I(Context context) {
                int i5 = f5326a;
                if (i5 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
                    String str = f5329d;
                    if ((i5 != 30 || (!AbstractC0149a.p(str, "moto g(20)") && !AbstractC0149a.p(str, "rmx3231"))) && (i5 != 34 || !AbstractC0149a.p(str, "sm-x200"))) {
                        return false;
                    }
                }
                return true;
            }

            public static boolean J(int i5) {
                return i5 == 10 || i5 == 13;
            }

            public static boolean K(Context context) {
                UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
            }

            public static void L(ArrayList arrayList, int i5, int i6, int i7) {
                ArrayDeque arrayDeque = new ArrayDeque();
                for (int i8 = (i6 - i5) - 1; i8 >= 0; i8--) {
                    arrayDeque.addFirst(arrayList.remove(i5 + i8));
                }
                arrayList.addAll(Math.min(i7, arrayList.size()), arrayDeque);
            }

            public static long M(long j5) {
                return (j5 == -9223372036854775807L || j5 == Long.MIN_VALUE) ? j5 : j5 * 1000;
            }

            public static String N(String str) {
                if (str == null) {
                    return null;
                }
                String strReplace = str.replace('_', '-');
                if (!strReplace.isEmpty() && !strReplace.equals("und")) {
                    str = strReplace;
                }
                String strI = AbstractC0149a.I(str);
                int i5 = 0;
                String str2 = strI.split("-", 2)[0];
                if (f5335k == null) {
                    String[] iSOLanguages = Locale.getISOLanguages();
                    int length = iSOLanguages.length;
                    String[] strArr = f5336l;
                    HashMap map = new HashMap(length + strArr.length);
                    for (String str3 : iSOLanguages) {
                        try {
                            String iSO3Language = new Locale(str3).getISO3Language();
                            if (!TextUtils.isEmpty(iSO3Language)) {
                                map.put(iSO3Language, str3);
                            }
                        } catch (MissingResourceException unused) {
                        }
                    }
                    for (int i6 = 0; i6 < strArr.length; i6 += 2) {
                        map.put(strArr[i6], strArr[i6 + 1]);
                    }
                    f5335k = map;
                }
                String str4 = (String) f5335k.get(str2);
                if (str4 != null) {
                    strI = str4 + strI.substring(str2.length());
                    str2 = str4;
                }
                if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
                    return strI;
                }
                while (true) {
                    String[] strArr2 = f5337m;
                    if (i5 >= strArr2.length) {
                        return strI;
                    }
                    if (strI.startsWith(strArr2[i5])) {
                        return strArr2[i5 + 1] + strI.substring(strArr2[i5].length());
                    }
                    i5 += 2;
                }
            }

            public static Object[] O(int i5, Object[] objArr) {
                AbstractC0360m.c(i5 <= objArr.length);
                return Arrays.copyOf(objArr, i5);
            }

            public static long P(String str) throws C0157H {
                Matcher matcher = f5333h.matcher(str);
                if (!matcher.matches()) {
                    throw C0157H.a(null, "Invalid date/time format: " + str);
                }
                int i5 = 0;
                if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                    i5 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                    if ("-".equals(matcher.group(11))) {
                        i5 *= -1;
                    }
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
                gregorianCalendar.clear();
                gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                if (!TextUtils.isEmpty(matcher.group(8))) {
                    gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                }
                long timeInMillis = gregorianCalendar.getTimeInMillis();
                return i5 != 0 ? timeInMillis - (((long) i5) * 60000) : timeInMillis;
            }

            public static void Q(Handler handler, Runnable runnable) {
                if (handler.getLooper().getThread().isAlive()) {
                    if (handler.getLooper() == Looper.myLooper()) {
                        runnable.run();
                    } else {
                        handler.post(runnable);
                    }
                }
            }

            public static void R(ArrayList arrayList, int i5, int i6) {
                if (i5 < 0 || i6 > arrayList.size() || i5 > i6) {
                    throw new IllegalArgumentException();
                }
                if (i5 != i6) {
                    arrayList.subList(i5, i6).clear();
                }
            }

            public static long S(long j5, int i5) {
                return U(j5, 1000000L, i5, RoundingMode.DOWN);
            }

            public static void T(long[] jArr, long j5) {
                RoundingMode roundingMode = RoundingMode.DOWN;
                int i5 = 0;
                if (j5 >= 1000000 && j5 % 1000000 == 0) {
                    long jR = i4.a.r(j5, 1000000L, RoundingMode.UNNECESSARY);
                    while (i5 < jArr.length) {
                        jArr[i5] = i4.a.r(jArr[i5], jR, roundingMode);
                        i5++;
                    }
                    return;
                }
                if (j5 < 1000000 && 1000000 % j5 == 0) {
                    long jR2 = i4.a.r(1000000L, j5, RoundingMode.UNNECESSARY);
                    while (i5 < jArr.length) {
                        jArr[i5] = i4.a.T(jArr[i5], jR2);
                        i5++;
                    }
                    return;
                }
                for (int i6 = 0; i6 < jArr.length; i6++) {
                    long j6 = jArr[i6];
                    if (j6 != 0) {
                        if (j5 >= j6 && j5 % j6 == 0) {
                            jArr[i6] = i4.a.r(1000000L, i4.a.r(j5, j6, RoundingMode.UNNECESSARY), roundingMode);
                        } else if (j5 >= j6 || j6 % j5 != 0) {
                            jArr[i6] = V(j6, 1000000L, j5, roundingMode);
                        } else {
                            jArr[i6] = i4.a.T(1000000L, i4.a.r(j6, j5, RoundingMode.UNNECESSARY));
                        }
                    }
                }
            }

            public static long U(long j5, long j6, long j7, RoundingMode roundingMode) {
                if (j5 == 0 || j6 == 0) {
                    return 0L;
                }
                return (j7 < j6 || j7 % j6 != 0) ? (j7 >= j6 || j6 % j7 != 0) ? (j7 < j5 || j7 % j5 != 0) ? (j7 >= j5 || j5 % j7 != 0) ? V(j5, j6, j7, roundingMode) : i4.a.T(j6, i4.a.r(j5, j7, RoundingMode.UNNECESSARY)) : i4.a.r(j6, i4.a.r(j7, j5, RoundingMode.UNNECESSARY), roundingMode) : i4.a.T(j5, i4.a.r(j6, j7, RoundingMode.UNNECESSARY)) : i4.a.r(j5, i4.a.r(j7, j6, RoundingMode.UNNECESSARY), roundingMode);
            }

            /* JADX WARN: Removed duplicated region for block: B:59:0x00ee  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00f0  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x00fd  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static long V(long r9, long r11, long r13, java.math.RoundingMode r15) {
                /*
                    Method dump skipped, instruction units count: 318
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: d0.AbstractC0370w.V(long, long, long, java.math.RoundingMode):long");
            }

            public static String[] W(String str, String str2) {
                return str.split(str2, -1);
            }

            public static String[] X(String str) {
                return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
            }

            public static String Y(byte[] bArr) {
                StringBuilder sb = new StringBuilder(bArr.length * 2);
                for (int i5 = 0; i5 < bArr.length; i5++) {
                    sb.append(Character.forDigit((bArr[i5] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i5] & 15, 16));
                }
                return sb.toString();
            }

            public static long Z(long j5) {
                return (j5 == -9223372036854775807L || j5 == Long.MIN_VALUE) ? j5 : j5 / 1000;
            }

            public static int a(long[] jArr, long j5, boolean z4) {
                int i5;
                int iBinarySearch = Arrays.binarySearch(jArr, j5);
                if (iBinarySearch < 0) {
                    return ~iBinarySearch;
                }
                while (true) {
                    i5 = iBinarySearch + 1;
                    if (i5 >= jArr.length || jArr[i5] != j5) {
                        break;
                    }
                    iBinarySearch = i5;
                }
                return z4 ? iBinarySearch : i5;
            }

            public static int b(A.j jVar, long j5) {
                int i5 = jVar.f26l - 1;
                int i6 = 0;
                while (i6 <= i5) {
                    int i7 = (i6 + i5) >>> 1;
                    if (jVar.i(i7) < j5) {
                        i6 = i7 + 1;
                    } else {
                        i5 = i7 - 1;
                    }
                }
                int i8 = i5 + 1;
                if (i8 < jVar.f26l && jVar.i(i8) == j5) {
                    return i8;
                }
                if (i5 == -1) {
                    return 0;
                }
                return i5;
            }

            public static int c(I i5, Long l3, boolean z4) {
                int i6;
                int iBinarySearch = Collections.binarySearch(i5, l3);
                if (iBinarySearch < 0) {
                    i6 = -(iBinarySearch + 2);
                } else {
                    while (true) {
                        int i7 = iBinarySearch - 1;
                        if (i7 < 0 || ((Comparable) i5.get(i7)).compareTo(l3) != 0) {
                            break;
                        }
                        iBinarySearch = i7;
                    }
                    i6 = iBinarySearch;
                }
                return z4 ? Math.max(0, i6) : i6;
            }

            public static int d(int[] iArr, int i5, boolean z4, boolean z5) {
                int i6;
                int i7;
                int iBinarySearch = Arrays.binarySearch(iArr, i5);
                if (iBinarySearch < 0) {
                    i7 = -(iBinarySearch + 2);
                } else {
                    while (true) {
                        i6 = iBinarySearch - 1;
                        if (i6 < 0 || iArr[i6] != i5) {
                            break;
                        }
                        iBinarySearch = i6;
                    }
                    i7 = z4 ? iBinarySearch : i6;
                }
                return z5 ? Math.max(0, i7) : i7;
            }

            public static int e(long[] jArr, long j5, boolean z4) {
                int i5;
                int iBinarySearch = Arrays.binarySearch(jArr, j5);
                if (iBinarySearch < 0) {
                    i5 = -(iBinarySearch + 2);
                } else {
                    while (true) {
                        int i6 = iBinarySearch - 1;
                        if (i6 < 0 || jArr[i6] != j5) {
                            break;
                        }
                        iBinarySearch = i6;
                    }
                    i5 = iBinarySearch;
                }
                return z4 ? Math.max(0, i5) : i5;
            }

            public static int f(int i5, int i6) {
                return ((i5 + i6) - 1) / i6;
            }

            public static void g(Closeable closeable) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (IOException unused) {
                    }
                }
            }

            public static float h(float f2, float f5, float f6) {
                return Math.max(f5, Math.min(f2, f6));
            }

            public static int i(int i5, int i6, int i7) {
                return Math.max(i6, Math.min(i5, i7));
            }

            public static long j(long j5, long j6, long j7) {
                return Math.max(j6, Math.min(j5, j7));
            }

            public static boolean k(Object[] objArr, Object obj) {
                for (Object obj2 : objArr) {
                    if (Objects.equals(obj2, obj)) {
                        return true;
                    }
                }
                return false;
            }

            public static int l(int i5, int i6, int i7, byte[] bArr) {
                while (i5 < i6) {
                    i7 = f5338n[((i7 >>> 24) ^ (bArr[i5] & 255)) & 255] ^ (i7 << 8);
                    i5++;
                }
                return i7;
            }

            public static Handler m(Handler.Callback callback) {
                Looper looperMyLooper = Looper.myLooper();
                AbstractC0360m.i(looperMyLooper);
                return new Handler(looperMyLooper, callback);
            }

            public static String n(String str, Object... objArr) {
                return String.format(Locale.US, str, objArr);
            }

            public static String o(byte[] bArr) {
                return new String(bArr, StandardCharsets.UTF_8);
            }

            public static int p(int i5) {
                if (i5 == 20) {
                    return 30;
                }
                if (i5 == 22) {
                    return 31;
                }
                if (i5 == 30) {
                    return 34;
                }
                switch (i5) {
                    case 2:
                    case 3:
                        return 3;
                    case 4:
                    case 5:
                    case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        return 21;
                    case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    case O.j.BYTES_FIELD_NUMBER /* 8 */:
                        return 23;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        return 28;
                    default:
                        switch (i5) {
                            case 14:
                                return 25;
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                                return 28;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
            }

            public static AudioFormat q(int i5, int i6, int i7) {
                return new AudioFormat.Builder().setSampleRate(i5).setChannelMask(i6).setEncoding(i7).build();
            }

            public static int r(int i5) {
                int i6 = f5326a;
                if (i5 == 10) {
                    return i6 >= 32 ? 737532 : 6396;
                }
                if (i5 == 12) {
                    return 743676;
                }
                if (i5 == 24) {
                    return i6 >= 32 ? 67108860 : 0;
                }
                switch (i5) {
                    case 1:
                        return 4;
                    case 2:
                        return 12;
                    case 3:
                        return 28;
                    case 4:
                        return 204;
                    case 5:
                        return 220;
                    case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        return 252;
                    case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        return 1276;
                    case O.j.BYTES_FIELD_NUMBER /* 8 */:
                        return 6396;
                    default:
                        return 0;
                }
            }

            public static byte[] s(String str) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = i5 * 2;
                    bArr[i5] = (byte) (Character.digit(str.charAt(i6 + 1), 16) + (Character.digit(str.charAt(i6), 16) << 4));
                }
                return bArr;
            }

            public static int t(String str, int i5) {
                int i6 = 0;
                for (String str2 : X(str)) {
                    if (i5 == AbstractC0156G.h(AbstractC0156G.d(str2))) {
                        i6++;
                    }
                }
                return i6;
            }

            public static String u(String str, int i5) {
                String[] strArrX = X(str);
                if (strArrX.length == 0) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                for (String str2 : strArrX) {
                    if (i5 == AbstractC0156G.h(AbstractC0156G.d(str2))) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append(str2);
                    }
                }
                if (sb.length() > 0) {
                    return sb.toString();
                }
                return null;
            }

            public static int v(int i5) {
                if (i5 == 2 || i5 == 4) {
                    return 6005;
                }
                if (i5 == 10) {
                    return 6004;
                }
                if (i5 == 7) {
                    return 6005;
                }
                if (i5 == 8) {
                    return 6003;
                }
                switch (i5) {
                    case 15:
                        return 6003;
                    case 16:
                    case 18:
                        return 6005;
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        return 6004;
                    default:
                        switch (i5) {
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                                return 6002;
                            default:
                                return 6006;
                        }
                }
            }

            public static int w(String str) {
                String[] strArrSplit;
                int length;
                if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
                    return 0;
                }
                String str2 = strArrSplit[length - 1];
                boolean z4 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
                try {
                    str2.getClass();
                    int i5 = Integer.parseInt(str2);
                    return z4 ? -i5 : i5;
                } catch (NumberFormatException unused) {
                    return 0;
                }
            }

            public static long x(long j5, float f2) {
                return f2 == 1.0f ? j5 : Math.round(j5 * ((double) f2));
            }

            public static long y(long j5) {
                return j5 == -9223372036854775807L ? System.currentTimeMillis() : j5 + SystemClock.elapsedRealtime();
            }

            public static int z(int i5) {
                if (i5 == 8) {
                    return 3;
                }
                if (i5 == 16) {
                    return 2;
                }
                if (i5 != 24) {
                    return i5 != 32 ? 0 : 22;
                }
                return 21;
            }
        }
