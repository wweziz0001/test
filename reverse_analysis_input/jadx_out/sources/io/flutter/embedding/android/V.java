package io.flutter.embedding.android;

import android.os.Build;
import android.view.SurfaceHolder;

/* JADX INFO: loaded from: classes.dex */
public final class V implements SurfaceHolder.Callback2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y f6553l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f6554m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x f6555n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0489h f6556o = new C0489h(this, 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final U f6557p;

    public V(x xVar, y yVar, io.flutter.embedding.engine.renderer.l lVar) {
        boolean z4 = Build.VERSION.SDK_INT < 26;
        this.f6557p = z4 ? new U(this, 1) : new U(this, 0);
        this.f6555n = xVar;
        this.f6554m = lVar;
        this.f6553l = yVar;
        if (z4) {
            yVar.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i5, int i6) {
        x xVar = this.f6555n;
        if (xVar != null) {
            xVar.surfaceChanged(surfaceHolder, i, i5, i6);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        x xVar = this.f6555n;
        if (xVar != null) {
            xVar.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        x xVar = this.f6555n;
        if (xVar != null) {
            xVar.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.l lVar = this.f6554m;
        if (lVar == null) {
            return;
        }
        lVar.a(new T(this, runnable));
    }
}
