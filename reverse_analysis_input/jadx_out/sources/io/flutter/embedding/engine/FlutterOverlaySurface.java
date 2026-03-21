package io.flutter.embedding.engine;

import android.view.Surface;
import g.InterfaceC0434a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0434a
public class FlutterOverlaySurface {
    private final int id;
    private final Surface surface;

    public FlutterOverlaySurface(int i, Surface surface) {
        this.id = i;
        this.surface = surface;
    }

    public int getId() {
        return this.id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
