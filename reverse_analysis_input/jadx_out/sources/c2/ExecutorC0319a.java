package c2;

import Z1.i;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: c2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0319a implements Executor {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5066l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f5067m;

    public /* synthetic */ ExecutorC0319a(Object obj, int i) {
        this.f5066l = i;
        this.f5067m = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f5066l) {
            case 0:
                ((Handler) ((i) this.f5067m).f3014n).post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = (Handler) this.f5067m;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }
}
