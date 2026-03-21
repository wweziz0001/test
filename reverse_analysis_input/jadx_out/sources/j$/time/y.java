package j$.time;

import j$.time.chrono.AbstractC0508a;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {
    private static final long serialVersionUID = 4183400860270640070L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7199b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y yVar = (y) obj;
        int i = this.f7198a - yVar.f7198a;
        return i == 0 ? this.f7199b - yVar.f7199b : i;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.l(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.z.EXCEEDS_PAD);
        pVar.e('-');
        pVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        pVar.t();
    }

    private y(int i, int i5) {
        this.f7198a = i;
        this.f7199b = i5;
    }

    private y V(int i, int i5) {
        return (this.f7198a == i && this.f7199b == i5) ? this : new y(i, i5);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.YEAR || rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.PROLEPTIC_MONTH || rVar == j$.time.temporal.a.YEAR_OF_ERA || rVar == j$.time.temporal.a.ERA : rVar != null && rVar.V(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.w.j(1L, this.f7198a <= 0 ? 1000000000L : 999999999L);
        }
        return super.l(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.r rVar) {
        return l(rVar).a(g(rVar), rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        int i = x.f7196a[((j$.time.temporal.a) rVar).ordinal()];
        if (i == 1) {
            return this.f7199b;
        }
        if (i == 2) {
            return r();
        }
        int i5 = this.f7198a;
        if (i == 3) {
            if (i5 < 1) {
                i5 = 1 - i5;
            }
            return i5;
        }
        if (i == 4) {
            return i5;
        }
        if (i == 5) {
            return i5 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    private long r() {
        return ((((long) this.f7198a) * 12) + ((long) this.f7199b)) - 1;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m m(h hVar) {
        return (y) hVar.c(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final y b(long j5, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (y) rVar.p(this, j5);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.Z(j5);
        int i = x.f7196a[aVar.ordinal()];
        int i5 = this.f7198a;
        if (i == 1) {
            int i6 = (int) j5;
            j$.time.temporal.a.MONTH_OF_YEAR.Z(i6);
            return V(i5, i6);
        }
        if (i == 2) {
            return I(j5 - r());
        }
        int i7 = this.f7199b;
        if (i == 3) {
            if (i5 < 1) {
                j5 = 1 - j5;
            }
            int i8 = (int) j5;
            j$.time.temporal.a.YEAR.Z(i8);
            return V(i8, i7);
        }
        if (i == 4) {
            int i9 = (int) j5;
            j$.time.temporal.a.YEAR.Z(i9);
            return V(i9, i7);
        }
        if (i != 5) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        if (g(j$.time.temporal.a.ERA) == j5) {
            return this;
        }
        int i10 = 1 - i5;
        j$.time.temporal.a.YEAR.Z(i10);
        return V(i10, i7);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final y d(long j5, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (y) uVar.p(this, j5);
        }
        switch (x.f7197b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return I(j5);
            case 2:
                return R(j5);
            case 3:
                return R(Math.multiplyExact(j5, 10));
            case 4:
                return R(Math.multiplyExact(j5, 100));
            case 5:
                return R(Math.multiplyExact(j5, 1000));
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return b(Math.addExact(g(aVar), j5), aVar);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    public final y R(long j5) {
        return j5 == 0 ? this : V(j$.time.temporal.a.YEAR.Y(((long) this.f7198a) + j5), this.f7199b);
    }

    public final y I(long j5) {
        if (j5 == 0) {
            return this;
        }
        long j6 = (((long) this.f7198a) * 12) + ((long) (this.f7199b - 1)) + j5;
        long j7 = 12;
        return V(j$.time.temporal.a.YEAR.Y(Math.floorDiv(j6, j7)), ((int) Math.floorMod(j6, j7)) + 1);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m e(long j5, j$.time.temporal.u uVar) {
        return j5 == Long.MIN_VALUE ? d(Long.MAX_VALUE, uVar).d(1L, uVar) : d(-j5, uVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.a()) {
            return j$.time.chrono.s.f7036d;
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.MONTHS;
        }
        return super.a(tVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        if (!((AbstractC0508a) j$.time.chrono.l.E(mVar)).equals(j$.time.chrono.s.f7036d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return mVar.b(r(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f7198a == yVar.f7198a && this.f7199b == yVar.f7199b;
    }

    public final int hashCode() {
        return (this.f7199b << 27) ^ this.f7198a;
    }

    public final String toString() {
        int i = this.f7198a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        int i5 = this.f7199b;
        sb.append(i5 < 10 ? "-0" : "-");
        sb.append(i5);
        return sb.toString();
    }

    private Object writeReplace() {
        return new u((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void Z(DataOutput dataOutput) {
        dataOutput.writeInt(this.f7198a);
        dataOutput.writeByte(this.f7199b);
    }

    static y S(ObjectInput objectInput) throws IOException {
        int i = objectInput.readInt();
        byte b4 = objectInput.readByte();
        j$.time.temporal.a.YEAR.Z(i);
        j$.time.temporal.a.MONTH_OF_YEAR.Z(b4);
        return new y(i, b4);
    }
}
