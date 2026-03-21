package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class k implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient C0514g f7015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient j$.time.z f7016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient ZoneId f7017c;

    static ChronoZonedDateTime B(ZoneId zoneId, j$.time.z zVar, C0514g c0514g) {
        Objects.requireNonNull(c0514g, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof j$.time.z) {
            return new k(zoneId, (j$.time.z) zoneId, c0514g);
        }
        j$.time.zone.f fVarR = zoneId.r();
        LocalDateTime localDateTimeB = LocalDateTime.B(c0514g);
        List listG = fVarR.g(localDateTimeB);
        if (listG.size() == 1) {
            zVar = (j$.time.z) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = fVarR.f(localDateTimeB);
            c0514g = c0514g.R(bVarF.B().I());
            zVar = bVarF.I();
        } else if (zVar == null || !listG.contains(zVar)) {
            zVar = (j$.time.z) listG.get(0);
        }
        Objects.requireNonNull(zVar, "offset");
        return new k(zoneId, zVar, c0514g);
    }

    static k I(l lVar, Instant instant, ZoneId zoneId) {
        j$.time.z zVarD = zoneId.r().d(instant);
        Objects.requireNonNull(zVarD, "offset");
        return new k(zoneId, zVarD, (C0514g) lVar.w(LocalDateTime.h0(instant.B(), instant.I(), zVarD)));
    }

    static k r(l lVar, j$.time.temporal.m mVar) {
        k kVar = (k) mVar;
        AbstractC0508a abstractC0508a = (AbstractC0508a) lVar;
        if (abstractC0508a.equals(kVar.h())) {
            return kVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + abstractC0508a.getId() + ", actual: " + kVar.h().getId());
    }

    private k(ZoneId zoneId, j$.time.z zVar, C0514g c0514g) {
        Objects.requireNonNull(c0514g, "dateTime");
        this.f7015a = c0514g;
        Objects.requireNonNull(zVar, "offset");
        this.f7016b = zVar;
        Objects.requireNonNull(zoneId, "zone");
        this.f7017c = zoneId;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.z D() {
        return this.f7016b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC0512e A() {
        return this.f7015a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId P() {
        return this.f7017c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime H(ZoneId zoneId) {
        return B(zoneId, this.f7016b, this.f7015a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return (rVar instanceof j$.time.temporal.a) || (rVar != null && rVar.V(this));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.m
    public final ChronoZonedDateTime b(long j5, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i = AbstractC0517j.f7014a[aVar.ordinal()];
            if (i == 1) {
                return d(j5 - N(), (j$.time.temporal.u) j$.time.temporal.b.SECONDS);
            }
            ZoneId zoneId = this.f7017c;
            C0514g c0514g = this.f7015a;
            if (i != 2) {
                return B(zoneId, this.f7016b, c0514g.b(j5, rVar));
            }
            return I(h(), Instant.V(c0514g.X(j$.time.z.b0(aVar.Y(j5))), c0514g.n().Y()), zoneId);
        }
        return r(h(), rVar.p(this, j5));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime, j$.time.temporal.m
    public final ChronoZonedDateTime d(long j5, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return m(this.f7015a.d(j5, uVar));
        }
        return r(h(), uVar.p(this, j5));
    }

    private Object writeReplace() {
        return new E((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f7015a);
        objectOutput.writeObject(this.f7016b);
        objectOutput.writeObject(this.f7017c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && compareTo((ChronoZonedDateTime) obj) == 0;
    }

    public final int hashCode() {
        return (this.f7015a.hashCode() ^ this.f7016b.hashCode()) ^ Integer.rotateLeft(this.f7017c.hashCode(), 3);
    }

    public final String toString() {
        String string = this.f7015a.toString();
        j$.time.z zVar = this.f7016b;
        String str = string + zVar.toString();
        ZoneId zoneId = this.f7017c;
        if (zVar == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }
}
