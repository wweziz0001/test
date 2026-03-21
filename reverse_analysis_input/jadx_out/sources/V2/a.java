package V2;

import N3.h;
import P2.c;
import android.content.ContentResolver;
import android.provider.Settings;
import j3.C0524a;
import j3.b;
import n3.C0704n;
import n3.C0707q;
import n3.InterfaceC0705o;
import n3.InterfaceC0706p;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b, InterfaceC0705o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0707q f2369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ContentResolver f2370m;

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        h.e(c0524a, "flutterPluginBinding");
        this.f2370m = c0524a.f7453a.getContentResolver();
        C0707q c0707q = new C0707q(c0524a.f7455c, "android_id");
        this.f2369l = c0707q;
        c0707q.b(this);
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        h.e(c0524a, "binding");
        C0707q c0707q = this.f2369l;
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
        if (!h.a(c0704n.f8938a, "getId")) {
            ((c) interfaceC0706p).notImplemented();
            return;
        }
        try {
            ContentResolver contentResolver = this.f2370m;
            if (contentResolver == null) {
                h.g("contentResolver");
                throw null;
            }
            ((c) interfaceC0706p).success(Settings.Secure.getString(contentResolver, "android_id"));
        } catch (Exception e5) {
            ((c) interfaceC0706p).error("ERROR_GETTING_ID", "Failed to get Android ID", e5.getLocalizedMessage());
        }
    }
}
