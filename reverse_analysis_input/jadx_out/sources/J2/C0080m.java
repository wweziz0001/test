package J2;

import b3.AbstractC0307a;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: renamed from: J2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0080m extends G2.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0080m f1164a = new C0080m();

    private C0080m() {
    }

    public static G2.g d(O2.a aVar, int i) {
        int iB = O.i.b(i);
        if (iB == 5) {
            return new G2.k(aVar.C());
        }
        if (iB == 6) {
            return new G2.k(new I2.k(aVar.C()));
        }
        if (iB == 7) {
            return new G2.k(Boolean.valueOf(aVar.u()));
        }
        if (iB != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC0307a.t(i)));
        }
        aVar.A();
        return G2.i.f905l;
    }

    public static void e(O2.b bVar, G2.g gVar) throws IOException {
        if (gVar == null || (gVar instanceof G2.i)) {
            bVar.p();
            return;
        }
        boolean z4 = gVar instanceof G2.k;
        if (z4) {
            if (!z4) {
                throw new IllegalStateException("Not a JSON Primitive: " + gVar);
            }
            G2.k kVar = (G2.k) gVar;
            Serializable serializable = kVar.f907l;
            if (serializable instanceof Number) {
                bVar.x(kVar.k());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.z(kVar.f());
                return;
            } else {
                bVar.y(kVar.h());
                return;
            }
        }
        boolean z5 = gVar instanceof G2.f;
        if (z5) {
            bVar.b();
            if (!z5) {
                throw new IllegalStateException("Not a JSON Array: " + gVar);
            }
            Iterator it = ((G2.f) gVar).f904l.iterator();
            while (it.hasNext()) {
                e(bVar, (G2.g) it.next());
            }
            bVar.k();
            return;
        }
        if (!(gVar instanceof G2.j)) {
            throw new IllegalArgumentException("Couldn't write " + gVar.getClass());
        }
        bVar.c();
        Iterator it2 = ((I2.n) gVar.g().f906l.entrySet()).iterator();
        while (((I2.m) it2).hasNext()) {
            I2.o oVarB = ((I2.m) it2).b();
            bVar.n((String) oVarB.getKey());
            e(bVar, (G2.g) oVarB.getValue());
        }
        bVar.l();
    }

    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        G2.g fVar;
        G2.g fVar2;
        if (aVar instanceof C0082o) {
            C0082o c0082o = (C0082o) aVar;
            int iE = c0082o.E();
            if (iE != 5 && iE != 2 && iE != 4 && iE != 10) {
                G2.g gVar = (G2.g) c0082o.R();
                c0082o.K();
                return gVar;
            }
            throw new IllegalStateException("Unexpected " + AbstractC0307a.t(iE) + " when reading a JsonElement.");
        }
        int iE2 = aVar.E();
        int iB = O.i.b(iE2);
        if (iB == 0) {
            aVar.a();
            fVar = new G2.f();
        } else if (iB != 2) {
            fVar = null;
        } else {
            aVar.b();
            fVar = new G2.j();
        }
        if (fVar == null) {
            return d(aVar, iE2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.r()) {
                String strY = fVar instanceof G2.j ? aVar.y() : null;
                int iE3 = aVar.E();
                int iB2 = O.i.b(iE3);
                if (iB2 == 0) {
                    aVar.a();
                    fVar2 = new G2.f();
                } else if (iB2 != 2) {
                    fVar2 = null;
                } else {
                    aVar.b();
                    fVar2 = new G2.j();
                }
                boolean z4 = fVar2 != null;
                if (fVar2 == null) {
                    fVar2 = d(aVar, iE3);
                }
                if (fVar instanceof G2.f) {
                    ((G2.f) fVar).f904l.add(fVar2);
                } else {
                    G2.j jVar = (G2.j) fVar;
                    jVar.getClass();
                    jVar.f906l.put(strY, fVar2);
                }
                if (z4) {
                    arrayDeque.addLast(fVar);
                    fVar = fVar2;
                }
            } else {
                if (fVar instanceof G2.f) {
                    aVar.k();
                } else {
                    aVar.l();
                }
                if (arrayDeque.isEmpty()) {
                    return fVar;
                }
                fVar = (G2.g) arrayDeque.removeLast();
            }
        }
    }

    @Override // G2.r
    public final /* bridge */ /* synthetic */ void c(O2.b bVar, Object obj) throws IOException {
        e(bVar, (G2.g) obj);
    }
}
