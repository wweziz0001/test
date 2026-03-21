package T1;

import Q1.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2147a = q.f("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        q.d().a(f2147a, "onReceive : " + intent);
        String str = c.f2141q;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
