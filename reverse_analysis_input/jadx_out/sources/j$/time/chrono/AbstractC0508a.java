package j$.time.chrono;

import j$.time.DayOfWeek;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0508a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap f7001a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f7002b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f7003c = 0;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getId().compareTo(((l) obj).getId());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    static l B(AbstractC0508a abstractC0508a, String str) {
        String strQ;
        l lVar = (l) f7001a.putIfAbsent(str, abstractC0508a);
        if (lVar == null && (strQ = abstractC0508a.Q()) != null) {
            f7002b.putIfAbsent(strQ, abstractC0508a);
        }
        return lVar;
    }

    static l r(String str) {
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = f7001a;
            l lVar = (l) concurrentHashMap.get(str);
            if (lVar == null) {
                lVar = (l) f7002b.get(str);
            }
            if (lVar != null) {
                return lVar;
            }
            if (concurrentHashMap.get("ISO") != null) {
                for (l lVar2 : ServiceLoader.load(l.class)) {
                    if (str.equals(lVar2.getId()) || str.equals(lVar2.Q())) {
                        return lVar2;
                    }
                }
                throw new j$.time.c("Unknown chronology: ".concat(str));
            }
            o oVar = o.f7019o;
            B(oVar, oVar.getId());
            v vVar = v.f7039d;
            B(vVar, vVar.getId());
            A a5 = A.f6990d;
            B(a5, a5.getId());
            G g5 = G.f6997d;
            B(g5, g5.getId());
            for (AbstractC0508a abstractC0508a : ServiceLoader.load(AbstractC0508a.class, null)) {
                if (!abstractC0508a.getId().equals("ISO")) {
                    B(abstractC0508a, abstractC0508a.getId());
                }
            }
            s sVar = s.f7036d;
            B(sVar, sVar.getId());
        }
    }

    protected AbstractC0508a() {
    }

    @Override // j$.time.chrono.l
    public InterfaceC0509b O(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return q(((Long) map.remove(aVar)).longValue());
        }
        R(map, yVar);
        InterfaceC0509b interfaceC0509bV = V(map, yVar);
        if (interfaceC0509bV != null) {
            return interfaceC0509bV;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (map.containsKey(aVar3)) {
            if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return S(map, yVar);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(aVar5)) {
                    int iA = T(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (yVar == j$.time.format.y.LENIENT) {
                        long jSubtractExact = Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L);
                        return F(iA, 1, 1).d(jSubtractExact, (j$.time.temporal.u) j$.time.temporal.b.MONTHS).d(Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.WEEKS).d(Math.subtractExact(((Long) map.remove(aVar5)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
                    }
                    int iA2 = T(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int iA3 = T(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    InterfaceC0509b interfaceC0509bD = F(iA, iA2, 1).d((T(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((iA3 - 1) * 7), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
                    if (yVar != j$.time.format.y.STRICT || interfaceC0509bD.i(aVar3) == iA2) {
                        return interfaceC0509bD;
                    }
                    throw new j$.time.c("Strict mode rejected resolved date as it is in a different month");
                }
                j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar6)) {
                    int iA4 = T(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (yVar == j$.time.format.y.LENIENT) {
                        return I(F(iA4, 1, 1), Math.subtractExact(((Long) map.remove(aVar3)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar4)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar6)).longValue(), 1L));
                    }
                    int iA5 = T(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    InterfaceC0509b interfaceC0509bM = F(iA4, iA5, 1).d((T(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (j$.time.temporal.u) j$.time.temporal.b.DAYS).m(new j$.time.temporal.o(DayOfWeek.r(T(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).p(), 0));
                    if (yVar != j$.time.format.y.STRICT || interfaceC0509bM.i(aVar3) == iA5) {
                        return interfaceC0509bM;
                    }
                    throw new j$.time.c("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (map.containsKey(aVar7)) {
            int iA6 = T(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (yVar != j$.time.format.y.LENIENT) {
                return z(iA6, T(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
            }
            return z(iA6, 1).d(Math.subtractExact(((Long) map.remove(aVar7)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(aVar8)) {
            return null;
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(aVar9)) {
            int iA7 = T(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (yVar == j$.time.format.y.LENIENT) {
                return z(iA7, 1).d(Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.WEEKS).d(Math.subtractExact(((Long) map.remove(aVar9)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
            }
            int iA8 = T(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8);
            InterfaceC0509b interfaceC0509bD2 = z(iA7, 1).d((T(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((iA8 - 1) * 7), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
            if (yVar != j$.time.format.y.STRICT || interfaceC0509bD2.i(aVar2) == iA7) {
                return interfaceC0509bD2;
            }
            throw new j$.time.c("Strict mode rejected resolved date as it is in a different year");
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
        if (!map.containsKey(aVar10)) {
            return null;
        }
        int iA9 = T(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        if (yVar == j$.time.format.y.LENIENT) {
            return I(z(iA9, 1), 0L, Math.subtractExact(((Long) map.remove(aVar8)).longValue(), 1L), Math.subtractExact(((Long) map.remove(aVar10)).longValue(), 1L));
        }
        InterfaceC0509b interfaceC0509bM2 = z(iA9, 1).d((T(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (j$.time.temporal.u) j$.time.temporal.b.DAYS).m(new j$.time.temporal.o(DayOfWeek.r(T(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).p(), 0));
        if (yVar != j$.time.format.y.STRICT || interfaceC0509bM2.i(aVar2) == iA9) {
            return interfaceC0509bM2;
        }
        throw new j$.time.c("Strict mode rejected resolved date as it is in a different year");
    }

    void R(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l3 = (Long) map.remove(aVar);
        if (l3 != null) {
            if (yVar != j$.time.format.y.LENIENT) {
                aVar.Z(l3.longValue());
            }
            InterfaceC0509b interfaceC0509bB = K().b(1L, (j$.time.temporal.r) j$.time.temporal.a.DAY_OF_MONTH).b(l3.longValue(), (j$.time.temporal.r) aVar);
            p(map, j$.time.temporal.a.MONTH_OF_YEAR, interfaceC0509bB.i(r0));
            p(map, j$.time.temporal.a.YEAR, interfaceC0509bB.i(r0));
        }
    }

    InterfaceC0509b V(Map map, j$.time.format.y yVar) {
        int intExact;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l3 = (Long) map.remove(aVar);
        if (l3 != null) {
            Long l4 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (yVar != j$.time.format.y.LENIENT) {
                intExact = T(aVar).a(l3.longValue(), aVar);
            } else {
                intExact = Math.toIntExact(l3.longValue());
            }
            if (l4 != null) {
                p(map, j$.time.temporal.a.YEAR, v(M(T(r2).a(l4.longValue(), r2)), intExact));
                return null;
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
            if (map.containsKey(aVar2)) {
                p(map, aVar2, v(z(T(aVar2).a(((Long) map.get(aVar2)).longValue(), aVar2), 1).t(), intExact));
                return null;
            }
            if (yVar == j$.time.format.y.STRICT) {
                map.put(aVar, l3);
                return null;
            }
            if (C().isEmpty()) {
                p(map, aVar2, intExact);
                return null;
            }
            p(map, aVar2, v((m) r9.get(r9.size() - 1), intExact));
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar3)) {
            return null;
        }
        T(aVar3).b(((Long) map.get(aVar3)).longValue(), aVar3);
        return null;
    }

    InterfaceC0509b S(Map map, j$.time.format.y yVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = T(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (yVar == j$.time.format.y.LENIENT) {
            long jSubtractExact = Math.subtractExact(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return F(iA, 1, 1).d(jSubtractExact, (j$.time.temporal.u) j$.time.temporal.b.MONTHS).d(Math.subtractExact(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.u) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = T(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = T(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (yVar != j$.time.format.y.SMART) {
            return F(iA, iA2, iA3);
        }
        try {
            return F(iA, iA2, iA3);
        } catch (j$.time.c unused) {
            return F(iA, iA2, 1).m(new j$.time.temporal.p(0));
        }
    }

    static InterfaceC0509b I(InterfaceC0509b interfaceC0509b, long j5, long j6, long j7) {
        long j8;
        InterfaceC0509b interfaceC0509bD = interfaceC0509b.d(j5, (j$.time.temporal.u) j$.time.temporal.b.MONTHS);
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        InterfaceC0509b interfaceC0509bD2 = interfaceC0509bD.d(j6, (j$.time.temporal.u) bVar);
        if (j7 > 7) {
            long j9 = j7 - 1;
            interfaceC0509bD2 = interfaceC0509bD2.d(j9 / 7, (j$.time.temporal.u) bVar);
            j8 = j9 % 7;
        } else {
            if (j7 < 1) {
                interfaceC0509bD2 = interfaceC0509bD2.d(Math.subtractExact(j7, 7L) / 7, (j$.time.temporal.u) bVar);
                j8 = (j7 + 6) % 7;
            }
            return interfaceC0509bD2.m(new j$.time.temporal.o(DayOfWeek.r((int) j7).p(), 0));
        }
        j7 = j8 + 1;
        return interfaceC0509bD2.m(new j$.time.temporal.o(DayOfWeek.r((int) j7).p(), 0));
    }

    static void p(Map map, j$.time.temporal.a aVar, long j5) {
        Long l3 = (Long) map.get(aVar);
        if (l3 != null && l3.longValue() != j5) {
            throw new j$.time.c("Conflict found: " + aVar + " " + l3 + " differs from " + aVar + " " + j5);
        }
        map.put(aVar, Long.valueOf(j5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC0508a) && getId().compareTo(((AbstractC0508a) obj).getId()) == 0;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    public final String toString() {
        return getId();
    }
}
