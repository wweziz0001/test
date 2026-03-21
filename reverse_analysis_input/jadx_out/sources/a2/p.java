package a2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Executor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ExecutorService f3555m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Runnable f3556n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayDeque f3554l = new ArrayDeque();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f3557o = new Object();

    public p(ExecutorService executorService) {
        this.f3555m = executorService;
    }

    public final void a() {
        Runnable runnable = (Runnable) this.f3554l.poll();
        this.f3556n = runnable;
        if (runnable != null) {
            this.f3555m.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f3557o) {
            try {
                this.f3554l.add(new A.a(this, 7, runnable));
                if (this.f3556n == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
