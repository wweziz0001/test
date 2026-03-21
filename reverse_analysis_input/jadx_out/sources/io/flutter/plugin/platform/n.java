package io.flutter.plugin.platform;

import android.media.MediaCodecInfo;
import android.view.Surface;
import android.view.SurfaceControl;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class n {
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint b() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint c(int i, int i5, int i6) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i5, i6);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* synthetic */ Surface f(SurfaceControl surfaceControl) {
        return new Surface(surfaceControl);
    }

    public static /* synthetic */ SurfaceControl.Builder g() {
        return new SurfaceControl.Builder();
    }

    public static /* synthetic */ SurfaceControl.Transaction h() {
        return new SurfaceControl.Transaction();
    }

    public static /* bridge */ /* synthetic */ SurfaceControl.Transaction i(Object obj) {
        return (SurfaceControl.Transaction) obj;
    }

    public static /* synthetic */ void l() {
    }
}
