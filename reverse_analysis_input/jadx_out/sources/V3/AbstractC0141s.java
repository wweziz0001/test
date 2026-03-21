package V3;

/* JADX INFO: renamed from: V3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0141s extends E3.a implements E3.f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final r f2442m = new r(E3.e.f674l, C0140q.f2439m);

    public AbstractC0141s() {
        super(E3.e.f674l);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [M3.l, N3.i] */
    @Override // E3.a, E3.i
    public final E3.i c(E3.h hVar) {
        N3.h.e(hVar, "key");
        boolean z4 = hVar instanceof r;
        E3.j jVar = E3.j.f675l;
        if (z4) {
            r rVar = (r) hVar;
            E3.h hVar2 = this.f670l;
            if ((hVar2 == rVar || rVar.f2441m == hVar2) && ((E3.g) rVar.f2440l.c(this)) != null) {
                return jVar;
            }
        } else if (E3.e.f674l == hVar) {
            return jVar;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [M3.l, N3.i] */
    @Override // E3.a, E3.i
    public final E3.g l(E3.h hVar) {
        E3.g gVar;
        N3.h.e(hVar, "key");
        if (!(hVar instanceof r)) {
            if (E3.e.f674l == hVar) {
                return this;
            }
            return null;
        }
        r rVar = (r) hVar;
        E3.h hVar2 = this.f670l;
        if ((hVar2 == rVar || rVar.f2441m == hVar2) && (gVar = (E3.g) rVar.f2440l.c(this)) != null) {
            return gVar;
        }
        return null;
    }

    public abstract void n(E3.i iVar, Runnable runnable);

    public void p(E3.i iVar, Runnable runnable) {
        n(iVar, runnable);
    }

    public boolean q() {
        return !(this instanceof i0);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0144v.e(this);
    }
}
