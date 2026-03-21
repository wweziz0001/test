package J2;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements G2.s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1112l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1113m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G2.r f1114n;

    public /* synthetic */ Z(Object obj, G2.r rVar, int i) {
        this.f1112l = i;
        this.f1113m = obj;
        this.f1114n = rVar;
    }

    @Override // G2.s
    public final G2.r create(G2.e eVar, N2.a aVar) {
        switch (this.f1112l) {
            case 0:
                if (aVar.f1601a == ((Class) this.f1113m)) {
                    return this.f1114n;
                }
                return null;
            case 1:
                Class<?> cls = aVar.f1601a;
                if (((Class) this.f1113m).isAssignableFrom(cls)) {
                    return new C0070c(this, cls);
                }
                return null;
            default:
                if (aVar.equals((N2.a) this.f1113m)) {
                    return this.f1114n;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f1112l) {
            case 0:
                return "Factory[type=" + ((Class) this.f1113m).getName() + ",adapter=" + this.f1114n + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.f1113m).getName() + ",adapter=" + this.f1114n + "]";
            default:
                return super.toString();
        }
    }
}
