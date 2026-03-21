package D;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: D.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0021v implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final WeakHashMap f372l = new WeakHashMap();

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.f372l.entrySet()) {
                View view = (View) entry.getKey();
                boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                boolean z4 = view.isShown() && view.getWindowVisibility() == 0;
                if (zBooleanValue != z4) {
                    I.b(view, z4 ? 16 : 32);
                    entry.setValue(Boolean.valueOf(z4));
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
