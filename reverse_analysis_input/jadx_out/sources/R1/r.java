package R1;

import Q1.C;
import Q1.C0118a;
import Q1.x;
import Q1.z;
import a0.C0200z;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import m.B0;
import n3.InterfaceC0696f;
import y3.C1013H;
import y3.C1026V;
import y3.C1032c;
import y3.C1039j;
import y3.C1044o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1919l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f1920m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1921n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1922o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1923p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f1924q;

    public /* synthetic */ r(q qVar, String str, Z1.c cVar, t tVar, z zVar) {
        this.f1921n = qVar;
        this.f1920m = str;
        this.f1922o = cVar;
        this.f1923p = tVar;
        this.f1924q = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1919l) {
            case 0:
                q qVar = (q) this.f1921n;
                String str = this.f1920m;
                Z1.c cVar = (Z1.c) this.f1922o;
                t tVar = (t) this.f1923p;
                z zVar = (z) this.f1924q;
                WorkDatabase workDatabase = qVar.f1912e;
                Z1.q qVarT = workDatabase.t();
                ArrayList arrayListN = qVarT.n(str);
                if (arrayListN.size() > 1) {
                    cVar.i(new Q1.u(new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.")));
                } else {
                    Z1.n nVar = (Z1.n) (arrayListN.isEmpty() ? null : arrayListN.get(0));
                    if (nVar == null) {
                        tVar.d();
                    } else {
                        String str2 = nVar.f3027a;
                        Z1.p pVarM = qVarT.m(str2);
                        if (pVarM == null) {
                            cVar.i(new Q1.u(new IllegalStateException("WorkSpec with " + str2 + ", that matches a name \"" + str + "\", wasn't found")));
                        } else if (!pVarM.d()) {
                            cVar.i(new Q1.u(new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.")));
                        } else if (nVar.f3028b == 6) {
                            qVarT.c(str2);
                            tVar.d();
                        } else {
                            Z1.p pVarB = Z1.p.b(zVar.f1792b, nVar.f3027a, 0, null, null, 0, 0L, 0, 0, 0L, 0, 8388606);
                            try {
                                f fVar = qVar.f1915h;
                                N3.h.d(fVar, "processor");
                                C0118a c0118a = qVar.f1911d;
                                N3.h.d(c0118a, "configuration");
                                List list = qVar.f1914g;
                                N3.h.d(list, "schedulers");
                                C.A0(fVar, workDatabase, c0118a, list, pVarB, zVar.f1793c);
                                cVar.i(x.f1841d);
                            } catch (Throwable th) {
                                cVar.i(new Q1.u(th));
                                return;
                            }
                        }
                    }
                }
                break;
            case 1:
                C1044o c1044o = new C1044o(2);
                C1026V c1026v = (C1026V) this.f1921n;
                C1039j c1039j = c1026v.f11030a;
                c1039j.getClass();
                WebView webView = (WebView) this.f1922o;
                N3.h.e(webView, "viewArg");
                String str3 = this.f1920m;
                N3.h.e(str3, "realmArg");
                String str4 = (String) this.f1924q;
                N3.h.e(str4, "argsArg");
                A.e eVar = c1039j.f11068a;
                eVar.getClass();
                if (!((C1032c) eVar.f9n).d(c1026v)) {
                    B0.l("missing-instance-error", "Callback to `WebViewClient.onReceivedLoginRequest` failed because native instance was not in the instance manager.", "");
                } else {
                    new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest", eVar.e(), (C0200z) null).D(C3.g.Q(c1026v, webView, str3, (String) this.f1923p, str4), new C1013H(c1044o, 5));
                }
                break;
            default:
                C1044o c1044o2 = new C1044o(2);
                C1026V c1026v2 = (C1026V) this.f1921n;
                C1039j c1039j2 = c1026v2.f11030a;
                c1039j2.getClass();
                WebView webView2 = (WebView) this.f1922o;
                N3.h.e(webView2, "webViewArg");
                HttpAuthHandler httpAuthHandler = (HttpAuthHandler) this.f1923p;
                N3.h.e(httpAuthHandler, "handlerArg");
                String str5 = this.f1920m;
                N3.h.e(str5, "hostArg");
                String str6 = (String) this.f1924q;
                N3.h.e(str6, "realmArg");
                A.e eVar2 = c1039j2.f11068a;
                eVar2.getClass();
                if (!((C1032c) eVar2.f9n).d(c1026v2)) {
                    B0.l("missing-instance-error", "Callback to `WebViewClient.onReceivedHttpAuthRequest` failed because native instance was not in the instance manager.", "");
                } else {
                    new Z1.i((InterfaceC0696f) eVar2.f8m, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest", eVar2.e(), (C0200z) null).D(C3.g.Q(c1026v2, webView2, httpAuthHandler, str5, str6), new C1013H(c1044o2, 12));
                }
                break;
        }
    }

    public /* synthetic */ r(C1026V c1026v, WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f1921n = c1026v;
        this.f1922o = webView;
        this.f1923p = httpAuthHandler;
        this.f1920m = str;
        this.f1924q = str2;
    }

    public /* synthetic */ r(C1026V c1026v, WebView webView, String str, String str2, String str3) {
        this.f1921n = c1026v;
        this.f1922o = webView;
        this.f1920m = str;
        this.f1923p = str2;
        this.f1924q = str3;
    }
}
