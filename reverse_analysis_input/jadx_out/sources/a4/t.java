package a4;

import V3.AbstractC0124a;
import V3.AbstractC0144v;

/* JADX INFO: loaded from: classes.dex */
public class t extends AbstractC0124a implements G3.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final E3.d f3623o;

    public t(E3.d dVar, E3.i iVar) {
        super(iVar, true);
        this.f3623o = dVar;
    }

    @Override // V3.Z
    public final boolean K() {
        return true;
    }

    @Override // G3.c
    public final G3.c f() {
        E3.d dVar = this.f3623o;
        if (dVar instanceof G3.c) {
            return (G3.c) dVar;
        }
        return null;
    }

    @Override // V3.Z
    public void r(Object obj) {
        a.h(Z1.f.A(this.f3623o), AbstractC0144v.k(obj), null);
    }

    @Override // V3.Z
    public void s(Object obj) {
        this.f3623o.j(AbstractC0144v.k(obj));
    }
}
