package androidx.core.widget;

import B0.d;
import D.AbstractC0025z;
import D.C0003c;
import D.C0012l;
import D.C0015o;
import D.I;
import D.InterfaceC0014n;
import I.c;
import I.f;
import I.g;
import I.h;
import I.i;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.ryanheise.audioservice.AudioService;
import i4.a;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0014n {
    public static final float M = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final f f4027N = new f();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int[] f4028O = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f4029A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f4030B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f4031C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int[] f4032D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int[] f4033E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f4034F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f4035G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public i f4036H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0015o f4037I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C0012l f4038J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f4039K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C0003c f4040L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f4041l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4042m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f4043n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final OverScroller f4044o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EdgeEffect f4045p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final EdgeEffect f4046q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4047r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4048s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4049t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f4050u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4051v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public VelocityTracker f4052w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4053x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f4054z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.example.hqp_mobile_app.R.attr.nestedScrollViewStyle);
        this.f4043n = new Rect();
        this.f4048s = true;
        this.f4049t = false;
        this.f4050u = null;
        this.f4051v = false;
        this.y = true;
        this.f4031C = -1;
        this.f4032D = new int[2];
        this.f4033E = new int[2];
        this.f4040L = new C0003c(getContext(), new d(this));
        int i = Build.VERSION.SDK_INT;
        this.f4045p = i >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f4046q = i >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f4041l = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f4044o = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4054z = viewConfiguration.getScaledTouchSlop();
        this.f4029A = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4030B = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4028O, com.example.hqp_mobile_app.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f4037I = new C0015o(0);
        this.f4038J = new C0012l(this);
        setNestedScrollingEnabled(true);
        I.d(this, f4027N);
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    @Override // D.InterfaceC0013m
    public final void a(View view, View view2, int i, int i5) {
        C0015o c0015o = this.f4037I;
        if (i5 == 1) {
            c0015o.f361c = i;
        } else {
            c0015o.f360b = i;
        }
        u(2, i5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // D.InterfaceC0013m
    public final void b(ViewGroup viewGroup, int i, int i5, int i6, int i7, int i8) {
        m(i7, i8, null);
    }

    @Override // D.InterfaceC0013m
    public final void c(View view, int i) {
        C0015o c0015o = this.f4037I;
        if (i == 1) {
            c0015o.f361c = 0;
        } else {
            c0015o.f360b = 0;
        }
        w(i);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // D.InterfaceC0014n
    public final void d(ViewGroup viewGroup, int i, int i5, int i6, int i7, int i8, int[] iArr) {
        m(i7, i8, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f5, boolean z4) {
        return this.f4038J.a(f2, f5, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f5) {
        return this.f4038J.b(f2, f5);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i5, int[] iArr, int[] iArr2) {
        return this.f4038J.c(i, i5, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i5, int i6, int i7, int[] iArr) {
        return this.f4038J.d(i, i5, i6, i7, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f4045p;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (g.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (g.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f4046q;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (g.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (g.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // D.InterfaceC0013m
    public final void e(int i, int i5, int i6, int[] iArr) {
        this.f4038J.c(i, i5, i6, iArr, null);
    }

    @Override // D.InterfaceC0013m
    public final boolean f(View view, View view2, int i, int i5) {
        return (i & 2) != 0;
    }

    public final boolean g(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !l(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f4043n;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            r(h(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !l(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0015o c0015o = this.f4037I;
        return c0015o.f361c | c0015o.f360b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f4039K == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f4039K = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f4039K;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i6 = rect.bottom;
        if (i6 > i5 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i5, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i6 >= i5) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i5 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f4038J.f(0);
    }

    public final void i(int i) {
        if (getChildCount() > 0) {
            this.f4044o.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.f4035G = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f4038J.f357d;
    }

    public final boolean j(int i) {
        int childCount;
        boolean z4 = i == 130;
        int height = getHeight();
        Rect rect = this.f4043n;
        rect.top = 0;
        rect.bottom = height;
        if (z4 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i, int i5) {
        Rect rect = this.f4043n;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i5;
    }

    public final void m(int i, int i5, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f4038J.d(0, scrollY2, 0, i - scrollY2, null, i5, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4031C) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4047r = (int) motionEvent.getY(i);
            this.f4031C = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f4052w;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i, int i5, int i6, int i7) {
        boolean z4;
        boolean z5;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i8 = i6 + i;
        if (i5 <= 0 && i5 >= 0) {
            z4 = false;
        } else {
            i5 = 0;
            z4 = true;
        }
        if (i8 > i7) {
            z5 = true;
        } else if (i8 < 0) {
            i7 = 0;
            z5 = true;
        } else {
            i7 = i8;
            z5 = false;
        }
        if (z5 && !this.f4038J.f(1)) {
            this.f4044o.springBack(i5, i7, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i7);
        return z4 || z5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4049t = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r27) {
        /*
            Method dump skipped, instruction units count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        int measuredHeight;
        super.onLayout(z4, i, i5, i6, i7);
        int i8 = 0;
        this.f4048s = false;
        View view = this.f4050u;
        if (view != null && k(view, this)) {
            View view2 = this.f4050u;
            Rect rect = this.f4043n;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        this.f4050u = null;
        if (!this.f4049t) {
            if (this.f4036H != null) {
                scrollTo(getScrollX(), this.f4036H.f1007l);
                this.f4036H = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i8 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i8 != scrollY) {
                scrollTo(getScrollX(), i8);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f4049t = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i5) {
        super.onMeasure(i, i5);
        if (this.f4053x && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f5, boolean z4) {
        if (z4) {
            return false;
        }
        dispatchNestedFling(0.0f, f5, true);
        i((int) f5);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f5) {
        return this.f4038J.b(f2, f5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i5, int[] iArr) {
        this.f4038J.c(i, i5, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i5, int i6, int i7) {
        m(i7, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i5, boolean z4, boolean z5) {
        super.scrollTo(i, i5);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = AudioService.KEYCODE_BYPASS_PAUSE;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && l(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        this.f4036H = iVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        iVar.f1007l = getScrollY();
        return iVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i5, int i6, int i7) {
        super.onScrollChanged(i, i5, i6, i7);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i5, int i6, int i7) {
        super.onSizeChanged(i, i5, i6, i7);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !l(viewFindFocus, 0, i7)) {
            return;
        }
        Rect rect = this.f4043n;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iH = h(rect);
        if (iH != 0) {
            if (this.y) {
                t(0, iH, false);
            } else {
                scrollBy(0, iH);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f4052w == null) {
            this.f4052w = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4034F = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f2 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f4034F);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f4046q;
            EdgeEffect edgeEffect2 = this.f4045p;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f4052w;
                velocityTracker.computeCurrentVelocity(1000, this.f4030B);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f4031C);
                if (Math.abs(yVelocity) >= this.f4029A) {
                    if (a.A(edgeEffect2) != 0.0f) {
                        if (s(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (a.A(edgeEffect) != 0.0f) {
                        int i = -yVelocity;
                        if (s(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            i(i);
                        }
                    } else {
                        int i5 = -yVelocity;
                        float f5 = i5;
                        if (!this.f4038J.b(0.0f, f5)) {
                            dispatchNestedFling(0.0f, f5, true);
                            i(i5);
                        }
                    }
                } else if (this.f4044o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f4031C = -1;
                this.f4051v = false;
                VelocityTracker velocityTracker2 = this.f4052w;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f4052w = null;
                }
                w(0);
                this.f4045p.onRelease();
                this.f4046q.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4031C);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f4031C + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i6 = this.f4047r - y;
                    float x4 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i6 / getHeight();
                    if (a.A(edgeEffect2) != 0.0f) {
                        float f6 = -a.K(edgeEffect2, -height, x4);
                        if (a.A(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f2 = f6;
                    } else if (a.A(edgeEffect) != 0.0f) {
                        float fK = a.K(edgeEffect, height, 1.0f - x4);
                        if (a.A(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f2 = fK;
                    }
                    int iRound = Math.round(f2 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i7 = i6 - iRound;
                    if (!this.f4051v && Math.abs(i7) > this.f4054z) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f4051v = true;
                        i7 = i7 > 0 ? i7 - this.f4054z : i7 + this.f4054z;
                    }
                    if (this.f4051v) {
                        int iR = r(i7, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f4047r = y - iR;
                        this.f4034F += iR;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f4051v && getChildCount() > 0 && this.f4044o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f4031C = -1;
                this.f4051v = false;
                VelocityTracker velocityTracker3 = this.f4052w;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f4052w = null;
                }
                w(0);
                this.f4045p.onRelease();
                this.f4046q.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f4047r = (int) motionEvent.getY(actionIndex);
                this.f4031C = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f4047r = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f4031C));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f4051v && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f4044o.isFinished()) {
                this.f4044o.abortAnimation();
                w(1);
            }
            int y4 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f4047r = y4;
            this.f4031C = pointerId;
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f4052w;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(int i) {
        boolean z4 = i == 130;
        int height = getHeight();
        Rect rect = this.f4043n;
        if (z4) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i5 = rect.top;
        int i6 = height + i5;
        rect.bottom = i6;
        q(i, i5, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r17.getHeight()
            int r5 = r17.getScrollY()
            int r4 = r4 + r5
            r6 = 33
            if (r1 != r6) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            int r10 = r9.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r9.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r7 = r14.getBottom()
            if (r2 >= r7) goto L69
            if (r15 >= r3) goto L69
            if (r2 >= r15) goto L3f
            if (r7 >= r3) goto L3f
            r16 = 1
            goto L41
        L3f:
            r16 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r16
            goto L69
        L47:
            if (r6 == 0) goto L4f
            int r8 = r11.getTop()
            if (r15 < r8) goto L57
        L4f:
            if (r6 != 0) goto L59
            int r8 = r11.getBottom()
            if (r7 <= r8) goto L59
        L57:
            r7 = 1
            goto L5a
        L59:
            r7 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r16 == 0) goto L69
            if (r7 == 0) goto L69
            goto L68
        L61:
            if (r16 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r7 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L6f
            r11 = r0
        L6f:
            if (r2 < r5) goto L75
            if (r3 > r4) goto L75
            r7 = 0
            goto L82
        L75:
            if (r6 == 0) goto L7b
            int r2 = r2 - r5
        L78:
            r3 = 0
            r4 = 1
            goto L7e
        L7b:
            int r2 = r3 - r4
            goto L78
        L7e:
            r0.r(r2, r3, r4, r4)
            r7 = r4
        L82:
            android.view.View r2 = r17.findFocus()
            if (r11 == r2) goto L8b
            r11.requestFocus(r1)
        L8b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.q(int, int, int):boolean");
    }

    public final int r(int i, int i5, int i6, boolean z4) {
        int i7;
        int i8;
        boolean z5;
        VelocityTracker velocityTracker;
        if (i6 == 1) {
            u(2, i6);
        }
        boolean zC = this.f4038J.c(0, i, i6, this.f4033E, this.f4032D);
        int[] iArr = this.f4033E;
        int[] iArr2 = this.f4032D;
        if (zC) {
            i7 = i - iArr[1];
            i8 = iArr2[1];
        } else {
            i7 = i;
            i8 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z6 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z4;
        boolean z7 = o(i7, 0, scrollY, scrollRange) && !this.f4038J.f(i6);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f4038J.d(0, scrollY2, 0, i7 - scrollY2, this.f4032D, i6, iArr);
        int i9 = i8 + iArr2[1];
        int i10 = i7 - iArr[1];
        int i11 = scrollY + i10;
        EdgeEffect edgeEffect = this.f4046q;
        EdgeEffect edgeEffect2 = this.f4045p;
        if (i11 < 0) {
            if (z6) {
                a.K(edgeEffect2, (-i10) / getHeight(), i5 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i11 > scrollRange && z6) {
            a.K(edgeEffect, i10 / getHeight(), 1.0f - (i5 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z5 = z7;
        } else {
            postInvalidateOnAnimation();
            z5 = false;
        }
        if (z5 && i6 == 0 && (velocityTracker = this.f4052w) != null) {
            velocityTracker.clear();
        }
        if (i6 == 1) {
            w(i6);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f4048s) {
            this.f4050u = view2;
        } else {
            Rect rect = this.f4043n;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iH = h(rect);
        boolean z5 = iH != 0;
        if (z5) {
            if (z4) {
                scrollBy(0, iH);
            } else {
                t(0, iH, false);
            }
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        VelocityTracker velocityTracker;
        if (z4 && (velocityTracker = this.f4052w) != null) {
            velocityTracker.recycle();
            this.f4052w = null;
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4048s = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fA = a.A(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f2 = this.f4041l * 0.015f;
        double dLog = Math.log(fAbs / f2);
        double d5 = M;
        return ((float) (Math.exp((d5 / (d5 - 1.0d)) * dLog) * ((double) f2))) < fA;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i5 < 0) {
                i5 = 0;
            } else if (height + i5 > height2) {
                i5 = height2 - height;
            }
            if (i == getScrollX() && i5 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i5);
        }
    }

    public void setFillViewport(boolean z4) {
        if (z4 != this.f4053x) {
            this.f4053x = z4;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        C0012l c0012l = this.f4038J;
        if (c0012l.f357d) {
            Field field = I.f300a;
            AbstractC0025z.z(c0012l.f356c);
        }
        c0012l.f357d = z4;
    }

    public void setSmoothScrollingEnabled(boolean z4) {
        this.y = z4;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f4038J.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int i, int i5, boolean z4) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f4042m > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f4044o.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i5 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z4) {
                u(2, 1);
            } else {
                w(1);
            }
            this.f4035G = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f4044o.isFinished()) {
                this.f4044o.abortAnimation();
                w(1);
            }
            scrollBy(i, i5);
        }
        this.f4042m = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void u(int i, int i5) {
        this.f4038J.g(2, i5);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z4;
        EdgeEffect edgeEffect = this.f4045p;
        if (a.A(edgeEffect) != 0.0f) {
            a.K(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z4 = true;
        } else {
            z4 = false;
        }
        EdgeEffect edgeEffect2 = this.f4046q;
        if (a.A(edgeEffect2) == 0.0f) {
            return z4;
        }
        a.K(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i) {
        this.f4038J.h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(h hVar) {
    }
}
