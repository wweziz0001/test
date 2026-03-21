package w0;

import a0.C0157H;
import android.util.Pair;
import java.io.IOException;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f10452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedList f10453d = new LinkedList();

    public d(d dVar, String str, String str2) {
        this.f10452c = dVar;
        this.f10450a = str;
        this.f10451b = str2;
    }

    public static int g(XmlPullParser xmlPullParser, String str) throws C0157H {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e5) {
            throw C0157H.b(null, e5);
        }
    }

    public static long h(XmlPullParser xmlPullParser, String str, long j5) throws C0157H {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j5;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException e5) {
            throw C0157H.b(null, e5);
        }
    }

    public static int i(XmlPullParser xmlPullParser, String str) throws C0157H {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new L0.d(str, 1);
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e5) {
            throw C0157H.b(null, e5);
        }
    }

    public abstract Object b();

    public final Object c(String str) {
        int i = 0;
        while (true) {
            LinkedList linkedList = this.f10453d;
            if (i >= linkedList.size()) {
                d dVar = this.f10452c;
                if (dVar == null) {
                    return null;
                }
                return dVar.c(str);
            }
            Pair pair = (Pair) linkedList.get(i);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
            i++;
        }
    }

    public boolean d(String str) {
        return false;
    }

    public final Object e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        boolean z4 = false;
        int i = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            d hVar = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (this.f10451b.equals(name)) {
                    j(xmlPullParser);
                    z4 = true;
                } else if (z4) {
                    if (i > 0) {
                        i++;
                    } else if (d(name)) {
                        j(xmlPullParser);
                    } else {
                        boolean zEquals = "QualityLevel".equals(name);
                        String str = this.f10450a;
                        if (zEquals) {
                            hVar = new f(this, str, "QualityLevel");
                        } else if ("Protection".equals(name)) {
                            hVar = new e(this, str, "Protection");
                        } else if ("StreamIndex".equals(name)) {
                            hVar = new h(this, str);
                        }
                        if (hVar == null) {
                            i = 1;
                        } else {
                            a(hVar.e(xmlPullParser));
                        }
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z4 && i == 0) {
                    k(xmlPullParser);
                }
            } else if (!z4) {
                continue;
            } else if (i > 0) {
                i--;
            } else {
                String name2 = xmlPullParser.getName();
                f(xmlPullParser);
                if (!d(name2)) {
                    return b();
                }
            }
            xmlPullParser.next();
        }
    }

    public abstract void j(XmlPullParser xmlPullParser);

    public final void l(Object obj, String str) {
        this.f10453d.add(Pair.create(str, obj));
    }

    public void a(Object obj) {
    }

    public void f(XmlPullParser xmlPullParser) {
    }

    public void k(XmlPullParser xmlPullParser) {
    }
}
