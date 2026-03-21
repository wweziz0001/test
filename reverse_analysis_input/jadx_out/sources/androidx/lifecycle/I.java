package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class I extends Fragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f4484m = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public E f4485l;

    public final void a(EnumC0272n enumC0272n) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            N3.h.d(activity, "activity");
            M.d(activity, enumC0272n);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0272n.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0272n.ON_DESTROY);
        this.f4485l = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0272n.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        E e5 = this.f4485l;
        if (e5 != null) {
            ((F) e5.f4474m).a();
        }
        a(EnumC0272n.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        E e5 = this.f4485l;
        if (e5 != null) {
            F f2 = (F) e5.f4474m;
            int i = f2.f4476l + 1;
            f2.f4476l = i;
            if (i == 1 && f2.f4479o) {
                f2.f4481q.e(EnumC0272n.ON_START);
                f2.f4479o = false;
            }
        }
        a(EnumC0272n.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0272n.ON_STOP);
    }
}
