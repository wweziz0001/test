package X1;

import Q1.q;
import a2.k;
import a2.l;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2622a;

    static {
        String strF = q.f("NetworkStateTracker");
        N3.h.d(strF, "tagWithPrefix(\"NetworkStateTracker\")");
        f2622a = strF;
    }

    public static final V1.d a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilitiesA;
        N3.h.e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z4 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilitiesA = k.a(connectivityManager, l.a(connectivityManager));
        } catch (SecurityException e5) {
            q.d().c(f2622a, "Unable to validate active network", e5);
        }
        boolean zB = networkCapabilitiesA != null ? k.b(networkCapabilitiesA, 16) : false;
        return new V1.d(z4, zB, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
