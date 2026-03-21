package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
enum i implements u {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7167a;

    static {
        Duration duration = Duration.f6974c;
    }

    i(String str) {
        this.f7167a = str;
    }

    @Override // j$.time.temporal.u
    public final m p(m mVar, long j5) {
        int i = c.f7163a[ordinal()];
        if (i == 1) {
            return mVar.b(Math.addExact(mVar.i(r0), j5), j.f7170c);
        }
        if (i == 2) {
            return mVar.d(j5 / 4, b.YEARS).d((j5 % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f7167a;
    }
}
