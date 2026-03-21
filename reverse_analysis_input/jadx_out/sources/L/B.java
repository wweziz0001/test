package L;

/* JADX INFO: loaded from: classes.dex */
public final class B extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public P f1271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a0 f1272p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P f1275s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1276t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(P p4, E3.d dVar) {
        super(dVar);
        this.f1275s = p4;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f1274r = obj;
        this.f1276t |= Integer.MIN_VALUE;
        return P.e(this.f1275s, false, this);
    }
}
