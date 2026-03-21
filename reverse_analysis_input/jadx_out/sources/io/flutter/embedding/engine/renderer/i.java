package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i implements TextureRegistry$SurfaceTextureEntry, io.flutter.view.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SurfaceTextureWrapper f6640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.flutter.view.o f6642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f6643e;

    public i(l lVar, long j5, SurfaceTexture surfaceTexture) {
        this.f6643e = lVar;
        this.f6639a = j5;
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture, new d(this, 1));
        this.f6640b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i iVar = this.f6638l;
                if (iVar.f6641c) {
                    return;
                }
                l lVar2 = iVar.f6643e;
                if (lVar2.f6663a.isAttached()) {
                    iVar.f6640b.markDirty();
                    lVar2.f6663a.scheduleFrame();
                }
            }
        }, new Handler());
    }

    public final void finalize() throws Throwable {
        try {
            if (this.f6641c) {
                return;
            }
            l lVar = this.f6643e;
            lVar.f6667e.post(new j(this.f6639a, lVar.f6663a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final long id() {
        return this.f6639a;
    }

    @Override // io.flutter.view.o
    public final void onTrimMemory(int i) {
        io.flutter.view.o oVar = this.f6642d;
        if (oVar != null) {
            oVar.onTrimMemory(i);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.f6641c) {
            return;
        }
        this.f6640b.release();
        l lVar = this.f6643e;
        lVar.f6663a.unregisterTexture(this.f6639a);
        HashSet hashSet = lVar.f6668f;
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == this) {
                hashSet.remove(weakReference);
                break;
            }
        }
        this.f6641c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(io.flutter.view.n nVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(io.flutter.view.o oVar) {
        this.f6642d = oVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final SurfaceTexture surfaceTexture() {
        return this.f6640b.surfaceTexture();
    }
}
