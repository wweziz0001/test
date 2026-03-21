package k0;

import d0.AbstractC0360m;
import l0.C0563b;
import x0.C0961b;
import y0.C0996d;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0996d f7595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0.m f7596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0563b f7597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f7598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7600f;

    public i(long j5, l0.m mVar, C0563b c0563b, C0996d c0996d, long j6, h hVar) {
        this.f7599e = j5;
        this.f7596b = mVar;
        this.f7597c = c0563b;
        this.f7600f = j6;
        this.f7595a = c0996d;
        this.f7598d = hVar;
    }

    public final i a(long j5, l0.m mVar) throws C0961b {
        long jC;
        h hVarD = this.f7596b.d();
        h hVarD2 = mVar.d();
        if (hVarD == null) {
            return new i(j5, mVar, this.f7597c, this.f7595a, this.f7600f, hVarD);
        }
        if (!hVarD.i()) {
            return new i(j5, mVar, this.f7597c, this.f7595a, this.f7600f, hVarD2);
        }
        long jS = hVarD.s(j5);
        if (jS == 0) {
            return new i(j5, mVar, this.f7597c, this.f7595a, this.f7600f, hVarD2);
        }
        AbstractC0360m.i(hVarD2);
        long jN = hVarD.n();
        long jA = hVarD.a(jN);
        long jC2 = jS + jN;
        long j6 = jC2 - 1;
        long jM = hVarD.m(j6, j5) + hVarD.a(j6);
        long jN2 = hVarD2.n();
        long jA2 = hVarD2.a(jN2);
        long j7 = this.f7600f;
        if (jM == jA2) {
            jC = (jC2 - jN2) + j7;
        } else {
            if (jM < jA2) {
                throw new C0961b();
            }
            if (jA2 < jA) {
                jC = j7 - (hVarD2.c(jA, j5) - jN);
            } else {
                jC2 = hVarD.c(jA2, j5);
                jC = (jC2 - jN2) + j7;
            }
        }
        return new i(j5, mVar, this.f7597c, this.f7595a, jC, hVarD2);
    }

    public final long b(long j5) {
        h hVar = this.f7598d;
        AbstractC0360m.i(hVar);
        return hVar.v(this.f7599e, j5) + this.f7600f;
    }

    public final long c(long j5) {
        long jB = b(j5);
        h hVar = this.f7598d;
        AbstractC0360m.i(hVar);
        return (hVar.u(this.f7599e, j5) + jB) - 1;
    }

    public final long d() {
        h hVar = this.f7598d;
        AbstractC0360m.i(hVar);
        return hVar.s(this.f7599e);
    }

    public final long e(long j5) {
        long jF = f(j5);
        h hVar = this.f7598d;
        AbstractC0360m.i(hVar);
        return hVar.m(j5 - this.f7600f, this.f7599e) + jF;
    }

    public final long f(long j5) {
        h hVar = this.f7598d;
        AbstractC0360m.i(hVar);
        return hVar.a(j5 - this.f7600f);
    }

    public final boolean g(long j5, long j6) {
        h hVar = this.f7598d;
        AbstractC0360m.i(hVar);
        return hVar.i() || j6 == -9223372036854775807L || e(j5) <= j6;
    }
}
