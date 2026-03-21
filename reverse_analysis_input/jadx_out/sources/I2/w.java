package I2;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class w extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f1078b;

    public w(Method method) {
        this.f1078b = method;
    }

    @Override // I2.y
    public final Object a(Class cls) {
        String strB = Z1.e.b(cls);
        if (strB != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strB));
        }
        return this.f1078b.invoke(null, cls, Object.class);
    }
}
