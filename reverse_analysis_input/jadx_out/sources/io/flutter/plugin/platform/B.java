package io.flutter.plugin.platform;

import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public final class B implements WindowManager {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WindowManager f6741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q f6742m;

    public B(WindowManager windowManager, q qVar) {
        this.f6741l = windowManager;
        this.f6742m = qVar;
    }

    @Override // android.view.WindowManager
    public final void addCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f6741l.addCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        q qVar = this.f6742m;
        if (qVar == null) {
            Log.w("PlatformViewsController", "Embedded view called addView while detached from presentation");
        } else {
            qVar.addView(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public final WindowMetrics getCurrentWindowMetrics() {
        return this.f6741l.getCurrentWindowMetrics();
    }

    @Override // android.view.WindowManager
    public final Display getDefaultDisplay() {
        return this.f6741l.getDefaultDisplay();
    }

    @Override // android.view.WindowManager
    public final WindowMetrics getMaximumWindowMetrics() {
        return this.f6741l.getMaximumWindowMetrics();
    }

    @Override // android.view.WindowManager
    public final boolean isCrossWindowBlurEnabled() {
        return this.f6741l.isCrossWindowBlurEnabled();
    }

    @Override // android.view.WindowManager
    public final void removeCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f6741l.removeCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public final void removeView(View view) {
        q qVar = this.f6742m;
        if (qVar == null) {
            Log.w("PlatformViewsController", "Embedded view called removeView while detached from presentation");
        } else {
            qVar.removeView(view);
        }
    }

    @Override // android.view.WindowManager
    public final void removeViewImmediate(View view) {
        q qVar = this.f6742m;
        if (qVar == null) {
            Log.w("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
        } else {
            view.clearAnimation();
            qVar.removeView(view);
        }
    }

    @Override // android.view.ViewManager
    public final void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        q qVar = this.f6742m;
        if (qVar == null) {
            Log.w("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
        } else {
            qVar.updateViewLayout(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public final void addCrossWindowBlurEnabledListener(Executor executor, Consumer consumer) {
        this.f6741l.addCrossWindowBlurEnabledListener(executor, consumer);
    }
}
