package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0262d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0262d f4526c = new C0262d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4527a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f4528b = new HashMap();

    public static void b(HashMap map, C0261c c0261c, EnumC0272n enumC0272n, Class cls) {
        EnumC0272n enumC0272n2 = (EnumC0272n) map.get(c0261c);
        if (enumC0272n2 == null || enumC0272n == enumC0272n2) {
            if (enumC0272n2 == null) {
                map.put(c0261c, enumC0272n);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0261c.f4525b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0272n2 + ", new value " + enumC0272n);
    }

    public final C0260b a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f4527a;
        if (superclass != null) {
            C0260b c0260bA = (C0260b) map2.get(superclass);
            if (c0260bA == null) {
                c0260bA = a(superclass, null);
            }
            map.putAll(c0260bA.f4523b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0260b c0260bA2 = (C0260b) map2.get(cls2);
            if (c0260bA2 == null) {
                c0260bA2 = a(cls2, null);
            }
            for (Map.Entry entry : c0260bA2.f4523b.entrySet()) {
                b(map, (C0261c) entry.getKey(), (EnumC0272n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e5) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e5);
            }
        }
        boolean z4 = false;
        for (Method method : methodArr) {
            A a5 = (A) method.getAnnotation(A.class);
            if (a5 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0278u.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC0272n enumC0272nValue = a5.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0272n.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0272nValue != EnumC0272n.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0261c(i, method), enumC0272nValue, cls);
                z4 = true;
            }
        }
        C0260b c0260b = new C0260b(map);
        map2.put(cls, c0260b);
        this.f4528b.put(cls, Boolean.valueOf(z4));
        return c0260b;
    }
}
