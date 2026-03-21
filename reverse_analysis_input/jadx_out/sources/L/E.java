package L;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class E extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1285o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f1286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Serializable f1287q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public N3.p f1288r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1289s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1290t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f1291u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ P f1292v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1293w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(P p4, G3.b bVar) {
        super(bVar);
        this.f1292v = p4;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f1291u = obj;
        this.f1293w |= Integer.MIN_VALUE;
        return P.f(this.f1292v, false, this);
    }
}
