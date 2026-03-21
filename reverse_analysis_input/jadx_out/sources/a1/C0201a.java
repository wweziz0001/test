package a1;

import F0.D;
import F0.E;
import F0.F;
import d0.AbstractC0370w;
import java.math.BigInteger;

/* JADX INFO: renamed from: a1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0201a implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0202b f3470a;

    public C0201a(C0202b c0202b) {
        this.f3470a = c0202b;
    }

    @Override // F0.E
    public final boolean c() {
        return true;
    }

    @Override // F0.E
    public final D g(long j5) {
        C0202b c0202b = this.f3470a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((((long) c0202b.f3474o.i) * j5) / 1000000);
        long j6 = c0202b.f3473n;
        long j7 = c0202b.f3472m;
        F f2 = new F(j5, AbstractC0370w.j((bigIntegerValueOf.multiply(BigInteger.valueOf(j6 - j7)).divide(BigInteger.valueOf(c0202b.f3476q)).longValue() + j7) - 30000, c0202b.f3472m, j6 - 1));
        return new D(f2, f2);
    }

    @Override // F0.E
    public final long i() {
        C0202b c0202b = this.f3470a;
        return (c0202b.f3476q * 1000000) / ((long) c0202b.f3474o.i);
    }
}
