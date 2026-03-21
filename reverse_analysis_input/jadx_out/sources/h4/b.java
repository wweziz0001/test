package h4;

import N3.h;
import b3.AbstractC0307a;
import g4.l;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g4.b f6329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g4.b f6330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g4.b f6331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g4.b f6332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g4.b f6333e;

    static {
        g4.b bVar = g4.b.f5831o;
        f6329a = i4.a.u("/");
        f6330b = i4.a.u("\\");
        f6331c = i4.a.u("/\\");
        f6332d = i4.a.u(".");
        f6333e = i4.a.u("..");
    }

    public static final int a(l lVar) {
        if (lVar.f5857l.b() == 0) {
            return -1;
        }
        g4.b bVar = lVar.f5857l;
        if (bVar.g(0) != 47) {
            if (bVar.g(0) != 92) {
                if (bVar.b() <= 2 || bVar.g(1) != 58 || bVar.g(2) != 92) {
                    return -1;
                }
                char cG = (char) bVar.g(0);
                return (('a' > cG || cG >= '{') && ('A' > cG || cG >= '[')) ? -1 : 3;
            }
            if (bVar.b() > 2 && bVar.g(1) == 92) {
                g4.b bVar2 = f6330b;
                h.e(bVar2, "other");
                int iD = bVar.d(2, bVar2.f5832l);
                return iD == -1 ? bVar.b() : iD;
            }
        }
        return 1;
    }

    public static final l b(l lVar, l lVar2, boolean z4) {
        h.e(lVar, "<this>");
        h.e(lVar2, "child");
        if (a(lVar2) != -1 || lVar2.g() != null) {
            return lVar2;
        }
        g4.b bVarC = c(lVar);
        if (bVarC == null && (bVarC = c(lVar2)) == null) {
            bVarC = f(l.f5856m);
        }
        g4.a aVar = new g4.a();
        aVar.s(lVar.f5857l);
        if (aVar.f5830m > 0) {
            aVar.s(bVarC);
        }
        aVar.s(lVar2.f5857l);
        return d(aVar, z4);
    }

    public static final g4.b c(l lVar) {
        g4.b bVar = lVar.f5857l;
        g4.b bVar2 = f6329a;
        if (g4.b.e(bVar, bVar2) != -1) {
            return bVar2;
        }
        g4.b bVar3 = f6330b;
        if (g4.b.e(lVar.f5857l, bVar3) != -1) {
            return bVar3;
        }
        return null;
    }

    public static final l d(g4.a aVar, boolean z4) throws EOFException {
        g4.b bVar;
        g4.b bVar2;
        char cA;
        g4.b bVarL;
        g4.a aVar2 = new g4.a();
        g4.b bVarE = null;
        int i = 0;
        while (true) {
            if (!aVar.c(f6329a)) {
                bVar = f6330b;
                if (!aVar.c(bVar)) {
                    break;
                }
            }
            byte bF = aVar.f();
            if (bVarE == null) {
                bVarE = e(bF);
            }
            i++;
        }
        boolean z5 = i >= 2 && h.a(bVarE, bVar);
        g4.b bVar3 = f6331c;
        if (z5) {
            h.b(bVarE);
            aVar2.s(bVarE);
            aVar2.s(bVarE);
        } else if (i > 0) {
            h.b(bVarE);
            aVar2.s(bVarE);
        } else {
            long jB = aVar.b(bVar3);
            if (bVarE == null) {
                bVarE = jB == -1 ? f(l.f5856m) : e(aVar.a(jB));
            }
            if (h.a(bVarE, bVar)) {
                bVar2 = bVarE;
                if (aVar.f5830m >= 2 && aVar.a(1L) == 58 && (('a' <= (cA = (char) aVar.a(0L)) && cA < '{') || ('A' <= cA && cA < '['))) {
                    if (jB == 2) {
                        aVar2.r(aVar, 3L);
                    } else {
                        aVar2.r(aVar, 2L);
                    }
                }
            } else {
                bVar2 = bVarE;
            }
            bVarE = bVar2;
        }
        boolean z6 = aVar2.f5830m > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean z7 = aVar.f5830m == 0;
            g4.b bVar4 = f6332d;
            if (z7) {
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    if (i5 > 0) {
                        aVar2.s(bVarE);
                    }
                    aVar2.s((g4.b) arrayList.get(i5));
                }
                if (aVar2.f5830m == 0) {
                    aVar2.s(bVar4);
                }
                return new l(aVar2.l(aVar2.f5830m));
            }
            long jB2 = aVar.b(bVar3);
            if (jB2 == -1) {
                bVarL = aVar.l(aVar.f5830m);
            } else {
                bVarL = aVar.l(jB2);
                aVar.f();
            }
            g4.b bVar5 = f6333e;
            if (h.a(bVarL, bVar5)) {
                if (!z6 || !arrayList.isEmpty()) {
                    if (z4) {
                        if (!z6) {
                            if (!arrayList.isEmpty()) {
                                if (arrayList.isEmpty()) {
                                    throw new NoSuchElementException("List is empty.");
                                }
                                if (h.a(arrayList.get(arrayList.size() - 1), bVar5)) {
                                }
                            }
                            arrayList.add(bVarL);
                        }
                        if ((!z5 || arrayList.size() != 1) && !arrayList.isEmpty()) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                    } else {
                        arrayList.add(bVarL);
                    }
                }
            } else if (!h.a(bVarL, bVar4) && !h.a(bVarL, g4.b.f5831o)) {
                arrayList.add(bVarL);
            }
        }
    }

    public static final g4.b e(byte b4) {
        if (b4 == 47) {
            return f6329a;
        }
        if (b4 == 92) {
            return f6330b;
        }
        throw new IllegalArgumentException(AbstractC0307a.i("not a directory separator: ", b4));
    }

    public static final g4.b f(String str) {
        if (h.a(str, "/")) {
            return f6329a;
        }
        if (h.a(str, "\\")) {
            return f6330b;
        }
        throw new IllegalArgumentException(AbstractC0307a.j("not a directory separator: ", str));
    }
}
