package io.flutter.embedding.android;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: loaded from: classes.dex */
public final class A extends TextureView implements io.flutter.embedding.engine.renderer.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6489l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6490m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f6491n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Surface f6492o;

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a() {
        if (this.f6491n == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f6490m = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b(io.flutter.embedding.engine.renderer.l lVar) {
        io.flutter.embedding.engine.renderer.l lVar2 = this.f6491n;
        if (lVar2 != null) {
            lVar2.h();
        }
        this.f6491n = lVar;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c() {
        if (this.f6491n == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.l lVar = this.f6491n;
            if (lVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            lVar.h();
            Surface surface = this.f6492o;
            if (surface != null) {
                surface.release();
                this.f6492o = null;
            }
        }
        this.f6491n = null;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void d() {
        if (this.f6491n == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f6489l) {
            e();
        }
        this.f6490m = false;
    }

    public final void e() {
        if (this.f6491n == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f6492o;
        if (surface != null) {
            surface.release();
            this.f6492o = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f6492o = surface2;
        io.flutter.embedding.engine.renderer.l lVar = this.f6491n;
        boolean z4 = this.f6490m;
        if (!z4) {
            lVar.h();
        }
        lVar.f6665c = surface2;
        FlutterJNI flutterJNI = lVar.f6663a;
        if (z4) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public io.flutter.embedding.engine.renderer.l getAttachedRenderer() {
        return this.f6491n;
    }

    public void setRenderSurface(Surface surface) {
        this.f6492o = surface;
    }
}
