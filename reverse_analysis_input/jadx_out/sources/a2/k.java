package a2;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager, Network network) {
        N3.h.e(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean b(NetworkCapabilities networkCapabilities, int i) {
        N3.h.e(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i);
    }

    public static final void c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        N3.h.e(connectivityManager, "<this>");
        N3.h.e(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
