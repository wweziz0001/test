package L;

import V3.InterfaceC0143u;

/* JADX INFO: loaded from: classes.dex */
public final class H extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P f1306q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(P p4, E3.d dVar) {
        super(2, dVar);
        this.f1306q = p4;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        return new H(this.f1306q, dVar);
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((H) a((E3.d) obj2, (InterfaceC0143u) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) throws Throwable {
        F3.a aVar = F3.a.f861l;
        int i = this.f1305p;
        P p4 = this.f1306q;
        try {
            if (i == 0) {
                i4.a.Y(obj);
                if (p4.f1338s.k() instanceof Q) {
                    return p4.f1338s.k();
                }
                this.f1305p = 1;
                if (p4.h(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i4.a.Y(obj);
                    return (a0) obj;
                }
                i4.a.Y(obj);
            }
            this.f1305p = 2;
            obj = P.e(p4, false, this);
            if (obj == aVar) {
                return aVar;
            }
            return (a0) obj;
        } catch (Throwable th) {
            return new T(-1, th);
        }
    }
}
