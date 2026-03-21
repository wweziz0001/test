package K1;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f1230n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f1231o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f1232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f1233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f1234r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f1235s;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f1237m;

    static {
        int i = 0;
        f1230n = new b("NONE", i);
        f1231o = new b("FULL", i);
        int i5 = 1;
        f1232p = new b("FLAT", i5);
        f1233q = new b("HALF_OPENED", i5);
        int i6 = 2;
        f1234r = new b("FOLD", i6);
        f1235s = new b("HINGE", i6);
    }

    public /* synthetic */ b(String str, int i) {
        this.f1236l = i;
        this.f1237m = str;
    }

    public String toString() {
        switch (this.f1236l) {
            case 0:
                return (String) this.f1237m;
            case 1:
                return (String) this.f1237m;
            case 2:
                return (String) this.f1237m;
            default:
                return super.toString();
        }
    }

    public b(L1.a aVar) {
        this.f1236l = 3;
        int i = o.f1264b;
        this.f1237m = aVar;
    }
}
