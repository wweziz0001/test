package I2;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class r extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f1072b;

    public r(Method method) {
        this.f1072b = method;
    }

    @Override // I2.t
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f1072b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e5) {
            throw new RuntimeException("Failed invoking canAccess", e5);
        }
    }
}
