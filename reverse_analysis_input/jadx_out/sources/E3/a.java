package E3;

import M3.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f670l;

    public a(h hVar) {
        this.f670l = hVar;
    }

    @Override // E3.i
    public i c(h hVar) {
        return D1.b.H(this, hVar);
    }

    @Override // E3.g
    public final h getKey() {
        return this.f670l;
    }

    @Override // E3.i
    public final Object k(Object obj, p pVar) {
        return pVar.i(obj, this);
    }

    @Override // E3.i
    public g l(h hVar) {
        return D1.b.A(this, hVar);
    }

    @Override // E3.i
    public final i o(i iVar) {
        return D1.b.K(this, iVar);
    }
}
