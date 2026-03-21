package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import h.AbstractC0441a;

/* JADX INFO: loaded from: classes.dex */
public abstract class X extends ViewGroup {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8358m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8359n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8360o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8361p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8362q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f8363r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8364s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f8365t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f8366u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f8367v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8368w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8369x;
    public int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f8370z;

    public X(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8357l = true;
        this.f8358m = -1;
        this.f8359n = 0;
        this.f8361p = 8388659;
        int[] iArr = AbstractC0441a.f5890j;
        Z1.s sVarM = Z1.s.M(context, attributeSet, iArr, i);
        D.I.c(this, context, iArr, attributeSet, (TypedArray) sVarM.f3086n, i);
        TypedArray typedArray = (TypedArray) sVarM.f3086n;
        int i5 = typedArray.getInt(1, -1);
        if (i5 >= 0) {
            setOrientation(i5);
        }
        int i6 = typedArray.getInt(0, -1);
        if (i6 >= 0) {
            setGravity(i6);
        }
        boolean z4 = typedArray.getBoolean(2, true);
        if (!z4) {
            setBaselineAligned(z4);
        }
        this.f8363r = typedArray.getFloat(4, -1.0f);
        this.f8358m = typedArray.getInt(3, -1);
        this.f8364s = typedArray.getBoolean(7, false);
        setDividerDrawable(sVarM.D(5));
        this.y = typedArray.getInt(8, 0);
        this.f8370z = typedArray.getDimensionPixelSize(6, 0);
        sVarM.O();
    }

    public final void b(Canvas canvas, int i) {
        this.f8367v.setBounds(getPaddingLeft() + this.f8370z, i, (getWidth() - getPaddingRight()) - this.f8370z, this.f8369x + i);
        this.f8367v.draw(canvas);
    }

    public final void c(Canvas canvas, int i) {
        this.f8367v.setBounds(i, getPaddingTop() + this.f8370z, this.f8368w + i, (getHeight() - getPaddingBottom()) - this.f8370z);
        this.f8367v.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof W;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public W generateDefaultLayoutParams() {
        int i = this.f8360o;
        if (i == 0) {
            return new W(-2, -2);
        }
        if (i == 1) {
            return new W(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public W generateLayoutParams(AttributeSet attributeSet) {
        return new W(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public W generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new W(layoutParams);
    }

    public final boolean g(int i) {
        if (i == 0) {
            return (this.y & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.y & 4) != 0;
        }
        if ((this.y & 2) == 0) {
            return false;
        }
        for (int i5 = i - 1; i5 >= 0; i5--) {
            if (getChildAt(i5).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f8358m < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i5 = this.f8358m;
        if (childCount <= i5) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i5);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f8358m == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f8359n;
        if (this.f8360o == 1 && (i = this.f8361p & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f8362q) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f8362q;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((W) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f8358m;
    }

    public Drawable getDividerDrawable() {
        return this.f8367v;
    }

    public int getDividerPadding() {
        return this.f8370z;
    }

    public int getDividerWidth() {
        return this.f8368w;
    }

    public int getGravity() {
        return this.f8361p;
    }

    public int getOrientation() {
        return this.f8360o;
    }

    public int getShowDividers() {
        return this.y;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f8363r;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f8367v == null) {
            return;
        }
        int i5 = 0;
        if (this.f8360o == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i5 < virtualChildCount) {
                View childAt = getChildAt(i5);
                if (childAt != null && childAt.getVisibility() != 8 && g(i5)) {
                    b(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((W) childAt.getLayoutParams())).topMargin) - this.f8369x);
                }
                i5++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                b(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f8369x : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((W) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zA = Z0.a(this);
        while (i5 < virtualChildCount2) {
            View childAt3 = getChildAt(i5);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i5)) {
                W w4 = (W) childAt3.getLayoutParams();
                c(canvas, zA ? childAt3.getRight() + ((LinearLayout.LayoutParams) w4).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) w4).leftMargin) - this.f8368w);
            }
            i5++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                W w5 = (W) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) w5).leftMargin;
                    i = this.f8368w;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) w5).rightMargin;
                }
            } else if (zA) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f8368w;
                right = left - i;
            }
            c(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.X.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:442:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 2208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m.X.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z4) {
        this.f8357l = z4;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f8358m = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f8367v) {
            return;
        }
        this.f8367v = drawable;
        if (drawable != null) {
            this.f8368w = drawable.getIntrinsicWidth();
            this.f8369x = drawable.getIntrinsicHeight();
        } else {
            this.f8368w = 0;
            this.f8369x = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f8370z = i;
    }

    public void setGravity(int i) {
        if (this.f8361p != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f8361p = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i5 = i & 8388615;
        int i6 = this.f8361p;
        if ((8388615 & i6) != i5) {
            this.f8361p = i5 | ((-8388616) & i6);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z4) {
        this.f8364s = z4;
    }

    public void setOrientation(int i) {
        if (this.f8360o != i) {
            this.f8360o = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.y) {
            requestLayout();
        }
        this.y = i;
    }

    public void setVerticalGravity(int i) {
        int i5 = i & 112;
        int i6 = this.f8361p;
        if ((i6 & 112) != i5) {
            this.f8361p = i5 | (i6 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f8363r = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
