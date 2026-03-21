package j$.time;

import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC0509b;
import j$.time.chrono.InterfaceC0512e;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalAccessor;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.n, InterfaceC0512e, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f6980c = g0(h.f7127d, l.f7135e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f6981d = g0(h.f7128e, l.f7136f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f6982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f6983b;

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m e(long j5, j$.time.temporal.u uVar) {
        j$.time.temporal.b bVar = (j$.time.temporal.b) uVar;
        return j5 == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j5, bVar);
    }

    @Override // j$.time.chrono.InterfaceC0512e
    public final InterfaceC0509b o() {
        return this.f6982a;
    }

    public static LocalDateTime e0(int i) {
        return new LocalDateTime(h.f0(i, 12, 31), l.a0(0));
    }

    public static LocalDateTime f0(int i, int i5, int i6, int i7, int i8, int i9, int i10) {
        return new LocalDateTime(h.f0(i, i5, i6), l.b0(i7, i8, i9, i10));
    }

    public static LocalDateTime g0(h hVar, l lVar) {
        Objects.requireNonNull(hVar, "date");
        Objects.requireNonNull(lVar, "time");
        return new LocalDateTime(hVar, lVar);
    }

    public static LocalDateTime h0(long j5, int i, z zVar) {
        Objects.requireNonNull(zVar, "offset");
        long j6 = i;
        j$.time.temporal.a.NANO_OF_SECOND.Z(j6);
        long jY = j5 + ((long) zVar.Y());
        long j7 = 86400;
        return new LocalDateTime(h.h0(Math.floorDiv(jY, j7)), l.c0((((long) ((int) Math.floorMod(jY, j7))) * 1000000000) + j6));
    }

    public static LocalDateTime B(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof LocalDateTime) {
            return (LocalDateTime) temporalAccessor;
        }
        if (temporalAccessor instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporalAccessor).V();
        }
        if (temporalAccessor instanceof r) {
            return ((r) temporalAccessor).R();
        }
        try {
            return new LocalDateTime(h.I(temporalAccessor), l.I(temporalAccessor));
        } catch (c e5) {
            throw new c("Unable to obtain LocalDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e5);
        }
    }

    public static LocalDateTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalDateTime) dateTimeFormatter.d(charSequence, new i());
    }

    private LocalDateTime(h hVar, l lVar) {
        this.f6982a = hVar;
        this.f6983b = lVar;
    }

    private LocalDateTime o0(h hVar, l lVar) {
        return (this.f6982a == hVar && this.f6983b == lVar) ? this : new LocalDateTime(hVar, lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar != null && rVar.V(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        return aVar.S() || aVar.a0();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).a0() ? this.f6983b.l(rVar) : this.f6982a.l(rVar);
        }
        return rVar.I(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).a0() ? this.f6983b.i(rVar) : this.f6982a.i(rVar);
        }
        return super.i(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).a0() ? this.f6983b.g(rVar) : this.f6982a.g(rVar);
        }
        return rVar.r(this);
    }

    private int r(LocalDateTime localDateTime) {
        int iR = this.f6982a.r(localDateTime.f6982a);
        return iR == 0 ? this.f6983b.compareTo(localDateTime.f6983b) : iR;
    }

    public final h l0() {
        return this.f6982a;
    }

    public final int b0() {
        return this.f6982a.a0();
    }

    public final int Y() {
        return this.f6982a.Z();
    }

    public final int I() {
        return this.f6982a.S();
    }

    public final DayOfWeek R() {
        return this.f6982a.V();
    }

    @Override // j$.time.chrono.InterfaceC0512e
    public final l n() {
        return this.f6983b;
    }

    public final int S() {
        return this.f6983b.S();
    }

    public final int V() {
        return this.f6983b.V();
    }

    public final int a0() {
        return this.f6983b.Z();
    }

    public final int Z() {
        return this.f6983b.Y();
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m m(h hVar) {
        return o0(hVar, this.f6983b);
    }

    public final LocalDateTime n0(h hVar) {
        return o0(hVar, this.f6983b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime b(long j5, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            boolean zA0 = ((j$.time.temporal.a) rVar).a0();
            l lVar = this.f6983b;
            h hVar = this.f6982a;
            if (zA0) {
                return o0(hVar, lVar.b(j5, rVar));
            }
            return o0(hVar.b(j5, rVar), lVar);
        }
        return (LocalDateTime) rVar.p(this, j5);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j5, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (LocalDateTime) uVar.p(this, j5);
        }
        switch (j.f7132a[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return k0(this.f6982a, 0L, 0L, 0L, j5);
            case 2:
                LocalDateTime localDateTimePlusDays = plusDays(j5 / 86400000000L);
                return localDateTimePlusDays.k0(localDateTimePlusDays.f6982a, 0L, 0L, 0L, (j5 % 86400000000L) * 1000);
            case 3:
                LocalDateTime localDateTimePlusDays2 = plusDays(j5 / 86400000);
                return localDateTimePlusDays2.k0(localDateTimePlusDays2.f6982a, 0L, 0L, 0L, (j5 % 86400000) * 1000000);
            case 4:
                return j0(j5);
            case 5:
                return k0(this.f6982a, 0L, j5, 0L, 0L);
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return k0(this.f6982a, j5, 0L, 0L, 0L);
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                LocalDateTime localDateTimePlusDays3 = plusDays(j5 / 256);
                return localDateTimePlusDays3.k0(localDateTimePlusDays3.f6982a, (j5 % 256) * 12, 0L, 0L, 0L);
            default:
                return o0(this.f6982a.d(j5, uVar), this.f6983b);
        }
    }

    public LocalDateTime plusWeeks(long j5) {
        return o0(this.f6982a.m0(j5), this.f6983b);
    }

    public LocalDateTime plusDays(long j5) {
        return o0(this.f6982a.k0(j5), this.f6983b);
    }

    public final LocalDateTime j0(long j5) {
        return k0(this.f6982a, 0L, 0L, j5, 0L);
    }

    @Override // j$.time.chrono.InterfaceC0512e
    /* JADX INFO: renamed from: k */
    public final InterfaceC0512e e(long j5, j$.time.temporal.b bVar) {
        return j5 == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j5, bVar);
    }

    private LocalDateTime k0(h hVar, long j5, long j6, long j7, long j8) {
        long j9 = j5 | j6 | j7 | j8;
        l lVarC0 = this.f6983b;
        if (j9 == 0) {
            return o0(hVar, lVarC0);
        }
        long j10 = j5 / 24;
        long j11 = j10 + (j6 / 1440) + (j7 / 86400) + (j8 / 86400000000000L);
        long j12 = 1;
        long j13 = ((j5 % 24) * 3600000000000L) + ((j6 % 1440) * 60000000000L) + ((j7 % 86400) * 1000000000) + (j8 % 86400000000000L);
        long jK0 = lVarC0.k0();
        long j14 = (j13 * j12) + jK0;
        long jFloorDiv = Math.floorDiv(j14, 86400000000000L) + (j11 * j12);
        long jFloorMod = Math.floorMod(j14, 86400000000000L);
        if (jFloorMod != jK0) {
            lVarC0 = l.c0(jFloorMod);
        }
        return o0(hVar.k0(jFloorDiv), lVarC0);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.b()) {
            return this.f6982a;
        }
        return super.a(tVar);
    }

    @Override // j$.time.chrono.InterfaceC0512e
    public final ChronoZonedDateTime G(ZoneId zoneId) {
        return ZonedDateTime.of(this, zoneId);
    }

    @Override // j$.time.chrono.InterfaceC0512e, java.lang.Comparable
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC0512e interfaceC0512e) {
        if (interfaceC0512e instanceof LocalDateTime) {
            return r((LocalDateTime) interfaceC0512e);
        }
        return super.compareTo(interfaceC0512e);
    }

    public final boolean c0(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return r(localDateTime) > 0;
        }
        long jU = this.f6982a.u();
        long jU2 = localDateTime.f6982a.u();
        return jU > jU2 || (jU == jU2 && this.f6983b.k0() > localDateTime.f6983b.k0());
    }

    public final boolean d0(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return r(localDateTime) < 0;
        }
        long jU = this.f6982a.u();
        long jU2 = localDateTime.f6982a.u();
        return jU < jU2 || (jU == jU2 && this.f6983b.k0() < localDateTime.f6983b.k0());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.f6982a.equals(localDateTime.f6982a) && this.f6983b.equals(localDateTime.f6983b);
    }

    public final int hashCode() {
        return this.f6982a.hashCode() ^ this.f6983b.hashCode();
    }

    public final String toString() {
        return this.f6982a.toString() + "T" + this.f6983b.toString();
    }

    private Object writeReplace() {
        return new u((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void p0(DataOutput dataOutput) {
        this.f6982a.t0(dataOutput);
        this.f6983b.o0(dataOutput);
    }
}
