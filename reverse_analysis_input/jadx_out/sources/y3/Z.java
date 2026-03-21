package y3;

import a0.C0200z;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import m.B0;
import n3.InterfaceC0696f;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends WebView implements io.flutter.plugin.platform.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f11041o = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1039j f11042l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WebViewClient f11043m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C1019N f11044n;

    public Z(C1039j c1039j) {
        super((Context) c1039j.f11068a.f11p);
        this.f11042l = c1039j;
        this.f11043m = new WebViewClient();
        this.f11044n = new C1019N();
        setWebViewClient(this.f11043m);
        setWebChromeClient(this.f11044n);
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.f11044n;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        io.flutter.embedding.android.D d5;
        super.onAttachedToWindow();
        this.f11042l.f11068a.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            ViewParent parent = this;
            while (true) {
                if (parent.getParent() == null) {
                    d5 = null;
                    break;
                }
                parent = parent.getParent();
                if (parent instanceof io.flutter.embedding.android.D) {
                    d5 = (io.flutter.embedding.android.D) parent;
                    break;
                }
            }
            if (d5 != null) {
                d5.setImportantForAutofill(1);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(final int i, final int i5, final int i6, final int i7) {
        super.onScrollChanged(i, i5, i6, i7);
        this.f11042l.f11068a.l(new Runnable() { // from class: y3.Y
            @Override // java.lang.Runnable
            public final void run() {
                long j5 = i;
                long j6 = i5;
                long j7 = i6;
                long j8 = i7;
                C1044o c1044o = new C1044o(3);
                Z z4 = this.f11036l;
                C1039j c1039j = z4.f11042l;
                c1039j.getClass();
                A.e eVar = c1039j.f11068a;
                eVar.getClass();
                if (!((C1032c) eVar.f9n).d(z4)) {
                    B0.l("missing-instance-error", "Callback to `WebView.onScrollChanged` failed because native instance was not in the instance manager.", "");
                } else {
                    new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged", eVar.e(), (C0200z) null).D(C3.g.Q(z4, Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7), Long.valueOf(j8)), new C1013H(c1044o, 2));
                }
            }
        });
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
        if (!(webChromeClient instanceof C1019N)) {
            throw new AssertionError("Client must be a SecureWebChromeClient.");
        }
        C1019N c1019n = (C1019N) webChromeClient;
        this.f11044n = c1019n;
        c1019n.f11003a = this.f11043m;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.f11043m = webViewClient;
        this.f11044n.f11003a = webViewClient;
    }

    @Override // io.flutter.plugin.platform.g
    public final void b() {
    }

    @Override // io.flutter.plugin.platform.g
    public View getView() {
        return this;
    }
}
