package y3;

import a.AbstractC0149a;
import a0.C0200z;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import n3.InterfaceC0696f;

/* JADX INFO: renamed from: y3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1036g extends defpackage.g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final A.e f11065e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1036g(A.e eVar) {
        super(1);
        N3.h.e(eVar, "registrar");
        this.f11065e = eVar;
    }

    public static final void l(String str, Object obj, Throwable th) {
        Log.w("PigeonProxyApiBaseCodec", "Failed to create new Dart proxy instance of " + str + ": " + obj + ". " + th);
    }

    @Override // defpackage.g, n3.w
    public final Object f(byte b4, ByteBuffer byteBuffer) {
        N3.h.e(byteBuffer, "buffer");
        if (b4 != -128) {
            return super.f(b4, byteBuffer);
        }
        Object objE = e(byteBuffer);
        N3.h.c(objE, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) objE).longValue();
        Object objE2 = ((C1032c) this.f11065e.f9n).e(jLongValue);
        if (objE2 == null) {
            Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + jLongValue);
        }
        return objE2;
    }

    @Override // defpackage.g, n3.w
    public final void k(n3.v vVar, Object obj) {
        if ((obj instanceof Boolean) || (obj instanceof byte[]) || (obj instanceof Double) || (obj instanceof double[]) || (obj instanceof float[]) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof List) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Map) || (obj instanceof String) || (obj instanceof EnumC1046q) || (obj instanceof EnumC1040k) || (obj instanceof EnumC1050u) || (obj instanceof EnumC1017L) || (obj instanceof EnumC1049t) || obj == null) {
            super.k(vVar, obj);
            return;
        }
        boolean z4 = obj instanceof WebResourceRequest;
        A.e eVar = this.f11065e;
        if (z4) {
            eVar.getClass();
            WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
            C1035f c1035f = new C1035f(obj, 0);
            C1032c c1032c = (C1032c) eVar.f9n;
            if (!c1032c.d(webResourceRequest)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance", eVar.e(), (C0200z) null).D(C3.g.Q(Long.valueOf(c1032c.b(webResourceRequest)), webResourceRequest.getUrl().toString(), Boolean.valueOf(webResourceRequest.isForMainFrame()), Boolean.valueOf(webResourceRequest.isRedirect()), Boolean.valueOf(webResourceRequest.hasGesture()), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders() == null ? Collections.emptyMap() : webResourceRequest.getRequestHeaders()), new C1051v(c1035f, 19));
            }
        } else if (obj instanceof WebResourceResponse) {
            eVar.getClass();
            WebResourceResponse webResourceResponse = (WebResourceResponse) obj;
            C1035f c1035f2 = new C1035f(obj, 25);
            C1032c c1032c2 = (C1032c) eVar.f9n;
            if (!c1032c2.d(webResourceResponse)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance", eVar.e(), (C0200z) null).D(C3.g.Q(Long.valueOf(c1032c2.b(webResourceResponse)), Long.valueOf(webResourceResponse.getStatusCode())), new C1051v(c1035f2, 20));
            }
        } else if (obj instanceof WebResourceError) {
            eVar.getClass();
            WebResourceError webResourceError = (WebResourceError) obj;
            C1035f c1035f3 = new C1035f(obj, 12);
            C1032c c1032c3 = (C1032c) eVar.f9n;
            if (!c1032c3.d(webResourceError)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance", eVar.e(), (C0200z) null).D(C3.g.Q(Long.valueOf(c1032c3.b(webResourceError)), Long.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription().toString()), new C1051v(c1035f3, 18));
            }
        } else if (obj instanceof C1028X) {
            eVar.getClass();
            C1028X c1028x = (C1028X) obj;
            C1035f c1035f4 = new C1035f(obj, 13);
            C1032c c1032c4 = (C1032c) eVar.f9n;
            if (!c1032c4.d(c1028x)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance", eVar.e(), (C0200z) null).D(C3.g.Q(Long.valueOf(c1032c4.b(c1028x)), Long.valueOf(c1028x.f11034a), Long.valueOf(c1028x.f11035b)), new C1051v(c1035f4, 27));
            }
        } else if (obj instanceof ConsoleMessage) {
            eVar.getClass();
            ConsoleMessage consoleMessage = (ConsoleMessage) obj;
            C1035f c1035f5 = new C1035f(obj, 14);
            C1032c c1032c5 = (C1032c) eVar.f9n;
            if (!c1032c5.d(consoleMessage)) {
                long jB = c1032c5.b(consoleMessage);
                long jLineNumber = consoleMessage.lineNumber();
                String strMessage = consoleMessage.message();
                int i = AbstractC1041l.f11078a[consoleMessage.messageLevel().ordinal()];
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance", eVar.e(), (C0200z) null).D(C3.g.Q(Long.valueOf(jB), Long.valueOf(jLineNumber), strMessage, i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? EnumC1040k.f11075s : EnumC1040k.f11070n : EnumC1040k.f11071o : EnumC1040k.f11074r : EnumC1040k.f11072p : EnumC1040k.f11073q, consoleMessage.sourceId()), new C1051v(c1035f5, 1));
            }
        } else if (obj instanceof CookieManager) {
            eVar.getClass();
            CookieManager cookieManager = (CookieManager) obj;
            C1035f c1035f6 = new C1035f(obj, 15);
            C1032c c1032c6 = (C1032c) eVar.f9n;
            if (!c1032c6.d(cookieManager)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance", eVar.e(), (C0200z) null).D(AbstractC0149a.y(Long.valueOf(c1032c6.b(cookieManager))), new C1051v(c1035f6, 2));
            }
        } else if (obj instanceof WebView) {
            eVar.getClass();
            WebView webView = (WebView) obj;
            C1035f c1035f7 = new C1035f(obj, 16);
            C1032c c1032c7 = (C1032c) eVar.f9n;
            if (!c1032c7.d(webView)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance", eVar.e(), (C0200z) null).D(AbstractC0149a.y(Long.valueOf(c1032c7.b(webView))), new C1051v(c1035f7, 24));
            }
        } else if (obj instanceof WebSettings) {
            eVar.getClass();
            WebSettings webSettings = (WebSettings) obj;
            C1035f c1035f8 = new C1035f(obj, 17);
            C1032c c1032c8 = (C1032c) eVar.f9n;
            if (!c1032c8.d(webSettings)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance", eVar.e(), (C0200z) null).D(AbstractC0149a.y(Long.valueOf(c1032c8.b(webSettings))), new C1051v(c1035f8, 21));
            }
        } else if (obj instanceof C1048s) {
            eVar.getClass();
            if (!((C1032c) eVar.f9n).d((C1048s) obj)) {
                l("JavaScriptChannel", obj, B3.d.a(i4.a.p(new C1030a("new-instance-error", "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method.", ""))));
            }
        } else if (obj instanceof WebViewClient) {
            eVar.getClass();
            WebViewClient webViewClient = (WebViewClient) obj;
            C1035f c1035f9 = new C1035f(obj, 11);
            C1032c c1032c9 = (C1032c) eVar.f9n;
            if (!c1032c9.d(webViewClient)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance", eVar.e(), (C0200z) null).D(AbstractC0149a.y(Long.valueOf(c1032c9.b(webViewClient))), new C1051v(c1035f9, 25));
            }
        } else if (obj instanceof DownloadListener) {
            eVar.getClass();
            if (!((C1032c) eVar.f9n).d((DownloadListener) obj)) {
                l("DownloadListener", obj, B3.d.a(i4.a.p(new C1030a("new-instance-error", "Attempting to create a new Dart instance of DownloadListener, but the class has a nonnull callback method.", ""))));
            }
        } else if (obj instanceof C1022Q) {
            eVar.getClass();
            if (!((C1032c) eVar.f9n).d((C1022Q) obj)) {
                l("WebChromeClient", obj, B3.d.a(i4.a.p(new C1030a("new-instance-error", "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method.", ""))));
            }
        } else if (obj instanceof C1047r) {
            eVar.getClass();
            C1047r c1047r = (C1047r) obj;
            C1035f c1035f10 = new C1035f(obj, 18);
            C1032c c1032c10 = (C1032c) eVar.f9n;
            if (!c1032c10.d(c1047r)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance", eVar.e(), (C0200z) null).D(AbstractC0149a.y(Long.valueOf(c1032c10.b(c1047r))), new C1051v(c1035f10, 6));
            }
        } else if (obj instanceof WebStorage) {
            eVar.getClass();
            WebStorage webStorage = (WebStorage) obj;
            C1035f c1035f11 = new C1035f(obj, 19);
            C1032c c1032c11 = (C1032c) eVar.f9n;
            if (!c1032c11.d(webStorage)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance", eVar.e(), (C0200z) null).D(AbstractC0149a.y(Long.valueOf(c1032c11.b(webStorage))), new C1051v(c1035f11, 22));
            }
        } else if (obj instanceof WebChromeClient.FileChooserParams) {
            eVar.getClass();
            WebChromeClient.FileChooserParams fileChooserParams = (WebChromeClient.FileChooserParams) obj;
            C1035f c1035f12 = new C1035f(obj, 20);
            C1032c c1032c12 = (C1032c) eVar.f9n;
            if (!c1032c12.d(fileChooserParams)) {
                long jB2 = c1032c12.b(fileChooserParams);
                boolean zIsCaptureEnabled = fileChooserParams.isCaptureEnabled();
                List listAsList = Arrays.asList(fileChooserParams.getAcceptTypes());
                int mode = fileChooserParams.getMode();
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance", eVar.e(), (C0200z) null).D(C3.g.Q(Long.valueOf(jB2), Boolean.valueOf(zIsCaptureEnabled), listAsList, mode != 0 ? mode != 1 ? mode != 3 ? EnumC1046q.f11093q : EnumC1046q.f11092p : EnumC1046q.f11091o : EnumC1046q.f11090n, fileChooserParams.getFilenameHint()), new C1051v(c1035f12, 5));
            }
        } else if (obj instanceof PermissionRequest) {
            eVar.getClass();
            PermissionRequest permissionRequest = (PermissionRequest) obj;
            C1035f c1035f13 = new C1035f(obj, 21);
            C1032c c1032c13 = (C1032c) eVar.f9n;
            if (!c1032c13.d(permissionRequest)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance", eVar.e(), (C0200z) null).D(C3.g.Q(Long.valueOf(c1032c13.b(permissionRequest)), Arrays.asList(permissionRequest.getResources())), new C1051v(c1035f13, 10));
            }
        } else if (obj instanceof WebChromeClient.CustomViewCallback) {
            eVar.getClass();
            WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) obj;
            C1035f c1035f14 = new C1035f(obj, 22);
            C1032c c1032c14 = (C1032c) eVar.f9n;
            if (!c1032c14.d(customViewCallback)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance", eVar.e(), (C0200z) null).D(AbstractC0149a.y(Long.valueOf(c1032c14.b(customViewCallback))), new C1051v(c1035f14, 3));
            }
        } else if (obj instanceof View) {
            eVar.getClass();
            View view = (View) obj;
            C1035f c1035f15 = new C1035f(obj, 23);
            C1032c c1032c15 = (C1032c) eVar.f9n;
            if (!c1032c15.d(view)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance", eVar.e(), (C0200z) null).D(AbstractC0149a.y(Long.valueOf(c1032c15.b(view))), new C1051v(c1035f15, 17));
            }
        } else if (obj instanceof GeolocationPermissions.Callback) {
            eVar.getClass();
            GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj;
            C1035f c1035f16 = new C1035f(obj, 24);
            C1032c c1032c16 = (C1032c) eVar.f9n;
            if (!c1032c16.d(callback)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance", eVar.e(), (C0200z) null).D(AbstractC0149a.y(Long.valueOf(c1032c16.b(callback))), new C1051v(c1035f16, 7));
            }
        } else if (obj instanceof HttpAuthHandler) {
            eVar.getClass();
            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj;
            C1035f c1035f17 = new C1035f(obj, 1);
            C1032c c1032c17 = (C1032c) eVar.f9n;
            if (!c1032c17.d(httpAuthHandler)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance", eVar.e(), (C0200z) null).D(AbstractC0149a.y(Long.valueOf(c1032c17.b(httpAuthHandler))), new C1051v(c1035f17, 8));
            }
        } else if (obj instanceof Message) {
            eVar.getClass();
            Message message = (Message) obj;
            C1035f c1035f18 = new C1035f(obj, 2);
            C1032c c1032c18 = (C1032c) eVar.f9n;
            if (!c1032c18.d(message)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance", eVar.e(), (C0200z) null).D(AbstractC0149a.y(Long.valueOf(c1032c18.b(message))), new I2.g(c1035f18, 28));
            }
        } else if (obj instanceof ClientCertRequest) {
            eVar.getClass();
            ClientCertRequest clientCertRequest = (ClientCertRequest) obj;
            C1035f c1035f19 = new C1035f(obj, 3);
            C1032c c1032c19 = (C1032c) eVar.f9n;
            if (!c1032c19.d(clientCertRequest)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance", eVar.e(), (C0200z) null).D(AbstractC0149a.y(Long.valueOf(c1032c19.b(clientCertRequest))), new C1051v(c1035f19, 0));
            }
        } else if (obj instanceof PrivateKey) {
            eVar.getClass();
            PrivateKey privateKey = (PrivateKey) obj;
            C1035f c1035f20 = new C1035f(obj, 4);
            C1032c c1032c20 = (C1032c) eVar.f9n;
            if (!c1032c20.d(privateKey)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance", eVar.e(), (C0200z) null).D(AbstractC0149a.y(Long.valueOf(c1032c20.b(privateKey))), new C1051v(c1035f20, 11));
            }
        } else if (obj instanceof X509Certificate) {
            eVar.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            C1035f c1035f21 = new C1035f(obj, 5);
            C1032c c1032c21 = (C1032c) eVar.f9n;
            if (!c1032c21.d(x509Certificate)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance", eVar.e(), (C0200z) null).D(AbstractC0149a.y(Long.valueOf(c1032c21.b(x509Certificate))), new C1051v(c1035f21, 28));
            }
        } else if (obj instanceof SslErrorHandler) {
            eVar.getClass();
            SslErrorHandler sslErrorHandler = (SslErrorHandler) obj;
            C1035f c1035f22 = new C1035f(obj, 6);
            C1032c c1032c22 = (C1032c) eVar.f9n;
            if (!c1032c22.d(sslErrorHandler)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance", eVar.e(), (C0200z) null).D(AbstractC0149a.y(Long.valueOf(c1032c22.b(sslErrorHandler))), new C1051v(c1035f22, 16));
            }
        } else if (obj instanceof SslError) {
            eVar.getClass();
            SslError sslError = (SslError) obj;
            C1035f c1035f23 = new C1035f(obj, 7);
            C1032c c1032c23 = (C1032c) eVar.f9n;
            if (!c1032c23.d(sslError)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance", eVar.e(), (C0200z) null).D(C3.g.Q(Long.valueOf(c1032c23.b(sslError)), sslError.getCertificate(), sslError.getUrl()), new C1051v(c1035f23, 14));
            }
        } else if (obj instanceof SslCertificate.DName) {
            eVar.getClass();
            SslCertificate.DName dName = (SslCertificate.DName) obj;
            C1035f c1035f24 = new C1035f(obj, 8);
            C1032c c1032c24 = (C1032c) eVar.f9n;
            if (!c1032c24.d(dName)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance", eVar.e(), (C0200z) null).D(AbstractC0149a.y(Long.valueOf(c1032c24.b(dName))), new C1051v(c1035f24, 13));
            }
        } else if (obj instanceof SslCertificate) {
            eVar.getClass();
            SslCertificate sslCertificate = (SslCertificate) obj;
            C1035f c1035f25 = new C1035f(obj, 9);
            C1032c c1032c25 = (C1032c) eVar.f9n;
            if (!c1032c25.d(sslCertificate)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance", eVar.e(), (C0200z) null).D(AbstractC0149a.y(Long.valueOf(c1032c25.b(sslCertificate))), new C1051v(c1035f25, 12));
            }
        } else if (obj instanceof Certificate) {
            eVar.getClass();
            Certificate certificate = (Certificate) obj;
            C1035f c1035f26 = new C1035f(obj, 10);
            C1032c c1032c26 = (C1032c) eVar.f9n;
            if (!c1032c26.d(certificate)) {
                new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance", eVar.e(), (C0200z) null).D(AbstractC0149a.y(Long.valueOf(c1032c26.b(certificate))), new I2.g(c1035f26, 29));
            }
        }
        if (!((C1032c) eVar.f9n).d(obj)) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass().getName() + "'");
        }
        vVar.write(128);
        C1032c c1032c27 = (C1032c) eVar.f9n;
        c1032c27.f();
        Long l3 = (Long) c1032c27.f11050b.get(new C1031b(obj));
        if (l3 != null) {
            c1032c27.f11052d.put(l3, obj);
        }
        k(vVar, l3);
    }
}
