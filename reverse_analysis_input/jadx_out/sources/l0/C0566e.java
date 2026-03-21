package l0;

import B0.t;
import a.AbstractC0149a;
import a0.C0157H;
import android.net.Uri;
import android.text.TextUtils;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import f0.C0415j;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: l0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0566e extends DefaultHandler implements t {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f7841m = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f7842n = Pattern.compile("CC([1-4])=.*");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f7843o = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f7844p = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final XmlPullParserFactory f7845l;

    public C0566e() {
        try {
            this.f7845l = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e5) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e5);
        }
    }

    public static long a(ArrayList arrayList, long j5, long j6, int i, long j7) {
        int i5;
        if (i >= 0) {
            i5 = i + 1;
        } else {
            int i6 = AbstractC0370w.f5326a;
            i5 = (int) ((((j7 - j5) + j6) - 1) / j6);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            arrayList.add(new q(j5, j6));
            j5 += j6;
        }
        return j5;
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (AbstractC0360m.r(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (AbstractC0360m.r(xmlPullParser)) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public static int c(org.xmlpull.v1.XmlPullParser r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C0566e.c(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j5) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j5;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, List list, boolean z4) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z4 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i5 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC0360m.q(xmlPullParser, "BaseURL"));
        if (text != null && AbstractC0360m.o(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return m2.r.p(new C0563b(i, i5, text, attributeValue3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < list.size(); i6++) {
            C0563b c0563b = (C0563b) list.get(i6);
            String strV = AbstractC0360m.v(c0563b.f7818a, text);
            String str = attributeValue3 == null ? strV : attributeValue3;
            if (z4) {
                i = c0563b.f7820c;
                i5 = c0563b.f7821d;
                str = c0563b.f7819b;
            }
            arrayList.add(new C0563b(i, i5, strV, str));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015e  */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair f(org.xmlpull.v1.XmlPullParser r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C0566e.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static C0567f h(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!AbstractC0360m.q(xmlPullParser, str));
        return new C0567f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j5) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j5;
        }
        Matcher matcher = AbstractC0370w.i.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d5 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d6 = d5 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d7 = d6 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d8 = d7 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d9 = d8 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j6 = (long) ((d9 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j6 : j6;
    }

    public static float j(XmlPullParser xmlPullParser, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f2;
        }
        Matcher matcher = f7841m.matcher(attributeValue);
        if (!matcher.matches()) {
            return f2;
        }
        int i = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? i / Integer.parseInt(r2) : i;
    }

    public static int k(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    public static long m(XmlPullParser xmlPullParser, String str, long j5) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j5 : Long.parseLong(attributeValue);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:279:0x097e  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x09be A[PHI: r0
      0x09be: PHI (r0v79 java.lang.String) = (r0v78 java.lang.String), (r0v107 java.lang.String) binds: [B:278:0x097c, B:294:0x09bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0a5a  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0c38  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0c3b  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0c56  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0c59  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0c75  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0c79  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0ca8 A[LOOP:11: B:193:0x069c->B:457:0x0ca8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0fe2 A[LOOP:5: B:129:0x03ee->B:560:0x0fe2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:661:0x13ce A[LOOP:1: B:43:0x00cf->B:661:0x13ce, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:669:0x139a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0e3d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:690:0x08f8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r12v11, types: [org.xmlpull.v1.XmlPullParser] */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r13v1, types: [org.xmlpull.v1.XmlPullParser] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16, types: [org.xmlpull.v1.XmlPullParser] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [org.xmlpull.v1.XmlPullParser] */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32, types: [org.xmlpull.v1.XmlPullParser] */
    /* JADX WARN: Type inference failed for: r13v33, types: [org.xmlpull.v1.XmlPullParser] */
    /* JADX WARN: Type inference failed for: r13v34, types: [org.xmlpull.v1.XmlPullParser] */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v63 */
    /* JADX WARN: Type inference failed for: r13v64 */
    /* JADX WARN: Type inference failed for: r13v65 */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r13v67 */
    /* JADX WARN: Type inference failed for: r13v7, types: [org.xmlpull.v1.XmlPullParser] */
    /* JADX WARN: Type inference failed for: r13v9, types: [org.xmlpull.v1.XmlPullParser] */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r37v10 */
    /* JADX WARN: Type inference failed for: r37v11 */
    /* JADX WARN: Type inference failed for: r37v12 */
    /* JADX WARN: Type inference failed for: r37v13 */
    /* JADX WARN: Type inference failed for: r37v3 */
    /* JADX WARN: Type inference failed for: r37v4 */
    /* JADX WARN: Type inference failed for: r37v5 */
    /* JADX WARN: Type inference failed for: r37v6 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r45v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r46v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r47v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r48v6 */
    /* JADX WARN: Type inference failed for: r48v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r48v8 */
    /* JADX WARN: Type inference failed for: r49v0 */
    /* JADX WARN: Type inference failed for: r49v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r49v2 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v67 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l0.C0564c n(org.xmlpull.v1.XmlPullParser r162, android.net.Uri r163) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 5144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C0566e.n(org.xmlpull.v1.XmlPullParser, android.net.Uri):l0.c");
    }

    public static j o(XmlPullParser xmlPullParser, String str, String str2) {
        long j5;
        long j6;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j5 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j6 = (Long.parseLong(strArrSplit[1]) - j5) + 1;
            }
            return new j(j5, j6, attributeValue);
        }
        j5 = 0;
        j6 = -1;
        return new j(j5, j6, attributeValue);
    }

    public static int p(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public static int q(ArrayList arrayList) {
        int i = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            if (AbstractC0149a.p("http://dashif.org/guidelines/trickmode", ((C0567f) arrayList.get(i5)).f7846a)) {
                i = 16384;
            }
        }
        return i;
    }

    public static r r(XmlPullParser xmlPullParser, r rVar) throws XmlPullParserException, IOException {
        long j5;
        long j6;
        long jM = m(xmlPullParser, "timescale", rVar != null ? rVar.f7888b : 1L);
        long jM2 = m(xmlPullParser, "presentationTimeOffset", rVar != null ? rVar.f7889c : 0L);
        long j7 = rVar != null ? rVar.f7885d : 0L;
        long j8 = rVar != null ? rVar.f7886e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            long j9 = Long.parseLong(strArrSplit[0]);
            j5 = (Long.parseLong(strArrSplit[1]) - j9) + 1;
            j6 = j9;
        } else {
            j5 = j8;
            j6 = j7;
        }
        j jVarO = rVar != null ? rVar.f7887a : null;
        do {
            xmlPullParser.next();
            if (AbstractC0360m.s(xmlPullParser, "Initialization")) {
                jVarO = o(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC0360m.q(xmlPullParser, "SegmentBase"));
        return new r(jVarO, jM, jM2, j6, j5);
    }

    public static o s(XmlPullParser xmlPullParser, o oVar, long j5, long j6, long j7, long j8, long j9) throws XmlPullParserException, IOException {
        long jM = m(xmlPullParser, "timescale", oVar != null ? oVar.f7888b : 1L);
        long jM2 = m(xmlPullParser, "presentationTimeOffset", oVar != null ? oVar.f7889c : 0L);
        long jM3 = m(xmlPullParser, "duration", oVar != null ? oVar.f7875e : -9223372036854775807L);
        long jM4 = m(xmlPullParser, "startNumber", oVar != null ? oVar.f7874d : 1L);
        long j10 = j8 == -9223372036854775807L ? j7 : j8;
        long j11 = j10 == Long.MAX_VALUE ? -9223372036854775807L : j10;
        List arrayList = null;
        j jVarO = null;
        List listU = null;
        do {
            xmlPullParser.next();
            if (AbstractC0360m.s(xmlPullParser, "Initialization")) {
                jVarO = o(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC0360m.s(xmlPullParser, "SegmentTimeline")) {
                listU = u(xmlPullParser, jM, j6);
            } else if (AbstractC0360m.s(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(o(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC0360m.q(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVarO == null) {
                jVarO = oVar.f7887a;
            }
            if (listU == null) {
                listU = oVar.f7876f;
            }
            if (arrayList == null) {
                arrayList = oVar.f7879j;
            }
        }
        return new o(jVarO, jM, jM2, jM4, jM3, listU, j11, arrayList, AbstractC0370w.M(j9), AbstractC0370w.M(j5));
    }

    public static p t(XmlPullParser xmlPullParser, p pVar, List list, long j5, long j6, long j7, long j8, long j9) throws XmlPullParserException, IOException {
        long j10;
        long jM = m(xmlPullParser, "timescale", pVar != null ? pVar.f7888b : 1L);
        long jM2 = m(xmlPullParser, "presentationTimeOffset", pVar != null ? pVar.f7889c : 0L);
        long jM3 = m(xmlPullParser, "duration", pVar != null ? pVar.f7875e : -9223372036854775807L);
        long jM4 = m(xmlPullParser, "startNumber", pVar != null ? pVar.f7874d : 1L);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j10 = -1;
                break;
            }
            C0567f c0567f = (C0567f) list.get(i);
            if (AbstractC0149a.p("http://dashif.org/guidelines/last-segment-number", c0567f.f7846a)) {
                j10 = Long.parseLong(c0567f.f7847b);
                break;
            }
            i++;
        }
        long j11 = j10;
        long j12 = j8 == -9223372036854775807L ? j7 : j8;
        long j13 = j12 == Long.MAX_VALUE ? -9223372036854775807L : j12;
        j jVarO = null;
        Z1.s sVarV = v(xmlPullParser, "media", pVar != null ? pVar.f7881k : null);
        Z1.s sVarV2 = v(xmlPullParser, "initialization", pVar != null ? pVar.f7880j : null);
        List listU = null;
        do {
            xmlPullParser.next();
            if (AbstractC0360m.s(xmlPullParser, "Initialization")) {
                jVarO = o(xmlPullParser, "sourceURL", "range");
            } else if (AbstractC0360m.s(xmlPullParser, "SegmentTimeline")) {
                listU = u(xmlPullParser, jM, j6);
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC0360m.q(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVarO == null) {
                jVarO = pVar.f7887a;
            }
            if (listU == null) {
                listU = pVar.f7876f;
            }
        }
        return new p(jVarO, jM, jM2, jM4, j11, jM3, listU, j13, sVarV2, sVarV, AbstractC0370w.M(j9), AbstractC0370w.M(j5));
    }

    public static ArrayList u(XmlPullParser xmlPullParser, long j5, long j6) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j7 = -9223372036854775807L;
        boolean z4 = false;
        int iK = 0;
        do {
            xmlPullParser.next();
            if (AbstractC0360m.s(xmlPullParser, "S")) {
                long jM = m(xmlPullParser, "t", -9223372036854775807L);
                if (z4) {
                    jA = a(arrayList, jA, j7, iK, jM);
                }
                if (jM == -9223372036854775807L) {
                    jM = jA;
                }
                long jM2 = m(xmlPullParser, "d", -9223372036854775807L);
                iK = k(xmlPullParser, "r", 0);
                z4 = true;
                j7 = jM2;
                jA = jM;
            } else {
                b(xmlPullParser);
            }
        } while (!AbstractC0360m.q(xmlPullParser, "SegmentTimeline"));
        if (z4) {
            int i = AbstractC0370w.f5326a;
            a(arrayList, jA, j7, iK, AbstractC0370w.U(j6, j5, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    public static Z1.s v(XmlPullParser xmlPullParser, String str, Z1.s sVar) {
        String strSubstring;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return sVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int length = 0;
        while (length < attributeValue.length()) {
            int iIndexOf = attributeValue.indexOf("$", length);
            if (iIndexOf == -1) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length));
                length = attributeValue.length();
            } else if (iIndexOf != length) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + attributeValue.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (attributeValue.startsWith("$$", length)) {
                arrayList.set(arrayList2.size(), ((String) arrayList.get(arrayList2.size())) + "$");
                length += 2;
            } else {
                arrayList3.add("");
                int i = length + 1;
                int iIndexOf2 = attributeValue.indexOf("$", i);
                String strSubstring2 = attributeValue.substring(i, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            arrayList2.add(2);
                            break;
                        case "Time":
                            arrayList2.add(4);
                            break;
                        case "Bandwidth":
                            arrayList2.add(3);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    arrayList3.set(arrayList2.size() - 1, strSubstring);
                }
                arrayList.add("");
                length = iIndexOf2 + 1;
            }
        }
        return new Z1.s(arrayList, arrayList2, arrayList3, 8);
    }

    @Override // B0.t
    public final Object l(Uri uri, C0415j c0415j) throws C0157H {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f7845l.newPullParser();
            xmlPullParserNewPullParser.setInput(c0415j, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return n(xmlPullParserNewPullParser, uri);
            }
            throw C0157H.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e5) {
            throw C0157H.b(null, e5);
        }
    }
}
