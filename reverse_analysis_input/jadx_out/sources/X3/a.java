package X3;

import V3.AbstractC0144v;
import V3.C0129f;
import V3.l0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f2625l = f.f2660p;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0129f f2626m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f2627n;

    public a(d dVar) {
        this.f2627n = dVar;
    }

    @Override // V3.l0
    public final void a(a4.u uVar, int i) {
        C0129f c0129f = this.f2626m;
        if (c0129f != null) {
            c0129f.a(uVar, i);
        }
    }

    public final Object b(Y3.i iVar) throws Throwable {
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f2639s;
        d dVar = this.f2627n;
        l lVar = (l) atomicReferenceFieldUpdater.get(dVar);
        while (!dVar.u()) {
            long andIncrement = d.f2635o.getAndIncrement(dVar);
            long j5 = f.f2647b;
            long j6 = andIncrement / j5;
            int i = (int) (andIncrement % j5);
            if (lVar.f3625n != j6) {
                l lVarL = dVar.l(j6, lVar);
                if (lVarL == null) {
                    continue;
                } else {
                    lVar = lVarL;
                }
            }
            Object objF = dVar.F(lVar, i, andIncrement, null);
            F0.p pVar = f.f2657m;
            if (objF == pVar) {
                throw new IllegalStateException("unreachable");
            }
            F0.p pVar2 = f.f2659o;
            if (objF != pVar2) {
                if (objF != f.f2658n) {
                    lVar.a();
                    this.f2625l = objF;
                    return Boolean.TRUE;
                }
                d dVar2 = this.f2627n;
                C0129f c0129fF = AbstractC0144v.f(Z1.f.A(iVar));
                try {
                    this.f2626m = c0129fF;
                    Object objF2 = dVar2.F(lVar, i, andIncrement, this);
                    if (objF2 == pVar) {
                        a(lVar, i);
                    } else {
                        a4.p pVar3 = null;
                        E3.i iVar2 = c0129fF.f2418p;
                        M3.l lVar2 = dVar2.f2644m;
                        if (objF2 == pVar2) {
                            if (andIncrement < dVar2.r()) {
                                lVar.a();
                            }
                            l lVar3 = (l) d.f2639s.get(dVar2);
                            while (true) {
                                if (dVar2.u()) {
                                    C0129f c0129f = this.f2626m;
                                    N3.h.b(c0129f);
                                    this.f2626m = null;
                                    this.f2625l = f.f2656l;
                                    Throwable thO = dVar.o();
                                    if (thO == null) {
                                        c0129f.j(Boolean.FALSE);
                                    } else {
                                        c0129f.j(i4.a.p(thO));
                                    }
                                } else {
                                    long andIncrement2 = d.f2635o.getAndIncrement(dVar2);
                                    long j7 = f.f2647b;
                                    long j8 = andIncrement2 / j7;
                                    int i5 = (int) (andIncrement2 % j7);
                                    if (lVar3.f3625n != j8) {
                                        l lVarL2 = dVar2.l(j8, lVar3);
                                        if (lVarL2 != null) {
                                            lVar3 = lVarL2;
                                        }
                                    }
                                    M3.l lVar4 = lVar2;
                                    Object objF3 = dVar2.F(lVar3, i5, andIncrement2, this);
                                    if (objF3 == f.f2657m) {
                                        a(lVar3, i5);
                                        break;
                                    }
                                    if (objF3 == f.f2659o) {
                                        if (andIncrement2 < dVar2.r()) {
                                            lVar3.a();
                                        }
                                        lVar2 = lVar4;
                                    } else {
                                        if (objF3 == f.f2658n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        lVar3.a();
                                        this.f2625l = objF3;
                                        this.f2626m = null;
                                        bool = Boolean.TRUE;
                                        if (lVar4 != null) {
                                            pVar3 = new a4.p(lVar4, objF3, iVar2);
                                        }
                                    }
                                }
                            }
                        } else {
                            lVar.a();
                            this.f2625l = objF2;
                            this.f2626m = null;
                            bool = Boolean.TRUE;
                            if (lVar2 != null) {
                                pVar3 = new a4.p(lVar2, objF2, iVar2);
                            }
                        }
                        c0129fF.g(bool, pVar3);
                    }
                    return c0129fF.t();
                } catch (Throwable th) {
                    c0129fF.A();
                    throw th;
                }
            }
            if (andIncrement < dVar.r()) {
                lVar.a();
            }
        }
        this.f2625l = f.f2656l;
        Throwable thO2 = dVar.o();
        if (thO2 == null) {
            return Boolean.FALSE;
        }
        int i6 = a4.v.f3626a;
        throw thO2;
    }
}
