package D;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends c0 {
    @Override // Z1.f
    public final void I(boolean z4) {
        Window window = this.f340q;
        if (!z4) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}
