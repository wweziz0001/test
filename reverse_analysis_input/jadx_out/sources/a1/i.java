package a1;

import F0.K;
import F0.s;
import Z1.l;
import d0.C0363p;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public K f3504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f3505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f3506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3510h;
    public int i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f3512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3514m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f3503a = new e(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l f3511j = new l();

    public void a(long j5) {
        this.f3509g = j5;
    }

    public abstract long b(C0363p c0363p);

    public abstract boolean c(C0363p c0363p, long j5, l lVar);

    public void d(boolean z4) {
        if (z4) {
            this.f3511j = new l();
            this.f3508f = 0L;
            this.f3510h = 0;
        } else {
            this.f3510h = 1;
        }
        this.f3507e = -1L;
        this.f3509g = 0L;
    }
}
