package t0;

import a0.C0157H;
import android.net.Uri;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0362o;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m2.AbstractC0636C;
import m2.C0639F;
import m2.C0640G;
import m2.I;
import m2.J;
import m2.b0;
import m2.q0;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f9989a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f9990b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f9991c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f9992d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f9993e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f9994f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f9995g = new String(new byte[]{10});

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f9996h = new String(new byte[]{13, 10});

    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                return 0;
        }
    }

    public static b0 b(String str) {
        if (str == null) {
            C0640G c0640g = I.f8549m;
            return b0.f8583p;
        }
        m2.r.e("initialCapacity", 4);
        Object[] objArrCopyOf = new Object[4];
        int i = AbstractC0370w.f5326a;
        int i5 = 0;
        for (String str2 : str.split(",\\s?", -1)) {
            int iA = a(str2);
            if (iA != 0) {
                Integer numValueOf = Integer.valueOf(iA);
                int i6 = i5 + 1;
                int iF = AbstractC0636C.f(objArrCopyOf.length, i6);
                if (iF > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
                }
                objArrCopyOf[i5] = numValueOf;
                i5 = i6;
            }
        }
        return I.m(i5, objArrCopyOf);
    }

    public static N0.c c(String str) throws C0157H {
        long j5;
        Matcher matcher = f9992d.matcher(str);
        if (!matcher.matches()) {
            throw C0157H.b(str, null);
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            try {
                j5 = ((long) Integer.parseInt(strGroup2)) * 1000;
            } catch (NumberFormatException e5) {
                throw C0157H.b(str, e5);
            }
        } else {
            j5 = 60000;
        }
        return new N0.c(strGroup, j5, 5);
    }

    public static Z1.l d(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        int i = AbstractC0370w.f5326a;
        String[] strArrSplit = userInfo.split(":", 2);
        return new Z1.l(strArrSplit[0], strArrSplit[1]);
    }

    public static C0362o e(String str) throws C0157H {
        Matcher matcher = f9993e.matcher(str);
        if (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(3);
            strGroup2.getClass();
            String strGroup3 = matcher.group(4);
            return new C0362o(2, strGroup, strGroup2, strGroup3 != null ? strGroup3 : "");
        }
        Matcher matcher2 = f9994f.matcher(str);
        if (matcher2.matches()) {
            String strGroup4 = matcher2.group(1);
            strGroup4.getClass();
            return new C0362o(1, strGroup4, "", "");
        }
        throw C0157H.b("Invalid WWW-Authenticate header " + str, null);
    }

    public static Uri f(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String encodedAuthority = uri.getEncodedAuthority();
        encodedAuthority.getClass();
        AbstractC0360m.c(encodedAuthority.contains("@"));
        int i = AbstractC0370w.f5326a;
        return uri.buildUpon().encodedAuthority(encodedAuthority.split("@", -1)[1]).build();
    }

    public static b0 g(z zVar) {
        AbstractC0360m.c(zVar.f9999c.c("CSeq") != null);
        C0639F c0639f = new C0639F();
        c0639f.c(AbstractC0370w.n("%s %s %s", h(zVar.f9998b), zVar.f9997a, "RTSP/1.0"));
        J jA = zVar.f9999c.a();
        q0 it = jA.e().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            I iD = jA.d(str);
            for (int i = 0; i < iD.size(); i++) {
                c0639f.c(AbstractC0370w.n("%s: %s", str, iD.get(i)));
            }
        }
        c0639f.c("");
        c0639f.c(zVar.f10000d);
        return c0639f.g();
    }

    public static String h(int i) {
        switch (i) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return "OPTIONS";
            case 5:
                return "PAUSE";
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return "PLAY";
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return "PLAY_NOTIFY";
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                throw new IllegalStateException();
        }
    }
}
