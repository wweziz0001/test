package o0;

import a0.C0186l;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements Comparable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f8999l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f9000m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f9001n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f9002o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f9003p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0186l f9004q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f9005r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f9006s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f9007t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f9008u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f9009v;

    public g(String str, f fVar, long j5, int i, long j6, C0186l c0186l, String str2, String str3, long j7, long j8, boolean z4) {
        this.f8999l = str;
        this.f9000m = fVar;
        this.f9001n = j5;
        this.f9002o = i;
        this.f9003p = j6;
        this.f9004q = c0186l;
        this.f9005r = str2;
        this.f9006s = str3;
        this.f9007t = j7;
        this.f9008u = j8;
        this.f9009v = z4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l3 = (Long) obj;
        long jLongValue = l3.longValue();
        long j5 = this.f9003p;
        if (j5 > jLongValue) {
            return 1;
        }
        return j5 < l3.longValue() ? -1 : 0;
    }
}
