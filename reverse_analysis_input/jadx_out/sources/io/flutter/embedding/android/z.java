package io.flutter.embedding.android;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* JADX INFO: loaded from: classes.dex */
public final class z implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f6623l;

    public z(A a5) {
        this.f6623l = a5;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i5) {
        A a5 = this.f6623l;
        a5.f6489l = true;
        if ((a5.f6491n == null || a5.f6490m) ? false : true) {
            a5.e();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        A a5 = this.f6623l;
        boolean z4 = false;
        a5.f6489l = false;
        io.flutter.embedding.engine.renderer.l lVar = a5.f6491n;
        if (lVar != null && !a5.f6490m) {
            z4 = true;
        }
        if (z4) {
            if (lVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            lVar.h();
            Surface surface = a5.f6492o;
            if (surface != null) {
                surface.release();
                a5.f6492o = null;
            }
        }
        Surface surface2 = a5.f6492o;
        if (surface2 != null) {
            surface2.release();
            a5.f6492o = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i5) {
        A a5 = this.f6623l;
        io.flutter.embedding.engine.renderer.l lVar = a5.f6491n;
        if (lVar == null || a5.f6490m) {
            return;
        }
        if (lVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        lVar.f6663a.onSurfaceChanged(i, i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
