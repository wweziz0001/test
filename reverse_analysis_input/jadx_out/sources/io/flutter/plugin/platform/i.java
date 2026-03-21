package io.flutter.plugin.platform;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import i3.ViewTreeObserverOnGlobalFocusChangeListenerC0481a;
import io.flutter.embedding.android.C0482a;

/* JADX INFO: loaded from: classes.dex */
public final class i extends FrameLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6759l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6760m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6761n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6762o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0482a f6763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h f6764q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewTreeObserverOnGlobalFocusChangeListenerC0481a f6765r;

    public i(Activity activity) {
        super(activity);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        h hVar = this.f6764q;
        if (hVar == null) {
            super.draw(canvas);
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Surface surface = hVar.getSurface();
        if (!surface.isValid()) {
            Log.e("PlatformViewWrapper", "Platform view cannot be composed without a valid RenderTarget surface.");
            return;
        }
        Canvas canvasLockHardwareCanvas = surface.lockHardwareCanvas();
        if (canvasLockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(canvasLockHardwareCanvas);
        } finally {
            this.f6764q.scheduleFrame();
            surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f6765r;
    }

    public int getRenderTargetHeight() {
        h hVar = this.f6764q;
        if (hVar != null) {
            return hVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        h hVar = this.f6764q;
        if (hVar != null) {
            return hVar.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f6763p == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i = this.f6761n;
            this.f6759l = i;
            int i5 = this.f6762o;
            this.f6760m = i5;
            matrix.postTranslate(i, i5);
        } else if (action != 2) {
            matrix.postTranslate(this.f6761n, this.f6762o);
        } else {
            matrix.postTranslate(this.f6759l, this.f6760m);
            this.f6759l = this.f6761n;
            this.f6760m = this.f6762o;
        }
        this.f6763p.d(motionEvent, matrix);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.f6761n = layoutParams.leftMargin;
        this.f6762o = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        ViewTreeObserverOnGlobalFocusChangeListenerC0481a viewTreeObserverOnGlobalFocusChangeListenerC0481a;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && (viewTreeObserverOnGlobalFocusChangeListenerC0481a = this.f6765r) != null) {
            this.f6765r = null;
            viewTreeObserver.removeOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0481a);
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2.isAlive() && this.f6765r == null) {
            ViewTreeObserverOnGlobalFocusChangeListenerC0481a viewTreeObserverOnGlobalFocusChangeListenerC0481a2 = new ViewTreeObserverOnGlobalFocusChangeListenerC0481a(this, onFocusChangeListener);
            this.f6765r = viewTreeObserverOnGlobalFocusChangeListenerC0481a2;
            viewTreeObserver2.addOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0481a2);
        }
    }

    public void setTouchProcessor(C0482a c0482a) {
        this.f6763p = c0482a;
    }
}
