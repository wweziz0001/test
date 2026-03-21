package V3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: V3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0129f extends A implements InterfaceC0128e, G3.c, l0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2414q = AtomicIntegerFieldUpdater.newUpdater(C0129f.class, "_decisionAndIndex");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2415r = AtomicReferenceFieldUpdater.newUpdater(C0129f.class, Object.class, "_state");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2416s = AtomicReferenceFieldUpdater.newUpdater(C0129f.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final E3.d f2417o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final E3.i f2418p;

    public C0129f(int i, E3.d dVar) {
        super(i);
        this.f2417o = dVar;
        this.f2418p = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C0125b.f2409l;
    }

    public static Object C(c0 c0Var, Object obj, int i, M3.l lVar) {
        if ((obj instanceof C0137n) || !AbstractC0144v.i(i)) {
            return obj;
        }
        if (lVar != null || (c0Var instanceof D)) {
            return new C0136m(obj, c0Var instanceof D ? (D) c0Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void y(c0 c0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + c0Var + ", already has " + obj).toString());
    }

    public final void A() {
        E3.d dVar = this.f2417o;
        Throwable th = null;
        a4.h hVar = dVar instanceof a4.h ? (a4.h) dVar : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a4.h.f3596s;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                F0.p pVar = a4.a.f3586d;
                if (obj == pVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, pVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != pVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            q();
            o(th);
        }
    }

    public final void B(Object obj, int i, M3.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2415r;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof c0) {
                Object objC = C((c0) obj2, obj, i, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    q();
                }
                r(i);
                return;
            }
            if (obj2 instanceof C0130g) {
                C0130g c0130g = (C0130g) obj2;
                c0130g.getClass();
                if (C0130g.f2419c.compareAndSet(c0130g, 0, 1)) {
                    if (lVar != null) {
                        m(lVar, c0130g.f2433a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // V3.l0
    public final void a(a4.u uVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f2414q;
            i5 = atomicIntegerFieldUpdater.get(this);
            if ((i5 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, ((i5 >> 29) << 29) + i));
        w(uVar);
    }

    @Override // V3.A
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2415r;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof c0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0137n) {
                return;
            }
            if (!(obj2 instanceof C0136m)) {
                C0136m c0136m = new C0136m(obj2, (D) null, (M3.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0136m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0136m c0136m2 = (C0136m) obj2;
            if (c0136m2.f2430e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0136m c0136mA = C0136m.a(c0136m2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0136mA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            D d5 = c0136m2.f2427b;
            if (d5 != null) {
                l(d5, cancellationException);
            }
            M3.l lVar = c0136m2.f2428c;
            if (lVar != null) {
                m(lVar, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // V3.A
    public final E3.d c() {
        return this.f2417o;
    }

    @Override // V3.A
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // V3.A
    public final Object e(Object obj) {
        return obj instanceof C0136m ? ((C0136m) obj).f2426a : obj;
    }

    @Override // G3.c
    public final G3.c f() {
        E3.d dVar = this.f2417o;
        if (dVar instanceof G3.c) {
            return (G3.c) dVar;
        }
        return null;
    }

    @Override // V3.InterfaceC0128e
    public final void g(Object obj, M3.l lVar) {
        B(obj, this.f2371n, lVar);
    }

    @Override // E3.d
    public final E3.i getContext() {
        return this.f2418p;
    }

    @Override // V3.InterfaceC0128e
    public final F0.p h(Object obj, M3.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2415r;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z4 = obj2 instanceof c0;
            F0.p pVar = AbstractC0144v.f2445a;
            if (!z4) {
                boolean z5 = obj2 instanceof C0136m;
                return null;
            }
            Object objC = C((c0) obj2, obj, this.f2371n, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objC)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (x()) {
                return pVar;
            }
            q();
            return pVar;
        }
    }

    @Override // E3.d
    public final void j(Object obj) {
        Throwable thA = B3.d.a(obj);
        if (thA != null) {
            obj = new C0137n(thA, false);
        }
        B(obj, this.f2371n, null);
    }

    @Override // V3.A
    public final Object k() {
        return f2415r.get(this);
    }

    public final void l(D d5, Throwable th) {
        try {
            d5.a(th);
        } catch (Throwable th2) {
            AbstractC0144v.g(this.f2418p, new A1.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(M3.l lVar, Throwable th) {
        try {
            lVar.c(th);
        } catch (Throwable th2) {
            AbstractC0144v.g(this.f2418p, new A1.c("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(a4.u uVar, Throwable th) {
        E3.i iVar = this.f2418p;
        int i = f2414q.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            uVar.g(i, iVar);
        } catch (Throwable th2) {
            AbstractC0144v.g(iVar, new A1.c("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2415r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof c0) {
                C0130g c0130g = new C0130g(this, th, (obj instanceof D) || (obj instanceof a4.u));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0130g)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                c0 c0Var = (c0) obj;
                if (c0Var instanceof D) {
                    l((D) obj, th);
                } else if (c0Var instanceof a4.u) {
                    n((a4.u) obj, th);
                }
                if (!x()) {
                    q();
                }
                r(this.f2371n);
                return;
            }
            return;
        }
    }

    @Override // V3.InterfaceC0128e
    public final void p(Object obj) {
        r(this.f2371n);
    }

    public final void q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2416s;
        C c5 = (C) atomicReferenceFieldUpdater.get(this);
        if (c5 == null) {
            return;
        }
        c5.b();
        atomicReferenceFieldUpdater.set(this, b0.f2410l);
    }

    public final void r(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f2414q;
            i5 = atomicIntegerFieldUpdater.get(this);
            int i6 = i5 >> 29;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z4 = i == 4;
                E3.d dVar = this.f2417o;
                if (z4 || !(dVar instanceof a4.h) || AbstractC0144v.i(i) != AbstractC0144v.i(this.f2371n)) {
                    AbstractC0144v.l(this, dVar, z4);
                    return;
                }
                AbstractC0141s abstractC0141s = ((a4.h) dVar).f3597o;
                E3.i context = ((a4.h) dVar).f3598p.getContext();
                if (abstractC0141s.q()) {
                    abstractC0141s.n(context, this);
                    return;
                }
                H hA = h0.a();
                if (hA.v()) {
                    hA.s(this);
                    return;
                }
                hA.u(true);
                try {
                    AbstractC0144v.l(this, dVar, true);
                    do {
                    } while (hA.x());
                } finally {
                    try {
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 1073741824 + (536870911 & i5)));
    }

    public Throwable s(Z z4) {
        return z4.B();
    }

    public final Object t() throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean zX = x();
        do {
            atomicIntegerFieldUpdater = f2414q;
            i = atomicIntegerFieldUpdater.get(this);
            int i5 = i >> 29;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zX) {
                    A();
                }
                Object obj = f2415r.get(this);
                if (obj instanceof C0137n) {
                    throw ((C0137n) obj).f2433a;
                }
                if (AbstractC0144v.i(this.f2371n)) {
                    P p4 = (P) this.f2418p.l(C0142t.f2444m);
                    if (p4 != null && !p4.a()) {
                        CancellationException cancellationExceptionB = ((Z) p4).B();
                        b(obj, cancellationExceptionB);
                        throw cancellationExceptionB;
                    }
                }
                return e(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((C) f2416s.get(this)) == null) {
            v();
        }
        if (zX) {
            A();
        }
        return F3.a.f861l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(z());
        sb.append('(');
        sb.append(AbstractC0144v.n(this.f2417o));
        sb.append("){");
        Object obj = f2415r.get(this);
        sb.append(obj instanceof c0 ? "Active" : obj instanceof C0130g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0144v.e(this));
        return sb.toString();
    }

    public final void u() {
        C cV = v();
        if (cV == null || (f2415r.get(this) instanceof c0)) {
            return;
        }
        cV.b();
        f2416s.set(this, b0.f2410l);
    }

    public final C v() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        P p4 = (P) this.f2418p.l(C0142t.f2444m);
        if (p4 == null) {
            return null;
        }
        C cH = AbstractC0144v.h(p4, true, new C0131h(this), 2);
        do {
            atomicReferenceFieldUpdater = f2416s;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, cH)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return cH;
    }

    public final void w(c0 c0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2415r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0125b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof D ? true : obj instanceof a4.u) {
                y(c0Var, obj);
                throw null;
            }
            if (obj instanceof C0137n) {
                C0137n c0137n = (C0137n) obj;
                c0137n.getClass();
                if (!C0137n.f2432b.compareAndSet(c0137n, 0, 1)) {
                    y(c0Var, obj);
                    throw null;
                }
                if (obj instanceof C0130g) {
                    if (!(obj instanceof C0137n)) {
                        c0137n = null;
                    }
                    Throwable th = c0137n != null ? c0137n.f2433a : null;
                    if (c0Var instanceof D) {
                        l((D) c0Var, th);
                        return;
                    } else {
                        N3.h.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        n((a4.u) c0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0136m)) {
                if (c0Var instanceof a4.u) {
                    return;
                }
                N3.h.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0136m c0136m = new C0136m(obj, (D) c0Var, (M3.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0136m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0136m c0136m2 = (C0136m) obj;
            if (c0136m2.f2427b != null) {
                y(c0Var, obj);
                throw null;
            }
            if (c0Var instanceof a4.u) {
                return;
            }
            N3.h.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            D d5 = (D) c0Var;
            Throwable th2 = c0136m2.f2430e;
            if (th2 != null) {
                l(d5, th2);
                return;
            }
            C0136m c0136mA = C0136m.a(c0136m2, d5, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0136mA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean x() {
        if (this.f2371n == 2) {
            E3.d dVar = this.f2417o;
            N3.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (a4.h.f3596s.get((a4.h) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public String z() {
        return "CancellableContinuation";
    }
}
