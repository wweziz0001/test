package D;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.example.hqp_mobile_app.R;
import w.C0939c;

/* JADX INFO: renamed from: D.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0025z {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static b0 b(View view, b0 b0Var, Rect rect) {
        WindowInsets windowInsetsB = b0Var.b();
        if (windowInsetsB != null) {
            return b0.c(view.computeSystemWindowInsets(windowInsetsB, rect), view);
        }
        rect.setEmpty();
        return b0Var;
    }

    public static boolean c(View view, float f2, float f5, boolean z4) {
        return view.dispatchNestedFling(f2, f5, z4);
    }

    public static boolean d(View view, float f2, float f5) {
        return view.dispatchNestedPreFling(f2, f5);
    }

    public static boolean e(View view, int i, int i5, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i5, iArr, iArr2);
    }

    public static boolean f(View view, int i, int i5, int i6, int i7, int[] iArr) {
        return view.dispatchNestedScroll(i, i5, i6, i7, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static b0 j(View view) {
        if (!O.f307d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = O.f304a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) O.f305b.get(obj);
            Rect rect2 = (Rect) O.f306c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            U t4 = i >= 30 ? new T() : i >= 29 ? new S() : new P();
            t4.c(C0939c.a(rect.left, rect.top, rect.right, rect.bottom));
            t4.d(C0939c.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
            b0 b0VarB = t4.b();
            b0VarB.f331a.l(b0VarB);
            b0VarB.f331a.d(view.getRootView());
            return b0VarB;
        } catch (IllegalAccessException e5) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e5.getMessage(), e5);
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f2) {
        view.setElevation(f2);
    }

    public static void t(View view, boolean z4) {
        view.setNestedScrollingEnabled(z4);
    }

    public static void u(View view, InterfaceC0016p interfaceC0016p) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0016p);
        }
        if (interfaceC0016p == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC0024y(view, interfaceC0016p));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f2) {
        view.setTranslationZ(f2);
    }

    public static void x(View view, float f2) {
        view.setZ(f2);
    }

    public static boolean y(View view, int i) {
        return view.startNestedScroll(i);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
