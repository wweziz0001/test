package J2;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: J2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0068a implements G2.s {
    @Override // G2.s
    public final G2.r create(G2.e eVar, N2.a aVar) {
        Type type = aVar.f1602b;
        boolean z4 = type instanceof GenericArrayType;
        if (!z4 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z4 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new C0069b(eVar, eVar.c(new N2.a(genericComponentType)), I2.d.h(genericComponentType));
    }
}
