package q3;

import P2.c;
import Z1.l;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import j3.C0524a;
import j3.b;
import java.util.HashMap;
import java.util.HashSet;
import k3.InterfaceC0541a;
import k3.InterfaceC0542b;
import n3.InterfaceC0706p;
import n3.InterfaceC0709s;
import y2.n;

/* JADX INFO: renamed from: q3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0745a implements b, InterfaceC0541a, InterfaceC0709s {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PackageManager f9374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InterfaceC0542b f9375m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HashMap f9376n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashMap f9377o = new HashMap();

    public C0745a(l lVar) {
        this.f9374l = (PackageManager) lVar.f3020l;
        lVar.f3021m = this;
    }

    public final void a(String str, String str2, boolean z4, c cVar) {
        if (this.f9375m == null) {
            cVar.error("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap map = this.f9376n;
        if (map == null) {
            cVar.error("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) map.get(str);
        if (resolveInfo == null) {
            cVar.error("error", "Text processing activity not found", null);
            return;
        }
        int iHashCode = cVar.hashCode();
        this.f9377o.put(Integer.valueOf(iHashCode), cVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z4);
        ((Activity) ((n) this.f9375m).f10954a).startActivityForResult(intent, iHashCode);
    }

    public final HashMap b() {
        HashMap map = this.f9376n;
        PackageManager packageManager = this.f9374l;
        if (map == null) {
            this.f9376n = new HashMap();
            int i = Build.VERSION.SDK_INT;
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
            for (ResolveInfo resolveInfo : i >= 33 ? packageManager.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(type, 0)) {
                String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.f9376n.put(str, resolveInfo);
            }
        }
        HashMap map2 = new HashMap();
        for (String str2 : this.f9376n.keySet()) {
            map2.put(str2, ((ResolveInfo) this.f9376n.get(str2)).loadLabel(packageManager).toString());
        }
        return map2;
    }

    @Override // n3.InterfaceC0709s
    public final boolean onActivityResult(int i, int i5, Intent intent) {
        HashMap map = this.f9377o;
        if (!map.containsKey(Integer.valueOf(i))) {
            return false;
        }
        ((InterfaceC0706p) map.remove(Integer.valueOf(i))).success(i5 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // k3.InterfaceC0541a
    public final void onAttachedToActivity(InterfaceC0542b interfaceC0542b) {
        this.f9375m = interfaceC0542b;
        ((n) interfaceC0542b).a(this);
    }

    @Override // k3.InterfaceC0541a
    public final void onDetachedFromActivity() {
        ((HashSet) ((n) this.f9375m).f10956c).remove(this);
        this.f9375m = null;
    }

    @Override // k3.InterfaceC0541a
    public final void onDetachedFromActivityForConfigChanges() {
        ((HashSet) ((n) this.f9375m).f10956c).remove(this);
        this.f9375m = null;
    }

    @Override // k3.InterfaceC0541a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0542b interfaceC0542b) {
        this.f9375m = interfaceC0542b;
        ((n) interfaceC0542b).a(this);
    }

    @Override // j3.b
    public final void onAttachedToEngine(C0524a c0524a) {
    }

    @Override // j3.b
    public final void onDetachedFromEngine(C0524a c0524a) {
    }
}
