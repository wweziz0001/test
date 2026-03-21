package t3;

import L.C0110s;

/* JADX INFO: loaded from: classes.dex */
public final class z extends G3.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f10136o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10137p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0110s f10138q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0110s c0110s, E3.d dVar) {
        super(dVar);
        this.f10138q = c0110s;
    }

    @Override // G3.b
    public final Object l(Object obj) {
        this.f10136o = obj;
        this.f10137p |= Integer.MIN_VALUE;
        return this.f10138q.k(null, this);
    }
}
