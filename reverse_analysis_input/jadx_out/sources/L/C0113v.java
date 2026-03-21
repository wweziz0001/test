package L;

/* JADX INFO: renamed from: L.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0113v extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public P f1437o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d4.d f1438p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1439q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P f1440r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1441s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0113v(P p4, G3.b bVar) {
        super(bVar);
        this.f1440r = p4;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f1439q = obj;
        this.f1441s |= Integer.MIN_VALUE;
        return P.a(this.f1440r, this);
    }
}
