package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class X implements W {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static X f4520l;

    @Override // androidx.lifecycle.W
    public T c(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            N3.h.d(objNewInstance, "{\n                modelC…wInstance()\n            }");
            return (T) objNewInstance;
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        }
    }
}
