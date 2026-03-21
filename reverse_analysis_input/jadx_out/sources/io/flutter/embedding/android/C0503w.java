package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: renamed from: io.flutter.embedding.android.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0503w extends View implements io.flutter.embedding.engine.renderer.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageReader f6611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Image f6612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bitmap f6613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f6614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f6615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6616q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0503w(Context context, int i, int i5, int i6) {
        super(context, null);
        ImageReader imageReaderF = f(i, i5);
        this.f6616q = false;
        this.f6611l = imageReaderF;
        this.f6615p = i6;
        setAlpha(0.0f);
    }

    public static ImageReader f(int i, int i5) {
        if (i <= 0) {
            Locale locale = Locale.US;
            Log.w("FlutterImageView", "ImageReader width must be greater than 0, but given width=" + i + ", set width=1");
            i = 1;
        }
        if (i5 <= 0) {
            Locale locale2 = Locale.US;
            Log.w("FlutterImageView", "ImageReader height must be greater than 0, but given height=" + i5 + ", set height=1");
            i5 = 1;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i, i5, 1, 3, 768L) : ImageReader.newInstance(i, i5, 1, 3);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a() {
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b(io.flutter.embedding.engine.renderer.l lVar) {
        if (O.i.b(this.f6615p) == 0) {
            Surface surface = this.f6611l.getSurface();
            lVar.f6665c = surface;
            lVar.f6663a.onSurfaceWindowChanged(surface);
        }
        setAlpha(1.0f);
        this.f6614o = lVar;
        this.f6616q = true;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c() {
        if (this.f6616q) {
            setAlpha(0.0f);
            e();
            this.f6613n = null;
            Image image = this.f6612m;
            if (image != null) {
                image.close();
                this.f6612m = null;
            }
            invalidate();
            this.f6616q = false;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void d() {
    }

    public final boolean e() {
        if (!this.f6616q) {
            return false;
        }
        Image imageAcquireLatestImage = this.f6611l.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            Image image = this.f6612m;
            if (image != null) {
                image.close();
                this.f6612m = null;
            }
            this.f6612m = imageAcquireLatestImage;
            invalidate();
        }
        return imageAcquireLatestImage != null;
    }

    public final void g(int i, int i5) {
        if (this.f6614o == null) {
            return;
        }
        if (i == this.f6611l.getWidth() && i5 == this.f6611l.getHeight()) {
            return;
        }
        Image image = this.f6612m;
        if (image != null) {
            image.close();
            this.f6612m = null;
        }
        this.f6611l.close();
        this.f6611l = f(i, i5);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public io.flutter.embedding.engine.renderer.l getAttachedRenderer() {
        return this.f6614o;
    }

    public ImageReader getImageReader() {
        return this.f6611l;
    }

    public Surface getSurface() {
        return this.f6611l.getSurface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Image image = this.f6612m;
        if (image != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                HardwareBuffer hardwareBuffer = image.getHardwareBuffer();
                this.f6613n = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
                hardwareBuffer.close();
            } else {
                Image.Plane[] planes = image.getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    int rowStride = plane.getRowStride() / plane.getPixelStride();
                    int height = this.f6612m.getHeight();
                    Bitmap bitmap = this.f6613n;
                    if (bitmap == null || bitmap.getWidth() != rowStride || this.f6613n.getHeight() != height) {
                        this.f6613n = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
                    }
                    ByteBuffer buffer = plane.getBuffer();
                    buffer.rewind();
                    this.f6613n.copyPixelsFromBuffer(buffer);
                }
            }
        }
        Bitmap bitmap2 = this.f6613n;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i5, int i6, int i7) {
        if (!(i == this.f6611l.getWidth() && i5 == this.f6611l.getHeight()) && this.f6615p == 1 && this.f6616q) {
            g(i, i5);
            io.flutter.embedding.engine.renderer.l lVar = this.f6614o;
            Surface surface = this.f6611l.getSurface();
            lVar.f6665c = surface;
            lVar.f6663a.onSurfaceWindowChanged(surface);
        }
    }
}
