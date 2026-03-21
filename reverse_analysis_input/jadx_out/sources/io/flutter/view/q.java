package io.flutter.view;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f6961m;

    public q(r rVar, long j5) {
        this.f6961m = rVar;
        this.f6960l = j5;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        long jNanoTime = System.nanoTime() - j5;
        long j6 = jNanoTime < 0 ? 0L : jNanoTime;
        r rVar = this.f6961m;
        rVar.f6965b.onVsync(j6, rVar.f6964a, this.f6960l);
        rVar.f6966c = this;
    }
}
