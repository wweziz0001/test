package x3;

import h0.InterfaceC0467s;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;
import v3.AbstractC0920a;
import v3.AbstractC0934o;

/* JADX INFO: renamed from: x3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0992b extends AbstractC0934o implements p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10830e;

    @Override // v3.AbstractC0934o
    public final AbstractC0920a a(InterfaceC0467s interfaceC0467s, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer) {
        if (textureRegistry$SurfaceProducer == null) {
            throw new IllegalArgumentException("surfaceProducer cannot be null to create an ExoPlayerEventListener for TextureVideoPlayer.");
        }
        boolean zHandlesCropAndRotation = textureRegistry$SurfaceProducer.handlesCropAndRotation();
        C0991a c0991a = new C0991a(interfaceC0467s, this.f10391a);
        c0991a.f10829p = zHandlesCropAndRotation;
        return c0991a;
    }

    @Override // v3.AbstractC0934o
    public final void b() {
        super.b();
        this.f10392b.release();
    }
}
