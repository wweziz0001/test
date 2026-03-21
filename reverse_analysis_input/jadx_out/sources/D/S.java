package D;

import android.view.WindowInsets;
import w.C0939c;

/* JADX INFO: loaded from: classes.dex */
public class S extends U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f314a;

    public S() {
        this.f314a = Q.i();
    }

    @Override // D.U
    public b0 b() {
        a();
        b0 b0VarC = b0.c(this.f314a.build(), null);
        b0VarC.f331a.k(null);
        return b0VarC;
    }

    @Override // D.U
    public void c(C0939c c0939c) {
        this.f314a.setStableInsets(c0939c.b());
    }

    @Override // D.U
    public void d(C0939c c0939c) {
        this.f314a.setSystemWindowInsets(c0939c.b());
    }

    public S(b0 b0Var) {
        WindowInsets.Builder builderI;
        super(b0Var);
        WindowInsets windowInsetsB = b0Var.b();
        if (windowInsetsB != null) {
            builderI = Q.j(windowInsetsB);
        } else {
            builderI = Q.i();
        }
        this.f314a = builderI;
    }
}
