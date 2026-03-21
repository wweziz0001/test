package c4;

import F0.p;
import V3.AbstractC0144v;
import a4.s;
import b3.AbstractC0307a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import m.B0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Executor, Closeable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f5078s = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f5079t = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5080u = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p f5081v = new p(1, "NOT_IN_STACK", false);
    private volatile int _isTerminated;
    private volatile long controlState;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f5082l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f5083m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f5084n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f5085o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f5086p;
    private volatile long parkedWorkersStack;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f5087q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s f5088r;

    public b(int i, int i5, long j5, String str) {
        this.f5082l = i;
        this.f5083m = i5;
        this.f5084n = j5;
        this.f5085o = str;
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC0307a.h(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i5 < i) {
            throw new IllegalArgumentException(AbstractC0307a.g(i5, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i5 > 2097150) {
            throw new IllegalArgumentException(AbstractC0307a.h(i5, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j5 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j5 + " must be positive").toString());
        }
        this.f5086p = new e();
        this.f5087q = new e();
        this.f5088r = new s((i + 1) * 2);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void c(b bVar, Runnable runnable, boolean z4, int i) {
        i iVar = k.f5104g;
        if ((i & 4) != 0) {
            z4 = false;
        }
        bVar.b(runnable, iVar, z4);
    }

    public final int a() {
        synchronized (this.f5088r) {
            try {
                if (f5080u.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f5079t;
                long j5 = atomicLongFieldUpdater.get(this);
                int i = (int) (j5 & 2097151);
                int i5 = i - ((int) ((j5 & 4398044413952L) >> 21));
                if (i5 < 0) {
                    i5 = 0;
                }
                if (i5 >= this.f5082l) {
                    return 0;
                }
                if (i >= this.f5083m) {
                    return 0;
                }
                int i6 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i6 <= 0 || this.f5088r.b(i6) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i6);
                this.f5088r.c(i6, aVar);
                if (i6 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i7 = i5 + 1;
                aVar.start();
                return i7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, i iVar, boolean z4) {
        h jVar;
        int i;
        k.f5103f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof h) {
            jVar = (h) runnable;
            jVar.f5094l = jNanoTime;
            jVar.f5095m = iVar;
        } else {
            jVar = new j(runnable, jNanoTime, iVar);
        }
        boolean z5 = false;
        boolean z6 = jVar.f5095m.f5096a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f5079t;
        long jAddAndGet = z6 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !N3.h.a(aVar.f5077s, this)) {
            aVar = null;
        }
        if (aVar != null && (i = aVar.f5072n) != 5 && (jVar.f5095m.f5096a != 0 || i != 2)) {
            aVar.f5076r = true;
            m mVar = aVar.f5070l;
            if (z4) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                h hVar = (h) m.f5107b.getAndSet(mVar, jVar);
                jVar = hVar == null ? null : mVar.a(hVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f5095m.f5096a == 1 ? this.f5087q.a(jVar) : this.f5086p.a(jVar))) {
                throw new RejectedExecutionException(B0.i(new StringBuilder(), this.f5085o, " was terminated"));
            }
        }
        if (z4 && aVar != null) {
            z5 = true;
        }
        if (z6) {
            if (z5 || n() || l(jAddAndGet)) {
                return;
            }
            n();
            return;
        }
        if (z5 || n() || l(atomicLongFieldUpdater.get(this))) {
            return;
        }
        n();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = c4.b.f5080u
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Laf
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof c4.a
            r3 = 0
            if (r1 == 0) goto L18
            c4.a r0 = (c4.a) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            c4.b r1 = r0.f5077s
            boolean r1 = N3.h.a(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            a4.s r1 = r8.f5088r
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = c4.b.f5079t     // Catch: java.lang.Throwable -> Lc1
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc1
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L77
            r1 = r2
        L37:
            a4.s r5 = r8.f5088r
            java.lang.Object r5 = r5.b(r1)
            N3.h.b(r5)
            c4.a r5 = (c4.a) r5
            if (r5 == r0) goto L72
        L44:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L53
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L44
        L53:
            c4.m r5 = r5.f5070l
            c4.e r6 = r8.f5087q
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = c4.m.f5107b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            c4.h r7 = (c4.h) r7
            if (r7 == 0) goto L67
            r6.a(r7)
        L67:
            c4.h r7 = r5.b()
            if (r7 != 0) goto L6e
            goto L72
        L6e:
            r6.a(r7)
            goto L67
        L72:
            if (r1 == r4) goto L77
            int r1 = r1 + 1
            goto L37
        L77:
            c4.e r1 = r8.f5087q
            r1.b()
            c4.e r1 = r8.f5086p
            r1.b()
        L81:
            if (r0 == 0) goto L89
            c4.h r1 = r0.a(r2)
            if (r1 != 0) goto Lb0
        L89:
            c4.e r1 = r8.f5086p
            java.lang.Object r1 = r1.d()
            c4.h r1 = (c4.h) r1
            if (r1 != 0) goto Lb0
            c4.e r1 = r8.f5087q
            java.lang.Object r1 = r1.d()
            c4.h r1 = (c4.h) r1
            if (r1 != 0) goto Lb0
            if (r0 == 0) goto La3
            r1 = 5
            r0.h(r1)
        La3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = c4.b.f5078s
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = c4.b.f5079t
            r0.set(r8, r1)
        Laf:
            return
        Lb0:
            r1.run()     // Catch: java.lang.Throwable -> Lb4
            goto L81
        Lb4:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L81
        Lc1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.b.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(this, runnable, false, 6);
    }

    public final void k(a aVar, int i, int i5) {
        while (true) {
            long j5 = f5078s.get(this);
            int i6 = (int) (2097151 & j5);
            long j6 = (2097152 + j5) & (-2097152);
            if (i6 == i) {
                if (i5 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f5081v) {
                            i6 = -1;
                            break;
                        }
                        if (objC == null) {
                            i6 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i6 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i6 = i5;
                }
            }
            if (i6 >= 0) {
                if (f5078s.compareAndSet(this, j5, ((long) i6) | j6)) {
                    return;
                }
            }
        }
    }

    public final boolean l(long j5) {
        int i = ((int) (2097151 & j5)) - ((int) ((j5 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i5 = this.f5082l;
        if (i < i5) {
            int iA = a();
            if (iA == 1 && i5 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        p pVar;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5078s;
            long j5 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f5088r.b((int) (2097151 & j5));
            if (aVar == null) {
                aVar = null;
            } else {
                long j6 = (2097152 + j5) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    pVar = f5081v;
                    if (objC == pVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j5, j6 | ((long) iB))) {
                    aVar.g(pVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f5069t.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s sVar = this.f5088r;
        int iA = sVar.a();
        int i = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < iA; i9++) {
            a aVar = (a) sVar.b(i9);
            if (aVar != null) {
                m mVar = aVar.f5070l;
                mVar.getClass();
                int i10 = m.f5107b.get(mVar) != null ? (m.f5108c.get(mVar) - m.f5109d.get(mVar)) + 1 : m.f5108c.get(mVar) - m.f5109d.get(mVar);
                int iB = O.i.b(aVar.f5072n);
                if (iB == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i10);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iB == 1) {
                    i5++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iB == 2) {
                    i6++;
                } else if (iB == 3) {
                    i7++;
                    if (i10 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i10);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iB == 4) {
                    i8++;
                }
            }
        }
        long j5 = f5079t.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f5085o);
        sb4.append('@');
        sb4.append(AbstractC0144v.e(this));
        sb4.append("[Pool Size {core = ");
        int i11 = this.f5082l;
        sb4.append(i11);
        sb4.append(", max = ");
        sb4.append(this.f5083m);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i5);
        sb4.append(", parked = ");
        sb4.append(i6);
        sb4.append(", dormant = ");
        sb4.append(i7);
        sb4.append(", terminated = ");
        sb4.append(i8);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f5086p.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f5087q.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j5));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j5) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i11 - ((int) ((j5 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
