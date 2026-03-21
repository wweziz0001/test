package U3;

import a.AbstractC0149a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends j {
    public static boolean c0(String str, String str2) {
        N3.h.e(str, "<this>");
        return g0(0, 2, str, str2, false) >= 0;
    }

    public static boolean d0(String str, String str2, boolean z4) {
        N3.h.e(str2, "suffix");
        return !z4 ? str.endsWith(str2) : j0(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static final int e0(CharSequence charSequence) {
        N3.h.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int f0(CharSequence charSequence, String str, int i, boolean z4) {
        N3.h.e(charSequence, "<this>");
        N3.h.e(str, "string");
        if (!z4 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        R3.c cVar = new R3.c(i, length, 1);
        boolean z5 = charSequence instanceof String;
        int i5 = cVar.f1957n;
        int i6 = cVar.f1956m;
        int i7 = cVar.f1955l;
        if (!z5 || str == null) {
            if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
                while (!k0(i7, str.length(), charSequence, str, z4)) {
                    if (i7 != i6) {
                        i7 += i5;
                    }
                }
                return i7;
            }
            return -1;
        }
        if ((i5 > 0 && i7 <= i6) || (i5 < 0 && i6 <= i7)) {
            while (!j0(0, i7, str.length(), str, (String) charSequence, z4)) {
                if (i7 != i6) {
                    i7 += i5;
                }
            }
            return i7;
        }
        return -1;
    }

    public static /* synthetic */ int g0(int i, int i5, CharSequence charSequence, String str, boolean z4) {
        if ((i5 & 2) != 0) {
            i = 0;
        }
        if ((i5 & 4) != 0) {
            z4 = false;
        }
        return f0(charSequence, str, i, z4);
    }

    public static int h0(String str, char c5, boolean z4, int i) {
        char upperCase;
        char upperCase2;
        if ((i & 4) != 0) {
            z4 = false;
        }
        if (!z4) {
            return str.indexOf(c5, 0);
        }
        char[] cArr = {c5};
        if (!z4) {
            return str.indexOf(cArr[0], 0);
        }
        int iE0 = e0(str);
        if (iE0 >= 0) {
            int i5 = 0;
            while (true) {
                char cCharAt = str.charAt(i5);
                char c6 = cArr[0];
                if (c6 != cCharAt && (!z4 || ((upperCase = Character.toUpperCase(c6)) != (upperCase2 = Character.toUpperCase(cCharAt)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                    if (i5 == iE0) {
                        break;
                    }
                    i5++;
                } else {
                    break;
                }
            }
            return i5;
        }
        return -1;
    }

    public static boolean i0(CharSequence charSequence) {
        N3.h.e(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean j0(int i, int i5, int i6, String str, String str2, boolean z4) {
        N3.h.e(str, "<this>");
        N3.h.e(str2, "other");
        return !z4 ? str.regionMatches(i, str2, i5, i6) : str.regionMatches(z4, i, str2, i5, i6);
    }

    public static final boolean k0(int i, int i5, CharSequence charSequence, String str, boolean z4) {
        char upperCase;
        char upperCase2;
        N3.h.e(str, "<this>");
        N3.h.e(charSequence, "other");
        if (i < 0 || str.length() - i5 < 0 || i > charSequence.length() - i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            char cCharAt = str.charAt(i6);
            char cCharAt2 = charSequence.charAt(i + i6);
            if (cCharAt != cCharAt2 && (!z4 || ((upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                return false;
            }
        }
        return true;
    }

    public static String l0(String str, String str2, String str3) {
        int iF0 = f0(str, str2, 0, false);
        if (iF0 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i5 = 0;
        do {
            sb.append((CharSequence) str, i5, iF0);
            sb.append(str3);
            i5 = iF0 + length;
            if (iF0 >= str.length()) {
                break;
            }
            iF0 = f0(str, str2, iF0 + i, false);
        } while (iF0 > 0);
        sb.append((CharSequence) str, i5, str.length());
        String string = sb.toString();
        N3.h.d(string, "toString(...)");
        return string;
    }

    public static List m0(String str, String[] strArr) {
        boolean z4 = false;
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                int iF0 = f0(str, str2, 0, false);
                if (iF0 == -1) {
                    return AbstractC0149a.y(str.toString());
                }
                ArrayList arrayList = new ArrayList(10);
                int length = 0;
                do {
                    arrayList.add(str.subSequence(length, iF0).toString());
                    length = str2.length() + iF0;
                    iF0 = f0(str, str2, length, false);
                } while (iF0 != -1);
                arrayList.add(str.subSequence(length, str.length()).toString());
                return arrayList;
            }
        }
        c cVar = new c(str, 0, 0, new k(C3.e.S(strArr), z4));
        ArrayList arrayList2 = new ArrayList(C3.h.R(new T3.f(cVar)));
        b bVar = new b(cVar);
        while (bVar.hasNext()) {
            R3.c cVar2 = (R3.c) bVar.next();
            arrayList2.add(str.subSequence(cVar2.f1955l, cVar2.f1956m + 1).toString());
        }
        return arrayList2;
    }

    public static String n0(String str, String str2) {
        N3.h.e(str2, "delimiter");
        int iG0 = g0(0, 6, str, str2, false);
        if (iG0 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iG0, str.length());
        N3.h.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String o0(String str, String str2) {
        N3.h.e(str2, "missingDelimiterValue");
        int iLastIndexOf = str.lastIndexOf(46, e0(str));
        if (iLastIndexOf == -1) {
            return str2;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        N3.h.d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
