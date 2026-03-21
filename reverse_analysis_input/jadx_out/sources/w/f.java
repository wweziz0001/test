package w;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z1.f f10407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z0.g f10408b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f10407a = new k();
        } else if (i >= 28) {
            f10407a = new j();
        } else if (i >= 26) {
            f10407a = new i();
        } else {
            Method method = h.f10416s;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f10407a = new h();
            } else {
                f10407a = new g();
            }
        }
        f10408b = new Z0.g(16);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface a(android.content.Context r13, v.e r14, android.content.res.Resources r15, int r16, java.lang.String r17, int r18, int r19, Z0.e r20) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.f.a(android.content.Context, v.e, android.content.res.Resources, int, java.lang.String, int, int, Z0.e):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i, String str, int i5, int i6) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i5 + '-' + i + '-' + i6;
    }
}
