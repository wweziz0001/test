package a2;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        N3.h.e(connectivityManager, "<this>");
        N3.h.e(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
