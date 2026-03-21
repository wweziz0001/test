package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.E;
import io.flutter.embedding.android.D;
import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: loaded from: classes.dex */
public final class b implements AccessibilityManager.AccessibilityStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f6844a;

    public b(k kVar) {
        this.f6844a = kVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z4) {
        k kVar = this.f6844a;
        if (kVar.f6947t) {
            return;
        }
        boolean z5 = false;
        Z1.m mVar = kVar.f6930b;
        if (z4) {
            a aVar = kVar.f6948u;
            mVar.f3026o = aVar;
            ((FlutterJNI) mVar.f3025n).setAccessibilityDelegate(aVar);
            ((FlutterJNI) mVar.f3025n).setSemanticsEnabled(true);
        } else {
            kVar.i(false);
            mVar.f3026o = null;
            ((FlutterJNI) mVar.f3025n).setAccessibilityDelegate(null);
            ((FlutterJNI) mVar.f3025n).setSemanticsEnabled(false);
        }
        E e5 = kVar.f6945r;
        if (e5 != null) {
            boolean zIsTouchExplorationEnabled = kVar.f6931c.isTouchExplorationEnabled();
            D d5 = (D) e5.f4474m;
            if (d5.f6512s.f5606b.f6663a.getIsSoftwareRenderingEnabled()) {
                d5.setWillNotDraw(false);
                return;
            }
            if (!z4 && !zIsTouchExplorationEnabled) {
                z5 = true;
            }
            d5.setWillNotDraw(z5);
        }
    }
}
