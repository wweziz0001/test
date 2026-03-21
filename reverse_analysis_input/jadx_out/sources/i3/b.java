package i3;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import io.flutter.embedding.android.C0482a;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends FrameLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FlutterMutatorsStack f6479l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f6480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6482o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6483p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0482a f6485r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Paint f6486s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ViewTreeObserverOnGlobalFocusChangeListenerC0481a f6487t;

    public b(Activity activity, float f2, C0482a c0482a) {
        super(activity, null);
        this.f6480m = f2;
        this.f6485r = c0482a;
        this.f6486s = new Paint();
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f6479l.getFinalMatrix());
        float f2 = this.f6480m;
        matrix.preScale(1.0f / f2, 1.0f / f2);
        matrix.postTranslate(-this.f6481n, -this.f6482o);
        return matrix;
    }

    public final void a() {
        ViewTreeObserverOnGlobalFocusChangeListenerC0481a viewTreeObserverOnGlobalFocusChangeListenerC0481a;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (viewTreeObserverOnGlobalFocusChangeListenerC0481a = this.f6487t) == null) {
            return;
        }
        this.f6487t = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0481a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.f6479l.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f6481n, -this.f6482o);
            canvas.clipPath(path);
        }
        int finalOpacity = (int) (this.f6479l.getFinalOpacity() * 255.0f);
        Paint paint = this.f6486s;
        if (paint.getAlpha() != finalOpacity) {
            paint.setAlpha((int) (this.f6479l.getFinalOpacity() * 255.0f));
            setLayerType(2, paint);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0482a c0482a = this.f6485r;
        if (c0482a == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i = this.f6481n;
            this.f6483p = i;
            int i5 = this.f6482o;
            this.f6484q = i5;
            matrix.postTranslate(i, i5);
        } else if (action != 2) {
            matrix.postTranslate(this.f6481n, this.f6482o);
        } else {
            matrix.postTranslate(this.f6483p, this.f6484q);
            this.f6483p = this.f6481n;
            this.f6484q = this.f6482o;
        }
        c0482a.d(motionEvent, matrix);
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

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        a();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f6487t == null) {
            ViewTreeObserverOnGlobalFocusChangeListenerC0481a viewTreeObserverOnGlobalFocusChangeListenerC0481a = new ViewTreeObserverOnGlobalFocusChangeListenerC0481a(onFocusChangeListener, this);
            this.f6487t = viewTreeObserverOnGlobalFocusChangeListenerC0481a;
            viewTreeObserver.addOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0481a);
        }
    }
}
