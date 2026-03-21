package J2;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: J2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0077j extends G2.r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0076i f1130d = new C0076i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1131a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f1132b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f1133c = new HashMap();

    public C0077j(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String strName = r4.name();
                String string = r4.toString();
                H2.b bVar = (H2.b) field2.getAnnotation(H2.b.class);
                if (bVar != null) {
                    strName = bVar.value();
                    for (String str : bVar.alternate()) {
                        this.f1131a.put(str, r4);
                    }
                }
                this.f1131a.put(strName, r4);
                this.f1132b.put(string, r4);
                this.f1133c.put(r4, strName);
            }
        } catch (IllegalAccessException e5) {
            throw new AssertionError(e5);
        }
    }

    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        if (aVar.E() == 9) {
            aVar.A();
            return null;
        }
        String strC = aVar.C();
        Enum r02 = (Enum) this.f1131a.get(strC);
        return r02 == null ? (Enum) this.f1132b.get(strC) : r02;
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        Enum r32 = (Enum) obj;
        bVar.y(r32 == null ? null : (String) this.f1133c.get(r32));
    }
}
