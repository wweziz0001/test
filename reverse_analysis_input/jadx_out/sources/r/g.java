package r;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import m.B0;
import q2.InterfaceFutureC0744b;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements InterfaceFutureC0744b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f9394d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f9395e = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final D1.b f9396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f9397g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f9398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile c f9399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile f f9400c;

    static {
        D1.b eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f9396f = eVar;
        if (th != null) {
            f9395e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f9397g = new Object();
    }

    public static void c(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f9400c;
        } while (!f9396f.j(gVar, fVar, f.f9391c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f9392a;
            if (thread != null) {
                fVar.f9392a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f9393b;
        }
        do {
            cVar2 = gVar.f9399b;
        } while (!f9396f.h(gVar, cVar2, c.f9382d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f9385c;
            cVar.f9385c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f9385c;
            d(cVar3.f9383a, cVar3.f9384b);
            cVar3 = cVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e5) {
            f9395e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e5);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof C0746a) {
            CancellationException cancellationException = ((C0746a) obj).f9380a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C0747b) {
            throw new ExecutionException(((C0747b) obj).f9381a);
        }
        if (obj == f9397g) {
            return null;
        }
        return obj;
    }

    public static Object f(g gVar) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // q2.InterfaceFutureC0744b
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f9399b;
        c cVar2 = c.f9382d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f9385c = cVar;
                if (f9396f.h(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f9399b;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object objF = f(this);
            sb.append("SUCCESS, result=[");
            sb.append(objF == this ? "this future" : String.valueOf(objF));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e5) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e5.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e6) {
            sb.append("FAILURE, cause=[");
            sb.append(e6.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        Object obj = this.f9398a;
        if (obj != null) {
            return false;
        }
        if (!f9396f.i(this, obj, f9394d ? new C0746a(z4, new CancellationException("Future.cancel() was called.")) : z4 ? C0746a.f9378b : C0746a.f9379c)) {
            return false;
        }
        c(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j5);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f9398a;
        if (obj != null) {
            return e(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f9400c;
            f fVar2 = f.f9391c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    D1.b bVar = f9396f;
                    bVar.L(fVar3, fVar);
                    if (bVar.j(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f9398a;
                            if (obj2 != null) {
                                return e(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(fVar3);
                    } else {
                        fVar = this.f9400c;
                    }
                } while (fVar != fVar2);
            }
            return e(this.f9398a);
        }
        while (nanos > 0) {
            Object obj3 = this.f9398a;
            if (obj3 != null) {
                return e(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strH = "Waited " + j5 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strH2 = B0.h(strH, " (plus ");
            long j6 = -nanos;
            long jConvert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(jConvert);
            boolean z4 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strH3 = strH2 + jConvert + " " + lowerCase;
                if (z4) {
                    strH3 = B0.h(strH3, ",");
                }
                strH2 = B0.h(strH3, " ");
            }
            if (z4) {
                strH2 = strH2 + nanos2 + " nanoseconds ";
            }
            strH = B0.h(strH2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(B0.h(strH, " but future completed as timeout expired"));
        }
        throw new TimeoutException(strH + " for " + string);
    }

    public final void h(f fVar) {
        fVar.f9392a = null;
        while (true) {
            f fVar2 = this.f9400c;
            if (fVar2 == f.f9391c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f9393b;
                if (fVar2.f9392a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f9393b = fVar4;
                    if (fVar3.f9392a == null) {
                        break;
                    }
                } else if (!f9396f.j(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9398a instanceof C0746a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9398a != null;
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f9398a instanceof C0746a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e5) {
                strG = "Exception thrown from implementation: " + e5.getClass();
            }
            if (strG != null && !strG.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strG);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f9398a;
            if (obj2 != null) {
                return e(obj2);
            }
            f fVar = this.f9400c;
            f fVar2 = f.f9391c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    D1.b bVar = f9396f;
                    bVar.L(fVar3, fVar);
                    if (bVar.j(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f9398a;
                            } else {
                                h(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    fVar = this.f9400c;
                } while (fVar != fVar2);
            }
            return e(this.f9398a);
        }
        throw new InterruptedException();
    }
}
