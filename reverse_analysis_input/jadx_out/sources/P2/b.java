package P2;

import A.e;
import C3.g;
import D0.y;
import F0.C0057d;
import Q1.C0118a;
import R1.h;
import Z1.i;
import Z1.j;
import a0.C0200z;
import android.media.AudioTrack;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Message;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.lifecycle.E;
import androidx.work.impl.WorkDatabase;
import j0.v;
import java.util.Iterator;
import java.util.List;
import m.B0;
import n3.InterfaceC0696f;
import y3.C1013H;
import y3.C1026V;
import y3.C1032c;
import y3.C1039j;
import y3.C1044o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1688m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1689n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1690o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1691p;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1687l = i;
        this.f1688m = obj;
        this.f1689n = obj2;
        this.f1690o = obj3;
        this.f1691p = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1687l) {
            case 0:
                ((c) ((c) this.f1688m).f1693b).error((String) this.f1689n, (String) this.f1690o, this.f1691p);
                return;
            case 1:
                List list = (List) this.f1688m;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((h) it.next()).a(((j) this.f1689n).f3016a);
                }
                R1.j.b((C0118a) this.f1690o, (WorkDatabase) this.f1691p, list);
                return;
            case 2:
                AudioTrack audioTrack = (AudioTrack) this.f1688m;
                E e5 = (E) this.f1689n;
                Handler handler = (Handler) this.f1690o;
                C0057d c0057d = (C0057d) this.f1691p;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (e5 != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new y(e5, 17, c0057d));
                    }
                    synchronized (v.f7349j0) {
                        try {
                            int i = v.f7351l0 - 1;
                            v.f7351l0 = i;
                            if (i == 0) {
                                v.f7350k0.shutdown();
                                v.f7350k0 = null;
                            }
                        } finally {
                        }
                        break;
                    }
                    return;
                } catch (Throwable th) {
                    if (e5 != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new y(e5, 17, c0057d));
                    }
                    synchronized (v.f7349j0) {
                        try {
                            int i5 = v.f7351l0 - 1;
                            v.f7351l0 = i5;
                            if (i5 == 0) {
                                v.f7350k0.shutdown();
                                v.f7350k0 = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 3:
                C1044o c1044o = new C1044o(2);
                C1026V c1026v = (C1026V) this.f1688m;
                C1039j c1039j = c1026v.f11030a;
                c1039j.getClass();
                WebView webView = (WebView) this.f1689n;
                N3.h.e(webView, "viewArg");
                Message message = (Message) this.f1690o;
                N3.h.e(message, "dontResendArg");
                Message message2 = (Message) this.f1691p;
                N3.h.e(message2, "resendArg");
                e eVar = c1039j.f11068a;
                eVar.getClass();
                if (!((C1032c) eVar.f9n).d(c1026v)) {
                    B0.l("missing-instance-error", "Callback to `WebViewClient.onFormResubmission` failed because native instance was not in the instance manager.", "");
                    return;
                } else {
                    new i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission", eVar.e(), (C0200z) null).D(g.Q(c1026v, webView, message, message2), new C1013H(c1044o, 13));
                    return;
                }
            case 4:
                C1044o c1044o2 = new C1044o(2);
                C1026V c1026v2 = (C1026V) this.f1688m;
                C1039j c1039j2 = c1026v2.f11030a;
                c1039j2.getClass();
                WebView webView2 = (WebView) this.f1689n;
                N3.h.e(webView2, "viewArg");
                SslErrorHandler sslErrorHandler = (SslErrorHandler) this.f1690o;
                N3.h.e(sslErrorHandler, "handlerArg");
                SslError sslError = (SslError) this.f1691p;
                N3.h.e(sslError, "errorArg");
                e eVar2 = c1039j2.f11068a;
                eVar2.getClass();
                if (!((C1032c) eVar2.f9n).d(c1026v2)) {
                    B0.l("missing-instance-error", "Callback to `WebViewClient.onReceivedSslError` failed because native instance was not in the instance manager.", "");
                    return;
                } else {
                    new i((InterfaceC0696f) eVar2.f8m, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError", eVar2.e(), (C0200z) null).D(g.Q(c1026v2, webView2, sslErrorHandler, sslError), new C1013H(c1044o2, 14));
                    return;
                }
            case 5:
                C1044o c1044o3 = new C1044o(2);
                C1026V c1026v3 = (C1026V) this.f1688m;
                C1039j c1039j3 = c1026v3.f11030a;
                c1039j3.getClass();
                WebView webView3 = (WebView) this.f1689n;
                N3.h.e(webView3, "webViewArg");
                WebResourceRequest webResourceRequest = (WebResourceRequest) this.f1690o;
                N3.h.e(webResourceRequest, "requestArg");
                WebResourceError webResourceError = (WebResourceError) this.f1691p;
                N3.h.e(webResourceError, "errorArg");
                e eVar3 = c1039j3.f11068a;
                eVar3.getClass();
                if (!((C1032c) eVar3.f9n).d(c1026v3)) {
                    B0.l("missing-instance-error", "Callback to `WebViewClient.onReceivedRequestError` failed because native instance was not in the instance manager.", "");
                    return;
                } else {
                    new i((InterfaceC0696f) eVar3.f8m, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError", eVar3.e(), (C0200z) null).D(g.Q(c1026v3, webView3, webResourceRequest, webResourceError), new C1013H(c1044o3, 10));
                    return;
                }
            default:
                C1044o c1044o4 = new C1044o(2);
                C1026V c1026v4 = (C1026V) this.f1688m;
                C1039j c1039j4 = c1026v4.f11030a;
                c1039j4.getClass();
                WebView webView4 = (WebView) this.f1689n;
                N3.h.e(webView4, "webViewArg");
                WebResourceRequest webResourceRequest2 = (WebResourceRequest) this.f1690o;
                N3.h.e(webResourceRequest2, "requestArg");
                WebResourceResponse webResourceResponse = (WebResourceResponse) this.f1691p;
                N3.h.e(webResourceResponse, "responseArg");
                e eVar4 = c1039j4.f11068a;
                eVar4.getClass();
                if (!((C1032c) eVar4.f9n).d(c1026v4)) {
                    B0.l("missing-instance-error", "Callback to `WebViewClient.onReceivedHttpError` failed because native instance was not in the instance manager.", "");
                    return;
                } else {
                    new i((InterfaceC0696f) eVar4.f8m, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError", eVar4.e(), (C0200z) null).D(g.Q(c1026v4, webView4, webResourceRequest2, webResourceResponse), new C1013H(c1044o4, 3));
                    return;
                }
        }
    }
}
