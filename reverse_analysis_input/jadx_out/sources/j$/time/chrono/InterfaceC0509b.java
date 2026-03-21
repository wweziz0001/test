package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0509b extends j$.time.temporal.m, j$.time.temporal.n, Comparable {
    InterfaceC0509b L(j$.time.temporal.q qVar);

    @Override // j$.time.temporal.m
    InterfaceC0509b b(long j5, j$.time.temporal.r rVar);

    @Override // j$.time.temporal.m
    InterfaceC0509b d(long j5, j$.time.temporal.u uVar);

    boolean equals(Object obj);

    l h();

    int hashCode();

    InterfaceC0509b m(j$.time.temporal.n nVar);

    String toString();

    default m t() {
        return h().M(i(j$.time.temporal.a.ERA));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default boolean f(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).S();
        }
        return rVar != null && rVar.V(this);
    }

    @Override // j$.time.temporal.m
    default InterfaceC0509b e(long j5, j$.time.temporal.u uVar) {
        return AbstractC0511d.r(h(), super.e(j5, uVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.g() || tVar == j$.time.temporal.s.f() || tVar == j$.time.temporal.s.d() || tVar == j$.time.temporal.s.c()) {
            return null;
        }
        if (tVar == j$.time.temporal.s.a()) {
            return h();
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.DAYS;
        }
        return tVar.j(this);
    }

    @Override // j$.time.temporal.n
    default j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.b(u(), j$.time.temporal.a.EPOCH_DAY);
    }

    default InterfaceC0512e J(j$.time.l lVar) {
        return C0514g.B(this, lVar);
    }

    default long u() {
        return g(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: U */
    default int compareTo(InterfaceC0509b interfaceC0509b) {
        int iCompare = Long.compare(u(), interfaceC0509b.u());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC0508a) h()).getId().compareTo(interfaceC0509b.h().getId());
    }
}
