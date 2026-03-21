package V3;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends a4.t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ThreadLocal f2424p;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public j0(E3.i iVar, G3.f fVar) {
        k0 k0Var = k0.f2425l;
        super(fVar, iVar.l(k0Var) == null ? iVar.o(k0Var) : iVar);
        this.f2424p = new ThreadLocal();
        E3.i iVar2 = fVar.f914m;
        N3.h.b(iVar2);
        if (iVar2.l(E3.e.f674l) instanceof AbstractC0141s) {
            return;
        }
        Object objM = a4.a.m(iVar, null);
        a4.a.g(iVar, objM);
        Z(iVar, objM);
    }

    public final boolean Y() {
        boolean z4 = this.threadLocalIsSet && this.f2424p.get() == null;
        this.f2424p.remove();
        return !z4;
    }

    public final void Z(E3.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f2424p.set(new B3.b(iVar, obj));
    }

    @Override // a4.t, V3.Z
    public final void s(Object obj) {
        if (this.threadLocalIsSet) {
            B3.b bVar = (B3.b) this.f2424p.get();
            if (bVar != null) {
                a4.a.g((E3.i) bVar.f268l, bVar.f269m);
            }
            this.f2424p.remove();
        }
        Object objK = AbstractC0144v.k(obj);
        E3.d dVar = this.f3623o;
        E3.i context = dVar.getContext();
        Object objM = a4.a.m(context, null);
        j0 j0VarP = objM != a4.a.f3588f ? AbstractC0144v.p(dVar, context, objM) : null;
        try {
            this.f3623o.j(objK);
        } finally {
            if (j0VarP == null || j0VarP.Y()) {
                a4.a.g(context, objM);
            }
        }
    }
}
