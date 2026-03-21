package j$.time;

import j$.time.format.DateTimeFormatter;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.n, Comparable<Instant>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Instant f6977c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f6978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6979b;

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.f6978a, instant2.f6978a);
        return iCompare != 0 ? iCompare : this.f6979b - instant2.f6979b;
    }

    static {
        V(-31557014167219200L, 0L);
        V(31556889864403199L, 999999999L);
    }

    public static Instant S(long j5) {
        return r(j5, 0);
    }

    public static Instant V(long j5, long j6) {
        return r(Math.addExact(j5, Math.floorDiv(j6, 1000000000L)), (int) Math.floorMod(j6, 1000000000L));
    }

    public static Instant R(long j5) {
        long j6 = 1000;
        return r(Math.floorDiv(j5, j6), ((int) Math.floorMod(j5, j6)) * 1000000);
    }

    private static Instant r(long j5, int i) {
        if ((((long) i) | j5) == 0) {
            return f6977c;
        }
        if (j5 < -31557014167219200L || j5 > 31556889864403199L) {
            throw new c("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j5, i);
    }

    private Instant(long j5, int i) {
        this.f6978a = j5;
        this.f6979b = i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.NANO_OF_SECOND || rVar == j$.time.temporal.a.MICRO_OF_SECOND || rVar == j$.time.temporal.a.MILLI_OF_SECOND : rVar != null && rVar.V(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return super.l(rVar).a(rVar.r(this), rVar);
        }
        int i = f.f7051a[((j$.time.temporal.a) rVar).ordinal()];
        int i5 = this.f6979b;
        if (i == 1) {
            return i5;
        }
        if (i == 2) {
            return i5 / 1000;
        }
        if (i == 3) {
            return i5 / 1000000;
        }
        if (i == 4) {
            j$.time.temporal.a.INSTANT_SECONDS.Y(this.f6978a);
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.r rVar) {
        int i;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        int i5 = f.f7051a[((j$.time.temporal.a) rVar).ordinal()];
        int i6 = this.f6979b;
        if (i5 == 1) {
            return i6;
        }
        if (i5 == 2) {
            i = i6 / 1000;
        } else {
            if (i5 != 3) {
                if (i5 == 4) {
                    return this.f6978a;
                }
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
            }
            i = i6 / 1000000;
        }
        return i;
    }

    public final long B() {
        return this.f6978a;
    }

    public final int I() {
        return this.f6979b;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m m(h hVar) {
        return (Instant) hVar.c(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m b(long j5, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (Instant) rVar.p(this, j5);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.Z(j5);
        int i = f.f7051a[aVar.ordinal()];
        int i5 = this.f6979b;
        long j6 = this.f6978a;
        if (i != 1) {
            if (i == 2) {
                int i6 = ((int) j5) * 1000;
                if (i6 != i5) {
                    return r(j6, i6);
                }
            } else if (i == 3) {
                int i7 = ((int) j5) * 1000000;
                if (i7 != i5) {
                    return r(j6, i7);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
                }
                if (j5 != j6) {
                    return r(j5, i5);
                }
            }
        } else if (j5 != i5) {
            return r(j6, (int) j5);
        }
        return this;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final Instant d(long j5, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (Instant) uVar.p(this, j5);
        }
        switch (f.f7052b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return Y(0L, j5);
            case 2:
                return Y(j5 / 1000000, (j5 % 1000000) * 1000);
            case 3:
                return Y(j5 / 1000, (j5 % 1000) * 1000000);
            case 4:
                return Y(j5, 0L);
            case 5:
                return Y(Math.multiplyExact(j5, 60), 0L);
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return Y(Math.multiplyExact(j5, 3600), 0L);
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return Y(Math.multiplyExact(j5, 43200), 0L);
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return Y(Math.multiplyExact(j5, 86400), 0L);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    private Instant Y(long j5, long j6) {
        if ((j5 | j6) == 0) {
            return this;
        }
        return V(Math.addExact(Math.addExact(this.f6978a, j5), j6 / 1000000000), ((long) this.f6979b) + (j6 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m e(long j5, j$.time.temporal.u uVar) {
        return j5 == Long.MIN_VALUE ? d(Long.MAX_VALUE, uVar).d(1L, uVar) : d(-j5, uVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        if (tVar == j$.time.temporal.s.a() || tVar == j$.time.temporal.s.g() || tVar == j$.time.temporal.s.f() || tVar == j$.time.temporal.s.d() || tVar == j$.time.temporal.s.b() || tVar == j$.time.temporal.s.c()) {
            return null;
        }
        return tVar.j(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.b(this.f6978a, j$.time.temporal.a.INSTANT_SECONDS).b(this.f6979b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public long toEpochMilli() {
        long j5 = this.f6978a;
        return (j5 >= 0 || this.f6979b <= 0) ? Math.addExact(Math.multiplyExact(j5, 1000), r5 / 1000000) : Math.addExact(Math.multiplyExact(j5 + 1, 1000), (r5 / 1000000) - 1000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.f6978a == instant.f6978a && this.f6979b == instant.f6979b;
    }

    public final int hashCode() {
        long j5 = this.f6978a;
        return (this.f6979b * 51) + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.f7055g.format(this);
    }

    private Object writeReplace() {
        return new u((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void a0(DataOutput dataOutput) {
        dataOutput.writeLong(this.f6978a);
        dataOutput.writeInt(this.f6979b);
    }
}
