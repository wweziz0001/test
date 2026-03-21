package D;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: D.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0017q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f362l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ViewTreeObserver f363m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Runnable f364n;

    public ViewTreeObserverOnPreDrawListenerC0017q(View view, Runnable runnable) {
        this.f362l = view;
        this.f363m = view.getViewTreeObserver();
        this.f364n = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0017q viewTreeObserverOnPreDrawListenerC0017q = new ViewTreeObserverOnPreDrawListenerC0017q(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0017q);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0017q);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f363m.isAlive();
        View view = this.f362l;
        if (zIsAlive) {
            this.f363m.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f364n.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f363m = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f363m.isAlive();
        View view2 = this.f362l;
        if (zIsAlive) {
            this.f363m.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
