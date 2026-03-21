package a3;

import B0.d;
import H1.j;
import N3.h;
import android.app.Activity;
import defpackage.e;
import defpackage.f;
import j3.C0524a;
import j3.b;
import k3.InterfaceC0541a;
import k3.InterfaceC0542b;
import n3.InterfaceC0696f;
import y2.n;

/* JADX INFO: renamed from: a3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0206a implements b, f, InterfaceC0541a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f3582l;

    public final void a(defpackage.b bVar) throws j {
        d dVar = this.f3582l;
        h.b(dVar);
        Activity activity = (Activity) dVar.f190l;
        if (activity == null) {
            throw new j();
        }
        h.b(activity);
        boolean z4 = (activity.getWindow().getAttributes().flags & 128) != 0;
        Boolean bool = bVar.f4821a;
        h.b(bool);
        if (bool.booleanValue()) {
            if (z4) {
                return;
            }
            activity.getWindow().addFlags(128);
        } else if (z4) {
            activity.getWindow().clearFlags(128);
        }
    }

    @Override // k3.InterfaceC0541a
    public final void onAttachedToActivity(InterfaceC0542b interfaceC0542b) {
        h.e(interfaceC0542b, "binding");
        d dVar = this.f3582l;
        if (dVar != null) {
            dVar.f190l = (Activity) ((n) interfaceC0542b).f10954a;
        }
    }

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        h.e(c0524a, "flutterPluginBinding");
        InterfaceC0696f interfaceC0696f = c0524a.f7455c;
        h.d(interfaceC0696f, "getBinaryMessenger(...)");
        e.b(f.f5642f, interfaceC0696f, this);
        this.f3582l = new d();
    }

    @Override // k3.InterfaceC0541a
    public final void onDetachedFromActivity() {
        d dVar = this.f3582l;
        if (dVar != null) {
            dVar.f190l = null;
        }
    }

    @Override // k3.InterfaceC0541a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        h.e(c0524a, "binding");
        InterfaceC0696f interfaceC0696f = c0524a.f7455c;
        h.d(interfaceC0696f, "getBinaryMessenger(...)");
        e.b(f.f5642f, interfaceC0696f, null);
        this.f3582l = null;
    }

    @Override // k3.InterfaceC0541a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0542b interfaceC0542b) {
        h.e(interfaceC0542b, "binding");
        onAttachedToActivity(interfaceC0542b);
    }
}
