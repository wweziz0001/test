package t3;

import V3.InterfaceC0143u;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10114p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ J f10115q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f10116r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(J j5, List list, E3.d dVar) {
        super(2, dVar);
        this.f10115q = j5;
        this.f10116r = list;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        return new u(this.f10115q, this.f10116r, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((u) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f10114p;
        if (i == 0) {
            i4.a.Y(obj);
            this.f10114p = 1;
            obj = J.j(this.f10115q, this.f10116r, this);
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
