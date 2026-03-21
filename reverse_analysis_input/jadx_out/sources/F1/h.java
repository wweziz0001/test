package F1;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class h extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pattern f854d;

    public h() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f854d = Pattern.compile("\\A\\d+");
    }

    @Override // F1.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // F1.c
    public final boolean b() {
        int i;
        PackageInfo packageInfoA;
        boolean zB = super.b();
        if (!zB || (i = Build.VERSION.SDK_INT) >= 29) {
            return zB;
        }
        int i5 = E1.a.f636a;
        if (i >= 26) {
            packageInfoA = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfoA = E1.a.a();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfoA = null;
            }
        }
        if (packageInfoA == null) {
            return false;
        }
        Matcher matcher = this.f854d.matcher(packageInfoA.versionName);
        return matcher.find() && Integer.parseInt(packageInfoA.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
