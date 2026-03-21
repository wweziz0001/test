package L;

/* JADX INFO: loaded from: classes.dex */
public final class A extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public P f1266o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P f1269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1270s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(P p4, G3.b bVar) {
        super(bVar);
        this.f1269r = p4;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f1268q = obj;
        this.f1270s |= Integer.MIN_VALUE;
        return this.f1269r.h(this);
    }
}
