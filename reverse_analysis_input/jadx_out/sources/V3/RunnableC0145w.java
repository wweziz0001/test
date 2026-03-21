package V3;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: V3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0145w extends G implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final RunnableC0145w f2453u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f2454v;

    static {
        Long l3;
        RunnableC0145w runnableC0145w = new RunnableC0145w();
        f2453u = runnableC0145w;
        runnableC0145w.u(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f2454v = timeUnit.toNanos(l3.longValue());
    }

    public final synchronized void B() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            G.f2376r.set(this, null);
            G.f2377s.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zA;
        h0.f2421a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zA) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j5 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jW = w();
                    if (jW == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j5 == Long.MAX_VALUE) {
                            j5 = f2454v + jNanoTime;
                        }
                        long j6 = j5 - jNanoTime;
                        if (j6 <= 0) {
                            _thread = null;
                            B();
                            if (A()) {
                                return;
                            }
                            t();
                            return;
                        }
                        if (jW > j6) {
                            jW = j6;
                        }
                    } else {
                        j5 = Long.MAX_VALUE;
                    }
                    if (jW > 0) {
                        int i5 = debugStatus;
                        if (i5 == 2 || i5 == 3) {
                            _thread = null;
                            B();
                            if (A()) {
                                return;
                            }
                            t();
                            return;
                        }
                        LockSupport.parkNanos(this, jW);
                    }
                }
            }
        } finally {
            _thread = null;
            B();
            if (!A()) {
                t();
            }
        }
    }

    @Override // V3.H
    public final Thread t() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // V3.G, V3.H
    public final void y() {
        debugStatus = 4;
        super.y();
    }

    @Override // V3.G
    public final void z(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.z(runnable);
    }
}
