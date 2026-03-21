package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class H implements Application.ActivityLifecycleCallbacks {
    public static final G Companion = new G();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        N3.h.e(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new H());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        N3.h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        N3.h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        N3.h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        N3.h.e(activity, "activity");
        int i = I.f4484m;
        M.d(activity, EnumC0272n.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        N3.h.e(activity, "activity");
        int i = I.f4484m;
        M.d(activity, EnumC0272n.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        N3.h.e(activity, "activity");
        int i = I.f4484m;
        M.d(activity, EnumC0272n.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        N3.h.e(activity, "activity");
        int i = I.f4484m;
        M.d(activity, EnumC0272n.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        N3.h.e(activity, "activity");
        int i = I.f4484m;
        M.d(activity, EnumC0272n.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        N3.h.e(activity, "activity");
        int i = I.f4484m;
        M.d(activity, EnumC0272n.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        N3.h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        N3.h.e(activity, "activity");
        N3.h.e(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        N3.h.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        N3.h.e(activity, "activity");
    }
}
