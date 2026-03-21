package J2;

import g2.C0439b;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: J2.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0079l implements G2.s {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0078k f1160n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0078k f1161o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Z1.e f1162l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ConcurrentHashMap f1163m = new ConcurrentHashMap();

    static {
        int i = 0;
        f1160n = new C0078k(i);
        f1161o = new C0078k(i);
    }

    public C0079l(Z1.e eVar) {
        this.f1162l = eVar;
    }

    public final G2.r a(Z1.e eVar, G2.e eVar2, N2.a aVar, H2.a aVar2, boolean z4) {
        G2.r d5;
        Object objE = eVar.p(new N2.a(aVar2.value())).e();
        boolean zNullSafe = aVar2.nullSafe();
        if (objE instanceof G2.r) {
            d5 = (G2.r) objE;
        } else if (objE instanceof G2.s) {
            G2.s sVar = (G2.s) objE;
            if (z4) {
                G2.s sVar2 = (G2.s) this.f1163m.putIfAbsent(aVar.f1601a, sVar);
                if (sVar2 != null) {
                    sVar = sVar2;
                }
            }
            d5 = sVar.create(eVar2, aVar);
        } else {
            if (!(objE instanceof C0439b)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objE.getClass().getName() + " as a @JsonAdapter for " + I2.d.l(aVar.f1602b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            d5 = new D(objE instanceof C0439b ? (C0439b) objE : null, eVar2, aVar, z4 ? f1160n : f1161o, zNullSafe);
            zNullSafe = false;
        }
        return (d5 == null || !zNullSafe) ? d5 : d5.a();
    }

    @Override // G2.s
    public final G2.r create(G2.e eVar, N2.a aVar) {
        H2.a aVar2 = (H2.a) aVar.f1601a.getAnnotation(H2.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.f1162l, eVar, aVar, aVar2, true);
    }
}
