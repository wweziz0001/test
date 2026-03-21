package J2;

import b3.AbstractC0307a;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: J2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0087u extends G2.r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0085s f1184c = new C0085s(G2.p.f908l, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G2.e f1185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G2.p f1186b;

    public C0087u(G2.e eVar, G2.p pVar) {
        this.f1185a = eVar;
        this.f1186b = pVar;
    }

    @Override // G2.r
    public final Object b(O2.a aVar) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iE = aVar.E();
        int iB = O.i.b(iE);
        if (iB == 0) {
            aVar.a();
            arrayList = new ArrayList();
        } else if (iB != 2) {
            arrayList = null;
        } else {
            aVar.b();
            arrayList = new I2.p(true);
        }
        if (arrayList == null) {
            return d(aVar, iE);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.r()) {
                String strY = arrayList instanceof Map ? aVar.y() : null;
                int iE2 = aVar.E();
                int iB2 = O.i.b(iE2);
                if (iB2 == 0) {
                    aVar.a();
                    arrayList2 = new ArrayList();
                } else if (iB2 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.b();
                    arrayList2 = new I2.p(true);
                }
                boolean z4 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(aVar, iE2);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strY, arrayList2);
                }
                if (z4) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.k();
                } else {
                    aVar.l();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.p();
            return;
        }
        Class<?> cls = obj.getClass();
        G2.e eVar = this.f1185a;
        eVar.getClass();
        G2.r rVarC = eVar.c(new N2.a(cls));
        if (!(rVarC instanceof C0087u)) {
            rVarC.c(bVar, obj);
        } else {
            bVar.c();
            bVar.l();
        }
    }

    public final Serializable d(O2.a aVar, int i) {
        int iB = O.i.b(i);
        if (iB == 5) {
            return aVar.C();
        }
        if (iB == 6) {
            return this.f1186b.a(aVar);
        }
        if (iB == 7) {
            return Boolean.valueOf(aVar.u());
        }
        if (iB != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(AbstractC0307a.t(i)));
        }
        aVar.A();
        return null;
    }
}
