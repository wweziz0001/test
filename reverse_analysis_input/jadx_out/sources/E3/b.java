package E3;

import M3.p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f671l;

    public /* synthetic */ b(int i) {
        this.f671l = i;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        c cVar;
        switch (this.f671l) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                N3.h.e(str, "acc");
                N3.h.e(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                N3.h.e(iVar, "acc");
                N3.h.e(gVar2, "element");
                i iVarC = iVar.c(gVar2.getKey());
                j jVar = j.f675l;
                if (iVarC == jVar) {
                    return gVar2;
                }
                e eVar = e.f674l;
                f fVar = (f) iVarC.l(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, iVarC);
                } else {
                    i iVarC2 = iVarC.c(eVar);
                    if (iVarC2 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, iVarC2));
                }
                return cVar;
        }
    }
}
