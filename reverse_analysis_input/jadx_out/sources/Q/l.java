package Q;

import a.AbstractC0149a;
import a0.C0167S;
import a0.C0200z;
import a0.InterfaceC0164O;
import android.view.ViewGroup;
import android.webkit.ClientCertRequest;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import androidx.fragment.app.C0239f;
import androidx.fragment.app.Y;
import h0.C0448G;
import h0.X;
import io.flutter.embedding.android.D;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import m.B0;
import m2.C0639F;
import m2.I;
import m2.b0;
import n3.InterfaceC0696f;
import t0.C0842F;
import t0.C0848e;
import t0.C0855l;
import t0.C0858o;
import t0.InterfaceC0847d;
import x0.H;
import y3.C1013H;
import y3.C1026V;
import y3.C1032c;
import y3.C1039j;
import y3.C1044o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1724l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1725m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1726n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1727o;

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i) {
        this.f1724l = i;
        this.f1725m = obj;
        this.f1726n = obj2;
        this.f1727o = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        switch (this.f1724l) {
            case 0:
                n nVar = (n) this.f1725m;
                i4.a aVar = (i4.a) this.f1726n;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1727o;
                nVar.getClass();
                try {
                    s sVarM = AbstractC0149a.m(nVar.f1730l);
                    if (sVarM == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    r rVar = (r) sVarM.f1750a;
                    synchronized (rVar.f1744o) {
                        rVar.f1746q = threadPoolExecutor;
                        break;
                    }
                    sVarM.f1750a.a(new m(aVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    aVar.I(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                R1.f fVar = (R1.f) this.f1725m;
                b2.k kVar = (b2.k) this.f1726n;
                R1.u uVar = (R1.u) this.f1727o;
                fVar.getClass();
                try {
                    zBooleanValue = ((Boolean) kVar.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                    zBooleanValue = true;
                }
                synchronized (fVar.f1886k) {
                    try {
                        Z1.j jVarZ = D1.b.z(uVar.f1941n);
                        String str = jVarZ.f3016a;
                        if (fVar.c(str) == uVar) {
                            fVar.b(str);
                        }
                        Q1.q.d().a(R1.f.f1876l, R1.f.class.getSimpleName() + " " + str + " executed; reschedule = " + zBooleanValue);
                        Iterator it = fVar.f1885j.iterator();
                        while (it.hasNext()) {
                            ((R1.c) it.next()).c(jVarZ, zBooleanValue);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 2:
                ViewGroup viewGroup = (ViewGroup) this.f1725m;
                N3.h.e(viewGroup, "$container");
                C0239f c0239f = (C0239f) this.f1727o;
                N3.h.e(c0239f, "this$0");
                viewGroup.endViewTransition((D) this.f1726n);
                ((Y) c0239f.f4378c.f1479a).c(c0239f);
                return;
            case 3:
                X x4 = (X) this.f1725m;
                x4.getClass();
                b0 b0VarG = ((C0639F) this.f1726n).g();
                i0.c cVar = x4.f6072c;
                InterfaceC0164O interfaceC0164O = cVar.f6368r;
                interfaceC0164O.getClass();
                y2.n nVar2 = cVar.f6365o;
                nVar2.getClass();
                nVar2.f10955b = I.p(b0VarG);
                if (!b0VarG.isEmpty()) {
                    nVar2.f10958e = (H) b0VarG.get(0);
                    H h2 = (H) this.f1727o;
                    h2.getClass();
                    nVar2.f10959f = h2;
                }
                if (((H) nVar2.f10957d) == null) {
                    nVar2.f10957d = y2.n.f(interfaceC0164O, (I) nVar2.f10955b, (H) nVar2.f10958e, (C0167S) nVar2.f10954a);
                }
                nVar2.k(((C0448G) interfaceC0164O).z());
                return;
            case 4:
                I2.g gVar = ((C0848e) this.f1725m).f9864n;
                String str2 = (String) this.f1726n;
                C0858o c0858o = (C0858o) gVar.f1034m;
                c0858o.f9934c = str2;
                InterfaceC0847d interfaceC0847d = (InterfaceC0847d) this.f1727o;
                C0842F c0842fX = interfaceC0847d.x();
                t0.q qVar = c0858o.f9935d;
                if (c0842fX != null) {
                    C0855l c0855l = qVar.f9952o;
                    int iO = interfaceC0847d.o();
                    c0855l.f9923t.f9985n.put(Integer.valueOf(iO), c0842fX);
                    qVar.f9948G = true;
                }
                qVar.z();
                return;
            case 5:
                C1044o c1044o = new C1044o(2);
                C1026V c1026v = (C1026V) this.f1725m;
                C1039j c1039j = c1026v.f11030a;
                c1039j.getClass();
                WebView webView = (WebView) this.f1726n;
                N3.h.e(webView, "viewArg");
                ClientCertRequest clientCertRequest = (ClientCertRequest) this.f1727o;
                N3.h.e(clientCertRequest, "requestArg");
                A.e eVar = c1039j.f11068a;
                eVar.getClass();
                if (!((C1032c) eVar.f9n).d(c1026v)) {
                    B0.l("missing-instance-error", "Callback to `WebViewClient.onReceivedClientCertRequest` failed because native instance was not in the instance manager.", "");
                    return;
                } else {
                    new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest", eVar.e(), (C0200z) null).D(C3.g.Q(c1026v, webView, clientCertRequest), new C1013H(c1044o, 7));
                    return;
                }
            default:
                C1044o c1044o2 = new C1044o(2);
                C1026V c1026v2 = (C1026V) this.f1725m;
                C1039j c1039j2 = c1026v2.f11030a;
                c1039j2.getClass();
                WebView webView2 = (WebView) this.f1726n;
                N3.h.e(webView2, "webViewArg");
                WebResourceRequest webResourceRequest = (WebResourceRequest) this.f1727o;
                N3.h.e(webResourceRequest, "requestArg");
                A.e eVar2 = c1039j2.f11068a;
                eVar2.getClass();
                if (!((C1032c) eVar2.f9n).d(c1026v2)) {
                    B0.l("missing-instance-error", "Callback to `WebViewClient.requestLoading` failed because native instance was not in the instance manager.", "");
                    return;
                } else {
                    new Z1.i((InterfaceC0696f) eVar2.f8m, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading", eVar2.e(), (C0200z) null).D(C3.g.Q(c1026v2, webView2, webResourceRequest), new C1013H(c1044o2, 8));
                    return;
                }
        }
    }
}
