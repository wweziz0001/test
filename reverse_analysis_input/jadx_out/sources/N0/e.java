package N0;

import a0.C0157H;
import d0.AbstractC0360m;
import java.io.IOException;
import java.io.StringReader;
import m2.C0639F;
import m2.C0640G;
import m2.I;
import m2.b0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f1576a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f1577b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f1578c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static c a(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!AbstractC0360m.s(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw C0157H.a(null, "Couldn't find xmp metadata");
        }
        C0640G c0640g = I.f8549m;
        b0 b0VarB = b0.f8583p;
        long j5 = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (AbstractC0360m.s(xmlPullParserNewPullParser, "rdf:Description")) {
                String[] strArr = f1576a;
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        break loop0;
                    }
                    String strN = AbstractC0360m.n(xmlPullParserNewPullParser, strArr[i]);
                    if (strN == null) {
                        i++;
                    } else if (Integer.parseInt(strN) == 1) {
                        String[] strArr2 = f1577b;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= 4) {
                                break;
                            }
                            String strN2 = AbstractC0360m.n(xmlPullParserNewPullParser, strArr2[i5]);
                            if (strN2 != null) {
                                j5 = Long.parseLong(strN2);
                                if (j5 == -1) {
                                    break;
                                }
                            } else {
                                i5++;
                            }
                        }
                        j5 = -9223372036854775807L;
                        String[] strArr3 = f1578c;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= 2) {
                                C0640G c0640g2 = I.f8549m;
                                b0VarB = b0.f8583p;
                                break;
                            }
                            String strN3 = AbstractC0360m.n(xmlPullParserNewPullParser, strArr3[i6]);
                            if (strN3 != null) {
                                b0VarB = I.v(new b(0L, 0L, "image/jpeg"), new b(Long.parseLong(strN3), 0L, "video/mp4"));
                                break;
                            }
                            i6++;
                        }
                    }
                }
                return null;
            }
            if (AbstractC0360m.s(xmlPullParserNewPullParser, "Container:Directory")) {
                b0VarB = b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (AbstractC0360m.s(xmlPullParserNewPullParser, "GContainer:Directory")) {
                b0VarB = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!AbstractC0360m.q(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (b0VarB.isEmpty()) {
            return null;
        }
        return new c(j5, b0VarB, 0);
    }

    public static b0 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        C0639F c0639fN = I.n();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (AbstractC0360m.s(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strN = AbstractC0360m.n(xmlPullParser, strConcat3);
                String strN2 = AbstractC0360m.n(xmlPullParser, strConcat4);
                String strN3 = AbstractC0360m.n(xmlPullParser, strConcat5);
                String strN4 = AbstractC0360m.n(xmlPullParser, strConcat6);
                if (strN == null || strN2 == null) {
                    return b0.f8583p;
                }
                c0639fN.a(new b(strN3 != null ? Long.parseLong(strN3) : 0L, strN4 != null ? Long.parseLong(strN4) : 0L, strN));
            }
        } while (!AbstractC0360m.q(xmlPullParser, strConcat2));
        return c0639fN.g();
    }
}
