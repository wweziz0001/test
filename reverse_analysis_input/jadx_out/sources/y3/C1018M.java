package y3;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: renamed from: y3.M, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1018M extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f11001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1019N f11002b;

    public C1018M(C1019N c1019n, WebView webView) {
        this.f11002b = c1019n;
        this.f11001a = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient webViewClient = this.f11002b.f11003a;
        WebView webView2 = this.f11001a;
        if (webViewClient.shouldOverrideUrlLoading(webView2, webResourceRequest)) {
            return true;
        }
        webView2.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }
}
