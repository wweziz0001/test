package l0;

import a0.C0190p;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import o2.AbstractC0718a;

/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Z1.s f7880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Z1.s f7881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f7882l;

    public p(j jVar, long j5, long j6, long j7, long j8, long j9, List list, long j10, Z1.s sVar, Z1.s sVar2, long j11, long j12) {
        super(jVar, j5, j6, j7, j9, list, j10, j11, j12);
        this.f7880j = sVar;
        this.f7881k = sVar2;
        this.f7882l = j8;
    }

    @Override // l0.s
    public final j a(m mVar) {
        Z1.s sVar = this.f7880j;
        if (sVar == null) {
            return this.f7887a;
        }
        C0190p c0190p = mVar.f7869l;
        return new j(0L, -1L, sVar.w(c0190p.f3412a, 0L, c0190p.f3420j, 0L));
    }

    @Override // l0.n
    public final long d(long j5) {
        if (this.f7876f != null) {
            return r0.size();
        }
        long j6 = this.f7882l;
        if (j6 != -1) {
            return (j6 - this.f7874d) + 1;
        }
        if (j5 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j5).multiply(BigInteger.valueOf(this.f7888b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f7875e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = AbstractC0718a.f9115a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // l0.n
    public final j h(k kVar, long j5) {
        long j6 = this.f7874d;
        List list = this.f7876f;
        long j7 = list != null ? ((q) list.get((int) (j5 - j6))).f7883a : (j5 - j6) * this.f7875e;
        C0190p c0190p = kVar.f7869l;
        return new j(0L, -1L, this.f7881k.w(c0190p.f3412a, j5, c0190p.f3420j, j7));
    }
}
