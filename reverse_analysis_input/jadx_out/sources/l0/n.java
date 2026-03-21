package l0;

import d0.AbstractC0370w;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f7876f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7877g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7878h;
    public final long i;

    public n(j jVar, long j5, long j6, long j7, long j8, List list, long j9, long j10, long j11) {
        super(jVar, j5, j6);
        this.f7874d = j7;
        this.f7875e = j8;
        this.f7876f = list;
        this.i = j9;
        this.f7877g = j10;
        this.f7878h = j11;
    }

    public final long b(long j5, long j6) {
        long jD = d(j5);
        return jD != -1 ? jD : (int) (f((j6 - this.f7878h) + this.i, j5) - c(j5, j6));
    }

    public final long c(long j5, long j6) {
        long jD = d(j5);
        long j7 = this.f7874d;
        if (jD == -1) {
            long j8 = this.f7877g;
            if (j8 != -9223372036854775807L) {
                return Math.max(j7, f((j6 - this.f7878h) - j8, j5));
            }
        }
        return j7;
    }

    public abstract long d(long j5);

    public final long e(long j5, long j6) {
        long j7 = this.f7888b;
        long j8 = this.f7874d;
        List list = this.f7876f;
        if (list != null) {
            return (((q) list.get((int) (j5 - j8))).f7884b * 1000000) / j7;
        }
        long jD = d(j6);
        return (jD == -1 || j5 != (j8 + jD) - 1) ? (this.f7875e * 1000000) / j7 : j6 - g(j5);
    }

    public final long f(long j5, long j6) {
        long jD = d(j6);
        long j7 = this.f7874d;
        if (jD == 0) {
            return j7;
        }
        if (this.f7876f == null) {
            long j8 = (j5 / ((this.f7875e * 1000000) / this.f7888b)) + j7;
            return j8 < j7 ? j7 : jD == -1 ? j8 : Math.min(j8, (j7 + jD) - 1);
        }
        long j9 = (jD + j7) - 1;
        long j10 = j7;
        while (j10 <= j9) {
            long j11 = ((j9 - j10) / 2) + j10;
            long jG = g(j11);
            if (jG < j5) {
                j10 = j11 + 1;
            } else {
                if (jG <= j5) {
                    return j11;
                }
                j9 = j11 - 1;
            }
        }
        return j10 == j7 ? j10 : j9;
    }

    public final long g(long j5) {
        long j6 = this.f7874d;
        List list = this.f7876f;
        long j7 = list != null ? ((q) list.get((int) (j5 - j6))).f7883a - this.f7889c : (j5 - j6) * this.f7875e;
        int i = AbstractC0370w.f5326a;
        return AbstractC0370w.U(j7, 1000000L, this.f7888b, RoundingMode.DOWN);
    }

    public abstract j h(k kVar, long j5);

    public boolean i() {
        return this.f7876f != null;
    }
}
