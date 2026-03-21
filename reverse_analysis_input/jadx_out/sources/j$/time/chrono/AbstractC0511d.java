package j$.time.chrono;

import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0511d implements InterfaceC0509b, j$.time.temporal.m, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    abstract InterfaceC0509b B(long j5);

    abstract InterfaceC0509b I(long j5);

    abstract InterfaceC0509b R(long j5);

    @Override // j$.time.chrono.InterfaceC0509b, j$.time.temporal.m
    public /* bridge */ /* synthetic */ j$.time.temporal.m e(long j5, j$.time.temporal.u uVar) {
        return e(j5, uVar);
    }

    static InterfaceC0509b r(l lVar, j$.time.temporal.m mVar) {
        InterfaceC0509b interfaceC0509b = (InterfaceC0509b) mVar;
        AbstractC0508a abstractC0508a = (AbstractC0508a) lVar;
        if (abstractC0508a.equals(interfaceC0509b.h())) {
            return interfaceC0509b;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + abstractC0508a.getId() + ", actual: " + interfaceC0509b.h().getId());
    }

    AbstractC0511d() {
    }

    @Override // j$.time.temporal.m
    public InterfaceC0509b d(long j5, j$.time.temporal.u uVar) {
        boolean z4 = uVar instanceof j$.time.temporal.b;
        if (!z4) {
            if (!z4) {
                return r(h(), uVar.p(this, j5));
            }
            throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
        switch (AbstractC0510c.f7004a[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return B(j5);
            case 2:
                return B(Math.multiplyExact(j5, 7));
            case 3:
                return I(j5);
            case 4:
                return R(j5);
            case 5:
                return R(Math.multiplyExact(j5, 10));
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return R(Math.multiplyExact(j5, 100));
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return R(Math.multiplyExact(j5, 1000));
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return b(Math.addExact(g(aVar), j5), (j$.time.temporal.r) aVar);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC0509b) && compareTo((InterfaceC0509b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public int hashCode() {
        long jU = u();
        return ((int) (jU ^ (jU >>> 32))) ^ ((AbstractC0508a) h()).hashCode();
    }

    @Override // j$.time.temporal.m
    public InterfaceC0509b m(j$.time.temporal.n nVar) {
        return r(h(), nVar.c(this));
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public String toString() {
        long jG = g(j$.time.temporal.a.YEAR_OF_ERA);
        long jG2 = g(j$.time.temporal.a.MONTH_OF_YEAR);
        long jG3 = g(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(((AbstractC0508a) h()).getId());
        sb.append(" ");
        sb.append(t());
        sb.append(" ");
        sb.append(jG);
        sb.append(jG2 < 10 ? "-0" : "-");
        sb.append(jG2);
        sb.append(jG3 < 10 ? "-0" : "-");
        sb.append(jG3);
        return sb.toString();
    }

    @Override // j$.time.temporal.m
    public InterfaceC0509b b(long j5, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        return r(h(), rVar.p(this, j5));
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public InterfaceC0509b L(j$.time.temporal.q qVar) {
        return r(h(), qVar.p(this));
    }
}
