package r;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import q2.InterfaceFutureC0744b;

/* JADX INFO: loaded from: classes.dex */
public final class j implements InterfaceFutureC0744b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f9406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f9407b = new i(this);

    public j(h hVar) {
        this.f9406a = new WeakReference(hVar);
    }

    @Override // q2.InterfaceFutureC0744b
    public final void a(Runnable runnable, Executor executor) {
        this.f9407b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        h hVar = (h) this.f9406a.get();
        boolean zCancel = this.f9407b.cancel(z4);
        if (zCancel && hVar != null) {
            hVar.f9401a = null;
            hVar.f9402b = null;
            hVar.f9403c.i(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f9407b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9407b.f9398a instanceof C0746a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9407b.isDone();
    }

    public final String toString() {
        return this.f9407b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        return this.f9407b.get(j5, timeUnit);
    }
}
