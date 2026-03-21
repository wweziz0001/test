package x0;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class W implements f0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10584l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f10585m;

    public W(Y y, int i) {
        this.f10585m = y;
        this.f10584l = i;
    }

    @Override // x0.f0
    public final void a() throws IOException {
        Y y = this.f10585m;
        y.f10594E[this.f10584l].u();
        int iO = y.f10618o.o(y.f10603O);
        B0.r rVar = y.f10626w;
        IOException iOException = rVar.f244n;
        if (iOException != null) {
            throw iOException;
        }
        B0.n nVar = rVar.f243m;
        if (nVar != null) {
            if (iO == Integer.MIN_VALUE) {
                iO = nVar.f229l;
            }
            IOException iOException2 = nVar.f233p;
            if (iOException2 != null && nVar.f234q > iO) {
                throw iOException2;
            }
        }
    }

    @Override // x0.f0
    public final int d(long j5) {
        Y y = this.f10585m;
        if (y.F()) {
            return 0;
        }
        int i = this.f10584l;
        y.A(i);
        e0 e0Var = y.f10594E[i];
        int iP = e0Var.p(j5, y.f10613Y);
        e0Var.C(iP);
        if (iP != 0) {
            return iP;
        }
        y.B(i);
        return iP;
    }

    @Override // x0.f0
    public final boolean isReady() {
        Y y = this.f10585m;
        return !y.F() && y.f10594E[this.f10584l].s(y.f10613Y);
    }

    @Override // x0.f0
    public final int k(Z1.e eVar, g0.e eVar2, int i) {
        Y y = this.f10585m;
        if (y.F()) {
            return -3;
        }
        int i5 = this.f10584l;
        y.A(i5);
        int iX = y.f10594E[i5].x(eVar, eVar2, i, y.f10613Y);
        if (iX == -3) {
            y.B(i5);
        }
        return iX;
    }
}
