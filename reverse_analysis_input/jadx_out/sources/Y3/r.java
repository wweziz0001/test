package Y3;

/* JADX INFO: loaded from: classes.dex */
public final class r extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public V1.i f2793o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f2794p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2795q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ V1.i f2796r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f2797s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(V1.i iVar, E3.d dVar) {
        super(dVar);
        this.f2796r = iVar;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f2794p = obj;
        this.f2795q |= Integer.MIN_VALUE;
        return this.f2796r.k(null, this);
    }
}
