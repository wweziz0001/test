package b2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i4.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4893f;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f4889b = atomicReferenceFieldUpdater;
        this.f4890c = atomicReferenceFieldUpdater2;
        this.f4891d = atomicReferenceFieldUpdater3;
        this.f4892e = atomicReferenceFieldUpdater4;
        this.f4893f = atomicReferenceFieldUpdater5;
    }

    @Override // i4.a
    public final void L(h hVar, h hVar2) {
        this.f4890c.lazySet(hVar, hVar2);
    }

    @Override // i4.a
    public final void M(h hVar, Thread thread) {
        this.f4889b.lazySet(hVar, thread);
    }

    @Override // i4.a
    public final boolean g(i iVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4892e;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == dVar);
        return false;
    }

    @Override // i4.a
    public final boolean h(i iVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4893f;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == obj);
        return false;
    }

    @Override // i4.a
    public final boolean i(i iVar, h hVar, h hVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4891d;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == hVar);
        return false;
    }
}
