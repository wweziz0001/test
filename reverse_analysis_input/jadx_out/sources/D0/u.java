package D0;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import d0.AbstractC0360m;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final u f503p = new u();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile long f504l = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Handler f505m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Choreographer f506n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f507o;

    public u() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i = AbstractC0370w.f5326a;
        Handler handler = new Handler(looper, this);
        this.f505m = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        this.f504l = j5;
        Choreographer choreographer = this.f506n;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                this.f506n = Choreographer.getInstance();
            } catch (RuntimeException e5) {
                AbstractC0360m.z("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e5);
            }
            return true;
        }
        if (i == 2) {
            Choreographer choreographer = this.f506n;
            if (choreographer != null) {
                int i5 = this.f507o + 1;
                this.f507o = i5;
                if (i5 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f506n;
        if (choreographer2 != null) {
            int i6 = this.f507o - 1;
            this.f507o = i6;
            if (i6 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f504l = -9223372036854775807L;
            }
        }
        return true;
    }
}
