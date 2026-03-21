package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.lifecycle.F;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f6663a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Surface f6665c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f6670h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f6664b = new AtomicLong(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6666d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f6667e = new Handler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f6668f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f6669g = new ArrayList();

    public l(FlutterJNI flutterJNI) {
        a aVar = new a(this);
        this.f6670h = aVar;
        this.f6663a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
        F.f4475t.f4481q.a(new b(this));
    }

    public final void a(m mVar) {
        this.f6663a.addIsDisplayingFlutterUiListener(mVar);
        if (this.f6666d) {
            mVar.onFlutterUiDisplayed();
        }
    }

    public final void b(io.flutter.view.o oVar) {
        HashSet hashSet = this.f6668f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((io.flutter.view.o) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
        hashSet.add(new WeakReference(oVar));
    }

    public final TextureRegistry$ImageTextureEntry c() {
        FlutterRenderer$ImageTextureRegistryEntry flutterRenderer$ImageTextureRegistryEntry = new FlutterRenderer$ImageTextureRegistryEntry(this, this.f6664b.getAndIncrement());
        flutterRenderer$ImageTextureRegistryEntry.id();
        this.f6663a.registerImageTexture(flutterRenderer$ImageTextureRegistryEntry.id(), flutterRenderer$ImageTextureRegistryEntry, false);
        return flutterRenderer$ImageTextureRegistryEntry;
    }

    public final TextureRegistry$SurfaceProducer d(int i) {
        if (Build.VERSION.SDK_INT < 29) {
            i iVarE = e();
            return new o(iVarE.f6639a, this.f6667e, this.f6663a, iVarE);
        }
        long andIncrement = this.f6664b.getAndIncrement();
        FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
        boolean z4 = i == 2;
        this.f6663a.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer, z4);
        if (z4) {
            b(flutterRenderer$ImageReaderSurfaceProducer);
        }
        this.f6669g.add(flutterRenderer$ImageReaderSurfaceProducer);
        return flutterRenderer$ImageReaderSurfaceProducer;
    }

    public final i e() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        long andIncrement = this.f6664b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        i iVar = new i(this, andIncrement, surfaceTexture);
        this.f6663a.registerTexture(iVar.f6639a, iVar.f6640b);
        b(iVar);
        return iVar;
    }

    public final void f(int i) {
        Iterator it = this.f6668f.iterator();
        while (it.hasNext()) {
            io.flutter.view.o oVar = (io.flutter.view.o) ((WeakReference) it.next()).get();
            if (oVar != null) {
                oVar.onTrimMemory(i);
            } else {
                it.remove();
            }
        }
    }

    public final void g(m mVar) {
        this.f6663a.removeIsDisplayingFlutterUiListener(mVar);
    }

    public final void h() {
        if (this.f6665c != null) {
            this.f6663a.onSurfaceDestroyed();
            if (this.f6666d) {
                this.f6670h.onFlutterUiNoLongerDisplayed();
            }
            this.f6666d = false;
            this.f6665c = null;
        }
    }
}
