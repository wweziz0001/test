package V3;

/* JADX INFO: loaded from: classes.dex */
public final class O extends U {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f2388p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f2389q;

    public /* synthetic */ O(Object obj, int i) {
        this.f2388p = i;
        this.f2389q = obj;
    }

    @Override // M3.l
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        switch (this.f2388p) {
            case 0:
                o((Throwable) obj);
                break;
            default:
                o((Throwable) obj);
                break;
        }
        return B3.g.f275a;
    }

    @Override // V3.U
    public final void o(Throwable th) {
        switch (this.f2388p) {
            case 0:
                ((M3.l) this.f2389q).c(th);
                break;
            default:
                Object objF = n().F();
                boolean z4 = objF instanceof C0137n;
                V v4 = (V) this.f2389q;
                if (!z4) {
                    v4.j(AbstractC0144v.o(objF));
                } else {
                    v4.j(i4.a.p(((C0137n) objF).f2433a));
                }
                break;
        }
    }
}
