package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: loaded from: classes.dex */
public final class y extends SurfaceView implements io.flutter.embedding.engine.renderer.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6619l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6620m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f6621n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final V f6622o;

    public y(Context context, boolean z4) {
        super(context, null);
        this.f6619l = false;
        this.f6620m = false;
        V v4 = new V(new x(this, 0), this, this.f6621n);
        this.f6622o = v4;
        if (z4) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(v4);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a() {
        if (this.f6621n == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f6620m = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b(io.flutter.embedding.engine.renderer.l lVar) {
        io.flutter.embedding.engine.renderer.l lVar2 = this.f6621n;
        if (lVar2 != null) {
            lVar2.h();
        }
        this.f6621n = lVar;
        U u4 = this.f6622o.f6557p;
        switch (u4.f6551a) {
            case 0:
                u4.f6552b.f6554m = lVar;
                break;
            default:
                V v4 = u4.f6552b;
                io.flutter.embedding.engine.renderer.l lVar3 = v4.f6554m;
                if (lVar3 != null) {
                    lVar3.g(v4.f6556o);
                }
                v4.f6554m = lVar;
                break;
        }
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c() {
        if (this.f6621n == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.l lVar = this.f6621n;
            if (lVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            lVar.h();
        }
        U u4 = this.f6622o.f6557p;
        switch (u4.f6551a) {
            case 0:
                u4.f6552b.f6554m = null;
                break;
            default:
                V v4 = u4.f6552b;
                v4.f6553l.setAlpha(0.0f);
                io.flutter.embedding.engine.renderer.l lVar2 = v4.f6554m;
                if (lVar2 != null) {
                    lVar2.g(v4.f6556o);
                }
                v4.f6554m = null;
                break;
        }
        this.f6621n = null;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void d() {
        if (this.f6621n == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        U u4 = this.f6622o.f6557p;
        switch (u4.f6551a) {
            case 0:
                break;
            default:
                V v4 = u4.f6552b;
                io.flutter.embedding.engine.renderer.l lVar = v4.f6554m;
                if (lVar != null) {
                    lVar.a(v4.f6556o);
                }
                break;
        }
        if (this.f6619l) {
            e();
        }
        this.f6620m = false;
    }

    public final void e() {
        if (this.f6621n == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.l lVar = this.f6621n;
        Surface surface = getHolder().getSurface();
        boolean z4 = this.f6620m;
        if (!z4) {
            lVar.h();
        }
        lVar.f6665c = surface;
        FlutterJNI flutterJNI = lVar.f6663a;
        if (z4) {
            flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            flutterJNI.onSurfaceCreated(surface);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], (getRight() + i) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public io.flutter.embedding.engine.renderer.l getAttachedRenderer() {
        return this.f6621n;
    }
}
