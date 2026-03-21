package androidx.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0284a f4638m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f4639n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Bundle f4640o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f4641p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ y f4642q;

    public /* synthetic */ x(y yVar, C0284a c0284a, String str, Bundle bundle, c.d dVar, int i) {
        this.f4637l = i;
        this.f4642q = yVar;
        this.f4638m = c0284a;
        this.f4639n = str;
        this.f4640o = bundle;
        this.f4641p = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4637l) {
            case 0:
                IBinder binder = ((Messenger) this.f4638m.f4576a).getBinder();
                y yVar = this.f4642q;
                k kVar = (k) yVar.f4643a.mConnections.getOrDefault(binder, null);
                String str = this.f4639n;
                if (kVar != null) {
                    yVar.f4643a.performSearch(str, this.f4640o, kVar, (c.d) this.f4641p);
                } else {
                    Log.w("MBServiceCompat", "search for callback that isn't registered query=" + str);
                }
                break;
            case 1:
                IBinder binder2 = ((Messenger) this.f4638m.f4576a).getBinder();
                y yVar2 = this.f4642q;
                k kVar2 = (k) yVar2.f4643a.mConnections.getOrDefault(binder2, null);
                Bundle bundle = this.f4640o;
                String str2 = this.f4639n;
                if (kVar2 != null) {
                    yVar2.f4643a.performCustomAction(str2, bundle, kVar2, (c.d) this.f4641p);
                } else {
                    Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + str2 + ", extras=" + bundle);
                }
                break;
            default:
                IBinder binder3 = ((Messenger) this.f4638m.f4576a).getBinder();
                y yVar3 = this.f4642q;
                k kVar3 = (k) yVar3.f4643a.mConnections.getOrDefault(binder3, null);
                String str3 = this.f4639n;
                if (kVar3 != null) {
                    yVar3.f4643a.addSubscription(str3, kVar3, (IBinder) this.f4641p, this.f4640o);
                } else {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + str3);
                }
                break;
        }
    }

    public x(y yVar, C0284a c0284a, String str, IBinder iBinder, Bundle bundle) {
        this.f4637l = 2;
        this.f4642q = yVar;
        this.f4638m = c0284a;
        this.f4639n = str;
        this.f4641p = iBinder;
        this.f4640o = bundle;
    }
}
