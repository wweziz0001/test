package io.flutter.embedding.android;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: renamed from: io.flutter.embedding.android.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0484c implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0488g f6567a;

    public C0484c(AbstractActivityC0488g abstractActivityC0488g) {
        this.f6567a = abstractActivityC0488g;
    }

    public final void onBackCancelled() {
        this.f6567a.cancelBackGesture();
    }

    public final void onBackInvoked() {
        this.f6567a.commitBackGesture();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        this.f6567a.updateBackGestureProgress(backEvent);
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.f6567a.startBackGesture(backEvent);
    }
}
