package J2;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: J2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0089w extends G2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0091y f1195a;

    public AbstractC0089w(C0091y c0091y) {
        this.f1195a = c0091y;
    }

    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        if (aVar.E() == 9) {
            aVar.A();
            return null;
        }
        Object objD = d();
        Map map = this.f1195a.f1198a;
        try {
            aVar.b();
            while (aVar.r()) {
                C0088v c0088v = (C0088v) map.get(aVar.y());
                if (c0088v == null) {
                    aVar.K();
                } else {
                    f(objD, aVar, c0088v);
                }
            }
            aVar.l();
            return e(objD);
        } catch (IllegalAccessException e5) {
            i4.a aVar2 = L2.c.f1490a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.12.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e5);
        } catch (IllegalStateException e6) {
            throw new G2.h(e6);
        }
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.p();
            return;
        }
        bVar.c();
        try {
            Iterator it = this.f1195a.f1199b.iterator();
            while (it.hasNext()) {
                ((C0088v) it.next()).a(bVar, obj);
            }
            bVar.l();
        } catch (IllegalAccessException e5) {
            i4.a aVar = L2.c.f1490a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.12.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e5);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, O2.a aVar, C0088v c0088v);
}
