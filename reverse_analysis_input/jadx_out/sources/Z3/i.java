package Z3;

/* JADX INFO: loaded from: classes.dex */
public final class i extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f3113o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f3114p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3115q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, E3.d dVar) {
        super(dVar);
        this.f3114p = jVar;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f3113o = obj;
        this.f3115q |= Integer.MIN_VALUE;
        return this.f3114p.k(null, this);
    }
}
