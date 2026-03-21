package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.format.y;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
abstract class h implements r {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f7164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ h[] f7165b;

    @Override // j$.time.temporal.r
    public final boolean S() {
        return true;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f7165b.clone();
    }

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.r
            public final w B() {
                return w.k(90L, 92L);
            }

            @Override // j$.time.temporal.r
            public final boolean V(TemporalAccessor temporalAccessor) {
                return temporalAccessor.f(a.DAY_OF_YEAR) && temporalAccessor.f(a.MONTH_OF_YEAR) && temporalAccessor.f(a.YEAR) && j.a(temporalAccessor);
            }

            @Override // j$.time.temporal.r
            public final w I(TemporalAccessor temporalAccessor) {
                if (!V(temporalAccessor)) {
                    throw new v("Unsupported field: DayOfQuarter");
                }
                long jG = temporalAccessor.g(h.QUARTER_OF_YEAR);
                if (jG == 1) {
                    long jG2 = temporalAccessor.g(a.YEAR);
                    j$.time.chrono.s.f7036d.getClass();
                    return j$.time.chrono.s.Y(jG2) ? w.j(1L, 91L) : w.j(1L, 90L);
                }
                if (jG == 2) {
                    return w.j(1L, 91L);
                }
                if (jG == 3 || jG == 4) {
                    return w.j(1L, 92L);
                }
                return B();
            }

            @Override // j$.time.temporal.r
            public final long r(TemporalAccessor temporalAccessor) {
                if (!V(temporalAccessor)) {
                    throw new v("Unsupported field: DayOfQuarter");
                }
                int i = temporalAccessor.i(a.DAY_OF_YEAR);
                int i5 = temporalAccessor.i(a.MONTH_OF_YEAR);
                long jG = temporalAccessor.g(a.YEAR);
                int[] iArr = h.f7164a;
                int i6 = (i5 - 1) / 3;
                j$.time.chrono.s.f7036d.getClass();
                return i - iArr[i6 + (j$.time.chrono.s.Y(jG) ? 4 : 0)];
            }

