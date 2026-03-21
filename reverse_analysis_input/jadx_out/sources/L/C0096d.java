package L;

import a.AbstractC0149a;
import java.util.List;

/* JADX INFO: renamed from: L.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0096d extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1375p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1376q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f1377r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0096d(List list, E3.d dVar) {
        super(2, dVar);
        this.f1377r = list;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        C0096d c0096d = new C0096d(this.f1377r, dVar);
        c0096d.f1376q = obj;
        return c0096d;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((C0096d) a((E3.d) obj2, (C0103k) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f1375p;
        if (i == 0) {
            i4.a.Y(obj);
            C0103k c0103k = (C0103k) this.f1376q;
            this.f1375p = 1;
            if (AbstractC0149a.a(this.f1377r, c0103k, this) == aVar) {
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
