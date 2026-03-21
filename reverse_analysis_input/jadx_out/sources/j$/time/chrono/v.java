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
public final class v extends AbstractC0508a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f7039d = new v();
    private static final long serialVersionUID = 459996390165777884L;

    private v() {
    }

    @Override // j$.time.chrono.l
    public final String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.l
    public final String Q() {
        return "japanese";
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b F(int i, int i5, int i6) {
        return new x(j$.time.h.f0(i, i5, i6));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b z(int i, int i5) {
        return new x(j$.time.h.i0(i, i5));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b q(long j5) {
        return new x(j$.time.h.h0(j5));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b K() {
        return new x(j$.time.h.I(j$.time.h.e0(AbstractC0507b.b())));
    }

    @Override // j$.time.chrono.l
    public final InterfaceC0509b s(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof x) {
            return (x) temporalAccessor;
        }
        return new x(j$.time.h.I(temporalAccessor));
    }

    @Override // j$.time.chrono.l
    public final int v(m mVar, int i) {
        if (!(mVar instanceof y)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        y yVar = (y) mVar;
        int iA0 = (yVar.s().a0() + i) - 1;
        if (i == 1) {
            return iA0;
        }
        if (iA0 < -999999999 || iA0 > 999999999 || iA0 < yVar.s().a0() || mVar != y.q(j$.time.h.f0(iA0, 1, 1))) {
            throw new j$.time.c("Invalid yearOfEra value");
        }
        return iA0;
    }

    @Override // j$.time.chrono.l
    public final m M(int i) {
        return y.w(i);
    }

    @Override // j$.time.chrono.l
    public final List C() {
        return j$.time.e.a(y.B());
    }

    @Override // j$.time.chrono.l
    public final j$.time.temporal.w T(j$.time.temporal.a aVar) {
        switch (u.f7038a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.v("Unsupported field: " + aVar);
            case 5:
                return j$.time.temporal.w.k(y.z(), 999999999 - y.r().s().a0());
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return j$.time.temporal.w.k(y.x(), j$.time.temporal.a.DAY_OF_YEAR.B().d());
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return j$.time.temporal.w.j(x.f7041d.a0(), 999999999L);
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return j$.time.temporal.w.j(y.f7045d.p(), y.r().p());
            default:
                return aVar.B();
        }
    }

    @Override // j$.time.chrono.AbstractC0508a, j$.time.chrono.l
    public final InterfaceC0509b O(Map map, j$.time.format.y yVar) {
        return (x) super.O(map, yVar);
    }

    @Override // j$.time.chrono.AbstractC0508a
    final InterfaceC0509b V(Map map, j$.time.format.y yVar) {
        x xVarA0;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l3 = (Long) map.get(aVar);
        y yVarW = l3 != null ? y.w(T(aVar).a(l3.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l4 = (Long) map.get(aVar2);
        int iA = l4 != null ? T(aVar2).a(l4.longValue(), aVar2) : 0;
        if (yVarW == null && l4 != null && !map.containsKey(j$.time.temporal.a.YEAR) && yVar != j$.time.format.y.STRICT) {
            yVarW = y.B()[y.B().length - 1];
        }
        if (l4 != null && yVarW != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (yVar == j$.time.format.y.LENIENT) {
                        return new x(j$.time.h.f0((yVarW.s().a0() + iA) - 1, 1, 1)).V(Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), j$.time.temporal.b.MONTHS).V(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), j$.time.temporal.b.DAYS);
                    }
                    int iA2 = T(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = T(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (yVar != j$.time.format.y.SMART) {
                        j$.time.h hVar = x.f7041d;
                        j$.time.h hVarF0 = j$.time.h.f0((yVarW.s().a0() + iA) - 1, iA2, iA3);
                        if (hVarF0.b0(yVarW.s()) || yVarW != y.q(hVarF0)) {
                            throw new j$.time.c("year, month, and day not valid for Era");
                        }
                        return new x(yVarW, iA, hVarF0);
                    }
                    if (iA < 1) {
                        throw new j$.time.c("Invalid YearOfEra: " + iA);
                    }
                    int iA0 = (yVarW.s().a0() + iA) - 1;
                    try {
                        xVarA0 = new x(j$.time.h.f0(iA0, iA2, iA3));
                    } catch (j$.time.c unused) {
                        xVarA0 = new x(j$.time.h.f0(iA0, iA2, 1)).a0(new j$.time.temporal.p(0));
                    }
                    if (xVarA0.S() == yVarW || xVarA0.i(j$.time.temporal.a.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return xVarA0;
                    }
                    throw new j$.time.c("Invalid YearOfEra for Era: " + yVarW + " " + iA);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (yVar == j$.time.format.y.LENIENT) {
                    return new x(j$.time.h.i0((yVarW.s().a0() + iA) - 1, 1)).V(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), j$.time.temporal.b.DAYS);
                }
                int iA4 = T(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                j$.time.h hVar2 = x.f7041d;
                j$.time.h hVarI0 = iA == 1 ? j$.time.h.i0(yVarW.s().a0(), (yVarW.s().Y() + iA4) - 1) : j$.time.h.i0((yVarW.s().a0() + iA) - 1, iA4);
                if (hVarI0.b0(yVarW.s()) || yVarW != y.q(hVarI0)) {
                    throw new j$.time.c("Invalid parameters");
                }
                return new x(yVarW, iA, hVarI0);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.l
    public final ChronoZonedDateTime x(Instant instant, ZoneId zoneId) {
        return k.I(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new E((byte) 1, this);
    }
}
