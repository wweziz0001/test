package i3;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import io.flutter.plugin.platform.i;
import y3.C1013H;

/* JADX INFO: renamed from: i3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC0481a implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6476l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f6477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f6478n;

    public ViewTreeObserverOnGlobalFocusChangeListenerC0481a(View.OnFocusChangeListener onFocusChangeListener, b bVar) {
        this.f6477m = onFocusChangeListener;
        this.f6478n = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f6476l) {
            case 0:
                b bVar = (b) this.f6478n;
                this.f6477m.onFocusChange(bVar, i4.a.a0(bVar, new C1013H(25)));
                break;
            default:
                C1013H c1013h = new C1013H(25);
                i iVar = (i) this.f6478n;
                this.f6477m.onFocusChange(iVar, i4.a.a0(iVar, c1013h));
                break;
        }
    }

    public ViewTreeObserverOnGlobalFocusChangeListenerC0481a(i iVar, View.OnFocusChangeListener onFocusChangeListener) {
        this.f6478n = iVar;
        this.f6477m = onFocusChangeListener;
    }
}
