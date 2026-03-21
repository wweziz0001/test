package J2;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements G2.s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Class f1118l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Class f1119m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G2.r f1120n;

    public b0(Class cls, Class cls2, G2.r rVar) {
        this.f1118l = cls;
        this.f1119m = cls2;
        this.f1120n = rVar;
    }

    @Override // G2.s
    public final G2.r create(G2.e eVar, N2.a aVar) {
        Class cls = aVar.f1601a;
        if (cls == this.f1118l || cls == this.f1119m) {
            return this.f1120n;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f1119m.getName() + "+" + this.f1118l.getName() + ",adapter=" + this.f1120n + "]";
    }
}
