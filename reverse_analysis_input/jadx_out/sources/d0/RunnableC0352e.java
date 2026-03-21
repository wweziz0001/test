package d0;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: renamed from: d0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0352e implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f5278r = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f5279l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int[] f5280m = new int[1];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public EGLDisplay f5281n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EGLContext f5282o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public EGLSurface f5283p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SurfaceTexture f5284q;

    public RunnableC0352e(Handler handler) {
        this.f5279l = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f5279l.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f5284q;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
