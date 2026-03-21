package w2;

import D2.s0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import r2.n;
import s2.C0798g;
import s2.i;
import v2.AbstractC0919a;
import y2.h;
import y2.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    static {
        C0798g[] c0798gArr = {new C0798g(r2.c.class, 9)};
        HashMap map = new HashMap();
        for (C0798g c0798g : c0798gArr) {
            boolean zContainsKey = map.containsKey(c0798g.f9620a);
            Class cls = c0798g.f9620a;
            if (zContainsKey) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
            }
            map.put(cls, c0798g);
        }
        if (c0798gArr.length > 0) {
            Class cls2 = c0798gArr[0].f9620a;
        }
        Collections.unmodifiableMap(map);
        int i = s0.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    public static void a() {
        n.h(g.f10504b);
        if (AbstractC0919a.f10358b.get()) {
            return;
        }
        n.f(new i(9), true);
        j jVar = d.f10495a;
        h hVar = h.f10944b;
        hVar.e(d.f10495a);
        hVar.d(d.f10496b);
        hVar.c(d.f10497c);
        hVar.b(d.f10498d);
    }
}
