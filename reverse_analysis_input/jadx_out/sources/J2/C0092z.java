package J2;

import b3.AbstractC0307a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: J2.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0092z extends AbstractC0089w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f1200e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Constructor f1201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f1202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f1203d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f1200e = map;
    }

    public C0092z(Class cls, C0091y c0091y) {
        super(c0091y);
        this.f1203d = new HashMap();
        i4.a aVar = L2.c.f1490a;
        Constructor constructorZ = aVar.z(cls);
        this.f1201b = constructorZ;
        L2.c.f(constructorZ);
        String[] strArrC = aVar.C(cls);
        for (int i = 0; i < strArrC.length; i++) {
            this.f1203d.put(strArrC[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f1201b.getParameterTypes();
        this.f1202c = new Object[parameterTypes.length];
        for (int i5 = 0; i5 < parameterTypes.length; i5++) {
            this.f1202c[i5] = f1200e.get(parameterTypes[i5]);
        }
    }

    @Override // J2.AbstractC0089w
    public final Object d() {
        return (Object[]) this.f1202c.clone();
    }

    @Override // J2.AbstractC0089w
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f1201b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e5) {
            i4.a aVar = L2.c.f1490a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.12.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e5);
        } catch (IllegalArgumentException e6) {
            e = e6;
            throw new RuntimeException("Failed to invoke constructor '" + L2.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e7) {
            e = e7;
            throw new RuntimeException("Failed to invoke constructor '" + L2.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("Failed to invoke constructor '" + L2.c.b(constructor) + "' with args " + Arrays.toString(objArr), e8.getCause());
        }
    }

    @Override // J2.AbstractC0089w
    public final void f(Object obj, O2.a aVar, C0088v c0088v) {
        Object[] objArr = (Object[]) obj;
        HashMap map = this.f1203d;
        String str = c0088v.f1189c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + L2.c.b(this.f1201b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objB = c0088v.f1193g.b(aVar);
        if (objB != null || !c0088v.f1194h) {
            objArr[iIntValue] = objB;
        } else {
            StringBuilder sbM = AbstractC0307a.m("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbM.append(aVar.o());
            throw new A1.c(sbM.toString());
        }
    }
}
