package L;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: L.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0099g extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Iterator f1385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f1386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1387r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f1388s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f1389t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1390u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0099g(List list, ArrayList arrayList, E3.d dVar) {
        super(2, dVar);
        this.f1389t = list;
        this.f1390u = arrayList;
    }

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        C0099g c0099g = new C0099g(this.f1389t, this.f1390u, dVar);
        c0099g.f1388s = obj;
        return c0099g;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((C0099g) a((E3.d) obj2, obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        Iterator it;
        List list;
        int i = this.f1387r;
        if (i == 0) {
            i4.a.Y(obj);
            obj = this.f1388s;
            it = this.f1389t.iterator();
            list = this.f1390u;
        } else if (i == 1) {
            Object obj2 = this.f1386q;
            Iterator it2 = this.f1385p;
            List list2 = (List) this.f1388s;
            i4.a.Y(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0098f(1, null));
                this.f1388s = list2;
                this.f1385p = it2;
                this.f1386q = null;
                this.f1387r = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f1385p;
            list = (List) this.f1388s;
            i4.a.Y(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f1388s = list;
        this.f1385p = it;
        this.f1386q = obj;
        this.f1387r = 1;
        throw null;
    }
}
