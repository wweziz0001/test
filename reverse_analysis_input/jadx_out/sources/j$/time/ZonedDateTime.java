package j$.time;

import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC0509b;
import j$.time.chrono.InterfaceC0512e;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.m, ChronoZonedDateTime<h>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocalDateTime f6985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f6986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ZoneId f6987c;

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC0512e A() {
        return this.f6985a;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m e(long j5, j$.time.temporal.u uVar) {
        j$.time.temporal.b bVar = (j$.time.temporal.b) uVar;
        return j5 == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j5, bVar);
    }

    public static ZonedDateTime now(ZoneId zoneId) {
        C0506a c0506a;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId == z.f7202f) {
            c0506a = C0506a.f6988b;
        } else {
            c0506a = new C0506a(zoneId);
        }
        Objects.requireNonNull(c0506a, "clock");
        return B(Instant.R(System.currentTimeMillis()), c0506a.a());
    }

    public static ZonedDateTime of(LocalDateTime localDateTime, ZoneId zoneId) {
        return I(localDateTime, zoneId, null);
    }

    public static ZonedDateTime of(int i, int i5, int i6, int i7, int i8, int i9, int i10, ZoneId zoneId) {
        return I(LocalDateTime.f0(i, i5, i6, i7, i8, i9, i10), zoneId, null);
    }

    public static ZonedDateTime I(LocalDateTime localDateTime, ZoneId zoneId, z zVar) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof z) {
            return new ZonedDateTime(localDateTime, zoneId, (z) zoneId);
        }
        j$.time.zone.f fVarR = zoneId.r();
        List listG = fVarR.g(localDateTime);
        if (listG.size() == 1) {
            zVar = (z) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = fVarR.f(localDateTime);
            localDateTime = localDateTime.j0(bVarF.B().I());
            zVar = bVarF.I();
        } else if (zVar == null || !listG.contains(zVar)) {
            zVar = (z) listG.get(0);
            Objects.requireNonNull(zVar, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zVar);
    }

    public static ZonedDateTime B(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return r(instant.B(), instant.I(), zoneId);
    }

    private static ZonedDateTime r(long j5, int i, ZoneId zoneId) {
        z zVarD = zoneId.r().d(Instant.V(j5, i));
        return new ZonedDateTime(LocalDateTime.h0(j5, i, zVarD), zoneId, zVarD);
    }

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, z zVar) {
        this.f6985a = localDateTime;
        this.f6986b = zVar;
        this.f6987c = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return (rVar instanceof j$.time.temporal.a) || (rVar != null && rVar.V(this));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) rVar).B();
            }
            return this.f6985a.l(rVar);
        }
        return rVar.I(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = B.f6971a[((j$.time.temporal.a) rVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.v("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.f6986b.Y();
            }
            return this.f6985a.i(rVar);
        }
        return super.i(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = B.f6971a[((j$.time.temporal.a) rVar).ordinal()];
            if (i == 1) {
                return N();
            }
            if (i == 2) {
                return this.f6986b.Y();
            }
            return this.f6985a.g(rVar);
        }
        return rVar.r(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final z D() {
        return this.f6986b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId P() {
        return this.f6987c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime H(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.f6987c.equals(zoneId) ? this : I(this.f6985a, zoneId, this.f6986b);
    }

    public final LocalDateTime V() {
        return this.f6985a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC0509b o() {
        return this.f6985a.l0();
    }

    public int getYear() {
        return this.f6985a.b0();
    }

    public int getMonthValue() {
        return this.f6985a.Y();
    }

    public int getDayOfMonth() {
        return this.f6985a.I();
    }

    public DayOfWeek getDayOfWeek() {
        return this.f6985a.R();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final l n() {
        return this.f6985a.n();
    }

    public int getHour() {
        return this.f6985a.S();
    }

    public int getMinute() {
        return this.f6985a.V();
    }

    public int getSecond() {
        return this.f6985a.a0();
    }

    public int getNano() {
        return this.f6985a.Z();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime m(h hVar) {
        return I(LocalDateTime.g0(hVar, this.f6985a.n()), this.f6987c, this.f6986b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime b(long j5, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i = B.f6971a[aVar.ordinal()];
            ZoneId zoneId = this.f6987c;
            if (i == 1) {
                return r(j5, getNano(), zoneId);
            }
            z zVar = this.f6986b;
            LocalDateTime localDateTime = this.f6985a;
            if (i != 2) {
                return I(localDateTime.b(j5, rVar), zoneId, zVar);
            }
            z zVarB0 = z.b0(aVar.Y(j5));
            return (zVarB0.equals(zVar) || !zoneId.r().g(localDateTime).contains(zVarB0)) ? this : new ZonedDateTime(localDateTime, zoneId, zVarB0);
        }
        return (ZonedDateTime) rVar.p(this, j5);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime d(long j5, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            j$.time.temporal.b bVar = (j$.time.temporal.b) uVar;
            int iCompareTo = bVar.compareTo(j$.time.temporal.b.DAYS);
            z zVar = this.f6986b;
            ZoneId zoneId = this.f6987c;
            LocalDateTime localDateTime = this.f6985a;
            if (iCompareTo >= 0 && bVar != j$.time.temporal.b.FOREVER) {
                return I(localDateTime.d(j5, uVar), zoneId, zVar);
            }
            LocalDateTime localDateTimeD = localDateTime.d(j5, uVar);
            Objects.requireNonNull(localDateTimeD, "localDateTime");
            Objects.requireNonNull(zVar, "offset");
            Objects.requireNonNull(zoneId, "zone");
            if (zoneId.r().g(localDateTimeD).contains(zVar)) {
                return new ZonedDateTime(localDateTimeD, zoneId, zVar);
            }
            return r(localDateTimeD.X(zVar), localDateTimeD.Z(), zoneId);
        }
        return (ZonedDateTime) uVar.p(this, j5);
    }

    public ZonedDateTime plusDays(long j5) {
        return I(this.f6985a.plusDays(j5), this.f6987c, this.f6986b);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: k */
    public final ChronoZonedDateTime e(long j5, j$.time.temporal.b bVar) {
        return j5 == Long.MIN_VALUE ? d(Long.MAX_VALUE, bVar).d(1L, bVar) : d(-j5, bVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.b()) {
            return this.f6985a.l0();
        }
        return super.a(tVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        return this.f6985a.equals(zonedDateTime.f6985a) && this.f6986b.equals(zonedDateTime.f6986b) && this.f6987c.equals(zonedDateTime.f6987c);
    }

    public final int hashCode() {
        return (this.f6985a.hashCode() ^ this.f6986b.hashCode()) ^ Integer.rotateLeft(this.f6987c.hashCode(), 3);
    }

    public final String toString() {
        String string = this.f6985a.toString();
        z zVar = this.f6986b;
        String str = string + zVar.toString();
        ZoneId zoneId = this.f6987c;
        if (zVar == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new u((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void a0(DataOutput dataOutput) {
        this.f6985a.p0(dataOutput);
        this.f6986b.e0(dataOutput);
        this.f6987c.S((ObjectOutput) dataOutput);
    }

    static ZonedDateTime S(ObjectInput objectInput) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.f6980c;
        h hVar = h.f7127d;
        LocalDateTime localDateTimeG0 = LocalDateTime.g0(h.f0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), l.j0(objectInput));
        z zVarD0 = z.d0(objectInput);
        ZoneId zoneId = (ZoneId) u.a(objectInput);
        Objects.requireNonNull(zoneId, "zone");
        if ((zoneId instanceof z) && !zVarD0.equals(zoneId)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new ZonedDateTime(localDateTimeG0, zoneId, zVarD0);
    }
}
