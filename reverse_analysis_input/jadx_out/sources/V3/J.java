package V3;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class J extends I implements InterfaceC0147y {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Executor f2383n;

    public J(Executor executor) {
        Method method;
        this.f2383n = executor;
        Method method2 = a4.c.f3590a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = a4.c.f3590a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f2383n;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof J) && ((J) obj).f2383n == this.f2383n;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2383n);
    }

    @Override // V3.AbstractC0141s
    public final void n(E3.i iVar, Runnable runnable) {
        try {
            this.f2383n.execute(runnable);
        } catch (RejectedExecutionException e5) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e5);
            P p4 = (P) iVar.l(C0142t.f2444m);
            if (p4 != null) {
                p4.b(cancellationException);
            }
            B.f2373b.n(iVar, runnable);
        }
    }

    @Override // V3.AbstractC0141s
    public final String toString() {
        return this.f2383n.toString();
    }
}
