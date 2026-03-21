package t3;

/* JADX INFO: renamed from: t3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0883n implements Y3.g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10087l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y3.g f10088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ P.d f10089n;

    public /* synthetic */ C0883n(Y3.g gVar, P.d dVar, int i) {
        this.f10087l = i;
        this.f10088m = gVar;
        this.f10089n = dVar;
    }

    @Override // Y3.g
    public final Object b(Y3.h hVar, E3.d dVar) {
        switch (this.f10087l) {
            case 0:
                Object objB = this.f10088m.b(new C0882m(hVar, this.f10089n, 0), dVar);
                if (objB != F3.a.f861l) {
                    break;
                }
                break;
            case 1:
                Object objB2 = this.f10088m.b(new C0882m(hVar, this.f10089n, 1), dVar);
                if (objB2 != F3.a.f861l) {
                    break;
                }
                break;
            case 2:
                Object objB3 = this.f10088m.b(new C0882m(hVar, this.f10089n, 2), dVar);
                if (objB3 != F3.a.f861l) {
                    break;
                }
                break;
            default:
                Object objB4 = this.f10088m.b(new C0882m(hVar, this.f10089n, 3), dVar);
                if (objB4 != F3.a.f861l) {
                    break;
                }
                break;
        }
        return B3.g.f275a;
    }
}
