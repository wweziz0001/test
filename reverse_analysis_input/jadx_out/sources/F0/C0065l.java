package F0;

/* JADX INFO: renamed from: F0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0065l implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f795g;

    public C0065l(long j5, long j6, int i, int i5, boolean z4) {
        this.f789a = j5;
        this.f790b = j6;
        this.f791c = i5 == -1 ? 1 : i5;
        this.f793e = i;
        this.f795g = z4;
        if (j5 == -1) {
            this.f792d = -1L;
            this.f794f = -9223372036854775807L;
        } else {
            long j7 = j5 - j6;
            this.f792d = j7;
            this.f794f = (Math.max(0L, j7) * 8000000) / ((long) i);
        }
    }

    @Override // F0.E
    public final boolean c() {
        return this.f792d != -1 || this.f795g;
    }

    @Override // F0.E
    public final D g(long j5) {
        long j6 = this.f792d;
        long j7 = this.f790b;
        if (j6 == -1 && !this.f795g) {
            F f2 = new F(0L, j7);
            return new D(f2, f2);
        }
        int i = this.f793e;
        long j8 = this.f791c;
        long jMin = (((((long) i) * j5) / 8000000) / j8) * j8;
        if (j6 != -1) {
            jMin = Math.min(jMin, j6 - j8);
        }
        long jMax = Math.max(jMin, 0L) + j7;
        long jMax2 = (Math.max(0L, jMax - j7) * 8000000) / ((long) i);
        F f5 = new F(jMax2, jMax);
        if (j6 != -1 && jMax2 < j5) {
            long j9 = jMax + j8;
            if (j9 < this.f789a) {
                return new D(f5, new F((Math.max(0L, j9 - j7) * 8000000) / ((long) i), j9));
            }
        }
        return new D(f5, f5);
    }

    @Override // F0.E
    public final long i() {
        return this.f794f;
    }
}
