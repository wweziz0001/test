package x0;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f0 f10762l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f10763m;

    public o0(f0 f0Var, long j5) {
        this.f10762l = f0Var;
        this.f10763m = j5;
    }

    @Override // x0.f0
    public final void a() {
        this.f10762l.a();
    }

    @Override // x0.f0
    public final int d(long j5) {
        return this.f10762l.d(j5 - this.f10763m);
    }

    @Override // x0.f0
    public final boolean isReady() {
        return this.f10762l.isReady();
    }

    @Override // x0.f0
    public final int k(Z1.e eVar, g0.e eVar2, int i) {
        int iK = this.f10762l.k(eVar, eVar2, i);
        if (iK == -4) {
            eVar2.f5789r += this.f10763m;
        }
        return iK;
    }
}
