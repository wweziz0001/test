package f3;

import Z1.s;
import a0.C0200z;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import androidx.lifecycle.E;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import n3.C0702l;
import n3.InterfaceC0694d;
import n3.InterfaceC0695e;
import n3.InterfaceC0696f;
import z3.AbstractC1068a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0696f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final FlutterJNI f5747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AssetManager f5748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f5749n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j f5750o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final E f5751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5752q;

    public b(FlutterJNI flutterJNI, AssetManager assetManager, long j5) {
        this.f5752q = false;
        E e5 = new E(this, 2);
        this.f5747l = flutterJNI;
        this.f5748m = assetManager;
        this.f5749n = j5;
        j jVar = new j(flutterJNI);
        this.f5750o = jVar;
        jVar.d("flutter/isolate", e5, null);
        this.f5751p = new E(jVar, 3);
        if (flutterJNI.isAttached()) {
            this.f5752q = true;
        }
    }

    public final void a(s sVar) {
        if (this.f5752q) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        AbstractC1068a.b("DartExecutor#executeDartCallback");
        try {
            Objects.toString(sVar);
            FlutterJNI flutterJNI = this.f5747l;
            String str = (String) sVar.f3086n;
            FlutterCallbackInformation flutterCallbackInformation = (FlutterCallbackInformation) sVar.f3087o;
            flutterJNI.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, (AssetManager) sVar.f3085m, null, this.f5749n);
            this.f5752q = true;
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(C0433a c0433a, List list) {
        if (this.f5752q) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        AbstractC1068a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(c0433a);
            this.f5747l.runBundleAndSnapshotFromLibrary(c0433a.f5744a, c0433a.f5746c, c0433a.f5745b, this.f5748m, list, this.f5749n);
            this.f5752q = true;
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // n3.InterfaceC0696f
    public final void d(String str, InterfaceC0694d interfaceC0694d, C0200z c0200z) {
        this.f5751p.d(str, interfaceC0694d, c0200z);
    }

    @Override // n3.InterfaceC0696f
    public final void h(String str, ByteBuffer byteBuffer, InterfaceC0695e interfaceC0695e) {
        this.f5751p.h(str, byteBuffer, interfaceC0695e);
    }

    @Override // n3.InterfaceC0696f
    public final C0200z j(C0702l c0702l) {
        return ((j) this.f5751p.f4474m).j(c0702l);
    }

    @Override // n3.InterfaceC0696f
    public final void k(String str, InterfaceC0694d interfaceC0694d) {
        this.f5751p.k(str, interfaceC0694d);
    }

    @Override // n3.InterfaceC0696f
    public final void l(String str, ByteBuffer byteBuffer) {
        this.f5751p.l(str, byteBuffer);
    }
}
