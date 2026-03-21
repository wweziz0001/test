package b2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import m.B0;
import q2.InterfaceFutureC0744b;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements InterfaceFutureC0744b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f4899d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f4900e = Logger.getLogger(i.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i4.a f4901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f4902g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f4903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile d f4904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile h f4905c;

    static {
        i4.a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(i.class, d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f4901f = gVar;
        if (th != null) {
            f4900e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4902g = new Object();
    }

    public static void c(i iVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = iVar.f4905c;
            if (f4901f.i(iVar, hVar, h.f4896c)) {
                while (hVar != null) {
                    Thread thread = hVar.f4897a;
                    if (thread != null) {
                        hVar.f4897a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f4898b;
                }
                do {
                    dVar = iVar.f4904b;
                } while (!f4901f.g(iVar, dVar, d.f4885d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f4888c;
                    dVar3.f4888c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f4888c;
                    Runnable runnable = dVar2.f4886a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        iVar = fVar.f4894l;
                        if (iVar.f4903a == fVar) {
                            if (f4901f.h(iVar, fVar, f(fVar.f4895m))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, dVar2.f4887b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e5) {
            f4900e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e5);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof C0305a) {
            CancellationException cancellationException = ((C0305a) obj).f4881b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f4884a);
        }
        if (obj == f4902g) {
            return null;
        }
        return obj;
    }

    public static Object f(InterfaceFutureC0744b interfaceFutureC0744b) {
        if (interfaceFutureC0744b instanceof i) {
            Object obj = ((i) interfaceFutureC0744b).f4903a;
            if (!(obj instanceof C0305a)) {
                return obj;
            }
            C0305a c0305a = (C0305a) obj;
            return c0305a.f4880a ? c0305a.f4881b != null ? new C0305a(false, c0305a.f4881b) : C0305a.f4879d : obj;
        }
        boolean zIsCancelled = interfaceFutureC0744b.isCancelled();
        if ((!f4899d) && zIsCancelled) {
            return C0305a.f4879d;
        }
        try {
            Object objG = g(interfaceFutureC0744b);
            return objG == null ? f4902g : objG;
        } catch (CancellationException e5) {
            if (zIsCancelled) {
                return new C0305a(false, e5);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC0744b, e5));
        } catch (ExecutionException e6) {
            return new c(e6.getCause());
        } catch (Throwable th) {
            return new c(th);
        }
    }

    public static Object g(InterfaceFutureC0744b interfaceFutureC0744b) {
        Object obj;
        boolean z4 = false;
        while (true) {
            try {
                obj = interfaceFutureC0744b.get();
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
        d dVar = this.f4904b;
        d dVar2 = d.f4885d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f4888c = dVar;
                if (f4901f.g(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.f4904b;
                }
            } while (dVar != dVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objG == this ? "this future" : String.valueOf(objG));
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
        Object obj = this.f4903a;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        C0305a c0305a = f4899d ? new C0305a(z4, new CancellationException("Future.cancel() was called.")) : z4 ? C0305a.f4878c : C0305a.f4879d;
        i iVar = this;
        boolean z5 = false;
        while (true) {
            if (f4901f.h(iVar, obj, c0305a)) {
                c(iVar);
                if (!(obj instanceof f)) {
                    return true;
                }
                InterfaceFutureC0744b interfaceFutureC0744b = ((f) obj).f4895m;
                if (!(interfaceFutureC0744b instanceof i)) {
                    interfaceFutureC0744b.cancel(z4);
                    return true;
                }
                iVar = (i) interfaceFutureC0744b;
                obj = iVar.f4903a;
                if (!(obj == null) && !(obj instanceof f)) {
                    return true;
                }
                z5 = true;
            } else {
                obj = iVar.f4903a;
                if (!(obj instanceof f)) {
                    return z5;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a8 -> B:36:0x0074). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.i.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        Object obj = this.f4903a;
        if (obj instanceof f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            InterfaceFutureC0744b interfaceFutureC0744b = ((f) obj).f4895m;
            return B0.i(sb, interfaceFutureC0744b == this ? "this future" : String.valueOf(interfaceFutureC0744b), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(h hVar) {
        hVar.f4897a = null;
        while (true) {
            h hVar2 = this.f4905c;
            if (hVar2 == h.f4896c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f4898b;
                if (hVar2.f4897a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f4898b = hVar4;
                    if (hVar3.f4897a == null) {
                        break;
                    }
                } else if (!f4901f.i(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4903a instanceof C0305a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.f4903a != null);
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f4903a instanceof C0305a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e5) {
                strH = "Exception thrown from implementation: " + e5.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strH);
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
            Object obj2 = this.f4903a;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return e(obj2);
            }
            h hVar = this.f4905c;
            h hVar2 = h.f4896c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    i4.a aVar = f4901f;
                    aVar.L(hVar3, hVar);
                    if (aVar.i(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4903a;
                            } else {
                                i(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return e(obj);
                    }
                    hVar = this.f4905c;
                } while (hVar != hVar2);
            }
            return e(this.f4903a);
        }
        throw new InterruptedException();
    }
}
