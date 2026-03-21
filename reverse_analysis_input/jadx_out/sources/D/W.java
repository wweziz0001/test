package D;

import android.view.WindowInsets;
import w.C0939c;

/* JADX INFO: loaded from: classes.dex */
public class W extends V {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C0939c f322k;

    public W(b0 b0Var, WindowInsets windowInsets) {
        super(b0Var, windowInsets);
        this.f322k = null;
    }

    @Override // D.a0
    public b0 b() {
        return b0.c(this.f319c.consumeStableInsets(), null);
    }

    @Override // D.a0
    public b0 c() {
        return b0.c(this.f319c.consumeSystemWindowInsets(), null);
    }

    @Override // D.a0
    public final C0939c f() {
        if (this.f322k == null) {
            WindowInsets windowInsets = this.f319c;
            this.f322k = C0939c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f322k;
    }

    @Override // D.a0
    public boolean i() {
        return this.f319c.isConsumed();
    }

    @Override // D.a0
    public void m(C0939c c0939c) {
        this.f322k = c0939c;
    }
}
