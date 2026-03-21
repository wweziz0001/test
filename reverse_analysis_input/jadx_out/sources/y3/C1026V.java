package y3;

import a0.C0200z;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import m.B0;
import n3.InterfaceC0696f;

/* JADX INFO: renamed from: y3.V, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1026V extends WebViewClient {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f11029c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1039j f11030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11031b = false;

    public C1026V(C1039j c1039j) {
        this.f11030a = c1039j;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(final WebView webView, final String str, final boolean z4) {
        this.f11030a.f11068a.l(new Runnable() { // from class: y3.T
            @Override // java.lang.Runnable
            public final void run() {
                C1044o c1044o = new C1044o(2);
                C1026V c1026v = this.f11021l;
                C1039j c1039j = c1026v.f11030a;
                c1039j.getClass();
                WebView webView2 = webView;
                N3.h.e(webView2, "webViewArg");
                String str2 = str;
                N3.h.e(str2, "urlArg");
                A.e eVar = c1039j.f11068a;
                eVar.getClass();
                if (!((C1032c) eVar.f9n).d(c1026v)) {
                    B0.l("missing-instance-error", "Callback to `WebViewClient.doUpdateVisitedHistory` failed because native instance was not in the instance manager.", "");
                } else {
                    new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory", eVar.e(), (C0200z) null).D(C3.g.Q(c1026v, webView2, str2, Boolean.valueOf(z4)), new C1013H(c1044o, 16));
                }
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f11030a.f11068a.l(new P2.b(this, webView, message, message2, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        this.f11030a.f11068a.l(new RunnableC1023S(this, webView, str, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        this.f11030a.f11068a.l(new RunnableC1023S(this, webView, str, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f11030a.f11068a.l(new RunnableC1023S(this, webView, str, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f11030a.f11068a.l(new RunnableC1023S(this, webView, str, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f11030a.f11068a.l(new Q.l(this, webView, clientCertRequest, 5));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f11030a.f11068a.l(new P2.b(this, webView, webResourceRequest, webResourceError, 5));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f11030a.f11068a.l(new R1.r(this, webView, httpAuthHandler, str, str2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f11030a.f11068a.l(new P2.b(this, webView, webResourceRequest, webResourceResponse, 6));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f11030a.f11068a.l(new R1.r(this, webView, str, str2, str3));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f11030a.f11068a.l(new P2.b(this, webView, sslErrorHandler, sslError, 4));
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(final WebView webView, final float f2, final float f5) {
        this.f11030a.f11068a.l(new Runnable() { // from class: y3.U
            @Override // java.lang.Runnable
            public final void run() {
                double d5 = f2;
                double d6 = f5;
                C1044o c1044o = new C1044o(2);
                C1026V c1026v = this.f11025l;
                C1039j c1039j = c1026v.f11030a;
                c1039j.getClass();
                WebView webView2 = webView;
                N3.h.e(webView2, "viewArg");
                A.e eVar = c1039j.f11068a;
                eVar.getClass();
                if (!((C1032c) eVar.f9n).d(c1026v)) {
                    B0.l("missing-instance-error", "Callback to `WebViewClient.onScaleChanged` failed because native instance was not in the instance manager.", "");
                } else {
                    new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged", eVar.e(), (C0200z) null).D(C3.g.Q(c1026v, webView2, Double.valueOf(d5), Double.valueOf(d6)), new C1013H(c1044o, 15));
                }
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f11030a.f11068a.l(new Q.l(this, webView, webResourceRequest, 6));
        return webResourceRequest.isForMainFrame() && this.f11031b;
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }
}
