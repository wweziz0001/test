package t;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence[] f9733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f9735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f9736e;

    public c0(String str, CharSequence[] charSequenceArr, boolean z4, Bundle bundle, HashSet hashSet) {
        this.f9732a = str;
        this.f9733b = charSequenceArr;
        this.f9734c = z4;
        this.f9735d = bundle;
        this.f9736e = hashSet;
    }

    public static RemoteInput a(c0 c0Var) {
        c0Var.getClass();
        RemoteInput.Builder builderAddExtras = new RemoteInput.Builder("FlutterLocalNotificationsPluginInputResult").setLabel(c0Var.f9732a).setChoices(c0Var.f9733b).setAllowFreeFormInput(c0Var.f9734c).addExtras(c0Var.f9735d);
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator it = c0Var.f9736e.iterator();
            while (it.hasNext()) {
                a0.d(builderAddExtras, (String) it.next(), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            b0.b(builderAddExtras, 0);
        }
        return builderAddExtras.build();
    }
}
