package androidx.appcompat.widget;

import D.AbstractC0023x;
import D.AbstractC0025z;
import D.C0015o;
import D.I;
import D.InterfaceC0013m;
import D.InterfaceC0014n;
import D.P;
import D.S;
import D.T;
import D.U;
import D.a0;
import D.b0;
import a.AbstractC0149a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.example.hqp_mobile_app.R;
import java.lang.reflect.Field;
import m.C0580b;
import m.C0586e;
import m.InterfaceC0584d;
import m.J;
import m.RunnableC0582c;
import m.S0;
import w.C0939c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0013m, InterfaceC0014n {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final int[] f3830J = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public b0 f3831A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public b0 f3832B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public b0 f3833C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public OverScroller f3834D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ViewPropertyAnimator f3835E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C0580b f3836F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final RunnableC0582c f3837G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final RunnableC0582c f3838H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0015o f3839I;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3840l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ContentFrameLayout f3841m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ActionBarContainer f3842n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public J f3843o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Drawable f3844p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3845q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3846r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3847s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3848t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3849u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3850v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f3851w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f3852x;
    public final Rect y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public b0 f3853z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3851w = new Rect();
        this.f3852x = new Rect();
        this.y = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        b0 b0Var = b0.f330b;
        this.f3853z = b0Var;
        this.f3831A = b0Var;
        this.f3832B = b0Var;
        this.f3833C = b0Var;
        this.f3836F = new C0580b(this);
        this.f3837G = new RunnableC0582c(this, 0);
        this.f3838H = new RunnableC0582c(this, 1);
        i(context);
        this.f3839I = new C0015o(0);
    }

    public static boolean g(View view, Rect rect, boolean z4) {
        boolean z5;
        C0586e c0586e = (C0586e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c0586e).leftMargin;
        int i5 = rect.left;
        if (i != i5) {
            ((ViewGroup.MarginLayoutParams) c0586e).leftMargin = i5;
            z5 = true;
        } else {
            z5 = false;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c0586e).topMargin;
        int i7 = rect.top;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c0586e).topMargin = i7;
            z5 = true;
        }
        int i8 = ((ViewGroup.MarginLayoutParams) c0586e).rightMargin;
        int i9 = rect.right;
        if (i8 != i9) {
            ((ViewGroup.MarginLayoutParams) c0586e).rightMargin = i9;
            z5 = true;
        }
        if (z4) {
            int i10 = ((ViewGroup.MarginLayoutParams) c0586e).bottomMargin;
            int i11 = rect.bottom;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) c0586e).bottomMargin = i11;
                return true;
            }
        }
        return z5;
    }

    @Override // D.InterfaceC0013m
    public final void a(View view, View view2, int i, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // D.InterfaceC0013m
    public final void b(ViewGroup viewGroup, int i, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(viewGroup, i, i5, i6, i7);
        }
    }

    @Override // D.InterfaceC0013m
    public final void c(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0586e;
    }

    @Override // D.InterfaceC0014n
    public final void d(ViewGroup viewGroup, int i, int i5, int i6, int i7, int i8, int[] iArr) {
        b(viewGroup, i, i5, i6, i7, i8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f3844p == null || this.f3845q) {
            return;
        }
        if (this.f3842n.getVisibility() == 0) {
            translationY = (int) (this.f3842n.getTranslationY() + this.f3842n.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f3844p.setBounds(0, translationY, getWidth(), this.f3844p.getIntrinsicHeight() + translationY);
        this.f3844p.draw(canvas);
    }

    @Override // D.InterfaceC0013m
    public final boolean f(View view, View view2, int i, int i5) {
        return i5 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0586e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0586e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f3842n;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0015o c0015o = this.f3839I;
        return c0015o.f361c | c0015o.f360b;
    }

    public CharSequence getTitle() {
        j();
        return ((S0) this.f3843o).f8310a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f3837G);
        removeCallbacks(this.f3838H);
        ViewPropertyAnimator viewPropertyAnimator = this.f3835E;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f3830J);
        this.f3840l = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f3844p = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f3845q = context.getApplicationInfo().targetSdkVersion < 19;
        this.f3834D = new OverScroller(context);
    }

    public final void j() {
        J wrapper;
        if (this.f3841m == null) {
            this.f3841m = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f3842n = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof J) {
                wrapper = (J) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f3843o = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        b0 b0VarC = b0.c(windowInsets, this);
        a0 a0Var = b0VarC.f331a;
        boolean zG = g(this.f3842n, new Rect(a0Var.g().f10402a, a0Var.g().f10403b, a0Var.g().f10404c, a0Var.g().f10405d), false);
        Field field = I.f300a;
        Rect rect = this.f3851w;
        AbstractC0025z.b(this, b0VarC, rect);
        b0 b0VarH = a0Var.h(rect.left, rect.top, rect.right, rect.bottom);
        this.f3853z = b0VarH;
        boolean z4 = true;
        if (!this.f3831A.equals(b0VarH)) {
            this.f3831A = this.f3853z;
            zG = true;
        }
        Rect rect2 = this.f3852x;
        if (rect2.equals(rect)) {
            z4 = zG;
        } else {
            rect2.set(rect);
        }
        if (z4) {
            requestLayout();
        }
        return a0Var.a().f331a.c().f331a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = I.f300a;
        AbstractC0023x.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0586e c0586e = (C0586e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((ViewGroup.MarginLayoutParams) c0586e).leftMargin + paddingLeft;
                int i10 = ((ViewGroup.MarginLayoutParams) c0586e).topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        int measuredHeight;
        j();
        measureChildWithMargins(this.f3842n, i, 0, i5, 0);
        C0586e c0586e = (C0586e) this.f3842n.getLayoutParams();
        int iMax = Math.max(0, this.f3842n.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0586e).leftMargin + ((ViewGroup.MarginLayoutParams) c0586e).rightMargin);
        int iMax2 = Math.max(0, this.f3842n.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0586e).topMargin + ((ViewGroup.MarginLayoutParams) c0586e).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f3842n.getMeasuredState());
        Field field = I.f300a;
        boolean z4 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z4) {
            measuredHeight = this.f3840l;
            if (this.f3847s && this.f3842n.getTabContainer() != null) {
                measuredHeight += this.f3840l;
            }
        } else {
            measuredHeight = this.f3842n.getVisibility() != 8 ? this.f3842n.getMeasuredHeight() : 0;
        }
        Rect rect = this.f3851w;
        Rect rect2 = this.y;
        rect2.set(rect);
        b0 b0Var = this.f3853z;
        this.f3832B = b0Var;
        if (this.f3846r || z4) {
            C0939c c0939cA = C0939c.a(b0Var.f331a.g().f10402a, this.f3832B.f331a.g().f10403b + measuredHeight, this.f3832B.f331a.g().f10404c, this.f3832B.f331a.g().f10405d);
            b0 b0Var2 = this.f3832B;
            int i6 = Build.VERSION.SDK_INT;
            U t4 = i6 >= 30 ? new T(b0Var2) : i6 >= 29 ? new S(b0Var2) : new P(b0Var2);
            t4.d(c0939cA);
            this.f3832B = t4.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f3832B = b0Var.f331a.h(0, measuredHeight, 0, 0);
        }
        g(this.f3841m, rect2, true);
        if (!this.f3833C.equals(this.f3832B)) {
            b0 b0Var3 = this.f3832B;
            this.f3833C = b0Var3;
            ContentFrameLayout contentFrameLayout = this.f3841m;
            WindowInsets windowInsetsB = b0Var3.b();
            if (windowInsetsB != null) {
                WindowInsets windowInsetsA = AbstractC0023x.a(contentFrameLayout, windowInsetsB);
                if (!windowInsetsA.equals(windowInsetsB)) {
                    b0.c(windowInsetsA, contentFrameLayout);
                }
            }
        }
        measureChildWithMargins(this.f3841m, i, 0, i5, 0);
        C0586e c0586e2 = (C0586e) this.f3841m.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f3841m.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0586e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0586e2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f3841m.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0586e2).topMargin + ((ViewGroup.MarginLayoutParams) c0586e2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f3841m.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i5, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f5, boolean z4) {
        if (!this.f3848t || !z4) {
            return false;
        }
        this.f3834D.fling(0, 0, 0, (int) f5, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f3834D.getFinalY() > this.f3842n.getHeight()) {
            h();
            this.f3838H.run();
        } else {
            h();
            this.f3837G.run();
        }
        this.f3849u = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f5) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i5, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i5, int i6, int i7) {
        int i8 = this.f3850v + i5;
        this.f3850v = i8;
        setActionBarHideOffset(i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f3839I.f360b = i;
        this.f3850v = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f3842n.getVisibility() != 0) {
            return false;
        }
        return this.f3848t;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f3848t || this.f3849u) {
            return;
        }
        if (this.f3850v <= this.f3842n.getHeight()) {
            h();
            postDelayed(this.f3837G, 600L);
        } else {
            h();
            postDelayed(this.f3838H, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f3842n.setTranslationY(-Math.max(0, Math.min(i, this.f3842n.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0584d interfaceC0584d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z4) {
        this.f3847s = z4;
    }

    public void setHideOnContentScrollEnabled(boolean z4) {
        if (z4 != this.f3848t) {
            this.f3848t = z4;
            if (z4) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        j();
        S0 s02 = (S0) this.f3843o;
        s02.f8313d = i != 0 ? AbstractC0149a.u(s02.f8310a.getContext(), i) : null;
        s02.c();
    }

    public void setLogo(int i) {
        j();
        S0 s02 = (S0) this.f3843o;
        s02.f8314e = i != 0 ? AbstractC0149a.u(s02.f8310a.getContext(), i) : null;
        s02.c();
    }

    public void setOverlayMode(boolean z4) {
        this.f3846r = z4;
        this.f3845q = z4 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z4) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((S0) this.f3843o).f8319k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        S0 s02 = (S0) this.f3843o;
        if (s02.f8316g) {
            return;
        }
        s02.f8317h = charSequence;
        if ((s02.f8311b & 8) != 0) {
            Toolbar toolbar = s02.f8310a;
            toolbar.setTitle(charSequence);
            if (s02.f8316g) {
                I.e(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0586e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        S0 s02 = (S0) this.f3843o;
        s02.f8313d = drawable;
        s02.c();
    }

    @Override // D.InterfaceC0013m
    public final void e(int i, int i5, int i6, int[] iArr) {
    }
}
