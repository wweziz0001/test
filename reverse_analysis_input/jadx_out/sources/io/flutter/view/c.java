package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.E;
import io.flutter.embedding.android.D;

/* JADX INFO: loaded from: classes.dex */
public final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f6845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f6846b;

    public c(k kVar, AccessibilityManager accessibilityManager) {
        this.f6846b = kVar;
        this.f6845a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z4) {
        k kVar = this.f6846b;
        if (kVar.f6947t) {
            return;
        }
        boolean z5 = false;
        if (!z4) {
            kVar.i(false);
            g gVar = kVar.f6942o;
            if (gVar != null) {
                kVar.g(gVar.f6902b, 256);
                kVar.f6942o = null;
            }
        }
        E e5 = kVar.f6945r;
        if (e5 != null) {
            boolean zIsEnabled = this.f6845a.isEnabled();
            D d5 = (D) e5.f4474m;
            if (d5.f6512s.f5606b.f6663a.getIsSoftwareRenderingEnabled()) {
                d5.setWillNotDraw(false);
                return;
            }
            if (!zIsEnabled && !z4) {
                z5 = true;
            }
            d5.setWillNotDraw(z5);
        }
    }
}
