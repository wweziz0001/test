package Q1;

import L.K;
import V3.T;
import b2.C0305a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import q2.InterfaceFutureC0744b;

/* JADX INFO: loaded from: classes.dex */
public final class k implements InterfaceFutureC0744b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2.k f1829a = new b2.k();

    public k(T t4) {
        t4.J(false, true, new K(this, 1));
    }

    @Override // q2.InterfaceFutureC0744b
    public final void a(Runnable runnable, Executor executor) {
        this.f1829a.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        return this.f1829a.cancel(z4);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f1829a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1829a.f4903a instanceof C0305a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1829a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        return this.f1829a.get(j5, timeUnit);
    }
}
