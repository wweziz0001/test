package x;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: x.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0953b {
    public static int a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e5) {
            Log.e("IconCompat", "Unable to get icon resource", e5);
            return 0;
        } catch (NoSuchMethodException e6) {
            Log.e("IconCompat", "Unable to get icon resource", e6);
            return 0;
        } catch (InvocationTargetException e7) {
            Log.e("IconCompat", "Unable to get icon resource", e7);
            return 0;
        }
    }

    public static String b(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.b(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException e5) {
            Log.e("IconCompat", "Unable to get icon package", e5);
            return null;
        } catch (NoSuchMethodException e6) {
            Log.e("IconCompat", "Unable to get icon package", e6);
            return null;
        } catch (InvocationTargetException e7) {
            Log.e("IconCompat", "Unable to get icon package", e7);
            return null;
        }
    }

    public static int c(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e5) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e5);
            return -1;
        } catch (NoSuchMethodException e6) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e6);
            return -1;
        } catch (InvocationTargetException e7) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e7);
            return -1;
        }
    }

    public static Uri d(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e5) {
            Log.e("IconCompat", "Unable to get icon uri", e5);
            return null;
        } catch (NoSuchMethodException e6) {
            Log.e("IconCompat", "Unable to get icon uri", e6);
            return null;
        } catch (InvocationTargetException e7) {
            Log.e("IconCompat", "Unable to get icon uri", e7);
            return null;
        }
    }

    public static Drawable e(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.drawable.Icon f(androidx.core.graphics.drawable.IconCompat r7, android.content.Context r8) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.AbstractC0953b.f(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
    }
}
