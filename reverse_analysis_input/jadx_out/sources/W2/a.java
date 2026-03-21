package W2;

import B0.d;
import D0.y;
import N3.h;
import Q1.q;
import X1.i;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2471b;

    public /* synthetic */ a(Object obj, int i) {
        this.f2470a = i;
        this.f2471b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f2470a) {
            case 0:
                b bVar = (b) this.f2471b;
                bVar.f2474n.post(new y(bVar, 9, d.j(((ConnectivityManager) bVar.f2472l.f190l).getNetworkCapabilities(network))));
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f2470a) {
            case 0:
                b bVar = (b) this.f2471b;
                bVar.f2472l.getClass();
                bVar.f2474n.post(new y(bVar, 9, d.j(networkCapabilities)));
                break;
            default:
                h.e(network, "network");
                h.e(networkCapabilities, "capabilities");
                q.d().a(i.f2622a, "Network capabilities changed: " + networkCapabilities);
                X1.h hVar = (X1.h) this.f2471b;
                hVar.b(i.a(hVar.f2620f));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f2470a) {
            case 0:
                b bVar = (b) this.f2471b;
                bVar.getClass();
                bVar.f2474n.postDelayed(new A3.c(bVar, 6), 500L);
                break;
            default:
                h.e(network, "network");
                q.d().a(i.f2622a, "Network connection lost");
                X1.h hVar = (X1.h) this.f2471b;
                hVar.b(i.a(hVar.f2620f));
                break;
        }
    }
}
