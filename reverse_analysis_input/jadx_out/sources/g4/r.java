package g4;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f5873a = new q(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f5874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f5875c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f5874b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f5875c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        N3.h.e(qVar, "segment");
        if (qVar.f5871f != null || qVar.f5872g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (qVar.f5869d) {
            return;
        }
        AtomicReference atomicReference = f5875c[(int) (Thread.currentThread().getId() & (((long) f5874b) - 1))];
        q qVar2 = f5873a;
        q qVar3 = (q) atomicReference.getAndSet(qVar2);
        if (qVar3 == qVar2) {
            return;
        }
        int i = qVar3 != null ? qVar3.f5868c : 0;
        if (i >= 65536) {
            atomicReference.set(qVar3);
            return;
        }
        qVar.f5871f = qVar3;
        qVar.f5867b = 0;
        qVar.f5868c = i + 8192;
        atomicReference.set(qVar);
    }

    public static final q b() {
        AtomicReference atomicReference = f5875c[(int) (Thread.currentThread().getId() & (((long) f5874b) - 1))];
        q qVar = f5873a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f5871f);
        qVar2.f5871f = null;
        qVar2.f5868c = 0;
        return qVar2;
    }
}
