package androidx.fragment.app;

import b3.AbstractC0307a;
import java.lang.reflect.InvocationTargetException;
import q.C0739i;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0739i f4231b = new C0739i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L f4232a;

    public F(L l3) {
        this.f4232a = l3;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C0739i c0739i = f4231b;
        C0739i c0739i2 = (C0739i) c0739i.getOrDefault(classLoader, null);
        if (c0739i2 == null) {
            c0739i2 = new C0739i();
            c0739i.put(classLoader, c0739i2);
        }
        Class cls = (Class) c0739i2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c0739i2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e5) {
            throw new A1.c(AbstractC0307a.k("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e5);
        } catch (ClassNotFoundException e6) {
            throw new A1.c(AbstractC0307a.k("Unable to instantiate fragment ", str, ": make sure class name exists"), e6);
        }
    }

    public final r a(String str) {
        try {
            return (r) c(this.f4232a.f4272v.f4459r.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e5) {
            throw new A1.c(AbstractC0307a.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e5);
        } catch (InstantiationException e6) {
            throw new A1.c(AbstractC0307a.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e6);
        } catch (NoSuchMethodException e7) {
            throw new A1.c(AbstractC0307a.k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e7);
        } catch (InvocationTargetException e8) {
            throw new A1.c(AbstractC0307a.k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e8);
        }
    }
}
