package androidx.activity;

import android.window.OnBackInvokedCallback;
import io.flutter.embedding.android.AbstractActivityC0488g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3761b;

    public /* synthetic */ q(Object obj, int i) {
        this.f3760a = i;
        this.f3761b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f3760a) {
            case 0:
                M3.a aVar = (M3.a) this.f3761b;
                N3.h.e(aVar, "$onBackInvoked");
                aVar.d();
                break;
            case 1:
                ((AbstractActivityC0488g) this.f3761b).onBackPressed();
                break;
            default:
                ((Runnable) this.f3761b).run();
                break;
        }
    }
}
