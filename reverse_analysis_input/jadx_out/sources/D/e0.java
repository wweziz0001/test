package D;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends Z1.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final WindowInsetsController f342q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Window f343r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Window window) {
        super(3);
        WindowInsetsController insetsController = window.getInsetsController();
        this.f342q = insetsController;
        this.f343r = window;
    }

    @Override // Z1.f
    public final void I(boolean z4) {
        Window window = this.f343r;
        if (z4) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f342q.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f342q.setSystemBarsAppearance(0, 16);
    }

    @Override // Z1.f
    public final void J(boolean z4) {
        Window window = this.f343r;
        if (z4) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f342q.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f342q.setSystemBarsAppearance(0, 8);
    }
}
