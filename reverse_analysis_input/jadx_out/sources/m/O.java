package m;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f8296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f8297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f8298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f8299d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f8296a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f8297b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f8298c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f8299d = true;
        } catch (NoSuchMethodException e5) {
            e5.printStackTrace();
        }
    }
}
