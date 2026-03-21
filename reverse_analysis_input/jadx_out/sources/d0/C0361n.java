package d0;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: renamed from: d0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0361n extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0362o f5304a;

    public C0361n(C0362o c0362o) {
        this.f5304a = c0362o;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        boolean z4 = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        C0362o.a(z4 ? 10 : 5, this.f5304a);
    }
}
