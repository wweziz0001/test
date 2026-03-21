package io.flutter.embedding.android;

import android.view.Surface;
import android.view.SurfaceHolder;
import h0.C0448G;
import h0.InterfaceC0467s;

/* JADX INFO: loaded from: classes.dex */
public final class x implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6617l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6618m;

    public /* synthetic */ x(Object obj, int i) {
        this.f6617l = i;
        this.f6618m = obj;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i5, int i6) {
        switch (this.f6617l) {
            case 0:
                y yVar = (y) this.f6618m;
                io.flutter.embedding.engine.renderer.l lVar = yVar.f6621n;
                if (lVar == null || yVar.f6620m) {
                    return;
                }
                if (lVar == null) {
                    throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
                }
                lVar.f6663a.onSurfaceChanged(i5, i6);
                return;
            default:
                return;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        switch (this.f6617l) {
            case 0:
                y yVar = (y) this.f6618m;
                yVar.f6619l = true;
                if ((yVar.f6621n == null || yVar.f6620m) ? false : true) {
                    yVar.e();
                }
                break;
            default:
                Surface surface = surfaceHolder.getSurface();
                Object obj = (InterfaceC0467s) this.f6618m;
                ((C0448G) obj).W(surface);
                L0.e eVar = (L0.e) obj;
                eVar.getClass();
                eVar.n(((C0448G) eVar).w(), 1L, false);
                break;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        switch (this.f6617l) {
            case 0:
                y yVar = (y) this.f6618m;
                boolean z4 = false;
                yVar.f6619l = false;
                io.flutter.embedding.engine.renderer.l lVar = yVar.f6621n;
                if (lVar != null && !yVar.f6620m) {
                    z4 = true;
                }
                if (z4) {
                    if (lVar == null) {
                        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                    }
                    lVar.h();
                    return;
                }
                return;
            default:
                ((C0448G) ((InterfaceC0467s) this.f6618m)).W(null);
                return;
        }
    }

    private final void a(SurfaceHolder surfaceHolder, int i, int i5, int i6) {
    }
}
