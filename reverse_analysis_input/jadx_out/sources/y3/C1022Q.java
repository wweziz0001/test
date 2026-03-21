package y3;

import a.AbstractC0149a;
import a0.C0200z;
import android.net.Uri;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.List;
import java.util.Objects;
import m.B0;
import n3.InterfaceC0696f;

/* JADX INFO: renamed from: y3.Q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1022Q extends C1019N {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f11010h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1039j f11011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11012c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11013d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11014e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11015f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11016g = false;

    public C1022Q(C1039j c1039j) {
        this.f11011b = c1039j;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C1044o c1044o = new C1044o(1);
        C1039j c1039j = this.f11011b;
        c1039j.getClass();
        N3.h.e(consoleMessage, "messageArg");
        A.e eVar = c1039j.f11068a;
        eVar.getClass();
        if (((C1032c) eVar.f9n).d(this)) {
            new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage", eVar.e(), (C0200z) null).D(C3.g.Q(this, consoleMessage), new s2.l(c1044o, 27));
        } else {
            B0.l("missing-instance-error", "Callback to `WebChromeClient.onConsoleMessage` failed because native instance was not in the instance manager.", "");
        }
        return this.f11013d;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        C1044o c1044o = new C1044o(1);
        C1039j c1039j = this.f11011b;
        c1039j.getClass();
        A.e eVar = c1039j.f11068a;
        eVar.getClass();
        if (!((C1032c) eVar.f9n).d(this)) {
            B0.l("missing-instance-error", "Callback to `WebChromeClient.onGeolocationPermissionsHidePrompt` failed because native instance was not in the instance manager.", "");
        } else {
            new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt", eVar.e(), (C0200z) null).D(AbstractC0149a.y(this), new s2.l(c1044o, 29));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        C1044o c1044o = new C1044o(1);
        C1039j c1039j = this.f11011b;
        c1039j.getClass();
        N3.h.e(str, "originArg");
        N3.h.e(callback, "callbackArg");
        A.e eVar = c1039j.f11068a;
        eVar.getClass();
        if (!((C1032c) eVar.f9n).d(this)) {
            B0.l("missing-instance-error", "Callback to `WebChromeClient.onGeolocationPermissionsShowPrompt` failed because native instance was not in the instance manager.", "");
        } else {
            new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt", eVar.e(), (C0200z) null).D(C3.g.Q(this, str, callback), new s2.l(c1044o, 28));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        C1044o c1044o = new C1044o(1);
        C1039j c1039j = this.f11011b;
        c1039j.getClass();
        A.e eVar = c1039j.f11068a;
        eVar.getClass();
        if (!((C1032c) eVar.f9n).d(this)) {
            B0.l("missing-instance-error", "Callback to `WebChromeClient.onHideCustomView` failed because native instance was not in the instance manager.", "");
        } else {
            new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView", eVar.e(), (C0200z) null).D(AbstractC0149a.y(this), new s2.l(c1044o, 23));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (!this.f11014e) {
            return false;
        }
        C1020O c1020o = new C1020O(this, jsResult, 1);
        C1054y c1054y = new C1054y(c1020o, 2);
        C1039j c1039j = this.f11011b;
        c1039j.getClass();
        N3.h.e(webView, "webViewArg");
        N3.h.e(str, "urlArg");
        N3.h.e(str2, "messageArg");
        A.e eVar = c1039j.f11068a;
        eVar.getClass();
        if (((C1032c) eVar.f9n).d(this)) {
            new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert", eVar.e(), (C0200z) null).D(C3.g.Q(this, webView, str, str2), new C1010E(c1054y, 1));
            return true;
        }
        Throwable thA = B3.d.a(i4.a.p(new C1030a("missing-instance-error", "Callback to `WebChromeClient.onJsAlert` failed because native instance was not in the instance manager.", "")));
        C1022Q c1022q = c1020o.f11005m;
        c1022q.getClass();
        A.e eVar2 = c1022q.f11011b.f11068a;
        Objects.requireNonNull(thA);
        eVar2.getClass();
        A.e.k(thA);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (!this.f11015f) {
            return false;
        }
        C1020O c1020o = new C1020O(this, jsResult, 0);
        C1054y c1054y = new C1054y(c1020o, 2);
        C1039j c1039j = this.f11011b;
        c1039j.getClass();
        N3.h.e(webView, "webViewArg");
        N3.h.e(str, "urlArg");
        N3.h.e(str2, "messageArg");
        A.e eVar = c1039j.f11068a;
        eVar.getClass();
        if (((C1032c) eVar.f9n).d(this)) {
            new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", eVar.e(), (C0200z) null).D(C3.g.Q(this, webView, str, str2), new C1010E(c1054y, 3));
            return true;
        }
        Throwable thA = B3.d.a(i4.a.p(new C1030a("missing-instance-error", "Callback to `WebChromeClient.onJsConfirm` failed because native instance was not in the instance manager.", "")));
        C1022Q c1022q = c1020o.f11005m;
        c1022q.getClass();
        A.e eVar2 = c1022q.f11011b.f11068a;
        Objects.requireNonNull(thA);
        eVar2.getClass();
        A.e.k(thA);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (!this.f11016g) {
            return false;
        }
        C1020O c1020o = new C1020O(this, jsPromptResult, 2);
        C1054y c1054y = new C1054y(c1020o, 2);
        C1039j c1039j = this.f11011b;
        c1039j.getClass();
        N3.h.e(webView, "webViewArg");
        N3.h.e(str, "urlArg");
        N3.h.e(str2, "messageArg");
        N3.h.e(str3, "defaultValueArg");
        A.e eVar = c1039j.f11068a;
        eVar.getClass();
        if (((C1032c) eVar.f9n).d(this)) {
            new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt", eVar.e(), (C0200z) null).D(C3.g.Q(this, webView, str, str2, str3), new C1010E(c1054y, 0));
            return true;
        }
        Throwable thA = B3.d.a(i4.a.p(new C1030a("missing-instance-error", "Callback to `WebChromeClient.onJsPrompt` failed because native instance was not in the instance manager.", "")));
        C1022Q c1022q = c1020o.f11005m;
        c1022q.getClass();
        A.e eVar2 = c1022q.f11011b.f11068a;
        Objects.requireNonNull(thA);
        eVar2.getClass();
        A.e.k(thA);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        C1044o c1044o = new C1044o(1);
        C1039j c1039j = this.f11011b;
        c1039j.getClass();
        N3.h.e(permissionRequest, "requestArg");
        A.e eVar = c1039j.f11068a;
        eVar.getClass();
        if (!((C1032c) eVar.f9n).d(this)) {
            B0.l("missing-instance-error", "Callback to `WebChromeClient.onPermissionRequest` failed because native instance was not in the instance manager.", "");
        } else {
            new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest", eVar.e(), (C0200z) null).D(C3.g.Q(this, permissionRequest), new s2.l(c1044o, 25));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        long j5 = i;
        C1044o c1044o = new C1044o(1);
        C1039j c1039j = this.f11011b;
        c1039j.getClass();
        N3.h.e(webView, "webViewArg");
        A.e eVar = c1039j.f11068a;
        eVar.getClass();
        if (!((C1032c) eVar.f9n).d(this)) {
            B0.l("missing-instance-error", "Callback to `WebChromeClient.onProgressChanged` failed because native instance was not in the instance manager.", "");
        } else {
            new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged", eVar.e(), (C0200z) null).D(C3.g.Q(this, webView, Long.valueOf(j5)), new s2.l(c1044o, 24));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        C1044o c1044o = new C1044o(1);
        C1039j c1039j = this.f11011b;
        c1039j.getClass();
        N3.h.e(view, "viewArg");
        N3.h.e(customViewCallback, "callbackArg");
        A.e eVar = c1039j.f11068a;
        eVar.getClass();
        if (!((C1032c) eVar.f9n).d(this)) {
            B0.l("missing-instance-error", "Callback to `WebChromeClient.onShowCustomView` failed because native instance was not in the instance manager.", "");
        } else {
            new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView", eVar.e(), (C0200z) null).D(C3.g.Q(this, view, customViewCallback), new s2.l(c1044o, 26));
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, final ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        final boolean z4 = this.f11012c;
        M3.l lVar = new M3.l() { // from class: y3.P
            @Override // M3.l
            public final Object c(Object obj) {
                C1015J c1015j = (C1015J) obj;
                C1022Q c1022q = this.f11007l;
                c1022q.getClass();
                if (c1015j.f10990d) {
                    A.e eVar = c1022q.f11011b.f11068a;
                    Throwable th = c1015j.f10989c;
                    Objects.requireNonNull(th);
                    eVar.getClass();
                    A.e.k(th);
                    return null;
                }
                List list = (List) c1015j.f10988b;
                Objects.requireNonNull(list);
                if (!z4) {
                    return null;
                }
                Uri[] uriArr = new Uri[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    uriArr[i] = Uri.parse((String) list.get(i));
                }
                valueCallback.onReceiveValue(uriArr);
                return null;
            }
        };
        C1054y c1054y = new C1054y(lVar, 2);
        C1039j c1039j = this.f11011b;
        c1039j.getClass();
        N3.h.e(webView, "webViewArg");
        N3.h.e(fileChooserParams, "paramsArg");
        A.e eVar = c1039j.f11068a;
        eVar.getClass();
        if (((C1032c) eVar.f9n).d(this)) {
            new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser", eVar.e(), (C0200z) null).D(C3.g.Q(this, webView, fileChooserParams), new C1010E(c1054y, 2));
        } else {
            lVar.c(new C1015J(i4.a.p(new C1030a("missing-instance-error", "Callback to `WebChromeClient.onShowFileChooser` failed because native instance was not in the instance manager.", ""))));
        }
        return z4;
    }
}
