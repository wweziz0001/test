package j$.time.chrono;

import j$.time.AbstractC0507b;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends AbstractC0508a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f7036d = new s();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.l
    public final m M(int i) {
        if (i == 0) {
            return t.BCE;
        }
        if (i == 1) {
            return t.CE;
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    private s() {
    }

    @Override // j$.time.chrono.l
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.l
    public final String Q() {
        return "iso8601";
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b F(int i, int i5, int i6) {
        return j$.time.h.f0(i, i5, i6);
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b z(int i, int i5) {
        return j$.time.h.i0(i, i5);
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b q(long j5) {
        return j$.time.h.h0(j5);
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b s(TemporalAccessor temporalAccessor) {
        return j$.time.h.I(temporalAccessor);
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0512e w(LocalDateTime localDateTime) {
        return LocalDateTime.B(localDateTime);
    }

    @Override // j$.time.chrono.l
    public final ChronoZonedDateTime x(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.B(instant, zoneId);
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b K() {
        return j$.time.h.I(j$.time.h.e0(AbstractC0507b.b()));
    }

    public static boolean Y(long j5) {
        return (3 & j5) == 0 && (j5 % 100 != 0 || j5 % 400 == 0);
    }

    @Override // j$.time.chrono.l
    public final int v(m mVar, int i) {
        if (mVar instanceof t) {
            return mVar == t.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.l
    public final List C() {
        return j$.time.e.a(t.values());
    }

    @Override // j$.time.chrono.AbstractC0508a, j$.time.chrono.l
    public final InterfaceC0509b O(Map map, j$.time.format.y yVar) {
        return (j$.time.h) super.O(map, yVar);
    }

    @Override // j$.time.chrono.AbstractC0508a
    final void R(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l3 = (Long) map.remove(aVar);
        if (l3 != null) {
            if (yVar != j$.time.format.y.LENIENT) {
                aVar.Z(l3.longValue());
            }
            AbstractC0508a.p(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) Math.floorMod(l3.longValue(), r4)) + 1);
            AbstractC0508a.p(map, j$.time.temporal.a.YEAR, Math.floorDiv(l3.longValue(), 12));
        }
    }

    @Override // j$.time.chrono.AbstractC0508a
    final InterfaceC0509b V(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l3 = (Long) map.remove(aVar);
        if (l3 != null) {
            if (yVar != j$.time.format.y.LENIENT) {
                aVar.Z(l3.longValue());
            }
            Long l4 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (l4 != null) {
                if (l4.longValue() == 1) {
                    AbstractC0508a.p(map, j$.time.temporal.a.YEAR, l3.longValue());
                    return null;
                }
                if (l4.longValue() == 0) {
                    AbstractC0508a.p(map, j$.time.temporal.a.YEAR, Math.subtractExact(1L, l3.longValue()));
                    return null;
                }
                throw new j$.time.c("Invalid value for era: " + l4);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
            Long l5 = (Long) map.get(aVar2);
            if (yVar != j$.time.format.y.STRICT) {
                AbstractC0508a.p(map, aVar2, (l5 == null || l5.longValue() > 0) ? l3.longValue() : Math.subtractExact(1L, l3.longValue()));
                return null;
            }
            if (l5 != null) {
                long jLongValue = l5.longValue();
                long jLongValue2 = l3.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = Math.subtractExact(1L, jLongValue2);
                }
                AbstractC0508a.p(map, aVar2, jLongValue2);
                return null;
            }
            map.put(aVar, l3);
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar3)) {
            return null;
        }
        aVar3.Z(((Long) map.get(aVar3)).longValue());
        return null;
    }

    @Override // j$.time.chrono.AbstractC0508a
    final InterfaceC0509b S(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iY = aVar.Y(((Long) map.remove(aVar)).longValue());
        boolean z4 = true;
        if (yVar == j$.time.format.y.LENIENT) {
            return j$.time.h.f0(iY, 1, 1).l0(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).k0(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iY2 = aVar2.Y(((Long) map.remove(aVar2)).longValue());
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iY3 = aVar3.Y(((Long) map.remove(aVar3)).longValue());
        if (yVar == j$.time.format.y.SMART) {
            if (iY2 == 4 || iY2 == 6 || iY2 == 9 || iY2 == 11) {
                iY3 = Math.min(iY3, 30);
            } else if (iY2 == 2) {
                j$.time.n nVar = j$.time.n.FEBRUARY;
                long j5 = iY;
                int i = j$.time.w.f7194b;
                if ((3 & j5) != 0 || (j5 % 100 == 0 && j5 % 400 != 0)) {
                    z4 = false;
                }
                iY3 = Math.min(iY3, nVar.B(z4));
            }
        }
        return j$.time.h.f0(iY, iY2, iY3);
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.w T(j$.time.temporal.a aVar) {
        return aVar.B();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new E((byte) 1, this);
    }
}
