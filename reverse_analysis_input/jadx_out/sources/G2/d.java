package G2;

import J2.B;

/* JADX INFO: loaded from: classes.dex */
public final class d extends B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f894a = null;

    @Override // G2.r
    public final Object b(O2.a aVar) {
        r rVar = this.f894a;
        if (rVar != null) {
            return rVar.b(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // G2.r
    public final void c(O2.b bVar, Object obj) {
        r rVar = this.f894a;
        if (rVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        rVar.c(bVar, obj);
    }

    @Override // J2.B
    public final r d() {
        r rVar = this.f894a;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
