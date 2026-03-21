package u3;

import Z1.m;
import android.app.Activity;
import android.util.Log;
import j3.C0524a;
import k3.InterfaceC0541a;
import k3.InterfaceC0542b;
import y2.n;

/* JADX INFO: renamed from: u3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0900f implements j3.b, InterfaceC0541a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m f10262l;

    @Override // k3.InterfaceC0541a
    public final void onAttachedToActivity(InterfaceC0542b interfaceC0542b) {
        m mVar = this.f10262l;
        if (mVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            mVar.f3026o = (Activity) ((n) interfaceC0542b).f10954a;
        }
    }

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        m mVar = new m(c0524a.f7453a);
        this.f10262l = mVar;
        m.I(c0524a.f7455c, mVar);
    }

    @Override // k3.InterfaceC0541a
    public final void onDetachedFromActivity() {
        m mVar = this.f10262l;
        if (mVar == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            mVar.f3026o = null;
        }
    }

    @Override // k3.InterfaceC0541a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        if (this.f10262l == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
        } else {
            m.I(c0524a.f7455c, null);
            this.f10262l = null;
        }
    }

    @Override // k3.InterfaceC0541a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0542b interfaceC0542b) {
        onAttachedToActivity(interfaceC0542b);
    }
}
