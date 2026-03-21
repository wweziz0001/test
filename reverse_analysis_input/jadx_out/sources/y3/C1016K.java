package y3;

import android.os.Build;
import android.util.Log;
import android.webkit.WebSettings;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: renamed from: y3.K, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1016K {
    public static void a(WebSettings webSettings, boolean z4) {
        B0.d gVar;
        if (!F1.j.f857b.b()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        try {
            gVar = new B0.d((WebSettingsBoundaryInterface) i4.a.j(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) F1.k.f858a.f190l).convertSettings(webSettings)));
        } catch (ClassCastException e5) {
            if (Build.VERSION.SDK_INT != 30 || !"android.webkit.WebSettingsWrapper".equals(webSettings.getClass().getCanonicalName())) {
                throw e5;
            }
            Log.e("WebSettingsCompat", "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info.", e5);
            gVar = new F1.g(null);
        }
        gVar.s(z4);
    }
}
