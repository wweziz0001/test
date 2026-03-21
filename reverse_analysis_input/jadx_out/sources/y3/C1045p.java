package y3;

import a0.C0200z;
import android.webkit.DownloadListener;
import m.B0;
import n3.InterfaceC0696f;

/* JADX INFO: renamed from: y3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1045p implements DownloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1039j f11088a;

    public C1045p(C1039j c1039j) {
        this.f11088a = c1039j;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(final String str, final String str2, final String str3, final String str4, final long j5) {
        this.f11088a.f11068a.l(new Runnable() { // from class: y3.n
            @Override // java.lang.Runnable
            public final void run() {
                C1044o c1044o = new C1044o(0);
                C1045p c1045p = this.f11081l;
                C1039j c1039j = c1045p.f11088a;
                String str5 = str;
                N3.h.e(str5, "urlArg");
                String str6 = str2;
                N3.h.e(str6, "userAgentArg");
                String str7 = str3;
                N3.h.e(str7, "contentDispositionArg");
                String str8 = str4;
                N3.h.e(str8, "mimetypeArg");
                A.e eVar = c1039j.f11068a;
                eVar.getClass();
                if (!((C1032c) eVar.f9n).d(c1045p)) {
                    B0.l("missing-instance-error", "Callback to `DownloadListener.onDownloadStart` failed because native instance was not in the instance manager.", "");
                } else {
                    new Z1.i((InterfaceC0696f) eVar.f8m, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart", eVar.e(), (C0200z) null).D(C3.g.Q(c1045p, str5, str6, str7, str8, Long.valueOf(j5)), new s2.l(c1044o, 15));
                }
            }
        });
    }
}
