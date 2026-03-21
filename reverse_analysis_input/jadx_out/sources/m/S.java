package m;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f8309a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e5) {
            e5.printStackTrace();
        }
        f8309a = declaredField;
    }
}
