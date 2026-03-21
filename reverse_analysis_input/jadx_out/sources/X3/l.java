package X3;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class l extends a4.u {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f2670p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicReferenceArray f2671q;

    public l(long j5, l lVar, d dVar, int i) {
        super(j5, lVar, i);
        this.f2670p = dVar;
        this.f2671q = new AtomicReferenceArray(f.f2647b * 2);
    }

    @Override // a4.u
    public final int f() {
        return f.f2647b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        if (r1 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        N3.h.b(r4);
        r7 = r4.f2644m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
    
        if (r7 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
    
        r7 = a4.a.a(r7, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006b, code lost:
    
        if (r7 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006d, code lost:
    
        V3.AbstractC0144v.g(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
    
        return;
     */
    @Override // a4.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r7, E3.i r8) {
        /*
            r6 = this;
            int r0 = X3.f.f2647b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f2671q
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.k(r7)
            boolean r3 = r2 instanceof V3.l0
            X3.d r4 = r6.f2670p
            r5 = 0
            if (r3 != 0) goto L71
            boolean r3 = r2 instanceof X3.v
            if (r3 == 0) goto L22
            goto L71
        L22:
            F0.p r3 = X3.f.f2654j
            if (r2 == r3) goto L5b
            F0.p r3 = X3.f.f2655k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            F0.p r3 = X3.f.f2652g
            if (r2 == r3) goto L12
            F0.p r3 = X3.f.f2651f
            if (r2 != r3) goto L34
            goto L12
        L34:
            F0.p r7 = X3.f.i
            if (r2 == r7) goto L5a
            F0.p r7 = X3.f.f2649d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            F0.p r7 = X3.f.f2656l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m(r7, r5)
            if (r1 == 0) goto L70
            N3.h.b(r4)
            M3.l r7 = r4.f2644m
            if (r7 == 0) goto L70
            A1.c r7 = a4.a.a(r7, r0, r5)
            if (r7 == 0) goto L70
            V3.AbstractC0144v.g(r8, r7)
        L70:
            return
        L71:
            if (r1 == 0) goto L76
            F0.p r3 = X3.f.f2654j
            goto L78
        L76:
            F0.p r3 = X3.f.f2655k
        L78:
            boolean r2 = r6.j(r2, r7, r3)
            if (r2 == 0) goto L12
            r6.m(r7, r5)
            r2 = r1 ^ 1
            r6.l(r7, r2)
            if (r1 == 0) goto L98
            N3.h.b(r4)
            M3.l r7 = r4.f2644m
            if (r7 == 0) goto L98
            A1.c r7 = a4.a.a(r7, r0, r5)
            if (r7 == 0) goto L98
            V3.AbstractC0144v.g(r8, r7)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.l.g(int, E3.i):void");
    }

    public final boolean j(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f2671q;
        int i5 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i5, obj, obj2)) {
            if (atomicReferenceArray.get(i5) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i) {
        return this.f2671q.get((i * 2) + 1);
    }

    public final void l(int i, boolean z4) {
        if (z4) {
            d dVar = this.f2670p;
            N3.h.b(dVar);
            dVar.H((this.f3625n * ((long) f.f2647b)) + ((long) i));
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.f2671q.lazySet(i * 2, obj);
    }

    public final void n(int i, F0.p pVar) {
        this.f2671q.set((i * 2) + 1, pVar);
    }
}
