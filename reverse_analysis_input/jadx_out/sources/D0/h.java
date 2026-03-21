package D0;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import d0.AbstractC0360m;
import d0.AbstractC0370w;
import d0.C0353f;
import d0.RunnableC0352e;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RunnableC0352e f439l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Handler f440m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Error f441n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RuntimeException f442o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i f443p;

    public final void a(int i) throws C0353f {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.f439l.getClass();
        RunnableC0352e runnableC0352e = this.f439l;
        runnableC0352e.getClass();
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC0360m.d("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
        int[] iArr = new int[2];
        AbstractC0360m.d("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
        runnableC0352e.f5281n = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, RunnableC0352e.f5278r, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z4 = zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
        int i5 = AbstractC0370w.f5326a;
        AbstractC0360m.d(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z4);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(runnableC0352e.f5281n, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC0360m.d("eglCreateContext failed", eGLContextEglCreateContext != null);
        runnableC0352e.f5282o = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = runnableC0352e.f5281n;
        if (i == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC0360m.d("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
        }
        AbstractC0360m.d("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
        runnableC0352e.f5283p = eGLSurfaceEglCreatePbufferSurface;
        int[] iArr3 = runnableC0352e.f5280m;
        GLES20.glGenTextures(1, iArr3, 0);
        StringBuilder sb = new StringBuilder();
        boolean z5 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z5) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z5 = true;
        }
        if (z5) {
            throw new C0353f(sb.toString());
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        runnableC0352e.f5284q = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(runnableC0352e);
        SurfaceTexture surfaceTexture2 = this.f439l.f5284q;
        surfaceTexture2.getClass();
        this.f443p = new i(this, surfaceTexture2, i != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f439l.getClass();
        RunnableC0352e runnableC0352e = this.f439l;
        runnableC0352e.f5279l.removeCallbacks(runnableC0352e);
        try {
            SurfaceTexture surfaceTexture = runnableC0352e.f5284q;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, runnableC0352e.f5280m, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = runnableC0352e.f5281n;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = runnableC0352e.f5281n;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = runnableC0352e.f5283p;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(runnableC0352e.f5281n, runnableC0352e.f5283p);
            }
            EGLContext eGLContext = runnableC0352e.f5282o;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(runnableC0352e.f5281n, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = runnableC0352e.f5281n;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(runnableC0352e.f5281n);
            }
            runnableC0352e.f5281n = null;
            runnableC0352e.f5282o = null;
            runnableC0352e.f5283p = null;
            runnableC0352e.f5284q = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    b();
                } finally {
                    try {
                    } finally {
                    }
                }
                return true;
            }
            try {
                a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (C0353f e5) {
                AbstractC0360m.m("PlaceholderSurface", "Failed to initialize placeholder surface", e5);
                this.f442o = new IllegalStateException(e5);
                synchronized (this) {
                    notify();
                }
            } catch (Error e6) {
                AbstractC0360m.m("PlaceholderSurface", "Failed to initialize placeholder surface", e6);
                this.f441n = e6;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e7) {
                AbstractC0360m.m("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                this.f442o = e7;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
