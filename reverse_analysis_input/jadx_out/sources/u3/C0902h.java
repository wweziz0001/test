package u3;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: renamed from: u3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0902h extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0903i f10263a;

    public C0902h(C0903i c0903i) {
        this.f10263a = c0903i;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f10263a.f10264a.f6841n.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f10263a.f10264a.f6841n.loadUrl(str);
        return true;
    }
}
