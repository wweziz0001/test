package Y3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public X3.r f2744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f2745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c f2746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2747r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, G3.b bVar) {
        super(bVar);
        this.f2746q = cVar;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f2745p = obj;
        this.f2747r |= Integer.MIN_VALUE;
        return this.f2746q.c(null, this);
    }
}
