package y3;

import a.AbstractC0149a;

/* JADX INFO: renamed from: y3.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1054y implements M3.l {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f11114m;

    public /* synthetic */ C1054y(Object obj, int i) {
        this.f11113l = i;
        this.f11114m = obj;
    }

    @Override // M3.l
    public final Object c(Object obj) {
        switch (this.f11113l) {
            case 0:
                ((B3.d) obj).getClass();
                Throwable thA = B3.d.a(null);
                Z1.l lVar = (Z1.l) this.f11114m;
                if (thA != null) {
                    lVar.u(Z1.f.Q(thA));
                } else {
                    lVar.u(AbstractC0149a.y(null));
                }
                break;
            case 1:
                ((B3.d) obj).getClass();
                Throwable thA2 = B3.d.a(null);
                Z1.l lVar2 = (Z1.l) this.f11114m;
                if (thA2 != null) {
                    lVar2.u(Z1.f.Q(thA2));
                } else {
                    lVar2.u(AbstractC0149a.y(null));
                }
                break;
            default:
                ((B3.d) obj).getClass();
                ((M3.l) this.f11114m).c(new C1015J(null));
                break;
        }
        return B3.g.f275a;
    }
}
