package Y3;

/* JADX INFO: loaded from: classes.dex */
public final class q extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2789o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2790p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ o f2791q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public V1.i f2792r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o oVar, E3.d dVar) {
        super(dVar);
        this.f2791q = oVar;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f2789o = obj;
        this.f2790p |= Integer.MIN_VALUE;
        return this.f2791q.b(null, this);
    }
}
