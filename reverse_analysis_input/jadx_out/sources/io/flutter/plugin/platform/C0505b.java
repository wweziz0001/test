package io.flutter.plugin.platform;

import android.media.Image;
import android.media.ImageReader;
import android.util.Log;
import io.flutter.view.TextureRegistry$ImageTextureEntry;

/* JADX INFO: renamed from: io.flutter.plugin.platform.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0505b implements ImageReader.OnImageAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f6744a;

    public C0505b(c cVar) {
        this.f6744a = cVar;
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image imageAcquireLatestImage;
        try {
            imageAcquireLatestImage = imageReader.acquireLatestImage();
        } catch (IllegalStateException e5) {
            Log.e("ImageReaderPlatformViewRenderTarget", "onImageAvailable acquireLatestImage failed: " + e5.toString());
            imageAcquireLatestImage = null;
        }
        if (imageAcquireLatestImage == null) {
            return;
        }
        ((TextureRegistry$ImageTextureEntry) this.f6744a.f6747c).pushImage(imageAcquireLatestImage);
    }
}
