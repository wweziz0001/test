package j$.time;

import j$.time.chrono.InterfaceC0509b;
import j$.time.chrono.InterfaceC0512e;
import j$.time.temporal.TemporalAccessor;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements j$.time.temporal.m, j$.time.temporal.n, InterfaceC0509b, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f7127d = f0(-999999999, 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f7128e = f0(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final short f7130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f7131c;

    static {
        f0(1970, 1, 1);
    }

    public static h g0(int i, n nVar, int i5) {
        j$.time.temporal.a.YEAR.Z(i);
        j$.time.temporal.a.DAY_OF_MONTH.Z(i5);
        return B(i, nVar.p(), i5);
    }

    public static h f0(int i, int i5, int i6) {
        j$.time.temporal.a.YEAR.Z(i);
        j$.time.temporal.a.MONTH_OF_YEAR.Z(i5);
        j$.time.temporal.a.DAY_OF_MONTH.Z(i6);
        return B(i, i5, i6);
    }

    public static h i0(int i, int i5) {
        long j5 = i;
        j$.time.temporal.a.YEAR.Z(j5);
        j$.time.temporal.a.DAY_OF_YEAR.Z(i5);
        j$.time.chrono.s.f7036d.getClass();
        boolean zY = j$.time.chrono.s.Y(j5);
        if (i5 == 366 && !zY) {
            throw new c("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        n nVarR = n.R(((i5 - 1) / 31) + 1);
        if (i5 > (nVarR.B(zY) + nVarR.r(zY)) - 1) {
            nVarR = nVarR.S();
        }
        return new h(i, nVarR.p(), (i5 - nVarR.r(zY)) + 1);
    }

    public static h h0(long j5) {
        long j6;
        j$.time.temporal.a.EPOCH_DAY.Z(j5);
        long j7 = 719468 + j5;
        if (j7 < 0) {
            long j8 = ((j5 + 719469) / 146097) - 1;
            j6 = j8 * 400;
            j7 += (-j8) * 146097;
        } else {
            j6 = 0;
        }
        long j9 = ((j7 * 400) + 591) / 146097;
        long j10 = j7 - ((j9 / 400) + (((j9 / 4) + (j9 * 365)) - (j9 / 100)));
        if (j10 < 0) {
            j9--;
            j10 = j7 - ((j9 / 400) + (((j9 / 4) + (365 * j9)) - (j9 / 100)));
        }
        int i = (int) j10;
        int i5 = ((i * 5) + 2) / 153;
        return new h(j$.time.temporal.a.YEAR.Y(j9 + j6 + ((long) (i5 / 10))), ((i5 + 2) % 12) + 1, (i - (((i5 * 306) + 5) / 10)) + 1);
    }

    public static h I(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        h hVar = (h) temporalAccessor.a(j$.time.temporal.s.b());
        if (hVar != null) {
            return hVar;
        }
        throw new c("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    private static h B(int i, int i5, int i6) {
        int i7 = 28;
        if (i6 > 28) {
            if (i5 != 2) {
                i7 = (i5 == 4 || i5 == 6 || i5 == 9 || i5 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.s.f7036d.getClass();
                if (j$.time.chrono.s.Y(i)) {
                    i7 = 29;
                }
            }
            if (i6 > i7) {
                if (i6 == 29) {
                    throw new c("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new c("Invalid date '" + n.R(i5).name() + " " + i6 + "'");
            }
        }
        return new h(i, i5, i6);
    }

    private static h o0(int i, int i5, int i6) {
        if (i5 == 2) {
            j$.time.chrono.s.f7036d.getClass();
            i6 = Math.min(i6, j$.time.chrono.s.Y((long) i) ? 29 : 28);
        } else if (i5 == 4 || i5 == 6 || i5 == 9 || i5 == 11) {
            i6 = Math.min(i6, 30);
        }
        return new h(i, i5, i6);
    }

    private h(int i, int i5, int i6) {
        this.f7129a = i;
        this.f7130b = (short) i5;
        this.f7131c = (short) i6;
    }

    public static h e0(AbstractC0507b abstractC0507b) {
        Instant instantR = Instant.R(System.currentTimeMillis());
        ZoneId zoneIdA = abstractC0507b.a();
        Objects.requireNonNull(instantR, "instant");
        Objects.requireNonNull(zoneIdA, "zone");
        return h0(Math.floorDiv(instantR.B() + ((long) zoneIdA.r().d(instantR).Y()), 86400));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.I(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        if (!aVar.S()) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        int i = g.f7125a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.w.j(1L, d0());
        }
        if (i == 2) {
            return j$.time.temporal.w.j(1L, c0() ? 366 : 365);
        }
        if (i == 3) {
            return j$.time.temporal.w.j(1L, (n.R(this.f7130b) != n.FEBRUARY || c0()) ? 5L : 4L);
        }
        if (i != 4) {
            return ((j$.time.temporal.a) rVar).B();
        }
        return j$.time.temporal.w.j(1L, this.f7129a <= 0 ? 1000000000L : 999999999L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return R(rVar);
        }
        return super.i(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.EPOCH_DAY) {
                return u();
            }
            if (rVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return R(rVar);
            }
            return ((((long) this.f7129a) * 12) + ((long) this.f7130b)) - 1;
        }
        return rVar.r(this);
    }

    private int R(j$.time.temporal.r rVar) {
        int i;
        int i5 = g.f7125a[((j$.time.temporal.a) rVar).ordinal()];
        short s4 = this.f7131c;
        int i6 = this.f7129a;
        switch (i5) {
            case 1:
                return s4;
            case 2:
                return Y();
            case 3:
                i = (s4 - 1) / 7;
                break;
            case 4:
                return i6 >= 1 ? i6 : 1 - i6;
            case 5:
                return V().p();
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                i = (s4 - 1) % 7;
                break;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((Y() - 1) % 7) + 1;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                throw new j$.time.temporal.v("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((Y() - 1) / 7) + 1;
            case 10:
                return this.f7130b;
            case 11:
                throw new j$.time.temporal.v("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i6;
            case 13:
                return i6 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return i + 1;
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public final j$.time.chrono.l h() {
        return j$.time.chrono.s.f7036d;
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public final j$.time.chrono.m t() {
        return this.f7129a >= 1 ? j$.time.chrono.t.CE : j$.time.chrono.t.BCE;
    }

    public final int a0() {
        return this.f7129a;
    }

    public final int Z() {
        return this.f7130b;
    }

    public final int Y() {
        return (n.R(this.f7130b).r(c0()) + this.f7131c) - 1;
    }

    public final int S() {
        return this.f7131c;
    }

    public final DayOfWeek V() {
        return DayOfWeek.r(((int) Math.floorMod(u() + 3, 7)) + 1);
    }

    public final boolean c0() {
        j$.time.chrono.s sVar = j$.time.chrono.s.f7036d;
        long j5 = this.f7129a;
        sVar.getClass();
        return j$.time.chrono.s.Y(j5);
    }

    public final int d0() {
        short s4 = this.f7130b;
        return s4 != 2 ? (s4 == 4 || s4 == 6 || s4 == 9 || s4 == 11) ? 30 : 31 : c0() ? 29 : 28;
    }

    @Override // j$.time.chrono.InterfaceC0509b
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h m(j$.time.temporal.n nVar) {
        if (nVar instanceof h) {
            return (h) nVar;
        }
        return (h) nVar.c(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public final h b(long j5, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (h) rVar.p(this, j5);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.Z(j5);
        int i = g.f7125a[aVar.ordinal()];
        short s4 = this.f7131c;
        short s5 = this.f7130b;
        int i5 = this.f7129a;
        switch (i) {
            case 1:
                int i6 = (int) j5;
                return s4 == i6 ? this : f0(i5, s5, i6);
            case 2:
                return r0((int) j5);
            case 3:
                return m0(j5 - g(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i5 < 1) {
                    j5 = 1 - j5;
                }
                return s0((int) j5);
            case 5:
                return k0(j5 - ((long) V().p()));
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return k0(j5 - g(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return k0(j5 - g(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return h0(j5);
            case 9:
                return m0(j5 - g(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i7 = (int) j5;
                if (s5 == i7) {
                    return this;
                }
                j$.time.temporal.a.MONTH_OF_YEAR.Z(i7);
                return o0(i5, i7, s4);
            case 11:
                return l0(j5 - (((((long) i5) * 12) + ((long) s5)) - 1));
            case 12:
                return s0((int) j5);
            case 13:
                return g(j$.time.temporal.a.ERA) == j5 ? this : s0(1 - i5);
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
    }

    public final h s0(int i) {
        if (this.f7129a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.Z(i);
        return o0(i, this.f7130b, this.f7131c);
    }

    public final h r0(int i) {
        return Y() == i ? this : i0(this.f7129a, i);
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public final InterfaceC0509b L(j$.time.temporal.q qVar) {
        if (qVar instanceof t) {
            return l0(((t) qVar).d()).k0(r4.a());
        }
        Objects.requireNonNull(qVar, "amountToAdd");
        return (h) qVar.p(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final h d(long j5, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (h) uVar.p(this, j5);
        }
        switch (g.f7126b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return k0(j5);
            case 2:
                return m0(j5);
            case 3:
                return l0(j5);
            case 4:
                return n0(j5);
            case 5:
                return n0(Math.multiplyExact(j5, 10));
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return n0(Math.multiplyExact(j5, 100));
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return n0(Math.multiplyExact(j5, 1000));
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return b(Math.addExact(g(aVar), j5), aVar);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    public final h n0(long j5) {
        return j5 == 0 ? this : o0(j$.time.temporal.a.YEAR.Y(((long) this.f7129a) + j5), this.f7130b, this.f7131c);
    }

    public final h l0(long j5) {
        if (j5 == 0) {
            return this;
        }
        long j6 = (((long) this.f7129a) * 12) + ((long) (this.f7130b - 1)) + j5;
        long j7 = 12;
        return o0(j$.time.temporal.a.YEAR.Y(Math.floorDiv(j6, j7)), ((int) Math.floorMod(j6, j7)) + 1, this.f7131c);
    }

    public final h m0(long j5) {
        return k0(Math.multiplyExact(j5, 7));
    }

    public final h k0(long j5) {
        if (j5 == 0) {
            return this;
        }
        long j6 = ((long) this.f7131c) + j5;
        if (j6 > 0) {
            short s4 = this.f7130b;
            int i = this.f7129a;
            if (j6 <= 28) {
                return new h(i, s4, (int) j6);
            }
            if (j6 <= 59) {
                long jD0 = d0();
                if (j6 <= jD0) {
                    return new h(i, s4, (int) j6);
                }
                if (s4 < 12) {
                    return new h(i, s4 + 1, (int) (j6 - jD0));
                }
                int i5 = i + 1;
                j$.time.temporal.a.YEAR.Z(i5);
                return new h(i5, 1, (int) (j6 - jD0));
            }
        }
        return h0(Math.addExact(u(), j5));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m e(long j5, j$.time.temporal.u uVar) {
        return j5 == Long.MIN_VALUE ? d(Long.MAX_VALUE, uVar).d(1L, uVar) : d(-j5, uVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.s.b() ? this : super.a(tVar);
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public final InterfaceC0512e J(l lVar) {
        return LocalDateTime.g0(this, lVar);
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public final long u() {
        long j5 = this.f7129a;
        long j6 = this.f7130b;
        long j7 = 365 * j5;
        long j8 = (((367 * j6) - 362) / 12) + (j5 >= 0 ? ((j5 + 399) / 400) + (((3 + j5) / 4) - ((99 + j5) / 100)) + j7 : j7 - ((j5 / (-400)) + ((j5 / (-4)) - (j5 / (-100))))) + ((long) (this.f7131c - 1));
        if (j6 > 2) {
            j8 = !c0() ? j8 - 2 : j8 - 1;
        }
        return j8 - 719528;
    }

    @Override // j$.time.chrono.InterfaceC0509b, java.lang.Comparable
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC0509b interfaceC0509b) {
        if (interfaceC0509b instanceof h) {
            return r((h) interfaceC0509b);
        }
        return super.compareTo(interfaceC0509b);
    }

    final int r(h hVar) {
        int i = this.f7129a - hVar.f7129a;
        if (i != 0) {
            return i;
        }
        int i5 = this.f7130b - hVar.f7130b;
        return i5 == 0 ? this.f7131c - hVar.f7131c : i5;
    }

    public final boolean b0(h hVar) {
        return hVar != null ? r(hVar) < 0 : u() < hVar.u();
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && r((h) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public final int hashCode() {
        int i = this.f7129a;
        return (((i << 11) + (this.f7130b << 6)) + this.f7131c) ^ (i & (-2048));
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public final String toString() {
        int i = this.f7129a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        short s4 = this.f7130b;
        sb.append(s4 < 10 ? "-0" : "-");
        sb.append((int) s4);
        short s5 = this.f7131c;
        sb.append(s5 < 10 ? "-0" : "-");
        sb.append((int) s5);
        return sb.toString();
    }

    private Object writeReplace() {
        return new u((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void t0(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.f7129a);
        dataOutput.writeByte(this.f7130b);
        dataOutput.writeByte(this.f7131c);
    }
}
