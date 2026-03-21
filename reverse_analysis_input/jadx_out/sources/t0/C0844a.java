package t0;

import a0.C0157H;
import b3.AbstractC0307a;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.HashMap;
import java.util.Locale;
import m2.g0;

/* JADX INFO: renamed from: t0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0844a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f9845e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9846f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f9847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f9848h;
    public String i;

    public C0844a(int i, int i5, String str, String str2) {
        this.f9841a = str;
        this.f9842b = i;
        this.f9843c = str2;
        this.f9844d = i5;
    }

    public static String b(int i, int i5, int i6, String str) {
        int i7 = AbstractC0370w.f5326a;
        Locale locale = Locale.US;
        return i + " " + str + "/" + i5 + "/" + i6;
    }

    public final C0846c a() {
        String strB;
        C0845b c0845bA;
        HashMap map = this.f9845e;
        try {
            if (map.containsKey("rtpmap")) {
                String str = (String) map.get("rtpmap");
                int i = AbstractC0370w.f5326a;
                c0845bA = C0845b.a(str);
            } else {
                int i5 = this.f9844d;
                AbstractC0360m.c(i5 < 96);
                if (i5 == 0) {
                    strB = b(0, 8000, 1, "PCMU");
                } else if (i5 == 8) {
                    strB = b(8, 8000, 1, "PCMA");
                } else if (i5 == 10) {
                    strB = b(10, 44100, 2, "L16");
                } else {
                    if (i5 != 11) {
                        throw new IllegalStateException(AbstractC0307a.i("Unsupported static paylod type ", i5));
                    }
                    strB = b(11, 44100, 1, "L16");
                }
                c0845bA = C0845b.a(strB);
            }
            return new C0846c(this, g0.a(map), c0845bA);
        } catch (C0157H e5) {
            throw new IllegalStateException(e5);
        }
    }
}
