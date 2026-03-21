package y3;

import a.AbstractC0149a;
import a0.C0200z;
import android.app.Activity;
import android.content.Context;
import j3.C0524a;
import java.util.HashMap;
import k3.InterfaceC0541a;
import k3.InterfaceC0542b;
import n3.InterfaceC0696f;
import n3.InterfaceC0703m;
import w3.C0949b;

/* JADX INFO: renamed from: y3.W, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1027W implements j3.b, InterfaceC0541a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0524a f11032l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public A.e f11033m;

    @Override // k3.InterfaceC0541a
    public final void onAttachedToActivity(InterfaceC0542b interfaceC0542b) {
        A.e eVar = this.f11033m;
        if (eVar != null) {
            eVar.f11p = (Activity) ((y2.n) interfaceC0542b).f10954a;
        }
    }

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        this.f11032l = c0524a;
        InterfaceC0696f interfaceC0696f = c0524a.f7455c;
        Context context = c0524a.f7453a;
        A.e eVar = new A.e(interfaceC0696f, context, new C1047r(context.getAssets(), c0524a.f7458f));
        this.f11033m = eVar;
        C0949b c0949b = new C0949b((C1032c) eVar.f9n);
        HashMap map = (HashMap) c0524a.f7457e.f6777b;
        if (!map.containsKey("plugins.flutter.io/webview")) {
            map.put("plugins.flutter.io/webview", c0949b);
        }
        A.e eVar2 = this.f11033m;
        eVar2.getClass();
        B3.e eVar3 = C1034e.f11061b;
        C1032c c1032c = (C1032c) eVar2.f9n;
        InterfaceC0696f interfaceC0696f2 = (InterfaceC0696f) eVar2.f8m;
        Q1.C.q0(interfaceC0696f2, c1032c);
        D1.b.Q(interfaceC0696f2, new C1039j(eVar2, 1));
        AbstractC0149a.G(interfaceC0696f2, new C1039j(eVar2, 14));
        Z1.f.L(interfaceC0696f2, new C1039j(eVar2, 11));
        new Z1.i(interfaceC0696f2, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", eVar2.e(), (C0200z) null).E(new C1051v(new C1039j(eVar2, 5), 9));
        C1039j c1039j = new C1039j(eVar2, 13);
        InterfaceC0703m interfaceC0703mE = eVar2.e();
        new Z1.i(interfaceC0696f2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", interfaceC0703mE, (C0200z) null).E(new C1051v(c1039j, 26));
        new Z1.i(interfaceC0696f2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", interfaceC0703mE, (C0200z) null).E(new C1013H(c1039j, 17));
        new Z1.i(interfaceC0696f2, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", eVar2.e(), (C0200z) null).E(new C1051v(new C1039j(eVar2, 2), 4));
        Q1.C.s0(interfaceC0696f2, new C1039j(eVar2, 10));
        Q1.C.r0(interfaceC0696f2, new C1039j(eVar2, 3));
        C1039j c1039j2 = new C1039j(eVar2, 12);
        InterfaceC0703m interfaceC0703mE2 = eVar2.e();
        new Z1.i(interfaceC0696f2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", interfaceC0703mE2, (C0200z) null).E(new C1051v(c1039j2, 23));
        new Z1.i(interfaceC0696f2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", interfaceC0703mE2, (C0200z) null).E(new C1013H(c1039j2, 1));
        p1.b bVar = new p1.b(29);
        InterfaceC0703m interfaceC0703mE3 = eVar2.e();
        new Z1.i(interfaceC0696f2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", interfaceC0703mE3, (C0200z) null).E(new s2.l(bVar, 18));
        new Z1.i(interfaceC0696f2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", interfaceC0703mE3, (C0200z) null).E(new s2.l(bVar, 19));
        new Z1.i(interfaceC0696f2, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", eVar2.e(), (C0200z) null).E(new s2.l(new p1.b(23), 14));
        D1.b.R(interfaceC0696f2, new C1039j(eVar2, 9));
        new Z1.i(interfaceC0696f2, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", eVar2.e(), (C0200z) null).E(new s2.l(new p1.b(25), 16));
        Z1.f.K(interfaceC0696f2, new C1039j(eVar2, 4));
        new Z1.i(interfaceC0696f2, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", eVar2.e(), (C0200z) null).E(new s2.l(new p1.b(26), 12));
        i4.a.U(interfaceC0696f2, new C1039j(eVar2, 0));
        C1016K c1016k = new C1016K();
        InterfaceC0703m interfaceC0703mE4 = eVar2.e();
        new Z1.i(interfaceC0696f2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", interfaceC0703mE4, (C0200z) null).E(new s2.l(c1016k, 21));
        new Z1.i(interfaceC0696f2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", interfaceC0703mE4, (C0200z) null).E(new s2.l(c1016k, 22));
        C1039j c1039j3 = new C1039j(eVar2, 8);
        InterfaceC0703m interfaceC0703mE5 = eVar2.e();
        new Z1.i(interfaceC0696f2, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", interfaceC0703mE5, (C0200z) null).E(new s2.l(c1039j3, 20));
        new Z1.i(interfaceC0696f2, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", interfaceC0703mE5, (C0200z) null).E(new C1051v(c1039j3, 15));
        i4.a.V(interfaceC0696f2, new C1039j(eVar2, 6));
        AbstractC0149a.F(interfaceC0696f2, new C1039j(eVar2, 7));
        new Z1.i(interfaceC0696f2, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", eVar2.e(), (C0200z) null).E(new s2.l(new p1.b(21), 13));
        new Z1.i(interfaceC0696f2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled", eVar2.e(), (C0200z) null).E(new C1013H(new C1016K(), 0));
        new Z1.i(interfaceC0696f2, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported", eVar2.e(), (C0200z) null).E(new C1013H(new C1016K(), 18));
    }

    @Override // k3.InterfaceC0541a
    public final void onDetachedFromActivity() {
        this.f11033m.f11p = this.f11032l.f7453a;
    }

    @Override // k3.InterfaceC0541a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f11033m.f11p = this.f11032l.f7453a;
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        A.e eVar = this.f11033m;
        if (eVar != null) {
            B3.e eVar2 = C1034e.f11061b;
            InterfaceC0696f interfaceC0696f = (InterfaceC0696f) eVar.f8m;
            Q1.C.q0(interfaceC0696f, null);
            D1.b.Q(interfaceC0696f, null);
            AbstractC0149a.G(interfaceC0696f, null);
            Z1.f.L(interfaceC0696f, null);
            new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", new defpackage.g(1), (C0200z) null).E(null);
            defpackage.g gVar = new defpackage.g(1);
            new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", gVar, (C0200z) null).E(null);
            new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", gVar, (C0200z) null).E(null);
            new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", new defpackage.g(1), (C0200z) null).E(null);
            Q1.C.s0(interfaceC0696f, null);
            Q1.C.r0(interfaceC0696f, null);
            defpackage.g gVar2 = new defpackage.g(1);
            new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", gVar2, (C0200z) null).E(null);
            new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", gVar2, (C0200z) null).E(null);
            defpackage.g gVar3 = new defpackage.g(1);
            new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", gVar3, (C0200z) null).E(null);
            new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", gVar3, (C0200z) null).E(null);
            new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", new defpackage.g(1), (C0200z) null).E(null);
            D1.b.R(interfaceC0696f, null);
            new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", new defpackage.g(1), (C0200z) null).E(null);
            Z1.f.K(interfaceC0696f, null);
            new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", new defpackage.g(1), (C0200z) null).E(null);
            i4.a.U(interfaceC0696f, null);
            defpackage.g gVar4 = new defpackage.g(1);
            new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", gVar4, (C0200z) null).E(null);
            new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", gVar4, (C0200z) null).E(null);
            defpackage.g gVar5 = new defpackage.g(1);
            new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", gVar5, (C0200z) null).E(null);
            new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", gVar5, (C0200z) null).E(null);
            i4.a.V(interfaceC0696f, null);
            AbstractC0149a.F(interfaceC0696f, null);
            new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", new defpackage.g(1), (C0200z) null).E(null);
            new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled", new defpackage.g(1), (C0200z) null).E(null);
            new Z1.i(interfaceC0696f, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported", new defpackage.g(1), (C0200z) null).E(null);
            C1032c c1032c = (C1032c) this.f11033m.f9n;
            c1032c.f11055g.removeCallbacks(c1032c.f11056h);
            c1032c.f11057j = true;
            this.f11033m = null;
        }
    }

    @Override // k3.InterfaceC0541a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0542b interfaceC0542b) {
        this.f11033m.f11p = (Activity) ((y2.n) interfaceC0542b).f10954a;
    }
}
