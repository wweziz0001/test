package c4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5107b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5108c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5109d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5110e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f5111a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final h a(h hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5108c;
        if (atomicIntegerFieldUpdater.get(this) - f5109d.get(this) == 127) {
            return hVar;
        }
        if (hVar.f5095m.f5096a == 1) {
            f5110e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f5111a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final h b() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5109d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f5108c.get(this) == 0) {
                return null;
            }
            int i5 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (hVar = (h) this.f5111a.getAndSet(i5, null)) != null) {
                if (hVar.f5095m.f5096a == 1) {
                    f5110e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final h c(int i, boolean z4) {
        int i5 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f5111a;
        h hVar = (h) atomicReferenceArray.get(i5);
        if (hVar != null) {
            if ((hVar.f5095m.f5096a == 1) == z4) {
                while (!atomicReferenceArray.compareAndSet(i5, hVar, null)) {
                    if (atomicReferenceArray.get(i5) != hVar) {
                    }
                }
                if (z4) {
                    f5110e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }
}
