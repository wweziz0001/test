package V3;

/* JADX INFO: renamed from: V3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0139p extends N3.i implements M3.p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0139p f2436n = new C0139p(2, 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0139p f2437o = new C0139p(2, 1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2438m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0139p(int i, int i5) {
        super(i);
        this.f2438m = i5;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        switch (this.f2438m) {
            case 0:
                return ((E3.i) obj).o((E3.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((E3.i) obj).o((E3.g) obj2);
        }
    }
}
