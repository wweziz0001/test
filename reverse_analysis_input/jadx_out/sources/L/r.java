package L;

/* JADX INFO: loaded from: classes.dex */
public final class r extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f1426o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1427p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0110s f1428q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0110s c0110s, E3.d dVar) {
        super(dVar);
        this.f1428q = c0110s;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f1426o = obj;
        this.f1427p |= Integer.MIN_VALUE;
        return this.f1428q.k(null, this);
    }
}
