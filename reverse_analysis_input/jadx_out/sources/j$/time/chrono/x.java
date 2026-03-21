package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends AbstractC0511d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final j$.time.h f7041d = j$.time.h.f0(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient j$.time.h f7042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient y f7043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f7044c;

    @Override // j$.time.chrono.InterfaceC0509b
    public final m t() {
        return this.f7043b;
    }

    x(j$.time.h hVar) {
        if (hVar.b0(f7041d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        y yVarQ = y.q(hVar);
        this.f7043b = yVarQ;
        this.f7044c = (hVar.a0() - yVarQ.s().a0()) + 1;
        this.f7042a = hVar;
    }

    x(y yVar, int i, j$.time.h hVar) {
        if (hVar.b0(f7041d)) {
            throw new j$.time.c("JapaneseDate before Meiji 6 is not supported");
        }
        this.f7043b = yVar;
        this.f7044c = i;
        this.f7042a = hVar;
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public final l h() {
        return v.f7039d;
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b
    public final int hashCode() {
        v.f7039d.getClass();
        return this.f7042a.hashCode() ^ (-688086063);
    }

    public final y S() {
        return this.f7043b;
    }

    @Override // j$.time.chrono.InterfaceC0509b, j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || rVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || rVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).S();
        }
        return rVar != null && rVar.V(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.I(this);
        }
        if (!f(rVar)) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i = w.f7040a[aVar.ordinal()];
        j$.time.h hVar = this.f7042a;
        if (i == 1) {
            return j$.time.temporal.w.j(1L, hVar.d0());
        }
        y yVar = this.f7043b;
        if (i != 2) {
            if (i != 3) {
                return v.f7039d.T(aVar);
            }
            int iA0 = yVar.s().a0();
            return yVar.v() != null ? j$.time.temporal.w.j(1L, (r0.s().a0() - iA0) + 1) : j$.time.temporal.w.j(1L, 999999999 - iA0);
        }
        y yVarV = yVar.v();
        int iY = (yVarV == null || yVarV.s().a0() != hVar.a0()) ? hVar.c0() ? 366 : 365 : yVarV.s().Y() - 1;
        if (this.f7044c == 1) {
            iY -= yVar.s().Y() - 1;
        }
        return j$.time.temporal.w.j(1L, iY);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        int i = w.f7040a[((j$.time.temporal.a) rVar).ordinal()];
        int i5 = this.f7044c;
        y yVar = this.f7043b;
        j$.time.h hVar = this.f7042a;
        switch (i) {
            case 2:
                return i5 == 1 ? (hVar.Y() - yVar.s().Y()) + 1 : hVar.Y();
            case 3:
                return i5;
            case 4:
            case 5:
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return yVar.p();
            default:
                return hVar.g(rVar);
        }
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.temporal.m
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final x b(long j5, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            if (g(aVar) == j5) {
                return this;
            }
            int[] iArr = w.f7040a;
            int i = iArr[aVar.ordinal()];
            j$.time.h hVar = this.f7042a;
            if (i == 3 || i == 8 || i == 9) {
                v vVar = v.f7039d;
                int iA = vVar.T(aVar).a(j5, aVar);
                int i5 = iArr[aVar.ordinal()];
                if (i5 == 3) {
                    return Z(hVar.s0(vVar.v(this.f7043b, iA)));
                }
                if (i5 == 8) {
                    return Z(hVar.s0(vVar.v(y.w(iA), this.f7044c)));
                }
                if (i5 == 9) {
                    return Z(hVar.s0(iA));
                }
            }
            return Z(hVar.b(j5, rVar));
        }
        return (x) super.b(j5, rVar);
    }

    public final x a0(j$.time.temporal.p pVar) {
        return (x) super.m(pVar);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return (x) super.m(hVar);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b
    public final InterfaceC0509b m(j$.time.temporal.n nVar) {
        return (x) super.m(nVar);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b
    public final InterfaceC0509b L(j$.time.temporal.q qVar) {
        return (x) super.L(qVar);
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public final InterfaceC0512e J(j$.time.l lVar) {
        return C0514g.B(this, lVar);
    }

    @Override // j$.time.chrono.AbstractC0511d
    final InterfaceC0509b R(long j5) {
        return Z(this.f7042a.n0(j5));
    }

    @Override // j$.time.chrono.AbstractC0511d
    final InterfaceC0509b I(long j5) {
        return Z(this.f7042a.l0(j5));
    }

    @Override // j$.time.chrono.AbstractC0511d
    final InterfaceC0509b B(long j5) {
        return Z(this.f7042a.k0(j5));
    }

    public final x V(long j5, j$.time.temporal.b bVar) {
        return (x) super.d(j5, (j$.time.temporal.u) bVar);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b, j$.time.temporal.m
    public final InterfaceC0509b d(long j5, j$.time.temporal.u uVar) {
        return (x) super.d(j5, uVar);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j5, j$.time.temporal.u uVar) {
        return (x) super.d(j5, uVar);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b, j$.time.temporal.m
    public final InterfaceC0509b e(long j5, j$.time.temporal.u uVar) {
        return (x) super.e(j5, uVar);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b, j$.time.temporal.m
    public final j$.time.temporal.m e(long j5, j$.time.temporal.u uVar) {
        return (x) super.e(j5, uVar);
    }

    private x Z(j$.time.h hVar) {
        return hVar.equals(this.f7042a) ? this : new x(hVar);
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public final long u() {
        return this.f7042a.u();
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return this.f7042a.equals(((x) obj).f7042a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 4, this);
    }
}
