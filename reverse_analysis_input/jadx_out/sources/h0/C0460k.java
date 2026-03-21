package h0;

/* JADX INFO: renamed from: h0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0460k implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f6201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f6204g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f6210n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f6211o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f6205h = -9223372036854775807L;
    public long i = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f6207k = -9223372036854775807L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6208l = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f6212p = 1.0f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f6213q = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f6206j = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f6209m = -9223372036854775807L;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f6214r = -9223372036854775807L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f6215s = -9223372036854775807L;

    public C0460k(float f2, float f5, long j5, float f6, long j6, long j7, float f7) {
        this.f6198a = f2;
        this.f6199b = f5;
        this.f6200c = j5;
        this.f6201d = f6;
        this.f6202e = j6;
        this.f6203f = j7;
        this.f6204g = f7;
        this.f6211o = f2;
        this.f6210n = f5;
    }

    public final void a() {
        long j5;
        long j6 = this.f6205h;
        if (j6 != -9223372036854775807L) {
            j5 = this.i;
            if (j5 == -9223372036854775807L) {
                long j7 = this.f6207k;
                if (j7 != -9223372036854775807L && j6 < j7) {
                    j6 = j7;
                }
                j5 = this.f6208l;
                if (j5 == -9223372036854775807L || j6 <= j5) {
                    j5 = j6;
                }
            }
        } else {
            j5 = -9223372036854775807L;
        }
        if (this.f6206j == j5) {
            return;
        }
        this.f6206j = j5;
        this.f6209m = j5;
        this.f6214r = -9223372036854775807L;
        this.f6215s = -9223372036854775807L;
        this.f6213q = -9223372036854775807L;
    }
}
