package c1;

import d0.AbstractC0360m;
import d0.AbstractC0370w;
import java.util.List;
import m2.C0658q;
import m2.I;
import m2.Z;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0658q f5032n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final I f5033l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long[] f5034m;

    static {
        Z z4 = Z.f8576l;
        B0.l lVar = new B0.l(28);
        z4.getClass();
        f5032n = new C0658q(lVar, z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(m2.b0 r20) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.b.<init>(m2.b0):void");
    }

    @Override // c1.d
    public final int a(long j5) {
        int iA = AbstractC0370w.a(this.f5034m, j5, false);
        if (iA < this.f5033l.size()) {
            return iA;
        }
        return -1;
    }

    @Override // c1.d
    public final List d(long j5) {
        int iE = AbstractC0370w.e(this.f5034m, j5, false);
        return iE == -1 ? I.s() : (I) this.f5033l.get(iE);
    }

    @Override // c1.d
    public final long g(int i) {
        AbstractC0360m.c(i < this.f5033l.size());
        return this.f5034m[i];
    }

    @Override // c1.d
    public final int h() {
        return this.f5033l.size();
    }
}
