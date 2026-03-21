package W2;

import B0.d;
import D0.y;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import n3.C0698h;
import n3.InterfaceC0697g;
import n3.InterfaceC0699i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends BroadcastReceiver implements InterfaceC0699i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f2472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0698h f2473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f2474n = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f2475o;

    public b(Context context, d dVar) {
        this.f2472l = dVar;
    }

    @Override // n3.InterfaceC0699i
    public final void onCancel(Object obj) {
        a aVar = this.f2475o;
        if (aVar != null) {
            ((ConnectivityManager) this.f2472l.f190l).unregisterNetworkCallback(aVar);
            this.f2475o = null;
        }
    }

    @Override // n3.InterfaceC0699i
    public final void onListen(Object obj, InterfaceC0697g interfaceC0697g) {
        this.f2473m = (C0698h) interfaceC0697g;
        a aVar = new a(this, 0);
        this.f2475o = aVar;
        d dVar = this.f2472l;
        ((ConnectivityManager) dVar.f190l).registerDefaultNetworkCallback(aVar);
        ConnectivityManager connectivityManager = (ConnectivityManager) dVar.f190l;
        this.f2474n.post(new y(this, 9, d.j(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()))));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C0698h c0698h = this.f2473m;
        if (c0698h != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f2472l.f190l;
            c0698h.success(d.j(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
        }
    }
}
