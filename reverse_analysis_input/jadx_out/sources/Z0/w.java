package Z0;

import d0.AbstractC0360m;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f2983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f2985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f2986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f2988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f2989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f2990h;

    public w(t tVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j5) {
        AbstractC0360m.c(iArr.length == jArr2.length);
        AbstractC0360m.c(jArr.length == jArr2.length);
        AbstractC0360m.c(iArr2.length == jArr2.length);
        this.f2983a = tVar;
        this.f2985c = jArr;
        this.f2986d = iArr;
        this.f2987e = i;
        this.f2988f = jArr2;
        this.f2989g = iArr2;
        this.f2990h = j5;
        this.f2984b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j5) {
        long[] jArr = this.f2988f;
        for (int iA = AbstractC0370w.a(jArr, j5, true); iA < jArr.length; iA++) {
            if ((this.f2989g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
