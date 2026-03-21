package J2;

/* JADX INFO: renamed from: J2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0076i implements G2.s {
    @Override // G2.s
    public final G2.r create(G2.e eVar, N2.a aVar) {
        Class superclass = aVar.f1601a;
        if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
            return null;
        }
        if (!superclass.isEnum()) {
            superclass = superclass.getSuperclass();
        }
        return new C0077j(superclass);
    }
}
