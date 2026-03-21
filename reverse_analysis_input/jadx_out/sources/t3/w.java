package t3;

/* JADX INFO: loaded from: classes.dex */
public final class w extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f10125o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10126p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0882m f10127q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C0882m c0882m, E3.d dVar) {
        super(dVar);
        this.f10127q = c0882m;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f10125o = obj;
        this.f10126p |= Integer.MIN_VALUE;
        return this.f10127q.k(null, this);
    }
}
