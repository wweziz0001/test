package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0282y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f4552a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f4553b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0277t interfaceC0277t) {
        try {
            N3.h.d(constructor.newInstance(interfaceC0277t), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException(e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0149 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.Class r13) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.AbstractC0282y.b(java.lang.Class):int");
    }
}
