package D;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import w.C0939c;

/* JADX INFO: loaded from: classes.dex */
public final class P extends U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Field f308c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f309d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Constructor f310e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f311f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WindowInsets f312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0939c f313b;

    public P() {
        this.f312a = e();
    }

    private static WindowInsets e() {
        if (!f309d) {
            try {
                f308c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e5);
            }
            f309d = true;
        }
        Field field = f308c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e6);
            }
        }
        if (!f311f) {
            try {
                f310e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e7);
            }
            f311f = true;
        }
        Constructor constructor = f310e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e8);
            }
        }
        return null;
    }

    @Override // D.U
    public b0 b() {
        a();
        b0 b0VarC = b0.c(this.f312a, null);
        a0 a0Var = b0VarC.f331a;
        a0Var.k(null);
        a0Var.m(this.f313b);
        return b0VarC;
    }

    @Override // D.U
    public void c(C0939c c0939c) {
        this.f313b = c0939c;
    }

    @Override // D.U
    public void d(C0939c c0939c) {
        WindowInsets windowInsets = this.f312a;
        if (windowInsets != null) {
            this.f312a = windowInsets.replaceSystemWindowInsets(c0939c.f10402a, c0939c.f10403b, c0939c.f10404c, c0939c.f10405d);
        }
    }

    public P(b0 b0Var) {
        super(b0Var);
        this.f312a = b0Var.b();
    }
}
