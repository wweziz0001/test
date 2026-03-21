package a4;

import V3.g0;

/* JADX INFO: loaded from: classes.dex */
public final class x extends N3.i implements M3.p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final x f3628n = new x(2, 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final x f3629o = new x(2, 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final x f3630p = new x(2, 2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f3631m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i, int i5) {
        super(i);
        this.f3631m = i5;
    }

    @Override // M3.p
    public final Object i(Object obj, Object obj2) {
        switch (this.f3631m) {
            case 0:
                E3.g gVar = (E3.g) obj2;
                if (!(gVar instanceof g0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? gVar : Integer.valueOf(iIntValue + 1);
            case 1:
                g0 g0Var = (g0) obj;
                E3.g gVar2 = (E3.g) obj2;
                if (g0Var != null) {
                    return g0Var;
                }
                if (gVar2 instanceof g0) {
                    return (g0) gVar2;
                }
                return null;
            default:
                return (z) obj;
        }
    }
}
