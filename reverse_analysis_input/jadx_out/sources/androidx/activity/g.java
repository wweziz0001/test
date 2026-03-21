package androidx.activity;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.AbstractActivityC0255w;
import androidx.lifecycle.EnumC0272n;
import androidx.lifecycle.InterfaceC0276s;
import androidx.lifecycle.InterfaceC0278u;

/* JADX INFO: loaded from: classes.dex */
public final class g implements InterfaceC0276s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f3745b;

    public /* synthetic */ g(m mVar, int i) {
        this.f3744a = i;
        this.f3745b = mVar;
    }

    @Override // androidx.lifecycle.InterfaceC0276s
    public final void b(InterfaceC0278u interfaceC0278u, EnumC0272n enumC0272n) {
        switch (this.f3744a) {
            case 0:
                if (enumC0272n == EnumC0272n.ON_DESTROY) {
                    ((AbstractActivityC0255w) this.f3745b).mContextAwareHelper.f5269b = null;
                    if (!((AbstractActivityC0255w) this.f3745b).isChangingConfigurations()) {
                        ((AbstractActivityC0255w) this.f3745b).getViewModelStore().a();
                    }
                    l lVar = (l) ((AbstractActivityC0255w) this.f3745b).mReportFullyDrawnExecutor;
                    AbstractActivityC0255w abstractActivityC0255w = lVar.f3752o;
                    abstractActivityC0255w.getWindow().getDecorView().removeCallbacks(lVar);
                    abstractActivityC0255w.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(lVar);
                }
                break;
            case 1:
                if (enumC0272n == EnumC0272n.ON_STOP) {
                    Window window = ((AbstractActivityC0255w) this.f3745b).getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
                break;
            case 2:
                AbstractActivityC0255w abstractActivityC0255w2 = (AbstractActivityC0255w) this.f3745b;
                abstractActivityC0255w2.ensureViewModelStore();
                abstractActivityC0255w2.getLifecycle().b(this);
                break;
            default:
                if (enumC0272n == EnumC0272n.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                    x xVar = this.f3745b.mOnBackPressedDispatcher;
                    OnBackInvokedDispatcher onBackInvokedDispatcherA = i.a((m) interfaceC0278u);
                    xVar.getClass();
                    N3.h.e(onBackInvokedDispatcherA, "invoker");
                    xVar.f3779e = onBackInvokedDispatcherA;
                    xVar.c(xVar.f3781g);
                    break;
                }
                break;
        }
    }
}
