package J2;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r extends G2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f1176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f1177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I2.q f1178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0071d f1179d;

    public r(C0071d c0071d, G2.e eVar, Type type, G2.r rVar, Type type2, G2.r rVar2, I2.q qVar) {
        this.f1179d = c0071d;
        this.f1176a = new E(eVar, rVar, type);
        this.f1177b = new E(eVar, rVar2, type2);
        this.f1178c = qVar;
    }

    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        int iE = aVar.E();
        if (iE == 9) {
            aVar.A();
            return null;
        }
        Map map = (Map) this.f1178c.e();
        if (iE == 1) {
            aVar.a();
            while (aVar.r()) {
                aVar.a();
                Object objB = ((G2.r) this.f1176a.f1110c).b(aVar);
                if (map.put(objB, ((G2.r) this.f1177b.f1110c).b(aVar)) != null) {
                    throw new G2.h("duplicate key: " + objB);
                }
                aVar.k();
            }
            aVar.k();
        } else {
            aVar.b();
            while (aVar.r()) {
                A0.b.f47m.getClass();
                if (aVar instanceof C0082o) {
                    C0082o c0082o = (C0082o) aVar;
                    c0082o.N(5);
                    Map.Entry entry = (Map.Entry) ((Iterator) c0082o.R()).next();
                    c0082o.T(entry.getValue());
                    c0082o.T(new G2.k((String) entry.getKey()));
                } else {
                    int iF = aVar.f1643r;
                    if (iF == 0) {
                        iF = aVar.f();
                    }
                    if (iF == 13) {
                        aVar.f1643r = 9;
                    } else if (iF == 12) {
                        aVar.f1643r = 8;
                    } else {
                        if (iF != 14) {
                            throw aVar.M("a name");
                        }
                        aVar.f1643r = 10;
                    }
                }
                Object objB2 = ((G2.r) this.f1176a.f1110c).b(aVar);
                if (map.put(objB2, ((G2.r) this.f1177b.f1110c).b(aVar)) != null) {
                    throw new G2.h("duplicate key: " + objB2);
                }
            }
            aVar.l();
        }
        return map;
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            bVar.p();
            return;
        }
        this.f1179d.getClass();
        E e5 = this.f1177b;
        bVar.c();
        for (Map.Entry entry : map.entrySet()) {
            bVar.n(String.valueOf(entry.getKey()));
            e5.c(bVar, entry.getValue());
        }
        bVar.l();
    }
}
