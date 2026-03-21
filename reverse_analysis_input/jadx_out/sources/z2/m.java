package z2;

import D2.C0030b;
import D2.s0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import s2.C0798g;
import v2.AbstractC0919a;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    static {
        C0798g[] c0798gArr = {new C0798g(r2.j.class, 11)};
        HashMap map = new HashMap();
        C0798g c0798g = c0798gArr[0];
        boolean zContainsKey = map.containsKey(c0798g.f9620a);
        Class cls = c0798g.f9620a;
        if (zContainsKey) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
        }
        map.put(cls, c0798g);
        Class cls2 = c0798gArr[0].f9620a;
        Collections.unmodifiableMap(map);
        int i = s0.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    public static void a() {
        r2.n.h(p.f11188c);
        r2.n.h(i.f11172a);
        r2.n.f(new C1067c(), true);
        y2.j jVar = l.f11179a;
        y2.h hVar = y2.h.f10944b;
        hVar.e(l.f11179a);
        hVar.d(l.f11180b);
        hVar.c(l.f11181c);
        hVar.b(l.f11182d);
        y2.g gVar = y2.g.f10942b;
        gVar.b(C1067c.f11149f);
        if (AbstractC0919a.f10358b.get()) {
            return;
        }
        r2.n.f(new C1067c(C0030b.class, new C0798g[]{new C0798g(r2.j.class, 10)}), true);
        hVar.e(f.f11168a);
        hVar.d(f.f11169b);
        hVar.c(f.f11170c);
        hVar.b(f.f11171d);
        gVar.b(C1067c.f11148e);
    }
}
