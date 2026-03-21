package d4;

import F0.p;
import V3.AbstractC0144v;
import V3.C0129f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h implements a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f5433g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z4) {
        super(z4 ? 1 : 0);
        this.owner = z4 ? null : e.f5434a;
    }

    public final Object c(G3.b bVar) throws Throwable {
        boolean zD = d(null);
        B3.g gVar = B3.g.f275a;
        if (zD) {
            return gVar;
        }
        C0129f c0129fF = AbstractC0144v.f(Z1.f.A(bVar));
        try {
            a(new c(this, c0129fF));
            Object objT = c0129fF.t();
            F3.a aVar = F3.a.f861l;
            if (objT != aVar) {
                objT = gVar;
            }
            return objT == aVar ? objT : gVar;
        } catch (Throwable th) {
            c0129fF.A();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r0 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.lang.Object r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = d4.h.f5441f
            int r1 = r0.get(r7)
            r2 = 1
            if (r1 <= r2) goto L16
        L9:
            int r1 = r0.get(r7)
            if (r1 <= r2) goto L0
            boolean r1 = r0.compareAndSet(r7, r1, r2)
            if (r1 == 0) goto L9
            goto L0
        L16:
            r3 = 0
            r4 = 2
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = d4.d.f5433g
            if (r1 > 0) goto L40
            if (r8 != 0) goto L20
        L1e:
            r0 = r2
            goto L4c
        L20:
            int r1 = r0.get(r7)
            int r1 = java.lang.Math.max(r1, r3)
            if (r1 != 0) goto L38
            java.lang.Object r1 = r5.get(r7)
            F0.p r6 = d4.e.f5434a
            if (r1 == r6) goto L20
            if (r1 != r8) goto L36
            r0 = r2
            goto L39
        L36:
            r0 = r4
            goto L39
        L38:
            r0 = r3
        L39:
            if (r0 == r2) goto L3e
            if (r0 == r4) goto L1e
            goto L0
        L3e:
            r0 = r4
            goto L4c
        L40:
            int r6 = r1 + (-1)
            boolean r0 = r0.compareAndSet(r7, r1, r6)
            if (r0 == 0) goto L0
            r5.set(r7, r8)
            r0 = r3
        L4c:
            if (r0 == 0) goto L73
            if (r0 == r2) goto L72
            if (r0 == r4) goto L5a
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r8.<init>(r0)
            throw r8
        L5a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "This mutex is already locked by the specified owner: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L72:
            r2 = r3
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.d.d(java.lang.Object):boolean");
    }

    public final void e(Object obj) {
        while (Math.max(h.f5441f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5433g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            p pVar = e.f5434a;
            if (obj2 != pVar) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, pVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    b();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC0144v.e(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f5441f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f5433g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
