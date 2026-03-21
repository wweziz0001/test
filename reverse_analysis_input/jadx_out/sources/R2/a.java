package R2;

import N3.h;
import P2.c;
import U3.l;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import j3.C0524a;
import j3.b;
import java.io.File;
import n3.C0704n;
import n3.C0707q;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b, InterfaceC0705o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0707q f1953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Context f1954m;

    public static long c() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return Build.VERSION.SDK_INT >= 29 ? statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong() : statFs.getAvailableBytes();
        } catch (Exception e5) {
            Log.e("StorageInfoPlugin", "Error getting free storage space: " + e5.getMessage());
            return -1L;
        }
    }

    public static long d() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return Build.VERSION.SDK_INT >= 29 ? statFs.getBlockSizeLong() * statFs.getBlockCountLong() : statFs.getTotalBytes();
        } catch (Exception e5) {
            Log.e("StorageInfoPlugin", "Error getting total storage space: " + e5.getMessage());
            return -1L;
        }
    }

    public final long a() {
        try {
            Context context = this.f1954m;
            if (context == null) {
                h.g("context");
                throw null;
            }
            File[] externalFilesDirs = context.getExternalFilesDirs(null);
            h.d(externalFilesDirs, "getExternalFilesDirs(...)");
            String path = externalFilesDirs[1].getPath();
            h.b(path);
            StatFs statFs = new StatFs((String) l.m0(path, new String[]{"Android"}).get(0));
            return Build.VERSION.SDK_INT >= 29 ? statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong() : statFs.getAvailableBytes();
        } catch (Exception e5) {
            Log.e("StorageInfoPlugin", "Error getting external free storage space: " + e5.getMessage());
            return 0L;
        }
    }

    public final long b() {
        try {
            Context context = this.f1954m;
            if (context == null) {
                h.g("context");
                throw null;
            }
            File[] externalFilesDirs = context.getExternalFilesDirs(null);
            h.d(externalFilesDirs, "getExternalFilesDirs(...)");
            String path = externalFilesDirs[1].getPath();
            h.b(path);
            StatFs statFs = new StatFs((String) l.m0(path, new String[]{"Android"}).get(0));
            return Build.VERSION.SDK_INT >= 29 ? statFs.getBlockSizeLong() * statFs.getBlockCountLong() : statFs.getTotalBytes();
        } catch (Exception e5) {
            Log.e("StorageInfoPlugin", "Error getting external total storage space: " + e5.getMessage());
            return 0L;
        }
    }

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        h.e(c0524a, "flutterPluginBinding");
        this.f1954m = c0524a.f7453a;
        C0707q c0707q = new C0707q(c0524a.f7455c, "storage_info");
        this.f1953l = c0707q;
        c0707q.b(this);
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        h.e(c0524a, "binding");
        C0707q c0707q = this.f1953l;
        if (c0707q != null) {
            c0707q.b(null);
        } else {
            h.g("channel");
            throw null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // n3.InterfaceC0705o
    public final void onMethodCall(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        long jD;
        h.e(c0704n, "call");
        String str = c0704n.f8938a;
        if (str != null) {
            long j5 = 0;
            switch (str.hashCode()) {
                case -755525561:
                    if (str.equals("getStorageTotalSpace")) {
                        ((c) interfaceC0706p).success(Long.valueOf(d()));
                        return;
                    }
                    break;
                case -393492192:
                    if (str.equals("getExternalStorageFreeSpace")) {
                        ((c) interfaceC0706p).success(Long.valueOf(a()));
                        return;
                    }
                    break;
                case -21324177:
                    if (str.equals("getExternalStorageUsedSpace")) {
                        try {
                            long jB = b() - a();
                            if (jB < 0) {
                                Log.e("StorageInfoPlugin", "External used space calculation error");
                            }
                            j5 = jB;
                            break;
                        } catch (Exception e5) {
                            Log.e("StorageInfoPlugin", "Error calculating external used space: " + e5.getMessage());
                        }
                        ((c) interfaceC0706p).success(Long.valueOf(j5));
                        return;
                    }
                    break;
                case 869546428:
                    if (str.equals("getExternalStorageTotalSpace")) {
                        ((c) interfaceC0706p).success(Long.valueOf(b()));
                        return;
                    }
                    break;
                case 1770843445:
                    if (str.equals("getStorageFreeSpace")) {
                        ((c) interfaceC0706p).success(Long.valueOf(c()));
                        return;
                    }
                    break;
                case 2143011460:
                    if (str.equals("getStorageUsedSpace")) {
                        try {
                            jD = d() - c();
                            if (jD < 0) {
                                Log.e("StorageInfoPlugin", "Used space calculation error");
                            }
                            break;
                        } catch (Exception e6) {
                            Log.e("StorageInfoPlugin", "Error calculating used space: " + e6.getMessage());
                            jD = -1;
                        }
                        ((c) interfaceC0706p).success(Long.valueOf(jD));
                        return;
                    }
                    break;
            }
        }
        ((c) interfaceC0706p).notImplemented();
    }
}
