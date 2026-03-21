package Y0;

import A.j;
import F0.B;
import F0.D;
import d0.AbstractC0370w;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f2687c;

    public b(long j5, long j6, long j7) {
        this.f2687c = new B(j5, new long[]{j6}, new long[]{0});
        this.f2685a = j7;
        int i = -2147483647;
        if (j5 == -9223372036854775807L) {
            this.f2686b = -2147483647;
            return;
        }
        long jU = AbstractC0370w.U(j6 - j7, 8L, j5, RoundingMode.HALF_UP);
        if (jU > 0 && jU <= 2147483647L) {
            i = (int) jU;
        }
        this.f2686b = i;
    }

    @Override // Y0.f
    public final long a(long j5) {
        B b4 = this.f2687c;
        j jVar = b4.f678b;
        if (jVar.f26l == 0) {
            return -9223372036854775807L;
        }
        return jVar.i(AbstractC0370w.b(b4.f677a, j5));
    }

    @Override // F0.E
    public final boolean c() {
        return this.f2687c.c();
    }

    @Override // Y0.f
    public final long f() {
        return this.f2685a;
    }

    @Override // F0.E
    public final D g(long j5) {
        return this.f2687c.g(j5);
    }

    @Override // Y0.f
    public final int h() {
        return this.f2686b;
    }

    @Override // F0.E
    public final long i() {
        return this.f2687c.f679c;
    }
}
