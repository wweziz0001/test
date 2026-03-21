package P2;

import A.n;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import j3.C0524a;
import java.util.HashMap;
import java.util.Map;
import n3.C0704n;
import n3.C0707q;
import n3.InterfaceC0696f;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;

/* JADX INFO: loaded from: classes.dex */
public class d implements InterfaceC0705o, j3.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0707q f1695l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a f1696m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HandlerThread f1697n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Handler f1698o;

    public static String a(d dVar, C0704n c0704n) {
        dVar.getClass();
        Map map = (Map) c0704n.f8939b;
        a aVar = dVar.f1696m;
        return aVar.f1681c + "_" + ((String) map.get("key"));
    }

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        InterfaceC0696f interfaceC0696f = c0524a.f7455c;
        try {
            this.f1696m = new a(c0524a.f7453a, new HashMap());
            HandlerThread handlerThread = new HandlerThread("com.it_nomads.fluttersecurestorage.worker");
            this.f1697n = handlerThread;
            handlerThread.start();
            this.f1698o = new Handler(this.f1697n.getLooper());
            C0707q c0707q = new C0707q(interfaceC0696f, "plugins.it_nomads.com/flutter_secure_storage");
            this.f1695l = c0707q;
            c0707q.b(this);
        } catch (Exception e5) {
            Log.e("FlutterSecureStoragePl", "Registration failed", e5);
        }
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        if (this.f1695l != null) {
            this.f1697n.quitSafely();
            this.f1697n = null;
            this.f1695l.b(null);
            this.f1695l = null;
        }
        this.f1696m = null;
    }

    @Override // n3.InterfaceC0705o
    public final void onMethodCall(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        this.f1698o.post(new n(this, c0704n, new c((c) interfaceC0706p), 1));
    }
}
