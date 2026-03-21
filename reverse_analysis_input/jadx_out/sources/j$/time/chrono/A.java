package j$.time.chrono;

import j$.time.AbstractC0507b;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class A extends AbstractC0508a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A f6990d = new A();
    private static final long serialVersionUID = 1039765215346859963L;

    private A() {
    }

    @Override // j$.time.chrono.l
    public final String getId() {
        return "Minguo";
    }

    @Override // j$.time.chrono.l
    public final m M(int i) {
        if (i == 0) {
            return D.BEFORE_ROC;
        }
        if (i == 1) {
            return D.ROC;
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    @Override // j$.time.chrono.l
    public final String Q() {
        return "roc";
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b F(int i, int i5, int i6) {
        return new C(j$.time.h.f0(i + 1911, i5, i6));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b z(int i, int i5) {
        return new C(j$.time.h.i0(i + 1911, i5));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b q(long j5) {
        return new C(j$.time.h.h0(j5));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b K() {
        return new C(j$.time.h.I(j$.time.h.e0(AbstractC0507b.b())));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b s(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof C) {
            return (C) temporalAccessor;
        }
        return new C(j$.time.h.I(temporalAccessor));
    }

    @Override // j$.time.chrono.l
    public final int v(m mVar, int i) {
        if (mVar instanceof D) {
            return mVar == D.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.l
    public final List C() {
        return j$.time.e.a(D.values());
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.w T(j$.time.temporal.a aVar) {
        int i = z.f7050a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.w wVarB = j$.time.temporal.a.PROLEPTIC_MONTH.B();
            return j$.time.temporal.w.j(wVarB.e() - 22932, wVarB.d() - 22932);
        }
        if (i == 2) {
            j$.time.temporal.w wVarB2 = j$.time.temporal.a.YEAR.B();
            return j$.time.temporal.w.k(wVarB2.d() - 1911, (-wVarB2.e()) + 1912);
        }
        if (i == 3) {
            j$.time.temporal.w wVarB3 = j$.time.temporal.a.YEAR.B();
            return j$.time.temporal.w.j(wVarB3.e() - 1911, wVarB3.d() - 1911);
        }
        return aVar.B();
    }

    @Override // j$.time.chrono.AbstractC0508a, j$.time.chrono.l
    public final InterfaceC0509b O(Map map, j$.time.format.y yVar) {
        return (C) super.O(map, yVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.l
    public final ChronoZonedDateTime x(Instant instant, ZoneId zoneId) {
        return k.I(this, instant, zoneId);
    }

    Object writeReplace() {
        return new E((byte) 1, this);
    }
}
