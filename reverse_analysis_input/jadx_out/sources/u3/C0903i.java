package u3;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugins.urllauncher.WebViewActivity;

/* JADX INFO: renamed from: u3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0903i extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f10264a;

    public C0903i(WebViewActivity webViewActivity) {
        this.f10264a = webViewActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z4, boolean z5, Message message) {
        C0902h c0902h = new C0902h(this);
        WebView webView2 = new WebView(this.f10264a.f6841n.getContext());
        webView2.setWebViewClient(c0902h);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
