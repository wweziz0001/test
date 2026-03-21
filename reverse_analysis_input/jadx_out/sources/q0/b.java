package q0;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements l2.h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f9246m;

    public /* synthetic */ b(int i, int i5) {
        this.f9245l = i5;
        this.f9246m = i;
    }

    @Override // l2.h
    public final Object get() {
        switch (this.f9245l) {
            case 0:
                return new HandlerThread(c.m("ExoPlayer:MediaCodecAsyncAdapter:", this.f9246m));
            default:
                return new HandlerThread(c.m("ExoPlayer:MediaCodecQueueingThread:", this.f9246m));
        }
    }
}
