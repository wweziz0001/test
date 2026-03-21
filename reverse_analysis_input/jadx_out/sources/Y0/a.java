package Y0;

import F0.C0065l;

/* JADX INFO: loaded from: classes.dex */
public final class a extends C0065l implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f2681h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2683k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f2684l;

    public a(long j5, long j6, int i, int i5, boolean z4) {
        super(j5, j6, i, i5, z4);
        this.f2681h = j6;
        this.i = i;
        this.f2682j = i5;
        this.f2683k = z4;
        this.f2684l = j5 == -1 ? -1L : j5;
    }

    @Override // Y0.f
    public final long a(long j5) {
        return (Math.max(0L, j5 - this.f790b) * 8000000) / ((long) this.f793e);
    }

    @Override // Y0.f
    public final long f() {
        return this.f2684l;
    }

    @Override // Y0.f
    public final int h() {
        return this.i;
    }
}
