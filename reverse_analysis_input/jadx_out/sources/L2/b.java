package L2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i4.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f1486b = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f1487c = Class.class.getMethod("getRecordComponents", null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f1488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f1489e;

    public b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f1488d = cls.getMethod("getName", null);
        this.f1489e = cls.getMethod("getType", null);
    }

    @Override // i4.a
    public final String[] C(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f1487c.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f1488d.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e5) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.12.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e5);
        }
    }

    @Override // i4.a
    public final boolean G(Class cls) {
        try {
            return ((Boolean) this.f1486b.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e5) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.12.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e5);
        }
    }

    @Override // i4.a
    public final Method x(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e5) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.12.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e5);
        }
    }

    @Override // i4.a
    public final Constructor z(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f1487c.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f1489e.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e5) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.12.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e5);
        }
    }
}
