package j$.time.chrono;

import j$.time.ZoneId;
import java.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0512e extends j$.time.temporal.m, j$.time.temporal.n, Comparable {
    ChronoZonedDateTime G(ZoneId zoneId);

    j$.time.l n();

    InterfaceC0509b o();

    default l h() {
        return o().h();
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    default InterfaceC0512e e(long j5, j$.time.temporal.b bVar) {
        return C0514g.r(h(), super.e(j5, bVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.g() || tVar == j$.time.temporal.s.f() || tVar == j$.time.temporal.s.d()) {
            return null;
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

    @Override // j$.time.temporal.n
    default j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.b(o().u(), j$.time.temporal.a.EPOCH_DAY).b(n().k0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    default long X(j$.time.z zVar) {
        Objects.requireNonNull(zVar, "offset");
        return ((o().u() * 86400) + ((long) n().l0())) - ((long) zVar.Y());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: W */
    default int compareTo(InterfaceC0512e interfaceC0512e) {
        int iCompareTo = o().compareTo(interfaceC0512e.o());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = n().compareTo(interfaceC0512e.n());
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        return ((AbstractC0508a) h()).getId().compareTo(interfaceC0512e.h().getId());
    }
}
