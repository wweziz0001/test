package io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class w implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.i f6828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SurfaceTexture f6829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Surface f6830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6831d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6832e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6833f = false;

    public w(io.flutter.embedding.engine.renderer.i iVar) {
        v vVar = new v(this);
        this.f6828a = iVar;
        this.f6829b = iVar.f6640b.surfaceTexture();
        iVar.f6642d = vVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final long a() {
        return this.f6828a.f6639a;
    }

    @Override // io.flutter.plugin.platform.h
    public final void b(int i, int i5) {
        this.f6831d = i;
        this.f6832e = i5;
        SurfaceTexture surfaceTexture = this.f6829b;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i5);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final int getHeight() {
        return this.f6832e;
    }

    @Override // io.flutter.plugin.platform.h
    public final Surface getSurface() {
        Surface surface = this.f6830c;
        if (surface == null || this.f6833f) {
            if (surface != null) {
                surface.release();
                this.f6830c = null;
            }
            this.f6830c = new Surface(this.f6829b);
            this.f6833f = false;
        }
        SurfaceTexture surfaceTexture = this.f6829b;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            return null;
        }
        return this.f6830c;
    }

    @Override // io.flutter.plugin.platform.h
    public final int getWidth() {
        return this.f6831d;
    }

    @Override // io.flutter.plugin.platform.h
    public final void release() {
        this.f6829b = null;
        Surface surface = this.f6830c;
        if (surface != null) {
            surface.release();
            this.f6830c = null;
        }
    }
}
