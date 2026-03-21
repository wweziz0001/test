package V3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends a4.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f2402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f2403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z f2404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ L f2405e;

    public Y(U u4, Z z4, L l3) {
        this.f2404d = z4;
        this.f2405e = l3;
        this.f2402b = u4;
    }

    @Override // a4.b
    public final void b(Object obj, Object obj2) {
        a4.k kVar = (a4.k) obj;
        boolean z4 = obj2 == null;
        U u4 = this.f2402b;
        Object obj3 = z4 ? u4 : this.f2403c;
        if (obj3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a4.k.f3606l;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, obj3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z4) {
                a0 a0Var = this.f2403c;
                N3.h.b(a0Var);
                u4.j(a0Var);
            }
        }
    }

    @Override // a4.b
    public final F0.p c(Object obj) {
        if (this.f2404d.F() == this.f2405e) {
            return null;
        }
        return a4.a.f3587e;
    }
}
