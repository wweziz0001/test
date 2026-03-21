package t3;

/* JADX INFO: loaded from: classes.dex */
public final class y extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f10133o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10134p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0882m f10135q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C0882m c0882m, E3.d dVar) {
        super(dVar);
        this.f10135q = c0882m;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f10133o = obj;
        this.f10134p |= Integer.MIN_VALUE;
        return this.f10135q.k(null, this);
    }
}
