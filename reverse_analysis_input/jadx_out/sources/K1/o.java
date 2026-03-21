package K1;

import D.P;
import D.S;
import D.T;
import D.b0;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1264b = 0;

    static {
        new ArrayList(new C3.c(new Integer[]{1, 2, 4, 8, 16, 32, 64, 128}, true));
    }

    public static m a(Activity activity) throws Exception {
        Rect rect;
        b0 b0VarB;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            rect = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
            N3.h.d(rect, "wm.currentWindowMetrics.bounds");
        } else if (i >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                N3.h.c(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect = new Rect((Rect) objInvoke);
            } catch (IllegalAccessException e5) {
                Log.w("o", e5);
                rect = b(activity);
            } catch (NoSuchFieldException e6) {
                Log.w("o", e6);
                rect = b(activity);
            } catch (NoSuchMethodException e7) {
                Log.w("o", e7);
                rect = b(activity);
            } catch (InvocationTargetException e8) {
                Log.w("o", e8);
                rect = b(activity);
            }
        } else if (i >= 28) {
            rect = b(activity);
        } else {
            rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!activity.isInMultiWindowMode()) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i5 = rect.bottom + dimensionPixelSize;
                if (i5 == point.y) {
                    rect.bottom = i5;
                } else {
                    int i6 = rect.right + dimensionPixelSize;
                    if (i6 == point.x) {
                        rect.right = i6;
                    }
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30) {
            b0VarB = (i7 >= 30 ? new T() : i7 >= 29 ? new S() : new P()).b();
            N3.h.d(b0VarB, "{\n            WindowInse…ilder().build()\n        }");
        } else {
            if (i7 < 30) {
                throw new Exception("Incompatible SDK version");
            }
            b0VarB = O1.a.f1636a.a(activity);
        }
        return new m(new H1.b(rect), b0VarB);
    }

    public static Rect b(Activity activity) {
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutoutK = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                N3.h.c(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                N3.h.c(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e5) {
            Log.w("o", e5);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchFieldException e6) {
            Log.w("o", e6);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (NoSuchMethodException e7) {
            Log.w("o", e7);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        } catch (InvocationTargetException e8) {
            Log.w("o", e8);
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        N3.h.d(defaultDisplay, "currentDisplay");
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i5 = rect.right + dimensionPixelSize;
                if (i5 == point.x) {
                    rect.right = i5;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object objNewInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, objNewInstance);
                Field declaredField2 = objNewInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(objNewInstance);
                if (B.b.t(obj2)) {
                    displayCutoutK = B.b.k(obj2);
                }
            } catch (ClassNotFoundException e9) {
                Log.w("o", e9);
            } catch (IllegalAccessException e10) {
                Log.w("o", e10);
            } catch (InstantiationException e11) {
                Log.w("o", e11);
            } catch (NoSuchFieldException e12) {
                Log.w("o", e12);
            } catch (NoSuchMethodException e13) {
                Log.w("o", e13);
            } catch (InvocationTargetException e14) {
                Log.w("o", e14);
            }
            if (displayCutoutK != null) {
                if (rect.left == displayCutoutK.getSafeInsetLeft()) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCutoutK.getSafeInsetRight()) {
                    rect.right = displayCutoutK.getSafeInsetRight() + rect.right;
                }
                if (rect.top == displayCutoutK.getSafeInsetTop()) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCutoutK.getSafeInsetBottom()) {
                    rect.bottom = displayCutoutK.getSafeInsetBottom() + rect.bottom;
                }
            }
        }
        return rect;
    }
}
