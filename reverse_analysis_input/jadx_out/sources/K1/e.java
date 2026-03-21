package K1;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f1243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1.b f1244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G1.b f1245c;

    public e(ClassLoader classLoader, G1.b bVar) {
        this.f1243a = classLoader;
        this.f1244b = bVar;
        this.f1245c = new G1.b(classLoader);
    }

    public final WindowLayoutComponent a() {
        G1.b bVar = this.f1245c;
        bVar.getClass();
        boolean zB = false;
        try {
            N3.h.d(bVar.f886a.loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            if (Z1.f.O("WindowExtensionsProvider#getWindowExtensions is not valid", new G1.a(bVar, 0)) && Z1.f.O("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && Z1.f.O("FoldingFeature class is not valid", new d(this, 0))) {
                int iA = H1.e.a();
                if (iA == 1) {
                    zB = b();
                } else if (2 <= iA && iA <= Integer.MAX_VALUE && b()) {
                    if (Z1.f.O("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
                        zB = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zB) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return Z1.f.O("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
