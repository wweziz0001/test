package J2;

import g2.C0439b;

/* JADX INFO: loaded from: classes.dex */
public final class C implements G2.s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final N2.a f1099l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f1100m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0439b f1101n;

    public C(C0439b c0439b, N2.a aVar, boolean z4) {
        this.f1101n = c0439b;
        this.f1099l = aVar;
        this.f1100m = z4;
    }

    @Override // G2.s
    public final G2.r create(G2.e eVar, N2.a aVar) {
        N2.a aVar2 = this.f1099l;
        if (aVar2 == null) {
            Class cls = aVar.f1601a;
            throw null;
        }
        if (!aVar2.equals(aVar)) {
            if (!this.f1100m) {
                return null;
            }
            if (aVar2.f1602b != aVar.f1601a) {
                return null;
            }
        }
        return new D(this.f1101n, eVar, aVar, this, true);
    }
}
