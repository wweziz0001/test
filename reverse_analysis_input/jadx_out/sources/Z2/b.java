package Z2;

import A.e;
import N3.h;
import android.app.Activity;
import android.content.Context;
import j3.C0524a;
import java.util.concurrent.atomic.AtomicBoolean;
import k3.InterfaceC0541a;
import k3.InterfaceC0542b;
import n3.C0707q;
import y2.n;

/* JADX INFO: loaded from: classes.dex */
public final class b implements j3.b, InterfaceC0541a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f3090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f3091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0707q f3092n;

    @Override // k3.InterfaceC0541a
    public final void onAttachedToActivity(InterfaceC0542b interfaceC0542b) {
        h.e(interfaceC0542b, "binding");
        c cVar = this.f3091m;
        if (cVar == null) {
            h.g("manager");
            throw null;
        }
        n nVar = (n) interfaceC0542b;
        nVar.a(cVar);
        e eVar = this.f3090l;
        if (eVar != null) {
            eVar.f9n = (Activity) nVar.f10954a;
        } else {
            h.g("share");
            throw null;
        }
    }

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        h.e(c0524a, "binding");
        this.f3092n = new C0707q(c0524a.f7455c, "dev.fluttercommunity.plus/share");
        Context context = c0524a.f7453a;
        h.d(context, "getApplicationContext(...)");
        c cVar = new c();
        cVar.f3094m = new AtomicBoolean(true);
        this.f3091m = cVar;
        e eVar = new e(context, cVar);
        this.f3090l = eVar;
        c cVar2 = this.f3091m;
        if (cVar2 == null) {
            h.g("manager");
            throw null;
        }
        Z1.e eVar2 = new Z1.e(eVar, cVar2);
        C0707q c0707q = this.f3092n;
        if (c0707q != null) {
            c0707q.b(eVar2);
        } else {
            h.g("methodChannel");
            throw null;
        }
    }

    @Override // k3.InterfaceC0541a
    public final void onDetachedFromActivity() {
        e eVar = this.f3090l;
        if (eVar != null) {
            eVar.f9n = null;
        } else {
            h.g("share");
            throw null;
        }
    }

    @Override // k3.InterfaceC0541a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        h.e(c0524a, "binding");
        C0707q c0707q = this.f3092n;
        if (c0707q != null) {
            c0707q.b(null);
        } else {
            h.g("methodChannel");
            throw null;
        }
    }

    @Override // k3.InterfaceC0541a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0542b interfaceC0542b) {
        h.e(interfaceC0542b, "binding");
        onAttachedToActivity(interfaceC0542b);
    }
}
