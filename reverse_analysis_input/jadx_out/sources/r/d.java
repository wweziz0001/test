package r;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class d extends D1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f9386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f9387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f9388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f9389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f9390e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f9386a = atomicReferenceFieldUpdater;
        this.f9387b = atomicReferenceFieldUpdater2;
        this.f9388c = atomicReferenceFieldUpdater3;
        this.f9389d = atomicReferenceFieldUpdater4;
        this.f9390e = atomicReferenceFieldUpdater5;
    }

    @Override // D1.b
    public final void L(f fVar, f fVar2) {
        this.f9387b.lazySet(fVar, fVar2);
    }

    @Override // D1.b
    public final void M(f fVar, Thread thread) {
        this.f9386a.lazySet(fVar, thread);
    }

    @Override // D1.b
    public final boolean h(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f9389d;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // D1.b
    public final boolean i(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f9390e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // D1.b
    public final boolean j(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f9388c;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
