package Y3;

import L.C0111t;

/* JADX INFO: loaded from: classes.dex */
public final class a extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Z3.s f2740o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f2741p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0111t f2742q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2743r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C0111t c0111t, E3.d dVar) {
        super(dVar);
        this.f2742q = c0111t;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f2741p = obj;
        this.f2743r |= Integer.MIN_VALUE;
        return this.f2742q.b(null, this);
    }
}
