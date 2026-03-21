package j$.time;

import j$.time.chrono.AbstractC0508a;
import j$.time.temporal.TemporalAccessor;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements TemporalAccessor, j$.time.temporal.n, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7148b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        int i = this.f7147a - pVar.f7147a;
        return i == 0 ? this.f7148b - pVar.f7148b : i;
    }

    static {
        j$.time.format.p pVar = new j$.time.format.p();
        pVar.f("--");
        pVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        pVar.e('-');
        pVar.k(j$.time.temporal.a.DAY_OF_MONTH, 2);
        pVar.t();
    }

    private p(int i, int i5) {
        this.f7147a = i;
        this.f7148b = i5;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.DAY_OF_MONTH : rVar != null && rVar.V(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return rVar.B();
        }
        if (rVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return super.l(rVar);
        }
        n nVarR = n.R(this.f7147a);
        nVarR.getClass();
        int i = m.f7143a[nVarR.ordinal()];
        return j$.time.temporal.w.k(i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : 28, n.R(r5).I());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.r rVar) {
        return l(rVar).a(g(rVar), rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.r rVar) {
        int i;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        int i5 = o.f7146a[((j$.time.temporal.a) rVar).ordinal()];
        if (i5 == 1) {
            i = this.f7148b;
        } else {
            if (i5 != 2) {
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
            }
            i = this.f7147a;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.a()) {
            return j$.time.chrono.s.f7036d;
        }
        return super.a(tVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        if (!((AbstractC0508a) j$.time.chrono.l.E(mVar)).equals(j$.time.chrono.s.f7036d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.m mVarB = mVar.b(this.f7147a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return mVarB.b(Math.min(mVarB.l(aVar).d(), this.f7148b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f7147a == pVar.f7147a && this.f7148b == pVar.f7148b;
    }

    public final int hashCode() {
        return (this.f7147a << 6) + this.f7148b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i = this.f7147a;
        sb.append(i < 10 ? "0" : "");
        sb.append(i);
        int i5 = this.f7148b;
        sb.append(i5 < 10 ? "-0" : "-");
        sb.append(i5);
        return sb.toString();
    }

    private Object writeReplace() {
        return new u((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void B(DataOutput dataOutput) {
        dataOutput.writeByte(this.f7147a);
        dataOutput.writeByte(this.f7148b);
    }

    static p r(ObjectInput objectInput) throws IOException {
        byte b4 = objectInput.readByte();
        byte b5 = objectInput.readByte();
        n nVarR = n.R(b4);
        Objects.requireNonNull(nVarR, "month");
        j$.time.temporal.a.DAY_OF_MONTH.Z(b5);
        if (b5 > nVarR.I()) {
            throw new c("Illegal value for DayOfMonth field, value " + ((int) b5) + " is not valid for month " + nVarR.name());
        }
        return new p(nVarR.p(), b5);
    }
}
