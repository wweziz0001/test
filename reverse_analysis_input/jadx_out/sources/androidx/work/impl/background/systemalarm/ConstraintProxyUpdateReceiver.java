package androidx.work.impl.background.systemalarm;

import A.n;
import Q1.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import b3.AbstractC0307a;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4799a = q.f("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            q.d().a(f4799a, AbstractC0307a.j("Ignoring unknown action ", action));
            return;
        }
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        R1.q.E0(context).f1913f.h(new n(pendingResultGoAsync, context, intent));
    }
}
