package k1;

import d0.C0363p;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: k1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0531a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f7640c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f7641d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0363p f7642a = new C0363p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f7643b = new StringBuilder();

    public static String a(C0363p c0363p, StringBuilder sb) {
        boolean z4 = false;
        sb.setLength(0);
        int i = c0363p.f5314b;
        int i5 = c0363p.f5315c;
        while (i < i5 && !z4) {
            char c5 = (char) c0363p.f5313a[i];
            if ((c5 < 'A' || c5 > 'Z') && ((c5 < 'a' || c5 > 'z') && !((c5 >= '0' && c5 <= '9') || c5 == '#' || c5 == '-' || c5 == '.' || c5 == '_'))) {
                z4 = true;
            } else {
                i++;
                sb.append(c5);
            }
        }
        c0363p.I(i - c0363p.f5314b);
        return sb.toString();
    }

    public static String b(C0363p c0363p, StringBuilder sb) {
        c(c0363p);
        if (c0363p.a() == 0) {
            return null;
        }
        String strA = a(c0363p, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) c0363p.v());
    }

    public static void c(C0363p c0363p) {
        while (true) {
            for (boolean z4 = true; c0363p.a() > 0 && z4; z4 = false) {
                int i = c0363p.f5314b;
                byte[] bArr = c0363p.f5313a;
                byte b4 = bArr[i];
                char c5 = (char) b4;
                if (c5 == '\t' || c5 == '\n' || c5 == '\f' || c5 == '\r' || c5 == ' ') {
                    c0363p.I(1);
                } else {
                    int i5 = c0363p.f5315c;
                    int i6 = i + 2;
                    if (i6 <= i5) {
                        int i7 = i + 1;
                        if (b4 == 47 && bArr[i7] == 42) {
                            while (true) {
                                int i8 = i6 + 1;
                                if (i8 >= i5) {
                                    break;
                                }
                                if (((char) bArr[i6]) == '*' && ((char) bArr[i8]) == '/') {
                                    i6 += 2;
                                    i5 = i6;
                                } else {
                                    i6 = i8;
                                }
                            }
                            c0363p.I(i5 - c0363p.f5314b);
                        }
                    }
                }
            }
            return;
        }
    }
}
