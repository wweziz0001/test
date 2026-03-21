package Y3;

/* JADX INFO: loaded from: classes.dex */
public final class p extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e f2784o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f2785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f2786q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f2787r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2788s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e eVar, E3.d dVar) {
        super(dVar);
        this.f2787r = eVar;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f2786q = obj;
        this.f2788s |= Integer.MIN_VALUE;
        return this.f2787r.k(null, this);
    }
}
