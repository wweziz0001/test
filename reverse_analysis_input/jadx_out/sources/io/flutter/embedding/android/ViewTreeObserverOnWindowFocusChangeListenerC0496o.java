package io.flutter.embedding.android;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: io.flutter.embedding.android.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnWindowFocusChangeListenerC0496o implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f6586a;

    public ViewTreeObserverOnWindowFocusChangeListenerC0496o(r rVar) {
        this.f6586a = rVar;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z4) {
        int i = r.f6606j0;
        r rVar = this.f6586a;
        if (rVar.r("onWindowFocusChanged")) {
            rVar.f6608g0.r(z4);
        }
    }
}
