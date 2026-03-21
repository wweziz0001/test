package L;

/* JADX INFO: loaded from: classes.dex */
public final class N extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public N3.n f1320o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1321p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P f1322q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1323r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(P p4, G3.b bVar) {
        super(bVar);
        this.f1322q = p4;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f1321p = obj;
        this.f1323r |= Integer.MIN_VALUE;
        return this.f1322q.j(null, false, this);
    }
}
