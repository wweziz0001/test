package V3;

/* JADX INFO: renamed from: V3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0135l extends Z implements InterfaceC0134k {
    public final Object V(G3.f fVar) throws Throwable {
        Object objF;
        do {
            objF = F();
            if (!(objF instanceof L)) {
                if (objF instanceof C0137n) {
                    throw ((C0137n) objF).f2433a;
                }
                return AbstractC0144v.o(objF);
            }
        } while (S(objF) < 0);
        V v4 = new V(Z1.f.A(fVar), this);
        v4.u();
        v4.w(new D(J(false, true, new O(v4, 1))));
        return v4.t();
    }
}
