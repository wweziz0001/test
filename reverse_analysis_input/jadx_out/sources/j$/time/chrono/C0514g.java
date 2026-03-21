package j$.time.chrono;

import j$.time.ZoneId;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0514g implements InterfaceC0512e, j$.time.temporal.m, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient InterfaceC0509b f7006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient j$.time.l f7007b;

    static C0514g B(InterfaceC0509b interfaceC0509b, j$.time.l lVar) {
        return new C0514g(interfaceC0509b, lVar);
    }

    static C0514g r(l lVar, j$.time.temporal.m mVar) {
        C0514g c0514g = (C0514g) mVar;
        AbstractC0508a abstractC0508a = (AbstractC0508a) lVar;
        if (abstractC0508a.equals(c0514g.h())) {
            return c0514g;
        }
        throw new ClassCastException("Chronology mismatch, required: " + abstractC0508a.getId() + ", actual: " + c0514g.h().getId());
    }

    private C0514g(InterfaceC0509b interfaceC0509b, j$.time.l lVar) {
        Objects.requireNonNull(lVar, "time");
        this.f7006a = interfaceC0509b;
        this.f7007b = lVar;
    }

    private C0514g Y(j$.time.temporal.m mVar, j$.time.l lVar) {
        InterfaceC0509b interfaceC0509b = this.f7006a;
        return (interfaceC0509b == mVar && this.f7007b == lVar) ? this : new C0514g(AbstractC0511d.r(interfaceC0509b.h(), mVar), lVar);
    }

    @Override // j$.time.chrono.InterfaceC0512e
    public final InterfaceC0509b o() {
        return this.f7006a;
    }

    @Override // j$.time.chrono.InterfaceC0512e
    public final j$.time.l n() {
        return this.f7007b;
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
            return (((j$.time.temporal.a) rVar).a0() ? this.f7007b : this.f7006a).l(rVar);
        }
        return rVar.I(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).a0() ? this.f7007b.i(rVar) : this.f7006a.i(rVar);
        }
        return l(rVar).a(g(rVar), rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).a0() ? this.f7007b.g(rVar) : this.f7006a.g(rVar);
        }
        return rVar.r(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return Y(hVar, this.f7007b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final C0514g b(long j5, j$.time.temporal.r rVar) {
        boolean z4 = rVar instanceof j$.time.temporal.a;
        InterfaceC0509b interfaceC0509b = this.f7006a;
        if (z4) {
            boolean zA0 = ((j$.time.temporal.a) rVar).a0();
            j$.time.l lVar = this.f7007b;
            if (zA0) {
                return Y(interfaceC0509b, lVar.b(j5, rVar));
            }
            return Y(interfaceC0509b.b(j5, rVar), lVar);
        }
        return r(interfaceC0509b.h(), rVar.p(this, j5));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final C0514g d(long j5, j$.time.temporal.u uVar) {
        boolean z4 = uVar instanceof j$.time.temporal.b;
        InterfaceC0509b interfaceC0509b = this.f7006a;
        if (z4) {
            int i = AbstractC0513f.f7005a[((j$.time.temporal.b) uVar).ordinal()];
            j$.time.l lVar = this.f7007b;
            switch (i) {
                case 1:
                    return S(this.f7006a, 0L, 0L, 0L, j5);
                case 2:
                    C0514g c0514gY = Y(interfaceC0509b.d(j5 / 86400000000L, (j$.time.temporal.u) j$.time.temporal.b.DAYS), lVar);
                    return c0514gY.S(c0514gY.f7006a, 0L, 0L, 0L, (j5 % 86400000000L) * 1000);
                case 3:
                    C0514g c0514gY2 = Y(interfaceC0509b.d(j5 / 86400000, (j$.time.temporal.u) j$.time.temporal.b.DAYS), lVar);
                    return c0514gY2.S(c0514gY2.f7006a, 0L, 0L, 0L, (j5 % 86400000) * 1000000);
                case 4:
                    return R(j5);
                case 5:
                    return S(this.f7006a, 0L, j5, 0L, 0L);
                case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    return S(this.f7006a, j5, 0L, 0L, 0L);
                case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    C0514g c0514gY3 = Y(interfaceC0509b.d(j5 / 256, (j$.time.temporal.u) j$.time.temporal.b.DAYS), lVar);
                    return c0514gY3.S(c0514gY3.f7006a, (j5 % 256) * 12, 0L, 0L, 0L);
                default:
                    return Y(interfaceC0509b.d(j5, uVar), lVar);
            }
        }
        return r(interfaceC0509b.h(), uVar.p(this, j5));
    }

    final C0514g R(long j5) {
        return S(this.f7006a, 0L, 0L, j5, 0L);
    }

    private C0514g S(InterfaceC0509b interfaceC0509b, long j5, long j6, long j7, long j8) {
        long j9 = j5 | j6 | j7 | j8;
        j$.time.l lVarC0 = this.f7007b;
        if (j9 == 0) {
            return Y(interfaceC0509b, lVarC0);
        }
        long j10 = j6 / 1440;
        long j11 = j5 / 24;
        long j12 = (j6 % 1440) * 60000000000L;
        long j13 = ((j5 % 24) * 3600000000000L) + j12 + ((j7 % 86400) * 1000000000) + (j8 % 86400000000000L);
        long jK0 = lVarC0.k0();
        long j14 = j13 + jK0;
        long jFloorDiv = Math.floorDiv(j14, 86400000000000L) + j11 + j10 + (j7 / 86400) + (j8 / 86400000000000L);
        long jFloorMod = Math.floorMod(j14, 86400000000000L);
        if (jFloorMod != jK0) {
            lVarC0 = j$.time.l.c0(jFloorMod);
        }
        return Y(interfaceC0509b.d(jFloorDiv, (j$.time.temporal.u) j$.time.temporal.b.DAYS), lVarC0);
    }

    @Override // j$.time.chrono.InterfaceC0512e
    public final ChronoZonedDateTime G(ZoneId zoneId) {
        return k.B(zoneId, null, this);
    }

    private Object writeReplace() {
        return new E((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f7006a);
        objectOutput.writeObject(this.f7007b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0512e) && compareTo((InterfaceC0512e) obj) == 0;
    }

    public final int hashCode() {
        return this.f7006a.hashCode() ^ this.f7007b.hashCode();
    }

    public final String toString() {
        return this.f7006a.toString() + "T" + this.f7007b.toString();
    }
}
