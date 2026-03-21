package a4;

import V3.AbstractC0141s;
import V3.AbstractC0146x;
import V3.InterfaceC0147y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC0141s implements InterfaceC0147y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3601r = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c4.l f3602n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3603o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f3604p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f3605q;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public i(c4.l lVar, int i) {
        this.f3602n = lVar;
        this.f3603o = i;
        if ((lVar instanceof InterfaceC0147y ? (InterfaceC0147y) lVar : null) == null) {
            int i5 = AbstractC0146x.f2455a;
        }
        this.f3604p = new l();
        this.f3605q = new Object();
    }

    @Override // V3.AbstractC0141s
    public final void n(E3.i iVar, Runnable runnable) {
        Runnable runnableR;
        this.f3604p.a(runnable);
        if (f3601r.get(this) >= this.f3603o || !s() || (runnableR = r()) == null) {
            return;
        }
        this.f3602n.n(this, new A.a(this, runnableR, 9, false));
    }

    @Override // V3.AbstractC0141s
    public final void p(E3.i iVar, Runnable runnable) {
        Runnable runnableR;
        this.f3604p.a(runnable);
        if (f3601r.get(this) >= this.f3603o || !s() || (runnableR = r()) == null) {
            return;
        }
        this.f3602n.p(this, new A.a(this, runnableR, 9, false));
    }

    public final Runnable r() {
        while (true) {
            Runnable runnable = (Runnable) this.f3604p.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f3605q) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3601r;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f3604p.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean s() {
        synchronized (this.f3605q) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3601r;
            if (atomicIntegerFieldUpdater.get(this) >= this.f3603o) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
