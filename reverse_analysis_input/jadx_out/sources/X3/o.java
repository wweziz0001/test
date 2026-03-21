package X3;

import V3.l0;
import a.AbstractC0149a;
import b3.AbstractC0307a;
import x1.InterfaceC0989e;

/* JADX INFO: loaded from: classes.dex */
public final class o extends d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f2672w;

    public o(int i, int i5, M3.l lVar) {
        super(i, lVar);
        this.f2672w = i5;
        if (i5 != 1) {
            if (i < 1) {
                throw new IllegalArgumentException(AbstractC0307a.h(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + N3.q.a(d.class).b() + " instead").toString());
        }
    }

    public final Object I(Object obj, boolean z4) {
        l lVar;
        M3.l lVar2;
        A1.c cVarA;
        B3.g gVar = B3.g.f275a;
        if (this.f2672w == 3) {
            Object objE = super.e(obj);
            if (!(objE instanceof j) || (objE instanceof i)) {
                return objE;
            }
            if (!z4 || (lVar2 = this.f2644m) == null || (cVarA = a4.a.a(lVar2, obj, null)) == null) {
                return gVar;
            }
            throw cVarA;
        }
        InterfaceC0989e interfaceC0989e = f.f2649d;
        l lVar3 = (l) d.f2638r.get(this);
        while (true) {
            long andIncrement = d.f2634n.getAndIncrement(this);
            long j5 = andIncrement & 1152921504606846975L;
            boolean zT = t(andIncrement, false);
            int i = f.f2647b;
            long j6 = i;
            long j7 = j5 / j6;
            int i5 = (int) (j5 % j6);
            if (lVar3.f3625n != j7) {
                l lVarA = d.a(this, j7, lVar3);
                if (lVarA != null) {
                    lVar = lVarA;
                } else if (zT) {
                    return new i(q());
                }
            } else {
                lVar = lVar3;
            }
            int iF = d.f(this, lVar, i5, obj, j5, interfaceC0989e, zT);
            if (iF == 0) {
                lVar.a();
                return gVar;
            }
            if (iF == 1) {
                return gVar;
            }
            if (iF == 2) {
                if (zT) {
                    lVar.h();
                    return new i(q());
                }
                l0 l0Var = interfaceC0989e instanceof l0 ? (l0) interfaceC0989e : null;
                if (l0Var != null) {
                    l0Var.a(lVar, i5 + i);
                }
                j((lVar.f3625n * j6) + ((long) i5));
                return gVar;
            }
            if (iF == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iF == 4) {
                if (j5 < d.f2635o.get(this)) {
                    lVar.a();
                }
                return new i(q());
            }
            if (iF == 5) {
                lVar.a();
            }
            lVar3 = lVar;
        }
    }

    @Override // X3.d, X3.u
    public final Object e(Object obj) {
        return I(obj, false);
    }

    @Override // X3.d, X3.u
    public final Object n(E3.d dVar, Object obj) throws Throwable {
        A1.c cVarA;
        if (!(I(obj, true) instanceof i)) {
            return B3.g.f275a;
        }
        M3.l lVar = this.f2644m;
        if (lVar == null || (cVarA = a4.a.a(lVar, obj, null)) == null) {
            throw q();
        }
        AbstractC0149a.c(cVarA, q());
        throw cVarA;
    }

    @Override // X3.d
    public final boolean w() {
        return this.f2672w == 2;
    }
}
