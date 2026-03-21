package e4;

import P2.c;
import android.os.Build;
import j3.C0524a;
import j3.b;
import n3.C0704n;
import n3.C0707q;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;

/* JADX INFO: loaded from: classes.dex */
public class a implements b, InterfaceC0705o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0707q f5641l;

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        C0707q c0707q = new C0707q(c0524a.f7455c, "flutter_native_splash");
        this.f5641l = c0707q;
        c0707q.b(this);
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        this.f5641l.b(null);
    }

    @Override // n3.InterfaceC0705o
    public final void onMethodCall(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        if (!c0704n.f8938a.equals("getPlatformVersion")) {
            ((c) interfaceC0706p).notImplemented();
            return;
        }
        ((c) interfaceC0706p).success("Android " + Build.VERSION.RELEASE);
    }
}
