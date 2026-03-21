package a4;

import V3.AbstractC0144v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3606l = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3607m = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3608n = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        r6 = ((a4.r) r6).f3622a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a4.k h() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = a4.k.f3607m
            java.lang.Object r1 = r0.get(r9)
            a4.k r1 = (a4.k) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = a4.k.f3606l
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.m()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
            return r3
        L2e:
            boolean r7 = r6 instanceof a4.q
            if (r7 == 0) goto L38
            a4.q r6 = (a4.q) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof a4.r
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            a4.r r6 = (a4.r) r6
            a4.k r6 = r6.f3622a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            a4.k r3 = (a4.k) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            N3.h.c(r6, r4)
            r4 = r6
            a4.k r4 = (a4.k) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.k.h():a4.k");
    }

    public final void j(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3607m;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (k() != kVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                    break;
                }
            }
            if (m()) {
                kVar.h();
                return;
            }
            return;
        }
    }

    public final Object k() {
        while (true) {
            Object obj = f3606l.get(this);
            if (!(obj instanceof q)) {
                return obj;
            }
            ((q) obj).a(this);
        }
    }

    public final k l() {
        k kVar;
        Object objK = k();
        r rVar = objK instanceof r ? (r) objK : null;
        if (rVar != null && (kVar = rVar.f3622a) != null) {
            return kVar;
        }
        N3.h.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) objK;
    }

    public boolean m() {
        return k() instanceof r;
    }

    public String toString() {
        return new j(this, AbstractC0144v.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC0144v.e(this);
    }
}
