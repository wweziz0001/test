package t0;

import android.os.Handler;
import d0.AbstractC0370w;
import java.io.Closeable;
import m2.g0;

/* JADX INFO: renamed from: t0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0854k implements Runnable, Closeable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f9907l = AbstractC0370w.m(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f9908m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9909n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0855l f9910o;

    public RunnableC0854k(C0855l c0855l, long j5) {
        this.f9910o = c0855l;
        this.f9908m = j5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9909n = false;
        this.f9907l.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0855l c0855l = this.f9910o;
        D0.d dVar = c0855l.f9921r;
        dVar.r(dVar.i(4, c0855l.f9925v, g0.f8607r, c0855l.f9922s));
        this.f9907l.postDelayed(this, this.f9908m);
    }
}
