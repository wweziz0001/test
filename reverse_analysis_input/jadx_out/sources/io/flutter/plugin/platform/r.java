package io.flutter.plugin.platform;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class r extends FrameLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0504a f6818l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f6819m;

    public r(Context context, C0504a c0504a, View view) {
        super(context);
        this.f6818l = c0504a;
        this.f6819m = view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.k kVar = this.f6818l.f6743a;
        if (kVar == null) {
            return false;
        }
        return kVar.a(this.f6819m, view, accessibilityEvent);
    }
}
