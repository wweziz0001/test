package L;

import V3.C0135l;

/* JADX INFO: renamed from: L.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0115x extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1444o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public P f1445p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0135l f1446q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1447r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P f1448s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1449t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0115x(P p4, G3.b bVar) {
        super(bVar);
        this.f1448s = p4;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f1447r = obj;
        this.f1449t |= Integer.MIN_VALUE;
        return P.c(this.f1448s, null, this);
    }
}
