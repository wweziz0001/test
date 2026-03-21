package t3;

import java.util.List;

/* JADX INFO: renamed from: t3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0877h extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f10070p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f10071q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0877h(List list, E3.d dVar) {
        super(2, dVar);
        this.f10071q = list;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        C0877h c0877h = new C0877h(this.f10071q, dVar);
        c0877h.f10070p = obj;
        return c0877h;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        C0877h c0877h = (C0877h) a((E3.d) obj2, (P.b) obj);
        B3.g gVar = B3.g.f275a;
        c0877h.l(gVar);
        return gVar;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        i4.a.Y(obj);
        P.b bVar = (P.b) this.f10070p;
        List<String> list = this.f10071q;
        if (list != null) {
            for (String str : list) {
                N3.h.e(str, "name");
                P.d dVar = new P.d(str);
                bVar.b();
                bVar.f1665a.remove(dVar);
            }
        } else {
            bVar.b();
            bVar.f1665a.clear();
        }
        return B3.g.f275a;
    }
}
