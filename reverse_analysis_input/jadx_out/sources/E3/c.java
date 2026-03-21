package E3;

import M3.p;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements i, Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f673m;

    public c(g gVar, i iVar) {
        N3.h.e(iVar, "left");
        N3.h.e(gVar, "element");
        this.f672l = iVar;
        this.f673m = gVar;
    }

    @Override // E3.i
    public final i c(h hVar) {
        N3.h.e(hVar, "key");
        g gVar = this.f673m;
        g gVarL = gVar.l(hVar);
        i iVar = this.f672l;
        if (gVarL != null) {
            return iVar;
        }
        i iVarC = iVar.c(hVar);
        return iVarC == iVar ? this : iVarC == j.f675l ? gVar : new c(gVar, iVarC);
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i = 2;
            c cVar2 = cVar;
            int i5 = 2;
            while (true) {
                i iVar = cVar2.f672l;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i5++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f672l;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i5 != i) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                g gVar = cVar4.f673m;
                if (!N3.h.a(cVar.l(gVar.getKey()), gVar)) {
                    zA = false;
                    break;
                }
                i iVar3 = cVar4.f672l;
                if (!(iVar3 instanceof c)) {
                    N3.h.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    zA = N3.h.a(cVar.l(gVar2.getKey()), gVar2);
                    break;
                }
                cVar4 = (c) iVar3;
            }
            if (!zA) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f673m.hashCode() + this.f672l.hashCode();
    }

    @Override // E3.i
    public final Object k(Object obj, p pVar) {
        return pVar.i(this.f672l.k(obj, pVar), this.f673m);
    }

    @Override // E3.i
    public final g l(h hVar) {
        N3.h.e(hVar, "key");
        c cVar = this;
        while (true) {
            g gVarL = cVar.f673m.l(hVar);
            if (gVarL != null) {
                return gVarL;
            }
            i iVar = cVar.f672l;
            if (!(iVar instanceof c)) {
                return iVar.l(hVar);
            }
            cVar = (c) iVar;
        }
    }

    @Override // E3.i
    public final i o(i iVar) {
        N3.h.e(iVar, "context");
        return iVar == j.f675l ? this : (i) iVar.k(this, new b(1));
    }

    public final String toString() {
        return "[" + ((String) k("", new b(0))) + ']';
    }
}
