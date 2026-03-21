package p1;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static void a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: p1.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j5) {
                runnable.run();
            }
        });
    }
}
