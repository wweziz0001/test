package D;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends Z1.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Window f340q;

    public c0(Window window) {
        super(3);
        this.f340q = window;
    }

    @Override // Z1.f
    public final void J(boolean z4) {
        Window window = this.f340q;
        if (!z4) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
