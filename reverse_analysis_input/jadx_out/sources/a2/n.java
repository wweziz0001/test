package a2;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3552a = Q1.q.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z4) {
        String str = f3552a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z5 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z5 = true;
            }
            if (z4 == z5) {
                Q1.q.d().a(str, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z4 ? 1 : 2, 1);
            Q1.q qVarD = Q1.q.d();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z4 ? "enabled" : "disabled");
            qVarD.a(str, sb.toString());
        } catch (Exception e5) {
            Q1.q qVarD2 = Q1.q.d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z4 ? "enabled" : "disabled");
            String string = sb2.toString();
            if (qVarD2.f1838a <= 3) {
                Log.d(str, string, e5);
            }
        }
    }
}
