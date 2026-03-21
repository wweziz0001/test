package K2;

import j$.util.DesugarTimeZone;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f1265a = DesugarTimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i, char c5) {
        return i < str.length() && str.charAt(i) == c5;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date b(java.lang.String r18, java.text.ParsePosition r19) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(int i, String str, int i5) {
        int i6;
        int i7;
        if (i < 0 || i5 > str.length() || i > i5) {
            throw new NumberFormatException(str);
        }
        if (i < i5) {
            i7 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i5));
            }
            i6 = -iDigit;
        } else {
            i6 = 0;
            i7 = i;
        }
        while (i7 < i5) {
            int i8 = i7 + 1;
            int iDigit2 = Character.digit(str.charAt(i7), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i5));
            }
            i6 = (i6 * 10) - iDigit2;
            i7 = i8;
        }
        return -i6;
    }
}
