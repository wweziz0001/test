package p1;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f9182m;

    public /* synthetic */ e(Context context, int i) {
        this.f9181l = i;
        this.f9182m = context;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f9181l) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new e(this.f9182m, 1));
                break;
            default:
                d.s(this.f9182m, new D0.j(2), d.f9172a, false);
                break;
        }
    }
}
