package y3;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: renamed from: y3.N, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1019N extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebViewClient f11003a;

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z4, boolean z5, Message message) {
        WebView webView2 = new WebView(webView.getContext());
        if (this.f11003a == null) {
            return false;
        }
        webView2.setWebViewClient(new C1018M(this, webView));
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
