package D;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: D.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0024y implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b0 f377a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f378b;

    public ViewOnApplyWindowInsetsListenerC0024y(View view, InterfaceC0016p interfaceC0016p) {
        this.f378b = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        b0 b0VarC = b0.c(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            AbstractC0025z.a(windowInsets, this.f378b);
            if (b0VarC.equals(this.f377a)) {
                throw null;
            }
        }
        this.f377a = b0VarC;
        throw null;
    }
}
