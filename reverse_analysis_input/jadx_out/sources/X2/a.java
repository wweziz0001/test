package X2;

import N3.h;
import Z1.m;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import j3.C0524a;
import j3.b;
import n3.C0707q;
import n3.InterfaceC0696f;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0707q f2624l;

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        h.e(c0524a, "binding");
        InterfaceC0696f interfaceC0696f = c0524a.f7455c;
        h.d(interfaceC0696f, "getBinaryMessenger(...)");
        Context context = c0524a.f7453a;
        h.d(context, "getApplicationContext(...)");
        this.f2624l = new C0707q(interfaceC0696f, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        h.d(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("activity");
        h.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ContentResolver contentResolver = context.getContentResolver();
        h.b(contentResolver);
        m mVar = new m(packageManager, (ActivityManager) systemService, contentResolver);
        C0707q c0707q = this.f2624l;
        if (c0707q != null) {
            c0707q.b(mVar);
        } else {
            h.g("methodChannel");
            throw null;
        }
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        h.e(c0524a, "binding");
        C0707q c0707q = this.f2624l;
        if (c0707q != null) {
            c0707q.b(null);
        } else {
            h.g("methodChannel");
            throw null;
        }
    }
}
