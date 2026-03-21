package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class I extends AbstractC0511d {
    private static final long serialVersionUID = -8722293800195731463L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient j$.time.h f6999a;

    I(j$.time.h hVar) {
        Objects.requireNonNull(hVar, "isoDate");
        this.f6999a = hVar;
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public final l h() {
        return G.f6997d;
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b
    public final int hashCode() {
        G.f6997d.getClass();
        return this.f6999a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public final m t() {
        return S() >= 1 ? J.BE : J.BEFORE_BE;
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
        int i = H.f6998a[aVar.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.f6999a.l(rVar);
        }
        if (i != 4) {
            return G.f6997d.T(aVar);
        }
        j$.time.temporal.w wVarB = j$.time.temporal.a.YEAR.B();
        return j$.time.temporal.w.j(1L, S() <= 0 ? (-(wVarB.e() + 543)) + 1 : 543 + wVarB.d());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = H.f6998a[((j$.time.temporal.a) rVar).ordinal()];
            if (i == 4) {
                int iS = S();
                if (iS < 1) {
                    iS = 1 - iS;
                }
                return iS;
            }
            j$.time.h hVar = this.f6999a;
            if (i == 5) {
                return ((((long) S()) * 12) + ((long) hVar.Z())) - 1;
            }
            if (i == 6) {
                return S();
            }
            if (i != 7) {
                return hVar.g(rVar);
            }
            return S() < 1 ? 0 : 1;
        }
        return rVar.r(this);
    }

    private int S() {
        return this.f6999a.a0() + 543;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    @Override // j$.time.chrono.AbstractC0511d, j$.time.temporal.m
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.chrono.I b(long r9, j$.time.temporal.r r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L99
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.g(r0)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.H.f6998a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.h r3 = r8.f6999a
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L4b
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L4b
            goto L61
        L27:
            j$.time.chrono.G r11 = j$.time.chrono.G.f6997d
            j$.time.temporal.w r11 = r11.T(r0)
            r11.b(r9, r0)
            int r11 = r8.S()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            int r11 = r3.Z()
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.h r9 = r3.l0(r9)
            j$.time.chrono.I r9 = r8.Y(r9)
            return r9
        L4b:
            j$.time.chrono.G r2 = j$.time.chrono.G.f6997d
            j$.time.temporal.w r2 = r2.T(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L84
            if (r0 == r5) goto L79
            if (r0 == r4) goto L6a
        L61:
            j$.time.h r9 = r3.b(r9, r11)
            j$.time.chrono.I r9 = r8.Y(r9)
            return r9
        L6a:
            int r9 = r8.S()
            int r9 = (-542) - r9
            j$.time.h r9 = r3.s0(r9)
            j$.time.chrono.I r9 = r8.Y(r9)
            return r9
        L79:
            int r2 = r2 + (-543)
            j$.time.h r9 = r3.s0(r2)
            j$.time.chrono.I r9 = r8.Y(r9)
            return r9
        L84:
            int r9 = r8.S()
            r10 = 1
            if (r9 < r10) goto L8c
            goto L8e
        L8c:
            int r2 = 1 - r2
        L8e:
            int r2 = r2 + (-543)
            j$.time.h r9 = r3.s0(r2)
            j$.time.chrono.I r9 = r8.Y(r9)
            return r9
        L99:
            j$.time.chrono.b r9 = super.b(r9, r11)
            j$.time.chrono.I r9 = (j$.time.chrono.I) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.I.b(long, j$.time.temporal.r):j$.time.chrono.I");
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m m(j$.time.h hVar) {
        return (I) super.m(hVar);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b
    public final InterfaceC0509b m(j$.time.temporal.n nVar) {
        return (I) super.m(nVar);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b
    public final InterfaceC0509b L(j$.time.temporal.q qVar) {
        return (I) super.L(qVar);
    }

    @Override // j$.time.chrono.AbstractC0511d
    final InterfaceC0509b R(long j5) {
        return Y(this.f6999a.n0(j5));
    }

    @Override // j$.time.chrono.AbstractC0511d
    final InterfaceC0509b I(long j5) {
        return Y(this.f6999a.l0(j5));
    }

    @Override // j$.time.chrono.AbstractC0511d
    final InterfaceC0509b B(long j5) {
        return Y(this.f6999a.k0(j5));
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b, j$.time.temporal.m
    public final InterfaceC0509b d(long j5, j$.time.temporal.u uVar) {
        return (I) super.d(j5, uVar);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.temporal.m
    public final j$.time.temporal.m d(long j5, j$.time.temporal.u uVar) {
        return (I) super.d(j5, uVar);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b, j$.time.temporal.m
    public final InterfaceC0509b e(long j5, j$.time.temporal.u uVar) {
        return (I) super.e(j5, uVar);
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b, j$.time.temporal.m
    public final j$.time.temporal.m e(long j5, j$.time.temporal.u uVar) {
        return (I) super.e(j5, uVar);
    }

    private I Y(j$.time.h hVar) {
        return hVar.equals(this.f6999a) ? this : new I(hVar);
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public final long u() {
        return this.f6999a.u();
    }

    @Override // j$.time.chrono.AbstractC0511d, j$.time.chrono.InterfaceC0509b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I) {
            return this.f6999a.equals(((I) obj).f6999a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new E((byte) 8, this);
    }

    @Override // j$.time.chrono.InterfaceC0509b
    public final InterfaceC0512e J(j$.time.l lVar) {
        return C0514g.B(this, lVar);
    }
}
