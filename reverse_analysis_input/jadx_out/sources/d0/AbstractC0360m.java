package d0;

import android.media.MediaFormat;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import b3.AbstractC0307a;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: d0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0360m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f5303a = new Object();

    public static String a(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (f5303a) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void c(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(String str, boolean z4) throws C0353f {
        if (!z4) {
            throw new C0353f(str);
        }
    }

    public static void e(int i, int i5) {
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void f(Object obj) {
        obj.getClass();
    }

    public static void g(String str, boolean z4) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void h(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void i(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    public static void k(String str, String str2) {
        synchronized (f5303a) {
            Log.d(str, a(str2, null));
        }
    }

    public static void l(String str, String str2) {
        synchronized (f5303a) {
            Log.e(str, a(str2, null));
        }
    }

    public static void m(String str, String str2, Throwable th) {
        synchronized (f5303a) {
            Log.e(str, a(str2, th));
        }
    }

    public static String n(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static int[] o(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static void p(String str, String str2) {
        synchronized (f5303a) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean q(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean r(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean s(XmlPullParser xmlPullParser, String str) {
        return r(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static void t(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static String u(StringBuilder sb, int i, int i5) {
        int i6;
        int iLastIndexOf;
        if (i >= i5) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i7 = i;
        int i8 = i7;
        while (i7 <= i5) {
            if (i7 == i5) {
                i6 = i7;
            } else if (sb.charAt(i7) == '/') {
                i6 = i7 + 1;
            } else {
                i7++;
            }
            int i9 = i8 + 1;
            if (i7 == i9 && sb.charAt(i8) == '.') {
                sb.delete(i8, i6);
                i5 -= i6 - i8;
            } else {
                if (i7 == i8 + 2 && sb.charAt(i8) == '.' && sb.charAt(i9) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i8 - 2) + 1;
                    int i10 = iLastIndexOf > i ? iLastIndexOf : i;
                    sb.delete(i10, i6);
                    i5 -= i6 - i10;
                } else {
                    iLastIndexOf = i7 + 1;
                }
                i8 = iLastIndexOf;
            }
            i7 = i8;
        }
        return sb.toString();
    }

    public static String v(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrO = o(str2);
        if (iArrO[0] != -1) {
            sb.append(str2);
            u(sb, iArrO[1], iArrO[2]);
            return sb.toString();
        }
        int[] iArrO2 = o(str);
        if (iArrO[3] == 0) {
            sb.append((CharSequence) str, 0, iArrO2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrO[2] == 0) {
            sb.append((CharSequence) str, 0, iArrO2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i = iArrO[1];
        if (i != 0) {
            int i5 = iArrO2[0] + 1;
            sb.append((CharSequence) str, 0, i5);
            sb.append(str2);
            return u(sb, iArrO[1] + i5, i5 + iArrO[2]);
        }
        if (str2.charAt(i) == '/') {
            sb.append((CharSequence) str, 0, iArrO2[1]);
            sb.append(str2);
            int i6 = iArrO2[1];
            return u(sb, i6, iArrO[2] + i6);
        }
        int i7 = iArrO2[0] + 2;
        int i8 = iArrO2[1];
        if (i7 >= i8 || i8 != iArrO2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrO2[2] - 1);
            int i9 = iLastIndexOf == -1 ? iArrO2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i9);
            sb.append(str2);
            return u(sb, iArrO2[1], i9 + iArrO[2]);
        }
        sb.append((CharSequence) str, 0, i8);
        sb.append('/');
        sb.append(str2);
        int i10 = iArrO2[1];
        return u(sb, i10, iArrO[2] + i10 + 1);
    }

    public static Uri w(String str, String str2) {
        return Uri.parse(v(str, str2));
    }

    public static void x(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(AbstractC0307a.i("csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static void y(String str, String str2) {
        synchronized (f5303a) {
            Log.w(str, a(str2, null));
        }
    }

    public static void z(String str, String str2, Throwable th) {
        synchronized (f5303a) {
            Log.w(str, a(str2, th));
        }
    }
}
