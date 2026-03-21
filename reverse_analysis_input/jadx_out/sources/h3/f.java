package h3;

import a0.C0200z;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import m.B0;
import z3.AbstractC1068a;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6321a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0200z f6322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f6324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FlutterJNI f6325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExecutorService f6326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Future f6327g;

    public f(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f6325e = flutterJNI;
        this.f6326f = executorService;
    }

    public final void a(Context context, String[] strArr) {
        if (this.f6321a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f6322b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            AbstractC1068a.b("FlutterLoader#ensureInitializationComplete");
            try {
                e eVar = (e) this.f6327g.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                StringBuilder sb = new StringBuilder("--icu-native-lib-path=");
                sb.append(this.f6324d.f6310d);
                String str = File.separator;
                sb.append(str);
                sb.append("libflutter.so");
                arrayList.add(sb.toString());
                if (strArr != null) {
                    Collections.addAll(arrayList, strArr);
                }
                arrayList.add("--aot-shared-library-name=".concat(this.f6324d.f6307a));
                arrayList.add("--aot-shared-library-name=" + this.f6324d.f6310d + str + this.f6324d.f6307a);
                StringBuilder sb2 = new StringBuilder("--cache-dir-path=");
                sb2.append(eVar.f6320b);
                arrayList.add(sb2.toString());
                arrayList.add("--domain-network-policy=".concat(this.f6324d.f6309c));
                this.f6322b.getClass();
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i == 0) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i = (int) ((r10.totalMem / 1000000.0d) / 2.0d);
                }
                arrayList.add("--old-gen-heap-size=" + i);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.containsKey("io.flutter.embedding.android.EnableImpeller")) {
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller")) {
                            arrayList.add("--enable-impeller=true");
                        } else {
                            arrayList.add("--enable-impeller=false");
                        }
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                        arrayList.add("--enable-opengl-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                        arrayList.add("--enable-vulkan-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread", false)) {
                        arrayList.add("--merged-platform-ui-thread=disabled");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableFlutterGPU", false)) {
                        arrayList.add("--enable-flutter-gpu");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false)) {
                        arrayList.add("--enable-surface-control");
                    }
                    String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                    if (string != null) {
                        arrayList.add("--impeller-backend=".concat(string));
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerLazyShaderInitialization")) {
                        arrayList.add("--impeller-lazy-shader-mode");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.ImpellerAntialiasLines")) {
                        arrayList.add("--impeller-antialias-lines");
                    }
                }
                arrayList.add("--leak-vm=".concat(bundle == null ? true : bundle.getBoolean("io.flutter.embedding.android.LeakVM", true) ? "true" : "false"));
                this.f6325e.init(context, (String[]) arrayList.toArray(new String[0]), null, eVar.f6319a, eVar.f6320b, SystemClock.uptimeMillis() - this.f6323c, Build.VERSION.SDK_INT);
                this.f6321a = true;
                Trace.endSection();
            } finally {
            }
        } catch (Exception e5) {
            Log.e("FlutterLoader", "Flutter initialization failed.", e5);
            throw new RuntimeException(e5);
        }
    }

    public final String b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6324d.f6308b);
        return B0.i(sb, File.separator, str);
    }

    public final void c(Context context) {
        C0200z c0200z = new C0200z(15);
        if (this.f6322b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        AbstractC1068a.b("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f6322b = c0200z;
            this.f6323c = SystemClock.uptimeMillis();
            this.f6324d = AbstractC0476a.a(applicationContext);
            r rVarA = r.a((DisplayManager) applicationContext.getSystemService("display"), this.f6325e);
            rVarA.f6965b.setAsyncWaitForVsyncDelegate(rVarA.f6967d);
            this.f6327g = this.f6326f.submit(new d(this, applicationContext));
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
}
