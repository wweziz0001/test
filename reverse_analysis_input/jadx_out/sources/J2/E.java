package J2;

import com.dexterous.flutterlocalnotifications.RuntimeTypeAdapterFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class E extends G2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1108a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1111d;

    public E(G2.e eVar, G2.r rVar, Type type) {
        this.f1109b = eVar;
        this.f1110c = rVar;
        this.f1111d = type;
    }

    @Override // G2.r
    public final Object b(O2.a aVar) {
        switch (this.f1108a) {
            case 0:
                return ((G2.r) this.f1110c).b(aVar);
            default:
                G2.g gVarI = I2.d.i(aVar);
                G2.j jVarG = gVarI.g();
                RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = (RuntimeTypeAdapterFactory) this.f1111d;
                G2.g gVar = (G2.g) jVarG.f906l.remove(runtimeTypeAdapterFactory.typeFieldName);
                if (gVar == null) {
                    throw new A1.c("cannot deserialize " + runtimeTypeAdapterFactory.baseType + " because it does not define a field named " + runtimeTypeAdapterFactory.typeFieldName);
                }
                String strH = gVar.h();
                G2.r rVar = (G2.r) ((LinkedHashMap) this.f1109b).get(strH);
                if (rVar == null) {
                    throw new A1.c("cannot deserialize " + runtimeTypeAdapterFactory.baseType + " subtype named " + strH + "; did you forget to register a subtype?");
                }
                try {
                    C0082o c0082o = new C0082o(C0082o.f1165E);
                    c0082o.f1167A = new Object[32];
                    c0082o.f1168B = 0;
                    c0082o.f1169C = new String[32];
                    c0082o.f1170D = new int[32];
                    c0082o.T(gVarI);
                    return rVar.b(c0082o);
                } catch (IOException e5) {
                    throw new G2.h(e5);
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    @Override // G2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(O2.b r7, java.lang.Object r8) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.E.c(O2.b, java.lang.Object):void");
    }

    public E(RuntimeTypeAdapterFactory runtimeTypeAdapterFactory, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f1111d = runtimeTypeAdapterFactory;
        this.f1109b = linkedHashMap;
        this.f1110c = linkedHashMap2;
    }
}
