package L;

/* JADX INFO: loaded from: classes.dex */
public final class X extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d4.d f1362o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1363p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1364q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Z f1365r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1366s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Z z4, G3.b bVar) {
        super(bVar);
        this.f1365r = z4;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f1364q = obj;
        this.f1366s |= Integer.MIN_VALUE;
        return this.f1365r.c(null, this);
    }
}
