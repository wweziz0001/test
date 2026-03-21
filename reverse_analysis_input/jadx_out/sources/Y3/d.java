package Y3;

/* JADX INFO: loaded from: classes.dex */
public final class d extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2750o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e f2751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2752q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, E3.d dVar) {
        super(dVar);
        this.f2751p = eVar;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f2750o = obj;
        this.f2752q |= Integer.MIN_VALUE;
        return this.f2751p.k(null, this);
    }
}
