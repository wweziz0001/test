package V3;

import a.AbstractC0149a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class Z implements P, d0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2406l = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_state");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2407m = AtomicReferenceFieldUpdater.newUpdater(Z.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public Z(boolean z4) {
        this._state = z4 ? AbstractC0144v.i : AbstractC0144v.f2452h;
    }

    public static C0133j N(a4.k kVar) {
        while (kVar.m()) {
            a4.k kVarH = kVar.h();
            if (kVarH == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a4.k.f3607m;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (a4.k) obj;
                    if (!kVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = kVarH;
            }
        }
        while (true) {
            kVar = kVar.l();
            if (!kVar.m()) {
                if (kVar instanceof C0133j) {
                    return (C0133j) kVar;
                }
                if (kVar instanceof a0) {
                    return null;
                }
            }
        }
    }

    public static String T(Object obj) {
        if (!(obj instanceof X)) {
            return obj instanceof L ? ((L) obj).a() ? "Active" : "New" : obj instanceof C0137n ? "Cancelled" : "Completed";
        }
        X x4 = (X) obj;
        return x4.d() ? "Cancelling" : x4.e() ? "Completing" : "Active";
    }

    public final Object A(X x4, Object obj) {
        Object obj2 = null;
        Throwable q4 = null;
        C0137n c0137n = obj instanceof C0137n ? (C0137n) obj : null;
        Throwable th = c0137n != null ? c0137n.f2433a : null;
        synchronized (x4) {
            x4.d();
            ArrayList<Throwable> arrayListF = x4.f(th);
            if (!arrayListF.isEmpty()) {
                Iterator it = arrayListF.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        obj2 = next;
                        break;
                    }
                }
                q4 = (Throwable) obj2;
                if (q4 == null) {
                    q4 = (Throwable) arrayListF.get(0);
                }
            } else if (x4.d()) {
                q4 = new Q(w(), null, this);
            }
            if (q4 != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                for (Throwable th2 : arrayListF) {
                    if (th2 != q4 && th2 != q4 && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC0149a.c(q4, th2);
                    }
                }
            }
        }
        if (q4 != null && q4 != th) {
            obj = new C0137n(q4, false);
        }
        if (q4 != null && (v(q4) || G(q4))) {
            N3.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0137n.f2432b.compareAndSet((C0137n) obj, 0, 1);
        }
        P(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2406l;
        Object m4 = obj instanceof L ? new M((L) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, x4, m4) && atomicReferenceFieldUpdater.get(this) == x4) {
        }
        y(x4, obj);
        return obj;
    }

    public final CancellationException B() {
        CancellationException cancellationException;
        Object objF = F();
        if (!(objF instanceof X)) {
            if (objF instanceof L) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objF instanceof C0137n)) {
                return new Q(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0137n) objF).f2433a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new Q(w(), th, this) : cancellationException;
        }
        Throwable thC = ((X) objF).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = w();
        }
        return new Q(strConcat, thC, this);
    }

    public boolean C() {
        return true;
    }

    public boolean D() {
        return this instanceof C0135l;
    }

    public final a0 E(L l3) {
        a0 a0VarG = l3.g();
        if (a0VarG != null) {
            return a0VarG;
        }
        if (l3 instanceof E) {
            return new a0();
        }
        if (l3 instanceof U) {
            R((U) l3);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + l3).toString());
    }

    public final Object F() {
        while (true) {
            Object obj = f2406l.get(this);
            if (!(obj instanceof a4.q)) {
                return obj;
            }
            ((a4.q) obj).a(this);
        }
    }

    public boolean G(Throwable th) {
        return false;
    }

    public final void I(P p4) {
        int iS;
        b0 b0Var = b0.f2410l;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2407m;
        if (p4 == null) {
            atomicReferenceFieldUpdater.set(this, b0Var);
            return;
        }
        Z z4 = (Z) p4;
        do {
            iS = z4.S(z4.F());
            if (iS == 0) {
                break;
            }
        } while (iS != 1);
        InterfaceC0132i interfaceC0132i = (InterfaceC0132i) AbstractC0144v.h(z4, true, new C0133j(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0132i);
        if (F() instanceof L) {
            return;
        }
        interfaceC0132i.b();
        atomicReferenceFieldUpdater.set(this, b0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V3.C J(boolean r8, boolean r9, M3.l r10) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V3.Z.J(boolean, boolean, M3.l):V3.C");
    }

    public boolean K() {
        return this instanceof C0126c;
    }

    public final boolean L(Object obj) {
        Object objU;
        do {
            objU = U(F(), obj);
            if (objU == AbstractC0144v.f2447c) {
                return false;
            }
            if (objU == AbstractC0144v.f2448d) {
                return true;
            }
        } while (objU == AbstractC0144v.f2449e);
        r(objU);
        return true;
    }

    public final Object M(Object obj) {
        Object objU;
        do {
            objU = U(F(), obj);
            if (objU == AbstractC0144v.f2447c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0137n c0137n = obj instanceof C0137n ? (C0137n) obj : null;
                throw new IllegalStateException(str, c0137n != null ? c0137n.f2433a : null);
            }
        } while (objU == AbstractC0144v.f2449e);
        return objU;
    }

    public final void O(a0 a0Var, Throwable th) {
        Object objK = a0Var.k();
        N3.h.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        A1.c cVar = null;
        for (a4.k kVarL = (a4.k) objK; !kVarL.equals(a0Var); kVarL = kVarL.l()) {
            if (kVarL instanceof S) {
                U u4 = (U) kVarL;
                try {
                    u4.o(th);
                } catch (Throwable th2) {
                    if (cVar != null) {
                        AbstractC0149a.c(cVar, th2);
                    } else {
                        cVar = new A1.c("Exception in completion handler " + u4 + " for " + this, th2);
                    }
                }
            }
        }
        if (cVar != null) {
            H(cVar);
        }
        v(th);
    }

    public final void R(U u4) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a0 a0Var = new a0();
        u4.getClass();
        a4.k.f3607m.lazySet(a0Var, u4);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a4.k.f3606l;
        atomicReferenceFieldUpdater2.lazySet(a0Var, u4);
        loop0: while (true) {
            if (u4.k() == u4) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(u4, u4, a0Var)) {
                    if (atomicReferenceFieldUpdater2.get(u4) != u4) {
                        break;
                    }
                }
                a0Var.j(u4);
                break loop0;
            }
            break;
        }
        a4.k kVarL = u4.l();
        do {
            atomicReferenceFieldUpdater = f2406l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, u4, kVarL)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == u4);
    }

    public final int S(Object obj) {
        boolean z4 = obj instanceof E;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2406l;
        if (z4) {
            if (((E) obj).f2375l) {
                return 0;
            }
            E e5 = AbstractC0144v.i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e5)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof K)) {
            return 0;
        }
        a0 a0Var = ((K) obj).f2384l;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object U(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof L)) {
            return AbstractC0144v.f2447c;
        }
        if (((obj instanceof E) || (obj instanceof U)) && !(obj instanceof C0133j) && !(obj2 instanceof C0137n)) {
            L l3 = (L) obj;
            Object m4 = obj2 instanceof L ? new M((L) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f2406l;
                if (atomicReferenceFieldUpdater.compareAndSet(this, l3, m4)) {
                    P(obj2);
                    y(l3, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == l3);
            return AbstractC0144v.f2449e;
        }
        L l4 = (L) obj;
        a0 a0VarE = E(l4);
        if (a0VarE == null) {
            return AbstractC0144v.f2449e;
        }
        C0133j c0133jN = null;
        X x4 = l4 instanceof X ? (X) l4 : null;
        if (x4 == null) {
            x4 = new X(a0VarE, null);
        }
        synchronized (x4) {
            if (x4.e()) {
                return AbstractC0144v.f2447c;
            }
            X.f2398m.set(x4, 1);
            if (x4 != l4) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2406l;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, l4, x4)) {
                    if (atomicReferenceFieldUpdater2.get(this) != l4) {
                        return AbstractC0144v.f2449e;
                    }
                }
            }
            boolean zD = x4.d();
            C0137n c0137n = obj2 instanceof C0137n ? (C0137n) obj2 : null;
            if (c0137n != null) {
                x4.b(c0137n.f2433a);
            }
            Throwable thC = x4.c();
            if (zD) {
                thC = null;
            }
            if (thC != null) {
                O(a0VarE, thC);
            }
            C0133j c0133j = l4 instanceof C0133j ? (C0133j) l4 : null;
            if (c0133j == null) {
                a0 a0VarG = l4.g();
                if (a0VarG != null) {
                    c0133jN = N(a0VarG);
                }
            } else {
                c0133jN = c0133j;
            }
            if (c0133jN != null) {
                while (AbstractC0144v.h(c0133jN.f2423p, false, new W(this, x4, c0133jN, obj2), 1) == b0.f2410l) {
                    c0133jN = N(c0133jN);
                    if (c0133jN == null) {
                    }
                }
                return AbstractC0144v.f2448d;
            }
            return A(x4, obj2);
        }
    }

    @Override // V3.P
    public boolean a() {
        Object objF = F();
        return (objF instanceof L) && ((L) objF).a();
    }

    @Override // V3.P
    public void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new Q(w(), null, this);
        }
        u(cancellationException);
    }

    @Override // E3.i
    public final E3.i c(E3.h hVar) {
        return D1.b.H(this, hVar);
    }

    @Override // E3.g
    public final E3.h getKey() {
        return C0142t.f2444m;
    }

    @Override // E3.i
    public final Object k(Object obj, M3.p pVar) {
        return pVar.i(obj, this);
    }

    @Override // E3.i
    public final E3.g l(E3.h hVar) {
        return D1.b.A(this, hVar);
    }

    @Override // E3.i
    public final E3.i o(E3.i iVar) {
        return D1.b.K(this, iVar);
    }

    public final boolean q(L l3, a0 a0Var, U u4) {
        char c5;
        Y y = new Y(u4, this, l3);
        do {
            a4.k kVarH = a0Var.h();
            if (kVarH == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a4.k.f3607m;
                Object obj = atomicReferenceFieldUpdater.get(a0Var);
                while (true) {
                    kVarH = (a4.k) obj;
                    if (!kVarH.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVarH);
                }
            }
            a4.k.f3607m.lazySet(u4, kVarH);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a4.k.f3606l;
            atomicReferenceFieldUpdater2.lazySet(u4, a0Var);
            y.f2403c = a0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(kVarH, a0Var, y)) {
                    c5 = y.a(kVarH) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(kVarH) != a0Var) {
                    c5 = 0;
                    break;
                }
            }
            if (c5 == 1) {
                return true;
            }
        } while (c5 != 2);
        return false;
    }

    public void s(Object obj) {
        r(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        r0 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V3.Z.t(java.lang.Object):boolean");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + T(F()) + '}');
        sb.append('@');
        sb.append(AbstractC0144v.e(this));
        return sb.toString();
    }

    public void u(CancellationException cancellationException) {
        t(cancellationException);
    }

    public final boolean v(Throwable th) {
        if (K()) {
            return true;
        }
        boolean z4 = th instanceof CancellationException;
        InterfaceC0132i interfaceC0132i = (InterfaceC0132i) f2407m.get(this);
        return (interfaceC0132i == null || interfaceC0132i == b0.f2410l) ? z4 : interfaceC0132i.f(th) || z4;
    }

    public String w() {
        return "Job was cancelled";
    }

    public boolean x(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return t(th) && C();
    }

    public final void y(L l3, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2407m;
        InterfaceC0132i interfaceC0132i = (InterfaceC0132i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0132i != null) {
            interfaceC0132i.b();
            atomicReferenceFieldUpdater.set(this, b0.f2410l);
        }
        A1.c cVar = null;
        C0137n c0137n = obj instanceof C0137n ? (C0137n) obj : null;
        Throwable th = c0137n != null ? c0137n.f2433a : null;
        if (l3 instanceof U) {
            try {
                ((U) l3).o(th);
                return;
            } catch (Throwable th2) {
                H(new A1.c("Exception in completion handler " + l3 + " for " + this, th2));
                return;
            }
        }
        a0 a0VarG = l3.g();
        if (a0VarG != null) {
            Object objK = a0VarG.k();
            N3.h.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (a4.k kVarL = (a4.k) objK; !kVarL.equals(a0VarG); kVarL = kVarL.l()) {
                if (kVarL instanceof U) {
                    U u4 = (U) kVarL;
                    try {
                        u4.o(th);
                    } catch (Throwable th3) {
                        if (cVar != null) {
                            AbstractC0149a.c(cVar, th3);
                        } else {
                            cVar = new A1.c("Exception in completion handler " + u4 + " for " + this, th3);
                        }
                    }
                }
            }
            if (cVar != null) {
                H(cVar);
            }
        }
    }

    public final Throwable z(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        Z z4 = (Z) ((d0) obj);
        Object objF = z4.F();
        if (objF instanceof X) {
            thC = ((X) objF).c();
        } else if (objF instanceof C0137n) {
            thC = ((C0137n) objF).f2433a;
        } else {
            if (objF instanceof L) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objF).toString());
            }
            thC = null;
        }
        CancellationException q4 = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (q4 == null) {
            q4 = new Q("Parent job is ".concat(T(objF)), thC, z4);
        }
        return q4;
    }

    public void Q() {
    }

    public void H(A1.c cVar) {
        throw cVar;
    }

    public void P(Object obj) {
    }

    public void r(Object obj) {
    }
}
