package j$.time.temporal;

import j$.time.format.y;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
enum k implements r {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient String f7172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient w f7173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient long f7174c;

    @Override // j$.time.temporal.r
    public final boolean S() {
        return true;
    }

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j5) {
        this.f7172a = str;
        this.f7173b = w.j((-365243219162L) + j5, 365241780471L + j5);
        this.f7174c = j5;
    }

    @Override // j$.time.temporal.r
    public final w B() {
        return this.f7173b;
    }

    @Override // j$.time.temporal.r
    public final w I(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.f(a.EPOCH_DAY)) {
            throw new j$.time.c("Unsupported field: " + this);
        }
        return this.f7173b;
    }

    @Override // j$.time.temporal.r
    public final boolean V(TemporalAccessor temporalAccessor) {
        return temporalAccessor.f(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.r
    public final long r(TemporalAccessor temporalAccessor) {
        return temporalAccessor.g(a.EPOCH_DAY) + this.f7174c;
    }

    @Override // j$.time.temporal.r
    public final m p(m mVar, long j5) {
        if (!this.f7173b.i(j5)) {
            throw new j$.time.c("Invalid value: " + this.f7172a + " " + j5);
        }
        return mVar.b(Math.subtractExact(j5, this.f7174c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.r
    public final TemporalAccessor R(HashMap map, TemporalAccessor temporalAccessor, y yVar) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.l lVarE = j$.time.chrono.l.E(temporalAccessor);
        y yVar2 = y.LENIENT;
        long j5 = this.f7174c;
        if (yVar == yVar2) {
            return lVarE.q(Math.subtractExact(jLongValue, j5));
        }
        this.f7173b.b(jLongValue, this);
        return lVarE.q(jLongValue - j5);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f7172a;
    }
}
