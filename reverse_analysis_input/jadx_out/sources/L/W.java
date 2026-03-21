package L;

/* JADX INFO: loaded from: classes.dex */
public final class W extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1357o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d4.d f1358p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Z f1360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1361s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(Z z4, G3.b bVar) {
        super(bVar);
        this.f1360r = z4;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f1359q = obj;
        this.f1361s |= Integer.MIN_VALUE;
        return this.f1360r.b(null, this);
    }
}
