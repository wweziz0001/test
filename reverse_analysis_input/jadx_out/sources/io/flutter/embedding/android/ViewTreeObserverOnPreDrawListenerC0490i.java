package io.flutter.embedding.android;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: io.flutter.embedding.android.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0490i implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D f6570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0492k f6571m;

    public ViewTreeObserverOnPreDrawListenerC0490i(C0492k c0492k, D d5) {
        this.f6571m = c0492k;
        this.f6570l = d5;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0492k c0492k = this.f6571m;
        if (c0492k.f6579h && c0492k.f6577f != null) {
            this.f6570l.getViewTreeObserver().removeOnPreDrawListener(this);
            c0492k.f6577f = null;
        }
        return c0492k.f6579h;
    }
}
