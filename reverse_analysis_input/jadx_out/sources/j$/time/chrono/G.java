package j$.time.chrono;

import j$.time.AbstractC0507b;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends AbstractC0508a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final G f6997d = new G();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.l
    public final m M(int i) {
        if (i == 0) {
            return J.BEFORE_BE;
        }
        if (i == 1) {
            return J.BE;
        }
        throw new j$.time.c("Invalid era: " + i);
    }

    private G() {
    }

    @Override // j$.time.chrono.l
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.l
    public final String Q() {
        return "buddhist";
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b F(int i, int i5, int i6) {
        return new I(j$.time.h.f0(i - 543, i5, i6));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b z(int i, int i5) {
        return new I(j$.time.h.i0(i - 543, i5));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b q(long j5) {
        return new I(j$.time.h.h0(j5));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b K() {
        return new I(j$.time.h.I(j$.time.h.e0(AbstractC0507b.b())));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b s(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof I) {
            return (I) temporalAccessor;
        }
        return new I(j$.time.h.I(temporalAccessor));
    }

    @Override // j$.time.chrono.l
    public final int v(m mVar, int i) {
        if (mVar instanceof J) {
            return mVar == J.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // j$.time.chrono.l
    public final List C() {
        return j$.time.e.a(J.values());
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.w T(j$.time.temporal.a aVar) {
        int i = F.f6996a[aVar.ordinal()];
        if (i == 1) {
            j$.time.temporal.w wVarB = j$.time.temporal.a.PROLEPTIC_MONTH.B();
            return j$.time.temporal.w.j(wVarB.e() + 6516, wVarB.d() + 6516);
        }
        if (i == 2) {
            j$.time.temporal.w wVarB2 = j$.time.temporal.a.YEAR.B();
            return j$.time.temporal.w.k((-(wVarB2.e() + 543)) + 1, wVarB2.d() + 543);
        }
        if (i == 3) {
            j$.time.temporal.w wVarB3 = j$.time.temporal.a.YEAR.B();
            return j$.time.temporal.w.j(wVarB3.e() + 543, wVarB3.d() + 543);
        }
        return aVar.B();
    }

    @Override // j$.time.chrono.AbstractC0508a, j$.time.chrono.l
    public final InterfaceC0509b O(Map map, j$.time.format.y yVar) {
        return (I) super.O(map, yVar);
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
