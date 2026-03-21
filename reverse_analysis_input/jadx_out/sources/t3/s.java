package t3;

/* JADX INFO: loaded from: classes.dex */
public final class s extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f10106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0882m f10108q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C0882m c0882m, E3.d dVar) {
        super(dVar);
        this.f10108q = c0882m;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f10106o = obj;
        this.f10107p |= Integer.MIN_VALUE;
        return this.f10108q.k(null, this);
    }
}
