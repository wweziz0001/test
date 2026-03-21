package V3;

/* JADX INFO: loaded from: classes.dex */
public final class V extends C0129f {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0135l f2393t;

    public V(E3.d dVar, C0135l c0135l) {
        super(1, dVar);
        this.f2393t = c0135l;
    }

    @Override // V3.C0129f
    public final Throwable s(Z z4) {
        Throwable thC;
        Object objF = this.f2393t.F();
        return (!(objF instanceof X) || (thC = ((X) objF).c()) == null) ? objF instanceof C0137n ? ((C0137n) objF).f2433a : z4.B() : thC;
    }

    @Override // V3.C0129f
    public final String z() {
        return "AwaitContinuation";
    }
}
