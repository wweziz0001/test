package N;

import a0.C0200z;
import g4.l;

/* JADX INFO: loaded from: classes.dex */
public final class e extends N3.i implements M3.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f1527n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i) {
        super(0);
        this.f1526m = i;
        this.f1527n = fVar;
    }

    @Override // M3.a
    public final Object d() {
        switch (this.f1526m) {
            case 0:
                f fVar = this.f1527n;
                l lVar = (l) fVar.f1532c.d();
                if (h4.b.a(lVar) != -1) {
                    return C0200z.s(lVar.f5857l.n(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + fVar.f1532c + ", instead got " + lVar).toString());
            default:
                A0.b bVar = f.f1529f;
                f fVar2 = this.f1527n;
                synchronized (bVar) {
                    f.f1528e.remove(((l) fVar2.f1533d.a()).f5857l.n());
                }
                return B3.g.f275a;
        }
    }
}
