package androidx.appcompat.widget;

import D.C0009i;
import D.I;
import D.InterfaceC0011k;
import Z1.s;
import a.AbstractC0149a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.E;
import com.example.hqp_mobile_app.R;
import h.AbstractC0441a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import l.MenuC0550h;
import l.MenuItemC0551i;
import m.A;
import m.C0588f;
import m.C0594i;
import m.C0607o0;
import m.C0608p;
import m.C0610q;
import m.J;
import m.K0;
import m.L0;
import m.M0;
import m.O0;
import m.P0;
import m.Q0;
import m.R0;
import m.S0;
import m.Z0;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f3962A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f3963B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f3964C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f3965D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C0607o0 f3966E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f3967F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f3968G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f3969H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public CharSequence f3970I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public CharSequence f3971J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ColorStateList f3972K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ColorStateList f3973L;
    public boolean M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f3974N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ArrayList f3975O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final ArrayList f3976P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int[] f3977Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final C0009i f3978R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ArrayList f3979S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final L0 f3980T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public S0 f3981U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public O0 f3982V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f3983W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public OnBackInvokedCallback f3984a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public OnBackInvokedDispatcher f3985b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f3986c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final A.b f3987d0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ActionMenuView f3988l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public A f3989m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public A f3990n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0608p f3991o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0610q f3992p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Drawable f3993q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CharSequence f3994r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0608p f3995s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f3996t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Context f3997u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3998v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3999w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4000x;
    public final int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f4001z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f3969H = 8388627;
        this.f3975O = new ArrayList();
        this.f3976P = new ArrayList();
        this.f3977Q = new int[2];
        this.f3978R = new C0009i(new K0(this, 1));
        this.f3979S = new ArrayList();
        this.f3980T = new L0(this);
        this.f3987d0 = new A.b(this, 8);
        Context context2 = getContext();
        int[] iArr = AbstractC0441a.f5900t;
        s sVarM = s.M(context2, attributeSet, iArr, R.attr.toolbarStyle);
        I.c(this, context, iArr, attributeSet, (TypedArray) sVarM.f3086n, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) sVarM.f3086n;
        this.f3999w = typedArray.getResourceId(28, 0);
        this.f4000x = typedArray.getResourceId(19, 0);
        this.f3969H = typedArray.getInteger(0, 8388627);
        this.y = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f3965D = dimensionPixelOffset;
        this.f3964C = dimensionPixelOffset;
        this.f3963B = dimensionPixelOffset;
        this.f3962A = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f3962A = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f3963B = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f3964C = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f3965D = dimensionPixelOffset5;
        }
        this.f4001z = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        C0607o0 c0607o0 = this.f3966E;
        c0607o0.f8466h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c0607o0.f8463e = dimensionPixelSize;
            c0607o0.f8459a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c0607o0.f8464f = dimensionPixelSize2;
            c0607o0.f8460b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c0607o0.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f3967F = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f3968G = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f3993q = sVarM.D(4);
        this.f3994r = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f3997u = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableD = sVarM.D(16);
        if (drawableD != null) {
            setNavigationIcon(drawableD);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableD2 = sVarM.D(11);
        if (drawableD2 != null) {
            setLogo(drawableD2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(sVarM.C(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(sVarM.C(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        sVarM.O();
    }

    public static P0 g() {
        P0 p02 = new P0(-2, -2);
        p02.f8304b = 0;
        p02.f8303a = 8388627;
        return p02;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new k.d(getContext());
    }

    public static P0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z4 = layoutParams instanceof P0;
        if (z4) {
            P0 p02 = (P0) layoutParams;
            P0 p03 = new P0(p02);
            p03.f8304b = 0;
            p03.f8304b = p02.f8304b;
            return p03;
        }
        if (z4) {
            P0 p04 = new P0((P0) layoutParams);
            p04.f8304b = 0;
            return p04;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            P0 p05 = new P0(layoutParams);
            p05.f8304b = 0;
            return p05;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        P0 p06 = new P0(marginLayoutParams);
        p06.f8304b = 0;
        ((ViewGroup.MarginLayoutParams) p06).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) p06).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) p06).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) p06).bottomMargin = marginLayoutParams.bottomMargin;
        return p06;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        Field field = I.f300a;
        boolean z4 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z4) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                P0 p02 = (P0) childAt.getLayoutParams();
                if (p02.f8304b == 0 && s(childAt) && i(p02.f8303a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            P0 p03 = (P0) childAt2.getLayoutParams();
            if (p03.f8304b == 0 && s(childAt2) && i(p03.f8303a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        P0 p0G = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (P0) layoutParams;
        p0G.f8304b = 1;
        if (!z4 || this.f3996t == null) {
            addView(view, p0G);
        } else {
            view.setLayoutParams(p0G);
            this.f3976P.add(view);
        }
    }

    public final void c() {
        if (this.f3995s == null) {
            C0608p c0608p = new C0608p(getContext());
            this.f3995s = c0608p;
            c0608p.setImageDrawable(this.f3993q);
            this.f3995s.setContentDescription(this.f3994r);
            P0 p0G = g();
            p0G.f8303a = (this.y & 112) | 8388611;
            p0G.f8304b = 2;
            this.f3995s.setLayoutParams(p0G);
            this.f3995s.setOnClickListener(new M0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof P0);
    }

    public final void d() {
        if (this.f3966E == null) {
            C0607o0 c0607o0 = new C0607o0();
            c0607o0.f8459a = 0;
            c0607o0.f8460b = 0;
            c0607o0.f8461c = Integer.MIN_VALUE;
            c0607o0.f8462d = Integer.MIN_VALUE;
            c0607o0.f8463e = 0;
            c0607o0.f8464f = 0;
            c0607o0.f8465g = false;
            c0607o0.f8466h = false;
            this.f3966E = c0607o0;
        }
    }

    public final void e() {
        if (this.f3988l == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f3988l = actionMenuView;
            actionMenuView.setPopupTheme(this.f3998v);
            this.f3988l.setOnMenuItemClickListener(this.f3980T);
            ActionMenuView actionMenuView2 = this.f3988l;
            L0 l02 = new L0(this);
            actionMenuView2.getClass();
            actionMenuView2.f3858E = l02;
            P0 p0G = g();
            p0G.f8303a = (this.y & 112) | 8388613;
            this.f3988l.setLayoutParams(p0G);
            b(this.f3988l, false);
        }
        ActionMenuView actionMenuView3 = this.f3988l;
        if (actionMenuView3.f3854A == null) {
            MenuC0550h menuC0550h = (MenuC0550h) actionMenuView3.getMenu();
            if (this.f3982V == null) {
                this.f3982V = new O0(this);
            }
            this.f3988l.setExpandedActionViewsExclusive(true);
            menuC0550h.b(this.f3982V, this.f3997u);
            t();
        }
    }

    public final void f() {
        if (this.f3991o == null) {
            this.f3991o = new C0608p(getContext());
            P0 p0G = g();
            p0G.f8303a = (this.y & 112) | 8388611;
            this.f3991o.setLayoutParams(p0G);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0608p c0608p = this.f3995s;
        if (c0608p != null) {
            return c0608p.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0608p c0608p = this.f3995s;
        if (c0608p != null) {
            return c0608p.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0607o0 c0607o0 = this.f3966E;
        if (c0607o0 != null) {
            return c0607o0.f8465g ? c0607o0.f8459a : c0607o0.f8460b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f3968G;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0607o0 c0607o0 = this.f3966E;
        if (c0607o0 != null) {
            return c0607o0.f8459a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0607o0 c0607o0 = this.f3966E;
        if (c0607o0 != null) {
            return c0607o0.f8460b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0607o0 c0607o0 = this.f3966E;
        if (c0607o0 != null) {
            return c0607o0.f8465g ? c0607o0.f8460b : c0607o0.f8459a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f3967F;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0550h menuC0550h;
        ActionMenuView actionMenuView = this.f3988l;
        return (actionMenuView == null || (menuC0550h = actionMenuView.f3854A) == null || !menuC0550h.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f3968G, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = I.f300a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = I.f300a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f3967F, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0610q c0610q = this.f3992p;
        if (c0610q != null) {
            return c0610q.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0610q c0610q = this.f3992p;
        if (c0610q != null) {
            return c0610q.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f3988l.getMenu();
    }

    public View getNavButtonView() {
        return this.f3991o;
    }

    public CharSequence getNavigationContentDescription() {
        C0608p c0608p = this.f3991o;
        if (c0608p != null) {
            return c0608p.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0608p c0608p = this.f3991o;
        if (c0608p != null) {
            return c0608p.getDrawable();
        }
        return null;
    }

    public C0594i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f3988l.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f3997u;
    }

    public int getPopupTheme() {
        return this.f3998v;
    }

    public CharSequence getSubtitle() {
        return this.f3971J;
    }

    public final TextView getSubtitleTextView() {
        return this.f3990n;
    }

    public CharSequence getTitle() {
        return this.f3970I;
    }

    public int getTitleMarginBottom() {
        return this.f3965D;
    }

    public int getTitleMarginEnd() {
        return this.f3963B;
    }

    public int getTitleMarginStart() {
        return this.f3962A;
    }

    public int getTitleMarginTop() {
        return this.f3964C;
    }

    public final TextView getTitleTextView() {
        return this.f3989m;
    }

    public J getWrapper() {
        Drawable drawable;
        if (this.f3981U == null) {
            S0 s02 = new S0();
            s02.f8320l = 0;
            s02.f8310a = this;
            s02.f8317h = getTitle();
            s02.i = getSubtitle();
            s02.f8316g = s02.f8317h != null;
            s02.f8315f = getNavigationIcon();
            s sVarM = s.M(getContext(), null, AbstractC0441a.f5882a, R.attr.actionBarStyle);
            s02.f8321m = sVarM.D(15);
            TypedArray typedArray = (TypedArray) sVarM.f3086n;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                s02.f8316g = true;
                s02.f8317h = text;
                if ((s02.f8311b & 8) != 0) {
                    Toolbar toolbar = s02.f8310a;
                    toolbar.setTitle(text);
                    if (s02.f8316g) {
                        I.e(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                s02.i = text2;
                if ((s02.f8311b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableD = sVarM.D(20);
            if (drawableD != null) {
                s02.f8314e = drawableD;
                s02.c();
            }
            Drawable drawableD2 = sVarM.D(17);
            if (drawableD2 != null) {
                s02.f8313d = drawableD2;
                s02.c();
            }
            if (s02.f8315f == null && (drawable = s02.f8321m) != null) {
                s02.f8315f = drawable;
                int i = s02.f8311b & 4;
                Toolbar toolbar2 = s02.f8310a;
                if (i != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            s02.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = s02.f8312c;
                if (view != null && (s02.f8311b & 16) != 0) {
                    removeView(view);
                }
                s02.f8312c = viewInflate;
                if (viewInflate != null && (s02.f8311b & 16) != 0) {
                    addView(viewInflate);
                }
                s02.a(s02.f8311b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f3966E.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f3999w = resourceId2;
                A a5 = this.f3989m;
                if (a5 != null) {
                    a5.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f4000x = resourceId3;
                A a6 = this.f3990n;
                if (a6 != null) {
                    a6.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            sVarM.O();
            if (R.string.abc_action_bar_up_description != s02.f8320l) {
                s02.f8320l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i5 = s02.f8320l;
                    s02.f8318j = i5 != 0 ? getContext().getString(i5) : null;
                    s02.b();
                }
            }
            s02.f8318j = getNavigationContentDescription();
            setNavigationOnClickListener(new M0(s02));
            this.f3981U = s02;
        }
        return this.f3981U;
    }

    public final int i(int i) {
        Field field = I.f300a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    public final int j(View view, int i) {
        P0 p02 = (P0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i6 = p02.f8303a & 112;
        if (i6 != 16 && i6 != 48 && i6 != 80) {
            i6 = this.f3969H & 112;
        }
        if (i6 == 48) {
            return getPaddingTop() - i5;
        }
        if (i6 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) p02).bottomMargin) - i5;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i7 = ((ViewGroup.MarginLayoutParams) p02).topMargin;
        if (iMax < i7) {
            iMax = i7;
        } else {
            int i8 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i9 = ((ViewGroup.MarginLayoutParams) p02).bottomMargin;
            if (i8 < i9) {
                iMax = Math.max(0, iMax - (i9 - i8));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.f3979S.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = this.f3978R.f352b.iterator();
        while (it2.hasNext()) {
            ((E) ((InterfaceC0011k) it2.next())).f4230a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f3979S = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.f3976P.contains(view);
    }

    public final int o(View view, int i, int i5, int[] iArr) {
        P0 p02 = (P0) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) p02).leftMargin - iArr[0];
        int iMax = Math.max(0, i6) + i;
        iArr[0] = Math.max(0, -i6);
        int iJ = j(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) p02).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3987d0);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3974N = false;
        }
        if (!this.f3974N) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f3974N = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3974N = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x029b A[LOOP:0: B:106:0x0299->B:107:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b8 A[LOOP:1: B:109:0x02b6->B:110:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d6 A[LOOP:2: B:112:0x02d4->B:113:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0325 A[LOOP:3: B:121:0x0323->B:122:0x0325, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i5) {
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zA = Z0.a(this);
        int i6 = !zA ? 1 : 0;
        int i7 = 0;
        if (s(this.f3991o)) {
            r(this.f3991o, i, 0, i5, this.f4001z);
            iK = k(this.f3991o) + this.f3991o.getMeasuredWidth();
            iMax = Math.max(0, l(this.f3991o) + this.f3991o.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f3991o.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.f3995s)) {
            r(this.f3995s, i, 0, i5, this.f4001z);
            iK = k(this.f3995s) + this.f3995s.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f3995s) + this.f3995s.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3995s.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        int[] iArr = this.f3977Q;
        iArr[zA ? 1 : 0] = iMax4;
        if (s(this.f3988l)) {
            r(this.f3988l, i, iMax3, i5, this.f4001z);
            iK2 = k(this.f3988l) + this.f3988l.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f3988l) + this.f3988l.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3988l.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[i6] = Math.max(0, currentContentInsetEnd - iK2);
        if (s(this.f3996t)) {
            iMax5 += q(this.f3996t, i, iMax5, i5, 0, iArr);
            iMax = Math.max(iMax, l(this.f3996t) + this.f3996t.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3996t.getMeasuredState());
        }
        if (s(this.f3992p)) {
            iMax5 += q(this.f3992p, i, iMax5, i5, 0, iArr);
            iMax = Math.max(iMax, l(this.f3992p) + this.f3992p.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f3992p.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (((P0) childAt.getLayoutParams()).f8304b == 0 && s(childAt)) {
                iMax5 += q(childAt, i, iMax5, i5, 0, iArr);
                iMax = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i9 = this.f3964C + this.f3965D;
        int i10 = this.f3962A + this.f3963B;
        if (s(this.f3989m)) {
            q(this.f3989m, i, iMax5 + i10, i5, i9, iArr);
            int iK3 = k(this.f3989m) + this.f3989m.getMeasuredWidth();
            iL = l(this.f3989m) + this.f3989m.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f3989m.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (s(this.f3990n)) {
            iMax2 = Math.max(iMax2, q(this.f3990n, i, iMax5 + i10, i5, iL + i9, iArr));
            iL += l(this.f3990n) + this.f3990n.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f3990n.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i5, iCombineMeasuredStates2 << 16);
        if (!this.f3983W) {
            i7 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i7 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i7);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof R0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        R0 r02 = (R0) parcelable;
        super.onRestoreInstanceState(r02.f1207l);
        ActionMenuView actionMenuView = this.f3988l;
        MenuC0550h menuC0550h = actionMenuView != null ? actionMenuView.f3854A : null;
        int i = r02.f8307n;
        if (i != 0 && this.f3982V != null && menuC0550h != null && (menuItemFindItem = menuC0550h.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (r02.f8308o) {
            A.b bVar = this.f3987d0;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        C0607o0 c0607o0 = this.f3966E;
        boolean z4 = i == 1;
        if (z4 == c0607o0.f8465g) {
            return;
        }
        c0607o0.f8465g = z4;
        if (!c0607o0.f8466h) {
            c0607o0.f8459a = c0607o0.f8463e;
            c0607o0.f8460b = c0607o0.f8464f;
            return;
        }
        if (z4) {
            int i5 = c0607o0.f8462d;
            if (i5 == Integer.MIN_VALUE) {
                i5 = c0607o0.f8463e;
            }
            c0607o0.f8459a = i5;
            int i6 = c0607o0.f8461c;
            if (i6 == Integer.MIN_VALUE) {
                i6 = c0607o0.f8464f;
            }
            c0607o0.f8460b = i6;
            return;
        }
        int i7 = c0607o0.f8461c;
        if (i7 == Integer.MIN_VALUE) {
            i7 = c0607o0.f8463e;
        }
        c0607o0.f8459a = i7;
        int i8 = c0607o0.f8462d;
        if (i8 == Integer.MIN_VALUE) {
            i8 = c0607o0.f8464f;
        }
        c0607o0.f8460b = i8;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0594i c0594i;
        C0588f c0588f;
        MenuItemC0551i menuItemC0551i;
        R0 r02 = new R0(super.onSaveInstanceState());
        O0 o02 = this.f3982V;
        if (o02 != null && (menuItemC0551i = o02.f8301m) != null) {
            r02.f8307n = menuItemC0551i.f7756a;
        }
        ActionMenuView actionMenuView = this.f3988l;
        r02.f8308o = (actionMenuView == null || (c0594i = actionMenuView.f3857D) == null || (c0588f = c0594i.f8412C) == null || !c0588f.b()) ? false : true;
        return r02;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.M = false;
        }
        if (!this.M) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.M = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.M = false;
        }
        return true;
    }

    public final int p(View view, int i, int i5, int[] iArr) {
        P0 p02 = (P0) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) p02).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int iJ = j(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) p02).leftMargin);
    }

    public final int q(View view, int i, int i5, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i9) + Math.max(0, i8);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i7 >= 0) {
            if (mode != 0) {
                i7 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i7);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z4) {
        if (this.f3986c0 != z4) {
            this.f3986c0 = z4;
            t();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC0149a.u(getContext(), i));
    }

    public void setCollapsible(boolean z4) {
        this.f3983W = z4;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f3968G) {
            this.f3968G = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f3967F) {
            this.f3967F = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AbstractC0149a.u(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC0149a.u(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f3991o.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f3988l.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f3998v != i) {
            this.f3998v = i;
            if (i == 0) {
                this.f3997u = getContext();
            } else {
                this.f3997u = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f3965D = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f3963B = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f3962A = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f3964C = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            r4 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L4f
            android.window.OnBackInvokedDispatcher r1 = m.N0.a(r4)
            m.O0 r2 = r4.f3982V
            if (r2 == 0) goto L23
            l.i r2 = r2.f8301m
            if (r2 == 0) goto L23
            if (r1 == 0) goto L23
            java.lang.reflect.Field r2 = D.I.f300a
            boolean r2 = r4.isAttachedToWindow()
            if (r2 == 0) goto L23
            boolean r2 = r4.f3986c0
            if (r2 == 0) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = r0
        L24:
            if (r2 == 0) goto L41
            android.window.OnBackInvokedDispatcher r3 = r4.f3985b0
            if (r3 != 0) goto L41
            android.window.OnBackInvokedCallback r2 = r4.f3984a0
            if (r2 != 0) goto L39
            m.K0 r2 = new m.K0
            r2.<init>(r4, r0)
            android.window.OnBackInvokedCallback r0 = m.N0.b(r2)
            r4.f3984a0 = r0
        L39:
            android.window.OnBackInvokedCallback r0 = r4.f3984a0
            m.N0.c(r1, r0)
            r4.f3985b0 = r1
            goto L4f
        L41:
            if (r2 != 0) goto L4f
            android.window.OnBackInvokedDispatcher r0 = r4.f3985b0
            if (r0 == 0) goto L4f
            android.window.OnBackInvokedCallback r1 = r4.f3984a0
            m.N0.d(r0, r1)
            r0 = 0
            r4.f3985b0 = r0
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.t():void");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        P0 p02 = new P0(context, attributeSet);
        p02.f8303a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0441a.f5883b);
        p02.f8303a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        p02.f8304b = 0;
        return p02;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0608p c0608p = this.f3995s;
        if (c0608p != null) {
            c0608p.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f3995s.setImageDrawable(drawable);
        } else {
            C0608p c0608p = this.f3995s;
            if (c0608p != null) {
                c0608p.setImageDrawable(this.f3993q);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f3992p == null) {
                this.f3992p = new C0610q(getContext(), 0);
            }
            if (!n(this.f3992p)) {
                b(this.f3992p, true);
            }
        } else {
            C0610q c0610q = this.f3992p;
            if (c0610q != null && n(c0610q)) {
                removeView(this.f3992p);
                this.f3976P.remove(this.f3992p);
            }
        }
        C0610q c0610q2 = this.f3992p;
        if (c0610q2 != null) {
            c0610q2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f3992p == null) {
            this.f3992p = new C0610q(getContext(), 0);
        }
        C0610q c0610q = this.f3992p;
        if (c0610q != null) {
            c0610q.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C0608p c0608p = this.f3991o;
        if (c0608p != null) {
            c0608p.setContentDescription(charSequence);
            AbstractC0149a.E(this.f3991o, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!n(this.f3991o)) {
                b(this.f3991o, true);
            }
        } else {
            C0608p c0608p = this.f3991o;
            if (c0608p != null && n(c0608p)) {
                removeView(this.f3991o);
                this.f3976P.remove(this.f3991o);
            }
        }
        C0608p c0608p2 = this.f3991o;
        if (c0608p2 != null) {
            c0608p2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            A a5 = this.f3990n;
            if (a5 != null && n(a5)) {
                removeView(this.f3990n);
                this.f3976P.remove(this.f3990n);
            }
        } else {
            if (this.f3990n == null) {
                Context context = getContext();
                A a6 = new A(context, null);
                this.f3990n = a6;
                a6.setSingleLine();
                this.f3990n.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f4000x;
                if (i != 0) {
                    this.f3990n.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f3973L;
                if (colorStateList != null) {
                    this.f3990n.setTextColor(colorStateList);
                }
            }
            if (!n(this.f3990n)) {
                b(this.f3990n, true);
            }
        }
        A a7 = this.f3990n;
        if (a7 != null) {
            a7.setText(charSequence);
        }
        this.f3971J = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f3973L = colorStateList;
        A a5 = this.f3990n;
        if (a5 != null) {
            a5.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            A a5 = this.f3989m;
            if (a5 != null && n(a5)) {
                removeView(this.f3989m);
                this.f3976P.remove(this.f3989m);
            }
        } else {
            if (this.f3989m == null) {
                Context context = getContext();
                A a6 = new A(context, null);
                this.f3989m = a6;
                a6.setSingleLine();
                this.f3989m.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f3999w;
                if (i != 0) {
                    this.f3989m.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f3972K;
                if (colorStateList != null) {
                    this.f3989m.setTextColor(colorStateList);
                }
            }
            if (!n(this.f3989m)) {
                b(this.f3989m, true);
            }
        }
        A a7 = this.f3989m;
        if (a7 != null) {
            a7.setText(charSequence);
        }
        this.f3970I = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f3972K = colorStateList;
        A a5 = this.f3989m;
        if (a5 != null) {
            a5.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(Q0 q02) {
    }
}
