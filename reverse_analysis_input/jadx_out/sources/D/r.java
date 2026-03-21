package D;

import android.view.VelocityTracker;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static float a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static float b(VelocityTracker velocityTracker, int i, int i5) {
        return velocityTracker.getAxisVelocity(i, i5);
    }

    public static boolean c(VelocityTracker velocityTracker, int i) {
        return velocityTracker.isAxisSupported(i);
    }
}
