package h0;

import a0.C0152C;
import a0.C0153D;
import a0.C0155F;
import a0.InterfaceC0154E;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import d0.C0359l;
import r0.InterfaceC0749b;
import z0.InterfaceC1062d;

/* JADX INFO: renamed from: h0.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SurfaceHolderCallbackC0445D implements D0.A, j0.h, InterfaceC1062d, InterfaceC0749b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0448G f5909l;

    public SurfaceHolderCallbackC0445D(C0448G c0448g) {
        this.f5909l = c0448g;
    }

    @Override // r0.InterfaceC0749b
    public final void onMetadata(C0155F c0155f) {
        C0448G c0448g = this.f5909l;
        C0152C c0152cA = c0448g.f5943c0.a();
        int i = 0;
        while (true) {
            InterfaceC0154E[] interfaceC0154EArr = c0155f.f3211l;
            if (i >= interfaceC0154EArr.length) {
                break;
            }
            interfaceC0154EArr[i].b(c0152cA);
            i++;
        }
        c0448g.f5943c0 = new C0153D(c0152cA);
        C0153D c0153dR = c0448g.r();
        boolean zEquals = c0153dR.equals(c0448g.f5925L);
        C0359l c0359l = c0448g.f5954l;
        if (!zEquals) {
            c0448g.f5925L = c0153dR;
            c0359l.c(14, new I2.g(this, 9));
        }
        c0359l.c(28, new I2.g(c0155f, 10));
        c0359l.b();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i5) {
        C0448G c0448g = this.f5909l;
        c0448g.getClass();
        Surface surface = new Surface(surfaceTexture);
        c0448g.V(surface);
        c0448g.f5927O = surface;
        c0448g.J(i, i5);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0448G c0448g = this.f5909l;
        c0448g.V(null);
        c0448g.J(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i5) {
        this.f5909l.J(i, i5);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i5, int i6) {
        this.f5909l.J(i5, i6);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C0448G c0448g = this.f5909l;
        if (c0448g.f5929Q) {
            c0448g.V(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0448G c0448g = this.f5909l;
        if (c0448g.f5929Q) {
            c0448g.V(null);
        }
        c0448g.J(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
