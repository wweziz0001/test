package I2;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class u extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f1074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1075c;

    public u(Method method, Object obj) {
        this.f1074b = method;
        this.f1075c = obj;
    }

    @Override // I2.y
    public final Object a(Class cls) {
        String strB = Z1.e.b(cls);
        if (strB != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strB));
        }
        return this.f1074b.invoke(this.f1075c, cls);
    }
}
