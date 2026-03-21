package J2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: renamed from: J2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0071d implements G2.s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1124l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Z1.e f1125m;

    public /* synthetic */ C0071d(Z1.e eVar, int i) {
        this.f1124l = i;
        this.f1125m = eVar;
    }

    @Override // G2.s
    public final G2.r create(G2.e eVar, N2.a aVar) {
        Class cls;
        Type[] actualTypeArguments;
        Z1.e eVar2 = this.f1125m;
        cls = Object.class;
        switch (this.f1124l) {
            case 0:
                Type type = aVar.f1602b;
                Class cls2 = aVar.f1601a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                I2.d.b(Collection.class.isAssignableFrom(cls2));
                Type typeK = I2.d.k(type, cls2, I2.d.g(type, cls2, Collection.class), new HashMap());
                cls = typeK instanceof ParameterizedType ? ((ParameterizedType) typeK).getActualTypeArguments()[0] : Object.class;
                return new C0070c(eVar, cls, eVar.c(new N2.a(cls)), eVar2.p(aVar));
            default:
                Type type2 = aVar.f1602b;
                Class cls3 = aVar.f1601a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls3)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getUpperBounds()[0];
                    }
                    I2.d.b(Map.class.isAssignableFrom(cls3));
                    Type typeK2 = I2.d.k(type2, cls3, I2.d.g(type2, cls3, Map.class), new HashMap());
                    actualTypeArguments = typeK2 instanceof ParameterizedType ? ((ParameterizedType) typeK2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                return new r(this, eVar, actualTypeArguments[0], (type3 == Boolean.TYPE || type3 == Boolean.class) ? j0.f1138c : eVar.c(new N2.a(type3)), actualTypeArguments[1], eVar.c(new N2.a(actualTypeArguments[1])), eVar2.p(aVar));
        }
    }
}
