package H0;

import F0.D;
import F0.F;
import F0.K;
import d0.AbstractC0360m;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f949h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f950j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f951k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long[] f952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f953m;

    public e(int i, int i5, long j5, int i6, K k4) {
        boolean z4 = true;
        if (i5 != 1 && i5 != 2) {
            z4 = false;
        }
        AbstractC0360m.c(z4);
        this.f945d = j5;
        this.f946e = i6;
        this.f942a = k4;
        int i7 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.f943b = (i5 == 2 ? 1667497984 : 1651965952) | i7;
        this.f944c = i5 == 2 ? i7 | 1650720768 : -1;
        this.f951k = -1L;
        this.f952l = new long[512];
        this.f953m = new int[512];
    }

    public final F a(int i) {
        return new F(((this.f945d * ((long) 1)) / ((long) this.f946e)) * ((long) this.f953m[i]), this.f952l[i]);
    }

    public final D b(long j5) {
        if (this.f950j == 0) {
            F f2 = new F(0L, this.f951k);
            return new D(f2, f2);
        }
        int i = (int) (j5 / ((this.f945d * ((long) 1)) / ((long) this.f946e)));
        int iD = AbstractC0370w.d(this.f953m, i, true, true);
        if (this.f953m[iD] == i) {
            F fA = a(iD);
            return new D(fA, fA);
        }
        F fA2 = a(iD);
        int i5 = iD + 1;
        return i5 < this.f952l.length ? new D(fA2, a(i5)) : new D(fA2, fA2);
    }
}
