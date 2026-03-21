package j$.time;

import j$.time.chrono.AbstractC0508a;
import j$.time.temporal.TemporalAccessor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements TemporalAccessor, j$.time.temporal.n {
    public static final n APRIL;
    public static final n AUGUST;
    public static final n DECEMBER;
    public static final n FEBRUARY;
    public static final n JANUARY;
    public static final n JULY;
    public static final n JUNE;
    public static final n MARCH;
    public static final n MAY;
    public static final n NOVEMBER;
    public static final n OCTOBER;
    public static final n SEPTEMBER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n[] f7144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ n[] f7145b;

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f7145b.clone();
    }

    static {
        n nVar = new n("JANUARY", 0);
        JANUARY = nVar;
        n nVar2 = new n("FEBRUARY", 1);
        FEBRUARY = nVar2;
        n nVar3 = new n("MARCH", 2);
        MARCH = nVar3;
        n nVar4 = new n("APRIL", 3);
        APRIL = nVar4;
        n nVar5 = new n("MAY", 4);
        MAY = nVar5;
        n nVar6 = new n("JUNE", 5);
        JUNE = nVar6;
        n nVar7 = new n("JULY", 6);
        JULY = nVar7;
        n nVar8 = new n("AUGUST", 7);
        AUGUST = nVar8;
        n nVar9 = new n("SEPTEMBER", 8);
        SEPTEMBER = nVar9;
        n nVar10 = new n("OCTOBER", 9);
        OCTOBER = nVar10;
        n nVar11 = new n("NOVEMBER", 10);
        NOVEMBER = nVar11;
        n nVar12 = new n("DECEMBER", 11);
        DECEMBER = nVar12;
        f7145b = new n[]{nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11, nVar12};
        f7144a = values();
    }

    public static n R(int i) {
        if (i < 1 || i > 12) {
            throw new c("Invalid value for MonthOfYear: " + i);
        }
        return f7144a[i - 1];
    }

    public final int p() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.MONTH_OF_YEAR : rVar != null && rVar.V(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return rVar.B();
        }
        return super.l(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return p();
        }
        return super.i(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return p();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return rVar.r(this);
    }

    public final n S() {
        return f7144a[((((int) 1) + 12) + ordinal()) % 12];
    }

    public final int B(boolean z4) {
        int i = m.f7143a[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z4 ? 29 : 28;
    }

    public final int I() {
        int i = m.f7143a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int r(boolean z4) {
        switch (m.f7143a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z4 ? 1 : 0) + 91;
            case 3:
                return (z4 ? 1 : 0) + 152;
            case 4:
                return (z4 ? 1 : 0) + 244;
            case 5:
                return (z4 ? 1 : 0) + 305;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return 1;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return (z4 ? 1 : 0) + 60;
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return (z4 ? 1 : 0) + 121;
            case 9:
                return (z4 ? 1 : 0) + 182;
            case 10:
                return (z4 ? 1 : 0) + 213;
            case 11:
                return (z4 ? 1 : 0) + 274;
            default:
                return (z4 ? 1 : 0) + 335;
        }
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
        return mVar.b(p(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
