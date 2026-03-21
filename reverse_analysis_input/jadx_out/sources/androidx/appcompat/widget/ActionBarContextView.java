package androidx.appcompat.widget;

import D.I;
import a.AbstractC0149a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.hqp_mobile_app.R;
import h.AbstractC0441a;
import java.lang.reflect.Field;
import m.Z0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3818l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3820n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f3821o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f3822p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f3823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f3824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f3825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f3826t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f3827u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f3828v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3829w;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0441a.f5885d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC0149a.u(context, resourceId);
        Field field = I.f300a;
        setBackground(drawable);
        this.f3827u = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f3828v = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f3818l = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int b(View view, int i, int i5, int i6, boolean z4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = ((i6 - measuredHeight) / 2) + i5;
        if (z4) {
            view.layout(i - measuredWidth, i7, i, measuredHeight + i7);
        } else {
            view.layout(i, i7, i + measuredWidth, measuredHeight + i7);
        }
        return z4 ? -measuredWidth : measuredWidth;
    }

    public final void a() {
        if (this.f3824r == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f3824r = linearLayout;
            this.f3825s = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f3826t = (TextView) this.f3824r.findViewById(R.id.action_bar_subtitle);
            int i = this.f3827u;
            if (i != 0) {
                this.f3825s.setTextAppearance(getContext(), i);
            }
            int i5 = this.f3828v;
            if (i5 != 0) {
                this.f3826t.setTextAppearance(getContext(), i5);
            }
        }
        this.f3825s.setText(this.f3821o);
        this.f3826t.setText(this.f3822p);
        boolean zIsEmpty = TextUtils.isEmpty(this.f3821o);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f3822p);
        this.f3826t.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f3824r.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f3824r.getParent() == null) {
            addView(this.f3824r);
        }
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            super.setVisibility(i);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f3818l;
    }

    public CharSequence getSubtitle() {
        return this.f3822p;
    }

    public CharSequence getTitle() {
        return this.f3821o;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0441a.f5882a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3820n = false;
        }
        if (!this.f3820n) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f3820n = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3820n = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        boolean zA = Z0.a(this);
        int paddingRight = zA ? (i6 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f3824r;
        if (linearLayout != null && this.f3823q == null && linearLayout.getVisibility() != 8) {
            paddingRight += b(this.f3824r, paddingRight, paddingTop, paddingTop2, zA);
        }
        View view = this.f3823q;
        if (view != null) {
            b(view, paddingRight, paddingTop, paddingTop2, zA);
        }
        if (zA) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i5) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f3818l;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i5);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.f3824r;
        if (linearLayout != null && this.f3823q == null) {
            if (this.f3829w) {
                this.f3824r.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f3824r.getMeasuredWidth();
                boolean z4 = measuredWidth <= paddingLeft;
                if (z4) {
                    paddingLeft -= measuredWidth;
                }
                this.f3824r.setVisibility(z4 ? 0 : 8);
            } else {
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), iMakeMeasureSpec);
                paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
            }
        }
        View view = this.f3823q;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i6 = layoutParams.width;
            int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i6 >= 0) {
                paddingLeft = Math.min(i6, paddingLeft);
            }
            int i8 = layoutParams.height;
            int i9 = i8 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i8 >= 0) {
                iMin = Math.min(i8, iMin);
            }
            this.f3823q.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(iMin, i9));
        }
        if (this.f3818l > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i10) {
                i10 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3819m = false;
        }
        if (!this.f3819m) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f3819m = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3819m = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f3818l = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f3823q;
        if (view2 != null) {
            removeView(view2);
        }
        this.f3823q = view;
        if (view != null && (linearLayout = this.f3824r) != null) {
            removeView(linearLayout);
            this.f3824r = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f3822p = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f3821o = charSequence;
        a();
        I.e(this, charSequence);
    }

    public void setTitleOptional(boolean z4) {
        if (z4 != this.f3829w) {
            requestLayout();
        }
        this.f3829w = z4;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
