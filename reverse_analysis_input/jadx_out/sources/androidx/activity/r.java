package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f3762a = new r();

    public final OnBackInvokedCallback a(M3.a aVar) {
        N3.h.e(aVar, "onBackInvoked");
        return new q(aVar, 0);
    }

    public final void b(Object obj, int i, Object obj2) {
        N3.h.e(obj, "dispatcher");
        N3.h.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        N3.h.e(obj, "dispatcher");
        N3.h.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
