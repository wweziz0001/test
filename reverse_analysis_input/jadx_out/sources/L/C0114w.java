package L;

/* JADX INFO: renamed from: L.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0114w extends G3.f implements M3.l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1442p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ G f1443q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0114w(G g5, E3.d dVar) {
        super(1, dVar);
        this.f1443q = g5;
    }

    @Override // M3.l
    public final Object c(Object obj) {
        return new C0114w(this.f1443q, (E3.d) obj).l(B3.g.f275a);
    }

    @Override // G3.b
    public final Object l(Object obj) {
        F3.a aVar = F3.a.f861l;
        int i = this.f1442p;
        if (i == 0) {
            i4.a.Y(obj);
            this.f1442p = 1;
            obj = this.f1443q.c(this);
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
