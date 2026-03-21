package o0;

import a0.C0186l;
import java.util.List;
import java.util.Map;
import m2.I;
import m2.g0;
import m2.r;

/* JADX INFO: loaded from: classes.dex */
public final class i extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f9018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9019h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f9020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f9021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f9022l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f9023m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f9024n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f9025o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f9026p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0186l f9027q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final I f9028r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final I f9029s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g0 f9030t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f9031u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f9032v;

    public i(int i, String str, List list, long j5, boolean z4, long j6, boolean z5, int i5, long j7, int i6, long j8, long j9, boolean z6, boolean z7, boolean z8, C0186l c0186l, List list2, List list3, h hVar, Map map) {
        super(str, list, z6);
        this.f9015d = i;
        this.f9019h = j6;
        this.f9018g = z4;
        this.i = z5;
        this.f9020j = i5;
        this.f9021k = j7;
        this.f9022l = i6;
        this.f9023m = j8;
        this.f9024n = j9;
        this.f9025o = z7;
        this.f9026p = z8;
        this.f9027q = c0186l;
        this.f9028r = I.p(list2);
        this.f9029s = I.p(list3);
        this.f9030t = g0.a(map);
        if (!list3.isEmpty()) {
            d dVar = (d) r.l(list3);
            this.f9031u = dVar.f9003p + dVar.f9001n;
        } else if (list2.isEmpty()) {
            this.f9031u = 0L;
        } else {
            f fVar = (f) r.l(list2);
            this.f9031u = fVar.f9003p + fVar.f9001n;
        }
        this.f9016e = j5 != -9223372036854775807L ? j5 >= 0 ? Math.min(this.f9031u, j5) : Math.max(0L, this.f9031u + j5) : -9223372036854775807L;
        this.f9017f = j5 >= 0;
        this.f9032v = hVar;
    }

    @Override // s0.InterfaceC0784a
    public final Object a(List list) {
        return this;
    }
}
