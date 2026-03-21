package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class q extends ViewGroup {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f6816l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f6817m;

    public q(Context context) {
        super(context);
        this.f6816l = new Rect();
        this.f6817m = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f6816l.set(i, i5, i6, i7);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f6816l, layoutParams.x, layoutParams.y, this.f6817m);
            Rect rect = this.f6817m;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            getChildAt(i6).measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5), Integer.MIN_VALUE));
        }
        super.onMeasure(i, i5);
    }
}
