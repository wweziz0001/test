package androidx.fragment.app;

import D.AbstractC0023x;
import D.b0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import b3.AbstractC0307a;
import com.example.hqp_mobile_app.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0257y extends FrameLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f4468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f4469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f4470n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4471o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0257y(Context context, AttributeSet attributeSet, L l3) {
        io.flutter.embedding.android.D d5;
        super(context, attributeSet);
        N3.h.e(context, "context");
        N3.h.e(attributeSet, "attrs");
        N3.h.e(l3, "fm");
        this.f4468l = new ArrayList();
        this.f4469m = new ArrayList();
        this.f4471o = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, U.a.f2258b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        r rVarB = l3.B(id);
        if (classAttribute != null && rVarB == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC0307a.k("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            F fG = l3.G();
            context.getClassLoader();
            r rVarA = fG.a(classAttribute);
            N3.h.d(rVarA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            rVarA.f4417H = id;
            rVarA.f4418I = id;
            rVarA.f4419J = string;
            rVarA.f4413D = l3;
            C0254v c0254v = l3.f4272v;
            rVarA.f4414E = c0254v;
            rVarA.f4423O = true;
            if ((c0254v == null ? null : c0254v.f4458q) != null) {
                rVarA.f4423O = true;
            }
            C0234a c0234a = new C0234a(l3);
            c0234a.f4352o = true;
            rVarA.f4424P = this;
            c0234a.b(getId(), rVarA, string);
            if (c0234a.f4345g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            L l4 = c0234a.f4353p;
            if (l4.f4272v != null && !l4.f4246I) {
                l4.y(true);
                c0234a.a(l4.f4248K, l4.f4249L);
                l4.f4253b = true;
                try {
                    l4.S(l4.f4248K, l4.f4249L);
                    l4.d();
                    l4.d0();
                    if (l4.f4247J) {
                        l4.f4247J = false;
                        l4.b0();
                    }
                    ((HashMap) l4.f4254c.f3013m).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    l4.d();
                    throw th;
                }
            }
        }
        for (T t4 : l3.f4254c.k()) {
            r rVar = t4.f4307c;
            if (rVar.f4418I == getId() && (d5 = rVar.f4425Q) != null && d5.getParent() == null) {
                rVar.f4424P = this;
                t4.b();
            }
        }
    }

    public final void a(View view) {
        if (this.f4469m.contains(view)) {
            this.f4468l.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        N3.h.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof r ? (r) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        b0 b0VarC;
        N3.h.e(windowInsets, "insets");
        b0 b0VarC2 = b0.c(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4470n;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            N3.h.d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            b0VarC = b0.c(windowInsetsOnApplyWindowInsets, null);
        } else {
            Field field = D.I.f300a;
            WindowInsets windowInsetsB = b0VarC2.b();
            if (windowInsetsB != null) {
                WindowInsets windowInsetsB2 = AbstractC0023x.b(this, windowInsetsB);
                if (!windowInsetsB2.equals(windowInsetsB)) {
                    b0VarC2 = b0.c(windowInsetsB2, this);
                }
            }
            b0VarC = b0VarC2;
        }
        if (!b0VarC.f331a.i()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                Field field2 = D.I.f300a;
                WindowInsets windowInsetsB3 = b0VarC.b();
                if (windowInsetsB3 != null) {
                    WindowInsets windowInsetsA = AbstractC0023x.a(childAt, windowInsetsB3);
                    if (!windowInsetsA.equals(windowInsetsB3)) {
                        b0.c(windowInsetsA, childAt);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        N3.h.e(canvas, "canvas");
        if (this.f4471o) {
            Iterator it = this.f4468l.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j5) {
        N3.h.e(canvas, "canvas");
        N3.h.e(view, "child");
        if (this.f4471o) {
            ArrayList arrayList = this.f4468l;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j5);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        N3.h.e(view, "view");
        this.f4469m.remove(view);
        if (this.f4468l.remove(view)) {
            this.f4471o = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends r> F getFragment() {
        AbstractActivityC0255w abstractActivityC0255w;
        r rVar;
        L supportFragmentManager;
        View view = this;
        while (true) {
            abstractActivityC0255w = null;
            if (view == null) {
                rVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            rVar = tag instanceof r ? (r) tag : null;
            if (rVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (rVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC0255w) {
                    abstractActivityC0255w = (AbstractActivityC0255w) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC0255w == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = abstractActivityC0255w.getSupportFragmentManager();
        } else {
            if (!rVar.h()) {
                throw new IllegalStateException("The Fragment " + rVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = rVar.c();
        }
        return (F) supportFragmentManager.B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        N3.h.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                N3.h.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        N3.h.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        N3.h.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        N3.h.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i5) {
        int i6 = i + i5;
        for (int i7 = i; i7 < i6; i7++) {
            View childAt = getChildAt(i7);
            N3.h.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i, i5);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i5) {
        int i6 = i + i5;
        for (int i7 = i; i7 < i6; i7++) {
            View childAt = getChildAt(i7);
            N3.h.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i, i5);
    }

    public final void setDrawDisappearingViewsLast(boolean z4) {
        this.f4471o = z4;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        N3.h.e(onApplyWindowInsetsListener, "listener");
        this.f4470n = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        N3.h.e(view, "view");
        if (view.getParent() == this) {
            this.f4469m.add(view);
        }
        super.startViewTransition(view);
    }
}
