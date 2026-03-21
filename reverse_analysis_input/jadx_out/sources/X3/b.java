package X3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2628o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d f2629p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2630q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, G3.b bVar) {
        super(bVar);
        this.f2629p = dVar;
    }

    @Override // G3.b
    public final Object l(Object obj) throws Throwable {
        this.f2628o = obj;
        this.f2630q |= Integer.MIN_VALUE;
        Object objA = d.A(this.f2629p, this);
        return objA == F3.a.f861l ? objA : new k(objA);
    }
}
