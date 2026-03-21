package K1;

import M3.p;
import X3.r;
import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class k extends G3.f implements p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f1258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Activity f1259s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, Activity activity, E3.d dVar) {
        super(2, dVar);
        this.f1258r = bVar;
        this.f1259s = activity;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        k kVar = new k(this.f1258r, this.f1259s, dVar);
        kVar.f1257q = obj;
        return kVar;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((k) a((E3.d) obj2, (r) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f1256p;
        if (i == 0) {
            i4.a.Y(obj);
            r rVar = (r) this.f1257q;
            i iVar = new i(rVar, 0);
            b bVar = this.f1258r;
            ((L1.a) bVar.f1237m).b(this.f1259s, new D0.j(2), iVar);
            j jVar = new j(bVar, 0, iVar);
            this.f1256p = 1;
            if (Z1.f.e(rVar, jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4.a.Y(obj);
        }
        return B3.g.f275a;
    }
}
