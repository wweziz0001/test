package h0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: renamed from: h0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0451b extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SurfaceHolderCallbackC0445D f6093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Handler f6094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0452c f6095n;

    public RunnableC0451b(C0452c c0452c, Handler handler, SurfaceHolderCallbackC0445D surfaceHolderCallbackC0445D) {
        this.f6095n = c0452c;
        this.f6094m = handler;
        this.f6093l = surfaceHolderCallbackC0445D;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f6094m.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f6095n.f6101a) {
            this.f6093l.f5909l.a0(-1, 3, false);
        }
    }
}
