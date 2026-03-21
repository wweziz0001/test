package io.flutter.view;

import android.graphics.SurfaceTexture;
import g.InterfaceC0434a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0434a
public interface TextureRegistry$SurfaceTextureEntry {
    /* synthetic */ long id();

    /* synthetic */ void release();

    default void setOnFrameConsumedListener(n nVar) {
    }

    default void setOnTrimMemoryListener(o oVar) {
    }

    SurfaceTexture surfaceTexture();
}
