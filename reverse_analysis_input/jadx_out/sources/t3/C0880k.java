package t3;

import V3.InterfaceC0143u;
import java.util.List;

/* JADX INFO: renamed from: t3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0880k extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ J f10079q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f10080r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0880k(J j5, List list, E3.d dVar) {
        super(2, dVar);
        this.f10079q = j5;
        this.f10080r = list;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        return new C0880k(this.f10079q, this.f10080r, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((C0880k) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f10078p;
        if (i == 0) {
            i4.a.Y(obj);
            this.f10078p = 1;
            obj = J.j(this.f10079q, this.f10080r, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4.a.Y(obj);
        }
        return obj;
    }
}
