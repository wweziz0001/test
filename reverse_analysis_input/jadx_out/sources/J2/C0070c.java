package J2;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: J2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0070c extends G2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1121a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1123c;

    public C0070c(G2.e eVar, Type type, G2.r rVar, I2.q qVar) {
        this.f1122b = new E(eVar, rVar, type);
        this.f1123c = qVar;
    }

    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        switch (this.f1121a) {
            case 0:
                if (aVar.E() == 9) {
                    aVar.A();
                    return null;
                }
                Collection collection = (Collection) ((I2.q) this.f1123c).e();
                aVar.a();
                while (aVar.r()) {
                    collection.add(((G2.r) ((E) this.f1122b).f1110c).b(aVar));
                }
                aVar.k();
                return collection;
            default:
                Object objB = ((Z) this.f1123c).f1114n.b(aVar);
                if (objB != null) {
                    Class cls = (Class) this.f1122b;
                    if (!cls.isInstance(objB)) {
                        throw new G2.h("Expected a " + cls.getName() + " but was " + objB.getClass().getName() + "; at path " + aVar.q());
                    }
                }
                return objB;
        }
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        switch (this.f1121a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    bVar.b();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((E) this.f1122b).c(bVar, it.next());
                    }
                    bVar.k();
                } else {
                    bVar.p();
                }
                break;
            default:
                ((Z) this.f1123c).f1114n.c(bVar, obj);
                break;
        }
    }

    public C0070c(Z z4, Class cls) {
        this.f1123c = z4;
        this.f1122b = cls;
    }
}
