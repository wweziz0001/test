package y3;

import a0.C0200z;
import android.webkit.WebView;
import m.B0;
import n3.InterfaceC0696f;

/* JADX INFO: renamed from: y3.S, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1023S implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1026V f11018m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ WebView f11019n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f11020o;

    public /* synthetic */ RunnableC1023S(C1026V c1026v, WebView webView, String str, int i) {
        this.f11017l = i;
        this.f11018m = c1026v;
        this.f11019n = webView;
        this.f11020o = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11017l) {
            case 0:
                C1044o c1044o = new C1044o(2);
                C1026V c1026v = this.f11018m;
                C1039j c1039j = c1026v.f11030a;
                c1039j.getClass();
                WebView webView = this.f11019n;
                N3.h.e(webView, "webViewArg");
                String str = this.f11020o;
                N3.h.e(str, "urlArg");
                A.e eVar = c1039j.f11068a;
                eVar.getClass();
                if (!((C1032c) eVar.f9n).d(c1026v)) {
                    B0.l("missing-instance-error", "Callback to `WebViewClient.onPageStarted` failed because native instance was not in the instance manager.", "");
                } else {
                    new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted", eVar.e(), (C0200z) null).D(C3.g.Q(c1026v, webView, str), new C1013H(c1044o, 6));
                }
                break;
            case 1:
                C1044o c1044o2 = new C1044o(2);
                C1026V c1026v2 = this.f11018m;
                C1039j c1039j2 = c1026v2.f11030a;
                c1039j2.getClass();
                WebView webView2 = this.f11019n;
                N3.h.e(webView2, "viewArg");
                String str2 = this.f11020o;
                N3.h.e(str2, "urlArg");
                A.e eVar2 = c1039j2.f11068a;
                eVar2.getClass();
                if (!((C1032c) eVar2.f9n).d(c1026v2)) {
                    B0.l("missing-instance-error", "Callback to `WebViewClient.onLoadResource` failed because native instance was not in the instance manager.", "");
                } else {
                    new Z1.i((InterfaceC0696f) eVar2.f8m, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource", eVar2.e(), (C0200z) null).D(C3.g.Q(c1026v2, webView2, str2), new C1013H(c1044o2, 4));
                }
                break;
            case 2:
                C1044o c1044o3 = new C1044o(2);
                C1026V c1026v3 = this.f11018m;
                C1039j c1039j3 = c1026v3.f11030a;
                c1039j3.getClass();
                WebView webView3 = this.f11019n;
                N3.h.e(webView3, "webViewArg");
                String str3 = this.f11020o;
                N3.h.e(str3, "urlArg");
                A.e eVar3 = c1039j3.f11068a;
                eVar3.getClass();
                if (!((C1032c) eVar3.f9n).d(c1026v3)) {
                    B0.l("missing-instance-error", "Callback to `WebViewClient.onPageFinished` failed because native instance was not in the instance manager.", "");
                } else {
                    new Z1.i((InterfaceC0696f) eVar3.f8m, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished", eVar3.e(), (C0200z) null).D(C3.g.Q(c1026v3, webView3, str3), new C1013H(c1044o3, 11));
                }
                break;
            default:
                C1044o c1044o4 = new C1044o(2);
                C1026V c1026v4 = this.f11018m;
                C1039j c1039j4 = c1026v4.f11030a;
                c1039j4.getClass();
                WebView webView4 = this.f11019n;
                N3.h.e(webView4, "viewArg");
                String str4 = this.f11020o;
                N3.h.e(str4, "urlArg");
                A.e eVar4 = c1039j4.f11068a;
                eVar4.getClass();
                if (!((C1032c) eVar4.f9n).d(c1026v4)) {
                    B0.l("missing-instance-error", "Callback to `WebViewClient.onPageCommitVisible` failed because native instance was not in the instance manager.", "");
                } else {
                    new Z1.i((InterfaceC0696f) eVar4.f8m, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible", eVar4.e(), (C0200z) null).D(C3.g.Q(c1026v4, webView4, str4), new C1013H(c1044o4, 9));
                }
                break;
        }
    }
}
