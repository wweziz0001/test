package io.flutter.embedding.engine.renderer;

import androidx.lifecycle.InterfaceC0263e;
import h0.C0448G;
import x3.C0992b;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0263e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f6625a;

    public b(l lVar) {
        this.f6625a = lVar;
    }

    @Override // androidx.lifecycle.InterfaceC0263e
    public final void a() {
        for (FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer : this.f6625a.f6669g) {
            if (flutterRenderer$ImageReaderSurfaceProducer.callback != null && flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy) {
                flutterRenderer$ImageReaderSurfaceProducer.notifiedDestroy = false;
                C0992b c0992b = (C0992b) flutterRenderer$ImageReaderSurfaceProducer.callback;
                if (c0992b.f10830e) {
                    ((C0448G) c0992b.f10394d).W(c0992b.f10392b.getSurface());
                    c0992b.f10830e = false;
                }
            }
        }
    }
}
