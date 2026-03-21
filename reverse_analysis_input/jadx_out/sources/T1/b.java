package T1;

import Q1.q;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2140a = q.f("Alarms");

    public static void a(Context context, Z1.j jVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = c.f2141q;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        c.d(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        q.d().a(f2140a, "Cancelling existing alarm with (workSpecId, systemId) (" + jVar + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, Z1.j jVar, long j5) {
        Z1.i iVarP = workDatabase.p();
        Z1.g gVarN = iVarP.n(jVar);
        if (gVarN != null) {
            int i = gVarN.f3010c;
            a(context, jVar, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = c.f2141q;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            c.d(intent, jVar);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                a.a(alarmManager, 0, j5, service);
                return;
            }
            return;
        }
        final a2.j jVar2 = new a2.j(workDatabase, 0);
        Object objN = workDatabase.n(new Callable() { // from class: a2.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase2 = jVar2.f3551a;
                Long lR = workDatabase2.l().r("next_alarm_manager_id");
                int iLongValue = lR != null ? (int) lR.longValue() : 0;
                workDatabase2.l().s(new Z1.d("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            }
        });
        N3.h.d(objN, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        int iIntValue = ((Number) objN).intValue();
        iVarP.q(new Z1.g(jVar.f3017b, jVar.f3016a, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = c.f2141q;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        c.d(intent2, jVar);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            a.a(alarmManager2, 0, j5, service2);
        }
    }
}
