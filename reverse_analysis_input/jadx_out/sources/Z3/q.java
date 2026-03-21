package Z3;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F0.p f3135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F0.p f3136b;

    static {
        int i = 1;
        boolean z4 = false;
        f3135a = new F0.p(i, "NULL", z4);
        f3136b = new F0.p(i, "UNINITIALIZED", z4);
    }

    public static /* synthetic */ Y3.g a(o oVar, W3.c cVar, int i, int i5, int i6) {
        E3.i iVar = cVar;
        if ((i6 & 1) != 0) {
            iVar = E3.j.f675l;
        }
        if ((i6 & 2) != 0) {
            i = -3;
        }
        if ((i6 & 4) != 0) {
            i5 = 1;
        }
        return oVar.a(iVar, i, i5);
    }

    public static final Object b(E3.i iVar, Object obj, Object obj2, M3.p pVar, E3.d dVar) {
        Object objM = a4.a.m(iVar, obj2);
        try {
            x xVar = new x(dVar, iVar);
            N3.s.a(2, pVar);
            Object objI = pVar.i(obj, xVar);
            a4.a.g(iVar, objM);
            if (objI == F3.a.f861l) {
                N3.h.e(dVar, "frame");
            }
            return objI;
        } catch (Throwable th) {
            a4.a.g(iVar, objM);
            throw th;
        }
    }
}
