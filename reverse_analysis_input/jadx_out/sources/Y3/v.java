package Y3;

import V3.C0129f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class v extends Z3.b implements t, g, Z3.o {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2810p = AtomicReferenceFieldUpdater.newUpdater(v.class, Object.class, "_state");
    private volatile Object _state;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2811o;

    public v(Object obj) {
        this._state = obj;
    }

    @Override // Z3.o
    public final g a(E3.i iVar, int i, int i5) {
        return ((((i < 0 || i >= 2) && i != -2) || i5 != 2) && !((i == 0 || i == -3) && i5 == 1)) ? new Z3.h(this, iVar, i, i5) : this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0150, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x0039, B:50:0x00cc, B:52:0x00d4, B:55:0x00db, B:56:0x00e1, B:58:0x00e4, B:68:0x0105, B:71:0x0118, B:72:0x0130, B:78:0x0144, B:75:0x013b, B:77:0x0141, B:60:0x00ea, B:64:0x00f1, B:21:0x0054, B:24:0x005f, B:49:0x00bc), top: B:102:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x0039, B:50:0x00cc, B:52:0x00d4, B:55:0x00db, B:56:0x00e1, B:58:0x00e4, B:68:0x0105, B:71:0x0118, B:72:0x0130, B:78:0x0144, B:75:0x013b, B:77:0x0141, B:60:0x00ea, B:64:0x00f1, B:21:0x0054, B:24:0x005f, B:49:0x00bc), top: B:102:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x0039, B:50:0x00cc, B:52:0x00d4, B:55:0x00db, B:56:0x00e1, B:58:0x00e4, B:68:0x0105, B:71:0x0118, B:72:0x0130, B:78:0x0144, B:75:0x013b, B:77:0x0141, B:60:0x00ea, B:64:0x00f1, B:21:0x0054, B:24:0x005f, B:49:0x00bc), top: B:102:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0117 -> B:50:0x00cc). Please report as a decompilation issue!!! */
    @Override // Y3.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(Y3.h r18, E3.d r19) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y3.v.b(Y3.h, E3.d):java.lang.Object");
    }

    public final boolean c(Object obj, Object obj2) {
        int i;
        Z3.c[] cVarArr;
        F0.p pVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2810p;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !N3.h.a(obj3, obj)) {
                return false;
            }
            if (N3.h.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i5 = this.f2811o;
            if ((i5 & 1) != 0) {
                this.f2811o = i5 + 2;
                return true;
            }
            int i6 = i5 + 1;
            this.f2811o = i6;
            Z3.c[] cVarArr2 = this.f3096l;
            while (true) {
                x[] xVarArr = (x[]) cVarArr2;
                if (xVarArr != null) {
                    for (x xVar : xVarArr) {
                        if (xVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = x.f2814a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(xVar);
                                if (obj4 != null && obj4 != (pVar = w.f2813b)) {
                                    F0.p pVar2 = w.f2812a;
                                    if (obj4 != pVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(xVar, obj4, pVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(xVar) != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0129f) obj4).j(B3.g.f275a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(xVar, obj4, pVar)) {
                                        if (atomicReferenceFieldUpdater2.get(xVar) != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f2811o;
                    if (i == i6) {
                        this.f2811o = i6 + 1;
                        return true;
                    }
                    cVarArr = this.f3096l;
                }
                cVarArr2 = cVarArr;
                i6 = i;
            }
        }
    }

    @Override // Y3.h
    public final Object k(Object obj, E3.d dVar) {
        if (obj == null) {
            obj = Z3.q.f3135a;
        }
        c(null, obj);
        return B3.g.f275a;
    }
}
