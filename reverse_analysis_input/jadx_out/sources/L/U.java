package L;

/* JADX INFO: loaded from: classes.dex */
public final class U extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Z1.i f1349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d4.a f1350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Z1.i f1352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1353s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Z1.i iVar, G3.b bVar) {
        super(bVar);
        this.f1352r = iVar;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f1351q = obj;
        this.f1353s |= Integer.MIN_VALUE;
        return this.f1352r.B(this);
    }
}
