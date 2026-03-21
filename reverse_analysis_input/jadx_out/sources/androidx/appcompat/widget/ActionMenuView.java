package androidx.appcompat.widget;

import a0.C0200z;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.lifecycle.E;
import l.InterfaceC0549g;
import l.MenuC0550h;
import l.MenuItemC0551i;
import m.C0588f;
import m.C0592h;
import m.C0594i;
import m.C0598k;
import m.InterfaceC0596j;
import m.InterfaceC0600l;
import m.L0;
import m.W;
import m.X;
import m.Z0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends X implements InterfaceC0549g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public MenuC0550h f3854A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Context f3855B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f3856C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C0594i f3857D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public L0 f3858E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f3859F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f3860G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f3861H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f3862I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public InterfaceC0600l f3863J;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f3861H = (int) (56.0f * f2);
        this.f3862I = (int) (f2 * 4.0f);
        this.f3855B = context;
        this.f3856C = 0;
    }

    public static C0598k h() {
        C0598k c0598k = new C0598k(-2, -2);
        c0598k.f8434a = false;
        ((LinearLayout.LayoutParams) c0598k).gravity = 16;
        return c0598k;
    }

    public static C0598k i(ViewGroup.LayoutParams layoutParams) {
        C0598k c0598k;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof C0598k) {
            C0598k c0598k2 = (C0598k) layoutParams;
            c0598k = new C0598k(c0598k2);
            c0598k.f8434a = c0598k2.f8434a;
        } else {
            c0598k = new C0598k(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0598k).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0598k).gravity = 16;
        }
        return c0598k;
    }

    @Override // l.InterfaceC0549g
    public final boolean a(MenuItemC0551i menuItemC0551i) {
        return this.f3854A.p(menuItemC0551i, null, 0);
    }

    @Override // m.X, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0598k;
    }

    @Override // m.X
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ W generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // m.X
    /* JADX INFO: renamed from: e */
    public final W generateLayoutParams(AttributeSet attributeSet) {
        return new C0598k(getContext(), attributeSet);
    }

    @Override // m.X
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ W generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // m.X, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // m.X, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f3854A == null) {
            Context context = getContext();
            MenuC0550h menuC0550h = new MenuC0550h(context);
            this.f3854A = menuC0550h;
            menuC0550h.f7739e = new E(this, 16);
            C0594i c0594i = new C0594i(context);
            this.f3857D = c0594i;
            c0594i.f8427v = true;
            c0594i.f8428w = true;
            c0594i.f8421p = new C0200z(21);
            this.f3854A.b(c0594i, this.f3855B);
            C0594i c0594i2 = this.f3857D;
            c0594i2.f8423r = this;
            this.f3854A = c0594i2.f8419n;
        }
        return this.f3854A;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0594i c0594i = this.f3857D;
        C0592h c0592h = c0594i.f8424s;
        if (c0592h != null) {
            return c0592h.getDrawable();
        }
        if (c0594i.f8426u) {
            return c0594i.f8425t;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f3856C;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i) {
        boolean zA = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0596j)) {
            zA = ((InterfaceC0596j) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0596j)) ? zA : zA | ((InterfaceC0596j) childAt2).c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0594i c0594i = this.f3857D;
        if (c0594i != null) {
            c0594i.e();
            C0588f c0588f = this.f3857D.f8412C;
            if (c0588f == null || !c0588f.b()) {
                return;
            }
            this.f3857D.g();
            this.f3857D.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0594i c0594i = this.f3857D;
        if (c0594i != null) {
            c0594i.g();
            C0588f c0588f = c0594i.f8413D;
            if (c0588f == null || !c0588f.b()) {
                return;
            }
            c0588f.i.dismiss();
        }
    }

    @Override // m.X, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        int width;
        int paddingLeft;
        if (!this.f3859F) {
            super.onLayout(z4, i, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i7 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i6 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean zA = Z0.a(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0598k c0598k = (C0598k) childAt.getLayoutParams();
                if (c0598k.f8434a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0598k).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0598k).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0598k).leftMargin) + ((LinearLayout.LayoutParams) c0598k).rightMargin;
                    j(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int iMax = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                C0598k c0598k2 = (C0598k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0598k2.f8434a) {
                    int i18 = width2 - ((LinearLayout.LayoutParams) c0598k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0598k2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            C0598k c0598k3 = (C0598k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0598k3.f8434a) {
                int i21 = paddingLeft2 + ((LinearLayout.LayoutParams) c0598k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c0598k3).rightMargin + iMax + i21;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // m.X, android.view.View
    public final void onMeasure(int i, int i5) {
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        int i9;
        int i10;
        ?? r4;
        int i11;
        int i12;
        int i13;
        MenuC0550h menuC0550h;
        boolean z6 = this.f3859F;
        boolean z7 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f3859F = z7;
        if (z6 != z7) {
            this.f3860G = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f3859F && (menuC0550h = this.f3854A) != null && size != this.f3860G) {
            this.f3860G = size;
            menuC0550h.o(true);
        }
        int childCount = getChildCount();
        if (!this.f3859F || childCount <= 0) {
            for (int i14 = 0; i14 < childCount; i14++) {
                C0598k c0598k = (C0598k) getChildAt(i14).getLayoutParams();
                ((LinearLayout.LayoutParams) c0598k).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0598k).leftMargin = 0;
            }
            super.onMeasure(i, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i5);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingBottom, -2);
        int i15 = size2 - paddingRight;
        int i16 = this.f3861H;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = (i18 / i17) + i16;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i20 = 0;
        int iMax2 = 0;
        int i21 = 0;
        boolean z8 = false;
        int i22 = 0;
        long j5 = 0;
        while (true) {
            i6 = this.f3862I;
            if (i21 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i21);
            int i23 = size3;
            int i24 = i15;
            if (childAt.getVisibility() == 8) {
                i11 = mode;
                i12 = paddingBottom;
            } else {
                boolean z9 = childAt instanceof ActionMenuItemView;
                int i25 = i20 + 1;
                if (z9) {
                    childAt.setPadding(i6, 0, i6, 0);
                }
                C0598k c0598k2 = (C0598k) childAt.getLayoutParams();
                c0598k2.f8439f = false;
                c0598k2.f8436c = 0;
                c0598k2.f8435b = 0;
                c0598k2.f8437d = false;
                ((LinearLayout.LayoutParams) c0598k2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0598k2).rightMargin = 0;
                c0598k2.f8438e = z9 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i26 = c0598k2.f8434a ? 1 : i17;
                C0598k c0598k3 = (C0598k) childAt.getLayoutParams();
                i11 = mode;
                i12 = paddingBottom;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z9 ? (ActionMenuItemView) childAt : null;
                boolean z10 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i26 <= 0 || (z10 && i26 < 2)) {
                    i13 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i26 * i19, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i13 = measuredWidth / i19;
                    if (measuredWidth % i19 != 0) {
                        i13++;
                    }
                    if (z10 && i13 < 2) {
                        i13 = 2;
                    }
                }
                c0598k3.f8437d = !c0598k3.f8434a && z10;
                c0598k3.f8435b = i13;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i19, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i13);
                if (c0598k2.f8437d) {
                    i22++;
                }
                if (c0598k2.f8434a) {
                    z8 = true;
                }
                i17 -= i13;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i13 == 1) {
                    j5 |= (long) (1 << i21);
                }
                i20 = i25;
            }
            i21++;
            size3 = i23;
            i15 = i24;
            paddingBottom = i12;
            mode = i11;
        }
        int i27 = mode;
        int i28 = i15;
        int i29 = size3;
        boolean z11 = z8 && i20 == 2;
        boolean z12 = false;
        while (i22 > 0 && i17 > 0) {
            int i30 = Integer.MAX_VALUE;
            int i31 = 0;
            int i32 = 0;
            long j6 = 0;
            while (i32 < childCount2) {
                C0598k c0598k4 = (C0598k) getChildAt(i32).getLayoutParams();
                boolean z13 = z12;
                if (c0598k4.f8437d) {
                    int i33 = c0598k4.f8435b;
                    if (i33 < i30) {
                        j6 = 1 << i32;
                        i30 = i33;
                        i31 = 1;
                    } else if (i33 == i30) {
                        j6 |= 1 << i32;
                        i31++;
                    }
                }
                i32++;
                z12 = z13;
            }
            z4 = z12;
            j5 |= j6;
            if (i31 > i17) {
                break;
            }
            int i34 = i30 + 1;
            int i35 = 0;
            while (i35 < childCount2) {
                View childAt2 = getChildAt(i35);
                C0598k c0598k5 = (C0598k) childAt2.getLayoutParams();
                int i36 = iMax;
                int i37 = childMeasureSpec;
                int i38 = childCount2;
                long j7 = 1 << i35;
                if ((j6 & j7) != 0) {
                    if (z11 && c0598k5.f8438e) {
                        r4 = 1;
                        r4 = 1;
                        if (i17 == 1) {
                            childAt2.setPadding(i6 + i19, 0, i6, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c0598k5.f8435b += r4;
                    c0598k5.f8439f = r4;
                    i17--;
                } else if (c0598k5.f8435b == i34) {
                    j5 |= j7;
                }
                i35++;
                childMeasureSpec = i37;
                iMax = i36;
                childCount2 = i38;
            }
            z12 = true;
        }
        z4 = z12;
        int i39 = iMax;
        int i40 = childMeasureSpec;
        int i41 = childCount2;
        boolean z14 = !z8 && i20 == 1;
        if (i17 <= 0 || j5 == 0 || (i17 >= i20 - 1 && !z14 && iMax2 <= 1)) {
            i7 = i41;
            z5 = z4;
        } else {
            float fBitCount = Long.bitCount(j5);
            if (!z14) {
                if ((j5 & 1) != 0 && !((C0598k) getChildAt(0).getLayoutParams()).f8438e) {
                    fBitCount -= 0.5f;
                }
                int i42 = i41 - 1;
                if ((j5 & ((long) (1 << i42))) != 0 && !((C0598k) getChildAt(i42).getLayoutParams()).f8438e) {
                    fBitCount -= 0.5f;
                }
            }
            int i43 = fBitCount > 0.0f ? (int) ((i17 * i19) / fBitCount) : 0;
            boolean z15 = z4;
            i7 = i41;
            for (int i44 = 0; i44 < i7; i44++) {
                if ((j5 & ((long) (1 << i44))) != 0) {
                    View childAt3 = getChildAt(i44);
                    C0598k c0598k6 = (C0598k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0598k6.f8436c = i43;
                        c0598k6.f8439f = true;
                        if (i44 == 0 && !c0598k6.f8438e) {
                            ((LinearLayout.LayoutParams) c0598k6).leftMargin = (-i43) / 2;
                        }
                        z15 = true;
                    } else {
                        if (c0598k6.f8434a) {
                            c0598k6.f8436c = i43;
                            c0598k6.f8439f = true;
                            ((LinearLayout.LayoutParams) c0598k6).rightMargin = (-i43) / 2;
                            z15 = true;
                        } else {
                            if (i44 != 0) {
                                ((LinearLayout.LayoutParams) c0598k6).leftMargin = i43 / 2;
                            }
                            if (i44 != i7 - 1) {
                                ((LinearLayout.LayoutParams) c0598k6).rightMargin = i43 / 2;
                            }
                        }
                    }
                }
            }
            z5 = z15;
        }
        if (z5) {
            int i45 = 0;
            while (i45 < i7) {
                View childAt4 = getChildAt(i45);
                C0598k c0598k7 = (C0598k) childAt4.getLayoutParams();
                if (c0598k7.f8439f) {
                    i10 = i40;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0598k7.f8435b * i19) + c0598k7.f8436c, 1073741824), i10);
                } else {
                    i10 = i40;
                }
                i45++;
                i40 = i10;
            }
        }
        if (i27 != 1073741824) {
            i9 = i28;
            i8 = i39;
        } else {
            i8 = i29;
            i9 = i28;
        }
        setMeasuredDimension(i9, i8);
    }

    public void setExpandedActionViewsExclusive(boolean z4) {
        this.f3857D.f8410A = z4;
    }

    public void setOnMenuItemClickListener(InterfaceC0600l interfaceC0600l) {
        this.f3863J = interfaceC0600l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0594i c0594i = this.f3857D;
        C0592h c0592h = c0594i.f8424s;
        if (c0592h != null) {
            c0592h.setImageDrawable(drawable);
        } else {
            c0594i.f8426u = true;
            c0594i.f8425t = drawable;
        }
    }

    public void setOverflowReserved(boolean z4) {
    }

    public void setPopupTheme(int i) {
        if (this.f3856C != i) {
            this.f3856C = i;
            if (i == 0) {
                this.f3855B = getContext();
            } else {
                this.f3855B = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0594i c0594i) {
        this.f3857D = c0594i;
        c0594i.f8423r = this;
        this.f3854A = c0594i.f8419n;
    }

    @Override // m.X, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0598k(getContext(), attributeSet);
    }
}
