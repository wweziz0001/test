package e2;

import P2.c;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import j3.C0524a;
import j3.b;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import k3.InterfaceC0541a;
import k3.InterfaceC0542b;
import m.B0;
import n3.C0707q;
import n3.InterfaceC0705o;
import n3.InterfaceC0709s;
import n3.u;
import org.json.JSONException;
import org.json.JSONObject;
import u.h;
import y2.n;

/* JADX INFO: renamed from: e2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0391a implements InterfaceC0705o, b, InterfaceC0541a, u, InterfaceC0709s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f5596l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Activity f5597m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0707q f5598n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f5599o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f5600p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f5601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5602r = false;

    public final boolean a(String str) {
        return i4.a.m(this.f5597m, str) == 0;
    }

    public final boolean b() {
        if (this.f5600p == null) {
            c("the file path cannot be null", -4);
            return false;
        }
        if (new File(this.f5600p).exists()) {
            return true;
        }
        c("the " + this.f5600p + " file does not exists", -2);
        return false;
    }

    public final void c(String str, int i) {
        if (this.f5599o == null || this.f5602r) {
            return;
        }
        HashMap map = new HashMap();
        map.put("type", Integer.valueOf(i));
        map.put("message", str);
        c cVar = this.f5599o;
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        cVar.success(jSONObject.toString());
        this.f5602r = true;
    }

    public final void d() {
        int i;
        String str;
        if (b()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            if ("application/vnd.android.package-archive".equals(this.f5601q)) {
                intent.setFlags(268435456);
            } else {
                intent.setFlags(536870912);
            }
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addFlags(1);
            intent.setDataAndType(h.d(this.f5596l, B0.h(this.f5596l.getPackageName(), ".fileProvider.com.crazecoder.openfile"), new File(this.f5600p)), this.f5601q);
            try {
                this.f5597m.startActivity(intent);
                i = 0;
                str = "done";
            } catch (ActivityNotFoundException unused) {
                i = -1;
                str = "No APP found to open this file。";
            } catch (Exception unused2) {
                i = -4;
                str = "File opened incorrectly。";
            }
            c(str, i);
        }
    }

    @Override // n3.InterfaceC0709s
    public final boolean onActivityResult(int i, int i5, Intent intent) {
        if (i != 18) {
            return false;
        }
        d();
        return false;
    }

    @Override // k3.InterfaceC0541a
    public final void onAttachedToActivity(InterfaceC0542b interfaceC0542b) {
        n nVar = (n) interfaceC0542b;
        this.f5597m = (Activity) nVar.f10954a;
        ((HashSet) nVar.f10955b).add(this);
        nVar.a(this);
    }

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
        this.f5596l = c0524a.f7453a;
        C0707q c0707q = new C0707q(c0524a.f7455c, "open_file");
        this.f5598n = c0707q;
        c0707q.b(this);
    }

    @Override // k3.InterfaceC0541a
    public final void onDetachedFromActivity() {
        C0707q c0707q = this.f5598n;
        if (c0707q != null) {
            c0707q.b(null);
            this.f5598n = null;
        }
        this.f5597m = null;
    }

    @Override // k3.InterfaceC0541a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
        C0707q c0707q = this.f5598n;
        if (c0707q != null) {
            c0707q.b(null);
            this.f5598n = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:340:0x04e7, code lost:
    
        if (r5.startsWith(r6) == false) goto L346;
     */
    @Override // n3.InterfaceC0705o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(n3.C0704n r28, n3.InterfaceC0706p r29) {
        /*
            Method dump skipped, instruction units count: 1934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.C0391a.onMethodCall(n3.n, n3.p):void");
    }

    @Override // k3.InterfaceC0541a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0542b interfaceC0542b) {
        onAttachedToActivity(interfaceC0542b);
    }

    @Override // n3.u
    public final boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 33432) {
            return false;
        }
        for (String str : strArr) {
            if (!a(str)) {
                c("Permission denied: ".concat(str), -3);
                return false;
            }
        }
        d();
        return true;
    }
}
