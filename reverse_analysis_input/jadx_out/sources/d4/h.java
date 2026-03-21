package d4;

import F0.p;
import L.K;
import M3.l;
import a4.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5437b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f5438c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5439d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f5440e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f5441f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f5442a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public h(int i) {
        if (i < 0 || i > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        j jVar = new j(0L, null, 2);
        this.head = jVar;
        this.tail = jVar;
        this._availablePermits = 1 - i;
        this.f5442a = new K(this, 3);
    }

    public final void a(c cVar) {
        Object objB;
        f fVar;
        long j5;
        while (true) {
            int andDecrement = f5441f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = B3.g.f275a;
                l lVar = this.f5442a;
                if (andDecrement > 0) {
                    cVar.g(obj, lVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5439d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f5440e.getAndIncrement(this);
                f fVar2 = f.f5435t;
                long j6 = andIncrement / ((long) i.f5448f);
                while (true) {
                    objB = a4.a.b(jVar, j6, fVar2);
                    if (!a4.a.e(objB)) {
                        u uVarC = a4.a.c(objB);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            fVar = fVar2;
                            j5 = j6;
                            if (uVar.f3625n >= uVarC.f3625n) {
                                break;
                            }
                            if (!uVarC.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVarC)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (uVarC.e()) {
                                        uVarC.d();
                                    }
                                    fVar2 = fVar;
                                    j6 = j5;
                                }
                            }
                            if (uVar.e()) {
                                uVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                    fVar2 = fVar;
                    j6 = j5;
                }
                j jVar2 = (j) a4.a.c(objB);
                int i = (int) (andIncrement % ((long) i.f5448f));
                AtomicReferenceArray atomicReferenceArray = jVar2.f5449p;
                while (!atomicReferenceArray.compareAndSet(i, null, cVar)) {
                    if (atomicReferenceArray.get(i) != null) {
                        p pVar = i.f5444b;
                        p pVar2 = i.f5445c;
                        while (!atomicReferenceArray.compareAndSet(i, pVar, pVar2)) {
                            if (atomicReferenceArray.get(i) != pVar) {
                                break;
                            }
                        }
                        cVar.g(obj, lVar);
                        return;
                    }
                }
                cVar.a(jVar2, i);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.h.b():void");
    }
}
