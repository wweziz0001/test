package t3;

/* JADX INFO: loaded from: classes.dex */
public final class p extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f10095o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10096p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y3.e f10097q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Y3.e eVar, E3.d dVar) {
        super(dVar);
        this.f10097q = eVar;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f10095o = obj;
        this.f10096p |= Integer.MIN_VALUE;
        return this.f10097q.k(null, this);
    }
}
