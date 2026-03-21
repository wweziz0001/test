package V3;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: V3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0126c extends AbstractC0124a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Thread f2411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final H f2412p;

    public C0126c(E3.i iVar, Thread thread, H h2) {
        super(iVar, true);
        this.f2411o = thread;
        this.f2412p = h2;
    }

    @Override // V3.Z
    public final void r(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f2411o;
        if (N3.h.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
