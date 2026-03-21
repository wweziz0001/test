package V1;

import Q1.q;
import V3.AbstractC0144v;
import V3.J;
import V3.T;
import Z1.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2368a;

    static {
        String strF = q.f("WorkConstraintsTracker");
        N3.h.d(strF, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f2368a = strF;
    }

    public static final T a(h hVar, p pVar, J j5, e eVar) {
        N3.h.e(hVar, "<this>");
        N3.h.e(j5, "dispatcher");
        N3.h.e(eVar, "listener");
        T tB = AbstractC0144v.b();
        AbstractC0144v.j(AbstractC0144v.a(D1.b.K(j5, tB)), new j(hVar, pVar, eVar, null));
        return tB;
    }
}
