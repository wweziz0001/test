package h0;

import a0.C0159J;
import android.os.SystemClock;
import d0.AbstractC0370w;
import d0.C0365r;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements U {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0365r f6285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6286m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f6287n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f6288o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0159J f6289p = C0159J.f3219d;

    public u0(C0365r c0365r) {
        this.f6285l = c0365r;
    }

    @Override // h0.U
    public final void a(C0159J c0159j) {
        if (this.f6286m) {
            b(h());
        }
        this.f6289p = c0159j;
    }

    public final void b(long j5) {
        this.f6287n = j5;
        if (this.f6286m) {
            this.f6285l.getClass();
            this.f6288o = SystemClock.elapsedRealtime();
        }
    }

    public final void c() {
        if (this.f6286m) {
            return;
        }
        this.f6285l.getClass();
        this.f6288o = SystemClock.elapsedRealtime();
        this.f6286m = true;
    }

    @Override // h0.U
    public final C0159J d() {
        return this.f6289p;
    }

    @Override // h0.U
    public final long h() {
        long j5 = this.f6287n;
        if (!this.f6286m) {
            return j5;
        }
        this.f6285l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f6288o;
        C0159J c0159j = this.f6289p;
        return j5 + (c0159j.f3220a == 1.0f ? AbstractC0370w.M(jElapsedRealtime) : jElapsedRealtime * ((long) c0159j.f3222c));
    }
}
