package G1;

import H1.c;
import H1.d;
import N3.e;
import N3.h;
import android.app.Activity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f886a;

    public /* synthetic */ b(ClassLoader classLoader) {
        this.f886a = classLoader;
    }

    public d a(Object obj, e eVar, Activity activity, M1.b bVar) throws IllegalAccessException, InvocationTargetException {
        c cVar = new c(eVar, bVar);
        Object objNewProxyInstance = Proxy.newProxyInstance(this.f886a, new Class[]{b()}, cVar);
        h.d(objNewProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, objNewProxyInstance);
        return new d(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, objNewProxyInstance);
    }

    public Class b() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f886a.loadClass("java.util.function.Consumer");
        h.d(clsLoadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return clsLoadClass;
    }
}
