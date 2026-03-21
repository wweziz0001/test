package D0;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import d0.AbstractC0370w;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Surface {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f444o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f445p;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f448n;

    public i(h hVar, SurfaceTexture surfaceTexture, boolean z4) {
        super(surfaceTexture);
        this.f447m = hVar;
        this.f446l = z4;
    }

    public static synchronized boolean d(Context context) {
        String strEglQueryString;
        int i;
        try {
            if (!f445p) {
                int i5 = AbstractC0370w.f5326a;
                if (i5 >= 24 && ((i5 >= 26 || !("samsung".equals(AbstractC0370w.f5328c) || "XT1650".equals(AbstractC0370w.f5329d))) && ((i5 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
                    String strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i = strEglQueryString2 != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                } else {
                    i = 0;
                }
                f444o = i;
                f445p = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f444o != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f447m) {
            try {
                if (!this.f448n) {
                    h hVar = this.f447m;
                    hVar.f440m.getClass();
                    hVar.f440m.sendEmptyMessage(2);
                    this.f448n = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
