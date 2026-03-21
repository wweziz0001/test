package a4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3589a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f3583a;

    @Override // a4.q
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3589a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        F0.p pVar = a.f3583a;
        if (obj2 == pVar) {
            F0.p pVarC = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == pVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, pVar, pVarC)) {
                        obj2 = pVarC;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != pVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract F0.p c(Object obj);
}
