package D;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f307d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f304a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f305b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f306c = declaredField3;
            declaredField3.setAccessible(true);
            f307d = true;
        } catch (ReflectiveOperationException e5) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e5.getMessage(), e5);
        }
    }
}
