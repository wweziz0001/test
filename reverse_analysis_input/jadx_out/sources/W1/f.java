package W1;

import N3.h;
import Q1.q;
import Z1.p;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2469b;

    static {
        h.d(q.f("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(X1.f fVar) {
        super(fVar);
        h.e(fVar, "tracker");
        this.f2469b = 7;
    }

    @Override // W1.d
    public final int a() {
        return this.f2469b;
    }

    @Override // W1.d
    public final boolean b(p pVar) {
        return pVar.f3054j.f1808a == 4;
    }

    @Override // W1.d
    public final boolean c(Object obj) {
        V1.d dVar = (V1.d) obj;
        h.e(dVar, "value");
        return (dVar.f2352a && dVar.f2355d) ? false : true;
    }
}
