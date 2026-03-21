package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends AbstractC0511d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient o f7031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f7032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f7033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f7034d;

    @Override // j$.time.chrono.InterfaceC0509b
    public final l h() {
        return this.f7031a;
    }

    static q Y(o oVar, int i, int i5, int i6) {
        return new q(oVar, i, i5, i6);
    }

    static q Z(o oVar, long j5) {
        return new q(oVar, j5);
    }

    private q(o oVar, int i, int i5, int i6) {
        oVar.c0(i, i5, i6);
        this.f7031a = oVar;
        this.f7032b = i;
        this.f7033c = i5;
        this.f7034d = i6;
    }

    private q(o oVar, long j5) {
        int[] iArrD0 = oVar.d0((int) j5);
        this.f7031a = oVar;
        this.f7032b = iArrD0[0];
        this.f7033c = iArrD0[1];
        this.f7034d = iArrD0[2];
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public final m t() {
        return r.AH;
    }

    public final int V() {
        return this.f7031a.f0(this.f7032b);
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
        int i = p.f7030a[aVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? this.f7031a.T(aVar) : j$.time.temporal.w.j(1L, 5L) : j$.time.temporal.w.j(1L, V()) : j$.time.temporal.w.j(1L, r2.e0(this.f7032b, this.f7033c));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        int i = p.f7030a[((j$.time.temporal.a) rVar).ordinal()];
        int i5 = this.f7033c;
        int i6 = this.f7034d;
        int i7 = this.f7032b;
        switch (i) {
            case 1:
                return i6;
            case 2:
                return S();
            case 3:
                return ((i6 - 1) / 7) + 1;
            case 4:
                return ((int) Math.floorMod(u() + 3, 7)) + 1;
            case 5:
                return ((i6 - 1) % 7) + 1;
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((S() - 1) % 7) + 1;
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return u();
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return ((S() - 1) / 7) + 1;
            case 9:
                return i5;
            case 10:
                return ((((long) i7) * 12) + ((long) i5)) - 1;
            case 11:
                return i7;
            case 12:
                return i7;
            case 13:
                return i7 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.temporal.m
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final q b(long j5, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (q) super.b(j5, rVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        o oVar = this.f7031a;
        oVar.T(aVar).b(j5, aVar);
        int i = (int) j5;
        int i5 = p.f7030a[aVar.ordinal()];
        int i6 = this.f7034d;
        int i7 = this.f7033c;
        int i8 = this.f7032b;
        switch (i5) {
            case 1:
                return c0(i8, i7, i);
            case 2:
                return B(Math.min(i, V()) - S());
            case 3:
                return B((j5 - g(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return B(j5 - ((long) (((int) Math.floorMod(u() + 3, 7)) + 1)));
            case 5:
                return B(j5 - g(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case O.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return B(j5 - g(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case O.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new q(oVar, j5);
            case O.j.BYTES_FIELD_NUMBER /* 8 */:
                return B((j5 - g(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return c0(i8, i, i6);
            case 10:
                return I(j5 - (((((long) i8) * 12) + ((long) i7)) - 1));
            case 11:
                if (i8 < 1) {
                    i = 1 - i;
                }
                return c0(i, i7, i6);
            case 12:
                return c0(i, i7, i6);
            case 13:
                return c0(1 - i8, i7, i6);
            default:
                throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
    }

    private q c0(int i, int i5, int i6) {
        o oVar = this.f7031a;
        int iE0 = oVar.e0(i, i5);
        if (i6 > iE0) {
            i6 = iE0;
        }
        return new q(oVar, i, i5, i6);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return (q) super.m(hVar);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b
    public final InterfaceC0509b m(j$.time.temporal.n nVar) {
        return (q) super.m(nVar);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b
    public final InterfaceC0509b L(j$.time.temporal.q qVar) {
        return (q) super.L(qVar);
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public final long u() {
        return this.f7031a.c0(this.f7032b, this.f7033c, this.f7034d);
    }

    private int S() {
        return this.f7031a.b0(this.f7032b, this.f7033c) + this.f7034d;
    }

    @Override // j$.time.chrono.AbstractC0511d
    final InterfaceC0509b R(long j5) {
        return j5 == 0 ? this : c0(Math.addExact(this.f7032b, (int) j5), this.f7033c, this.f7034d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC0511d
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final q I(long j5) {
        if (j5 == 0) {
            return this;
        }
        long j6 = (((long) this.f7032b) * 12) + ((long) (this.f7033c - 1)) + j5;
        return c0(this.f7031a.Z(Math.floorDiv(j6, 12L)), ((int) Math.floorMod(j6, 12L)) + 1, this.f7034d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC0511d
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final q B(long j5) {
        return new q(this.f7031a, u() + j5);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b, j$.time.temporal.m
    public final InterfaceC0509b d(long j5, j$.time.temporal.u uVar) {
        return (q) super.d(j5, uVar);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j5, j$.time.temporal.u uVar) {
        return (q) super.d(j5, uVar);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b, j$.time.temporal.m
    public final InterfaceC0509b e(long j5, j$.time.temporal.u uVar) {
        return (q) super.e(j5, uVar);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b, j$.time.temporal.m
    public final j$.time.temporal.m e(long j5, j$.time.temporal.u uVar) {
        return (q) super.e(j5, uVar);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f7032b == qVar.f7032b && this.f7033c == qVar.f7033c && this.f7034d == qVar.f7034d && this.f7031a.equals(qVar.f7031a);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b
    public final int hashCode() {
        int iHashCode = this.f7031a.getId().hashCode();
        int i = this.f7032b;
        return (iHashCode ^ (i & (-2048))) ^ (((i << 11) + (this.f7033c << 6)) + this.f7034d);
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public final InterfaceC0512e J(j$.time.l lVar) {
        return C0514g.B(this, lVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 6, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.f7031a);
        objectOutput.writeInt(i(j$.time.temporal.a.YEAR));
        objectOutput.writeByte(i(j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(i(j$.time.temporal.a.DAY_OF_MONTH));
    }
}
