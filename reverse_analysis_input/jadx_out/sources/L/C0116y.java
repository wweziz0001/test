package L;

/* JADX INFO: renamed from: L.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0116y extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public P f1450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d4.d f1451p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1452q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P f1453r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1454s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0116y(P p4, G3.b bVar) {
        super(bVar);
        this.f1453r = p4;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f1452q = obj;
        this.f1454s |= Integer.MIN_VALUE;
        return P.d(this.f1453r, this);
    }
}
