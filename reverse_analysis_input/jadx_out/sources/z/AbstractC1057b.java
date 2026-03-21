package z;

import N3.h;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: z.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1057b {
    static {
        int i = Build.VERSION.SDK_INT;
        C1056a c1056a = C1056a.f11117a;
        if (i >= 30) {
            c1056a.a(30);
        }
        if (i >= 30) {
            c1056a.a(31);
        }
        if (i >= 30) {
            c1056a.a(33);
        }
        if (i >= 30) {
            c1056a.a(1000000);
        }
    }

    public static final boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 32) {
                String str = Build.VERSION.CODENAME;
                h.d(str, "CODENAME");
                if (!"REL".equals(str)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = str.toUpperCase(locale);
                    h.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase2 = "Tiramisu".toUpperCase(locale);
                    h.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (upperCase.compareTo(upperCase2) >= 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
