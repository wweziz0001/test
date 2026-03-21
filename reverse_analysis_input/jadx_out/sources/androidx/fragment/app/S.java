package androidx.fragment.app;

import D.AbstractC0023x;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.reflect.Field;
import l.ViewOnKeyListenerC0547e;
import l.ViewOnKeyListenerC0560r;

/* JADX INFO: loaded from: classes.dex */
public final class S implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f4304m;

    public /* synthetic */ S(Object obj, int i) {
        this.f4303l = i;
        this.f4304m = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f4303l) {
            case 0:
                io.flutter.embedding.android.D d5 = (io.flutter.embedding.android.D) this.f4304m;
                d5.removeOnAttachStateChangeListener(this);
                Field field = D.I.f300a;
                AbstractC0023x.c(d5);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f4303l) {
            case 0:
                break;
            case 1:
                ViewOnKeyListenerC0547e viewOnKeyListenerC0547e = (ViewOnKeyListenerC0547e) this.f4304m;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0547e.f7712I;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0547e.f7712I = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0547e.f7712I.removeGlobalOnLayoutListener(viewOnKeyListenerC0547e.f7722t);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC0560r viewOnKeyListenerC0560r = (ViewOnKeyListenerC0560r) this.f4304m;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC0560r.f7809z;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC0560r.f7809z = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0560r.f7809z.removeGlobalOnLayoutListener(viewOnKeyListenerC0560r.f7804t);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
