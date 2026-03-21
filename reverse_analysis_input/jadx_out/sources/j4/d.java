package j4;

import android.content.Context;
import android.util.Log;
import j3.C0524a;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import n3.C0704n;
import n3.C0707q;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;

/* JADX INFO: loaded from: classes.dex */
public class d implements j3.b, InterfaceC0705o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f7474l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ExecutorService f7475m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0707q f7476n;

    public static String a(d dVar, String str, HashMap map, String str2, int i, int i5, int i6, int i7, int i8) {
        dVar.getClass();
        byte[] bArrB = b(str, map, i, i5, i6, i7, i8);
        String str3 = i != 1 ? i != 2 ? "jpg" : "webp" : "png";
        String str4 = str.substring(0, str.lastIndexOf(".") + 1) + str3;
        boolean z4 = str.startsWith("/") || str.startsWith("file://");
        if (str2 == null && !z4) {
            str2 = dVar.f7474l.getCacheDir().getAbsolutePath();
        }
        if (str2 != null) {
            if (str2.endsWith(str3)) {
                str4 = str2;
            } else {
                int iLastIndexOf = str4.lastIndexOf("/");
                if (str2.endsWith("/")) {
                    str4 = str2 + str4.substring(iLastIndexOf + 1);
                } else {
                    str4 = str2 + str4.substring(iLastIndexOf);
                }
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str4);
            fileOutputStream.write(bArrB);
            fileOutputStream.close();
            Log.d("ThumbnailPlugin", String.format("buildThumbnailFile( written:%d )", Integer.valueOf(bArrB.length)));
            return str4;
        } catch (IOException e5) {
            e5.printStackTrace();
            throw new RuntimeException(e5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] b(java.lang.String r6, java.util.HashMap r7, int r8, int r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.d.b(java.lang.String, java.util.HashMap, int, int, int, int, int):byte[]");
    }

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        this.f7474l = c0524a.f7453a;
        this.f7475m = Executors.newCachedThreadPool();
        C0707q c0707q = new C0707q(c0524a.f7455c, "plugins.justsoft.xyz/video_thumbnail");
        this.f7476n = c0707q;
        c0707q.b(this);
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        this.f7476n.b(null);
        this.f7476n = null;
        this.f7475m.shutdown();
        this.f7475m = null;
    }

    @Override // n3.InterfaceC0705o
    public final void onMethodCall(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        Map map = (Map) c0704n.f8939b;
        this.f7475m.execute(new b(this, c0704n.f8938a, map, (String) map.get("video"), (HashMap) map.get("headers"), ((Integer) map.get("format")).intValue(), ((Integer) map.get("maxh")).intValue(), ((Integer) map.get("maxw")).intValue(), ((Integer) map.get("timeMs")).intValue(), ((Integer) map.get("quality")).intValue(), (P2.c) interfaceC0706p));
    }
}
