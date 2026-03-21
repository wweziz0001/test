package androidx.appcompat.widget;

import D.I;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.example.hqp_mobile_app.R;
import h.AbstractC0441a;
import java.lang.reflect.Field;
import m.AbstractC0609p0;
import m.C0578a;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3809l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f3810m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f3811n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f3812o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f3813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f3814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f3815r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3816s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f3817t;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0578a c0578a = new C0578a(this);
        Field field = I.f300a;
        setBackground(c0578a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0441a.f5882a);
        boolean z4 = false;
        this.f3812o = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f3813p = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f3817t = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f3815r = true;
            this.f3814q = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f3815r ? !(this.f3812o != null || this.f3813p != null) : this.f3814q == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3812o;
        if (drawable != null && drawable.isStateful()) {
            this.f3812o.setState(getDrawableState());
        }
        Drawable drawable2 = this.f3813p;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f3813p.setState(getDrawableState());
        }
        Drawable drawable3 = this.f3814q;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f3814q.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3812o;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3813p;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f3814q;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3810m = findViewById(R.id.action_bar);
        this.f3811n = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f3809l || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        super.onLayout(z4, i, i5, i6, i7);
        boolean z5 = true;
        if (this.f3815r) {
            Drawable drawable = this.f3814q;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z5 = false;
            }
        } else {
            if (this.f3812o == null) {
                z5 = false;
            } else if (this.f3810m.getVisibility() == 0) {
                this.f3812o.setBounds(this.f3810m.getLeft(), this.f3810m.getTop(), this.f3810m.getRight(), this.f3810m.getBottom());
            } else {
                View view = this.f3811n;
                if (view == null || view.getVisibility() != 0) {
                    this.f3812o.setBounds(0, 0, 0, 0);
                } else {
                    this.f3812o.setBounds(this.f3811n.getLeft(), this.f3811n.getTop(), this.f3811n.getRight(), this.f3811n.getBottom());
                }
            }
            this.f3816s = false;
        }
        if (z5) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        int i6;
        if (this.f3810m == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i6 = this.f3817t) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i5);
        if (this.f3810m == null) {
            return;
        }
        View.MeasureSpec.getMode(i5);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f3812o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3812o);
        }
        this.f3812o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f3810m;
            if (view != null) {
                this.f3812o.setBounds(view.getLeft(), this.f3810m.getTop(), this.f3810m.getRight(), this.f3810m.getBottom());
            }
        }
        boolean z4 = false;
        if (!this.f3815r ? !(this.f3812o != null || this.f3813p != null) : this.f3814q == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f3814q;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f3814q);
        }
        this.f3814q = drawable;
        boolean z4 = this.f3815r;
        boolean z5 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z4 && (drawable2 = this.f3814q) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z4 ? !(this.f3812o != null || this.f3813p != null) : this.f3814q == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f3813p;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3813p);
        }
        this.f3813p = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f3816s && this.f3813p != null) {
                throw null;
            }
        }
        boolean z4 = false;
        if (!this.f3815r ? !(this.f3812o != null || this.f3813p != null) : this.f3814q == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z4) {
        this.f3809l = z4;
        setDescendantFocusability(z4 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z4 = i == 0;
        Drawable drawable = this.f3812o;
        if (drawable != null) {
            drawable.setVisible(z4, false);
        }
        Drawable drawable2 = this.f3813p;
        if (drawable2 != null) {
            drawable2.setVisible(z4, false);
        }
        Drawable drawable3 = this.f3814q;
        if (drawable3 != null) {
            drawable3.setVisible(z4, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3812o;
        boolean z4 = this.f3815r;
        return (drawable == drawable2 && !z4) || (drawable == this.f3813p && this.f3816s) || ((drawable == this.f3814q && z4) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public void setTabContainer(AbstractC0609p0 abstractC0609p0) {
    }
}
