package j$.time;

import j$.time.chrono.AbstractC0508a;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f7194b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7195a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f7195a - ((w) obj).f7195a;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.l(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.z.EXCEEDS_PAD);
        pVar.t();
    }

    public static w r(int i) {
        j$.time.temporal.a.YEAR.Z(i);
        return new w(i);
    }

    private w(int i) {
        this.f7195a = i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.YEAR || rVar == j$.time.temporal.a.YEAR_OF_ERA || rVar == j$.time.temporal.a.ERA : rVar != null && rVar.V(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.w.j(1L, this.f7195a <= 0 ? 1000000000L : 999999999L);
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
        int i = v.f7192a[((j$.time.temporal.a) rVar).ordinal()];
        int i5 = this.f7195a;
        if (i == 1) {
            if (i5 < 1) {
                i5 = 1 - i5;
            }
            return i5;
        }
        if (i == 2) {
            return i5;
        }
        if (i == 3) {
            return i5 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m m(h hVar) {
        return (w) hVar.c(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final w b(long j5, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (w) rVar.p(this, j5);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.Z(j5);
        int i = v.f7192a[aVar.ordinal()];
        int i5 = this.f7195a;
        if (i == 1) {
            if (i5 < 1) {
                j5 = 1 - j5;
            }
            return r((int) j5);
        }
        if (i == 2) {
            return r((int) j5);
        }
        if (i == 3) {
            return g(j$.time.temporal.a.ERA) == j5 ? this : r(1 - i5);
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final w d(long j5, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (w) uVar.p(this, j5);
        }
        int i = v.f7193b[((j$.time.temporal.b) uVar).ordinal()];
        if (i == 1) {
            return I(j5);
        }
        if (i == 2) {
            return I(Math.multiplyExact(j5, 10));
        }
        if (i == 3) {
            return I(Math.multiplyExact(j5, 100));
        }
        if (i == 4) {
            return I(Math.multiplyExact(j5, 1000));
        }
        if (i == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return b(Math.addExact(g(aVar), j5), aVar);
        }
        throw new j$.time.temporal.v("Unsupported unit: " + uVar);
    }

    public final w I(long j5) {
        return j5 == 0 ? this : r(j$.time.temporal.a.YEAR.Y(((long) this.f7195a) + j5));
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
            return j$.time.temporal.b.YEARS;
        }
        return super.a(tVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        if (!((AbstractC0508a) j$.time.chrono.l.E(mVar)).equals(j$.time.chrono.s.f7036d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return mVar.b(this.f7195a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            return this.f7195a == ((w) obj).f7195a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7195a;
    }

    public final String toString() {
        return Integer.toString(this.f7195a);
    }

    private Object writeReplace() {
        return new u((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void S(DataOutput dataOutput) {
        dataOutput.writeInt(this.f7195a);
    }
}
