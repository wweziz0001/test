package m;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f8291a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f8292b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f8293c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f8291a);
        } else {
            drawable.setState(f8292b);
        }
        drawable.setState(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets insetsA = L.a(drawable);
            return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
        }
        boolean z4 = drawable instanceof x.f;
        Object obj = drawable;
        if (z4) {
            ((x.g) ((x.f) drawable)).getClass();
            obj = null;
        }
        if (i >= 29) {
            boolean z5 = K.f8282a;
        } else if (K.f8282a) {
            try {
                Object objInvoke = K.f8283b.invoke(obj, null);
                if (objInvoke != null) {
                    return new Rect(K.f8284c.getInt(objInvoke), K.f8285d.getInt(objInvoke), K.f8286e.getInt(objInvoke), K.f8287f.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f8293c;
    }

    public static PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
