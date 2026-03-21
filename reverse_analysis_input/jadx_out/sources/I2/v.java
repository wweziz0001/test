package I2;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class v extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f1076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1077c;

    public v(int i, Method method) {
        this.f1076b = method;
        this.f1077c = i;
    }

    @Override // I2.y
    public final Object a(Class cls) {
        String strB = Z1.e.b(cls);
        if (strB != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strB));
        }
        return this.f1076b.invoke(null, cls, Integer.valueOf(this.f1077c));
    }
}
