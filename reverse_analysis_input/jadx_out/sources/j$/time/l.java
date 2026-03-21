package j$.time;

import j$.time.temporal.TemporalAccessor;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f7135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f7136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f7137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final l[] f7138h = new l[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f7139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f7140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte f7141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7142d;

    static {
        int i = 0;
        while (true) {
            l[] lVarArr = f7138h;
            if (i < lVarArr.length) {
                lVarArr[i] = new l(i, 0, 0, 0);
                i++;
            } else {
                l lVar = lVarArr[0];
                f7137g = lVar;
                l lVar2 = lVarArr[12];
                f7135e = lVar;
                f7136f = new l(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static l a0(int i) {
        j$.time.temporal.a.HOUR_OF_DAY.Z(i);
        return f7138h[i];
    }

    public static l b0(int i, int i5, int i6, int i7) {
        j$.time.temporal.a.HOUR_OF_DAY.Z(i);
        j$.time.temporal.a.MINUTE_OF_HOUR.Z(i5);
        j$.time.temporal.a.SECOND_OF_MINUTE.Z(i6);
        j$.time.temporal.a.NANO_OF_SECOND.Z(i7);
        return B(i, i5, i6, i7);
    }

    public static l d0(long j5) {
        j$.time.temporal.a.SECOND_OF_DAY.Z(j5);
        int i = (int) (j5 / 3600);
        long j6 = j5 - ((long) (i * 3600));
        int i5 = (int) (j6 / 60);
        return B(i, i5, (int) (j6 - ((long) (i5 * 60))), 0);
    }

    public static l c0(long j5) {
        j$.time.temporal.a.NANO_OF_DAY.Z(j5);
        int i = (int) (j5 / 3600000000000L);
        long j6 = j5 - (((long) i) * 3600000000000L);
        int i5 = (int) (j6 / 60000000000L);
        long j7 = j6 - (((long) i5) * 60000000000L);
        int i6 = (int) (j7 / 1000000000);
        return B(i, i5, i6, (int) (j7 - (((long) i6) * 1000000000)));
    }

    public static l I(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        l lVar = (l) temporalAccessor.a(j$.time.temporal.s.c());
        if (lVar != null) {
            return lVar;
        }
        throw new c("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    private static l B(int i, int i5, int i6, int i7) {
        if ((i5 | i6 | i7) == 0) {
            return f7138h[i];
        }
        return new l(i, i5, i6, i7);
    }

    private l(int i, int i5, int i6, int i7) {
        this.f7139a = (byte) i;
        this.f7140b = (byte) i5;
        this.f7141c = (byte) i6;
        this.f7142d = i7;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).a0();
        }
        return rVar != null && rVar.V(this);
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
            if (rVar == j$.time.temporal.a.NANO_OF_DAY) {
                return k0();
            }
            if (rVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return k0() / 1000;
            }
            return R(rVar);
        }
        return rVar.r(this);
    }

    private int R(j$.time.temporal.r rVar) {
        int i = k.f7133a[((j$.time.temporal.a) rVar).ordinal()];
        byte b4 = this.f7140b;
        int i5 = this.f7142d;
        byte b5 = this.f7139a;
        switch (i) {
            case 1:
                return i5;
            case 2:
                throw new j$.time.temporal.v("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i5 / 1000;
            case 4:
                throw new j$.time.temporal.v("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i5 / 1000000;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return (int) (k0() / 1000000);
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.f7141c;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return l0();
            case 9:
                return b4;
            case 10:
                return (b5 * 60) + b4;
            case 11:
                return b5 % 12;
            case 12:
                int i6 = b5 % 12;
                if (i6 % 12 == 0) {
                    return 12;
                }
                return i6;
            case 13:
                return b5;
            case 14:
                if (b5 == 0) {
                    return 24;
                }
                return b5;
            case 15:
                return b5 / 12;
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
    }

    public final int S() {
        return this.f7139a;
    }

    public final int V() {
        return this.f7140b;
    }

    public final int Z() {
        return this.f7141c;
    }

    public final int Y() {
        return this.f7142d;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m m(h hVar) {
        return (l) hVar.c(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public final l b(long j5, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (l) rVar.p(this, j5);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.Z(j5);
        int i = k.f7133a[aVar.ordinal()];
        byte b4 = this.f7140b;
        byte b5 = this.f7141c;
        int i5 = this.f7142d;
        byte b6 = this.f7139a;
        switch (i) {
            case 1:
                return n0((int) j5);
            case 2:
                return c0(j5);
            case 3:
                return n0(((int) j5) * 1000);
            case 4:
                return c0(j5 * 1000);
            case 5:
                return n0(((int) j5) * 1000000);
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return c0(j5 * 1000000);
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                int i6 = (int) j5;
                if (b5 == i6) {
                    return this;
                }
                j$.time.temporal.a.SECOND_OF_MINUTE.Z(i6);
                return B(b6, b4, i6, i5);
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return i0(j5 - ((long) l0()));
            case 9:
                int i7 = (int) j5;
                if (b4 == i7) {
                    return this;
                }
                j$.time.temporal.a.MINUTE_OF_HOUR.Z(i7);
                return B(b6, i7, b5, i5);
            case 10:
                return g0(j5 - ((long) ((b6 * 60) + b4)));
            case 11:
                return f0(j5 - ((long) (b6 % 12)));
            case 12:
                if (j5 == 12) {
                    j5 = 0;
                }
                return f0(j5 - ((long) (b6 % 12)));
            case 13:
                int i8 = (int) j5;
                if (b6 == i8) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.Z(i8);
                return B(i8, b4, b5, i5);
            case 14:
                if (j5 == 24) {
                    j5 = 0;
                }
                int i9 = (int) j5;
                if (b6 == i9) {
                    return this;
                }
                j$.time.temporal.a.HOUR_OF_DAY.Z(i9);
                return B(i9, b4, b5, i5);
            case 15:
                return f0((j5 - ((long) (b6 / 12))) * 12);
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
    }

    public final l n0(int i) {
        if (this.f7142d == i) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.Z(i);
        return B(this.f7139a, this.f7140b, this.f7141c, i);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final l d(long j5, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            switch (k.f7134b[((j$.time.temporal.b) uVar).ordinal()]) {
                case 1:
                    return h0(j5);
                case 2:
                    return h0((j5 % 86400000000L) * 1000);
                case 3:
                    return h0((j5 % 86400000) * 1000000);
                case 4:
                    return i0(j5);
                case 5:
                    return g0(j5);
                case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    return f0(j5);
                case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    return f0((j5 % 2) * 12);
                default:
                    throw new j$.time.temporal.v("Unsupported unit: " + uVar);
            }
        }
        return (l) uVar.p(this, j5);
    }

    public final l f0(long j5) {
        if (j5 == 0) {
            return this;
        }
        return B(((((int) (j5 % 24)) + this.f7139a) + 24) % 24, this.f7140b, this.f7141c, this.f7142d);
    }

    public final l g0(long j5) {
        if (j5 == 0) {
            return this;
        }
        int i = (this.f7139a * 60) + this.f7140b;
        int i5 = ((((int) (j5 % 1440)) + i) + 1440) % 1440;
        return i == i5 ? this : B(i5 / 60, i5 % 60, this.f7141c, this.f7142d);
    }

    public final l i0(long j5) {
        if (j5 == 0) {
            return this;
        }
        int i = (this.f7140b * 60) + (this.f7139a * 3600) + this.f7141c;
        int i5 = ((((int) (j5 % 86400)) + i) + 86400) % 86400;
        return i == i5 ? this : B(i5 / 3600, (i5 / 60) % 60, i5 % 60, this.f7142d);
    }

    public final l h0(long j5) {
        if (j5 == 0) {
            return this;
        }
        long jK0 = k0();
        long j6 = (((j5 % 86400000000000L) + jK0) + 86400000000000L) % 86400000000000L;
        return jK0 == j6 ? this : B((int) (j6 / 3600000000000L), (int) ((j6 / 60000000000L) % 60), (int) ((j6 / 1000000000) % 60), (int) (j6 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m e(long j5, j$.time.temporal.u uVar) {
        return j5 == Long.MIN_VALUE ? d(Long.MAX_VALUE, uVar).d(1L, uVar) : d(-j5, uVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.a() || tVar == j$.time.temporal.s.g() || tVar == j$.time.temporal.s.f() || tVar == j$.time.temporal.s.d()) {
            return null;
        }
        if (tVar == j$.time.temporal.s.c()) {
            return this;
        }
        if (tVar == j$.time.temporal.s.b()) {
            return null;
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.j(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.b(k0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int l0() {
        return (this.f7140b * 60) + (this.f7139a * 3600) + this.f7141c;
    }

    public final long k0() {
        return (((long) this.f7141c) * 1000000000) + (((long) this.f7140b) * 60000000000L) + (((long) this.f7139a) * 3600000000000L) + ((long) this.f7142d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l lVar) {
        int iCompare = Integer.compare(this.f7139a, lVar.f7139a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Integer.compare(this.f7140b, lVar.f7140b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Integer.compare(this.f7141c, lVar.f7141c);
        return iCompare3 == 0 ? Integer.compare(this.f7142d, lVar.f7142d) : iCompare3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f7139a == lVar.f7139a && this.f7140b == lVar.f7140b && this.f7141c == lVar.f7141c && this.f7142d == lVar.f7142d;
    }

    public final int hashCode() {
        long jK0 = k0();
        return (int) (jK0 ^ (jK0 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b4 = this.f7139a;
        sb.append(b4 < 10 ? "0" : "");
        sb.append((int) b4);
        byte b5 = this.f7140b;
        sb.append(b5 < 10 ? ":0" : ":");
        sb.append((int) b5);
        byte b6 = this.f7141c;
        int i = this.f7142d;
        if (b6 > 0 || i > 0) {
            sb.append(b6 < 10 ? ":0" : ":");
            sb.append((int) b6);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new u((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void o0(DataOutput dataOutput) {
        byte b4 = this.f7141c;
        byte b5 = this.f7139a;
        byte b6 = this.f7140b;
        int i = this.f7142d;
        if (i != 0) {
            dataOutput.writeByte(b5);
            dataOutput.writeByte(b6);
            dataOutput.writeByte(b4);
            dataOutput.writeInt(i);
            return;
        }
        if (b4 != 0) {
            dataOutput.writeByte(b5);
            dataOutput.writeByte(b6);
            dataOutput.writeByte(~b4);
        } else if (b6 == 0) {
            dataOutput.writeByte(~b5);
        } else {
            dataOutput.writeByte(b5);
            dataOutput.writeByte(~b6);
        }
    }

    static l j0(ObjectInput objectInput) throws IOException {
        int i;
        int i5;
        int i6 = objectInput.readByte();
        int i7 = 0;
        if (i6 < 0) {
            i6 = ~i6;
            i = 0;
            i5 = 0;
        } else {
            byte b4 = objectInput.readByte();
            if (b4 < 0) {
                int i8 = ~b4;
                i5 = 0;
                i7 = i8;
                i = 0;
            } else {
                byte b5 = objectInput.readByte();
                if (b5 < 0) {
                    i = ~b5;
                } else {
                    i7 = objectInput.readInt();
                    i = b5;
                }
                i5 = i7;
                i7 = b4;
            }
        }
        return b0(i6, i7, i, i5);
    }
}