            @Override // j$.time.temporal.r
            public final m p(m mVar, long j5) {
                long jR = r(mVar);
                B().b(j5, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.b((j5 - jR) + mVar.g(aVar), aVar);
            }

            @Override // j$.time.temporal.r
            public final TemporalAccessor R(HashMap map, TemporalAccessor temporalAccessor, y yVar) {
                long jSubtractExact;
                j$.time.h hVarL0;
                a aVar = a.YEAR;
                Long l3 = (Long) map.get(aVar);
                r rVar = h.QUARTER_OF_YEAR;
                Long l4 = (Long) map.get(rVar);
                if (l3 == null || l4 == null) {
                    return null;
                }
                int iY = aVar.Y(l3.longValue());
                long jLongValue = ((Long) map.get(h.DAY_OF_QUARTER)).longValue();
                if (!j.a(temporalAccessor)) {
                    throw new j$.time.c("Resolve requires IsoChronology");
                }
                if (yVar == y.LENIENT) {
                    hVarL0 = j$.time.h.f0(iY, 1, 1).l0(Math.multiplyExact(Math.subtractExact(l4.longValue(), 1L), 3));
                    jSubtractExact = Math.subtractExact(jLongValue, 1L);
                } else {
                    j$.time.h hVarF0 = j$.time.h.f0(iY, ((rVar.B().a(l4.longValue(), rVar) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (yVar == y.STRICT) {
                            I(hVarF0).b(jLongValue, this);
                        } else {
                            B().b(jLongValue, this);
                        }
                    }
                    jSubtractExact = jLongValue - 1;
                    hVarL0 = hVarF0;
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(rVar);
                return hVarL0.k0(jSubtractExact);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.r
            public final w B() {
                return w.j(1L, 4L);
            }

            @Override // j$.time.temporal.r
            public final boolean V(TemporalAccessor temporalAccessor) {
                return temporalAccessor.f(a.MONTH_OF_YEAR) && j.a(temporalAccessor);
            }

            @Override // j$.time.temporal.r
            public final long r(TemporalAccessor temporalAccessor) {
                if (!V(temporalAccessor)) {
                    throw new v("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.g(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.r
            public final w I(TemporalAccessor temporalAccessor) {
                if (!V(temporalAccessor)) {
                    throw new v("Unsupported field: QuarterOfYear");
                }
                return B();
            }

            @Override // j$.time.temporal.r
            public final m p(m mVar, long j5) {
                long jR = r(mVar);
                B().b(j5, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.b(((j5 - jR) * 3) + mVar.g(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.r
            public final w B() {
                return w.k(52L, 53L);
            }

            @Override // j$.time.temporal.r
            public final boolean V(TemporalAccessor temporalAccessor) {
                return temporalAccessor.f(a.EPOCH_DAY) && j.a(temporalAccessor);
            }

            @Override // j$.time.temporal.r
            public final w I(TemporalAccessor temporalAccessor) {
                if (!V(temporalAccessor)) {
                    throw new v("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.c0(j$.time.h.I(temporalAccessor));
            }

            @Override // j$.time.temporal.r
            public final long r(TemporalAccessor temporalAccessor) {
                if (!V(temporalAccessor)) {
                    throw new v("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.Z(j$.time.h.I(temporalAccessor));
            }

            @Override // j$.time.temporal.r
            public final m p(m mVar, long j5) {
                B().b(j5, this);
                return mVar.d(Math.subtractExact(j5, r(mVar)), b.WEEKS);
            }

            @Override // j$.time.temporal.r
            public final TemporalAccessor R(HashMap map, TemporalAccessor temporalAccessor, y yVar) {
                j$.time.h hVarB;
                long j5;
                long j6;
                r rVar = h.WEEK_BASED_YEAR;
                Long l3 = (Long) map.get(rVar);
                a aVar = a.DAY_OF_WEEK;
                Long l4 = (Long) map.get(aVar);
                if (l3 == null || l4 == null) {
                    return null;
                }
                int iA = rVar.B().a(l3.longValue(), rVar);
                long jLongValue = ((Long) map.get(h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                if (j.a(temporalAccessor)) {
                    j$.time.h hVarF0 = j$.time.h.f0(iA, 1, 4);
                    if (yVar == y.LENIENT) {
                        long jLongValue2 = l4.longValue();
                        if (jLongValue2 > 7) {
                            long j7 = jLongValue2 - 1;
                            hVarF0 = hVarF0.m0(j7 / 7);
                            j6 = j7 % 7;
                        } else {
                            j5 = 1;
                            if (jLongValue2 < 1) {
                                hVarF0 = hVarF0.m0(Math.subtractExact(jLongValue2, 7L) / 7);
                                j6 = (jLongValue2 + 6) % 7;
                            }
                            hVarB = hVarF0.m0(Math.subtractExact(jLongValue, j5)).b(jLongValue2, aVar);
                        }
                        j5 = 1;
                        jLongValue2 = j6 + 1;
                        hVarB = hVarF0.m0(Math.subtractExact(jLongValue, j5)).b(jLongValue2, aVar);
                    } else {
                        int iY = aVar.Y(l4.longValue());
                        if (jLongValue < 1 || jLongValue > 52) {
                            if (yVar == y.STRICT) {
                                h.c0(hVarF0).b(jLongValue, this);
                            } else {
                                B().b(jLongValue, this);
                            }
                        }
                        hVarB = hVarF0.m0(jLongValue - 1).b(iY, aVar);
                    }
                    map.remove(this);
                    map.remove(rVar);
                    map.remove(aVar);
                    return hVarB;
                }
                throw new j$.time.c("Resolve requires IsoChronology");
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.r
            public final w B() {
                return a.YEAR.B();
            }

            @Override // j$.time.temporal.r
            public final boolean V(TemporalAccessor temporalAccessor) {
                return temporalAccessor.f(a.EPOCH_DAY) && j.a(temporalAccessor);
            }

            @Override // j$.time.temporal.r
            public final long r(TemporalAccessor temporalAccessor) {
                if (!V(temporalAccessor)) {
                    throw new v("Unsupported field: WeekBasedYear");
                }
                return h.d0(j$.time.h.I(temporalAccessor));
            }

            @Override // j$.time.temporal.r
            public final w I(TemporalAccessor temporalAccessor) {
                if (!V(temporalAccessor)) {
                    throw new v("Unsupported field: WeekBasedYear");
                }
                return B();
            }

            @Override // j$.time.temporal.r
            public final m p(m mVar, long j5) {
                if (!V(mVar)) {
                    throw new v("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.B().a(j5, h.WEEK_BASED_YEAR);
                j$.time.h hVarI = j$.time.h.I(mVar);
                int i = hVarI.i(a.DAY_OF_WEEK);
                int iZ = h.Z(hVarI);
                if (iZ == 53 && h.e0(iA) == 52) {
                    iZ = 52;
                }
                return mVar.m(j$.time.h.f0(iA, 1, 4).k0(((iZ - 1) * 7) + (i - r6.i(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        f7165b = new h[]{hVar, hVar2, hVar3, hVar4};
        f7164a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    static w c0(j$.time.h hVar) {
        return w.j(1L, e0(d0(hVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int e0(int i) {
        j$.time.h hVarF0 = j$.time.h.f0(i, 1, 1);
        if (hVarF0.V() != DayOfWeek.THURSDAY) {
            return (hVarF0.V() == DayOfWeek.WEDNESDAY && hVarF0.c0()) ? 53 : 52;
        }
        return 53;
    }

    static int Z(j$.time.h hVar) {
        int iOrdinal = hVar.V().ordinal();
        int i = 1;
        int iY = hVar.Y() - 1;
        int i5 = (3 - iOrdinal) + iY;
        int i6 = i5 - ((i5 / 7) * 7);
        int i7 = i6 - 3;
        if (i7 < -3) {
            i7 = i6 + 4;
        }
        if (iY < i7) {
            return (int) w.j(1L, e0(d0(hVar.r0(180).n0(-1L)))).d();
        }
        int i8 = ((iY - i7) / 7) + 1;
        if (i8 != 53 || i7 == -3 || (i7 == -2 && hVar.c0())) {
            i = i8;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d0(j$.time.h hVar) {
        int iA0 = hVar.a0();
        int iY = hVar.Y();
        if (iY <= 3) {
            return iY - hVar.V().ordinal() < -2 ? iA0 - 1 : iA0;
        }
        if (iY >= 363) {
            return ((iY - 363) - (hVar.c0() ? 1 : 0)) - hVar.V().ordinal() >= 0 ? iA0 + 1 : iA0;
        }
        return iA0;
    }
}
