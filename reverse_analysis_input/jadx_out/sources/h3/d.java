package h3;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.Callable;
import z3.AbstractC1068a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f6318b;

    public d(f fVar, Context context) {
        this.f6318b = fVar;
        this.f6317a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        f fVar = this.f6318b;
        Context context = this.f6317a;
        AbstractC1068a.b("FlutterLoader initTask");
        try {
            fVar.getClass();
            FlutterJNI flutterJNI = fVar.f6325e;
            int i = 0;
            try {
                flutterJNI.loadLibrary(context);
                flutterJNI.updateRefreshRate();
                fVar.f6326f.execute(new A3.c(this, 13));
                File filesDir = context.getFilesDir();
                if (filesDir == null) {
                    filesDir = new File(context.getDataDir().getPath(), "files");
                }
                String path = filesDir.getPath();
                File codeCacheDir = context.getCodeCacheDir();
                if (codeCacheDir == null) {
                    codeCacheDir = context.getCacheDir();
                }
                if (codeCacheDir == null) {
                    codeCacheDir = new File(context.getDataDir().getPath(), "cache");
                }
                String path2 = codeCacheDir.getPath();
                File dir = context.getDir("flutter", 0);
                if (dir == null) {
                    dir = new File(context.getDataDir().getPath(), "app_flutter");
                }
                dir.getPath();
                e eVar = new e(path, path2);
                Trace.endSection();
                return eVar;
            } catch (UnsatisfiedLinkError e5) {
                if (!e5.toString().contains("couldn't find \"libflutter.so\"") && !e5.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                    throw e5;
                }
                String property = System.getProperty("os.arch");
                File file = new File(fVar.f6324d.f6310d);
                String[] list = file.list();
                ArrayList arrayList = new ArrayList();
                String[] strArr = Build.SUPPORTED_ABIS;
                int length = strArr.length;
                int i5 = 0;
                while (i5 < length) {
                    String str = strArr[i5];
                    StringBuilder sb = new StringBuilder();
                    sb.append("!");
                    String str2 = File.separator;
                    sb.append(str2);
                    sb.append("lib");
                    sb.append(str2);
                    sb.append(str);
                    String string = sb.toString();
                    String[] strArr2 = context.getApplicationInfo().splitSourceDirs;
                    ArrayList arrayList2 = new ArrayList();
                    if (strArr2 != null) {
                        int length2 = strArr2.length;
                        for (int i6 = i; i6 < length2; i6++) {
                            arrayList2.add(strArr2[i6] + string);
                        }
                        arrayList.addAll(arrayList2);
                    }
                    String str3 = context.getApplicationInfo().sourceDir;
                    if (str3 != null && !str3.isEmpty()) {
                        arrayList.add(str3 + string);
                    }
                    i5++;
                    i = 0;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                sb2.append(property);
                sb2.append(", and the native libraries directory (with path ");
                sb2.append(file.getAbsolutePath());
                sb2.append(") ");
                sb2.append(file.exists() ? "contains the following files: " + Arrays.toString(list) : "does not exist");
                sb2.append(arrayList.isEmpty() ? "" : ", and the split and source libraries directory (with path(s) " + arrayList + ")");
                sb2.append(".");
                throw new UnsupportedOperationException(sb2.toString(), e5);
            }
        } finally {
        }
    }
}
