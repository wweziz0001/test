package i1;

import D.C0015o;
import b3.AbstractC0307a;
import c1.k;
import c1.l;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.InterfaceC0351d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public final class e implements l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f6439m = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f6440n = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f6441o = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f6442p = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f6443q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f6444r = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Pattern f6445s = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f6446t = new d(30.0f, 1, 1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final XmlPullParserFactory f6447l;

    public e() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f6447l = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e5) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e5);
        }
    }

    public static g a(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f6445s.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC0360m.y("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z4 = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i5 = Integer.parseInt(strGroup2);
            if (i == 0 || i5 == 0) {
                z4 = false;
            }
            AbstractC0360m.b("Invalid cell resolution " + i + " " + i5, z4);
            return i5;
        } catch (NumberFormatException unused) {
            AbstractC0360m.y("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void d(String str, g gVar) throws c1.f {
        Matcher matcher;
        String strGroup;
        int i = AbstractC0370w.f5326a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f6441o;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new c1.f(AbstractC0307a.l(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            AbstractC0360m.y("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new c1.f(AbstractC0307a.k("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                gVar.f6465j = 3;
                break;
            case "em":
                gVar.f6465j = 2;
                break;
            case "px":
                gVar.f6465j = 1;
                break;
            default:
                throw new c1.f(AbstractC0307a.k("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        gVar.f6466k = Float.parseFloat(strGroup2);
    }

    public static d e(XmlPullParser xmlPullParser) {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i5 = AbstractC0370w.f5326a;
            AbstractC0360m.b("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f2 = 1.0f;
        }
        d dVar = f6446t;
        int i6 = dVar.f6437b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i6 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new d(i * f2, i6, attributeValue4 != null ? Integer.parseInt(attributeValue4) : dVar.f6438c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024d A[LOOP:0: B:3:0x000a->B:104:0x024d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, D.C0015o r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.e.f(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, D.o, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static i1.c g(org.xmlpull.v1.XmlPullParser r21, i1.c r22, java.util.HashMap r23, i1.d r24) throws c1.f {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.e.g(org.xmlpull.v1.XmlPullParser, i1.c, java.util.HashMap, i1.d):i1.c");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:67:0x00eb. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103  */
    /* JADX WARN: Type inference failed for: r11v117, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r12v14, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r16v10, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r16v3, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r16v9, types: [android.text.Layout$Alignment] */
    /* JADX WARN: Type inference failed for: r1v50, types: [i1.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static i1.g h(org.xmlpull.v1.XmlPullParser r19, i1.g r20) {
        /*
            Method dump skipped, instruction units count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.e.h(org.xmlpull.v1.XmlPullParser, i1.g):i1.g");
    }

    public static long i(String str, d dVar) throws c1.f {
        double d5;
        double d6;
        double d7;
        Matcher matcher = f6439m.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d8 = Long.parseLong(strGroup) * 3600;
            matcher.group(2).getClass();
            double d9 = d8 + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double d10 = d9 + Long.parseLong(r13);
            String strGroup2 = matcher.group(4);
            return (long) ((d10 + (strGroup2 != null ? Double.parseDouble(strGroup2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / dVar.f6436a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / ((double) dVar.f6437b)) / ((double) dVar.f6436a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f6440n.matcher(str);
        if (!matcher2.matches()) {
            throw new c1.f(AbstractC0307a.j("Malformed time expression: ", str));
        }
        String strGroup3 = matcher2.group(1);
        strGroup3.getClass();
        d5 = Double.parseDouble(strGroup3);
        String strGroup4 = matcher2.group(2);
        strGroup4.getClass();
        switch (strGroup4) {
            case "f":
                d6 = dVar.f6436a;
                d5 /= d6;
                return (long) (d5 * 1000000.0d);
            case "h":
                d7 = 3600.0d;
                break;
            case "m":
                d7 = 60.0d;
                break;
            case "t":
                d6 = dVar.f6438c;
                d5 /= d6;
                return (long) (d5 * 1000000.0d);
            case "ms":
                d6 = 1000.0d;
                d5 /= d6;
                return (long) (d5 * 1000000.0d);
            default:
                return (long) (d5 * 1000000.0d);
        }
        d5 *= d7;
        return (long) (d5 * 1000000.0d);
    }

    public static C0015o j(XmlPullParser xmlPullParser) {
        String strN = AbstractC0360m.n(xmlPullParser, "extent");
        if (strN == null) {
            return null;
        }
        Matcher matcher = f6444r.matcher(strN);
        if (!matcher.matches()) {
            AbstractC0360m.y("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strN));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new C0015o(i, Integer.parseInt(strGroup2), 5);
        } catch (NumberFormatException unused) {
            AbstractC0360m.y("TtmlParser", "Ignoring malformed tts extent: ".concat(strN));
            return null;
        }
    }

    @Override // c1.l
    public final int o() {
        return 1;
    }

    @Override // c1.l
    public final c1.d v(byte[] bArr, int i, int i5) {
        d dVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f6447l.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C0015o c0015oJ = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i5), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            d dVarE = f6446t;
            int iC = 15;
            A.e eVar = null;
            int i6 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i6 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            dVarE = e(xmlPullParserNewPullParser);
                            iC = c(xmlPullParserNewPullParser);
                            c0015oJ = j(xmlPullParserNewPullParser);
                        }
                        C0015o c0015o = c0015oJ;
                        d dVar2 = dVarE;
                        int i7 = iC;
                        if (b(name)) {
                            if ("head".equals(name)) {
                                dVar = dVar2;
                                f(xmlPullParserNewPullParser, map, i7, c0015o, map2, map3);
                            } else {
                                dVar = dVar2;
                                try {
                                    c cVarG = g(xmlPullParserNewPullParser, cVar, map2, dVar);
                                    arrayDeque.push(cVarG);
                                    if (cVar != null) {
                                        if (cVar.f6435m == null) {
                                            cVar.f6435m = new ArrayList();
                                        }
                                        cVar.f6435m.add(cVarG);
                                    }
                                } catch (c1.f e5) {
                                    AbstractC0360m.z("TtmlParser", "Suppressing parser error", e5);
                                    i6++;
                                }
                            }
                            dVarE = dVar;
                        } else {
                            AbstractC0360m.p("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i6++;
                            dVarE = dVar2;
                        }
                        c0015oJ = c0015o;
                        iC = i7;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c cVarA = c.a(xmlPullParserNewPullParser.getText());
                        if (cVar.f6435m == null) {
                            cVar.f6435m = new ArrayList();
                        }
                        cVar.f6435m.add(cVarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            eVar = new A.e(cVar2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i6++;
                } else if (eventType == 3) {
                    i6--;
                }
                xmlPullParserNewPullParser.next();
            }
            eVar.getClass();
            return eVar;
        } catch (IOException e6) {
            throw new IllegalStateException("Unexpected error when reading input.", e6);
        } catch (XmlPullParserException e7) {
            throw new IllegalStateException("Unable to decode source", e7);
        }
    }

    @Override // c1.l
    public final void x(byte[] bArr, int i, int i5, k kVar, InterfaceC0351d interfaceC0351d) {
        D1.b.S(v(bArr, i, i5), kVar, interfaceC0351d);
    }
}
