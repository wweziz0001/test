package X3;

import L.K;
import V3.AbstractC0124a;
import V3.AbstractC0144v;
import V3.C0137n;
import V3.Q;
import V3.X;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractC0124a implements r, h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f2676o;

    public q(E3.i iVar, d dVar) {
        super(iVar, true);
        this.f2676o = dVar;
    }

    @Override // V3.AbstractC0124a
    public final void V(Throwable th, boolean z4) {
        if (this.f2676o.h(th, false) || z4) {
            return;
        }
        AbstractC0144v.g(this.f2408n, th);
    }

    @Override // V3.AbstractC0124a
    public final void W(Object obj) {
        this.f2676o.h(null, false);
    }

    public final void Y(K k4) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        d dVar = this.f2676o;
        dVar.getClass();
        do {
            atomicReferenceFieldUpdater = d.f2642v;
            if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, k4)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(dVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(dVar);
            F0.p pVar = f.f2661q;
            if (obj != pVar) {
                if (obj == f.f2662r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            F0.p pVar2 = f.f2662r;
            while (!atomicReferenceFieldUpdater.compareAndSet(dVar, pVar, pVar2)) {
                if (atomicReferenceFieldUpdater.get(dVar) != pVar) {
                    break;
                }
            }
            k4.c(dVar.o());
            return;
        }
    }

    @Override // V3.Z, V3.P
    public final void b(CancellationException cancellationException) {
        Object objF = F();
        if (objF instanceof C0137n) {
            return;
        }
        if ((objF instanceof X) && ((X) objF).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new Q(w(), null, this);
        }
        u(cancellationException);
    }

    @Override // X3.t
    public final Object d() {
        return this.f2676o.d();
    }

    @Override // X3.u
    public final Object e(Object obj) {
        return this.f2676o.e(obj);
    }

    @Override // X3.t
    public final Object m(Z3.l lVar) {
        d dVar = this.f2676o;
        dVar.getClass();
        return d.A(dVar, lVar);
    }

    @Override // X3.u
    public final Object n(E3.d dVar, Object obj) {
        return this.f2676o.n(dVar, obj);
    }

    @Override // V3.Z
    public final void u(CancellationException cancellationException) {
        this.f2676o.h(cancellationException, true);
        t(cancellationException);
    }
}
