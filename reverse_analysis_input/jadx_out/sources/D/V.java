package D;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import w.C0939c;

/* JADX INFO: loaded from: classes.dex */
public abstract class V extends a0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f315f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Method f316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Class f317h;
    public static Field i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Field f318j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0939c f320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0939c f321e;

    public V(b0 b0Var, WindowInsets windowInsets) {
        super(b0Var);
        this.f320d = null;
        this.f319c = windowInsets;
    }

    private C0939c n(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f315f) {
            o();
        }
        Method method = f316g;
        if (method != null && f317h != null && i != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) i.get(f318j.get(objInvoke));
                if (rect != null) {
                    return C0939c.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e5) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e5.getMessage(), e5);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void o() {
        try {
            f316g = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f317h = cls;
            i = cls.getDeclaredField("mVisibleInsets");
            f318j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            i.setAccessible(true);
            f318j.setAccessible(true);
        } catch (ReflectiveOperationException e5) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e5.getMessage(), e5);
        }
        f315f = true;
    }

    @Override // D.a0
    public void d(View view) {
        C0939c c0939cN = n(view);
        if (c0939cN == null) {
            c0939cN = C0939c.f10401e;
        }
        p(c0939cN);
    }

    @Override // D.a0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f321e, ((V) obj).f321e);
        }
        return false;
    }

    @Override // D.a0
    public final C0939c g() {
        if (this.f320d == null) {
            WindowInsets windowInsets = this.f319c;
            this.f320d = C0939c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f320d;
    }

    @Override // D.a0
    public b0 h(int i5, int i6, int i7, int i8) {
        b0 b0VarC = b0.c(this.f319c, null);
        int i9 = Build.VERSION.SDK_INT;
        U t4 = i9 >= 30 ? new T(b0VarC) : i9 >= 29 ? new S(b0VarC) : new P(b0VarC);
        t4.d(b0.a(g(), i5, i6, i7, i8));
        t4.c(b0.a(f(), i5, i6, i7, i8));
        return t4.b();
    }

    @Override // D.a0
    public boolean j() {
        return this.f319c.isRound();
    }

    public void p(C0939c c0939c) {
        this.f321e = c0939c;
    }

    @Override // D.a0
    public void k(C0939c[] c0939cArr) {
    }

    @Override // D.a0
    public void l(b0 b0Var) {
    }
}
