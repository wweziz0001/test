package L;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements E3.g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d0 f1378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final P f1379m;

    public d0(d0 d0Var, P p4) {
        N3.h.e(p4, "instance");
        this.f1378l = d0Var;
        this.f1379m = p4;
    }

    @Override // E3.i
    public final E3.i c(E3.h hVar) {
        return D1.b.H(this, hVar);
    }

    public final void d(P p4) {
        if (this.f1379m == p4) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        d0 d0Var = this.f1378l;
        if (d0Var != null) {
            d0Var.d(p4);
        }
    }

    @Override // E3.g
    public final E3.h getKey() {
        return c0.f1374l;
    }

    @Override // E3.i
    public final Object k(Object obj, M3.p pVar) {
        return pVar.i(obj, this);
    }

    @Override // E3.i
    public final E3.g l(E3.h hVar) {
        return D1.b.A(this, hVar);
    }

    @Override // E3.i
    public final E3.i o(E3.i iVar) {
        return D1.b.K(this, iVar);
    }
}
