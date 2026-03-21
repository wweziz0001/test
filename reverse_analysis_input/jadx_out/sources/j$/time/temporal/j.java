package j$.time.temporal;

import j$.time.chrono.AbstractC0508a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f7168a = h.QUARTER_OF_YEAR;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f7169b = h.WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f7170c = h.WEEK_BASED_YEAR;

    static {
        i iVar = i.WEEK_BASED_YEARS;
        i iVar2 = i.WEEK_BASED_YEARS;
    }

    static boolean a(TemporalAccessor temporalAccessor) {
        return ((AbstractC0508a) j$.time.chrono.l.E(temporalAccessor)).equals(j$.time.chrono.s.f7036d);
    }
}
