package androidx.lifecycle;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0266h {
    final /* synthetic */ F this$0;

    public C(F f2) {
        this.this$0 = f2;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        N3.h.e(activity, "activity");
        this.this$0.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        N3.h.e(activity, "activity");
        F f2 = this.this$0;
        int i = f2.f4476l + 1;
        f2.f4476l = i;
        if (i == 1 && f2.f4479o) {
            f2.f4481q.e(EnumC0272n.ON_START);
            f2.f4479o = false;
        }
    }
}
