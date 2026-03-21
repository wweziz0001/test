package L;

/* JADX INFO: renamed from: L.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0101i extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Z1.i f1391o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1392p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z1.i f1393q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1394r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0101i(Z1.i iVar, G3.b bVar) {
        super(bVar);
        this.f1393q = iVar;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f1392p = obj;
        this.f1394r |= Integer.MIN_VALUE;
        return this.f1393q.g(this);
    }
}
