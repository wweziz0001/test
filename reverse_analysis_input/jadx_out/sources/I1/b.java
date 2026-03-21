package I1;

import E3.d;
import G3.f;
import K1.i;
import M3.p;
import V3.InterfaceC0143u;
import Y3.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f implements p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1019p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g f1020q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f1021r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, i iVar, d dVar) {
        super(2, dVar);
        this.f1020q = gVar;
        this.f1021r = iVar;
    }

    @Override // G3.b
    public final d a(d dVar, Object obj) {
        return new b(this.f1020q, this.f1021r, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((b) a((d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f1019p;
        if (i == 0) {
            i4.a.Y(obj);
            a aVar2 = new a(this.f1021r, 0);
            this.f1019p = 1;
            if (this.f1020q.b(aVar2, this) == aVar) {
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
