package h4;

import N3.h;
import a0.C0200z;
import g4.l;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g4.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f6334c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B3.e f6335b;

    static {
        String str = l.f5856m;
        f6334c = C0200z.s("/", false);
    }

    public c(ClassLoader classLoader) {
        this.f6335b = new B3.e(new G1.a(classLoader, 5));
    }

    @Override // g4.f
    public final g4.e b(l lVar) throws EOFException {
        l lVarD;
        h.e(lVar, "path");
        if (!C0200z.o(lVar)) {
            return null;
        }
        l lVar2 = f6334c;
        lVar2.getClass();
        h.e(lVar, "child");
        l lVarB = b.b(lVar2, lVar, true);
        int iA = b.a(lVarB);
        g4.b bVar = lVarB.f5857l;
        l lVar3 = iA == -1 ? null : new l(bVar.l(0, iA));
        int iA2 = b.a(lVar2);
        g4.b bVar2 = lVar2.f5857l;
        if (!h.a(lVar3, iA2 == -1 ? null : new l(bVar2.l(0, iA2)))) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + lVarB + " and " + lVar2).toString());
        }
        ArrayList arrayListA = lVarB.a();
        ArrayList arrayListA2 = lVar2.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && h.a(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && bVar.b() == bVar2.b()) {
            String str = l.f5856m;
            lVarD = C0200z.s(".", false);
        } else {
            if (arrayListA2.subList(i, arrayListA2.size()).indexOf(b.f6333e) != -1) {
                throw new IllegalArgumentException(("Impossible relative path to resolve: " + lVarB + " and " + lVar2).toString());
            }
            g4.a aVar = new g4.a();
            g4.b bVarC = b.c(lVar2);
            if (bVarC == null && (bVarC = b.c(lVarB)) == null) {
                bVarC = b.f(l.f5856m);
            }
            int size = arrayListA2.size();
            for (int i5 = i; i5 < size; i5++) {
                aVar.s(b.f6333e);
                aVar.s(bVarC);
            }
            int size2 = arrayListA.size();
            while (i < size2) {
                aVar.s((g4.b) arrayListA.get(i));
                aVar.s(bVarC);
                i++;
            }
            lVarD = b.d(aVar, false);
        }
        String strN = lVarD.f5857l.n();
        for (B3.b bVar3 : (List) this.f6335b.a()) {
            g4.e eVarB = ((g4.f) bVar3.f268l).b(((l) bVar3.f269m).d(strN));
            if (eVarB != null) {
                return eVarB;
            }
        }
        return null;
    }
}
