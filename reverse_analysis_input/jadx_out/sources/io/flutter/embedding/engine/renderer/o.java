package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$GLTextureConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;

/* JADX INFO: loaded from: classes.dex */
public final class o implements TextureRegistry$SurfaceProducer, TextureRegistry$GLTextureConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f6675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f6676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f6677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FlutterJNI f6678h;

    public o(long j5, Handler handler, FlutterJNI flutterJNI, i iVar) {
        this.f6671a = j5;
        this.f6677g = handler;
        this.f6678h = flutterJNI;
        this.f6676f = iVar;
    }

    public final void finalize() throws Throwable {
        try {
            if (this.f6674d) {
                return;
            }
            release();
            this.f6677g.post(new j(this.f6671a, this.f6678h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getForcedNewSurface() {
        this.f6675e = null;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getHeight() {
        return this.f6673c;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getSurface() {
        Surface surface = this.f6675e;
        if (surface == null || !surface.isValid()) {
            this.f6675e = new Surface(this.f6676f.f6640b.surfaceTexture());
        }
        return this.f6675e;
    }

    @Override // io.flutter.view.TextureRegistry$GLTextureConsumer
    public final SurfaceTexture getSurfaceTexture() {
        return this.f6676f.f6640b.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getWidth() {
        return this.f6672b;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final long id() {
        return this.f6671a;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void release() {
        this.f6676f.release();
        this.f6675e.release();
        this.f6675e = null;
        this.f6674d = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void scheduleFrame() {
        this.f6678h.markTextureFrameAvailable(this.f6671a);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setCallback(p pVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setSize(int i, int i5) {
        this.f6672b = i;
        this.f6673c = i5;
        this.f6676f.f6640b.surfaceTexture().setDefaultBufferSize(i, i5);
    }
}
