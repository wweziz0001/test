package s2;

import D2.s0;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import r2.InterfaceC0781a;
import v2.AbstractC0919a;

/* JADX INFO: renamed from: s2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0792a {
    static {
        C0798g[] c0798gArr = {new C0798g(InterfaceC0781a.class, 0)};
        HashMap map = new HashMap();
        for (int i = 0; i < 1; i++) {
            C0798g c0798g = c0798gArr[i];
            boolean zContainsKey = map.containsKey(c0798g.f9620a);
            Class cls = c0798g.f9620a;
            if (zContainsKey) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls.getCanonicalName());
            }
            map.put(cls, c0798g);
        }
        Class cls2 = c0798gArr[0].f9620a;
        Collections.unmodifiableMap(map);
        C0798g[] c0798gArr2 = {new C0798g(InterfaceC0781a.class, 3)};
        HashMap map2 = new HashMap();
        C0798g c0798g2 = c0798gArr2[0];
        boolean zContainsKey2 = map2.containsKey(c0798g2.f9620a);
        Class cls3 = c0798g2.f9620a;
        if (zContainsKey2) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
        }
        map2.put(cls3, c0798g2);
        Class cls4 = c0798gArr2[0].f9620a;
        Collections.unmodifiableMap(map2);
        C0798g[] c0798gArr3 = {new C0798g(InterfaceC0781a.class, 4)};
        HashMap map3 = new HashMap();
        C0798g c0798g3 = c0798gArr3[0];
        boolean zContainsKey3 = map3.containsKey(c0798g3.f9620a);
        Class cls5 = c0798g3.f9620a;
        if (zContainsKey3) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls5.getCanonicalName());
        }
        map3.put(cls5, c0798g3);
        Class cls6 = c0798gArr3[0].f9620a;
        Collections.unmodifiableMap(map3);
        C0798g[] c0798gArr4 = {new C0798g(InterfaceC0781a.class, 2)};
        HashMap map4 = new HashMap();
        C0798g c0798g4 = c0798gArr4[0];
        boolean zContainsKey4 = map4.containsKey(c0798g4.f9620a);
        Class cls7 = c0798g4.f9620a;
        if (zContainsKey4) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls7.getCanonicalName());
        }
        map4.put(cls7, c0798g4);
        Class cls8 = c0798gArr4[0].f9620a;
        Collections.unmodifiableMap(map4);
        C0798g[] c0798gArr5 = {new C0798g(InterfaceC0781a.class, 6)};
        HashMap map5 = new HashMap();
        C0798g c0798g5 = c0798gArr5[0];
        boolean zContainsKey5 = map5.containsKey(c0798g5.f9620a);
        Class cls9 = c0798g5.f9620a;
        if (zContainsKey5) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls9.getCanonicalName());
        }
        map5.put(cls9, c0798g5);
        Class cls10 = c0798gArr5[0].f9620a;
        Collections.unmodifiableMap(map5);
        C0798g[] c0798gArr6 = {new C0798g(InterfaceC0781a.class, 7)};
        HashMap map6 = new HashMap();
        C0798g c0798g6 = c0798gArr6[0];
        boolean zContainsKey6 = map6.containsKey(c0798g6.f9620a);
        Class cls11 = c0798g6.f9620a;
        if (zContainsKey6) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls11.getCanonicalName());
        }
        map6.put(cls11, c0798g6);
        Class cls12 = c0798gArr6[0].f9620a;
        Collections.unmodifiableMap(map6);
        C0798g[] c0798gArr7 = {new C0798g(InterfaceC0781a.class, 5)};
        HashMap map7 = new HashMap();
        C0798g c0798g7 = c0798gArr7[0];
        boolean zContainsKey7 = map7.containsKey(c0798g7.f9620a);
        Class cls13 = c0798g7.f9620a;
        if (zContainsKey7) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls13.getCanonicalName());
        }
        map7.put(cls13, c0798g7);
        Class cls14 = c0798gArr7[0].f9620a;
        Collections.unmodifiableMap(map7);
        C0798g[] c0798gArr8 = {new C0798g(InterfaceC0781a.class, 8)};
        HashMap map8 = new HashMap();
        C0798g c0798g8 = c0798gArr8[0];
        boolean zContainsKey8 = map8.containsKey(c0798g8.f9620a);
        Class cls15 = c0798g8.f9620a;
        if (zContainsKey8) {
            throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls15.getCanonicalName());
        }
        map8.put(cls15, c0798g8);
        Class cls16 = c0798gArr8[0].f9620a;
        Collections.unmodifiableMap(map8);
        int i5 = s0.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    public static void a() {
        r2.n.h(C0796e.f9619b);
        z2.m.a();
        r2.n.f(new i(0), true);
        y2.j jVar = m.f9654a;
        y2.h hVar = y2.h.f10944b;
        hVar.e(m.f9654a);
        hVar.d(m.f9655b);
        hVar.c(m.f9656c);
        hVar.b(m.f9657d);
        r2.n.f(new i(3), true);
        hVar.e(s.f9670a);
        hVar.d(s.f9671b);
        hVar.c(s.f9672c);
        hVar.b(s.f9673d);
        if (AbstractC0919a.f10358b.get()) {
            return;
        }
        r2.n.f(new i(2), true);
        hVar.e(p.f9662a);
        hVar.d(p.f9663b);
        hVar.c(p.f9664c);
        hVar.b(p.f9665d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            r2.n.f(new i(4), true);
            hVar.e(v.f9676a);
            hVar.d(v.f9677b);
            hVar.c(v.f9678c);
            hVar.b(v.f9679d);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        r2.n.f(new i(5), true);
        y2.j jVar2 = y.f9680a;
        y2.h hVar2 = y2.h.f10944b;
        hVar2.e(y.f9680a);
        hVar2.d(y.f9681b);
        hVar2.c(y.f9682c);
        hVar2.b(y.f9683d);
        r2.n.f(new i(6), true);
        r2.n.f(new i(7), true);
        r2.n.f(new i(8), true);
        hVar2.e(AbstractC0791C.f9611a);
        hVar2.d(AbstractC0791C.f9612b);
        hVar2.c(AbstractC0791C.f9613c);
        hVar2.b(AbstractC0791C.f9614d);
    }
}
