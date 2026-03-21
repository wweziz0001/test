package V3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class U extends a4.k implements C, L, M3.l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Z f2392o;

    @Override // V3.L
    public final boolean a() {
        return true;
    }

    @Override // V3.C
    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        Z zN = n();
        while (true) {
            Object objF = zN.F();
            if (objF instanceof U) {
                if (objF != this) {
                    return;
                }
                E e5 = AbstractC0144v.i;
                do {
                    atomicReferenceFieldUpdater2 = Z.f2406l;
                    if (atomicReferenceFieldUpdater2.compareAndSet(zN, objF, e5)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(zN) == objF);
            } else {
                if (!(objF instanceof L) || ((L) objF).g() == null) {
                    return;
                }
                while (true) {
                    Object objK = k();
                    if (objK instanceof a4.r) {
                        a4.k kVar = ((a4.r) objK).f3622a;
                        return;
                    }
                    if (objK == this) {
                        return;
                    }
                    N3.h.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    a4.k kVar2 = (a4.k) objK;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = a4.k.f3608n;
                    a4.r rVar = (a4.r) atomicReferenceFieldUpdater3.get(kVar2);
                    if (rVar == null) {
                        rVar = new a4.r(kVar2);
                        atomicReferenceFieldUpdater3.lazySet(kVar2, rVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = a4.k.f3606l;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, objK, rVar)) {
                            kVar2.h();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == objK);
                }
            }
        }
    }

    @Override // V3.L
    public final a0 g() {
        return null;
    }

    public P getParent() {
        return n();
    }

    public final Z n() {
        Z z4 = this.f2392o;
        if (z4 != null) {
            return z4;
        }
        N3.h.g("job");
        throw null;
    }

    public abstract void o(Throwable th);

    @Override // a4.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0144v.e(this) + "[job@" + AbstractC0144v.e(n()) + ']';
    }
}
