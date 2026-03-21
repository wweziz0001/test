package a4;

import V3.c0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class u extends d implements c0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3624o = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f3625n;

    public u(long j5, u uVar, int i) {
        super(uVar);
        this.f3625n = j5;
        this.cleanedAndPointers = i << 16;
    }

    @Override // a4.d
    public final boolean c() {
        return f3624o.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f3624o.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, E3.i iVar);

    public final void h() {
        if (f3624o.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f3624o;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
