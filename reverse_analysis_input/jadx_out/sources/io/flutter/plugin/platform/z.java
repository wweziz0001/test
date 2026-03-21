package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class z implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f6836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public y f6837m;

    public z(View view, y yVar) {
        this.f6836l = view;
        this.f6837m = yVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        y yVar = this.f6837m;
        if (yVar == null) {
            return;
        }
        yVar.run();
        this.f6837m = null;
        this.f6836l.post(new y(this, 1));
    }
}
