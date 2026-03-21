package y3;

import android.webkit.JavascriptInterface;

/* JADX INFO: renamed from: y3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1048s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1039j f11099b;

    public C1048s(String str, C1039j c1039j) {
        this.f11098a = str;
        this.f11099b = c1039j;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        this.f11099b.f11068a.l(new D0.y(this, 26, str));
    }
}
