package I1;

import B3.g;
import E3.d;
import K1.i;
import L.P;
import L.Q;
import N3.p;
import Y3.h;

/* JADX INFO: loaded from: classes.dex */
public final class a implements h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1018m;

    public /* synthetic */ a(Object obj, int i) {
        this.f1017l = i;
        this.f1018m = obj;
    }

    @Override // Y3.h
    public final Object k(Object obj, d dVar) {
        Object objE;
        switch (this.f1017l) {
            case 0:
                ((i) this.f1018m).accept(obj);
                return g.f275a;
            case 1:
                P p4 = (P) this.f1018m;
                boolean z4 = p4.f1338s.k() instanceof Q;
                g gVar = g.f275a;
                return (z4 || (objE = P.e(p4, true, dVar)) != F3.a.f861l) ? gVar : objE;
            default:
                ((p) this.f1018m).f1626l = obj;
                throw new Z3.a(this);
        }
    }
}
