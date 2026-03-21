package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import q.C0735e;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f4609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f4610n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f4611o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f4612p;

    public /* synthetic */ o(Object obj, Object obj2, String str, Object obj3, int i) {
        this.f4608l = i;
        this.f4612p = obj;
        this.f4610n = obj2;
        this.f4609m = str;
        this.f4611o = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4608l) {
            case 0:
                int i = 0;
                while (true) {
                    q qVar = (q) this.f4612p;
                    C0735e c0735e = qVar.f4618d.mConnections;
                    if (i < c0735e.f9237n) {
                        k kVar = (k) c0735e.i(i);
                        if (kVar.f4598d.equals((B) this.f4610n)) {
                            qVar.f(kVar, this.f4609m, (Bundle) this.f4611o);
                        }
                        i++;
                    }
                    break;
                }
                break;
            case 1:
                IBinder binder = ((Messenger) ((C0284a) this.f4610n).f4576a).getBinder();
                y yVar = (y) this.f4612p;
                k kVar2 = (k) yVar.f4643a.mConnections.getOrDefault(binder, null);
                String str = this.f4609m;
                if (kVar2 == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str);
                } else if (!yVar.f4643a.removeSubscription(str, kVar2, (IBinder) this.f4611o)) {
                    Log.w("MBServiceCompat", "removeSubscription called for " + str + " which is not subscribed");
                }
                break;
            default:
                IBinder binder2 = ((Messenger) ((C0284a) this.f4610n).f4576a).getBinder();
                y yVar2 = (y) this.f4612p;
                k kVar3 = (k) yVar2.f4643a.mConnections.getOrDefault(binder2, null);
                String str2 = this.f4609m;
                if (kVar3 != null) {
                    yVar2.f4643a.performLoadItem(str2, kVar3, (c.d) this.f4611o);
                } else {
                    Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + str2);
                }
                break;
        }
    }
}
