package F0;

import d0.AbstractC0370w;

/* JADX INFO: renamed from: F0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0060g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f774d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f778h;

    public C0060g(long j5, long j6, long j7, long j8, long j9, long j10) {
        this.f771a = j5;
        this.f772b = j6;
        this.f775e = j7;
        this.f776f = j8;
        this.f777g = j9;
        this.f773c = j10;
        this.f778h = a(j6, 0L, j7, j8, j9, j10);
    }

    public static long a(long j5, long j6, long j7, long j8, long j9, long j10) {
        if (j8 + 1 >= j9 || j6 + 1 >= j7) {
            return j8;
        }
        long j11 = (long) ((j5 - j6) * ((j9 - j8) / (j7 - j6)));
        return AbstractC0370w.j(((j11 + j8) - j10) - (j11 / 20), j8, j9 - 1);
    }
}
