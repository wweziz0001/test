package D;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {
    public static int a(ViewConfiguration viewConfiguration, int i, int i5, int i6) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i5, i6);
    }

    public static int b(ViewConfiguration viewConfiguration, int i, int i5, int i6) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i5, i6);
    }
}
