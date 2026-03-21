package a4;

import V3.AbstractC0144v;

/* JADX INFO: loaded from: classes.dex */
public final class p extends N3.i implements M3.l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M3.l f3619m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f3620n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ E3.i f3621o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(M3.l lVar, Object obj, E3.i iVar) {
        super(1);
        this.f3619m = lVar;
        this.f3620n = obj;
        this.f3621o = iVar;
    }

    @Override // M3.l
    public final Object c(Object obj) {
        A1.c cVarA = a.a(this.f3619m, this.f3620n, null);
        if (cVarA != null) {
            AbstractC0144v.g(this.f3621o, cVarA);
        }
        return B3.g.f275a;
    }
}
