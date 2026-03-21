package i2;

import N3.h;
import P2.c;
import android.os.Build;
import b3.AbstractC0307a;
import j3.C0524a;
import j3.b;
import n3.C0704n;
import n3.C0707q;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;

/* JADX INFO: renamed from: i2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0480a implements b, InterfaceC0705o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0707q f6475l;

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        h.e(c0524a, "flutterPluginBinding");
        C0707q c0707q = new C0707q(c0524a.f7454b.f5607c, "platform_device_id");
        this.f6475l = c0707q;
        c0707q.b(this);
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        h.e(c0524a, "binding");
        C0707q c0707q = this.f6475l;
        if (c0707q != null) {
            c0707q.b(null);
        } else {
            h.g("channel");
            throw null;
        }
    }

    @Override // n3.InterfaceC0705o
    public final void onMethodCall(C0704n c0704n, InterfaceC0706p interfaceC0706p) {
        h.e(c0704n, "call");
        if (!h.a(c0704n.f8938a, "getPlatformVersion")) {
            ((c) interfaceC0706p).notImplemented();
        } else {
            ((c) interfaceC0706p).success(AbstractC0307a.j("Android ", Build.VERSION.RELEASE));
        }
    }
}
