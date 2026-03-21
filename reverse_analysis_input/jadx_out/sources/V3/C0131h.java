package V3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: V3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0131h extends S {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0129f f2420p;

    public C0131h(C0129f c0129f) {
        this.f2420p = c0129f;
    }

    @Override // M3.l
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        o((Throwable) obj);
        return B3.g.f275a;
    }

    @Override // V3.U
    public final void o(Throwable th) {
        Z zN = n();
        C0129f c0129f = this.f2420p;
        Throwable thS = c0129f.s(zN);
        if (c0129f.x()) {
            E3.d dVar = c0129f.f2417o;
            N3.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            a4.h hVar = (a4.h) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a4.h.f3596s;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                F0.p pVar = a4.a.f3586d;
                if (!N3.h.a(obj, pVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, pVar, thS)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != pVar) {
                        break;
                    }
                }
                return;
            }
        }
        c0129f.o(thS);
        if (c0129f.x()) {
            return;
        }
        c0129f.q();
    }
}
