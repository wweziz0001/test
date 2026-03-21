package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.chrono.InterfaceC0509b;

/* JADX INFO: loaded from: classes2.dex */
public interface ChronoZonedDateTime<D extends InterfaceC0509b> extends j$.time.temporal.m, Comparable<ChronoZonedDateTime<?>> {
    InterfaceC0512e A();

    j$.time.z D();

    ChronoZonedDateTime H(ZoneId zoneId);

    ZoneId P();

    @Override // j$.time.temporal.m
    ChronoZonedDateTime b(long j5, j$.time.temporal.r rVar);

    @Override // j$.time.temporal.m
    ChronoZonedDateTime d(long j5, j$.time.temporal.u uVar);

    @Override // j$.time.temporal.TemporalAccessor
    default j$.time.temporal.w l(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) rVar).B();
            }
            return A().l(rVar);
        }
        return rVar.I(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int i(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = AbstractC0516i.f7013a[((j$.time.temporal.a) rVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.v("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return D().Y();
            }
            return A().i(rVar);
        }
        return super.i(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = AbstractC0516i.f7013a[((j$.time.temporal.a) rVar).ordinal()];
            if (i == 1) {
                return N();
            }
            if (i == 2) {
                return D().Y();
            }
            return A().g(rVar);
        }
        return rVar.r(this);
    }

    default InterfaceC0509b o() {
        return A().o();
    }

    default j$.time.l n() {
        return A().n();
    }

    default l h() {
        return o().h();
    }

    @Override // j$.time.temporal.m
    default ChronoZonedDateTime m(j$.time.temporal.n nVar) {
        return k.r(h(), nVar.c(this));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    default ChronoZonedDateTime e(long j5, j$.time.temporal.b bVar) {
        return k.r(h(), super.e(j5, bVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.f() || tVar == j$.time.temporal.s.g()) {
            return P();
        }
        if (tVar == j$.time.temporal.s.d()) {
            return D();
        }
        if (tVar == j$.time.temporal.s.c()) {
            return n();
        }
        if (tVar == j$.time.temporal.s.a()) {
            return h();
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.j(this);
    }

    default Instant toInstant() {
        return Instant.V(N(), n().Y());
    }

    default long N() {
        return ((o().u() * 86400) + ((long) n().l0())) - ((long) D().Y());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    default int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int iCompare = Long.compare(N(), chronoZonedDateTime.N());
        if (iCompare != 0) {
            return iCompare;
        }
        int iY = n().Y() - chronoZonedDateTime.n().Y();
        if (iY != 0) {
            return iY;
        }
        int iCompareTo = A().compareTo(chronoZonedDateTime.A());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = P().getId().compareTo(chronoZonedDateTime.P().getId());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        return ((AbstractC0508a) h()).getId().compareTo(chronoZonedDateTime.h().getId());
    }

    default boolean isBefore(ChronoZonedDateTime<?> chronoZonedDateTime) {
        long jN = N();
        long jN2 = chronoZonedDateTime.N();
        return jN < jN2 || (jN == jN2 && n().Y() < chronoZonedDateTime.n().Y());
    }
}
