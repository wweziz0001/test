package w;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class j extends i {
    @Override // w.i
    public final Typeface W(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f10420v, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f10419B.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // w.i
    public final Method b0(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
