package androidx.appcompat.widget;

import D.I;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.example.hqp_mobile_app.R;
import h.AbstractC0441a;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3867n;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3867n = -1;
        int[] iArr = AbstractC0441a.i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        I.c(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f3865l = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f3865l);
        }
    }

    private void setStacked(boolean z4) {
        if (this.f3866m != z4) {
            if (!z4 || this.f3865l) {
                this.f3866m = z4;
                setOrientation(z4 ? 1 : 0);
                setGravity(z4 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z4 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        int iMakeMeasureSpec;
        boolean z4;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = 0;
        if (this.f3865l) {
            if (size > this.f3867n && this.f3866m) {
                setStacked(false);
            }
            this.f3867n = size;
        }
        if (this.f3866m || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z4 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z4 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i5);
        if (this.f3865l && !this.f3866m && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z4 = true;
        }
        if (z4) {
            super.onMeasure(i, i5);
        }
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            i6 = -1;
            if (i7 >= childCount) {
                i7 = -1;
                break;
            } else if (getChildAt(i7).getVisibility() == 0) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            View childAt = getChildAt(i7);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f3866m) {
                int i8 = i7 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i8 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i8).getVisibility() == 0) {
                        i6 = i8;
                        break;
                    }
                    i8++;
                }
                paddingBottom = i6 >= 0 ? getChildAt(i6).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        Field field = I.f300a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i5 == 0) {
                super.onMeasure(i, i5);
            }
        }
    }

    public void setAllowStacking(boolean z4) {
        if (this.f3865l != z4) {
            this.f3865l = z4;
            if (!z4 && this.f3866m) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
