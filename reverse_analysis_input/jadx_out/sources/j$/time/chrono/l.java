package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface l extends Comparable {
    List C();

    InterfaceC0509b F(int i, int i5, int i6);

    InterfaceC0509b K();

    m M(int i);

    InterfaceC0509b O(Map map, j$.time.format.y yVar);

    String Q();

    j$.time.temporal.w T(j$.time.temporal.a aVar);

    String getId();

    InterfaceC0509b q(long j5);

    InterfaceC0509b s(TemporalAccessor temporalAccessor);

    int v(m mVar, int i);

    ChronoZonedDateTime x(Instant instant, ZoneId zoneId);

    InterfaceC0509b z(int i, int i5);

    static l E(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        l lVar = (l) temporalAccessor.a(j$.time.temporal.s.a());
        s sVar = s.f7036d;
        if (lVar != null) {
            return lVar;
        }
        Objects.requireNonNull(sVar, "defaultObj");
        return sVar;
    }

    default InterfaceC0512e w(LocalDateTime localDateTime) {
        try {
            return s(localDateTime).J(j$.time.l.I(localDateTime));
        } catch (j$.time.c e5) {
            throw new j$.time.c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e5);
        }
    }
}
