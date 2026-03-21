package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import h.AbstractC0441a;
import java.lang.ref.WeakReference;
import m.Y0;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4002l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4003m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WeakReference f4004n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LayoutInflater f4005o;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4002l = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0441a.f5902v, 0, 0);
        this.f4003m = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f4002l = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f4003m;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f4005o;
    }

    public int getLayoutResource() {
        return this.f4002l;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f4003m = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f4005o = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f4002l = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f4004n;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            ViewParent parent = getParent();
            if (!(parent instanceof ViewGroup)) {
                throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
            }
            if (this.f4002l == 0) {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflaterFrom = this.f4005o;
            if (layoutInflaterFrom == null) {
                layoutInflaterFrom = LayoutInflater.from(getContext());
            }
            View viewInflate = layoutInflaterFrom.inflate(this.f4002l, viewGroup, false);
            int i5 = this.f4003m;
            if (i5 != -1) {
                viewInflate.setId(i5);
            }
            int iIndexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
            } else {
                viewGroup.addView(viewInflate, iIndexOfChild);
            }
            this.f4004n = new WeakReference(viewInflate);
        }
    }

    public void setOnInflateListener(Y0 y02) {
    }
}
