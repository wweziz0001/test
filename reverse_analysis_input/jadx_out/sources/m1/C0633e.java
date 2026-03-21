package m1;

import F0.D;
import F0.E;
import F0.F;
import Z0.g;
import d0.AbstractC0370w;
import java.math.RoundingMode;

/* JADX INFO: renamed from: m1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0633e implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f8530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8534e;

    public C0633e(g gVar, int i, long j5, long j6) {
        this.f8530a = gVar;
        this.f8531b = i;
        this.f8532c = j5;
        long j7 = (j6 - j5) / ((long) gVar.f2845d);
        this.f8533d = j7;
        this.f8534e = b(j7);
    }

    public final long b(long j5) {
        long j6 = j5 * ((long) this.f8531b);
        long j7 = this.f8530a.f2844c;
        int i = AbstractC0370w.f5326a;
        return AbstractC0370w.U(j6, 1000000L, j7, RoundingMode.DOWN);
    }

    @Override // F0.E
    public final boolean c() {
        return true;
    }

    @Override // F0.E
    public final D g(long j5) {
        g gVar = this.f8530a;
        long j6 = (((long) gVar.f2844c) * j5) / (((long) this.f8531b) * 1000000);
        long j7 = this.f8533d;
        long j8 = AbstractC0370w.j(j6, 0L, j7 - 1);
        long j9 = ((long) gVar.f2845d) * j8;
        long j10 = this.f8532c;
        long jB = b(j8);
        F f2 = new F(jB, j9 + j10);
        if (jB >= j5 || j8 == j7 - 1) {
            return new D(f2, f2);
        }
        long j11 = j8 + 1;
        return new D(f2, new F(b(j11), (((long) gVar.f2845d) * j11) + j10));
    }

    @Override // F0.E
    public final long i() {
        return this.f8534e;
    }
}
