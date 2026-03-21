package t0;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Closeable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final OutputStream f9978l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HandlerThread f9979m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f9980n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x f9981o;

    public w(x xVar, OutputStream outputStream) {
        this.f9981o = xVar;
        this.f9978l = outputStream;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
        this.f9979m = handlerThread;
        handlerThread.start();
        this.f9980n = new Handler(handlerThread.getLooper());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Handler handler = this.f9980n;
        HandlerThread handlerThread = this.f9979m;
        Objects.requireNonNull(handlerThread);
        handler.post(new A3.c(handlerThread, 19));
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            handlerThread.interrupt();
        }
    }
}
