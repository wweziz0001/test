package N;

import g4.p;

/* JADX INFO: loaded from: classes.dex */
public final class b extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p f1518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f1520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1521s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, G3.b bVar) {
        super(bVar);
        this.f1520r = cVar;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f1519q = obj;
        this.f1521s |= Integer.MIN_VALUE;
        return c.a(this.f1520r, this);
    }
}
