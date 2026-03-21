package w3;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import h0.C0448G;
import h0.InterfaceC0467s;
import io.flutter.embedding.android.x;
import io.flutter.plugin.platform.g;

/* JADX INFO: renamed from: w3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0948a implements g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10505l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View f10506m;

    public C0948a(Context context, InterfaceC0467s interfaceC0467s) {
        SurfaceView surfaceView = new SurfaceView(context);
        this.f10506m = surfaceView;
        int i = Build.VERSION.SDK_INT;
        if (i == 28) {
            surfaceView.getHolder().addCallback(new x(interfaceC0467s, 1));
            return;
        }
        if (i <= 25) {
            surfaceView.setZOrderMediaOverlay(true);
        }
        C0448G c0448g = (C0448G) interfaceC0467s;
        c0448g.d0();
        SurfaceHolder holder = surfaceView.getHolder();
        c0448g.d0();
        if (holder == null) {
            c0448g.d0();
            c0448g.N();
            c0448g.V(null);
            c0448g.J(0, 0);
            return;
        }
        c0448g.N();
        c0448g.f5929Q = true;
        c0448g.f5928P = holder;
        holder.addCallback(c0448g.f5964v);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            c0448g.V(null);
            c0448g.J(0, 0);
        } else {
            c0448g.V(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            c0448g.J(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // io.flutter.plugin.platform.g
    public final void b() {
        switch (this.f10505l) {
            case 0:
                ((SurfaceView) this.f10506m).getHolder().getSurface().release();
                break;
        }
    }

    @Override // io.flutter.plugin.platform.g
    public final View getView() {
        switch (this.f10505l) {
            case 0:
                return (SurfaceView) this.f10506m;
            default:
                return this.f10506m;
        }
    }

    public C0948a(View view) {
        this.f10506m = view;
    }

    private final void a() {
    }
}
