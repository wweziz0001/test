package T2;

import D0.y;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f2209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f2210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y f2211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f2212f;

    public g(String str, int i) {
        this.f2207a = str;
        this.f2208b = i;
    }

    public final synchronized void a(y yVar) {
        HandlerThread handlerThread = new HandlerThread(this.f2207a, this.f2208b);
        this.f2209c = handlerThread;
        handlerThread.start();
        this.f2210d = new Handler(this.f2209c.getLooper());
        this.f2211e = yVar;
    }
}
