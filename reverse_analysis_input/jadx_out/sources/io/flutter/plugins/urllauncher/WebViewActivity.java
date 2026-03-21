package io.flutter.plugins.urllauncher;

import X1.d;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import i4.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import u3.C0901g;
import u3.C0903i;

/* JADX INFO: loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f6838p = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WebView f6841n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f6839l = new d(this, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0901g f6840m = new C0901g();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IntentFilter f6842o = new IntentFilter("close action");

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Map<String, String> mapEmptyMap;
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f6841n = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        Bundle bundleExtra = intent.getBundleExtra("com.android.browser.headers");
        if (bundleExtra == null) {
            mapEmptyMap = Collections.emptyMap();
        } else {
            HashMap map = new HashMap();
            for (String str : bundleExtra.keySet()) {
                map.put(str, bundleExtra.getString(str));
            }
            mapEmptyMap = map;
        }
        this.f6841n.loadUrl(stringExtra, mapEmptyMap);
        this.f6841n.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f6841n.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f6841n.setWebViewClient(this.f6840m);
        this.f6841n.getSettings().setSupportMultipleWindows(true);
        this.f6841n.setWebChromeClient(new C0903i(this));
        a.P(this, this.f6839l, this.f6842o);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f6839l);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f6841n.canGoBack()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f6841n.goBack();
        return true;
    }
}
