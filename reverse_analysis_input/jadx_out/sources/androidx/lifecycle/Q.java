package androidx.lifecycle;

import a.AbstractC0149a;
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f4508a = C3.g.Q(Application.class, J.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f4509b = AbstractC0149a.y(J.class);

    public static final Constructor a(Class cls, List list) {
        N3.h.e(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        N3.h.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            N3.h.d(parameterTypes, "constructor.parameterTypes");
            int length = parameterTypes.length;
            List listZ = length != 0 ? length != 1 ? C3.e.Z(parameterTypes) : AbstractC0149a.y(parameterTypes[0]) : C3.n.f291l;
            if (list.equals(listZ)) {
                return constructor;
            }
            if (list.size() == listZ.size() && listZ.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final T b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (T) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Failed to access " + cls, e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e7.getCause());
        }
    }
}
