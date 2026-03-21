package m;

import a0.C0189o;
import a0.C0190p;
import b3.AbstractC0307a;
import v2.AbstractC0919a;
import y3.C1030a;
import y3.C1036g;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class B0 {
    public static int a(int i) {
        for (int i5 : O.i.c(4)) {
            if (g(i5) == i) {
                return i5;
            }
        }
        throw new IllegalArgumentException(AbstractC0307a.i("Invalid rotation degrees specified: ", i));
    }

    public static int b(String str) throws NoSuchFieldException {
        String str2;
        for (int i : O.i.c(2)) {
            if (i == 1) {
                str2 = "Brightness.light";
            } else {
                if (i != 2) {
                    throw null;
                }
                str2 = "Brightness.dark";
            }
            if (str2.equals(str)) {
                return i;
            }
        }
        throw new NoSuchFieldException(AbstractC0307a.j("No such Brightness: ", str));
    }

    public static int c(String str) throws NoSuchFieldException {
        for (int i : O.i.c(5)) {
            String str2 = null;
            if (i != 1) {
                if (i == 2) {
                    str2 = "HapticFeedbackType.lightImpact";
                } else if (i == 3) {
                    str2 = "HapticFeedbackType.mediumImpact";
                } else if (i == 4) {
                    str2 = "HapticFeedbackType.heavyImpact";
                } else {
                    if (i != 5) {
                        throw null;
                    }
                    str2 = "HapticFeedbackType.selectionClick";
                }
            }
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return i;
            }
        }
        throw new NoSuchFieldException(AbstractC0307a.j("No such HapticFeedbackType: ", str));
    }

    public static int d(String str) throws NoSuchFieldException {
        String str2;
        for (int i : O.i.c(3)) {
            if (i == 1) {
                str2 = "SystemSoundType.click";
            } else if (i == 2) {
                str2 = "SystemSoundType.tick";
            } else {
                if (i != 3) {
                    throw null;
                }
                str2 = "SystemSoundType.alert";
            }
            if (str2.equals(str)) {
                return i;
            }
        }
        throw new NoSuchFieldException(AbstractC0307a.j("No such SoundType: ", str));
    }

    public static final boolean e(int i) {
        return !AbstractC0919a.f10358b.get();
    }

    public static final boolean f(int i) {
        Boolean bool;
        if (AbstractC0919a.f10358b.get()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                AbstractC0919a.f10357a.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int g(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 90;
        }
        if (i == 3) {
            return 180;
        }
        if (i == 4) {
            return 270;
        }
        throw null;
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder j(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static void k(C0189o c0189o, F0.K k4) {
        k4.c(new C0190p(c0189o));
    }

    public static void l(String str, String str2, String str3) {
        i4.a.p(new C1030a(str, str2, str3));
    }

    public static void m(String str, String str2, String str3, String str4, Object obj) {
        C1036g.l(str4, obj, B3.d.a(i4.a.p(new C1030a(str, str2, str3))));
    }

    public static void n(C1030a c1030a, String str, Object obj) {
        C1036g.l(str, obj, B3.d.a(i4.a.p(c1030a)));
    }
}
