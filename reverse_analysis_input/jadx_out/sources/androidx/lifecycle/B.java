package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        N3.h.e(activity, "activity");
        N3.h.e(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
