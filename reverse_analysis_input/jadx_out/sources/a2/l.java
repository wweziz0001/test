package a2;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final Network a(ConnectivityManager connectivityManager) {
        N3.h.e(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
