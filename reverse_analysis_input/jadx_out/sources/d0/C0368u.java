package d0;

import java.math.RoundingMode;

/* JADX INFO: renamed from: d0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0368u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f5325d = new ThreadLocal();

    public C0368u(long j5) {
        f(j5);
    }

    public final synchronized long a(long j5) {
        if (j5 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!e()) {
                long jLongValue = this.f5322a;
                if (jLongValue == 9223372036854775806L) {
                    Long l3 = (Long) this.f5325d.get();
                    l3.getClass();
                    jLongValue = l3.longValue();
                }
                this.f5323b = jLongValue - j5;
                notifyAll();
            }
            this.f5324c = j5;
            return j5 + this.f5323b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j5) {
        if (j5 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j6 = this.f5324c;
            if (j6 != -9223372036854775807L) {
                int i = AbstractC0370w.f5326a;
                long jU = AbstractC0370w.U(j6, 90000L, 1000000L, RoundingMode.DOWN);
                long j7 = (4294967296L + jU) / 8589934592L;
                long j8 = ((j7 - 1) * 8589934592L) + j5;
                long j9 = (j7 * 8589934592L) + j5;
                j5 = Math.abs(j8 - jU) < Math.abs(j9 - jU) ? j8 : j9;
            }
            long j10 = j5;
            int i5 = AbstractC0370w.f5326a;
            return a(AbstractC0370w.U(j10, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j5) {
        if (j5 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j6 = this.f5324c;
            if (j6 != -9223372036854775807L) {
                int i = AbstractC0370w.f5326a;
                long jU = AbstractC0370w.U(j6, 90000L, 1000000L, RoundingMode.DOWN);
                long j7 = jU / 8589934592L;
                long j8 = (j7 * 8589934592L) + j5;
                j5 = j8 >= jU ? j8 : ((j7 + 1) * 8589934592L) + j5;
            }
            long j9 = j5;
            int i5 = AbstractC0370w.f5326a;
            return a(AbstractC0370w.U(j9, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d() {
        long j5;
        j5 = this.f5322a;
        if (j5 == Long.MAX_VALUE || j5 == 9223372036854775806L) {
            j5 = -9223372036854775807L;
        }
        return j5;
    }

    public final synchronized boolean e() {
        return this.f5323b != -9223372036854775807L;
    }

    public final synchronized void f(long j5) {
        this.f5322a = j5;
        this.f5323b = j5 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f5324c = -9223372036854775807L;
    }

    public final synchronized void g(long j5, boolean z4) {
        try {
            AbstractC0360m.h(this.f5322a == 9223372036854775806L);
            if (e()) {
                return;
            }
            if (z4) {
                this.f5325d.set(Long.valueOf(j5));
            } else {
                while (!e()) {
                    wait();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
