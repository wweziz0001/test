package V3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class G extends H implements InterfaceC0147y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2376r = AtomicReferenceFieldUpdater.newUpdater(G.class, Object.class, "_queue");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2377s = AtomicReferenceFieldUpdater.newUpdater(G.class, Object.class, "_delayed");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2378t = AtomicIntegerFieldUpdater.newUpdater(G.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    public final boolean A() {
        C3.d dVar = this.f2382p;
        if (!(dVar != null ? dVar.isEmpty() : true)) {
            return false;
        }
        Object obj = f2376r.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof a4.n) {
            long j5 = a4.n.f3612f.get((a4.n) obj);
            if (((int) (1073741823 & j5)) == ((int) ((j5 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0144v.f2446b) {
            return true;
        }
        return false;
    }

    @Override // V3.AbstractC0141s
    public final void n(E3.i iVar, Runnable runnable) {
        z(runnable);
    }

    @Override // V3.H
    public final long w() {
        Runnable runnable;
        if (x()) {
            return 0L;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2376r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof a4.n)) {
                if (obj != AbstractC0144v.f2446b) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
                break;
            }
            a4.n nVar = (a4.n) obj;
            Object objD = nVar.d();
            if (objD != a4.n.f3613g) {
                runnable = (Runnable) objD;
                break;
            }
            a4.n nVarC = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        C3.d dVar = this.f2382p;
        if (((dVar == null || dVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f2376r.get(this);
        if (obj2 == null) {
        } else if (obj2 instanceof a4.n) {
            long j5 = a4.n.f3612f.get((a4.n) obj2);
            if (((int) (1073741823 & j5)) != ((int) ((j5 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        } else if (obj2 != AbstractC0144v.f2446b) {
            return 0L;
        }
        return Long.MAX_VALUE;
    }

    @Override // V3.H
    public void y() {
        h0.f2421a.set(null);
        f2378t.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2376r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            F0.p pVar = AbstractC0144v.f2446b;
            if (obj != null) {
                if (!(obj instanceof a4.n)) {
                    if (obj != pVar) {
                        a4.n nVar = new a4.n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((a4.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, pVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (w() <= 0) {
        }
        System.nanoTime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        V3.RunnableC0145w.f2453u.z(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(java.lang.Runnable r6) {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = V3.G.f2376r
            java.lang.Object r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = V3.G.f2378t
            int r2 = r2.get(r5)
            if (r2 == 0) goto Lf
            goto L4a
        Lf:
            if (r1 != 0) goto L20
        L11:
            r1 = 0
            boolean r1 = r0.compareAndSet(r5, r1, r6)
            if (r1 == 0) goto L19
            goto L66
        L19:
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L11
            goto L0
        L20:
            boolean r2 = r1 instanceof a4.n
            r3 = 1
            if (r2 == 0) goto L46
            r2 = r1
            a4.n r2 = (a4.n) r2
            int r4 = r2.a(r6)
            if (r4 == 0) goto L66
            if (r4 == r3) goto L34
            r0 = 2
            if (r4 == r0) goto L4a
            goto L0
        L34:
            a4.n r2 = r2.c()
        L38:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L3f
            goto L0
        L3f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L38
            goto L0
        L46:
            F0.p r2 = V3.AbstractC0144v.f2446b
            if (r1 != r2) goto L50
        L4a:
            V3.w r0 = V3.RunnableC0145w.f2453u
            r0.z(r6)
            goto L73
        L50:
            a4.n r2 = new a4.n
            r4 = 8
            r2.<init>(r4, r3)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r6)
        L60:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L74
        L66:
            java.lang.Thread r6 = r5.t()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r6) goto L73
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L73:
            return
        L74:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L60
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: V3.G.z(java.lang.Runnable):void");
    }
}
