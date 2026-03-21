package L;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class G extends G3.f implements M3.l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f1299p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1300q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P f1301r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f1302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1303t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Serializable f1304u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public G(P p4, E3.i iVar, M3.p pVar, E3.d dVar) {
        super(1, dVar);
        this.f1301r = p4;
        this.f1303t = iVar;
        this.f1304u = (G3.f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [G3.f, M3.p] */
    @Override // M3.l
    public final Object c(Object obj) {
        E3.d dVar = (E3.d) obj;
        switch (this.f1299p) {
            case 0:
                return new G((N3.p) this.f1303t, this.f1301r, (N3.n) this.f1304u, dVar).l(B3.g.f275a);
            default:
                return new G(this.f1301r, (E3.i) this.f1303t, (M3.p) this.f1304u, dVar).l(B3.g.f275a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Type inference failed for: r6v2, types: [G3.f, M3.p] */
    @Override // G3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L.G.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(N3.p pVar, P p4, N3.n nVar, E3.d dVar) {
        super(1, dVar);
        this.f1303t = pVar;
        this.f1301r = p4;
        this.f1304u = nVar;
    }
}
