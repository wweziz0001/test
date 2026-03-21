package k0;

import a0.AbstractC0169U;
import a0.C0150A;
import a0.C0167S;
import a0.C0176b;
import a0.C0196v;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import l0.C0564c;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0169U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7558h;
    public final C0564c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0150A f7559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0196v f7560k;

    public e(long j5, long j6, long j7, int i, long j8, long j9, long j10, C0564c c0564c, C0150A c0150a, C0196v c0196v) {
        AbstractC0360m.h(c0564c.f7825d == (c0196v != null));
        this.f7552b = j5;
        this.f7553c = j6;
        this.f7554d = j7;
        this.f7555e = i;
        this.f7556f = j8;
        this.f7557g = j9;
        this.f7558h = j10;
        this.i = c0564c;
        this.f7559j = c0150a;
        this.f7560k = c0196v;
    }

    @Override // a0.AbstractC0169U
    public final int b(Object obj) {
        int iIntValue;
        if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f7555e) >= 0 && iIntValue < h()) {
            return iIntValue;
        }
        return -1;
    }

    @Override // a0.AbstractC0169U
    public final C0167S f(int i, C0167S c0167s, boolean z4) {
        AbstractC0360m.e(i, h());
        C0564c c0564c = this.i;
        String str = z4 ? c0564c.b(i).f7853a : null;
        Integer numValueOf = z4 ? Integer.valueOf(this.f7555e + i) : null;
        long jD = c0564c.d(i);
        long jM = AbstractC0370w.M(c0564c.b(i).f7854b - c0564c.b(0).f7854b) - this.f7556f;
        c0167s.getClass();
        c0167s.h(str, numValueOf, 0, jD, jM, C0176b.f3316c, false);
        return c0167s;
    }

    @Override // a0.AbstractC0169U
    public final int h() {
        return this.i.f7833m.size();
    }

    @Override // a0.AbstractC0169U
    public final Object l(int i) {
        AbstractC0360m.e(i, h());
        return Integer.valueOf(this.f7555e + i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[PHI: r7
      0x003b: PHI (r7v1 long) = (r7v0 long), (r7v2 long) binds: [B:14:0x002e, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a0.AbstractC0169U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a0.C0168T m(int r22, a0.C0168T r23, long r24) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.e.m(int, a0.T, long):a0.T");
    }

    @Override // a0.AbstractC0169U
    public final int o() {
        return 1;
    }
}
