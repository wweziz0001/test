package T1;

import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import e.C0385g;
import e.InterfaceC0380b;
import f.C0402a;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f2173n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f2174o;

    public /* synthetic */ i(Object obj, int i, Object obj2, int i5) {
        this.f2171l = i5;
        this.f2174o = obj;
        this.f2172m = i;
        this.f2173n = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0380b interfaceC0380b;
        switch (this.f2171l) {
            case 0:
                ((j) this.f2173n).a((Intent) this.f2174o, this.f2172m);
                break;
            case 1:
                ((SystemForegroundService) this.f2174o).f4814p.notify(this.f2172m, (Notification) this.f2173n);
                break;
            case 2:
                Object obj = ((C0402a) this.f2173n).f5643a;
                androidx.activity.f fVar = (androidx.activity.f) this.f2174o;
                String str = (String) fVar.f5474a.get(Integer.valueOf(this.f2172m));
                if (str != null) {
                    C0385g c0385g = (C0385g) fVar.f5478e.get(str);
                    if (c0385g == null || (interfaceC0380b = c0385g.f5470a) == null) {
                        fVar.f5480g.remove(str);
                        fVar.f5479f.put(str, obj);
                    } else if (fVar.f5477d.remove(str)) {
                        interfaceC0380b.a(obj);
                    }
                    break;
                }
                break;
            case 3:
                ((androidx.activity.f) this.f2174o).a(this.f2172m, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f2173n));
                break;
            default:
                ((TextView) this.f2173n).setTypeface((Typeface) this.f2174o, this.f2172m);
                break;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, int i, int i5) {
        this.f2171l = i5;
        this.f2173n = obj;
        this.f2174o = obj2;
        this.f2172m = i;
    }
}
