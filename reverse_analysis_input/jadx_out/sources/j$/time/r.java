package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocalDateTime f7150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f7151b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompare;
        r rVar = (r) obj;
        z zVar = rVar.f7151b;
        z zVar2 = this.f7151b;
        boolean zEquals = zVar2.equals(zVar);
        LocalDateTime localDateTime = rVar.f7150a;
        LocalDateTime localDateTime2 = this.f7150a;
        if (zEquals) {
            iCompare = localDateTime2.compareTo(localDateTime);
        } else {
            iCompare = Long.compare(localDateTime2.X(zVar2), localDateTime.X(rVar.f7151b));
            if (iCompare == 0) {
                iCompare = localDateTime2.n().Y() - localDateTime.n().Y();
            }
        }
        return iCompare == 0 ? localDateTime2.compareTo(localDateTime) : iCompare;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.f6980c;
        z zVar = z.f7204h;
        localDateTime.getClass();
        r(localDateTime, zVar);
        LocalDateTime localDateTime2 = LocalDateTime.f6981d;
        z zVar2 = z.f7203g;
        localDateTime2.getClass();
        r(localDateTime2, zVar2);
    }

    public static r r(LocalDateTime localDateTime, z zVar) {
        return new r(localDateTime, zVar);
    }

    private r(LocalDateTime localDateTime, z zVar) {
        Objects.requireNonNull(localDateTime, "dateTime");
        this.f7150a = localDateTime;
        Objects.requireNonNull(zVar, "offset");
        this.f7151b = zVar;
    }

    private r S(LocalDateTime localDateTime, z zVar) {
        return (this.f7150a == localDateTime && this.f7151b.equals(zVar)) ? this : new r(localDateTime, zVar);
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
            return this.f7150a.l(rVar);
        }
        return rVar.I(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = q.f7149a[((j$.time.temporal.a) rVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.v("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.f7151b.Y();
            }
            return this.f7150a.i(rVar);
        }
        return super.i(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = q.f7149a[((j$.time.temporal.a) rVar).ordinal()];
            z zVar = this.f7151b;
            LocalDateTime localDateTime = this.f7150a;
            if (i == 1) {
                return localDateTime.X(zVar);
            }
            if (i == 2) {
                return zVar.Y();
            }
            return localDateTime.g(rVar);
        }
        return rVar.r(this);
    }

    public final LocalDateTime R() {
        return this.f7150a;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m m(h hVar) {
        return S(this.f7150a.n0(hVar), this.f7151b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m b(long j5, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i = q.f7149a[aVar.ordinal()];
            z zVar = this.f7151b;
            LocalDateTime localDateTime = this.f7150a;
            if (i != 1) {
                if (i == 2) {
                    return S(localDateTime, z.b0(aVar.Y(j5)));
                }
                return S(localDateTime.b(j5, rVar), zVar);
            }
            Instant instantV = Instant.V(j5, localDateTime.Z());
            Objects.requireNonNull(instantV, "instant");
            Objects.requireNonNull(zVar, "zone");
            z zVarD = zVar.r().d(instantV);
            return new r(LocalDateTime.h0(instantV.B(), instantV.I(), zVarD), zVarD);
        }
        return (r) rVar.p(this, j5);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final r d(long j5, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return S(this.f7150a.d(j5, uVar), this.f7151b);
        }
        return (r) uVar.p(this, j5);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m e(long j5, j$.time.temporal.u uVar) {
        return j5 == Long.MIN_VALUE ? d(Long.MAX_VALUE, uVar).d(1L, uVar) : d(-j5, uVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.d() || tVar == j$.time.temporal.s.f()) {
            return this.f7151b;
        }
        if (tVar == j$.time.temporal.s.g()) {
            return null;
        }
        j$.time.temporal.t tVarB = j$.time.temporal.s.b();
        LocalDateTime localDateTime = this.f7150a;
        if (tVar == tVarB) {
            return localDateTime.l0();
        }
        if (tVar == j$.time.temporal.s.c()) {
            return localDateTime.n();
        }
        if (tVar == j$.time.temporal.s.a()) {
            return j$.time.chrono.s.f7036d;
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.j(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.f7150a;
        return mVar.b(localDateTime.l0().u(), aVar).b(localDateTime.n().k0(), j$.time.temporal.a.NANO_OF_DAY).b(this.f7151b.Y(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f7150a.equals(rVar.f7150a) && this.f7151b.equals(rVar.f7151b);
    }

    public final int hashCode() {
        return this.f7150a.hashCode() ^ this.f7151b.hashCode();
    }

    public final String toString() {
        return this.f7150a.toString() + this.f7151b.toString();
    }

    private Object writeReplace() {
        return new u((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.f7150a.p0(objectOutput);
        this.f7151b.e0(objectOutput);
    }

    static r I(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.f6980c;
        h hVar = h.f7127d;
        return new r(LocalDateTime.g0(h.f0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), l.j0(objectInput)), z.d0(objectInput));
    }
}
