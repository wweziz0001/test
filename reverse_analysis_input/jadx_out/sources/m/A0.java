package m;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends TouchDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f8231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f8232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f8233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f8234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8236f;

    public A0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f8235e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f8232b = rect3;
        Rect rect4 = new Rect();
        this.f8234d = rect4;
        Rect rect5 = new Rect();
        this.f8233c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f8231a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        int x4 = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z6 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z5 = this.f8236f;
                if (z5 && !this.f8234d.contains(x4, y)) {
                    z6 = z5;
                    z4 = false;
                }
            } else {
                if (action == 3) {
                    z5 = this.f8236f;
                    this.f8236f = false;
                }
                z4 = true;
                z6 = false;
            }
            z6 = z5;
            z4 = true;
        } else if (this.f8232b.contains(x4, y)) {
            this.f8236f = true;
            z4 = true;
        } else {
            z4 = true;
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        Rect rect = this.f8233c;
        View view = this.f8231a;
        if (!z4 || rect.contains(x4, y)) {
            motionEvent.setLocation(x4 - rect.left, y - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
