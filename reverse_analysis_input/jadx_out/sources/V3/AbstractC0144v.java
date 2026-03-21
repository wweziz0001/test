package V3;

import a.AbstractC0149a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: V3.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0144v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final F0.p f2447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final F0.p f2448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final F0.p f2449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final F0.p f2450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final F0.p f2451g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F0.p f2445a = new F0.p(1, "RESUME_TOKEN", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F0.p f2446b = new F0.p(1, "CLOSED_EMPTY", false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final E f2452h = new E(false);
    public static final E i = new E(true);

    static {
        int i5 = 1;
        boolean z4 = false;
        f2447c = new F0.p(i5, "COMPLETING_ALREADY", z4);
        f2448d = new F0.p(i5, "COMPLETING_WAITING_CHILDREN", z4);
        f2449e = new F0.p(i5, "COMPLETING_RETRY", z4);
        f2450f = new F0.p(i5, "TOO_LATE_TO_CANCEL", z4);
        f2451g = new F0.p(i5, "SEALED", z4);
    }

    public static final a4.e a(E3.i iVar) {
        if (iVar.l(C0142t.f2444m) == null) {
            iVar = iVar.o(b());
        }
        return new a4.e(iVar);
    }

    public static T b() {
        return new T(null);
    }

    public static final void c(E3.i iVar) {
        P p4 = (P) iVar.l(C0142t.f2444m);
        if (p4 != null && !p4.a()) {
            throw ((Z) p4).B();
        }
    }

    public static final E3.i d(E3.i iVar, E3.i iVar2, boolean z4) {
        Boolean bool = Boolean.FALSE;
        C0139p c0139p = C0139p.f2437o;
        boolean zBooleanValue = ((Boolean) iVar.k(bool, c0139p)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) iVar2.k(bool, c0139p)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return iVar.o(iVar2);
        }
        E3.j jVar = E3.j.f675l;
        E3.i iVar3 = (E3.i) iVar.k(jVar, new C0139p(2, 2));
        Object objK = iVar2;
        if (zBooleanValue2) {
            objK = iVar2.k(jVar, C0139p.f2436n);
        }
        return iVar3.o((E3.i) objK);
    }

    public static final String e(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0129f f(E3.d dVar) {
        C0129f c0129f;
        C0129f c0129f2;
        if (!(dVar instanceof a4.h)) {
            return new C0129f(1, dVar);
        }
        a4.h hVar = (a4.h) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a4.h.f3596s;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            F0.p pVar = a4.a.f3586d;
            c0129f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, pVar);
                c0129f2 = null;
                break;
            }
            if (obj instanceof C0129f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, pVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0129f2 = (C0129f) obj;
                break loop0;
            }
            if (obj != pVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0129f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0129f.f2415r;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0129f2);
            if (!(obj2 instanceof C0136m) || ((C0136m) obj2).f2429d == null) {
                C0129f.f2414q.set(c0129f2, 536870911);
                atomicReferenceFieldUpdater2.set(c0129f2, C0125b.f2409l);
                c0129f = c0129f2;
            } else {
                c0129f2.q();
            }
            if (c0129f != null) {
                return c0129f;
            }
        }
        return new C0129f(2, dVar);
    }

    public static final void g(E3.i iVar, Throwable th) {
        try {
            W3.b bVar = (W3.b) iVar.l(C0142t.f2443l);
            if (bVar != null) {
                bVar.n(iVar, th);
            } else {
                a4.a.d(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0149a.c(runtimeException, th);
                th = runtimeException;
            }
            a4.a.d(iVar, th);
        }
    }

    public static /* synthetic */ C h(P p4, boolean z4, U u4, int i5) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        return ((Z) p4).J(z4, (i5 & 2) != 0, u4);
    }

    public static final boolean i(int i5) {
        return i5 == 1 || i5 == 2;
    }

    public static e0 j(InterfaceC0143u interfaceC0143u, M3.p pVar) {
        E3.i iVarD = d(interfaceC0143u.i(), E3.j.f675l, true);
        c4.d dVar = B.f2372a;
        if (iVarD != dVar && iVarD.l(E3.e.f674l) == null) {
            iVarD = iVarD.o(dVar);
        }
        e0 e0Var = new e0(iVarD, true);
        e0Var.X(1, e0Var, pVar);
        return e0Var;
    }

    public static final Object k(Object obj) {
        return obj instanceof C0137n ? i4.a.p(((C0137n) obj).f2433a) : obj;
    }

    public static final void l(C0129f c0129f, E3.d dVar, boolean z4) {
        Object obj = C0129f.f2415r.get(c0129f);
        Throwable thD = c0129f.d(obj);
        Object objP = thD != null ? i4.a.p(thD) : c0129f.e(obj);
        if (!z4) {
            dVar.j(objP);
            return;
        }
        N3.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        a4.h hVar = (a4.h) dVar;
        G3.b bVar = hVar.f3598p;
        E3.i context = bVar.getContext();
        Object objM = a4.a.m(context, hVar.f3600r);
        j0 j0VarP = objM != a4.a.f3588f ? p(bVar, context, objM) : null;
        try {
            bVar.j(objP);
        } finally {
            if (j0VarP == null || j0VarP.Y()) {
                a4.a.g(context, objM);
            }
        }
    }

    public static Object m(M3.p pVar) throws Throwable {
        E3.j jVar = E3.j.f675l;
        Thread threadCurrentThread = Thread.currentThread();
        E3.e eVar = E3.e.f674l;
        H hA = h0.a();
        E3.i iVarD = d(jVar, hA, true);
        c4.d dVar = B.f2372a;
        if (iVarD != dVar && iVarD.l(eVar) == null) {
            iVarD = iVarD.o(dVar);
        }
        C0126c c0126c = new C0126c(iVarD, threadCurrentThread, hA);
        c0126c.X(1, c0126c, pVar);
        H h2 = c0126c.f2412p;
        if (h2 != null) {
            int i5 = H.f2379q;
            h2.u(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jW = h2 != null ? h2.w() : Long.MAX_VALUE;
                if (!(c0126c.F() instanceof L)) {
                    if (h2 != null) {
                        int i6 = H.f2379q;
                        h2.r(false);
                    }
                    Object objO = o(c0126c.F());
                    C0137n c0137n = objO instanceof C0137n ? (C0137n) objO : null;
                    if (c0137n == null) {
                        return objO;
                    }
                    throw c0137n.f2433a;
                }
                LockSupport.parkNanos(c0126c, jW);
            } catch (Throwable th) {
                if (h2 != null) {
                    int i7 = H.f2379q;
                    h2.r(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0126c.t(interruptedException);
        throw interruptedException;
    }

    public static final String n(E3.d dVar) {
        Object objP;
        if (dVar instanceof a4.h) {
            return dVar.toString();
        }
        try {
            objP = dVar + '@' + e(dVar);
        } catch (Throwable th) {
            objP = i4.a.p(th);
        }
        if (B3.d.a(objP) != null) {
            objP = dVar.getClass().getName() + '@' + e(dVar);
        }
        return (String) objP;
    }

    public static final Object o(Object obj) {
        L l3;
        M m4 = obj instanceof M ? (M) obj : null;
        return (m4 == null || (l3 = m4.f2385a) == null) ? obj : l3;
    }

    public static final j0 p(E3.d dVar, E3.i iVar, Object obj) {
        j0 j0Var = null;
        if (!(dVar instanceof G3.c)) {
            return null;
        }
        if (iVar.l(k0.f2425l) != null) {
            G3.c cVarF = (G3.c) dVar;
            while (true) {
                if ((cVarF instanceof C0148z) || (cVarF = cVarF.f()) == null) {
                    break;
                }
                if (cVarF instanceof j0) {
                    j0Var = (j0) cVarF;
                    break;
                }
            }
            if (j0Var != null) {
                j0Var.Z(iVar, obj);
            }
        }
        return j0Var;
    }

    public static final Object q(E3.i iVar, M3.p pVar, G3.f fVar) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        E3.i iVar2 = fVar.f914m;
        N3.h.b(iVar2);
        E3.i iVarO = !((Boolean) iVar.k(Boolean.FALSE, C0139p.f2437o)).booleanValue() ? iVar2.o(iVar) : d(iVar2, iVar, false);
        c(iVarO);
        if (iVarO == iVar2) {
            a4.t tVar = new a4.t(fVar, iVarO);
            return AbstractC0149a.H(tVar, tVar, pVar);
        }
        E3.e eVar = E3.e.f674l;
        if (N3.h.a(iVarO.l(eVar), iVar2.l(eVar))) {
            j0 j0Var = new j0(iVarO, fVar);
            E3.i iVar3 = j0Var.f2408n;
            Object objM = a4.a.m(iVar3, null);
            try {
                return AbstractC0149a.H(j0Var, j0Var, pVar);
            } finally {
                a4.a.g(iVar3, objM);
            }
        }
        C0148z c0148z = new C0148z(fVar, iVarO);
        Z1.f.M(pVar, c0148z, c0148z);
        do {
            atomicIntegerFieldUpdater = C0148z.f2456p;
            int i5 = atomicIntegerFieldUpdater.get(c0148z);
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object objO = o(c0148z.F());
                if (objO instanceof C0137n) {
                    throw ((C0137n) objO).f2433a;
                }
                return objO;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c0148z, 0, 1));
        return F3.a.f861l;
    }
}
