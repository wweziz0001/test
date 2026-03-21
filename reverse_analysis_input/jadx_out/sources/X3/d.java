package X3;

import V3.AbstractC0144v;
import V3.C0129f;
import V3.InterfaceC0128e;
import V3.l0;
import a.AbstractC0149a;
import b3.AbstractC0307a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class d implements h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2634n = AtomicLongFieldUpdater.newUpdater(d.class, "sendersAndCloseStatus");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2635o = AtomicLongFieldUpdater.newUpdater(d.class, "receivers");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2636p = AtomicLongFieldUpdater.newUpdater(d.class, "bufferEnd");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2637q = AtomicLongFieldUpdater.newUpdater(d.class, "completedExpandBuffersAndPauseFlag");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2638r = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "sendSegment");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2639s = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "receiveSegment");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2640t = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "bufferEndSegment");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2641u = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_closeCause");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2642v = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final M3.l f2644m;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public d(int i, M3.l lVar) {
        this.f2643l = i;
        this.f2644m = lVar;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0307a.h(i, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        l lVar2 = f.f2646a;
        this.bufferEnd = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f2636p.get(this);
        l lVar3 = new l(0L, null, this, 3);
        this.sendSegment = lVar3;
        this.receiveSegment = lVar3;
        if (x()) {
            lVar3 = f.f2646a;
            N3.h.c(lVar3, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = lVar3;
        this._closeCause = f.f2663s;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object A(X3.d r13, G3.b r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof X3.b
            if (r0 == 0) goto L14
            r0 = r14
            X3.b r0 = (X3.b) r0
            int r1 = r0.f2630q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f2630q = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            X3.b r0 = new X3.b
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f2628o
            F3.a r0 = F3.a.f861l
            int r1 = r6.f2630q
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            i4.a.Y(r14)
            X3.k r14 = (X3.k) r14
            java.lang.Object r13 = r14.f2669a
            goto L99
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            i4.a.Y(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = X3.d.f2639s
            java.lang.Object r14 = r14.get(r13)
            X3.l r14 = (X3.l) r14
        L41:
            boolean r1 = r13.u()
            if (r1 == 0) goto L51
            java.lang.Throwable r13 = r13.o()
            X3.i r14 = new X3.i
            r14.<init>(r13)
            goto L9f
        L51:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = X3.d.f2635o
            long r4 = r1.getAndIncrement(r13)
            int r1 = X3.f.f2647b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.f3625n
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L6d
            X3.l r1 = r13.l(r9, r14)
            if (r1 != 0) goto L6c
            goto L41
        L6c:
            r14 = r1
        L6d:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = r7.F(r8, r9, r10, r12)
            F0.p r7 = X3.f.f2657m
            if (r1 == r7) goto La0
            F0.p r7 = X3.f.f2659o
            if (r1 != r7) goto L8a
            long r7 = r13.r()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L41
            r14.a()
            goto L41
        L8a:
            F0.p r7 = X3.f.f2658n
            if (r1 != r7) goto L9b
            r6.f2630q = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.B(r2, r3, r4, r6)
            if (r13 != r0) goto L99
            return r0
        L99:
            r14 = r13
            goto L9f
        L9b:
            r14.a()
            r14 = r1
        L9f:
            return r14
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.d.A(X3.d, G3.b):java.lang.Object");
    }

    public static boolean E(Object obj) {
        if (obj instanceof InterfaceC0128e) {
            N3.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return f.a((InterfaceC0128e) obj, B3.g.f275a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final l a(d dVar, long j5, l lVar) {
        Object objB;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        long j7;
        dVar.getClass();
        l lVar2 = f.f2646a;
        e eVar = e.f2645t;
        loop0: while (true) {
            objB = a4.a.b(lVar, j5, eVar);
            if (!a4.a.e(objB)) {
                a4.u uVarC = a4.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2638r;
                    a4.u uVar = (a4.u) atomicReferenceFieldUpdater.get(dVar);
                    if (uVar.f3625n >= uVarC.f3625n) {
                        break loop0;
                    }
                    if (!uVarC.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(dVar, uVar, uVarC)) {
                        if (atomicReferenceFieldUpdater.get(dVar) != uVar) {
                            if (uVarC.e()) {
                                uVarC.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = a4.a.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2635o;
        if (zE) {
            dVar.v();
            if (lVar.f3625n * ((long) f.f2647b) >= atomicLongFieldUpdater2.get(dVar)) {
                return null;
            }
            lVar.a();
            return null;
        }
        l lVar3 = (l) a4.a.c(objB);
        long j8 = lVar3.f3625n;
        if (j8 <= j5) {
            return lVar3;
        }
        long j9 = ((long) f.f2647b) * j8;
        do {
            atomicLongFieldUpdater = f2634n;
            j6 = atomicLongFieldUpdater.get(dVar);
            j7 = 1152921504606846975L & j6;
            if (j7 >= j9) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(dVar, j6, j7 + (((long) ((int) (j6 >> 60))) << 60)));
        if (j8 * ((long) f.f2647b) >= atomicLongFieldUpdater2.get(dVar)) {
            return null;
        }
        lVar3.a();
        return null;
    }

    public static final void c(d dVar, Object obj, C0129f c0129f) {
        A1.c cVarA;
        M3.l lVar = dVar.f2644m;
        if (lVar != null && (cVarA = a4.a.a(lVar, obj, null)) != null) {
            AbstractC0144v.g(c0129f.f2418p, cVarA);
        }
        c0129f.j(i4.a.p(dVar.q()));
    }

    public static final int f(d dVar, l lVar, int i, Object obj, long j5, Object obj2, boolean z4) {
        dVar.getClass();
        lVar.m(i, obj);
        if (z4) {
            return dVar.G(lVar, i, obj, j5, obj2, z4);
        }
        Object objK = lVar.k(i);
        if (objK == null) {
            if (dVar.g(j5)) {
                if (lVar.j(null, i, f.f2649d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (lVar.j(null, i, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof l0) {
            lVar.m(i, null);
            if (dVar.D(objK, obj)) {
                lVar.n(i, f.i);
                return 0;
            }
            F0.p pVar = f.f2655k;
            if (lVar.f2671q.getAndSet((i * 2) + 1, pVar) != pVar) {
                lVar.l(i, true);
            }
            return 5;
        }
        return dVar.G(lVar, i, obj, j5, obj2, z4);
    }

    public static void s(d dVar) {
        dVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2637q;
        if ((atomicLongFieldUpdater.addAndGet(dVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(dVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(X3.l r17, int r18, long r19, G3.b r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.d.B(X3.l, int, long, G3.b):java.lang.Object");
    }

    public final void C(l0 l0Var, boolean z4) {
        if (l0Var instanceof InterfaceC0128e) {
            ((E3.d) l0Var).j(i4.a.p(z4 ? p() : q()));
            return;
        }
        if (l0Var instanceof s) {
            ((s) l0Var).f2677l.j(new k(new i(o())));
            return;
        }
        if (!(l0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + l0Var).toString());
        }
        a aVar = (a) l0Var;
        C0129f c0129f = aVar.f2626m;
        N3.h.b(c0129f);
        aVar.f2626m = null;
        aVar.f2625l = f.f2656l;
        Throwable thO = aVar.f2627n.o();
        if (thO == null) {
            c0129f.j(Boolean.FALSE);
        } else {
            c0129f.j(i4.a.p(thO));
        }
    }

    public final boolean D(Object obj, Object obj2) {
        boolean z4 = obj instanceof s;
        M3.l lVar = this.f2644m;
        if (z4) {
            N3.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C0129f c0129f = ((s) obj).f2677l;
            return f.a(c0129f, new k(obj2), lVar != null ? new a4.p(lVar, obj2, c0129f.f2418p) : null);
        }
        if (!(obj instanceof a)) {
            if (obj instanceof InterfaceC0128e) {
                N3.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                InterfaceC0128e interfaceC0128e = (InterfaceC0128e) obj;
                return f.a(interfaceC0128e, obj2, lVar != null ? new a4.p(lVar, obj2, interfaceC0128e.getContext()) : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        N3.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0129f c0129f2 = aVar.f2626m;
        N3.h.b(c0129f2);
        aVar.f2626m = null;
        aVar.f2625l = obj2;
        Boolean bool = Boolean.TRUE;
        M3.l lVar2 = aVar.f2627n.f2644m;
        return f.a(c0129f2, bool, lVar2 != null ? new a4.p(lVar2, obj2, c0129f2.f2418p) : null);
    }

    public final Object F(l lVar, int i, long j5, Object obj) {
        Object objK = lVar.k(i);
        AtomicReferenceArray atomicReferenceArray = lVar.f2671q;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2634n;
        if (objK == null) {
            if (j5 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return f.f2658n;
                }
                if (lVar.j(objK, i, obj)) {
                    k();
                    return f.f2657m;
                }
            }
        } else if (objK == f.f2649d && lVar.j(objK, i, f.i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i * 2);
            lVar.m(i, null);
            return obj2;
        }
        while (true) {
            Object objK2 = lVar.k(i);
            if (objK2 == null || objK2 == f.f2650e) {
                if (j5 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (lVar.j(objK2, i, f.f2653h)) {
                        k();
                        return f.f2659o;
                    }
                } else {
                    if (obj == null) {
                        return f.f2658n;
                    }
                    if (lVar.j(objK2, i, obj)) {
                        k();
                        return f.f2657m;
                    }
                }
            } else if (objK2 != f.f2649d) {
                F0.p pVar = f.f2654j;
                if (objK2 == pVar) {
                    return f.f2659o;
                }
                if (objK2 == f.f2653h) {
                    return f.f2659o;
                }
                if (objK2 == f.f2656l) {
                    k();
                    return f.f2659o;
                }
                if (objK2 != f.f2652g && lVar.j(objK2, i, f.f2651f)) {
                    boolean z4 = objK2 instanceof v;
                    if (z4) {
                        objK2 = ((v) objK2).f2678a;
                    }
                    if (E(objK2)) {
                        lVar.n(i, f.i);
                        k();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        lVar.m(i, null);
                        return obj3;
                    }
                    lVar.n(i, pVar);
                    lVar.h();
                    if (z4) {
                        k();
                    }
                    return f.f2659o;
                }
            } else if (lVar.j(objK2, i, f.i)) {
                k();
                Object obj4 = atomicReferenceArray.get(i * 2);
                lVar.m(i, null);
                return obj4;
            }
        }
    }

    public final int G(l lVar, int i, Object obj, long j5, Object obj2, boolean z4) {
        while (true) {
            Object objK = lVar.k(i);
            if (objK == null) {
                if (!g(j5) || z4) {
                    if (z4) {
                        if (lVar.j(null, i, f.f2654j)) {
                            lVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (lVar.j(null, i, obj2)) {
                            return 2;
                        }
                    }
                } else if (lVar.j(null, i, f.f2649d)) {
                    return 1;
                }
            } else {
                if (objK != f.f2650e) {
                    F0.p pVar = f.f2655k;
                    if (objK == pVar) {
                        lVar.m(i, null);
                        return 5;
                    }
                    if (objK == f.f2653h) {
                        lVar.m(i, null);
                        return 5;
                    }
                    if (objK == f.f2656l) {
                        lVar.m(i, null);
                        v();
                        return 4;
                    }
                    lVar.m(i, null);
                    if (objK instanceof v) {
                        objK = ((v) objK).f2678a;
                    }
                    if (D(objK, obj)) {
                        lVar.n(i, f.i);
                        return 0;
                    }
                    if (lVar.f2671q.getAndSet((i * 2) + 1, pVar) == pVar) {
                        return 5;
                    }
                    lVar.l(i, true);
                    return 5;
                }
                if (lVar.j(objK, i, f.f2649d)) {
                    return 1;
                }
            }
        }
    }

    public final void H(long j5) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        long j7;
        if (x()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f2636p;
        } while (atomicLongFieldUpdater.get(this) <= j5);
        int i = f.f2648c;
        int i5 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2637q;
            if (i5 >= i) {
                do {
                    j6 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j6, 4611686018427387904L + (j6 & 4611686018427387903L)));
                while (true) {
                    long j8 = atomicLongFieldUpdater.get(this);
                    long j9 = atomicLongFieldUpdater2.get(this);
                    long j10 = j9 & 4611686018427387903L;
                    boolean z4 = (j9 & 4611686018427387904L) != 0;
                    if (j8 == j10 && j8 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z4) {
                        atomicLongFieldUpdater2.compareAndSet(this, j9, j10 + 4611686018427387904L);
                    }
                }
                do {
                    j7 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j7, j7 & 4611686018427387903L));
                return;
            }
            long j11 = atomicLongFieldUpdater.get(this);
            if (j11 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j11 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i5++;
            }
        }
    }

    @Override // X3.t
    public final void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(cancellationException, true);
    }

    @Override // X3.t
    public final Object d() {
        l lVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2635o;
        long j5 = atomicLongFieldUpdater.get(this);
        long j6 = f2634n.get(this);
        if (t(j6, true)) {
            return new i(o());
        }
        long j7 = j6 & 1152921504606846975L;
        Object obj = k.f2668b;
        if (j5 >= j7) {
            return obj;
        }
        Object obj2 = f.f2655k;
        l lVar2 = (l) f2639s.get(this);
        while (!u()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j8 = f.f2647b;
            long j9 = andIncrement / j8;
            int i = (int) (andIncrement % j8);
            if (lVar2.f3625n != j9) {
                l lVarL = l(j9, lVar2);
                if (lVarL == null) {
                    continue;
                } else {
                    lVar = lVarL;
                }
            } else {
                lVar = lVar2;
            }
            Object objF = F(lVar, i, andIncrement, obj2);
            if (objF == f.f2657m) {
                l0 l0Var = obj2 instanceof l0 ? (l0) obj2 : null;
                if (l0Var != null) {
                    l0Var.a(lVar, i);
                }
                H(andIncrement);
                lVar.h();
            } else if (objF == f.f2659o) {
                if (andIncrement < r()) {
                    lVar.a();
                }
                lVar2 = lVar;
            } else {
                if (objF == f.f2658n) {
                    throw new IllegalStateException("unexpected");
                }
                lVar.a();
                obj = objF;
            }
            return obj;
        }
        return new i(o());
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return r1;
     */
    @Override // X3.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.d.e(java.lang.Object):java.lang.Object");
    }

    public final boolean g(long j5) {
        return j5 < f2636p.get(this) || j5 < f2635o.get(this) + ((long) this.f2643l);
    }

    public final boolean h(Throwable th, boolean z4) {
        boolean z5;
        long j5;
        long j6;
        long j7;
        Object obj;
        long j8;
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2634n;
        if (z4) {
            do {
                j9 = atomicLongFieldUpdater.get(this);
                if (((int) (j9 >> 60)) != 0) {
                    break;
                }
                l lVar = f.f2646a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j9, (((long) 1) << 60) + (j9 & 1152921504606846975L)));
        }
        F0.p pVar = f.f2663s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2641u;
            if (atomicReferenceFieldUpdater.compareAndSet(this, pVar, th)) {
                z5 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != pVar) {
                z5 = false;
                break;
            }
        }
        if (z4) {
            do {
                j8 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j8, (((long) 3) << 60) + (j8 & 1152921504606846975L)));
        } else {
            do {
                j5 = atomicLongFieldUpdater.get(this);
                int i = (int) (j5 >> 60);
                if (i == 0) {
                    j6 = j5 & 1152921504606846975L;
                    j7 = 2;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j6 = j5 & 1152921504606846975L;
                    j7 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j5, (j7 << 60) + j6));
        }
        v();
        if (z5) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2642v;
                obj = atomicReferenceFieldUpdater2.get(this);
                F0.p pVar2 = obj == null ? f.f2661q : f.f2662r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, pVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                N3.s.a(1, obj);
                ((M3.l) obj).c(o());
            }
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r1 = (X3.l) ((a4.d) a4.d.f3592m.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X3.l i(long r13) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.d.i(long):X3.l");
    }

    public final void j(long j5) {
        A1.c cVarA;
        l lVar = (l) f2639s.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2635o;
            long j6 = atomicLongFieldUpdater.get(this);
            if (j5 < Math.max(((long) this.f2643l) + j6, f2636p.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j6, j6 + 1)) {
                long j7 = f.f2647b;
                long j8 = j6 / j7;
                int i = (int) (j6 % j7);
                if (lVar.f3625n != j8) {
                    l lVarL = l(j8, lVar);
                    if (lVarL == null) {
                        continue;
                    } else {
                        lVar = lVarL;
                    }
                }
                Object objF = F(lVar, i, j6, null);
                if (objF != f.f2659o) {
                    lVar.a();
                    M3.l lVar2 = this.f2644m;
                    if (lVar2 != null && (cVarA = a4.a.a(lVar2, objF, null)) != null) {
                        throw cVarA;
                    }
                } else if (j6 < r()) {
                    lVar.a();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0195, code lost:
    
        s(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0198, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.d.k():void");
    }

    public final l l(long j5, l lVar) {
        Object objB;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        l lVar2 = f.f2646a;
        e eVar = e.f2645t;
        loop0: while (true) {
            objB = a4.a.b(lVar, j5, eVar);
            if (!a4.a.e(objB)) {
                a4.u uVarC = a4.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2639s;
                    a4.u uVar = (a4.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f3625n >= uVarC.f3625n) {
                        break loop0;
                    }
                    if (!uVarC.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (uVarC.e()) {
                                uVarC.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (a4.a.e(objB)) {
            v();
            if (lVar.f3625n * ((long) f.f2647b) >= r()) {
                return null;
            }
            lVar.a();
            return null;
        }
        l lVar3 = (l) a4.a.c(objB);
        boolean zX = x();
        long j7 = lVar3.f3625n;
        if (!zX && j5 <= f2636p.get(this) / ((long) f.f2647b)) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2640t;
                a4.u uVar2 = (a4.u) atomicReferenceFieldUpdater2.get(this);
                if (uVar2.f3625n >= j7 || !lVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, lVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                        if (lVar3.e()) {
                            lVar3.d();
                        }
                    }
                }
                if (uVar2.e()) {
                    uVar2.d();
                }
            }
        }
        if (j7 <= j5) {
            return lVar3;
        }
        long j8 = ((long) f.f2647b) * j7;
        do {
            atomicLongFieldUpdater = f2635o;
            j6 = atomicLongFieldUpdater.get(this);
            if (j6 >= j8) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j6, j8));
        if (j7 * ((long) f.f2647b) >= r()) {
            return null;
        }
        lVar3.a();
        return null;
    }

    @Override // X3.t
    public final Object m(Z3.l lVar) {
        return A(this, lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ee, code lost:
    
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        c(r26, r28, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f5, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fb, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014c, code lost:
    
        if (r24 >= r5.get(r26)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014e, code lost:
    
        r19.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0151, code lost:
    
        r2 = r27;
        r1 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0155, code lost:
    
        c(r26, r1, r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [V3.f] */
    @Override // X3.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(E3.d r27, java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.d.n(E3.d, java.lang.Object):java.lang.Object");
    }

    public final Throwable o() {
        return (Throwable) f2641u.get(this);
    }

    public final Throwable p() {
        Throwable thO = o();
        return thO == null ? new m("Channel was closed") : thO;
    }

    public final Throwable q() {
        Throwable thO = o();
        return thO == null ? new n("Channel was closed") : thO;
    }

    public final long r() {
        return f2634n.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c6, code lost:
    
        r0 = (X3.l) ((a4.d) a4.d.f3592m.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(long r19, boolean r21) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.d.t(long, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a2, code lost:
    
        r3 = (X3.l) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a9, code lost:
    
        if (r3 != null) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.d.toString():java.lang.String");
    }

    public final boolean u() {
        return t(f2634n.get(this), true);
    }

    public final boolean v() {
        return t(f2634n.get(this), false);
    }

    public boolean w() {
        return false;
    }

    public final boolean x() {
        long j5 = f2636p.get(this);
        return j5 == 0 || j5 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(long r5, X3.l r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f3625n
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            a4.d r0 = r7.b()
            X3.l r0 = (X3.l) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            a4.d r5 = r7.b()
            X3.l r5 = (X3.l) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = X3.d.f2640t
            java.lang.Object r6 = r5.get(r4)
            a4.u r6 = (a4.u) r6
            long r0 = r6.f3625n
            long r2 = r7.f3625n
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.d.y(long, X3.l):void");
    }

    public final Object z(E3.d dVar, Object obj) throws Throwable {
        A1.c cVarA;
        C0129f c0129f = new C0129f(1, Z1.f.A(dVar));
        c0129f.u();
        M3.l lVar = this.f2644m;
        if (lVar == null || (cVarA = a4.a.a(lVar, obj, null)) == null) {
            c0129f.j(i4.a.p(q()));
        } else {
            AbstractC0149a.c(cVarA, q());
            c0129f.j(i4.a.p(cVarA));
        }
        Object objT = c0129f.t();
        return objT == F3.a.f861l ? objT : B3.g.f275a;
    }
}
