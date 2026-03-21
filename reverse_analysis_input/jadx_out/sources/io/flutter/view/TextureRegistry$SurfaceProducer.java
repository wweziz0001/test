package io.flutter.view;

import android.view.Surface;
import g.InterfaceC0434a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0434a
public interface TextureRegistry$SurfaceProducer {
    Surface getForcedNewSurface();

    int getHeight();

    Surface getSurface();

    int getWidth();

    boolean handlesCropAndRotation();

    /* synthetic */ long id();

    /* synthetic */ void release();

    void scheduleFrame();

    void setCallback(p pVar);

    void setSize(int i, int i5);
}
