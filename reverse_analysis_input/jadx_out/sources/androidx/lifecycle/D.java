package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0266h {
    final /* synthetic */ F this$0;

    public D(F f2) {
        this.this$0 = f2;
    }

    @Override // androidx.lifecycle.AbstractC0266h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        N3.h.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = I.f4484m;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            N3.h.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((I) fragmentFindFragmentByTag).f4485l = this.this$0.f4483s;
        }
    }

    @Override // androidx.lifecycle.AbstractC0266h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        N3.h.e(activity, "activity");
        F f2 = this.this$0;
        int i = f2.f4477m - 1;
        f2.f4477m = i;
        if (i == 0) {
            Handler handler = f2.f4480p;
            N3.h.b(handler);
            handler.postDelayed(f2.f4482r, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        N3.h.e(activity, "activity");
        B.a(activity, new C(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0266h, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        N3.h.e(activity, "activity");
        F f2 = this.this$0;
        int i = f2.f4476l - 1;
        f2.f4476l = i;
        if (i == 0 && f2.f4478n) {
            f2.f4481q.e(EnumC0272n.ON_STOP);
            f2.f4479o = true;
        }
    }
}
