package V3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class N extends S {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2386q = AtomicIntegerFieldUpdater.newUpdater(N.class, "_invoked");
    private volatile int _invoked;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final M3.l f2387p;

    public N(M3.l lVar) {
        this.f2387p = lVar;
    }

    @Override // M3.l
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        o((Throwable) obj);
        return B3.g.f275a;
    }

    @Override // V3.U
    public final void o(Throwable th) {
        if (f2386q.compareAndSet(this, 0, 1)) {
            this.f2387p.c(th);
        }
    }
}
