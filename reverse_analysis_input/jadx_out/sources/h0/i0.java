package h0;

import a0.AbstractC0169U;
import a0.C0159J;
import a0.C0166Q;
import android.os.SystemClock;
import d0.AbstractC0370w;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final x0.H f6173u = new x0.H(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0169U f6174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.H f6175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0464o f6179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0.q0 f6181h;
    public final A0.A i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f6182j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x0.H f6183k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f6184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6185m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6186n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0159J f6187o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f6188p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f6189q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f6190r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f6191s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile long f6192t;

    public i0(AbstractC0169U abstractC0169U, x0.H h2, long j5, long j6, int i, C0464o c0464o, boolean z4, x0.q0 q0Var, A0.A a5, List list, x0.H h5, boolean z5, int i5, int i6, C0159J c0159j, long j7, long j8, long j9, long j10, boolean z6) {
        this.f6174a = abstractC0169U;
        this.f6175b = h2;
        this.f6176c = j5;
        this.f6177d = j6;
        this.f6178e = i;
        this.f6179f = c0464o;
        this.f6180g = z4;
        this.f6181h = q0Var;
        this.i = a5;
        this.f6182j = list;
        this.f6183k = h5;
        this.f6184l = z5;
        this.f6185m = i5;
        this.f6186n = i6;
        this.f6187o = c0159j;
        this.f6189q = j7;
        this.f6190r = j8;
        this.f6191s = j9;
        this.f6192t = j10;
        this.f6188p = z6;
    }

    public static i0 i(A0.A a5) {
        C0166Q c0166q = AbstractC0169U.f3260a;
        x0.H h2 = f6173u;
        return new i0(c0166q, h2, -9223372036854775807L, 0L, 1, null, false, x0.q0.f10775d, a5, m2.b0.f8583p, h2, false, 1, 0, C0159J.f3219d, 0L, 0L, 0L, 0L, false);
    }

    public final i0 a() {
        return new i0(this.f6174a, this.f6175b, this.f6176c, this.f6177d, this.f6178e, this.f6179f, this.f6180g, this.f6181h, this.i, this.f6182j, this.f6183k, this.f6184l, this.f6185m, this.f6186n, this.f6187o, this.f6189q, this.f6190r, j(), SystemClock.elapsedRealtime(), this.f6188p);
    }

    public final i0 b(x0.H h2) {
        return new i0(this.f6174a, this.f6175b, this.f6176c, this.f6177d, this.f6178e, this.f6179f, this.f6180g, this.f6181h, this.i, this.f6182j, h2, this.f6184l, this.f6185m, this.f6186n, this.f6187o, this.f6189q, this.f6190r, this.f6191s, this.f6192t, this.f6188p);
    }

    public final i0 c(x0.H h2, long j5, long j6, long j7, long j8, x0.q0 q0Var, A0.A a5, List list) {
        return new i0(this.f6174a, h2, j6, j7, this.f6178e, this.f6179f, this.f6180g, q0Var, a5, list, this.f6183k, this.f6184l, this.f6185m, this.f6186n, this.f6187o, this.f6189q, j8, j5, SystemClock.elapsedRealtime(), this.f6188p);
    }

    public final i0 d(int i, int i5, boolean z4) {
        return new i0(this.f6174a, this.f6175b, this.f6176c, this.f6177d, this.f6178e, this.f6179f, this.f6180g, this.f6181h, this.i, this.f6182j, this.f6183k, z4, i, i5, this.f6187o, this.f6189q, this.f6190r, this.f6191s, this.f6192t, this.f6188p);
    }

    public final i0 e(C0464o c0464o) {
        return new i0(this.f6174a, this.f6175b, this.f6176c, this.f6177d, this.f6178e, c0464o, this.f6180g, this.f6181h, this.i, this.f6182j, this.f6183k, this.f6184l, this.f6185m, this.f6186n, this.f6187o, this.f6189q, this.f6190r, this.f6191s, this.f6192t, this.f6188p);
    }

    public final i0 f(C0159J c0159j) {
        return new i0(this.f6174a, this.f6175b, this.f6176c, this.f6177d, this.f6178e, this.f6179f, this.f6180g, this.f6181h, this.i, this.f6182j, this.f6183k, this.f6184l, this.f6185m, this.f6186n, c0159j, this.f6189q, this.f6190r, this.f6191s, this.f6192t, this.f6188p);
    }

    public final i0 g(int i) {
        return new i0(this.f6174a, this.f6175b, this.f6176c, this.f6177d, i, this.f6179f, this.f6180g, this.f6181h, this.i, this.f6182j, this.f6183k, this.f6184l, this.f6185m, this.f6186n, this.f6187o, this.f6189q, this.f6190r, this.f6191s, this.f6192t, this.f6188p);
    }

    public final i0 h(AbstractC0169U abstractC0169U) {
        return new i0(abstractC0169U, this.f6175b, this.f6176c, this.f6177d, this.f6178e, this.f6179f, this.f6180g, this.f6181h, this.i, this.f6182j, this.f6183k, this.f6184l, this.f6185m, this.f6186n, this.f6187o, this.f6189q, this.f6190r, this.f6191s, this.f6192t, this.f6188p);
    }

    public final long j() {
        long j5;
        long j6;
        if (!k()) {
            return this.f6191s;
        }
        do {
            j5 = this.f6192t;
            j6 = this.f6191s;
        } while (j5 != this.f6192t);
        return AbstractC0370w.M(AbstractC0370w.Z(j6) + ((long) ((SystemClock.elapsedRealtime() - j5) * this.f6187o.f3220a)));
    }

    public final boolean k() {
        return this.f6178e == 3 && this.f6184l && this.f6186n == 0;
    }
}
