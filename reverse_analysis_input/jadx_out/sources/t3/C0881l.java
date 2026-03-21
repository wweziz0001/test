package t3;

/* JADX INFO: renamed from: t3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0881l extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f10081o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10082p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0882m f10083q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0881l(C0882m c0882m, E3.d dVar) {
        super(dVar);
        this.f10083q = c0882m;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f10081o = obj;
        this.f10082p |= Integer.MIN_VALUE;
        return this.f10083q.k(null, this);
    }
}
