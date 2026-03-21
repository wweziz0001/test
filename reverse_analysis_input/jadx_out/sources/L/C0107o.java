package L;

/* JADX INFO: renamed from: L.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0107o extends G3.f implements M3.p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1420p;

    @Override // G3.b
    public final E3.d a(E3.d dVar, Object obj) {
        C0107o c0107o = new C0107o(2, dVar);
        c0107o.f1420p = obj;
        return c0107o;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        return ((C0107o) a((E3.d) obj2, (a0) obj)).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        i4.a.Y(obj);
        return Boolean.valueOf(!(((a0) this.f1420p) instanceof Q));
    }
}
