package Q1;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: Q1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0119b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f1804a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1805b;

    public ThreadFactoryC0119b(boolean z4) {
        this.f1805b = z4;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        N3.h.e(runnable, "runnable");
        return new Thread(runnable, (this.f1805b ? "WM.task-" : "androidx.work-") + this.f1804a.incrementAndGet());
    }
}
