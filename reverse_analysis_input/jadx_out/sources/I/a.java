package I;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f989h;
    public int i;

    public final float a(long j5) {
        if (j5 < this.f986e) {
            return 0.0f;
        }
        long j6 = this.f988g;
        if (j6 < 0 || j5 < j6) {
            return e.b((j5 - r0) / this.f982a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f989h;
        return (e.b((j5 - j6) / this.i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
