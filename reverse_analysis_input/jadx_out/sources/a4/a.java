package a4;

import V3.g0;
import a.AbstractC0149a;
import b3.AbstractC0307a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final F0.p f3585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F0.p f3586d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F0.p f3583a = new F0.p(1, "NO_DECISION", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F0.p f3584b = new F0.p(1, "CLOSED", false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final F0.p f3587e = new F0.p(1, "CONDITION_FALSE", false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final F0.p f3588f = new F0.p(1, "NO_THREAD_ELEMENTS", false);

    static {
        int i = 1;
        boolean z4 = false;
        f3585c = new F0.p(i, "UNDEFINED", z4);
        f3586d = new F0.p(i, "REUSABLE_CLAIMED", z4);
    }

    public static final A1.c a(M3.l lVar, Object obj, A1.c cVar) {
        try {
            lVar.c(obj);
        } catch (Throwable th) {
            if (cVar == null || cVar.getCause() == th) {
                return new A1.c("Exception in undelivered element handler for " + obj, th);
            }
            AbstractC0149a.c(cVar, th);
        }
        return cVar;
    }

    public static final Object b(u uVar, long j5, M3.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (uVar.f3625n >= j5 && !uVar.c()) {
                return uVar;
            }
            Object obj = d.f3591l.get(uVar);
            F0.p pVar2 = f3584b;
            if (obj == pVar2) {
                return pVar2;
            }
            u uVar2 = (u) ((d) obj);
            if (uVar2 == null) {
                uVar2 = (u) pVar.i(Long.valueOf(uVar.f3625n + 1), uVar);
                do {
                    atomicReferenceFieldUpdater = d.f3591l;
                    if (atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                        if (uVar.c()) {
                            uVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(uVar) == null);
            }
            uVar = uVar2;
        }
    }

    public static final u c(Object obj) {
        if (obj != f3584b) {
            return (u) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(E3.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f3594a.iterator();
        while (it.hasNext()) {
            try {
                ((W3.b) it.next()).n(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0149a.c(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC0149a.c(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f3584b;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(E3.i iVar, Object obj) {
        if (obj == f3588f) {
            return;
        }
        if (!(obj instanceof z)) {
            Object objK = iVar.k(null, x.f3629o);
            N3.h.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC0307a.q(objK);
            throw null;
        }
        z zVar = (z) obj;
        g0[] g0VarArr = zVar.f3634b;
        int length = g0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        g0 g0Var = g0VarArr[length];
        N3.h.b(null);
        Object obj2 = zVar.f3633a[length];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095 A[Catch: all -> 0x0074, DONT_GENERATE, TryCatch #2 {all -> 0x0074, blocks: (B:17:0x004f, B:19:0x005d, B:21:0x0063, B:34:0x0098, B:24:0x0076, B:26:0x0084, B:31:0x008f, B:33:0x0095, B:39:0x00a5, B:42:0x00ae, B:41:0x00ab, B:29:0x008a), top: B:54:0x004f, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(E3.d r6, java.lang.Object r7, M3.l r8) {
        /*
            boolean r0 = r6 instanceof a4.h
            if (r0 == 0) goto Lb8
            a4.h r6 = (a4.h) r6
            java.lang.Throwable r0 = B3.d.a(r7)
            if (r0 != 0) goto L16
            if (r8 == 0) goto L14
            V3.o r0 = new V3.o
            r0.<init>(r7, r8)
            goto L1d
        L14:
            r0 = r7
            goto L1d
        L16:
            V3.n r8 = new V3.n
            r1 = 0
            r8.<init>(r0, r1)
            r0 = r8
        L1d:
            G3.b r8 = r6.f3598p
            r8.getContext()
            V3.s r1 = r6.f3597o
            boolean r2 = r1.q()
            r3 = 1
            if (r2 == 0) goto L38
            r6.f3599q = r0
            r6.f2371n = r3
            E3.i r7 = r8.getContext()
            r1.n(r7, r6)
            goto Lbb
        L38:
            V3.H r1 = V3.h0.a()
            boolean r2 = r1.v()
            if (r2 == 0) goto L4b
            r6.f3599q = r0
            r6.f2371n = r3
            r1.s(r6)
            goto Lbb
        L4b:
            r1.u(r3)
            r2 = 0
            E3.i r4 = r8.getContext()     // Catch: java.lang.Throwable -> L74
            V3.t r5 = V3.C0142t.f2444m     // Catch: java.lang.Throwable -> L74
            E3.g r4 = r4.l(r5)     // Catch: java.lang.Throwable -> L74
            V3.P r4 = (V3.P) r4     // Catch: java.lang.Throwable -> L74
            if (r4 == 0) goto L76
            boolean r5 = r4.a()     // Catch: java.lang.Throwable -> L74
            if (r5 != 0) goto L76
            V3.Z r4 = (V3.Z) r4     // Catch: java.lang.Throwable -> L74
            java.util.concurrent.CancellationException r7 = r4.B()     // Catch: java.lang.Throwable -> L74
            r6.b(r0, r7)     // Catch: java.lang.Throwable -> L74
            B3.c r7 = i4.a.p(r7)     // Catch: java.lang.Throwable -> L74
            r6.j(r7)     // Catch: java.lang.Throwable -> L74
            goto L98
        L74:
            r7 = move-exception
            goto Laf
        L76:
            java.lang.Object r0 = r6.f3600r     // Catch: java.lang.Throwable -> L74
            E3.i r4 = r8.getContext()     // Catch: java.lang.Throwable -> L74
            java.lang.Object r0 = m(r4, r0)     // Catch: java.lang.Throwable -> L74
            F0.p r5 = a4.a.f3588f     // Catch: java.lang.Throwable -> L74
            if (r0 == r5) goto L89
            V3.j0 r5 = V3.AbstractC0144v.p(r8, r4, r0)     // Catch: java.lang.Throwable -> L74
            goto L8a
        L89:
            r5 = r2
        L8a:
            r8.j(r7)     // Catch: java.lang.Throwable -> La2
            if (r5 == 0) goto L95
            boolean r7 = r5.Y()     // Catch: java.lang.Throwable -> L74
            if (r7 == 0) goto L98
        L95:
            g(r4, r0)     // Catch: java.lang.Throwable -> L74
        L98:
            boolean r7 = r1.x()     // Catch: java.lang.Throwable -> L74
            if (r7 != 0) goto L98
        L9e:
            r1.r(r3)
            goto Lbb
        La2:
            r7 = move-exception
            if (r5 == 0) goto Lab
            boolean r8 = r5.Y()     // Catch: java.lang.Throwable -> L74
            if (r8 == 0) goto Lae
        Lab:
            g(r4, r0)     // Catch: java.lang.Throwable -> L74
        Lae:
            throw r7     // Catch: java.lang.Throwable -> L74
        Laf:
            r6.i(r7, r2)     // Catch: java.lang.Throwable -> Lb3
            goto L9e
        Lb3:
            r6 = move-exception
            r1.r(r3)
            throw r6
        Lb8:
            r6.j(r7)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.a.h(E3.d, java.lang.Object, M3.l):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075 A[PHI: r18
      0x0075: PHI (r18v2 long) = (r18v1 long), (r18v4 long) binds: [B:35:0x0067, B:39:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long j(java.lang.String r22, long r23, long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.a.j(java.lang.String, long, long, long):long");
    }

    public static int k(String str, int i, int i5, int i6, int i7) {
        if ((i7 & 4) != 0) {
            i5 = 1;
        }
        if ((i7 & 8) != 0) {
            i6 = Integer.MAX_VALUE;
        }
        return (int) j(str, i, i5, i6);
    }

    public static final Object l(E3.i iVar) {
        Object objK = iVar.k(0, x.f3628n);
        N3.h.b(objK);
        return objK;
    }

    public static final Object m(E3.i iVar, Object obj) {
        if (obj == null) {
            obj = l(iVar);
        }
        if (obj == 0) {
            return f3588f;
        }
        if (obj instanceof Integer) {
            return iVar.k(new z(((Number) obj).intValue(), iVar), x.f3630p);
        }
        AbstractC0307a.q(obj);
        throw null;
    }
}
