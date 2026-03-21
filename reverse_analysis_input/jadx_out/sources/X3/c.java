package X3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f2631o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d f2632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2633q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, G3.b bVar) {
        super(bVar);
        this.f2632p = dVar;
    }

    @Override // G3.b
    public final Object l(Object obj) throws Throwable {
        this.f2631o = obj;
        this.f2633q |= Integer.MIN_VALUE;
        Object objB = this.f2632p.B(null, 0, 0L, this);
        return objB == F3.a.f861l ? objB : new k(objB);
    }
}
