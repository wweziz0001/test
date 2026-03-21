package Q1;

import android.content.Context;
import androidx.work.WorkerParameters;
import q2.InterfaceFutureC0744b;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f1832l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WorkerParameters f1833m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile int f1834n = -256;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1835o;

    public p(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f1832l = context;
        this.f1833m = workerParameters;
    }

    public InterfaceFutureC0744b a() {
        b2.k kVar = new b2.k();
        kVar.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return kVar;
    }

    public abstract InterfaceFutureC0744b c();

    public final void d(int i) {
        this.f1834n = i;
        b();
    }

    public void b() {
    }
}
