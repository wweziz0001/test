package K1;

import androidx.window.extensions.layout.WindowLayoutComponent;

/* JADX INFO: loaded from: classes.dex */
public final class f extends N3.i implements M3.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f1246m = new f(0);

    @Override // M3.a
    public final Object d() {
        WindowLayoutComponent windowLayoutComponentA;
        try {
            ClassLoader classLoader = h.class.getClassLoader();
            e eVar = classLoader != null ? new e(classLoader, new G1.b(classLoader)) : null;
            if (eVar == null || (windowLayoutComponentA = eVar.a()) == null) {
                return null;
            }
            N3.h.d(classLoader, "loader");
            G1.b bVar = new G1.b(classLoader);
            int iA = H1.e.a();
            return iA >= 2 ? new M1.d(windowLayoutComponentA) : iA == 1 ? new M1.c(windowLayoutComponentA, bVar) : new M1.a();
        } catch (Throwable unused) {
            g gVar = g.f1247a;
            return null;
        }
    }
}
