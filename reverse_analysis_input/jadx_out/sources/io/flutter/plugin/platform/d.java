package io.flutter.plugin.platform;

import android.view.MotionEvent;
import io.flutter.embedding.android.C0503w;

/* JADX INFO: loaded from: classes.dex */
public final class d extends C0503w {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0504a f6751r;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C0504a c0504a = this.f6751r;
        if (c0504a != null) {
            io.flutter.view.k kVar = c0504a.f6743a;
            if (kVar == null ? false : kVar.e(motionEvent, true)) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
