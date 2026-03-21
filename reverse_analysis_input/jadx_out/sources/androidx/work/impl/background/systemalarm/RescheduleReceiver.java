package androidx.work.impl.background.systemalarm;

import Q1.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4800a = q.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        q.d().a(f4800a, "Received intent " + intent);
        try {
            R1.q qVarE0 = R1.q.E0(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (R1.q.f1909o) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = qVarE0.f1917k;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    qVarE0.f1917k = pendingResultGoAsync;
                    if (qVarE0.f1916j) {
                        pendingResultGoAsync.finish();
                        qVarE0.f1917k = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e5) {
            q.d().c(f4800a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e5);
        }
    }
}
