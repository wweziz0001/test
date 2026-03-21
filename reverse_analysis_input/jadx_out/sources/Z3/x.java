package Z3;

/* JADX INFO: loaded from: classes.dex */
public final class x implements E3.d, G3.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final E3.d f3147l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final E3.i f3148m;

    public x(E3.d dVar, E3.i iVar) {
        this.f3147l = dVar;
        this.f3148m = iVar;
    }

    @Override // G3.c
    public final G3.c f() {
        E3.d dVar = this.f3147l;
        if (dVar instanceof G3.c) {
            return (G3.c) dVar;
        }
        return null;
    }

    @Override // E3.d
    public final E3.i getContext() {
        return this.f3148m;
    }

    @Override // E3.d
    public final void j(Object obj) {
        this.f3147l.j(obj);
    }
}
