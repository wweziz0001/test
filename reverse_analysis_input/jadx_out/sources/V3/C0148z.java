package V3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: V3.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0148z extends a4.t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2456p = AtomicIntegerFieldUpdater.newUpdater(C0148z.class, "_decision");
    private volatile int _decision;

    @Override // a4.t, V3.Z
    public final void r(Object obj) {
        s(obj);
    }

    @Override // a4.t, V3.Z
    public final void s(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f2456p;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                a4.a.h(Z1.f.A(this.f3623o), AbstractC0144v.k(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
